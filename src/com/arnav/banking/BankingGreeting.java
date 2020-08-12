package com.arnav.banking;

import java.util.Date;

public class BankingGreeting
{
    public String greeting()
    {
        String greetingDayTime = null;

        Date dt = new Date();
        int hours = dt.getHours();

        if (0 <= hours && hours < 12)
        {
            greetingDayTime = "\nGood Morning";
        } else if (12 <= hours && hours < 4)
        {
            greetingDayTime = "\nGood Afternoon";
        } else if (4 <= hours && hours < 21)
        {
            greetingDayTime = "\nGood Evening";
        } else if (21 <= hours)
        {
            greetingDayTime = "\nGood Night";
        }

        return greetingDayTime;
    }
}
