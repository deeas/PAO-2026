package ro.unibuc.pao.lab4.constructor;

class A {
    public A() {
        System.out.println("Constructor A");
    }
}

class B extends A {
    public B() {
        super();
        System.out.println("Constructor B");
    }

}

class C extends B {
    public C() {
        super();
        System.out.println("Constructor C");
    }
}

class A2 {
    public A2(int x) {
        System.out.println("Constructor A2: " + x);
    }
}

class B2 extends A2 {
    public B2() {
        super(10);
        System.out.println("Constructor B2");
    }
}
public class Ex2 {
    public static void main(String[] args) {
        C obiect = new C();
    }
}
