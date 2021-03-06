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
            case R.id.btnAbout:
                intent = new Intent(Game_Main.this, GameRelated_Func_About.class);
                startActivity(intent);
                break;
            case R.id.btnNew:
                intent = new Intent(Game_Main.this, GameRelated_Func_NewGame.class);
                intent.putExtra("continue", "no");
                startActivity(intent);
                break;
            case R.id.btnContinue:
                intent = new Intent(this, GameRelated_Func_NewGame.class);
                intent.putExtra("continue", "yes");
                startActivity(intent);
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
