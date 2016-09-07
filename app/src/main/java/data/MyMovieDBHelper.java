package data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Otunba on 7/16/2016.
 */
public class MyMovieDBHelper extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;
    static final String DATABASE_NAME = MovieContract.DB_NAME;
    public MyMovieDBHelper(Context context) {
        super(context, DATABASE_NAME, null , DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        //String query to create table **movie**
        final String SQL_CREATE_MOVIE_TABLE ="CREATE TABLE "+MovieContract.MovieEntry.TABLE_NAME+ " ("+
                MovieContract.MovieEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                MovieContract.MovieEntry.COLUMN_MOVIE_ID +" INTEGER NOT NULL, " +
                MovieContract.MovieEntry.COLUMN_TITLE +" TEXT NOT NULL, " +
                MovieContract.MovieEntry.COLUMN_POSTER +" TEXT, " +
                MovieContract.MovieEntry.COLUMN_BACKDROP +" TEXT, " +
                MovieContract.MovieEntry.COLUMN_OVERVIEW +" TEXT, " +
                MovieContract.MovieEntry.COLUMN_RATING +" INTEGER, " +
                MovieContract.MovieEntry.COLUMN_DATE +" TEXT);" ;

        db.execSQL(SQL_CREATE_MOVIE_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " +MovieContract.MovieEntry.TABLE_NAME);
        onCreate(db);
    }
}
