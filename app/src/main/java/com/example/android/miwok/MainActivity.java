package com.example.android.miwok;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openNumbers(View view) {
        Intent myIntent = new Intent(MainActivity.this, NumbersActivity.class);
        MainActivity.this.startActivity(myIntent);
    }

    public void openFamilyMembers (View view) {
        Intent myIntent1 = new Intent(MainActivity.this, FamilyMembersActivity.class);
        MainActivity.this.startActivity(myIntent1);
    }

    public void openColors (View view) {
        Intent myIntent2 = new Intent(MainActivity.this, ColorsActivity.class);
        MainActivity.this.startActivity(myIntent2);
    }

    public void openPhrases (View view) {
        Intent myIntent3 = new Intent(MainActivity.this, PhrasesActivity.class);
        MainActivity.this.startActivity(myIntent3);
    }

}
