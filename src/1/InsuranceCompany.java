public class InsuranceCompany extends Company {
    private String type;
    
    public InsuranceCompany(String name, String type) {
        super(name);

        this.type = type;
    }
    @Override
    public void Show() {
        super.Show();

        System.out.println("Type insurance: " + type);
    }
}
