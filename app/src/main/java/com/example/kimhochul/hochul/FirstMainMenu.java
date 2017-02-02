package com.example.kimhochul.hochul;

import android.app.Activity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

/**
 * Created by Kimhochul on 2017-02-02.
 */

public class FirstMainMenu extends Activity {

    int tabNum = 8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_main_menu);

        TabHost tabHost = (TabHost)findViewById(android.R.id.tabhost);
        tabHost.setup();

        TabSpec spec1 = tabHost.newTabSpec("Tab1").setContent(R.id.tab1).setIndicator("1");
        tabHost.addTab(spec1);
        TabSpec spec2 = tabHost.newTabSpec("Tab2").setContent(R.id.tab2).setIndicator("2");
        tabHost.addTab(spec2);
        TabSpec spec3 = tabHost.newTabSpec("Tab3").setContent(R.id.tab3).setIndicator("3");
        tabHost.addTab(spec3);
        TabSpec spec4 = tabHost.newTabSpec("Tab4").setContent(R.id.tab4).setIndicator("4");
        tabHost.addTab(spec4);
        TabSpec spec5 = tabHost.newTabSpec("Tab5").setContent(R.id.tab5).setIndicator("5");
        tabHost.addTab(spec5);
        TabSpec spec6 = tabHost.newTabSpec("Tab6").setContent(R.id.tab6).setIndicator("6");
        tabHost.addTab(spec6);
        TabSpec spec7 = tabHost.newTabSpec("Tab7").setContent(R.id.tab7).setIndicator("7");
        tabHost.addTab(spec7);
        TabSpec spec8 = tabHost.newTabSpec("Tab8").setContent(R.id.tab8).setIndicator("최종");
        tabHost.addTab(spec8);

        for(int i = 0; i < tabNum; ++i) {
            tabHost.getTabWidget().getChildAt(i).getLayoutParams().height = 80;
        }

        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);

        RelativeLayout rl1 = (RelativeLayout)tabHost.getTabWidget().getChildAt(0);
    }
}
