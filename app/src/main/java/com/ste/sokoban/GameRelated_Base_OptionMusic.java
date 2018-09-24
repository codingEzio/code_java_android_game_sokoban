package com.ste.sokoban;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.preference.PreferenceManager;

public class GameRelated_Base_OptionMusic extends PreferenceActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addPreferencesFromResource(R.xml.music_setting);
    }

    public static boolean isMusicChecked(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("Music", true);
    }
}