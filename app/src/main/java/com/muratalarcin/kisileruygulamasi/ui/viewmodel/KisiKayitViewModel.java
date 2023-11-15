package com.muratalarcin.kisileruygulamasi.ui.viewmodel;

import android.util.Log;

import androidx.lifecycle.ViewModel;

import com.muratalarcin.kisileruygulamasi.data.repo.KisilerDaoRepository;

public class KisiKayitViewModel extends ViewModel {
    public KisilerDaoRepository krepo = new KisilerDaoRepository();
    public void kaydet(String kisi_ad, String kisi_tel) {
        krepo.kaydet(kisi_ad, kisi_tel);
    }
}
