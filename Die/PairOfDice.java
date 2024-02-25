package Die;

public class PairOfDice {
    Die dice1 = new Die(); //Creating dice one 
    Die dice2 = new Die(); //Creating dice two 

    //Allow users to get and set values by way of method
    public int getDice1Value(){
        return dice1.getFaceValue();
    }

    public int getDice2Value(){
        return dice2.getFaceValue();
    }

    public void setDice1Value(int value){
        dice1.setFaceValue(value);
    }

    public void setDice2Value(int value){
        dice2.setFaceValue(value);
    }

    //Calling the roll function from the die class to roll both die
    public void roll(){
        dice1.roll();
        dice2.roll();
    }
    //Method to get the sum of the dice face values
    public int getCurrentSum(){
        return dice1.getFaceValue() + dice2.getFaceValue(); 
    }

}
