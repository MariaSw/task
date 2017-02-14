package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Date date = new Date(reader.readLine());/**cчитали дату*/

        SimpleDateFormat format = new SimpleDateFormat("MMM d, yyyy", Locale.ENGLISH);
        String f = format.format(date);/**сделали образец и сконвертировали дату*/

        String fsmall = f.substring(0,3);
        String fbig = f.substring(3,f.length());/**разделили строки на подстроки*/

        fsmall = fsmall.toUpperCase();/**сделали месяц прописными буквами*/

        System.out.println(fsmall+fbig);/**сложили строки*/
    }
}
