
public class TComplex extends Complex {
    private double mod;
    private double arg;

    public TComplex(double mod, double arg) {
        this.mod = mod;
        this.arg = arg;
    }

    public TComplex(Complex c) {
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
        AComplex temp = new AComplex(this);
        temp.add(c);
        this.mod = temp.mod();
        this.arg = temp.arg();
        return this;
    }

    @Override
    public Complex dec(Complex c) {
        return this.add(new AComplex(-c.real(), -c.im()));
//        AComplex temp = new AComplex(this);
//        temp.dec(c);
//        this.mod = temp.mod();
//        this.arg = temp.arg();
//        return this;
    }

    @Override
    public Complex mul(Complex c) {
        this.arg += c.arg();
        this.mod *= c.mod();
        return this;
    }

    @Override
    public Complex div(Complex c) {
        return this.mul(new TComplex(1/c.mod(), -c.arg()));
    }

    @Override
    public Complex getClone() {
        return new TComplex(this);
    }

    public String toString() {
        return "z = " + mod + "*(cos(" + arg + ") + i*sin(" + arg + "))";
    }
}
