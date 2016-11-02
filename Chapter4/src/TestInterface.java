interface mobilePhone {

    void call();

    void received();

    void sendMsg();

    void receiveMsg();
}

interface Camera {
    void takePhoto();
}

/**
 * Created by PuFan on 2016/10/26.
 */

public class TestInterface {
    static public void main(String[] args) {
        Student s1 = new Student("ZhangSan", new NokiaPhone());
        Student s2 = new Student("LiSi", new MotoPhone());
        s1.myCall();
        s2.myCall();
    }
}

abstract class CameraPhone implements Camera, mobilePhone {

    public void takePhoto() {
        System.out.println("Taking Photo!");
    }

    public abstract void call();

    public abstract void received();

    public abstract void sendMsg();

    public abstract void receiveMsg();
}

class NokiaPhone extends CameraPhone implements mobilePhone {
    @Override
    public void call() {
        System.out.println("Nokia Calling!");
    }

    @Override
    public void received() {
        System.out.println("Nokia receive!");
    }

    @Override
    public void sendMsg() {
        System.out.println("Nokia sendMsg!");
    }

    @Override
    public void receiveMsg() {
        System.out.println("Nokia receiveMsg!");
    }
}

class MotoPhone extends CameraPhone implements mobilePhone {
    @Override
    public void call() {
        System.out.println("Moto calling!");
    }

    @Override
    public void received() {
        System.out.println("Moto receive!");
    }

    @Override
    public void sendMsg() {
        System.out.println("Moto sendMsg!");
    }

    @Override
    public void receiveMsg() {
        System.out.println("Moto receiveMsg!");
    }
}

class Student {
    private String name;
    private CameraPhone myPhone;

    public Student() {
    }

    public Student(String name, CameraPhone myPhone) {
        this.name = name;
        this.myPhone = myPhone;
    }

    public String getName() {
        return name;
    }

    public void myCall() {
        System.out.print(this.getName() + ' ');
        myPhone.call();
    }
}