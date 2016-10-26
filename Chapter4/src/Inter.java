/**
 * Created by PuFan on 2016/10/26.
 */

public class Inter {
    static void test(O o) {
        o.Create();
        ;
    }

    static public void main(String[] args) {
        test(new O1());
        test(new O2());
    }
}

interface O {
    void Create();//static final
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



