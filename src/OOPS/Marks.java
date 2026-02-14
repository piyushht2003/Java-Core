package OOPS;

public class Marks {
    public static class StudentData{
        String name;
        int rno;
        int[] marks;
        StudentData(int s){
            marks = new int[s];
        }
        StudentData(int[] s){
            marks = s;
        }
    }
    public static void main(String[] args) {
        int[] arr = {44,23,55,77};
        StudentData s1 = new StudentData(arr); // -> we can send array to constructor -> passing 'arr' as an argument to 'int[] s' receiving 'arr' as a parameter
        System.out.println(s1.marks[1]);

        StudentData s2 = new StudentData(4); // -> we can also define array size in constructor '4'
        s2.marks[2] = 78;
        System.out.println(s2.marks[2]);
    }
}
