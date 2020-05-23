package com.example.prm391day2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickCallOrther(View view) {
        Intent intent = new Intent(this,IntentDemoActivity.class);
        startActivity(intent);
    }

    public void onClickAdd(View view) {
        Intent intent = new Intent(this,ResultActivity.class);
        EditText n1=(EditText)findViewById(R.id.txtNum1);
        EditText n2=(EditText)findViewById(R.id.txtNum2);
        Bundle bundle=new Bundle();
        double num1=Double.parseDouble(n1.getText().toString());
        double num2=Double.parseDouble(n2.getText().toString());
        bundle.putDouble("num1",num1);
        bundle.putDouble("num2",num2);
        intent.putExtra("info",bundle);
        startActivity(intent);
    }

    public void onClickStartBrowser(View view) {
        Uri uri=Uri.parse("http://www.google.com/");
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }

    public void onClickStartBrowserLaunch(View view) {
        Uri uri=Uri.parse("http://www.google.com?username=testusername");
        Intent intent = new Intent("android.test.LAUNCH",uri);
        startActivity(intent);
    }

    public void onClickStartPhone(View view) {
        Uri uri=Uri.parse("tel:01688924585");
        Intent intent=new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }

    public void onClickGetException(View view) {
        Uri uri=Uri.parse("http://www.google.com/");
        Intent intent = new Intent("android.test.LAUNCH",uri);
        startActivity(intent);
    }
}
