package prototype;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        MyObject my1 = new MyObject();
        MyObject my2 = my1.copy();
        System.out.println(my1);
        System.out.println(my2);
    }
}
