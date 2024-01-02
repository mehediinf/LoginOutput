package com.example.loginoutput;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button loginButton,logoutButton;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginButton = findViewById(R.id.loginButtonId);
        logoutButton = findViewById(R.id.logoutButtonId);
        textView = findViewById(R.id.textViewId);


    }

    public void showMessage (View v){
        if(v.getId()==R.id.loginButtonId) {
            Log.v("tag","Login Button is Click,");
        }
        else if (v.getId()==R.id.logoutButtonId) {
            Log.v("tag","LogOut Button is Click.");
        }

    }
}