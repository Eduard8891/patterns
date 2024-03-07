package templatemethod;

class Main {
    public static void main(String[] args) {
        System.out.println("Draw the flag of the Russia:");
        AbstractThreeRowsFlag russianFlag = new RussianFlag();
        russianFlag.drawFlag();

        System.out.println("\nDraw the flag of the Netherlands:");
        AbstractThreeRowsFlag netherlandsFlag = new NetherlandsFlag();
        netherlandsFlag.drawFlag();
    }
}