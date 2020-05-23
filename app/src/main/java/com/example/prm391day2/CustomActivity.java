package com.example.prm391day2;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;

public class CustomActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom);
        TextView label = (TextView)findViewById(R.id.txtShow);
        TextView par = (TextView)findViewById(R.id.txtParameter);
        Uri uri=this.getIntent().getData();
        label.setText(uri.toString());
        String sPar=uri.getQueryParameter("username");
        par.setText("Username: "+sPar);
    }
}
