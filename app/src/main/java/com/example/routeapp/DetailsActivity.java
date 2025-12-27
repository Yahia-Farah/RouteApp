package com.example.routeapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DetailsActivity extends AppCompatActivity {
    ImageView imageView;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        textView=findViewById(R.id.detailsTv);
        imageView=findViewById(R.id.detailsImage);
        Intent intent = getIntent();
        intent.getIntExtra("course",0);
        intent.getIntExtra("syllabus",0);
        imageView.setImageResource(intent.getIntExtra("course",0));
        textView.setText(intent.getIntExtra("syllabus",0));

    }
}