package urbanclap.checkoutcart.frame_work.market.interfaces;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
;import urbanclap.checkoutcart.frame_work.market.MarketManager;




public interface IMarketView {
    void addNavigationBar(@Nullable View navigationBar, @NonNull ViewGroup.LayoutParams layoutParams);

    void addStickyViewHolder(@Nullable View stickyView, @NonNull ViewGroup.LayoutParams layoutParams);

    void addIMarketSectionView(@Nullable View marketSectionView, @NonNull ViewGroup.LayoutParams layoutParams);

    void bindMarketManager(@NonNull MarketManager<?, ?, ?> marketManager);
}
