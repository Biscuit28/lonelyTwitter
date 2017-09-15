package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by shang on 9/14/2017.
 */

public class Happy extends Mood {

    private String happy = "I am happy";

    public Sad (Date date) {
        super(date);
        super.mood = happy;
    }

    public Sad (){
        super();
        super.mood = happy;
    }
}
