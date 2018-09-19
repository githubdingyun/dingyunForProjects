package src.com.dingyun;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {

    @Test
    public void test1(){
        String str="applicationContext.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(str);
        Computer computer = ac.getBean("computer",Computer.class);
        System.out.println(computer);
    }

    @Test
    public void test2(){
        String str="applicationContext.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(str);
        MessageBean me=ac.getBean("msg2",MessageBean.class);


        me.execute();
    }

    @Test
    public void test3(){

        String str="applicationContext.xml";
        ApplicationContext ac=new ClassPathXmlApplicationContext(str);
        DemoBean demoBean = ac.getBean("demo",DemoBean.class);
        demoBean.execute();
    }
}
