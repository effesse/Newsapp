package com.example.android.newsapp;


import java.net.URL;
import java.util.Date;

/**
 * An {@link LastNews} object contains information related to a single news.
 */
public class LastNews {

    /** Section of the news */
    private String mSection;

    /** Title of the news */
    private String mTitle;

    /** Author of the news */
    private String mByLine;

    /** Date and time of the news */
    private String mPublicationDate;

    /** Website URL of the news */
    private String mUrlNews;


    /**
     * Constructs a new {@link LastNews} object.
     *
     * @param section is the section of the news
     * @param title is the title of the news
     * @param byLine is the author of the news
     * @param publicationDate is when the news was published
     * @param urlNews is th url of the news
     */
    public LastNews(String section, String title, String byLine, String publicationDate, String urlNews) {
        mSection = section;
        mTitle = title;
        mByLine = byLine;
        mPublicationDate = publicationDate;
        mUrlNews = urlNews;
    }


    /**
     * Returns the section of the news.
     */

    public String getSection() {
        return mSection;
    }

    /**
     * Returns the title of the news.
     */

    public String getTitle() {
        return mTitle;
    }

    /**
     * Returns the author of the news.
     */

    public String getByLine() {
        return mByLine;
    }

    /**
     * Returns the date and time of the news.
     */

    public String getPublicationDate() {
        return mPublicationDate;
    }

    /**
     * Returns the website URL to find more information about the news.
     */
    public String getUrl() {
        return mUrlNews;
    }

}
