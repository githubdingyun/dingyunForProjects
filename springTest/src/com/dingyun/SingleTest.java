package src.com.dingyun;

public class SingleTest {
    private static SingleTest ourInstance = new SingleTest();

    public static SingleTest getInstance() {
        return ourInstance;
    }

    private SingleTest() {


    }
}
