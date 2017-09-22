package ca.ualberta.cs.lonelytwitter;

<<<<<<< HEAD
=======
import java.util.ArrayList;
>>>>>>> 2604d97e5a8f1e602daa5c0fd71379306bd04d93
import java.util.Date;

/**
 * Created by shang1 on 9/13/17.
 */

public abstract class Tweet implements Tweetable{
    private String message;
    private Date date;
<<<<<<< HEAD
=======
    private ArrayList<Mood> moodList = new ArrayList<Mood>(); /*set maximum of 5 idferent moods*/
>>>>>>> 2604d97e5a8f1e602daa5c0fd71379306bd04d93

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

<<<<<<< HEAD
    public void setDate(Date date) {this.date = date;}

    public abstract Boolean isImportant();

    @Override  //if parent has a method called Override we use this one instead
    public String toString(){
        return date.toString() + "|" + getMessage();
    }

}
=======
    public void addMood(Mood mood) { /*Tweet holds moods*/
        moodList.add(mood);
    }

    public ArrayList<Mood> getMoodList() { /*gets the list of moods in a tweet*/
        return moodList;
    }

    public abstract Boolean isImportant();
}
>>>>>>> 2604d97e5a8f1e602daa5c0fd71379306bd04d93
