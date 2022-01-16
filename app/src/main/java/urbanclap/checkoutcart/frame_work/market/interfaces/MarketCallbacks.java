package urbanclap.checkoutcart.frame_work.market.interfaces;


import androidx.annotation.NonNull;




public interface MarketCallbacks {
    void firstCompletelyVisibleSection(@NonNull String sectionId);

    void firstVisibleSection(@NonNull String sectionId);

    void lastCompletelyVisibleSection(@NonNull String sectionId);

    void lastVisibleSection(@NonNull String sectionId);
}
