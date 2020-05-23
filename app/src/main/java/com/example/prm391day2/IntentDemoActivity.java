package com.example.prm391day2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.Placeholder;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class IntentDemoActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_demo);
    }

    public void onBackBtnClicked(View view) {
        finish();
    }
}
