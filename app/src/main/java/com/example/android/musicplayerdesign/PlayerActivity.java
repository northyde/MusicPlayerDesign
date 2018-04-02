package com.example.android.musicplayerdesign;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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
