public class Ellipse extends Function {
    private double a;
    private double b;

    public Ellipse(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculate(double x) {
        return Math.sqrt((1 - Math.pow(x, 2) / Math.pow(a, 2)) * Math.pow(b, 2));
    }
    @Override
    public void result(double x) {
        System.out.println("Ellipse: For x = " + x + ", y = " + calculate(x));
    }
}
