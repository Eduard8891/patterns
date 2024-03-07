package state;

public class Human implements HumanRunnable {
    private Stage stage;

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    @Override
    public void run() {
        if (this.stage == null) {
            System.out.println("You must set stage");
        } else {
            if (this.stage.equals(Stage.CHILD)) {
                System.out.println("Max speed is 10 kmh");
            } else if (this.stage.equals(Stage.TEENAGER)) {
                System.out.println("Max speed is 18 kmh");
            } else if (this.stage.equals(Stage.ADULT)) {
                System.out.println("Max speed is 25 kmh");
            } else if (this.stage.equals(Stage.OLD)) {
                System.out.println("Max speed is 8 kmh");
            }
        }
    }
}
