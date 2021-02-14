
public abstract class Complex {
    public abstract double real();
    public abstract double im();
    public abstract double mod();
    public abstract double arg();
    public abstract Complex add(Complex c);
    public abstract Complex getClone();

    public static Complex sum(Complex c1, Complex c2){
        Complex c = c1.getClone();
        return c.add(c2);
    }

}
