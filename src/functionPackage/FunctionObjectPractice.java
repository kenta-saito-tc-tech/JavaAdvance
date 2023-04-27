package functionPackage;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class FunctionObjectPractice {
    public static void main(String[] args) {
        /**
         * 奇数か偶数かを判定する関数オブジェクト
         */
        Predicate<Integer> pd = n -> n % 2 == 0;
        System.out.println(pd.test(10)? "偶数":"奇数");

        /**
         * 与えられた文字列を反転させる関数オブジェクト
         */
        Function<String, String> fc = str -> {
            StringBuilder sb = new StringBuilder(str);
            sb.reverse();
            return sb.toString();
        };
        System.out.println(fc.apply("Hello"));

        /**
         * 与えられた文字列を指定した区切り文字で分割し、
         * 分割後の文字列の配列を返す関数オブジェクト
         */
        Function<String, String[]> fcArray = (str) ->{
            return str.split(",");
        };
        for(String value : fcArray.apply("A,B,C,D")){
            System.out.println(value);
        }

        /**
         * 与えられた整数値を指定された回数分だけ2倍にする関数オブジェクト
         */
        UnaryOperator<Integer> threeOfTwo = x -> {
            for(int i = 0; i < 3; i++){
                x *= 2;
            }
            return x;
        };
        System.out.println(threeOfTwo.apply(3));

        /**
         * 与えられた文字列を指定された数だけ繰り返し連結する関数オブジェクト
         */
        BiFunction<String, String, String> strAdd = (str1, str2) ->{
          for(int i = 0; i < 3; i++){
              str1 += str2;
          }
          return str1;
        };
        System.out.println(strAdd.apply("Hello", "."));


    }
}
