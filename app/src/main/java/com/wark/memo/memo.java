package com.wark.memo;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

public class memo extends AppCompatActivity {
    Button save;
    EditText editText;
    TextView textView;
    ListView listView;
    SharedPreferences prefs;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memo);


        prefs = PreferenceManager.getDefaultSharedPreferences(this);
        editText = (EditText) findViewById(R.id.editText);
        textView = (TextView) findViewById(R.id.intext);
        save = (Button) findViewById(R.id.enter);
        listView = (ListView) findViewById(R.id.listview);
        adapter = new Adapter();

        listView.setAdapter(adapter);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.addItem(this,editText.getText().toString());
            }
        });
    }
}