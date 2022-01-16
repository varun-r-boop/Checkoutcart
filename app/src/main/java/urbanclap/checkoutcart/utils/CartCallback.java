package urbanclap.checkoutcart.utils;


import androidx.annotation.NonNull;




public interface CartCallback<T> {
    boolean incrementInCart(@NonNull String uuid, T item);

    boolean decrementInCart(@NonNull String uuid);
}
