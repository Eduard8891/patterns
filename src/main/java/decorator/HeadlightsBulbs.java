package decorator;

// Лампочки фар
public class HeadlightsBulbs implements Component {
    @Override
    public void use() {
        System.out.println("Use headlights bulbs");
    }
}
