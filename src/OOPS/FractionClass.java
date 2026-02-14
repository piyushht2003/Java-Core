package OOPS;

class Fraction{
        int num;
        int den;

        void print(){
            System.out.println(num + "/" + den);
        }

        Fraction(int a , int b){
                this.num = a;
                this.den = b;
                simplify();
        }

        int hcf(int c, int d){
            if(c==0) return d;
            return hcf(d%c, c);
        }

        void simplify(){
            int gcd = hcf(num,den);
            num = num/gcd;
            den = den/gcd;
        }
        void divide(Fraction a){
            num = num * a.num;
            den = den * a.den;
        }

    void add(Fraction b) {
            this.num = this.num * b.den + this.den * b.num;
            this.den = this.den * b.den;
            simplify();
    }
}
public class FractionClass {
    public static void main(String[] args) {
        Fraction a = new Fraction(3,7);
        Fraction b = new Fraction(4,8);
//        a.add(b);
//        a.print();
        b.divide(a);
        a.print();
    }
}
