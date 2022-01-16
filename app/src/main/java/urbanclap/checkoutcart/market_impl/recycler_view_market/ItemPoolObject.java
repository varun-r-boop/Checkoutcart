package urbanclap.checkoutcart.market_impl.recycler_view_market;


import androidx.annotation.NonNull;

import urbanclap.checkoutcart.frame_work.market.ItemData;




class ItemPoolObject<T> {

    @NonNull
    private String sectionId;
    @NonNull
    private ItemData<T> itemData;

    ItemPoolObject(@NonNull String sectionId, @NonNull ItemData<T> itemData) {
        this.sectionId = sectionId;
        this.itemData = itemData;
    }

    @NonNull
    String getSectionId() {
        return sectionId;
    }

    @NonNull
    ItemData<T> getItemData() {
        return itemData;
    }
}
