package com.example.googlebooklistapp;

/**
 * An {@link BookListObject} object contains information related to a single bookList.
 */
public class BookListObject {
    /** Image of the book from source */
    private String mThumbNail;
    /** Title of the book from source */
    private String mTitle;
    /** Author of the book from source */
    private String mAuthor;
    /** Description of the book from source */
    private String mDescription;

    /**
     * This Constructor for a new {@link BookListObject} object.
     *
     * @param mThumbNail is the image from source api
     * @param mTitle is the title of the book from source api
     * @param mAuthor is the author name from source api
     * @param mDescription is the description of the book from source api
     */
    public BookListObject(String mThumbNail, String mTitle, String mAuthor, String mDescription) {
        this.mThumbNail = mThumbNail;
        this.mTitle = mTitle;
        this.mAuthor = mAuthor;
        this.mDescription = mDescription;
    }
     /** this getter method returns image of the book*/
    public String getmThumbNail() {
        return mThumbNail;
    }
    /** this getter method returns title of the book */
    public String getmTitle() {
        return mTitle;
    }
    /** this getter method returns author name of the book */
    public String getmAuthor() {
        return mAuthor;
    }
    /** this getter method returns description about the book */
    public String getmDescription() {
        return mDescription;
    }
}
