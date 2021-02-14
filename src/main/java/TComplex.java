
public class TComplex extends Complex{
    private double mod;
    private double arg;

    public TComplex (double mod, double arg) {
        this.mod = mod;
        this.arg = arg;
    }

    public TComplex (Complex c) {
        this.mod = c.mod();
        this.arg = c.arg();
    }



    @Override
    public double real() {
        return mod * Math.cos(arg);
    }

    @Override
    public double im() {
        return mod * Math.sin(arg);
    }

    @Override
    public double mod() {
        return mod;
    }

    @Override
    public double arg() {
        return arg;
    }

    @Override
    public Complex add(Complex c) {
        this.mod += c.mod();
        this.arg += c.arg();
        return this;

    }

    @Override
    public Complex getClone() {
        return new TComplex(this);
    }
}
