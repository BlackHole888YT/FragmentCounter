package com.example.fragmentcounter;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.fragmentcounter.databinding.FragmentResultBinding;


public class ResultFragment extends Fragment {

    private FragmentResultBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentResultBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        TextView resultNumber = view.findViewById(R.id.result_number);

        Bundle bundle = getArguments();
        if (bundle != null) {
            int counter = bundle.getInt("key");
            String value = String.valueOf(counter);
            resultNumber.setText(value);
        }
    }
}