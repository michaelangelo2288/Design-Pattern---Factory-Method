public class OrangePicker extends FruitPicker {
    @Override
    public Fruit makeFruit() {
        return new Orange();
    }

    public static void main(String[] arg) {
        Orange orange1 = new Orange();
        System.out.format("%s, %s, %s\n", orange1.getColor(), orange1.getFlavor(), orange1.getSeeds());

        OrangePicker orangePicker = new OrangePicker();
        Fruit orange = orangePicker.makeFruit();
        System.out.format("%s, %s, %s\n", orange.getColor(), orange.getFlavor(), orange.getSeeds());
        orangePicker.pickFruit();
    }
}


