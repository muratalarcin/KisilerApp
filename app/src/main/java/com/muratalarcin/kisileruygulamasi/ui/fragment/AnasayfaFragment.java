package com.muratalarcin.kisileruygulamasi.ui.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SearchView;

import com.muratalarcin.kisileruygulamasi.R;
import com.muratalarcin.kisileruygulamasi.data.entity.Kisiler;
import com.muratalarcin.kisileruygulamasi.databinding.FragmentAnasayfaBinding;
import com.muratalarcin.kisileruygulamasi.ui.adapter.KisilerAdapter;

import java.util.ArrayList;

public class AnasayfaFragment extends Fragment {
    private FragmentAnasayfaBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentAnasayfaBinding.inflate(inflater, container, false);

        binding.kisilerRv.setLayoutManager(new LinearLayoutManager(requireContext()));

        ArrayList<Kisiler> kisilerListesi = new ArrayList<Kisiler>();
        Kisiler k1 = new Kisiler(1, "Ahmet", "1121312311");
        Kisiler k2 = new Kisiler(2, "Zeynep", "222323213");
        Kisiler k3 = new Kisiler(3, "Beyza", "234234234");
        kisilerListesi.add(k1);
        kisilerListesi.add(k2);
        kisilerListesi.add(k3);

        KisilerAdapter adapter = new KisilerAdapter(kisilerListesi, requireContext());
        binding.kisilerRv.setAdapter(adapter);

        binding.fab.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(R.id.kisiKayitGecis);
        });

        binding.searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {//Klavye üzerindeki arama iconu ile çalışır
                ara(query);
                return true;
            }

            @Override
            public boolean onQueryTextChange(String newText) {//harf girdikçe veya sildikçe çalışır
                ara(newText);
                return true;
            }
        });

        return binding.getRoot();
    }

    public void ara(String aramaKelimesi) {
        Log.e("Kişi Ara", aramaKelimesi);
    }

}