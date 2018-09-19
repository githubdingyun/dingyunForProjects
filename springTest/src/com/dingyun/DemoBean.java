package src.com.dingyun;

import java.io.Serializable;

public class DemoBean implements Serializable {

    private String name;
    private String lang;
    private String score;
    private int pageSize;


    public DemoBean(String name, String lang, String score, int pageSize) {
        this.name = name;
        this.lang = lang;
        this.score = score;
        this.pageSize = pageSize;
    }

    public DemoBean() {

//        new Thread(() -> {
//            System.out.println("aaaa");
//        },"sss").start();

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public void execute(){
        System.out.printf("name：-------------%s",name);
        System.out.printf("lang:-------------%s",lang);
        System.out.printf("score:-------------%s",score);
        System.out.printf("pageSize:-------------%s",pageSize);
    }


}
