package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import static com.example.myapp.R.*;
import static com.example.myapp.R.id.*;

public class MainActivity extends AppCompatActivity {
     EditText nameEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);
        nameEditText=findViewById(editTextTextPersonName);
    }

    public void clickHandler(View view)
    {
        switch (view.getId()){
        case R.id.buttonlogin:
            String name=nameEditText.getText().toString();
            Intent homeIntent=new Intent(MainActivity.this,HomeActivity2.class);
            //Toast.makeText(this,"Welcome to android", Toast.LENGTH_SHORT).show();
            homeIntent.putExtra("mykey",name);
            startActivity(homeIntent);
            break;
        case R.id.buttoncancel:
            Toast.makeText(this,"cancelled",Toast.LENGTH_SHORT).show();
            break;
    }
    }


}