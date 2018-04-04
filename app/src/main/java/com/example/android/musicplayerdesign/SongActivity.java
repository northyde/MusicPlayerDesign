package com.example.android.musicplayerdesign;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Michaela on 30.03.2018.
 */

public class SongActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Fills the Song ArrayList with items
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Artist A", "Blue", "ABlue1"));
        songs.add(new Song("Artist A", "Blue", "ABlue2"));
        songs.add(new Song("Artist A", "Blue", "ABlue3"));
        songs.add(new Song("Artist A", "Blue", "ABlue4"));
        songs.add(new Song("Artist A", "Blue", "ABlue5"));
        songs.add(new Song("Artist A", "Yellow", "AYellow1"));
        songs.add(new Song("Artist A", "Yellow", "AYellow2"));
        songs.add(new Song("Artist A", "Yellow", "AYellow3"));
        songs.add(new Song("Artist A", "Yellow", "AYellow4"));
        songs.add(new Song("Artist A", "Yellow", "AYellow5"));
        songs.add(new Song("Artist A", "Red", "ARed1"));
        songs.add(new Song("Artist A", "Red", "ARed2"));
        songs.add(new Song("Artist A", "Red", "ARed3"));
        songs.add(new Song("Artist A", "Red", "ARed4"));
        songs.add(new Song("Artist A", "Red", "ARed5"));
        songs.add(new Song("Artist B", "Hot", "BHot1"));
        songs.add(new Song("Artist B", "Hot", "BHot2"));
        songs.add(new Song("Artist B", "Hot", "BHot3"));
        songs.add(new Song("Artist B", "Hot", "BHot4"));
        songs.add(new Song("Artist B", "Hot", "BHot5"));
        songs.add(new Song("Artist B", "Cold", "BCold1"));
        songs.add(new Song("Artist B", "Cold", "BCold2"));
        songs.add(new Song("Artist B", "Cold", "BCold3"));
        songs.add(new Song("Artist B", "Cold", "BCold4"));
        songs.add(new Song("Artist B", "Cold", "BCold5"));
        songs.add(new Song("Artist C", "Sun", "CSun1"));
        songs.add(new Song("Artist C", "Sun", "CSun2"));
        songs.add(new Song("Artist C", "Sun", "CSun3"));
        songs.add(new Song("Artist C", "Sun", "CSun4"));
        songs.add(new Song("Artist C", "Sun", "CSun5"));

        SongAdapter adapter = new SongAdapter(this, songs);

        final ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

        // Makes an item in a list clickable
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Song currentSong = (Song) listView.getItemAtPosition(position);
                Intent playerIntent = new Intent(SongActivity.this, PlayerActivity.class);

                // Passes information to the player
                playerIntent.putExtra("SongTitle", currentSong.getSongTitle());
                playerIntent.putExtra("AlbumTitle", currentSong.getAlbumTitle());
                playerIntent.putExtra("ArtistName", currentSong.getArtistName());
                startActivity(playerIntent);

            }
        });

    }
}