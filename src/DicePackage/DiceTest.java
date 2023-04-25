package DicePackage;

public class DiceTest {
    public static void main(String[] args){
        Dice dice = new Dice();
        CheatDice cDice = new CheatDice();
        for(int i = 0; i < 30; i++){
            System.out.println("サイコロをふった結果"+dice.cast());
            System.out.println("最後の目は："+dice.see());
        }
        for(int i = 1; i <= 30; i++){
            System.out.println(i+"回目");
            System.out.println("サイコロをふった結果"+cDice.castCheat(i));
            System.out.println("最後の目は："+cDice.see());
        }
    }
}
