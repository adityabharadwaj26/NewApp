package com.newapp.www.newapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class Calculator extends Activity {
    ArrayList<Float> mathVariables = new ArrayList<Float>();
    float mathVariable1;
    float mathVariable2;
    final static int ADD = 1;
    final static int SUBTRACT = 2;
    final static int MULTIPLY = 3;
    final static int DIVISION = 4;
    final static int EQUALS = 5;
    int currentOperation = 0;
    int nextOperation;

    final static int CLEAR = 1;
    final static int DONT_CLEAR = 0;
    int clearCalcDisplay = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
    }
    public void press1(View View){
        TextView TextView = (TextView) findViewById(R.id.display);
        if (clearCalcDisplay == CLEAR) {
            TextView.setText("");
        }
        clearCalcDisplay = DONT_CLEAR;
        TextView.append("1");
    }public void press2(View View){
        TextView TextView = (TextView) findViewById(R.id.display);
        if (clearCalcDisplay == CLEAR) {
            TextView.setText("");
        }
        clearCalcDisplay = DONT_CLEAR;
        TextView.append("2");
    }public void press3(View View){
        TextView TextView = (TextView) findViewById(R.id.display);
        if (clearCalcDisplay == CLEAR) {
            TextView.setText("");
        }
        clearCalcDisplay = DONT_CLEAR;
        TextView.append("3");
    }public void press4(View View){
        TextView TextView = (TextView) findViewById(R.id.display);
        if (clearCalcDisplay == CLEAR) {
            TextView.setText("");
        }
        clearCalcDisplay = DONT_CLEAR;
        TextView.append("4");
    }public void press5(View View){
        TextView TextView = (TextView) findViewById(R.id.display);
        if (clearCalcDisplay == CLEAR) {
            TextView.setText("");
        }
        clearCalcDisplay = DONT_CLEAR;
        TextView.append("5");
    }public void press6(View View){
        TextView TextView = (TextView) findViewById(R.id.display);
        if (clearCalcDisplay == CLEAR) {
            TextView.setText("");
        }clearCalcDisplay = DONT_CLEAR;
        TextView.append("6");
    }public void press7(View View){
        TextView TextView = (TextView) findViewById(R.id.display);
        if (clearCalcDisplay == CLEAR) {
            TextView.setText("");
        }
        clearCalcDisplay = DONT_CLEAR;
        TextView.append("7");
    }public void press8(View View){
        TextView TextView = (TextView) findViewById(R.id.display);
        if (clearCalcDisplay == CLEAR) {
            TextView.setText("");
        }
        clearCalcDisplay = DONT_CLEAR;
        TextView.append("8");
    }public void press9(View View){
        TextView TextView = (TextView) findViewById(R.id.display);
        if (clearCalcDisplay == CLEAR) {
            TextView.setText("");
        }
        clearCalcDisplay = DONT_CLEAR;
        TextView.append("9");
    }public void press0(View View){
        TextView TextView = (TextView) findViewById(R.id.display);
        if (clearCalcDisplay == CLEAR) {
            TextView.setText("");
        }
        clearCalcDisplay = DONT_CLEAR;
        TextView.append("0");
    }public void pressBack(View View){
        TextView TextView = (TextView) findViewById(R.id.display);
        if (clearCalcDisplay == CLEAR) {
            TextView.setText("");
        }
        clearCalcDisplay = DONT_CLEAR;
        String str=TextView.getText().toString();
        if (str.length() >1 ) {
            str = str.substring(0, str.length() - 1);
            TextView.setText(str);
        }
        else if (str.length() <=1 ) {
            TextView.setText("");
        }
    }
    public void pressAdd(View View){
        calcLogic(ADD);
    }
    public void pressSubtract(View View){
        calcLogic(SUBTRACT);
    }
    public void pressDivide(View View){
        calcLogic(DIVISION);
    }
    public void pressMultiply(View View){
        calcLogic(MULTIPLY);
    }
    public void pressDecimal(View View){
        TextView TextView = (TextView) findViewById(R.id.display);
        TextView.append(".");
    }
    public void pressEqual(View View){
        calcLogic(EQUALS);
     }
    private void calcLogic(int operator) {
        TextView display = (TextView) findViewById(R.id.display);
        mathVariables.add(Float.parseFloat(display.getText().toString()));

        if (operator != EQUALS) {
            nextOperation = operator;
        } else if (operator == EQUALS) {
            Toast.makeText(this, "Equals", Toast.LENGTH_SHORT).show();
            nextOperation = 0;
        }

        switch (currentOperation) {
            case ADD:
                mathVariable1 = mathVariables.get(0);
                mathVariable2 = mathVariables.get(1);

                mathVariables.removeAll(mathVariables);

                mathVariables.add(mathVariable1 + mathVariable2);

                display.setText(String.format("%.3f", mathVariables.get(0)));
                break;
            case SUBTRACT:
                mathVariable1 = mathVariables.get(0);
                mathVariable2 = mathVariables.get(1);

                mathVariables.removeAll(mathVariables);

                mathVariables.add(mathVariable1 - mathVariable2);

                display.setText(String.format("%.3f", mathVariables.get(0)));
                break;
            case MULTIPLY:
                mathVariable1 = mathVariables.get(0);
                mathVariable2 = mathVariables.get(1);

                mathVariables.removeAll(mathVariables);

                mathVariables.add(mathVariable1 * mathVariable2);

                display.setText(String.format("%.3f", mathVariables.get(0)));
                break;
            case DIVISION:
                mathVariable1 = mathVariables.get(0);
                mathVariable2 = mathVariables.get(1);

                mathVariables.removeAll(mathVariables);

                mathVariables.add(mathVariable1 / mathVariable2);

                display.setText(String.format("%.3f", mathVariables.get(0)));
                break;
        }
        clearCalcDisplay = CLEAR;
        currentOperation = nextOperation;
        if (operator == EQUALS) {
            mathVariable1 = 0;
            mathVariable2 = 0;
            mathVariables.removeAll(mathVariables);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_calculator, menu);
        return true;
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
}
