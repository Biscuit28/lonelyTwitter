package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by shang on 9/14/2017.
 */

public abstract class Mood{ /*this is the super class*/

    protected String mood;
    private Date date;

    public Mood () { /*constructor that takes date as default*/
        this.date = new Date();
    }

    public Mood (Date myDate) { /*constructor where you can add date*/
        this.date = myDate;
    }

    public String getMood() { /*returns given mood*/
        //System.out.println(mood);
        return mood;
    }

    public Date getDate() { /*returns the date*/
        //System.out.println(date);
        return date;
    }

    public void setDate(Date date){ /*setter for date*/
        this.date = date;
    }

}
