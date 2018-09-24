package com.ste.sokoban;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class GameRelated_Func_NewGame extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_related_func_new_game);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflatr = new MenuInflater(this);
        inflatr.inflate(R.menu.option_menu, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.itemHelp:
                Intent intentHelp = new Intent(
                        GameRelated_Func_NewGame.this,
                        GameRelated_Base_OptionHelp.class
                );

                startActivity(intentHelp);
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
