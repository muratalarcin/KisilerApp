package com.muratalarcin.kisileruygulamasi.ui.viewmodel;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.muratalarcin.kisileruygulamasi.data.entity.Kisiler;
import com.muratalarcin.kisileruygulamasi.data.repo.KisilerDaoRepository;

import java.util.List;

public class AnasayfaViewModel extends ViewModel {
    public KisilerDaoRepository krepo = new KisilerDaoRepository();
    public MutableLiveData<List<Kisiler>> kisilerListesi;

    public AnasayfaViewModel() {
        kisileriYukle();
        kisilerListesi = krepo.kisilerListesi;
    }
    public void ara(String aramaKelimesi) {
        krepo.ara(aramaKelimesi);
    }

    public void sil(int kisi_id) {
        krepo.sil(kisi_id);
    }

    public void kisileriYukle() {
        krepo.kisileriYukle();
    }
}
