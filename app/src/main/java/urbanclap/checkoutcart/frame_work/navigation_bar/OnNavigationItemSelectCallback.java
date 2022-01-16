package urbanclap.checkoutcart.frame_work.navigation_bar;



import androidx.annotation.NonNull;

import java.util.List;




public interface OnNavigationItemSelectCallback<T> {
    void onItemSelect(@NonNull String routeId, @NonNull List<Routable<T>> routable);
}
