package chainofresponsibility;

//Базовый класс для выбора автомобиля по его классу
public abstract class CarSelector {
    private ClassAuto classAuto;
    private CarSelector nextCarSelector;

    public CarSelector(ClassAuto classAuto) {
        this.classAuto = classAuto;
    }

    public void setNextCarSelector(CarSelector nextCarSelector) {
        this.nextCarSelector = nextCarSelector;
    }

    public void carSelectorManager(String label, ClassAuto classAuto) {
        if (this.classAuto.ordinal() == classAuto.ordinal()) {
            write(label);
            if (classAuto.ordinal() == ClassAuto.HIGH.ordinal()) {
                return;
            }
        }
        if (nextCarSelector != null) {
            nextCarSelector.carSelectorManager(label, classAuto);
        }
    }

    protected abstract void write(String message);
}
