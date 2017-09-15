package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by shang1 on 9/13/17.
 */

public abstract class Tweet implements Tweetable{
    private String message;
    private Date date;
    private ArrayList<Mood> moodList = new ArrayList<Mood>(); /*set maximum of 5 idferent moods*/

    public Tweet(String message){
        date = new Date();
        this.message = message;
    }

    public Tweet(String message, Date date){
        this.date = date;
        this.message=message;
    }

    public String getMessage(){
        return message;
    }

    public void setMessage(String message) throws TweetTooLongException{
        if (message.length() < 140) {
            this.message = message;
        }else{
            throw new TweetTooLongException();
        }
    }

    public Date getDate(){
        return date;
    }

    public void addMood(Mood mood) { /*Tweet holds moods*/
        moodList.add(mood);
    }

    public ArrayList<Mood> getMoodList() { /*gets the list of moods in a tweet*/
        return moodList;
    }

    public abstract Boolean isImportant();
}
