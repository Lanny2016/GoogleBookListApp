package com.example.googlebooklistapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

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

        // Array for image
         int[] image = {R.drawable.sample_image};
        // Get the list of earthquakes from {@link QueryUtils}
        ArrayList<String> bookInfo = new ArrayList<>();
        bookInfo.add("Head First Android Development");
        bookInfo.add("DAVID GRIFFITHS and Dawn Griffiths");
        bookInfo.add("Click for book description");

        // creating an ArrayAdapter to add the bookList strings
        BookListAdapter adapter = new BookListAdapter(this,bookInfo);
        // type casting the listView
        listView = (ListView)findViewById(R.id.listView);
        // setting the arrayAdapter to the listView
        listView.setAdapter(adapter);
    }
}
