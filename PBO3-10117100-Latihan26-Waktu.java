package com.company;
/**
 * Yogie Alfin Salim
 * 10117100
 * IF - 3
 */

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Date date = new Date();
        Calendar cal = Calendar.getInstance();
        int daysOfWeek = cal.get(Calendar.DAY_OF_WEEK);

        SimpleDateFormat formatIndo = new SimpleDateFormat("dd MMM yyyy HH:mm:ss");

        String[] strDays = new String[]{"Sabtu", "Minggu", "Senin", "Selasa", "Rabu"
                , "Kamus", "Jumat"};

        System.out.println("Hari ini adalah hari : " + (strDays[daysOfWeek]) + ", "
                + formatIndo.format(date));
    }

}
