package adapter;

public class Adapter implements TargetInt{
    Target target;

    public Adapter(Target target) {
        this.target = target;
    }

    @Override
    public void method() {
        target.targetMethod();
    }
}
