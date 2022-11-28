public abstract class assignment_6b {
    //Non abstract method
    void Show() {
    System.out.println("this is non abstracted method");
    }
    //abstract method
    abstract void run();
    }
    class Main extends assignment_6b {
    void run() {
    System.out.println("this is Abstract Method");
    }
    public static void main(String[] args) {
    Main sc = new Main(); //object is provided by the method
    Main obj = new Main();//object is provided by the method
    obj.Show();
    sc.run();
    }
    }
    