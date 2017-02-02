package com.example.kimhochul.hochul;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Kimhochul on 2017-01-23.
 */

public class MainMenuActivity extends Activity implements View.OnClickListener{

    int[] button = {R.id.mainmenu1, R.id.mainmenu2, R.id.mainmenu3, R.id.mainmenu4};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu);

        for(int i : button) {
            findViewById(i).setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View view) {
        Intent intent = null;
        switch (view.getId()) {
            case R.id.mainmenu1:
                intent = new Intent(this, FirstMainMenu.class);
        }
        startActivity(intent);
    }
}
