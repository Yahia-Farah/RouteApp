package com.example.routeapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    static final String ANDROID="ANDROID COURSE";
    static final String IOS="IOS COURSE";
    static final String FULLSTACK="FULLSTACK";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onButtonClick(View view){
        AppCompatButton button = (AppCompatButton) view;
        if(button.getText().toString().equals(ANDROID)){
            Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
            intent.putExtra("course",R.drawable.android);
            intent.putExtra("syllabus",R.string.android_course_syllabus);
            startActivity(intent);
        }
        else if (button.getText().toString().equals(IOS)){
            Intent intent =new Intent(MainActivity.this,DetailsActivity.class);
            intent.putExtra("course",R.drawable.ios);
            intent.putExtra("syllabus",R.string.ios_syllabus);
            startActivity(intent);
        }
        else if (button.getText().toString().equals(FULLSTACK)){
            Intent intent = new Intent(MainActivity.this,DetailsActivity.class);
            intent.putExtra("course",R.drawable.fullstack);
            intent.putExtra("syllabus",R.string.course_syllabus);
            startActivity(intent);
        }
    }

}