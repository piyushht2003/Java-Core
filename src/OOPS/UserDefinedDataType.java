package OOPS;

public class UserDefinedDataType {
    public static class Student {
        String name;
        int age;
        int rno;
        double cgpa;
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Piyush";
        s1.age = 22;
        s1.rno = 30;
        s1.cgpa = 7.31;

        Student s2 = new Student();
        s2.name = "Aditya";
        s2.age = 23;
        s2.rno = 5;
        s2.cgpa = 7.51;

        Student s3 = new Student();
        s3.name = "Rohan";
        s3.age = 23;
        s3.rno = 38;
        s3.cgpa = 7.71;

        System.out.println(s1.name + " Ke Mitra hai " + s2.name + " aur " + s3.name);
    }
}
