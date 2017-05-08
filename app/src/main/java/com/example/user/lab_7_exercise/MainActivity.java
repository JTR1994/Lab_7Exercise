package com.example.user.lab_7_exercise;


import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.TextView;
import android.widget.EditText;
import java.util.Locale;
import android.widget.Button;



public class MainActivity extends AppCompatActivity {
    TextView tv1;
    EditText ed1, ed2;
    Locale myLocale;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = (TextView) findViewById(R.id.tv1);
        ed1 = (EditText) findViewById(R.id.ed1);
        ed2 = (EditText) findViewById(R.id.ed2);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {

            String name = extras.getString("name");
            tv1.setText(name);
        }
    }


    public void Onclick (View view)
    {
        Intent intent = new Intent(MainActivity.this, SecondAct.class);
        String ED1;
        ED1 = ed1.getText().toString();

        intent.putExtra("name",ED1);

        startActivity(intent);
    }
    public void Onclick1 (View view)
    {
        Intent intent2 = new Intent(MainActivity.this, ThirdAct.class);
        String ED2;
        ED2 = ed2.getText().toString();


        intent2.putExtra("name",ED2);


        startActivity(intent2);
    }
    public void Onclick2 (View view)
    {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ump.edu.my"));

        startActivity(i);
    }
    public void Onclick3 (View view)
    {
        Intent i1 = new Intent(Intent.ACTION_DIAL);
        i1.setData(Uri.parse("tel:0175445268"));
        startActivity(i1);

    }

}
