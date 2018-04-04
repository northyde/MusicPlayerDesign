package com.example.android.musicplayerdesign;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Michaela on 30.03.2018.
 */

public class PlayerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.player);
        Intent incoming = getIntent();

        //Finds buttons and assigns names
        Button songsButton = (Button) findViewById(R.id.songsButton);
        Button albumsButton = (Button) findViewById(R.id.albumsButton);
        Button artistsButton = (Button) findViewById(R.id.artistsButton);

        //Starts intents when buttons are clicked
        songsButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent songsIntent = new Intent(PlayerActivity.this, SongActivity.class);
                startActivity(songsIntent);
            }
        });
        albumsButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent albumsIntent = new Intent(PlayerActivity.this, AlbumActivity.class);
                startActivity(albumsIntent);
            }
        });
        artistsButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent artistsIntent = new Intent(PlayerActivity.this, ArtistActivity.class);
                startActivity(artistsIntent);
            }
        });

        if (incoming == null) return;

        // Finds views and assigns names
        TextView songTextView = findViewById(R.id.songTextView);
        TextView albumTextView = findViewById(R.id.albumTextView);
        TextView artistTextView = findViewById(R.id.artistTextView);

        // Gets information about the chosen song
        songTextView.setText(incoming.getStringExtra("SongTitle"));
        albumTextView.setText(incoming.getStringExtra("AlbumTitle"));
        artistTextView.setText(incoming.getStringExtra("ArtistName"));

    }
}