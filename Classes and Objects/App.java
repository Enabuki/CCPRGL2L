// Group 5 Members: Aseron, Cadiz, Marfal, Sumayao, Villena

public class App {
    public static void main(String[] args) {

        // Creating a new object named "Classic" from Gun class
        Gun classic = new Gun(12, "Classic", 6.75 );
        classic.sayGunName();
        classic.sayMagazineCapacity();
        classic.sayFireRate();

        // Creating a new object named "Phantom" from Gun class
        Gun phantom = new Gun(30, "Phantom", 5.4);
        phantom.sayGunName();
        phantom.sayMagazineCapacity();
        phantom.sayFireRate();

        // Creating a new object named "Operator" from Gun class
        Gun operator = new Gun(5, "Operator", 0.6);
        operator.sayGunName();
        operator.sayMagazineCapacity();
        operator.sayFireRate();

    }
}
