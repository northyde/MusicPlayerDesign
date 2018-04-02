package com.example.android.musicplayerdesign;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Michaela on 30.03.2018.
 */

public class ArtistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.song_list);

        // Fills the Song ArrayList with items

        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Artist A", "3 Albums", "15 songs"));
        songs.add(new Song("Artist B", "2 Albums", "10 songs"));


        SongAdapter adapter = new SongAdapter(this, songs);

        final ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);


        //make an item in a list clickable

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Song currentSong = (Song) listView.getItemAtPosition(position);
                Intent playerIntent = new Intent(ArtistActivity.this, PlayerActivity.class);
                playerIntent.putExtra("SongTitle", currentSong.getSongTitle());
                playerIntent.putExtra("AlbumTitle", currentSong.getAlbumTitle());
                playerIntent.putExtra("ArtistName", currentSong.getArtistName());
                startActivity(playerIntent);
            }
        });
    }
}


