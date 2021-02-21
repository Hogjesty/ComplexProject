
public abstract class Complex {
    public abstract double real();
    public abstract double im();
    public abstract double mod();
    public abstract double arg();
    public abstract Complex add(Complex c);
    public abstract Complex dec(Complex c);
    public abstract Complex mul(Complex c);
    public abstract Complex div(Complex c);
    public abstract Complex getClone();

    public static Complex sum(Complex c1, Complex c2){
        Complex c = c1.getClone();
        return c.add(c2);
    }

    public static Complex sub(Complex c1, Complex c2){
        Complex c = c1.getClone();
        return c.dec(c2);
    }

    public static Complex prod(Complex c1, Complex c2){
        Complex c = c1.getClone();
        return c.mul(c2);
    }

    public static Complex division(Complex c1, Complex c2){
        Complex c = c1.getClone();
        return c.div(c2);
    }

    @Override
    public boolean equals(Object o) {
        if(o == null)
            return false;
        if(o == this)
            return true;
        if(!(o instanceof Complex))
            return false;
        Complex c = (Complex) o;
        return this.real() == c.real() && this.im() == c.im();
    }

}
