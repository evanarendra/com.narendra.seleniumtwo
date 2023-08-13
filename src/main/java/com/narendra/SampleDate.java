package com.narendra;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SampleDate {
    public static void main(String[] args){

//        Date today = new Date();
//        System.out.println(today);

        String input = "13/08/2023 04:48:44 PM";
        DateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss aa");
        DateFormat outputDate = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = null;
        String output = null;

        try {
            date = formatDate.parse(input);
            output = outputDate.format(date);
            System.out.println(output);
        } catch (ParseException e){
            e.printStackTrace();
        }
    }
}
