package OOPS;
class Student{
    String name; // null
    private int rno; // -> 0 private variable
    double cgpa; // 0.0



    /*
    we can access private variable using getter and setter method
     */
    int getRno(){ // Getter method to retrieve the value
        return rno; // returns
    }
    void setRno(int x){ // Setter method to set the value
        rno = x; // receives a value
    }


    /*
       print function

        void print(){ //getter
            System.out.println(name + " " + rno + " " + cgpa);
        }

     */
}
public class PrivateKeyWord {
    // private keyword mainly used when we do not want anyone or anywhere to change the value
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Piyush";
        s.cgpa = 7.31;

//        s.rno = 45; -> error because it is a private variable

        s.setRno(45); // setter method call
        System.out.println(s.getRno()); // getter method call
//        s.rno -> cannot be accessed because it is set to private
//        s.print();
    }
}
