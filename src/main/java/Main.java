public class Main {
    public static void main(String[] args){
        Complex c1 = new TComplex(1, Math.PI/2);
        Complex c2 = new AComplex(5, 3);
        //System.out.println(Complex.sum(c1, c2));
        System.out.println(c2);
        System.out.println(c1);
        System.out.println(Complex.sum(c2, c1));
    }
}
