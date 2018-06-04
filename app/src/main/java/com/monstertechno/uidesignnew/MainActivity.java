package com.monstertechno.uidesignnew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    Button signin, love, tour_match;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(1);
        getWindow().setFlags(1024,1024);
        setContentView(R.layout.activity_main);

        signin = (Button) findViewById(R.id.signin);
        love = (Button) findViewById(R.id.love);
        tour_match = (Button) findViewById(R.id.tour);

        signin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Profile.class);
                startActivity(intent);
            }
        });

        love.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"You Click on Love Match Button",Toast.LENGTH_SHORT).show();
            }
        });

        tour_match.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"You Click on Take Tour Button",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
