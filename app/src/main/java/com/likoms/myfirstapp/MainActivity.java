package com.likoms.myfirstapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static com.likoms.myfirstapp.R.color.red;


public class MainActivity extends ActionBarActivity {
    private TextView textView = (TextView) findViewById(R.id.textView);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        changeTextView("Hello my friend");

    }

    private void changeTextView(String s) {
       textView.setText(s);
    }


    public void doSomething(View view) {
        EditText editText = (EditText) findViewById(R.id.editText);
        String input = editText.getText().toString();
        textView.setText("Hello" + input);
        textView.setTextColor(getResources().getColor(R.color.red));
    }
}
