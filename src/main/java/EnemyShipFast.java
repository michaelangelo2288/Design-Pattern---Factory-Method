public class EnemyShipFast implements EnemyShip {
//public class EnemyShipFast extends EnemyShip {
    private String name = "fast";
    private String color = "black";
    private int speed = 10;

    public void shootMissles () {
        System.out.println("\tBOOM!");
    }

    public void shootGuns () {
        System.out.println("\tBANG!");
    }
}
