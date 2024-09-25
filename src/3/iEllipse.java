public class iEllipse implements iFunction {
    private double a;
    private double b;

    public iEllipse(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculate(double x) {
        return Math.sqrt((1 - Math.pow(x, 2) / Math.pow(a, 2)) * Math.pow(b, 2));
    }
    @Override
    public void result(double x) {
        System.out.println("iEllipse: For x = " + x + ", y = " + calculate(x));
    }
}
