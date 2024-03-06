package ch06.lecture.p7access.package1;

public class C04GetterSetter {
    public static void main(String[] args) {

    }
}

class C04MyClass {
    private String name;
    private int age;
    private boolean married; //get->is

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

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }
}