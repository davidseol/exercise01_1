package sec03.exam02;

import java.util.Calendar;

public class EunmWeekExample {
    public static void main(String[] args) {
        Week today = null;

        Calendar cal = Calendar.getInstance();
        int Week = cal.get(Calendar.DAY_OF_WEEK);

        switch(Week) {
            case 1:
                today = Week.SUNDAY; break;
            case 2:
                today = Week.MONDAY; break;
            case 3:

        }
    }
}
