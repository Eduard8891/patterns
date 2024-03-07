package chainofresponsibility;

public class Main {
    public static void main(String[] args) {
        CarSelector ladaSelector = new LadaSelector(ClassAuto.LOW);
        CarSelector renaultSelector = new RenaultSelector(ClassAuto.MIDDLE);
        CarSelector bMWSelector = new BMWSelector(ClassAuto.HIGH);

        ladaSelector.setNextCarSelector(renaultSelector);
        bMWSelector.setNextCarSelector(bMWSelector);

        ladaSelector.carSelectorManager("Lada!", ClassAuto.LOW);

        System.out.println("---------------------------------------------------------------------");
        renaultSelector.carSelectorManager("Renault!", ClassAuto.MIDDLE);

        System.out.println("---------------------------------------------------------------------");
        bMWSelector.carSelectorManager("BMW!", ClassAuto.HIGH);

    }
}
