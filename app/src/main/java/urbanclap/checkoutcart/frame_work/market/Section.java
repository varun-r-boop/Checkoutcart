package urbanclap.checkoutcart.frame_work.market;



import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

import urbanclap.checkoutcart.frame_work.sticky.IStickyViewItem;





public class Section<T> {

    @NonNull
    private String id;
    @NonNull
    private List<ItemData<T>> itemDataList;
    @Nullable
    private IStickyViewItem stickyViewItem;

    public Section(@NonNull String id, @NonNull List<ItemData<T>> itemDataList) {
        this(id, itemDataList, null);
    }

    public Section(@NonNull String id,
                   @NonNull List<ItemData<T>> itemDataList,
                   @Nullable IStickyViewItem stickyViewItem) {
        this.id = id;
        this.itemDataList = itemDataList;
        this.stickyViewItem = stickyViewItem;
    }

    @NonNull
    public String getId() {
        return id;
    }

    @NonNull
    public List<ItemData<T>> getItemDataList() {
        return itemDataList;
    }

    @Nullable
    public IStickyViewItem getStickyViewItem() {
        return stickyViewItem;
    }
}
