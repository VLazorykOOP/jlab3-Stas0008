public class Main {
    public static void main(String[] args) {
        Company[] companies = new Company[3];

        companies[0] = new InsuranceCompany("Insurance your life", "Cars and vehicle");
        companies[1] = new OilCompany("British Petrolium", 30.5);
        companies[2] = new Factory("Audi automobile factory", "Automobile manufacture");
        
        for(Company company : companies) {
            company.Show();
        }
    } 

}
