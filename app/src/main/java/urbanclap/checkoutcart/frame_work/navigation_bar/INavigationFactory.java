package urbanclap.checkoutcart.frame_work.navigation_bar;

import android.content.Context;

import androidx.annotation.NonNull;





public interface INavigationFactory<T> {
    NavigationItemViewHolder<T> createViewHolder(int viewType, @NonNull Context context);
}
