package urbanclap.checkoutcart.market_impl.recycler_view_market;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import urbanclap.checkoutcart.utils.CartCallback;
import urbanclap.checkoutcart.frame_work.market.interfaces.IItemViewHolder;





@SuppressWarnings("unused")
public abstract class RecyclerItemViewHolder<IT, CT> extends RecyclerView.ViewHolder
        implements IItemViewHolder<IT, CT> {

    @Nullable
    private CartCallback<CT> cartCallback;

    public RecyclerItemViewHolder(View itemView) {
        super(itemView);
    }

    void setCartCallback(@Nullable CartCallback<CT> cartCallback) {
        this.cartCallback = cartCallback;
    }

    @Override
    public boolean increment(@NonNull String uuid, CT item) {
        return cartCallback != null && cartCallback.incrementInCart(uuid, item);
    }

    @Override
    public boolean decrement(@NonNull String uuid) {
        return cartCallback != null && cartCallback.decrementInCart(uuid);
    }
}
