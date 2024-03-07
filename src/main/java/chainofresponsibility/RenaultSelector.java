package chainofresponsibility;

public class RenaultSelector extends CarSelector{

    public RenaultSelector(ClassAuto classAuto) {
        super(classAuto);
    }

    @Override
    protected void write(String label) {
        System.out.println("We select " + label);
    }
}
