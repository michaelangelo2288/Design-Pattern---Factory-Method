import java.util.Random;

// 1. Basically using interfaces/abstract classes to define template of object EnemyShip, then
// the concrete class (EnemyShipFast, EnemyShipSlow) would implement/extend the interface/abstract class
// and define the abstract methods/members.
// 2. EnemyShipFactory would actually make (ie. makeEnemyShip()) .

public class EnemyShipFactory {

    public EnemyShip makeEnemyShip() {
        Random random = new Random();
        int x = random.nextInt(2);
        EnemyShip enemyShip;
        if (x == 0) {
            System.out.println("make FAST enemy ship");
            enemyShip = new EnemyShipFast();
        }
        else {
            System.out.println("make SLOW enemy ship");
            enemyShip = new EnemyShipSlow();
        }

        return enemyShip;
    }

    public static void main(String[] arg) {
        EnemyShipFactory enemyShipFactory = new EnemyShipFactory();

        for(int i = 0; i < 20; i++) {
            EnemyShip e1 = enemyShipFactory.makeEnemyShip();
            e1.shootGuns();
            e1.shootMissles();
        }
    }
}
