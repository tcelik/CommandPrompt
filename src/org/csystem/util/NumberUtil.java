package org.csystem.util;

public class NumberUtil {
    public static void isPrime(String valStr)
    {
        int val = Integer.valueOf(valStr);
        boolean result = true;

        if (val <= 1)
            result = false;

        if (val % 2 == 0)
            result = val == 2;

        if (val % 3 == 0)
            result = val == 3;

        if (val % 5 == 0)
            result = val == 5;

        if (val % 7 == 0)
            result = val == 7;

        for (int i = 11; i * i <= val; i += 2)
            if (val % i == 0)
                result = false;

            if (result)
                System.out.println("asal");
            else
                System.out.println("asal değil");





    }
}
