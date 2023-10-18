package com.example.indiaindetails;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;



public class states extends AppCompatActivity {

    Button btnEvent2,btnEvent3,btnEvent4,btnEvent5,btnEvent6,btnEvent7,btnEvent8,btnEvent9,btnEvent10,btnEvent11,btnEvent12,btnEvent13,btnEvent14,btnEvent15,btnEvent16,btnEvent17,btnEvent18,btnEvent19,btnEvent20,btnEvent21,btnEvent22,btnEvent23,btnEvent24,btnEvent25,btnEvent26,btnEvent27,btnEvent28,btnEvent29;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_states);
        btnEvent2 = findViewById(R.id.button2);
        btnEvent2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Button clicked",Toast.LENGTH_SHORT ).show();
                Intent intent = new Intent(getApplicationContext(),ap.class);
                startActivity(intent);
            }
        });
        btnEvent3 = findViewById(R.id.button3);
        btnEvent3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Button clicked",Toast.LENGTH_SHORT ).show();
                Intent intent = new Intent(getApplicationContext(),arunachal.class);
                startActivity(intent);
            }
        });
        btnEvent4 = findViewById(R.id.button4);
        btnEvent4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Button clicked",Toast.LENGTH_SHORT ).show();
                Intent intent = new Intent(getApplicationContext(),assam.class);
                startActivity(intent);
            }
        });
        btnEvent5 = findViewById(R.id.button5);
        btnEvent5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Button clicked",Toast.LENGTH_SHORT ).show();
                Intent intent = new Intent(getApplicationContext(),bihar.class);
                startActivity(intent);
            }
        });
        btnEvent6 = findViewById(R.id.button6);
        btnEvent6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Button clicked",Toast.LENGTH_SHORT ).show();
                Intent intent = new Intent(getApplicationContext(),chattisgarh.class);
                startActivity(intent);
            }
        });
        btnEvent7 = findViewById(R.id.button7);
        btnEvent7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Button clicked",Toast.LENGTH_SHORT ).show();
                Intent intent = new Intent(getApplicationContext(),goa.class);
                startActivity(intent);
            }
        });
        btnEvent8 = findViewById(R.id.button8);
        btnEvent8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Button clicked",Toast.LENGTH_SHORT ).show();
                Intent intent = new Intent(getApplicationContext(),gujarat.class);
                startActivity(intent);
            }
        });
        btnEvent9 = findViewById(R.id.button9);
        btnEvent9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Button clicked",Toast.LENGTH_SHORT ).show();
                Intent intent = new Intent(getApplicationContext(),haryana.class);
                startActivity(intent);
            }
        });
        btnEvent10 = findViewById(R.id.button10);
        btnEvent10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Button clicked",Toast.LENGTH_SHORT ).show();
                Intent intent = new Intent(getApplicationContext(),himachal.class);
                startActivity(intent);
            }
        });
        btnEvent11 = findViewById(R.id.button11);
        btnEvent11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Button clicked",Toast.LENGTH_SHORT ).show();
                Intent intent = new Intent(getApplicationContext(),jharkhand.class);
                startActivity(intent);
            }
        });
        btnEvent12 = findViewById(R.id.button12);
        btnEvent12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Button clicked",Toast.LENGTH_SHORT ).show();
                Intent intent = new Intent(getApplicationContext(),karnataka.class);
                startActivity(intent);
            }
        });
        btnEvent13 = findViewById(R.id.button13);
        btnEvent13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Button clicked",Toast.LENGTH_SHORT ).show();
                Intent intent = new Intent(getApplicationContext(),kerala.class);
                startActivity(intent);
            }
        });
        btnEvent14 = findViewById(R.id.button14);
        btnEvent14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Button clicked",Toast.LENGTH_SHORT ).show();
                Intent intent = new Intent(getApplicationContext(),madhya.class);
                startActivity(intent);
            }
        });
        btnEvent15 = findViewById(R.id.button15);
        btnEvent15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Button clicked",Toast.LENGTH_SHORT ).show();
                Intent intent = new Intent(getApplicationContext(),maharastra.class);
                startActivity(intent);
            }
        });
        btnEvent16 = findViewById(R.id.button16);
        btnEvent16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Button clicked",Toast.LENGTH_SHORT ).show();
                Intent intent = new Intent(getApplicationContext(),manipur.class);
                startActivity(intent);
            }
        });
        btnEvent17 = findViewById(R.id.button17);
        btnEvent17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Button clicked",Toast.LENGTH_SHORT ).show();
                Intent intent = new Intent(getApplicationContext(),meghalaya.class);
                startActivity(intent);
            }
        });
        btnEvent18 = findViewById(R.id.button18);
        btnEvent18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Button clicked",Toast.LENGTH_SHORT ).show();
                Intent intent = new Intent(getApplicationContext(),mizoram.class);
                startActivity(intent);
            }
        });
        btnEvent19 = findViewById(R.id.button19);
        btnEvent19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Button clicked",Toast.LENGTH_SHORT ).show();
                Intent intent = new Intent(getApplicationContext(),nagaland.class);
                startActivity(intent);
            }
        });
        btnEvent20 = findViewById(R.id.button20);
        btnEvent20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Button clicked",Toast.LENGTH_SHORT ).show();
                Intent intent = new Intent(getApplicationContext(),odisha.class);
                startActivity(intent);
            }
        });
        btnEvent21 = findViewById(R.id.button21);
        btnEvent21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Button clicked",Toast.LENGTH_SHORT ).show();
                Intent intent = new Intent(getApplicationContext(),punjab.class);
                startActivity(intent);
            }
        });
        btnEvent22 = findViewById(R.id.button22);
        btnEvent22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Button clicked",Toast.LENGTH_SHORT ).show();
                Intent intent = new Intent(getApplicationContext(),rajasthan.class);
                startActivity(intent);
            }
        });
        btnEvent23 = findViewById(R.id.button23);
        btnEvent23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Button clicked",Toast.LENGTH_SHORT ).show();
                Intent intent = new Intent(getApplicationContext(),sikkim.class);
                startActivity(intent);
            }
        });
        btnEvent24 = findViewById(R.id.button24);
        btnEvent24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Button clicked",Toast.LENGTH_SHORT ).show();
                Intent intent = new Intent(getApplicationContext(),tn.class);
                startActivity(intent);
            }
        });
        btnEvent25 = findViewById(R.id.button25);
        btnEvent25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Button clicked",Toast.LENGTH_SHORT ).show();
                Intent intent = new Intent(getApplicationContext(),telangana.class);
                startActivity(intent);
            }
        });
        btnEvent26 = findViewById(R.id.button26);
        btnEvent26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Button clicked",Toast.LENGTH_SHORT ).show();
                Intent intent = new Intent(getApplicationContext(),tripura.class);
                startActivity(intent);
            }
        });

    }
}