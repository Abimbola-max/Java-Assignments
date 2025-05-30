public class EkitiBabe extends Babe {

    public void cook() {
        System.out.println("I can pound yam");
    }

    @Override
    public void cook(String item) {
        System.out.println("cooking " + item + " " + "is my hobby");
    }
}
