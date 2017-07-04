package com.example.rmanzini.mymusicplayer;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.rmanzini.mymusicplayer.databinding.ActivityDiscoverBinding;

public class DiscoverActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityDiscoverBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_discover);

        //Setting a new button handler for this activity
        MyButtonHandlers handler= new MyButtonHandlers();

        //Assign listerns to buttons
        handler.albumButtonHandler(binding.includedAlbums.albums);
        handler.artistsButtonHandler(binding.includedArtists.artists);
        handler.homeButtonHandler(binding.includedHome.home);
        handler.playlistsButtonHandler(binding.includedPlaylist.playlist);
    }

}
