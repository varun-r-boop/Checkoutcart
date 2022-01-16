package com.example.firebase;



import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

import checkoutcartsample.market.entity.PokemonCartBaseItem;
import urbanclap.checkoutcart.frame_work.market.Section;





interface MainContract {
    interface View {

        void showSections(@NonNull List<Section<PokemonCartBaseItem>> sections);

        void showError(@NonNull String errorMsg);
    }

    interface Presenter {
        void start();
    }

    interface IJsonLoader {
        @Nullable
        String getPokemonJsonStr();
    }
}
