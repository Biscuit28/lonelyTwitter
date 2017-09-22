package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by shang1 on 9/13/17.
 */

public abstract class Tweet implements Tweetable{
    private String message;
    private Date date;

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

    public void setDate(Date date) {this.date = date;}

    public abstract Boolean isImportant();

    @Override  //if parent has a method called Override we use this one instead
    public String toString(){
        return date.toString() + "|" + getMessage();
    }

}