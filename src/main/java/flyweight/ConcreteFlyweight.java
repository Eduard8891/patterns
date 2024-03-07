package flyweight;

class ConcreteFlyweight implements Flyweight {
    private final String name;

    public ConcreteFlyweight(String name) {
        this.name = name;
    }

    @Override
    public void operation() {
        System.out.println("ConcreteFlyweight: " + name);
    }
}