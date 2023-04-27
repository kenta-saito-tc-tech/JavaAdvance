package LambdaPackage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LambdaPractice {
    public static void main(String[] args) {
        /**
         * 名前とスコアのコンポーネント（フィールド）を持つStudentレコードクラスを作成します。
         * 5人分のStudentレコードを作成し、Listに格納します。
         * 全員分のスコアの合計値を出力してください。
         * （Streamを使用して）スコアが80以上のレコードだけ出力してください。
         * （Streamを使用して）スコアが高い順に並び替えて出力してください。
         */
        record student(String name, int score){}
        List<student> list = new ArrayList<>();
        list.add(new student("斎藤", 100));
        list.add(new student("後藤", 80));
        list.add(new student("佐藤", 70));
        list.add(new student("加藤", 90));
        list.add(new student("安藤", 60));
        int totalNum= 0;
        for(int i = 0; i < list.size(); i++){
            totalNum += list.get(i).score();
        }
        System.out.println(totalNum);

        list.stream().filter(student -> student.score > 80).forEach(System.out::println);

        list.sort(new Comparator<student>() {
            @Override
            public int compare(student o1, student o2) {
                return o1.score + o2.score;
            }
        });
        list.stream().forEach(System.out::println);
    }
}
