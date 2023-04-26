package EnumPracticePackage;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public enum DayOfWeek {
    MONDAY("月曜日"), TUESDAY("火曜日"), WEDNESDAY("水曜日"),
    THURSDAY("木曜日"), FRIDAY("金曜日"), SATURDAY("土曜日"), SUNDAY("日曜日");

    private final String name;

    DayOfWeek(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public String getDayOfWeek(String strCal) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Date date = sdf.parse(strCal);
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);

        switch (cal.get(Calendar.DAY_OF_WEEK)) {
            case (Calendar.MONDAY):
                return MONDAY.name;
            case (Calendar.TUESDAY):
                return TUESDAY.name;
            case (Calendar.WEDNESDAY):
                return WEDNESDAY.name;
            case (Calendar.THURSDAY):
                return THURSDAY.name;
            case (Calendar.FRIDAY):
                return FRIDAY.name;
            case (Calendar.SATURDAY):
                return SATURDAY.name;
            case (Calendar.SUNDAY):
                return SUNDAY.name;
            default:
                throw new IllegalStateException();
        }
    }
}
