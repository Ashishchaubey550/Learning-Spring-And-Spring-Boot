package com.Ashish.sbeans;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component("sf")
public class SessionFinder {

    @Autowired
    private LocalDate id;

    public String FindSeason(){
        int month = id.getMonthValue();
        if (month>=3 && month<=6){
            return "Summer Session";
        }else if (month>=7 && month<=10){
        	return "Rainy Season";
        }else {
            return "Winter Season";
        }
    }

}
