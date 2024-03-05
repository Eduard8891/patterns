package abstractfabric;

public class Truck implements Car {
    @Override
    public String beep() {
        return "Truck beep";
    }
}
