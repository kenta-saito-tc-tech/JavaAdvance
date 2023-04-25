package DicePackage;

import java.util.Random;

public class Dice {
    //フィールド
    protected int diceNum;

    //コンストラクタ
    public Dice() {
        //
    }
    //メソッド

    /**
     * サイコロを振るメソッド
     *
     * @return 1から6のランダムな値
     */
    public int cast() {
        Random rnd = new Random();
        this.diceNum = rnd.nextInt(6 + 1);
        return this.diceNum;
    }

    /**
     * 出目を確認する
     *
     * @return 最後に「振った」時の目を戻り値として返す
     * 一度も「振った」ことのないときは1を返す
     */
    public int see() {
        if (this.diceNum != 0) {
            return this.diceNum;
        } else {
            return 1;
        }
    }
}
