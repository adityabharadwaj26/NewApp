package com.newapp.www.newapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class DisplayMessageActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Get Message from Intent
        Intent intent = getIntent();
        setContentView(R.layout.activity_display_message);
        //String message = intent.getStringExtra(MyActivity.EXTRA_MESSAGE);
        //Create The Text View
        //TextView textView = new TextView(R.id.hello_world);
        //textView.setTextSize(40);
        //textView.setText(message);
        // Set the TextView as the Activity Layout
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void onOpt1(View View){
        Intent intent1;
        intent1 = new Intent(this,Calculator.class);
        startActivity(intent1);
    }
    public void onOpt2(View View){
        //Toast.makeText(this, "on Opt2", Toast.LENGTH_SHORT).show();
        Intent intent2 = new Intent(Intent.ACTION_SEND);
        intent2.setType("message/*");
        startActivity(intent2);
        //startActivity(intent2);
    }
    public void onOpt3(View View){
        //Toast.makeText(this, "on Opt3", Toast.LENGTH_SHORT).show();
        Intent intent2 = new Intent(Intent.ACTION_GET_CONTENT);
        intent2.setType("image/*");
        startActivity(intent2);
    }
    public void onOpt4(View View){
        //Toast.makeText(this, "on Opt4", Toast.LENGTH_SHORT).show();
        Intent intent2 = new Intent(Intent.ACTION_GET_CONTENT);
        intent2.setType("file/*");
        startActivity(intent2);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    public void onPause(){
        super.onPause();
        //Toast.makeText(this, "on Pause act2", Toast.LENGTH_SHORT).show();
    }
    public void onStop(){
        super.onStop();
        //Toast.makeText(this, "on Stop act2", Toast.LENGTH_SHORT).show();
    }
    public void onStart(){
        super.onStart();
        //Toast.makeText(this, "on Start act2", Toast.LENGTH_SHORT).show();
    }
    public void onRestart(){
        super.onRestart();
        //Toast.makeText(this, "on ReStart act2", Toast.LENGTH_SHORT).show();
    }
}
