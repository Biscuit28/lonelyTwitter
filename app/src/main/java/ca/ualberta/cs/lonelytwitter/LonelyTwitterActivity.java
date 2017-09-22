package ca.ualberta.cs.lonelytwitter;

/*can implement many but extend only one*/

<<<<<<< HEAD
import com.google.gson.Gson;

import java.io.FileInputStream;

/*can implement many but extend only one*/

		import java.io.BufferedReader;
		import java.io.FileInputStream;
		import java.io.FileNotFoundException;
		import java.io.FileOutputStream;
		import java.io.IOException;
		import java.io.InputStreamReader;

		import java.io.OutputStream;
		import java.io.OutputStreamWriter;
		import java.lang.reflect.Type;
		import java.util.ArrayList;
		import java.util.Date;

		import android.app.Activity;
		import android.content.Context;
		import android.os.Bundle;
		import android.util.Log;
		import android.view.View;
		import android.widget.ArrayAdapter;
		import android.widget.Button;
		import android.widget.EditText;
		import android.widget.ListView;

		import com.google.gson.Gson;
		import com.google.gson.reflect.TypeToken;
=======
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
>>>>>>> 2604d97e5a8f1e602daa5c0fd71379306bd04d93

public class LonelyTwitterActivity extends Activity {

	private static final String FILENAME = "file.sav";
	private EditText bodyText;
	private ListView oldTweetsList;

	private ArrayList<Tweet> tweets = new ArrayList<Tweet>();
	private ArrayAdapter<Tweet> adapter;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
        Log.d("", "HELLO HYMAN");
		bodyText = (EditText) findViewById(R.id.body);
		Button saveButton = (Button) findViewById(R.id.save);
		oldTweetsList = (ListView) findViewById(R.id.oldTweetsList);

		saveButton.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				setResult(RESULT_OK);
				String text = bodyText.getText().toString();
<<<<<<< HEAD

				tweets.add(new NormalTweet(text));
				adapter.notifyDataSetChanged();
				saveInFile();

=======
				saveInFile(text, new Date(System.currentTimeMillis()));

				Tweet tweet = new ImportantTweet("");
				Tweet tweet1 = new NormalTweet("hi");
				try {
					tweet.setMessage("Hello fam");
				} catch (TweetTooLongException e) {
					//e.printStackTrace();
				}
				Log.d("", String.format("The isImportant method on tweet returns %b", tweet.isImportant()));
				Log.d("", String.format("The isImportant method on tweet1 returns %b", tweet1.isImportant()));
				//finish();
                Tweetable tweet3 = new ImportantTweet("");
                ArrayList<Tweet> tweetList = new ArrayList<Tweet>();
                tweetList.add(tweet);
                tweetList.add(tweet1);
>>>>>>> 2604d97e5a8f1e602daa5c0fd71379306bd04d93

			}
		});
	}

	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		loadFromFile();
		adapter = new ArrayAdapter<Tweet>(this,
				R.layout.list_item, tweets);
		oldTweetsList.setAdapter(adapter);
	}

	private void loadFromFile() {

		try {
			FileInputStream fis = openFileInput(FILENAME);
			BufferedReader in = new BufferedReader(new InputStreamReader(fis));
			Gson gson = new Gson();
			Type listType = new TypeToken<ArrayList<NormalTweet>>() {}.getType();
			tweets = gson.fromJson(in, listType);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			tweets = new ArrayList<Tweet>();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
	}

	private void saveInFile() {
		try {
			FileOutputStream fos = openFileOutput(FILENAME,
					Context.MODE_PRIVATE);

			OutputStreamWriter writer = new OutputStreamWriter(fos);
			Gson gson = new Gson();
			gson.toJson(tweets, writer);
			writer.flush();

			fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException();
		}
	}

	public void clearFile(View view) {
		adapter.clear();
		saveInFile();
	}

}