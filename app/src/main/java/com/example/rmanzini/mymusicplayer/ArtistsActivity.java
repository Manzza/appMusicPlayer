package com.example.rmanzini.mymusicplayer;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.rmanzini.mymusicplayer.databinding.ActivityArtistsBinding;
import com.example.rmanzini.mymusicplayer.databinding.ActivityDiscoverBinding;
import com.example.rmanzini.mymusicplayer.databinding.ActivityMainBinding;

public class ArtistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityArtistsBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_artists);

        //Setting a new button handler for this activity
        MyButtonHandlers handler= new MyButtonHandlers();

        //Assign listerns to buttons
        handler.albumButtonHandler(binding.includedAlbums.albums);
        handler.homeButtonHandler(binding.includedHome.home);
        handler.discoverButtonHandler(binding.includedDiscover.discover);
        handler.playlistsButtonHandler(binding.includedPlaylist.playlist);
    }

}
