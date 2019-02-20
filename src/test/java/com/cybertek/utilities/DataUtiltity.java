package com.cybertek.utilities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataUtiltity {

    public static String todaysDate(){
        String today = new SimpleDateFormat("MMMM dd, yyyy").format(new Date());
        return today;
    }
}

//mmmm dd, yyyy   ---> Febraury 17, 2019
