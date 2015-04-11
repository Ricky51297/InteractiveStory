package ricardolopez.com.interactivestory.ui;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;

import ricardolopez.com.interactivestory.R;
import ricardolopez.com.interactivestory.model.Page;


public class StoryActivity extends ActionBarActivity {


    public static final String TAG = StoryActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        Intent intent = getIntent();
        String name = intent.getStringExtra(getString(R.string.key_name));

        if(name == null){
            name = "Friend";
        }
            Log.d(TAG, name);

    }

}
