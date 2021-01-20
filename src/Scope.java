public class Scope {
    static int x=20;
    private int y=33;

    public void method (int x){
        Scope t = new Scope();
        this.x=22;
        y=44;
        System.out.println("test.x"+Scope.x);
        System.out.println("t.x"+t.x);
        System.out.println("t.y"+t.y);
        System.out.println("y"+y);
    }
    public static void main (String args []){
        Scope t = new Scope();
        t.method(1);
    }

}
