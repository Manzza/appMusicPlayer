package com.example.rmanzini.mymusicplayer;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;


/**
 * Created by rmanzini on 04/07/2017.
 */

public class MyButtonHandlers {
        //Receive a button and set a ClickListener to start AlbumActivity
        public void  albumButtonHandler(Button button) {
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Context context = view.getContext();
                    Intent intent = new Intent(context, AlbumsActivity.class);
                    context.startActivity(intent);
                }
            });
        }
        //Receive a button and set a ClickListener to start ArtistActivity
        public void  artistsButtonHandler(Button button) {
            //Receive a button and set a ClickListener to start another activity
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Context context = view.getContext();
                    Intent intent = new Intent(context, ArtistsActivity.class);
                    context.startActivity(intent);
                }
            });
        }
        //Receive a button and set a ClickListener to start DiscoverActivity
        public void  discoverButtonHandler(Button button) {
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Context context = view.getContext();
                    Intent intent = new Intent(context,DiscoverActivity.class);
                    context.startActivity(intent);
                }
            });
        }
        //Receive a button and set a ClickListener to start PlaylistsActivity
        public void  playlistsButtonHandler(Button button) {
            //ClickListener to View album
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Context context = view.getContext();
                    Intent intent = new Intent(context, PlaylistActivity.class);
                    context.startActivity(intent);
                }
            });
        }
        //Receive a button and set a ClickListener to start MainActivity
        public void  homeButtonHandler(Button button) {
            //ClickListener to View album
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Context context = view.getContext();
                    Intent intent = new Intent(context, MainActivity.class);
                    context.startActivity(intent);
                }
            });
        }

}
