package urbanclap.checkoutcart.utils;



import androidx.annotation.NonNull;

import java.util.List;




public interface ICart<I> {

    @NonNull
    List<I> getItems();

    double getTotalPrice();

    long getTotalQuantity();

    long getQuantity(@NonNull String uuid);

    double getPrice(@NonNull String uuid);

    void setQuantity(@NonNull String uuid, @NonNull I item);

    boolean increment(@NonNull String uuid, @NonNull I item);

    boolean decrement(@NonNull String uuid);

    I getItem(@NonNull String uuid);

    I remove(@NonNull String uuid);

    void clear();
}
