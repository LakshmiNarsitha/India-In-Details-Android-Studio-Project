package com.example.indiaindetails;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class bharath extends AppCompatActivity {
    Button btnEvent1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bharath);
        btnEvent1 = findViewById(R.id.button);
        btnEvent1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Button clicked",Toast.LENGTH_SHORT ).show();
                Intent intent = new Intent(getApplicationContext(),states.class);
                startActivity(intent);
            }
        });
    }
}
