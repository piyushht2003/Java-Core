package OOPS;

public class ComplexNumberClass {
    public static class ComplexNumbers{
        double x;
        double y;
        ComplexNumbers(int x, int y){
            this.x = x;
            this.y = y;
        }
        void print(){
            if(y>=0) System.out.println(x + " + " + y + "i");
            else System.out.println(x + " - " + (-y) + "i");
        }
        // Addition
        public void add(ComplexNumbers z) {
            this.x += z.x;
            this.y += z.y;
        }

        // Subtraction
        public void subtract(ComplexNumbers z) {
            this.x -= z.x;
            this.y -= z.y;
        }

        // Multiplication
        public void multiply(ComplexNumbers z) {
            double real = this.x * z.x - this.y * z.y;
            double imaginary = this.x * z.y + this.y * z.x;

            this.x = real;
            this.y = imaginary;
        }

        // Division
        public void divide(ComplexNumbers z) {
            double denominator = z.x * z.x + z.y * z.y;

            if (denominator == 0) {
                System.out.println("Cannot divide by zero complex number.");
                return;
            }

            double real = (this.x * z.x + this.y * z.y) / denominator;
            double imaginary = (this.y * z.x - this.x * z.y) / denominator;

            this.x = real;
            this.y = imaginary;
        }
    }
    public static void main(String[] args) {
        ComplexNumbers a = new ComplexNumbers(4, 5);
        ComplexNumbers b = new ComplexNumbers(5, -2);

        System.out.println("Initial value of a:");
        a.print();

        a.add(b);
        System.out.println("After Addition:");
        a.print();

        a.subtract(b);
        System.out.println("After Subtraction (back to original):");
        a.print();

        a.multiply(b);
        System.out.println("After Multiplication:");
        a.print();

        a.divide(b);
        System.out.println("After Division (back to original):");
        a.print();


    }
}
