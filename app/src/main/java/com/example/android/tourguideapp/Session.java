package com.example.android.tourguideapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;

public class Session {

    private SharedPreferences SHPreferences;
    private SharedPreferences.Editor editor;
    public final Context context;
    private static final int PRIVATE_MODE = 0;
    private static final String PREF_NAME = "Duhok";
    private static final String LANG = "lang";

    @SuppressLint("CommitPrefEdits")
    public Session(Context context) {
        this.context = context;
        SHPreferences = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        editor = SHPreferences.edit();
    }

    public void SetLang(String lang) {
        editor.putString(LANG, lang);
        editor.commit();
    }

    public String GetLang(){ return SHPreferences.getString(LANG, "ku"); }

    public void delete(){
        SHPreferences.edit().clear().apply();
    }

}