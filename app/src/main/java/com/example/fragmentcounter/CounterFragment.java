package com.example.fragmentcounter;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.example.fragmentcounter.databinding.FragmentBlankBinding;


public class CounterFragment extends Fragment {
    private int counter = 0;
    private FragmentBlankBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentBlankBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        TextView counResult = view.findViewById(R.id.counter_result);
        Button countPlus = view.findViewById(R.id.counter_plus);
        Button countMinus = view.findViewById(R.id.counter_minus);
        Button navigateButton = view.findViewById(R.id.navigate_button);


        countPlus.setOnClickListener(v -> {
            counter++;
            counResult.setText(String.valueOf(counter));
        });

        countMinus.setOnClickListener(v -> {
            counter--;
            counResult.setText(String.valueOf(counter));
        });


        navigateButton.setOnClickListener(v -> {
            Bundle bundle = new Bundle();
            bundle.putInt("key", counter);


            ResultFragment resultFragment = new ResultFragment();
            resultFragment.setArguments(bundle);

            requireActivity()
                    .getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_2, resultFragment)
                    .commit();
        });

    }
}