package com.muratalarcin.kisileruygulamasi.ui.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.muratalarcin.kisileruygulamasi.R;
import com.muratalarcin.kisileruygulamasi.data.entity.Kisiler;
import com.muratalarcin.kisileruygulamasi.databinding.FragmentKisiDetayBinding;

public class KisiDetayFragment extends Fragment {
    private FragmentKisiDetayBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentKisiDetayBinding.inflate(inflater, container, false);

        KisiDetayFragmentArgs bundle = KisiDetayFragmentArgs.fromBundle(getArguments());
        Kisiler gelenKisi = bundle.getKisi();

        binding.editTextKisiAd.setText(gelenKisi.getKisi_ad());
        binding.editTextKisiTel.setText(gelenKisi.getKisi_tel());

        binding.buttonGuncelle.setOnClickListener(view -> {
            String kisi_ad = binding.editTextKisiAd.getText().toString();
            String kisi_tel = binding.editTextKisiTel.getText().toString();
            guncelle(gelenKisi.getKisi_id(), kisi_ad, kisi_tel);
        });

        binding.floatingActionButton.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(R.id.bottom_gecis);
        });

        return binding.getRoot();
    }

    public void guncelle(int kisi_id, String kisi_ad, String kisi_tel) {
        Log.e("Kişi Güncelle", kisi_id + " - " + kisi_ad + " - " + kisi_tel);
    }

}