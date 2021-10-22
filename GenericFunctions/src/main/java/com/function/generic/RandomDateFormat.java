package com.function.generic;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class RandomDateFormat {

    public static String generateRandom(String[] ar) {
        Random r = new Random();
        int randomNumber = r.nextInt(ar.length);
        return  ar[randomNumber];
    }

    public static void main(String[] args)
    {
        String arrDay[] ={"d","D","dd","DD"};
        String arrMonth[] ={"m","M","mm","MM","mmm","MMM"};
        String arrYear[] ={"y","Y","yy","YY","yyyy","YYYY"};
        String arrSymbol[] = {"/","-","."};

        String dayOfMonth = generateRandom(arrDay);
        String year = generateRandom(arrYear);
        String month = generateRandom(arrMonth);
        String symbol = generateRandom(arrSymbol);
        String[] arrayTemp = {dayOfMonth, year, month};
        List<String> refList = Arrays.asList(arrayTemp);
        Collections.shuffle(refList);
        String[] tempArray = refList.toArray(new String[0]);
        String dateFormat = tempArray[0]+symbol+tempArray[1]+symbol+tempArray[2];
        System.out.println("Generated dateformat is "+dateFormat);
    }
}
