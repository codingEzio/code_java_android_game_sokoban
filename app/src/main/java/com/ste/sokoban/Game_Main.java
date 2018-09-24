package com.ste.sokoban;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Game_Main extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_main);
    }

    public void onClick(View view) {

        Intent intent = null;

        switch (view.getId()) {
            case R.id.btnExit:
                isFinish();
                break;
        }
    }

    public void isFinish() {
        AlertDialog.Builder alrDiag = new AlertDialog.Builder(this);

        alrDiag.setTitle("Wait!");
        alrDiag.setMessage("Do u REALLY wanna quit?");

        alrDiag.setPositiveButton("Yep!", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Game_Main.this.finish();
            }
        });

        alrDiag.setNeutralButton("Nooo..", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // pass
            }
        });

        alrDiag.create();
        alrDiag.show();
    }
}
