package com.zybooks.eventtracking;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    @SuppressLint("NonConstantResourceId")
    public void buttonClick(View view){
        Intent intent = new Intent(this, EventDisplayActivity.class);
        startActivity(intent);
    }

    private boolean handleKeyEvent(View view, int keycode){
        view = this.getCurrentFocus();

        if(view != null){
            // Hide the keyboard
            InputMethodManager inputMethodManager = (InputMethodManager) getApplicationContext()
                    .getSystemService(Context.INPUT_METHOD_SERVICE);
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
            return true;
        }
        return false;
    }
}