public class OilCompany extends Company {
    private double production;

    public OilCompany(String name, double production) {
        super(name);

        this.production = production;
    }
    @Override
    public void Show() {
        super.Show();

        System.out.println("Production: " + production + " barrels per hour.");
    }
}
