package com.example.firebase;

import android.content.Context;

import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.io.IOException;
import java.io.InputStream;





class JsonLoader implements MainContract.IJsonLoader {

    @NonNull
    private Context context;

    public JsonLoader(@NonNull Context context) {
        this.context = context;
    }

    @Override
    @Nullable
    public String getPokemonJsonStr() {
        String json;
        try {
            InputStream is = context.getAssets().open("pokemons.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            int val = is.read(buffer);
            is.close();
            json = new String(buffer, "UTF-8");
            Log.d("JSON", "" + val);

        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return json;
    }
}
