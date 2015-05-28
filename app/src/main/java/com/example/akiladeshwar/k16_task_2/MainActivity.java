package com.example.akiladeshwar.k16_task_2;

/**
 * Created by akiladeshwar on 28-05-2015.
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.example.akiladeshwar.k16task_2.R;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
    }
    public void onIncClick(View x) {
        startActivity(new Intent(this, IncDec.class));
    }
    public void onListClick(View y){
        startActivity(new Intent(this, ListViewActivity.class));
    }
}
