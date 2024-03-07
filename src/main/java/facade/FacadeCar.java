package facade;

class FacadeCar {
    private final Engine engine;
    private final Headlights headlights;

    public FacadeCar() {
        this.engine = new Engine();
        this.headlights = new Headlights();
    }

    public void start() {
        System.out.println("Start a car");
        engine.startEngine();
        headlights.turnOnHeadLights();
    }
}