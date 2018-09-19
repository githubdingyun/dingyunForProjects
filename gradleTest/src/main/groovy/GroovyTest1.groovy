/**
 * java bean写法,简单的getset方法
 */
public class GroovyTest12 {
    private int major
    private int minor

    GroovyTest12(int major, int minor) {
        this.major = major
        this.minor = minor
    }

    int getMajor() {
        return major;
    }

    void setMajor(int major) {
        this.major = major
    }

    int getMinor() {
        return minor
    }

    void setMinor(int minor) {
        this.minor = minor
    }
}

GroovyTest12 v1 = new GroovyTest12(1,1)
println v1.minor
println(v1.major==v1.minor)
