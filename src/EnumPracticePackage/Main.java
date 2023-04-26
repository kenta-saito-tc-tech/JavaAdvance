package EnumPracticePackage;

import java.text.ParseException;

public class Main {
    public static void main(String[] args) {
        DayOfWeek dw = DayOfWeek.MONDAY;
        try {
            System.out.println(dw.getDayOfWeek("2023/04/26"));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
