package com.putracode.time;

import org.apache.commons.lang3.time.DateUtils;

import java.util.Calendar;
import java.util.Date;
import static com.putracode.Util.*;

/**
 * Created by KrisnaPutra on 2/11/2016.
 */
public class Learn_DateUtils {
    public static void main(String[] args) {
        Date date= new Date();

        printTitle("Common-Lang3 : DateUtils");
        println("Date Now is : "+date);
        println("Add Day 1 : "+ DateUtils.addDays(date,1));
        println("Add Hours : "+ DateUtils.addHours(date,1));
        println("Add Miliseconds : "+DateUtils.addMilliseconds(date,100));
        println("Add Minutes : "+DateUtils.addMilliseconds(date,30));
        println("Add Seconds : "+DateUtils.addSeconds(date,30));
        println("Add Weeks : "+DateUtils.addWeeks(date,3));
        println("Add Years : "+DateUtils.addYears(date,1));
        println("Ceiling : "+DateUtils.ceiling(date, Calendar.MONTH));
        println("Get Fragment in a Days : "+DateUtils.getFragmentInDays(date,Calendar.YEAR));


    }
}
