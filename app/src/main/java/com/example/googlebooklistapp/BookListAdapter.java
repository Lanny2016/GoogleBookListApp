package com.example.googlebooklistapp;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

/**
 * An {@link BookListAdapter} knows how to create a list item layout for each book
 * in the data source (a list of {@link BookListObject} objects).
 *
 * These list item layouts will be provided to an adapter view like ListView
 * to be displayed to the user.
 */
public class BookListAdapter extends ArrayAdapter<String> {
    /**
     * Constructs a new {@link BookListAdapter}.
     *
     * @param context of the app
     * @param bookInfo is the list of books, which is the data source of the adapter
     */


    public BookListAdapter(@NonNull Context context, List<String> bookInfo) {
        super(context, 0, bookInfo);
    }
    /**
     * This method returns a list item view that displays information about the book at the given position
     * in the list of books.
     */
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
       View listItemView = convertView;
       if(listItemView == null){
          listItemView = LayoutInflater.from(getContext()).inflate(R.layout.custom_list,parent,false);
       }
       BookListObject currentBookInfo = new BookListObject("Image","Head First Android Development","DAVID GRIFFITHS and Dawn Griffiths",
               "Click for book description");
        // ImageView to find image
        ImageView thumbNail = (ImageView)listItemView.findViewById(R.id.bookImage_id);
        thumbNail.getResources().getDrawable(R.drawable.sample_image);
        // TextView to find book title
        TextView title = (TextView)listItemView.findViewById(R.id.titleFromSource);
        title.setText(currentBookInfo.getmTitle());
        // TextView to find book author
        TextView author = (TextView)listItemView.findViewById(R.id.authorNameFromSource);
        author.setText(currentBookInfo.getmAuthor());
        // TextView to find book description
        TextView description = (TextView)listItemView.findViewById(R.id.bookDescriptionFromSource);
        description.setText(currentBookInfo.getmDescription());

      return listItemView;
    }
}
