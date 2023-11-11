package com.muratalarcin.kisileruygulamasi.ui.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.muratalarcin.kisileruygulamasi.R;
import com.muratalarcin.kisileruygulamasi.databinding.FragmentKisiDetayBinding;

public class KisiDetayFragment extends Fragment {
    private FragmentKisiDetayBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentKisiDetayBinding.inflate(inflater, container, false);

        return binding.getRoot();
    }
}