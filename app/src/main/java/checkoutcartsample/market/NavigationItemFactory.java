package checkoutcartsample.market;

import android.content.Context;

import androidx.annotation.NonNull;

import com.example.firebase.R;

import urbanclap.checkoutcart.frame_work.navigation_bar.INavigationFactory;
import urbanclap.checkoutcart.frame_work.navigation_bar.NavigationItemViewHolder;





public class NavigationItemFactory implements INavigationFactory<String> {

    public NavigationItemFactory() {
    }

    @Override
    public NavigationItemViewHolder<String> createViewHolder(int viewType, @NonNull Context context) {
        return new PokemonNavigationViewHolder(R.layout.navigation_bar_layout, context);
    }
}
