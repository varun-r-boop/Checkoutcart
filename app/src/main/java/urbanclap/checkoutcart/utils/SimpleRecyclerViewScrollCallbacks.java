package urbanclap.checkoutcart.utils;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import urbanclap.checkoutcart.market_impl.recycler_view_market.RecyclerViewScrollCallbacks;




public abstract class SimpleRecyclerViewScrollCallbacks implements RecyclerViewScrollCallbacks {
    @Override
    public void firstCompletelyVisibleSection(@NonNull String sectionId) {

    }

    @Override
    public void firstVisibleSection(@NonNull String sectionId) {

    }

    @Override
    public void lastCompletelyVisibleSection(@NonNull String sectionId) {

    }

    @Override
    public void onScrolled(RecyclerView recyclerView, int dx, int dy) {

    }

    @Override
    public void lastVisibleSection(@NonNull String sectionId) {

    }

    @Override
    public void onScrollStateChanged(RecyclerView recyclerView, int newState) {

    }

    @Override
    public void firstCompletelyVisibleItem(int pos, @Nullable String id) {

    }

    @Override
    public void lastCompletelyVisibleItem(int pos, @Nullable String id) {

    }

    @Override
    public void firstVisibleItem(int pos, @Nullable String id) {

    }

    @Override
    public void lastVisibleItem(int pos, @Nullable String id) {

    }
}
