package com.Ashish.sbean;

import org.springframework.stereotype.Component;
import java.time.LocalDate;

@Component("sf") // This is the bean name
public class SessionFinder {
    private final LocalDate ld;

    public SessionFinder(LocalDate ld) { // Constructor injection
        this.ld = ld;
    }

    public String findSeason() {
        int month = ld.getMonthValue();
        if (month >= 3 && month <= 6)
            return "Summer Season";
        else if (month >= 7 && month <= 10)
            return "Rainy Season";
        else
            return "Winter Season";
    }
}
