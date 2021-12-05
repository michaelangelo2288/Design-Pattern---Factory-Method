import lombok.Data;

@Data
// Orange extends from class Fruit
public class Orange extends Fruit {
    private int seeds = 10;
    private String flavor = "sweet";
    private String color = "orange";

    public class InnerOrangeClass {
        private String str = "";
    }
}
