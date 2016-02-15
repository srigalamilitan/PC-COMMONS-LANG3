package com.putracode.common;
import org.apache.commons.lang3.StringUtils;
import static org.apache.commons.lang3.StringUtils.*;
import static com.putracode.Util.*;

/**
 * Created by KrisnaPutra on 2/15/2016.
 */
public class Learn_StringUtils {
    public static void main(String[] args) {
        String[] sampleStrings={null,""," ","putracode"," putracode "};

        printTitle("Learn Using StringUtils : Apache Commons Langs");
        println("String Utils Have a Common Use Static Variable : ");
        println("Static Var \"CR\" :A String for Carriage ('\\n') "+CR);
        println("Static Var \"EMPTY\" : Empty String \""+EMPTY+"\"");
        println("Static Var \"SPACE\" : A String for line feed LF -->"+LF+"<--");
        println("Static Var \"INDEX_NOT_FOUND\" : Represents a failed index search. Value --> "+INDEX_NOT_FOUND);
        printlnSubTitle("Checker Null, Blank , Empty");
        printlnTab("Blank And Empty String Checker : ");
        for (String s:sampleStrings ){
            printlnTab("--Sample String \""+s+"\", Is Blank : "+isBlank(s)+", Is Empty : "+isEmpty(s));
        }
        //String Blank vs String Empty -> " "--> is Blank but Not Empty
        endPrintTab();
        println("Reverse String (PUTRACODE) : " + StringUtils.reverse("PUTRACODE"));
        String [] contentOfStringChecker={null,""," ","Alpha","AlphaNumeric123","@#$%^&*()","lowercase","UPPERCASE","123 123 123"};
        printlnSubTitle("Check Content Of String , Numeric, AlphaNumeric, Alpha, Ascii,Whitespace, All Upper Case , All Lower Case");
        for (String s:contentOfStringChecker ){
            printlnTab("##################################################");
            printlnTab("--Sample String :  \""+s+"\"");
            printlnTab("-----Is Numeric : "+isNumeric(s)+"\t\t\t\t-----Is Apha : "+isAlpha(s));
            printlnTab("-----Is AphaNumeric : "+isAlphanumeric(s)+"\t\t\t-----Is Ascii : "+isAsciiPrintable(s));
            printlnTab("-----Is WhiteSpace : "+isWhitespace(s)+"\t\t\t-----Is All Upper Case : "+isAllUpperCase(s));
            printlnTab("-----Is All Lower Case : "+isAllLowerCase(s)+"\t\t-----Is Is Numeric With Space : "+isNumericSpace(s));
        }
        endPrintTab();
        printlnSubTitle("Join Data to String");
        printlnTab("Join Array with default separator(no Sperator): "+join(contentOfStringChecker));
        printlnTab("Join Array with with Specific separator (,) : " + join(contentOfStringChecker, ","));
        endPrintTab();
        printlnSubTitle("Default Value String ");
        for (String s:sampleStrings ){
            printlnTab("--Sample String \""+s+"\", Is Blank : "+defaultIfBlank(s,"-BLANK-")+", Is Empty : "+defaultIfEmpty(s, "Empty"));
        }
        endPrintTab();
        printlnSubTitle("Contains ,Difference,LevenshteinDistance, CommonPrefix ");
        printlnTab("Contains xx at string PUTRAxxCode : "+contains("PUTRAxxCode","xx"));
        printlnTab("Contains Any xx,ZZ at string PUTRAxxCode : "+containsAny("PUTRAxxCode", "xx", "ZZ"));
        printlnTab("Contains Only xx at string PUTRAxxCode : "+containsOnly("PUTRAxxCode", "xx"));
        printlnTab("Contains Ignore Case XX at string PUTRAxxCode : "+containsIgnoreCase("PUTRAxxCode","XX"));
        printlnTab("Contains WhiteSpace at string PUTRAxxCode : "+containsWhitespace("PUTRAxxCode"));
        printlnTab("Contains None XX at string PUTRAxxCode : "+containsNone("PUTRAxxCode", "XX"));
        printlnTab("Get Difference Using : PutraCode vs PutraXXCode is "+difference("PutraCode","PutraXXCode"));
        printlnTab("Get LevenshteinDistance : PutraCode vs PutraXXCode is "+getLevenshteinDistance("PutraCode","PutraXXCode"));
        printlnTab("Get Common Prefix : ab,abc,a is "+getCommonPrefix("ab","abc","a"));
        endPrintTab();

    }
}
