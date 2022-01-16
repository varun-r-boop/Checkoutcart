package urbanclap.checkoutcart.market_impl.recycler_view_market;

import android.util.Pair;

import androidx.annotation.NonNull;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import urbanclap.checkoutcart.frame_work.market.ItemData;
import urbanclap.checkoutcart.frame_work.market.Section;




class ItemPool<T> {
    @NonNull
    private List<ItemPoolObject<T>> itemPoolObjectList;

    ItemPool(List<Section<T>> sections) {
        itemPoolObjectList = new ArrayList<>();
        for (Section<T> section : sections)
            add(section);
    }

    Pair<Integer, Integer> add(Section<T> section) {
        int pos = containsFirst(section.getId());
        if (pos != -1) {
            throw new IllegalStateException(section.getId() + " Section already exists. Please use update instead");
        }
        return add(section, itemPoolObjectList.size());
    }

    Pair<Integer, Integer> add(Section<T> section, int pos) {
        String id = section.getId();
        Collections.reverse(section.getItemDataList());
        for (ItemData<T> itemData : section.getItemDataList()) {
            itemPoolObjectList.add(pos, new ItemPoolObject<>(id, itemData));
        }
        return new Pair<>(pos, pos + section.getItemDataList().size());
    }

    Pair<Integer, Integer> remove(@NonNull String id) {
        List<ItemPoolObject<T>> listToRemove = new ArrayList<>();
        int startIndex = -1;
        int endIndex = -1;

        for (int i = 0, len = itemPoolObjectList.size(); i < len; i++) {
            ItemPoolObject<T> itemPoolObject = itemPoolObjectList.get(i);
            if (itemPoolObject.getSectionId().equals(id)) {
                if (startIndex == -1)
                    startIndex = i;
                endIndex = i;
                listToRemove.add(itemPoolObject);
            }
        }
        itemPoolObjectList.removeAll(listToRemove);
        return new Pair<>(startIndex, endIndex + 1);
    }

    boolean hasSection(@NonNull String sectionId) {
        return containsFirst(sectionId) != -1;
    }

    String getSectionIdAt(int pos) {
        return itemPoolObjectList.get(pos).getSectionId();
    }

    @NonNull
    List<ItemData<T>> getItemDataList() {
        List<ItemData<T>> itemDataList = new ArrayList<>();
        for (ItemPoolObject<T> itemPoolObject : itemPoolObjectList) {
            itemDataList.add(itemPoolObject.getItemData());
        }
        return itemDataList;
    }

    @NonNull
    List<ItemPoolObject<T>> getItemPoolObjectList() {
        return itemPoolObjectList;
    }

    private int containsFirst(String id) {
        for (int i = 0, len = itemPoolObjectList.size(); i < len; i++) {
            if (itemPoolObjectList.get(i).getSectionId().equals(id))
                return i;
        }
        return -1;
    }

    int updateItem(@NonNull String sectionId, @NonNull ItemData<T> item) throws IllegalArgumentException {
        if (!hasSection(sectionId))
            throw new IllegalArgumentException("Section id not found");

        int pos = -1;

        for (int i = 0, len = itemPoolObjectList.size(); i < len; i++) {
            ItemPoolObject<T> itemPoolObject = itemPoolObjectList.get(i);
            if (itemPoolObject.getSectionId().equals(sectionId)
                    && itemPoolObject.getItemData().getUUID().equals(item.getUUID())) {
                pos = i;
                break;
            }
        }

        if (pos == -1)
            throw new IllegalArgumentException("Item not found");

        itemPoolObjectList.remove(pos);
        itemPoolObjectList.add(pos, new ItemPoolObject<>(sectionId, item));
        return pos;
    }

    int size() {
        return itemPoolObjectList.size();
    }

    boolean hasItem(@NonNull String sectionId, @NonNull String itemId) {
        for (ItemPoolObject<T> itemPoolObject : itemPoolObjectList) {
            if (itemPoolObject.getSectionId().equals(sectionId)
                    && itemPoolObject.getItemData().getUUID().equals(itemId))
                return true;
        }
        return false;
    }
}
