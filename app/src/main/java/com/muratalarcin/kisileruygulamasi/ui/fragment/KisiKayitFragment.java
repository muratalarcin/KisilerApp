package com.muratalarcin.kisileruygulamasi.ui.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.muratalarcin.kisileruygulamasi.R;
import com.muratalarcin.kisileruygulamasi.databinding.FragmentKisiKayitBinding;

public class KisiKayitFragment extends Fragment {
    private FragmentKisiKayitBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentKisiKayitBinding.inflate(inflater, container, false);

        binding.buttonKaydet.setOnClickListener(view -> {
            String kisi_ad = binding.editTextKisiAd.getText().toString();
            String kisi_tel = binding.editTextKisiTel.getText().toString();

            kaydet(kisi_ad, kisi_tel);
        });

        return binding.getRoot();
    }

    public void kaydet(String kisi_ad, String kisi_tel) {
        Log.e("Kişi Kaydet", kisi_ad + " - " + kisi_tel);
    }

}