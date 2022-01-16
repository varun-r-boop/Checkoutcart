package urbanclap.checkoutcart.frame_work.market.interfaces;

import android.content.Context;

import android.view.ViewGroup;

import androidx.annotation.NonNull;




public interface IItemFactory<IT, CT, K extends IItemViewHolder<IT, CT>> {
    K createViewHolder(@NonNull Context context, @NonNull ViewGroup parent, int viewType);
}
