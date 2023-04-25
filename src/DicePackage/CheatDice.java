package DicePackage;

import java.util.Random;

public class CheatDice extends Dice{

    public int castCheat(int i){
        Random rnd = new Random();
        super.diceNum = rnd.nextInt(6+1);
        if(i % 6 == 0){
            super.diceNum = 6;
        }
        return super.diceNum;
    }
}
