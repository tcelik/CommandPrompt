package org.csystem.util;


public class StringUtil {

    public static void reverse(String str)
    {
        String result = "";

        for (int i = str.length() - 1; i >= 0; --i)
            result += str.charAt(i);

        System.out.println(result);
    }

    public static void len(String str)
    {
        System.out.println(str.length());
    }

    public static void isPalindrome(String str)
    {
        String result = "";

        for (int i = str.length() - 1; i >= 0; --i)
            result += str.charAt(i);

        if (result.equals(str))
            System.out.println("palindrome");
        else
            System.out.println("palindrome değil");
    }
}
