package visitor;

import java.util.List;

class Car implements CarElement {

    private final List<CarElement> elements;

    public Car() {
        this.elements = List.of(new Body(), new Engine());
    }

    @Override
    public void accept(CarElementVisitor visitor) {
        for (CarElement element : elements) {
            element.accept(visitor);
        }
        visitor.visit(this);
    }

}