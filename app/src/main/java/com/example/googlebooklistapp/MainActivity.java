package com.example.googlebooklistapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // Initiating the textView object
    private TextView textView;
    // LOG_TAG for the MainActivity
    public static final String LOG_TAG = MainActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void Display (View view){
        // creating a String
        String book = "This is a book.";
        //Type casting for textView
        textView =(TextView)findViewById(R.id.textView_id);
        textView.setText(book);

    }
}
