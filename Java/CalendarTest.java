package Java;

import java.util.Calendar;

public class CalendarTest {
    public static void main(String[] args){

        Calendar c = Calendar.getInstance();
        c.set(2004, 1,7,15,40);
        long day1 = c.getTimeInMillis();
        System.out.println("day1 is " + day1);

        day1 += 1000*60*60;
        c.setTimeInMillis(day1);

        System.out.println("hew hour " + c.get(c.HOUR_OF_DAY));

        c.add(c.DATE,35);
        System.out.println("add 35 days "+ c.getTime());

    }



}
