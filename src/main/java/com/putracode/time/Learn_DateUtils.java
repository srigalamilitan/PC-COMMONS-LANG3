package com.putracode.time;

import org.apache.commons.lang3.time.DateUtils;

import java.util.Calendar;
import java.util.Date;
import static com.putracode.Util.*;

/**
 * Created by KrisnaPutra on 2/11/2016.
 */
public class Learn_DateUtils {
    public static void main(String[] args) throws Exception{
        Date date= DateUtils.parseDate("12/02/2016","dd/MM/yyyy");
        String STRING_DATE="21/02/1987";
        String STRING_FORMAT_PATTERN="dd/MM/yyyy";
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
        println("I Same Day "+DateUtils.isSameDay(new Date() ,new Date()));
        println("I Same Instant  "+DateUtils.isSameInstant(new Date(), new Date()));
        println("Parse String to Date : "+DateUtils.parseDate(STRING_DATE,STRING_FORMAT_PATTERN));
        println("Round Date : "+STRING_DATE+" With CALENDAR.MONTH :"+DateUtils.round(DateUtils.parseDate(STRING_DATE,STRING_FORMAT_PATTERN),Calendar.MONTH));
        // round(Date,MONTH) IF Day >= 15 will be next Month( 01 NEXT_MONTH) ELSE 01 CURRENT MONTH
        println("**** if you wan't to change Day, Month and Years. can use setDays,setMonth,setYears");
        println("Date = "+date);
        println("Date set Days to 1th : "+DateUtils.setDays(date,1));
        println("Date set Month to Jan : "+DateUtils.setMonths(date,1));
        println("Date set Year to 2010 : "+DateUtils.setYears(date,2010));
        try {
            print("trying to set februai to 30th : ");
            println(""+DateUtils.setDays(date,30));
        }catch (Exception e){
            println(" Exception Set Date in Feb to 30th : "+e.getMessage());
        }

        println("Truncdate Date : "+date+" for Month : "+DateUtils.truncate(date,Calendar.MONTH));

    }
}
