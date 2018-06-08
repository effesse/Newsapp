package com.example.android.newsapp;

import android.content.AsyncTaskLoader;
import android.content.Context;

import android.content.Context;

import java.util.List;

    /**
     * Loads a list of news by using an AsyncTask to perform the
     * network request to the given URL.
     */
    public class NewsLoader extends AsyncTaskLoader<List<News>> {

        /** Tag for log messages */
        private static final String LOG_TAG = NewsLoader.class.getName();

        /** Query URL */
        private String mUrlNews;

        /**
         * Constructs a new {@link NewsLoader}.
         *
         * @param context of the activity
         * @param urlNews to load data from
         */
        public NewsLoader(Context context, String urlNews) {
            super(context);
            mUrlNews = urlNews;
        }

        @Override
        protected void onStartLoading() {
            forceLoad();
        }

        /**
         * This is on a background thread.
         */
        @Override
        public List<News> loadInBackground() {
            if (mUrlNews == null) {
                return null;
            }

            // Perform the network request, parse the response, and extract a list of earthquakes.
            List<News> news = QueryUtils.fetchNewsData(mUrlNews);
            return news;
        }
    }

