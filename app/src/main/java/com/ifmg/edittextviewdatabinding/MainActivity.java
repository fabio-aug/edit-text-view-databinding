package com.ifmg.edittextviewdatabinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import com.ifmg.edittextviewdatabinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        SimpleViewModel viewModel = new ViewModelProvider(this).get(SimpleViewModel.class);
        binding.setLifecycleOwner(this);
        binding.setViewModel(viewModel);
    }
}