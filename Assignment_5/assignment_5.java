class Parent {
    void show() {
        System.out.println("Parent's show method");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("Child's show method");
    }
}

class Inherit_Dispatch {
    public static void main(String args[]) {
        Parent a = new Parent();
        Child b = new Child();
        Parent c = new Child();
        Parent ref;
        ref = a;
        ref.show();
        ref = b;
        ref.show();
        ref = c;
        ref.show();
    }
}
