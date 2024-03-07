package chainofresponsibility;

public class BMWSelector extends CarSelector {

    public BMWSelector(ClassAuto classAuto) {
        super(classAuto);
    }

    @Override
    protected void write(String label) {
        System.out.println("We select " + label);
    }
}
