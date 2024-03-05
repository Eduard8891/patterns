package adapter;

public class Main {
    public static void main(String[] args) {
        Target target = new Target();
        TargetInt adapter = new Adapter(target);
        adapter.method();
    }
}
