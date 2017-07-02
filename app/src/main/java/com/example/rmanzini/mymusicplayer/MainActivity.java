package com.example.rmanzini.mymusicplayer;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.rmanzini.mymusicplayer.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

            //ClickListener to View album
            binding.albums.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity.this, AlbumsActivity.class);
                    startActivity(intent);
                }
            });

            //ClickListener to View artists
            binding.artists.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity.this, ArtistsActivity.class);
                    startActivity(intent);
                }
            });

            //ClickListener to View discover
            binding.discover.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity.this, DiscoverActivity.class);
                    startActivity(intent);
                }
            });

            //ClickListener to View playlist
            binding.playlist.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity.this, PlaylistActivity.class);
                    startActivity(intent);
                }
            });
        }

    }
