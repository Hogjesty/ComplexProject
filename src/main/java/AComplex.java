
public class AComplex extends Complex {
    private double real;
    private double im;

    public AComplex(double real, double im) {
        this.real = real;
        this.im = im;
    }

    public AComplex(Complex c) {
        this.real = c.real();
        this.im = c.im();
    }

    @Override
    public double real() {
        return real;
    }

    @Override
    public double im() {
        return im;
    }

    @Override
    public double mod() {
        return Math.sqrt(real * real + im * im);
    }

    @Override
    public double arg() {
        if (real == 0) {
            if (im < 0)
                return 3 * Math.PI / 2;
            else
                return Math.PI / 2;
        }
        return Math.atan(im / real);
    }

    @Override
    public Complex add(Complex c) {
        this.real += c.real();
        this.im += c.im();
        return this;
    }

    @Override
    public Complex dec(Complex c) {
        return this.add(new AComplex(-c.real(), -c.im()));
//        this.real -= c.real();
//        this.im -= c.im();
//        return this;
    }

    @Override
    public Complex getClone() {
        return new AComplex(this);
    }

    public String toString() {
        return "z = " + real + " + (" + im + "*i)";
    }
}
