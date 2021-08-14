package com.example.android126hw;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toolbar;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
private BottomNavigationView bottomNavigationView;
private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initBottomNav();
    }

    private void initBottomNav() {
        tv = findViewById(R.id.textTool);
        bottomNavigationView=findViewById(R.id.bottom_nav);
        getSupportFragmentManager().beginTransaction().replace(R.id.mContainer,new FirstFragment()).commit();
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){

                    case R.id.house: getSupportFragmentManager().beginTransaction().replace(R.id.mContainer,new FirstFragment()).commit();
                    tv.setText("Instagram");
                    break;
                    case R.id.action: getSupportFragmentManager().beginTransaction().replace(R.id.mContainer,new SecondFragment()).commit();
                        tv.setText("Following");
                    break;
                    case R.id.profile: getSupportFragmentManager().beginTransaction().replace(R.id.mContainer,new ThirdFragment()).commit();
                        tv.setText("Aibek_Rushov");
                    break;
                }
                return true;
            }
        });
    }

}