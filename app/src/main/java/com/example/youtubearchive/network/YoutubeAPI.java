package com.example.youtubearchive.network;

import com.example.youtubearchive.models.ModelChannel;
import com.example.youtubearchive.models.ModelHome;
import com.example.youtubearchive.models.ModelPlaylist;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Url;

public class YoutubeAPI {

    public static final String BASE_URL = "https://www.googleapis.com/youtube/v3/";
    public static final String CHANNEL_ID = "UCmh5gdwCx6lN7gEC20leNVA";//enter the channel id here
    public static final String KEY = "key=AIzaSyA4o2yCPPqPBnQ8FpadFLnJOhGtyLk5mBE";
    public static final String sch = "search?";
    public static final String chid = "&channelId=" + CHANNEL_ID;
    public static final String mx = "&maxResults=10";
    public static final String ord = "&order=viewCount";
    public static final String part = "&part=snippet";
    public static final String NPT = "&pageToken=";
    public static final String forUsername = "&forUsername=";
    public static final String ply = "playlists?";
    public static final String part_ply = "&part=snippet,contentDetails";

    public static final String query = "&q=";
    public static final String type = "&type=video";

    public static final String CH = "channels?";
    public static final String IDC = "&id=" + CHANNEL_ID;
    public static final String CH_PART = "&part=snippet,statistics,brandingSettings";


    public interface Video {
        @GET
        Call<ModelHome> getHomeVideo(@Url String url);

        @GET
        Call<ModelPlaylist> getPlaylist(@Url String url);

        @GET
        Call <ModelChannel> getChannel(@Url String url);

        @GET
        Call<List<ModelChannel>> getChannels(@Url String url);
    }

    private static Video video = null;

    public static Video getVideo(){
        if (video == null){
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            video = retrofit.create(Video.class);
        }
        return video;
    }

}
