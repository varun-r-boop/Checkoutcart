package com.example.firebase;



import android.os.Bundle;


import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


import java.util.List;

import checkoutcartsample.market.ItemFactory;
import checkoutcartsample.market.NavigationItemFactory;
import checkoutcartsample.market.entity.PokemonCartBaseItem;
import checkoutcartsample.model.PokemonItem;
import urbanclap.checkoutcart.frame_work.market.MarketManager;
import urbanclap.checkoutcart.frame_work.market.Section;
import urbanclap.checkoutcart.market_impl.recycler_view_market.RecyclerMarketManager;
import urbanclap.checkoutcart.utils.DefaultCart;
import urbanclap.checkoutcart.utils.DefaultCartItem;
import urbanclap.checkoutcart.utils.MarketUtils;

public class MainActivity1 extends AppCompatActivity implements MainContract.View {

    private RecyclerMarketView marketView;
    private MainContract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        marketView = findViewById(R.id.market);
        this.presenter = new MainPresenter(this, new JsonLoader(this));
    }

    @Override
    protected void onStart() {
        super.onStart();
        presenter.start();
    }

    @Override
    public void showSections(@NonNull List<Section<PokemonCartBaseItem>> sections) {
        MarketManager.Config<PokemonCartBaseItem, String, DefaultCartItem<PokemonItem>> config =
                new MarketManager.Config<>(sections);

        config.setCart(new DefaultCart<DefaultCartItem<PokemonItem>>())
                .setSticky(MarketUtils.getDefaultStickyView(this))
                .setNavigator(
                        MarketUtils.getDefaultHorizontalNavigationBar(this),
                        new NavigationItemFactory()
                );
        marketView.bindMarketManager(new RecyclerMarketManager<>(this, config, new ItemFactory()));
    }

    @Override
    public void showError(@NonNull String errorMsg) {
        Toast.makeText(this, errorMsg, Toast.LENGTH_SHORT).show();
    }
}

