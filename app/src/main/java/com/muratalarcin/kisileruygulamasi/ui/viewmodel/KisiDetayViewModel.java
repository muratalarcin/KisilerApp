package com.muratalarcin.kisileruygulamasi.ui.viewmodel;

import android.util.Log;

import androidx.lifecycle.ViewModel;

import com.muratalarcin.kisileruygulamasi.data.repo.KisilerDaoRepository;

public class KisiDetayViewModel extends ViewModel {
    public KisilerDaoRepository krepo = new KisilerDaoRepository();
    public void guncelle(int kisi_id, String kisi_ad, String kisi_tel) {
        krepo.guncelle(kisi_id, kisi_ad, kisi_tel);
    }
}
