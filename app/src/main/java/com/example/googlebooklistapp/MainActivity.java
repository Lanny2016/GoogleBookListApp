package com.example.googlebooklistapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.sql.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    // Initiating the textView object
    private TextView textView;
    // Initiating the listView object
    private ListView listView;
    // LOG_TAG for the MainActivity
    public static final String LOG_TAG = MainActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Display (View view){
        // creating an ArrayList
        ArrayList<String> bookList = new ArrayList<>();
        // adding Strings to the list
        bookList.add("book 1");
        bookList.add("book 2");
        bookList.add("book 3");
        bookList.add("book 4");
        bookList.add("book 5");
        // creating an ArrayAdapter to add the bookList strings
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,bookList);
        // type casting the listView
        listView = (ListView)findViewById(R.id.listView);
        // setting the arrayAdapter to the listView
        listView.setAdapter(arrayAdapter);
    }
}
