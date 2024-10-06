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

public class MainActivity extends AppCompatActivity
        {

private Button btn;
private static final String MAIN_ACTIVITY_TAG = "Activity 1";

@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    Log.e(MAIN_ACTIVITY_TAG, "onCreate");

    btn = findViewById(R.id.btn);

    // Separate click listener class
    btn.setOnClickListener(new ButtonClickListener());

    // Handle system bar insets
    ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
        Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
        v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
        return
        insets;
    });
}

@Override
protected void onStart() {
    super.onStart();
    Log.e(MAIN_ACTIVITY_TAG, "onStart");
}

@Override
protected void onResume() {
    super.onResume();
    Log.e(MAIN_ACTIVITY_TAG, "onResume");
}

@Override
protected void onPause() {
    super.onPause();
    Log.e(MAIN_ACTIVITY_TAG, "onPause");
}

@Override
protected void onStop() {
    super.onStop();
    Log.e(MAIN_ACTIVITY_TAG, "onStop");
}

@Override
protected void onDestroy() {
    super.onDestroy();
    Log.e(MAIN_ACTIVITY_TAG, "onDestroy");
}

@Override
protected void onRestart() {
    super.onRestart();
    Log.e(MAIN_ACTIVITY_TAG, "onRestart");
}

// Separate class for button click logic
private class ButtonClickListener implements View.OnClickListener {

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this,MainActivity2.class);
        startActivity(intent);

        Log.e(MAIN_ACTIVITY_TAG, "Button Clicked");
    }
}
}