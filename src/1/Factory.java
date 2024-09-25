public class Factory extends Company {
    private String type;

    public Factory(String name, String type) {
        super(name);

        this.type = type;
    }
    @Override
    public void Show() {
        super.Show();

        System.out.println("Type factory: " + type);
    }
}
