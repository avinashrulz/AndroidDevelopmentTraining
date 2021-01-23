package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void ClickFunction(View view){
        EditText nameEditText = (EditText) findViewById(R.id.editTextPersonName);
        //dogImageViewSwitcher.setImageDrawable();

        Toast.makeText(this, "Button Pressed, Hello " + nameEditText.getText().toString(), Toast.LENGTH_SHORT).show();
        Log.i( "Info", "Button Pressed");
        Log.i("Values", nameEditText.getText().toString());
    }

    public void SwitchImage(View view){
        ImageView dogImageViewSwitcher = (ImageView) findViewById(R.id.dogImageView);
        dogImageViewSwitcher.setImageResource(R.drawable.dogs2);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}