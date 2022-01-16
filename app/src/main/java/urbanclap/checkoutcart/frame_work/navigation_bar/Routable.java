package urbanclap.checkoutcart.frame_work.navigation_bar;




public interface Routable<T> {
    T getRouteViewModel();

    String getRouteUUID();

    int getRouteViewType();
}
