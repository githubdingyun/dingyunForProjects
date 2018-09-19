package src.com.dingyun;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @author dingyun
 * 用配置方式给基本值、对象、集合进行赋值
 */
public class MessageBean implements Serializable{
    private static final long serialVersionUID = 1L;
    //基本值
    private String name;
    private int age;
    //bean对象
    private Computer computer;
    //集合
    private List<String> langs;
    private Set<String> cities;
    private Map<String, Object> score;
    private Properties properties;
    //写一个方法
    public void execute(){
        //---------------------------------------------------
        System.out.println("基本值：");
        System.out.println("name:"+name+"====="+"age:"+age);
        //-------------------------------------------------
        System.out.println("bean对象：");
        if(computer!=null){
            System.out.println(computer.getMainboard()+"==="+computer.getHdd()+"==="+computer.getRam());
        }
        //----------------------------------------------------
        System.out.println("[list]======编程语言：");
        if(langs!=null){
            for (String l : langs) {
                System.out.println(l);
            }
        }
        System.out.println("[set]======城市：");
        if(cities!=null){
            for (String c : cities) {
                System.out.println(c);
            }
        }
        System.out.println("[map]=======分数：");
        if(score!=null){
            Set<String> keys = score.keySet();
            for (String key : keys) {
                System.out.println(key+"*******"+score.get(key));
            }
        }
        //---------------------------------------------------
        System.out.println("[properties]=====================参数");
        if(properties!=null){
            Set<Object> keySet = properties.keySet();
            for (Object key : keySet) {
                System.out.println(key+"~~~~~~~~~~~~"+properties.getProperty(key.toString()));
            }
        }
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Computer getComputer() {
        return computer;
    }
    public void setComputer(Computer computer) {
        this.computer = computer;
    }
    public List<String> getLangs() {
        return langs;
    }
    public void setLangs(List<String> langs) {
        this.langs = langs;
    }
    public Set<String> getCities() {
        return cities;
    }
    public void setCities(Set<String> cities) {
        this.cities = cities;
    }
    public Map<String, Object> getScore() {
        return score;
    }
    public void setScore(Map<String, Object> score) {
        this.score = score;
    }
    public Properties getProperties() {
        return properties;
    }
    public void setProperties(Properties properties) {
        this.properties = properties;
    }
    @Override
    public String toString() {
        return "MessageBean [name=" + name + ", age=" + age + ", computer=" + computer + ", langs=" + langs
                + ", cities=" + cities + ", score=" + score + ", properties=" + properties + "]";
    }

}
