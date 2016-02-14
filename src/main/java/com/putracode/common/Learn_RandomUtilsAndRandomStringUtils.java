package com.putracode.common;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

import java.util.HashMap;
import java.util.Map;

import static com.putracode.Util.*;
/**
 * Created by KrisnaPutra on 2/13/2016.
 */
public class Learn_RandomUtilsAndRandomStringUtils {
    public static void main(String[] args) {
        printTitle("Learn Using RandomUtils and RandomStringUtils");
        printlnSubTitle("RandomUtils");
        Map<String,Long> longs=new HashMap();
        int count=1000000;
        int data=count;
        int printCountSample=10;
        while (count>0){
            Long random=RandomUtils.nextLong(0,Long.MAX_VALUE);
            longs.put(""+random,random);
            if(printCountSample>0){
                printlnTab("Sample : " + random);
                printCountSample--;
            }
            count--;
        }
        printlnTab("Test RandomUtils 1.000.000 put in Map");
        printlnTab("Data Expectation : " + data);
        printlnTab("Total Data in Map : " + longs.size());
        printlnTab("Data Expectation equals Total Data In Map is -->" + (data == longs.size()));
        endPrintTab();

        printlnSubTitle("RandomStringUtils");
        printlnTab("Random String Ascii : " + RandomStringUtils.randomAscii(10));
        printlnTab("Random String Numberic : " + RandomStringUtils.randomNumeric(10));
        printlnTab("Random String Alphabetic : " + RandomStringUtils.randomAlphabetic(10));
        printlnTab("Random String Alpha Numeric : " + RandomStringUtils.randomAlphanumeric(10));
        printlnTab("Test RandomStringUtils Alphanumeric 1.000.000 put in Map");
        int count_String=1000000;
        int data_String=count_String;
        int printCountStringSample=10;
        Map<String,String> stringMap=new HashMap();
        while (count_String>0){
            String random_string=RandomStringUtils.randomAlphabetic(20);
            stringMap.put(""+random_string,random_string);
            if(printCountStringSample>0){
                printlnTab("Sample : " + random_string);
                printCountStringSample--;
            }
            count_String--;
        }
        printlnTab("Test RandomUtils 1.000.000 put in Map");
        printlnTab("Data Expectation : " + data_String);
        printlnTab("Total Data in Map : " + stringMap.size());
        printlnTab("Data Expectation equals Total Data In Map is -->" + (data_String == stringMap.size()));
        endPrintTab();
    }
}
