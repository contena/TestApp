package com.example.contena.testapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bt = (Button)findViewById(R.id.button);
        textView = (TextView) findViewById(R.id.text);
        bt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                EditText et1 = (EditText)findViewById(R.id.editText);
                String t1 = et1.getText().toString();
                EditText et2 = (EditText)findViewById(R.id.editText2);
                String t2 = et2.getText().toString();
                String text = t1 + t2;
                System.out.println(t1);
                textView.setText(text);
            }
        });
    }
}
