package com.example.rmanzini.mymusicplayer;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.rmanzini.mymusicplayer.databinding.ActivityMainBinding;
import com.example.rmanzini.mymusicplayer.databinding.ActivityPlaylistsBinding;

public class PlaylistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityPlaylistsBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_playlists);
        MyButtonHandlers handler= new MyButtonHandlers();
        handler.albumButtonHandler(binding.includedAlbums.albums);
        handler.artistsButtonHandler(binding.includedArtists.artists);
        handler.discoverButtonHandler(binding.includedDiscover.discover);
        handler.homeButtonHandler(binding.includedHome.home);
    }

}
