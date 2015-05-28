package com.example.akiladeshwar.k16_task_2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.akiladeshwar.k16task_2.R;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by akiladeshwar on 28-05-2015.
 */
public class ListViewActivity extends Activity {

    ListView listView;
    String names []  = new String[]{"Charles Babbage", "Tim Berners-Lee" , "Vint Cerf", "Edsger Dijkstra" , "Kurt Godel" , "Donald Knuth" , "Alan Turing" ,"John von Neumann" , "Maurice Karnaugh"};
    ArrayAdapter<String> listData;
    ArrayList<String> listString;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view_activity);
        listView = (ListView) findViewById(R.id.listView);
        listString = new ArrayList<String>();
        for(int i=0;i<names.length;i++)
            listString.add(names[i]);
        Collections.sort(listString);
        listData = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,listString);
        listView.setAdapter(listData);
    };


}
