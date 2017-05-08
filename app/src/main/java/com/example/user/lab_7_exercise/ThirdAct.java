package com.example.user.lab_7_exercise;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ThirdAct extends AppCompatActivity {

    EditText ed1;
    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ed1 = (EditText) findViewById(R.id.ed1);
        tv1 = (TextView) findViewById(R.id.tv1);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {

            String name = extras.getString("name");
            tv1.setText(name);
        }

    }
            public void onClick(View view) {

                Intent intent = new Intent(ThirdAct.this, MainActivity.class);

                String ED1;
                ED1 = ed1.getText().toString();

                intent.putExtra("name",ED1);

                startActivity(intent);


            }

}
