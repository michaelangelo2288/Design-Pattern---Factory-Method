//abstract class EnemyShip {
//    // *** abstract class can have uninitialized members
//    private String name;
//    private String color;
//    private int speed;
//
//    void shootMissles() {};
//    void shootGuns() {};
//}

// *** Could has done this using Interface as well. Members/methods are always public in intefaces!
// *** Interface requires member variables initialized, and no body {} around methods
// *** Class implementing interface needs methods to be PUBLIC

interface EnemyShip {
    void shootMissles();
    void shootGuns();
}
