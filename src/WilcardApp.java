import model.MyData;

public class WilcardApp {
    public static void printValue(MyData<?> data) {
        System.out.println(data.getData());
    }
}
