package moviemodel;

import com.google.gson.annotations.SerializedName;
import com.udacity.otunba.popularmoviesapp.MovieModel;

import java.util.ArrayList;

/**
 * Created by Otunba on 7/16/2016.
 */
public class AllMovies {
    @SerializedName("results")
    ArrayList<MovieModel> movieList;

    public ArrayList<MovieModel> getMovieList() {
        return movieList;
    }

}
