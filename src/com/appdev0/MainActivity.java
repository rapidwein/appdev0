package com.appdev0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.os.Build;
import android.content.Intent;

public class MainActivity extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            return rootView;
        }
    }
    	public void jumble_text(View view){
    		//Intent callDisplay = new Intent(this,JumbleMessageActivity.class);
    		TextView text = (TextView) findViewById(R.id.edit_message);
    		//String jText = text.getText().toString();
    		String jText = "Hello World!";
    		//String jText = jumbleMessage.getStringExtra(MainActivity.EXTRA_MESSAGE);
    		ArrayList<Character> chars = new ArrayList<Character>(jText.length());
    		for ( char c : jText.toCharArray() ) {
    		   chars.add(c);
    		}
    		Collections.shuffle(chars);
    		char[] shuffled = new char[chars.size()];
    		for ( int i = 0; i < shuffled.length; i++ ) {
    		   shuffled[i] = chars.get(i);
    		}
    		String jumbled = Arrays.toString(shuffled);
    		jumbled = jumbled.substring(1, jumbled.length()-1).replaceAll(",", "");
    		text.setText(jumbled);

    		

    		//callDisplay.putExtra(EXTRA_MESSAGE,jText);
    		//startActivity(callDisplay);
    	}

}
	
