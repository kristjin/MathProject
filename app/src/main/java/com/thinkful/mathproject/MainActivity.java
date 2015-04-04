package com.thinkful.mathproject;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.util.Log;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int x = 10;
        int y = 7;
        int val;
        double quotient;

        val = myAdd(x, y);
        Log.i("Tagliatelli", "Sum = " + val);

        val = mySubtract(x, y);
        Log.i("Tagliatelli", "Difference = " + val);

        quotient = myDivide(x, y);
        Log.i("Tagliatelli", "Quotient = " + quotient);

        val = myMultiply(x, y);
        Log.i("Tagliatelli", "Product = " + val);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    public int myAdd(int number1, int number2) {

        int sum;
        sum = number1 + number2;

        return sum;
    }

    public int mySubtract(int number1, int number2) {

        int val;
        val = number1 - number2;

        return val;
    }

    public int myMultiply(int number1, int number2) {

        int val;
        val = number1 * number2;

        return val;
    }

    public double myDivide(int number1, int number2) {

        double val;
        val = (double) number1/number2;

        return val;
    }
}
