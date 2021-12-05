public class EnemyShipSlow implements EnemyShip {
//public class EnemyShipSlow extends EnemyShip {
    String name = "slow";
    String color = "pink";
    int speed = 1;

    public void shootMissles() { System.out.println("\tPEW."); }

    public void shootGuns() {
        System.out.println("\tPEW.");
    }
}
