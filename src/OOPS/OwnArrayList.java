package OOPS;

class ArrayList{ // User defined data structure
    int[] arr;
    int idx = 0;
    int size = 0;

    ArrayList(int capacity){
        arr = new int[capacity];
    }

    void add(int ele){ // receives element from 'arr.add(10)'

        if(idx==arr.length){ // arr is full
            increaseCapacity();
        }
        arr[idx++] = ele;  // -> 0 - 10 -> 1 - 20 -> 2 - 30
        size++;
    }

    void increaseCapacity(){
            int[] arr2 = new int[arr.length*2];
            for (int i=0; i<arr.length; i++){ // copy-paste
                arr2[i] = arr[i];
            }
        arr = arr2;
    }

    int capacity(){
        return arr.length;
    }

    int get(int index){
        return arr[index];
    }

    void set(int index, int val){
        arr[index] = val;
    }

    void insert(int index, int ele) {
        if(index < 0 || index > size){
            System.out.println("Invalid Index");
            return;
        }

        if(idx == arr.length){
            increaseCapacity();
        }

        // shift elements right
        for(int i = size; i > index; i--){
            arr[i] = arr[i - 1];
        }

        arr[index] = ele;
        size++;
        idx++;
    }

    void remove(int index){
        if(index < 0 || index >= size){
            System.out.println("Invalid Index");
            return;
        }

        // shift elements left
        for(int i = index; i < size - 1; i++){
            arr[i] = arr[i + 1];
        }

        size--;
        idx--;
    }


    void display(){ // prints array
        for (int i=0; i<size; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
public class OwnArrayList {

    public static void main(String[] args) {
        ArrayList arr = new ArrayList(9);
        arr.add(10);
        arr.add(20);
        arr.add(30);

        arr.insert(1, 15);   // 10 15 20 30
        arr.display();

        arr.remove(2);       // 10 15 30
        arr.display();
    }
}
