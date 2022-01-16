package urbanclap.checkoutcart.market_impl.recycler_view_market;


import android.content.Context;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import urbanclap.checkoutcart.utils.CartCallback;
import urbanclap.checkoutcart.frame_work.market.interfaces.IItemFactory;





public abstract class RecyclerItemFactory<T, CT> implements IItemFactory<T, CT, RecyclerItemViewHolder<T, CT>> {

    RecyclerItemViewHolder<T, CT> create(@NonNull Context context,
                                         @NonNull ViewGroup parent,
                                         int viewType, @Nullable CartCallback<CT> cartCallback) {

        RecyclerItemViewHolder<T, CT> viewHolder = createViewHolder(context, parent, viewType);
        viewHolder.setCartCallback(cartCallback);
        return viewHolder;
    }

    @Override
    public abstract RecyclerItemViewHolder<T, CT> createViewHolder(@NonNull Context context,
                                                                   @NonNull ViewGroup parent,
                                                                   int viewType);
}
