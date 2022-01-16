package urbanclap.checkoutcart.frame_work.navigation_bar;

import android.content.Context;

import androidx.annotation.NonNull;





public abstract class NavigationItemViewHolder<T> {

    @NonNull
    private NavigationItemView navigationItemView;

    public NavigationItemViewHolder(int layoutId, @NonNull Context context) {
        navigationItemView = new NavigationItemView(context);
        navigationItemView.setContentView(layoutId);
    }

    public void bind(@NonNull Routable<T> routable,
                     @NonNull NavigationItemView.OnNavigateCallback callback,
                     @NonNull String id) {
        navigationItemView.setCallback(callback, id);
        onBind(routable.getRouteViewModel());
    }

    public abstract void onBind(T viewModel);

    @NonNull
    public NavigationItemView getNavigationItemView() {
        return navigationItemView;
    }
}
