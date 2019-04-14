public class DVD extends ProductComponent{

    public DVD(String title) {
        super(title);
    }

    @Override
    public void print() {
        System.out.println("DVD title: " + title);
    }

}
