package com.example.android.miwok;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<String> words = new ArrayList<String>();
        words.add(0,"One");
        words.add(1,"Two");
        words.add(2,"Three");
        words.add(3,"Four");
        words.add(4,"Five");
        words.add(5,"Six");
        words.add(6,"Seven");
        words.add(7,"Eight");
        words.add(8,"Nine");
        words.add(9,"Ten");

        int count = 0;
        LinearLayout root = (LinearLayout) findViewById(R.id.rootView);

        for(int i = 0; i<10; i++) {
            TextView wordView = new TextView(this);
            wordView.setText(words.get(i));
            root.addView(wordView);
        }
    }
}
