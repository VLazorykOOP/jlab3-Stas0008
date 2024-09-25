// 5. Організація, страхова компанія, нафтогазова компанія, завод. 

public class Company {
    private String name;

    public Company(String name) {
        this.name = name;
    }
    public void Show() {
        System.out.println("Company name: " + name);
    }
}