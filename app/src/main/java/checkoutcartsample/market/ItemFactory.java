package checkoutcartsample.market;

import android.content.Context;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

import com.example.firebase.R;

import checkoutcartsample.market.entity.PokemonCartBaseItem;
import checkoutcartsample.model.PokemonItem;
import urbanclap.checkoutcart.market_impl.recycler_view_market.RecyclerItemFactory;
import urbanclap.checkoutcart.market_impl.recycler_view_market.RecyclerItemViewHolder;
import urbanclap.checkoutcart.utils.DefaultCartItem;





public class ItemFactory extends RecyclerItemFactory<PokemonCartBaseItem, DefaultCartItem<PokemonItem>> {
    @Override
    public RecyclerItemViewHolder<PokemonCartBaseItem, DefaultCartItem<PokemonItem>> createViewHolder(@NonNull Context context,
                                                                                                      @NonNull ViewGroup parent,
                                                                                                      int viewType) {
        switch (viewType) {
            case PokemonCartBaseItem.TYPE_CART:
                return new CartItemViewHolder(LayoutInflater
                        .from(context)
                        .inflate(R.layout.item_layout, parent, false));

            case PokemonCartBaseItem.TYPE_HEADER:
                return new SectionItemViewHolder(LayoutInflater
                        .from(context)
                        .inflate(R.layout.item_section_layout, parent, false));
        }
        return null;
    }
}
