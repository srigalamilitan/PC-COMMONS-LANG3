package com.putracode.time;
import org.apache.commons.lang3.SystemUtils;
import org.apache.commons.lang3.time.FastDateFormat;

import java.util.Date;

import static com.putracode.Util.*;
/**
 * Created by KrisnaPutra on 2/14/2016.
 */
public class Learn_FastDateFormat {
    //FastDateParser is Save for MultiThreading
    //so you can make FastDateParser for Static variable
    public static FastDateFormat DATE_FORMAT=FastDateFormat.getInstance("dd-MM-yyyy");
    public static void main(String[] args)throws Exception{
        printTitle("Learn Using FastDateFormat ");
        String str_date="18-06-2015";
        println("Parse String To Date : "+DATE_FORMAT.parse(str_date));
        println("Format Date to String : "+DATE_FORMAT.format(new Date()));
        println("Format Date from long milliseconds : "+ System.currentTimeMillis()+" -> "+DATE_FORMAT.format(System.currentTimeMillis()));
        println("Gets a debugging string version of this formatter : "+DATE_FORMAT.toString());

    }
}
