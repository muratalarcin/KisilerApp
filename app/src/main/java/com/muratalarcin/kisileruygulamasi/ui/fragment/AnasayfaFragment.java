package com.muratalarcin.kisileruygulamasi.ui.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.muratalarcin.kisileruygulamasi.R;
import com.muratalarcin.kisileruygulamasi.databinding.FragmentAnasayfaBinding;

public class AnasayfaFragment extends Fragment {
    private FragmentAnasayfaBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentAnasayfaBinding.inflate(inflater, container, false);

        binding.buttonDetay.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(R.id.kisiDetayGecis);
        });

        binding.fab.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(R.id.kisiKayitGecis);
        });

        return binding.getRoot();
    }
}