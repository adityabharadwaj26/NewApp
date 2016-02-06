package com.newapp.www.newapp;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static java.util.regex.Pattern.matches;


public class MyActivity extends Activity {
    public final static String EXTRA_MESSAGE = "com.mycompany.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
    }
    /** Called when the user clicks the Send button */
    public void sendMessage(View view) {
        TextView textView = (TextView) findViewById(R.id.No_text);
        TextView textView1 = (TextView) findViewById(R.id.No_Pass);
        textView.setVisibility(View.GONE);
        textView1.setVisibility(View.GONE);
        // Do something in response to button
        Intent intent = new Intent(this,DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        EditText editText1 = (EditText) findViewById(R.id.password);
        String password = editText1.getText().toString();
        if (message.matches("")) {
            textView.setVisibility(View.VISIBLE);
            return;
        }
        if (password.matches("")){
            textView1.setVisibility(View.VISIBLE);
            return;
        }
        if (message.matches("aditya") && password.matches("1234") ||
           message.matches("vikas") && password.matches("1234")) {
            //intent.putExtra(EXTRA_MESSAGE, message);
            startActivity(intent);
        }
            else {
                Toast.makeText(this, "Wrong Username or Password", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_activity_actions, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        // Handle presses on the action bar items
        switch (item.getItemId()) {
            case R.id.action_search:
                openSearch();
                return true;
            case R.id.action_settings:
                openSettings();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void openSettings() {
        Toast.makeText(this, "Settings button pressed", Toast.LENGTH_SHORT).show();
    }

    private void openSearch() {
        Toast.makeText(this, "Search button pressed", Toast.LENGTH_SHORT).show();
    }
    public void onPause(){
        super.onPause();
        //Toast.makeText(this, "on Pause act1", Toast.LENGTH_SHORT).show();
    }
    public void onStop(){
        super.onStop();
        //Toast.makeText(this, "on Stop act1", Toast.LENGTH_SHORT).show();
    }
    public void onStart(){
        super.onStart();
        //Toast.makeText(this, "on Start act1", Toast.LENGTH_SHORT).show();
    }
    public void onRestart(){
        super.onRestart();
        //Toast.makeText(this, "on ReStart act1", Toast.LENGTH_SHORT).show();
    }
}
