package com.udayakumar.myapp.views;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.udayakumar.myapp.R;
import com.udayakumar.myapp.models.Product;

import java.util.UUID;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, new ShopFragment())
                    .commitNow();
        }
    }
}