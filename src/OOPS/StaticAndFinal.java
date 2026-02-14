package OOPS;

public class StaticAndFinal {
    public static class Cricketer{
        static String country = "India";
        final int runsCentury = 100;
        double avg;
        String name;
        void  print(){
            System.out.println(runsCentury + " " + name + " " + avg + " " + country);
        }
    }
    public static void main(String[] args) {
        Cricketer c1 = new Cricketer();
        c1.name = "Virat";
        c1.avg = 78.43;
//        c1.country = "England"; // -> static is shareable throughout c2 will also have england in country attribute
        Cricketer c2 = new Cricketer();
        c2.name = "Rohit";
        c2.avg = 68.45;
//        c2.runsCentury = 200; -> error cant change final value
        c1.print();
        c2.print();
    }
}
