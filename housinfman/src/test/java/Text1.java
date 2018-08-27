import com.house.servlet.ServletRect;

import java.lang.reflect.Method;

public class Text1 {


    public static void main(String[] args) {
        Method[] declaredMethods = Text1.class.getDeclaredMethods();
        for (Method method:declaredMethods
                ) {
            System.out.println(method.getName());

        }
    }

}
