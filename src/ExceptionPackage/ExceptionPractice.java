package ExceptionPackage;

import java.util.Scanner;

public class ExceptionPractice {
    public static void main(String[] args){
        boolean flg = false;
        do {
            try {
                System.out.print("点数を入力してください>>");
                Scanner scn = new Scanner(System.in);
                System.out.println(judgeScore(scn.nextInt()));
                flg = false;
                scn.close();
            }catch (IlligalScoreException e){
                e.printStackTrace();
                System.out.println("スコアが不正です");
                flg = true;
            }
        }while (flg);
    }

    /**
     * scoreの値が80以上の場合は"A"を返す
     * scoreの値が70以上の場合は"B"を返す
     * scoreの値が60以上の場合は"C"を返す
     * scoreの値が59以下の場合は"D"を返す
     * scoreの値が負の値、または100より大きい場合は
     * IlligalScoreExceptionの例外を投げる
     *
     * @param score
     * @return
     */
    public static String judgeScore(int score) {
        if (score > 100 || score < 0) {
            throw new IlligalScoreException();
        } else if (score >= 80) {
            return "A";
        } else if (score >= 70) {
            return "B";
        } else if (score >= 60) {
            return "C";
        }else{
           return "D";
        }
    }
}
