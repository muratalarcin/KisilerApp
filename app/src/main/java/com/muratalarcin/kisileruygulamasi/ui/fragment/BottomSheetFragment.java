package com.muratalarcin.kisileruygulamasi.ui.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.google.android.material.snackbar.Snackbar;
import com.muratalarcin.kisileruygulamasi.R;
import com.muratalarcin.kisileruygulamasi.databinding.FragmentBottomSheetBinding;

public class BottomSheetFragment extends BottomSheetDialogFragment {
    FragmentBottomSheetBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentBottomSheetBinding.inflate(inflater, container, false);

        binding.imageView.setOnClickListener(view -> {
            Snackbar.make(binding.textView,"Ekleme İşlemi Yappıldı", Snackbar.LENGTH_SHORT).show();
        });

        return binding.getRoot();
    }
}