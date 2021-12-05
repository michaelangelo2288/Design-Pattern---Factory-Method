abstract class FruitPicker {
    protected abstract Fruit makeFruit();

    public void pickFruit() {
        final Fruit fruit = makeFruit();
        System.out.format("%s, %s, %s", fruit.getColor(), fruit.getFlavor(), fruit.getSeeds());
    }
}
