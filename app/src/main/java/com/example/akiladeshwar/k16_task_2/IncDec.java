package com.example.akiladeshwar.k16_task_2;

import android.app.Activity;
import android.os.Bundle;;
import android.os.Handler;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.akiladeshwar.k16task_2.R;


public class IncDec extends Activity {

    EditText state;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inc_dec_activity);
        state = (EditText) findViewById(R.id.statebox);
    }
    public void onButtonPress(View view){
        String displayMsg = "";
        String stateString = state.getText().toString();
        String finalString = "";
        if(stateString.isEmpty())
            return;
        int currentValue  = Integer.parseInt(stateString); // Gets the current value in the ediText
        switch(view.getId()) {
            case R.id.plusButton:
                displayMsg = "Incremented!";
                state.setText(finalString+(currentValue+1));
                break;
            case R.id.minusButton:
                displayMsg = "Decremented!";
                state.setText(finalString+(currentValue-1));
                break;
        }
        final Toast toast = Toast.makeText(getApplicationContext(),displayMsg, Toast.LENGTH_SHORT);
        toast.show();

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                toast.cancel();
            }
        }, 1000);
    }
}
