package com.ste.sokoban;

import android.app.Activity;
import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;

public class GameRelated_Base_OptionMusic_Handle {
    private static MediaPlayer mediaplr = null;

    public static void play(Context context, int resource) {
        stop(context);

        if (GameRelated_Base_OptionMusic.isMusicChecked(context)) {
            mediaplr = MediaPlayer.create(context, resource);

            mediaplr.setLooping(true);
            mediaplr.start();
        }
    }

    public static void stop(Context context) {
        if (mediaplr != null) {
            mediaplr.stop();
            mediaplr.release();

            mediaplr = null;
        }
    }
}
