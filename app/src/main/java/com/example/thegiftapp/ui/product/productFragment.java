package com.example.thegiftapp.ui.product;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.thegiftapp.R;

public class productFragment extends Fragment {

    private productViewModel productViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        productViewModel =
                ViewModelProviders.of(this).get(productViewModel.class);
        View root = inflater.inflate(R.layout.fragment_product, container, false);
        final TextView textView = root.findViewById(R.id.text_product);
        productViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}