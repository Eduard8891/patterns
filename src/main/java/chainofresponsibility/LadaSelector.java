package chainofresponsibility;

public class LadaSelector extends CarSelector{

    public LadaSelector(ClassAuto classAuto) {
        super(classAuto);
    }

    @Override
    protected void write(String label) {
        System.out.println("We select " + label);
    }
}
