class A {
    int a = 20;
    int b = 30;

    public void add() {
        System.out.println("addition is" + (a * b));
    }
}

class B extends A {
    public void add() {
        System.out.println("Addition is" + (a + b));
    }
}

class MethodOverriding2 {
    public static void main(String args[]) {
        B c = new B();
        c.add();
    }
}
