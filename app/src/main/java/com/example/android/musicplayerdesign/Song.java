package com.example.android.musicplayerdesign;

/**
 * Created by Michaela on 24.03.2018.
 */

public class Song {
    String mArtistName;
    String mAlbumTitle;
    String mSongTitle;

//Constructor
    public Song (String artist,String album,String song){
    mArtistName = artist;
    mAlbumTitle = album;
    mSongTitle = song;
}

// get methods
    public String getArtistName ()
    {return mArtistName;}

    public String getAlbumTitle ()
    {return mAlbumTitle;}

    public String getSongTitle ()
    {return mSongTitle;}

// set methods
    public void setArtistName (String artistName){
        mArtistName = artistName;}

        public void setAlbumTitle(String albumTitle){
        mAlbumTitle = albumTitle;}

        public void setSongTitle (String songTitle){
            mSongTitle = songTitle; }

}
