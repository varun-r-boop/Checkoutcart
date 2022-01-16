package urbanclap.checkoutcart.market_impl.recycler_view_market;


import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import urbanclap.checkoutcart.frame_work.market.interfaces.MarketCallbacks;




public interface RecyclerViewScrollCallbacks extends MarketCallbacks {

    void onScrolled(RecyclerView recyclerView, int dx, int dy);

    void onScrollStateChanged(RecyclerView recyclerView, int newState);

    void firstCompletelyVisibleItem(int pos, @Nullable String id);

    void lastCompletelyVisibleItem(int pos, @Nullable String id);

    void firstVisibleItem(int pos, @Nullable String id);

    void lastVisibleItem(int pos, @Nullable String id);
}
