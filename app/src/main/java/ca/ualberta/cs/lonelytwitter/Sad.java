package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by shang on 9/14/2017.
 */

public class Sad extends Mood {

    private String sad = "I am sad";

    public Sad (Date date) {
        super(date);
        super.mood = sad;
    }

    public Sad (){
        super();
        super.mood = sad;
    }
}
