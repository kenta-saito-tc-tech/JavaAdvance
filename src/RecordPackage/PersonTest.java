package RecordPackage;

//レコードクラス-1-2
public class PersonTest {
    public static void main(String[] args){
        record person(String name, String furigana, int age){}

        /**
         * ５人配列で生成
         */
        person[] persons ={
                new person("斎藤", "サイトウ", 28),
                new person("後藤", "ゴトウ", 30),
                new person("佐藤", "サトウ", 14),
                new person("加藤", "カトウ", 45),
                new person("安藤", "アンドウ", 60),
        };

        /**
         * 一番年齢の高い人を調べる
         */
        int ageMax = 0;
        int ageMaxAns = 0;
        for(int i = 0; i < persons.length; i++){
            if(ageMax < persons[i].age){
                ageMax = persons[i].age;
                ageMaxAns = i;
            }
        }
        System.out.println("一番年齢の高い人は"+persons[ageMaxAns].name+
                "さんの"+persons[ageMaxAns].age+"歳");

        /**
         * 一番年齢の低い人を調べる
         */
        int ageMin = ageMax;
        int ageMinAns = 0;
        for(int i = 0; i < persons.length; i++){
            if(ageMin > persons[i].age){
                ageMin = persons[i].age;
                ageMinAns = i;
            }
        }
        System.out.println("一番年齢の低い人は"+persons[ageMinAns].name+
                "さんの"+persons[ageMinAns].age+"歳");

        /**
         * 年齢順に並べ替え
         */
        for(int i = 0; i < persons.length-1; i++){
            for(int j = i+1; j < persons.length; j++){
                if(persons[j].age < persons[i].age){
                    var num = persons[i];
                    persons[i] = persons[j];
                    persons[j] = num;
                }
            }
        }
        for (var value : persons){
            System.out.println(value);
        }
    }
}
