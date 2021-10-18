package com.zybooks.eventtracking;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentManager;

import android.Manifest;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class EventDisplayActivity extends AppCompatActivity {

    // SEND_SMS Code
    private final int SEND_SMS_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_display);
    }

    @SuppressLint("NonConstantResourceId")
    public void rowClick(View view){
        switch (view.getId()){
            case R.id.row1:
            case R.id.row2:
            case R.id.row3:
                FragmentManager manager = getSupportFragmentManager();
                EditDialogFragment dialog = new EditDialogFragment();
                dialog.show(manager, "editData");
                break;
        }
    }

    @SuppressLint("NonConstantResourceId")
    public void deleteRow(View view){
        Snackbar snackbar = null;

        switch (view.getId()){
            case R.id.delete_row1:
                snackbar = Snackbar.make(findViewById(R.id.constraint), "Delete Row 1", Snackbar.LENGTH_LONG);
                snackbar.show();
                break;
            case R.id.delete_row2:
                snackbar = Snackbar.make(findViewById(R.id.constraint), "Delete Row 2", Snackbar.LENGTH_LONG);
                snackbar.show();
                break;
            case R.id.delete_row3:
                snackbar = Snackbar.make(findViewById(R.id.constraint), "Delete Row 3", Snackbar.LENGTH_LONG);
                snackbar.show();
                break;
        }
    }

    public void addData(View view){
        Intent intent = new Intent(this, AddDataActivity.class);
        startActivity(intent);
    }
}































