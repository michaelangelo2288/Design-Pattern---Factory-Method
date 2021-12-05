import org.junit.Test;

public class testClass {

    @Test
    public void testInnerClass() {
        Orange orange = new Orange();
        Orange.InnerOrangeClass innerOrnage = orange.new InnerOrangeClass();
        System.out.println("end");
    }

}
