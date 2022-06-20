public class Main {
    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.12);
        System.out.println("Total burger price is " + hamburger.itemizeHamburger());


        HealthyBurger healthyBurger = new HealthyBurger("Salmon", 2.5);
        healthyBurger.addHealthAddition1("Mayo", 1.12);
        healthyBurger.addHealthAddition2("Salad", 2.0);
        System.out.println("Total healthy burger price is " + healthyBurger.itemizeHamburger());
    }
    DeluxeBurger deluxeBurger = new DeluxeBurger();



}