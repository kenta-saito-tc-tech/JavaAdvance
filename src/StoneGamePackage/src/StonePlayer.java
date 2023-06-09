package StoneGamePackage.src;

import java.util.Scanner;

public class StonePlayer {
    //フィールド
    private String[] name;
    private int howManyPeople;

    //コンストラクタ
    public StonePlayer() {
        //
    }

    //ゲッター、セッター

    public String[] getName() {
        return this.name;
    }

    public void setName(String[] name) {
        this.name = name;
    }

    public int getHowManyPeople() {
        // howManyPeople = name.length;
        return this.howManyPeople;
    }

    public void setHowManyPeople(int howManyPeople) {
        this.howManyPeople = howManyPeople;
        this.name = new String[this.howManyPeople];
    }

    //メソッド

    /**
     * 人数と名前のセッティングメソッド
     */
    public void peopleSetting() {
        int inputName = -1; //仮
        BasicMethod.oneNewBorderLine();
        Scanner scn = new Scanner(System.in);
        System.out.print("何人参加しますか?>>");
        setHowManyPeople(scn.nextInt());
        while (inputName < 2 || inputName > 24){
            System.out.println("参加する方の名前をカンマ区切りで入力してください↓");
            String NameAll = scn.next();
            setName(NameAll.split(","));
            for (int i = 0; i < getHowManyPeople(); i++) {
                inputName = getName()[i].length();
                if(inputName < 2 || inputName > 24){
                    System.out.println("2文字~24文字の間でお願いします");
                    break;
                }
            }
        }
    }

    /**
     * 人数と名前のセッティングメソッド
     *(名前を一行一行格納する場合)
     /*
     public void peopleSetting() {
     BasicMethod.oneNewBorderLine();
     Scanner scn = new Scanner(System.in);
     System.out.print("何人参加しますか?>>");
     setHowManyPeople(scn.nextInt());
     System.out.println("参加する方の名前を入力してください↓");
     for (int i = 0; i < getHowManyPeople(); i++) {
     setName(scn.next(), i);
     }
     }*/

}
