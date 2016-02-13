package com.putracode.common;
import static org.apache.commons.lang3.SystemUtils.*;

import static com.putracode.Util.*;

 /* Created by KrisnaPutra on 2/13/2016.*/
public class Learn_SystemUtils {
    public static void main(String[] args) {
        printTitle("Learn Using SystemUtils Apache Commons-lang3 ");
        println("****Static Variable*****");
        println("Get A OS Name : " + OS_NAME);
        println("Get Java Runtime Name : "+JAVA_RUNTIME_NAME);
        println("Get Java Runtime Version : "+JAVA_RUNTIME_VERSION);
        println("Get Java Class Path : "+JAVA_CLASS_PATH);
        println("Get Java Class Version : "+JAVA_CLASS_VERSION);
        println("Get Java Compiler : "+JAVA_COMPILER);
        println("Get Java Endosed Dirs : "+JAVA_ENDORSED_DIRS);
        println("Get Java Home : "+JAVA_HOME);
        println("Get Java IO Temp Directory : "+JAVA_IO_TMPDIR);
        println("Get Java Library Path "+JAVA_LIBRARY_PATH);
        println("Get Java Specification Name : "+JAVA_SPECIFICATION_NAME);
        println("Get Java Specification Vendor : "+JAVA_SPECIFICATION_VENDOR);
        println("Get Java Util Prefs Preferences Factory : "+JAVA_UTIL_PREFS_PREFERENCES_FACTORY);
        println("Get Java Vendor : "+JAVA_VENDOR);
        println("Get Java Version : "+JAVA_VERSION);
        println("Get Java VM Info : "+JAVA_VM_INFO);
        println("Get Java VM Name : "+JAVA_VM_NAME);
        println("Get Java VM Spesification Name : "+JAVA_VM_SPECIFICATION_NAME);
        println("Get Java VM Specification Vendor : "+JAVA_VM_SPECIFICATION_VENDOR);
        println("Get Java VM Specification Version : "+JAVA_VM_SPECIFICATION_VERSION);
        println("Get Java VM Vendor : "+JAVA_VM_VENDOR);
        println("Get Java VM Version : "+JAVA_VM_VERSION);
        println("Line Separator : "+LINE_SEPARATOR);
        println("OS architecture : "+OS_ARCH);
        println("OS Name "+OS_NAME);
        println("OS Version "+OS_VERSION);
        println("Path Sperator "+PATH_SEPARATOR);
        println("USER_COUNTRY : "+USER_COUNTRY);
        println("User Directory : "+USER_DIR);
        println("User Home : " + USER_HOME);
        println("User Language : "+USER_LANGUAGE);
        println("User Name : "+USER_NAME);
        println("User TimeZone : "+USER_TIMEZONE);
        println("****Method in Systems Utils*****");
        println("File.getJavaHome : "+getJavaHome().getAbsolutePath());
        println("File.getJavaIoTmpDir : "+getJavaIoTmpDir().getAbsolutePath());
        println("File.getUserDir : "+getUserDir().getAbsolutePath());
        println("File.getUserHome : " + getUserHome().getAbsolutePath());
        println("boolean.isJavaAwtHeader : "+isJavaAwtHeadless());

    }
}
