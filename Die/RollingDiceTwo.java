package Die;
public class RollingDiceTwo {
    public static void main(String[] args) {
        PairOfDice dice = new PairOfDice();

        //Test to see values after Dice is randomly selected
        dice.roll();
        System.out.println("Dice 1: " + dice.getDice1Value());
        System.out.println("Dice 2: " + dice.getDice2Value());
        System.out.println("Sum: " + dice.getCurrentSum());
        //Test to see values after set by the user
        dice.setDice1Value(6);
        dice.setDice2Value(4);

        System.out.println("\nDice 1: " + dice.getDice1Value());
        System.out.println("Dice 2: " + dice.getDice2Value());
        System.out.println("Sum: " + dice.getCurrentSum());

    }    
}
