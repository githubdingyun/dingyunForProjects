package src.com.dingyun;

public class Computer {
    private String mainboard;
    private String hdd;
    private String ram;
    public String getMainboard() {
        return mainboard;
    }
    public void setMainboard(String mainboard) {
        this.mainboard = mainboard;
    }
    public String getHdd() {
        return hdd;
    }
    public void setHdd(String hdd) {
        this.hdd = hdd;
    }
    public String getRam() {
        return ram;
    }
    public void setRam(String ram) {
        this.ram = ram;
    }
    @Override
    public String toString() {
        return "Computer [mainboard=" + mainboard + ", hdd=" + hdd + ", ram=" + ram + "]";
    }

}
