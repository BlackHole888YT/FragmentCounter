package com.example.fragmentcounter;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.fragmentcounter.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        CounterFragment counterFragment = new CounterFragment();
        ResultFragment resultFragment = new ResultFragment();

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_1, counterFragment)
                .commit();



        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_2, resultFragment)
                .commit();
    }

}