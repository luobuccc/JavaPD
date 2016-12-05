interface O {
    void Create();//static final
}

/**
 * Created by PuFan on 2016/10/26.
 */

public class Inter {
    static void test(O o) {
        o.Create();
    }

    static public void main(String[] args) {
        Class<?> c = O1.class;
        System.out.println(c.getConstructors());
        System.out.println(c.getDeclaredFields());
    }
}

class O1 implements O {
    public void Create() {
        System.out.println("O1");
    }
}

class O2 implements O {
    public void Create() {
        System.out.println("O2");
    }
}



