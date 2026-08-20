package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
    }
}

class Pair{
    Node node;
    int level;
    Pair(Node node ,int level){
        this.node = node;
        this.level = level;
    }
}

public class Implementation {
    public static void main(String[] args) {
        Node a = new Node(2);
        Node b = new Node(1);
        Node c = new Node(5);
        Node d = new Node(0);
        Node e = new Node(6);
        Node f = new Node(9);
        Node g = new Node(-1);
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;

//        levelOrder(a);
        levelOrderInLine(a);
    }

    private static void levelOrderInLine(Node root) {
        Queue<Pair> q = new LinkedList<>();
        int currLvl = 0;
        q.add(new Pair(root, 0));
        while (q.size()>0){
            Pair front = q.remove();
            Node node = front.node;
            int level = front.level;
            if(front.level!=currLvl){
                currLvl++;
                System.out.println();
            }
            System.out.print(front.node.val+" ");
            if (node.left!=null) q.add(new Pair(node.left, currLvl));
            if (node.right!=null) q.add(new Pair(node.right, currLvl));
        }
        System.out.println();
    }

    private static void levelOrder(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (q.size()>0){
            Node front = q.remove();
            System.out.print(front.val+" ");
            if(front.left!=null) q.add(front.left);
            if(front.right!=null) q.add(front.right);
        }
        System.out.println();
    }

    private static int size(Node root) {
        if (root==null) return 0;
        return (1 + size(root.left) + size(root.right));
    }

    private static int sum(Node root) {
        if (root==null) return 0;
        return (root.val + sum(root.left) + sum(root.right));
    }

    private static int prodNonZero(Node root) {
        if (root==null) return 1;
        if (root.val == 0)
            return prodNonZero(root.left) * prodNonZero(root.right);
        return (root.val * prodNonZero(root.left) * prodNonZero(root.right));
    }

    private static int product(Node root) {
        if (root==null) return 1;

        return (root.val * product(root.left) * product(root.right));
    }

    private static int max(Node root) {
        if (root==null) return Integer.MIN_VALUE;
        return Math.max(root.val , Math.max(max(root.left), max(root.right)));
    }

    private static int levels(Node root) {
        if (root==null) return 0;
        return 1 + Math.max(levels(root.left), levels(root.right));
    }

    private static int min(Node root) {
        if (root==null) return Integer.MAX_VALUE;
        return Math.min(root.val , Math.min(min(root.left), min(root.right)));
    }

    public static void preorder(Node root){ // Root Left Right
        if(root==null) return;
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(Node root){ // Left Root Right
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }
    public static void postorder(Node root){ // Left Right Root
        if(root==null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val+" ");
    }
}

//        System.out.print("Preorder : ");
//        preorder(a);
//        System.out.println();
//        System.out.print("Inorder : ");
//        inorder(a);
//        System.out.println();
//        System.out.print("Postorder : ");
//        postorder(a);
//        System.out.println();
//        System.out.println("Size : " + size(a));
//        System.out.println("Sum : " + sum(a));
//        System.out.println("Product of non-zero ib Binary Tree : " + prodNonZero(a));
//        System.out.println("Product : " + product(a));
//        System.out.println("Maximum : " + max(a));
//        System.out.println("Minimum : " + min(a));
//        System.out.println("Levels : " + levels(a));