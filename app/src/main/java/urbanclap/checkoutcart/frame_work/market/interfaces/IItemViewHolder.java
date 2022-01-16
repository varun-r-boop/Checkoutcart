package urbanclap.checkoutcart.frame_work.market.interfaces;


import androidx.annotation.NonNull;




public interface IItemViewHolder<T, CT> {
    void onBindView(T viewModel);

    boolean increment(@NonNull String uuid, CT item);

    boolean decrement(@NonNull String uuid);
}
