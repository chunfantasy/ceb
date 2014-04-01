package com.ceb.service;

import java.text.SimpleDateFormat;
import java.util.*;

public class TimeService {
	public TimeService(){
		
	}

	public static String getTime() {
	    Calendar c= Calendar.getInstance();
	    Date d = c.getTime();
        String dateFormat = "yyyyMMdd";
        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
        return sdf.format(d);
    } 
}
