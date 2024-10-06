package com.example.activity_lifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    private Button btnBack;
    private static final String MAIN_ACTIVITY2_TAG = "Activity 2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.e(MAIN_ACTIVITY2_TAG, "onCreate");

        btnBack = findViewById(R.id.btn_back);

        // Separate click listener class
        btnBack.setOnClickListener(new BackButtonClickListener());

        // Handle system bar insets
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main2), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(MAIN_ACTIVITY2_TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(MAIN_ACTIVITY2_TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(MAIN_ACTIVITY2_TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(MAIN_ACTIVITY2_TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(MAIN_ACTIVITY2_TAG, "onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(MAIN_ACTIVITY2_TAG, "onRestart");
    }

    // Separate class for back button click logic
    private class BackButtonClickListener implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            finish();
            Log.e(MAIN_ACTIVITY2_TAG, "Back Button Clicked");
        }
    }
}