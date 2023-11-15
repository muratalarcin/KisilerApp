package com.muratalarcin.kisileruygulamasi.ui.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.snackbar.Snackbar;
import com.muratalarcin.kisileruygulamasi.data.entity.Kisiler;
import com.muratalarcin.kisileruygulamasi.databinding.CardTasarimBinding;
import com.muratalarcin.kisileruygulamasi.ui.fragment.AnasayfaFragmentDirections;
import com.muratalarcin.kisileruygulamasi.ui.viewmodel.AnasayfaViewModel;

import java.net.ContentHandler;
import java.util.List;

public class KisilerAdapter extends RecyclerView.Adapter<KisilerAdapter.CardTasarimTutucu>{
    private List<Kisiler> kisilerListesi;
    private Context mContext;
    private AnasayfaViewModel viewModel;

    public KisilerAdapter(List<Kisiler> kisilerListesi, Context mContext, AnasayfaViewModel viewModel) {
        this.kisilerListesi = kisilerListesi;
        this.mContext = mContext;
        this.viewModel = viewModel;
    }

    public class CardTasarimTutucu extends RecyclerView.ViewHolder {
        private CardTasarimBinding tasarim;

        public CardTasarimTutucu(CardTasarimBinding tasarim) {
            super(tasarim.getRoot());
            this.tasarim = tasarim;
        }
    }

    @NonNull
    @Override
    public CardTasarimTutucu onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CardTasarimBinding binding = CardTasarimBinding.inflate(LayoutInflater.from(mContext), parent, false);
        return new CardTasarimTutucu(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull CardTasarimTutucu holder, int position) {
        Kisiler kisi = kisilerListesi.get(position);
        CardTasarimBinding t = holder.tasarim;

        t.textViewKisiAd.setText(kisi.getKisi_ad());
        t.textViewKisiTel.setText(kisi.getKisi_tel());

        t.cardViewSatir.setOnClickListener(view -> {
            AnasayfaFragmentDirections.KisiDetayGecis gecis = AnasayfaFragmentDirections.kisiDetayGecis(kisi);
            Navigation.findNavController(view).navigate(gecis);
        });

        t.imageViewSil.setOnClickListener(view -> {
           Snackbar.make(view,"Silinsin mi?", Snackbar.LENGTH_SHORT)
                   .setAction("EVET", view1 -> {
                       viewModel.sil(kisi.getKisi_id());
                   })
                   .show();
        });
    }

    @Override
    public int getItemCount() {
        return kisilerListesi.size();
    }
}