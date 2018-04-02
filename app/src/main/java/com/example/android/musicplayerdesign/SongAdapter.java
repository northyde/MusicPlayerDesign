package com.example.android.musicplayerdesign;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Michaela on 30.03.2018.
 */

public class SongAdapter extends ArrayAdapter<Song> {

    //Constructor
    SongAdapter(Activity context, ArrayList<Song> songs) {
        super(context, 0, songs);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Finds views and assigns names
        TextView songTextView = (TextView) listItemView.findViewById(R.id.song);
        TextView albumTextView = (TextView) listItemView.findViewById(R.id.album);
        TextView artistTextView = (TextView) listItemView.findViewById(R.id.artist);

        // Get current (chosen) song
        Song currentSong = getItem(position);

        songTextView.setText(currentSong.getSongTitle());
        albumTextView.setText(currentSong.getAlbumTitle());
        artistTextView.setText(currentSong.getArtistName());

        return listItemView;
    }

}
