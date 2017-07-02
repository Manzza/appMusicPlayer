package com.example.rmanzini.mymusicplayer;

import android.content.Context;
import android.content.Intent;
import android.view.View;

/**
 * Created by rmanzini on 02/07/2017.
 */

public class MainActivityPresenter {

    public void onColorsClick(View view) {
        Context context = view.getContext();
        Intent i = new Intent(context, ColorsActivity.class);
        context.startActivity(i);

    }
    public void onFamilyClick(View view) {
        Context context = view.getContext();
        Intent i = new Intent(context, FamilyActivity.class);
        context.startActivity(i);

    }
    public void onNumbersClick(View view) {
        Context context = view.getContext();
        Intent i = new Intent(context, NumbersActivity.class);
        context.startActivity(i);

    }
    public void onPhrasesClick(View view) {
        Context context = view.getContext();
        Intent i = new Intent(context, PhrasesActivity.class);
        context.startActivity(i);

    }

}
