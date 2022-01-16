package urbanclap.checkoutcart.utils;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import urbanclap.checkoutcart.frame_work.navigation_bar.INavigationBar;
import urbanclap.checkoutcart.frame_work.sticky.IStickyView;




public class MarketUtils {

    public static IStickyView getDefaultStickyView(@NonNull Context context) {
        return new StickyFrameLayout(context);
    }

    public static RecyclerView getDefaultRecycler(@NonNull Context context,
                                                  boolean enableNestedScrolling) {
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setNestedScrollingEnabled(enableNestedScrolling);
        return recyclerView;
    }

    public static INavigationBar getDefaultHorizontalNavigationBar(@NonNull Context context) {
        return new NavigationHorizontalScroll(context);
    }
}
