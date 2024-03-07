package state;

public class Main {

    public static void main(String[] args) {
        Human human = new Human();
        human.run();
        human.setStage(Stage.CHILD);
        human.run();
        human.setStage(Stage.ADULT);
        human.run();
    }

}