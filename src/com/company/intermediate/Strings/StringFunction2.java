package com.company.intermediate.Strings;

public class StringFunction2 {
    public static void main(String[] args) {
        String s="Hello India";
        System.out.println("String is: "+s);

        System.out.println("Length of string is:"+s.length());
        System.out.println("String in upper case: "+s.toUpperCase());
        System.out.println("String in lower case: "+s.toLowerCase());
        System.out.println(s.charAt(4));
        System.out.println(s.startsWith("Hel"));
        System.out.println(s.startsWith("hel"));
        System.out.println(s.endsWith("hel"));
        System.out.println(s.endsWith("ndia"));
        System.out.println(s.replace('e','E'));
        System.out.println(s.concat("Good Morning"));
        System.out.println(s);
        s=s.concat("Good");
        System.out.println(s);
        System.out.println(s.contains("llo"));

        System.out.println(s.substring(3));
        System.out.println(s.substring(3,11));

        s=s+" Morning";
        System.out.println(s);

        String s1="This is "+s;
        System.out.println(s1);
        String ar[]=new String[10];
        ar=s.split(" ");
        System.out.println("Array is ");
        for (int i=0;i<ar.length;i++)
            System.out.println(ar[i]);

        String s2="    This        is      String   ";
        System.out.println(s2+" "+s2.length());
        s2=s2.trim();
        System.out.println(s2+" "+s2.length());

        System.out.println(s1);
        System.out.println(s1.indexOf('i'));
        System.out.println(s1.indexOf('i',3));
        System.out.println(s1.lastIndexOf('i'));
        String str1="Hello";
        String str2="Hello";
        String str3="hello";
        String str4="Bye";
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str1.equalsIgnoreCase(str3));
        System.out.println(str1.equals(str4));
        String str5=new String("Hello");
        String str6=new String("Hello");
        System.out.println(str1==str2);
        System.out.println(str1==str5);
        System.out.println(str6==str5);


        System.out.println(str1.compareTo(str2));
        System.out.println(str1.compareTo(str3));

    }
}
