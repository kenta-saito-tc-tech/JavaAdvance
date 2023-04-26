package CollectionPackage;

import java.util.*;

public class ListPractice {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Scanner scn = new Scanner(System.in);
        String scnFlg = "";
        System.out.println("名前を入力してください");
        while (true){
            scnFlg = scn.nextLine();
            if (scnFlg.equals("exit")){
                break;
            }
            list.add(scnFlg);
        }
        System.out.println("最初に入力された人："+list.get(0));
        System.out.println("最後に入力された人："+list.get(list.size()-1));
        Collections.sort(list);
        for (var value : list){
            System.out.println(value);
        }
    }
}
