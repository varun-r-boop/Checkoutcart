package urbanclap.checkoutcart.frame_work.market;



public interface ItemData<T> {
    T getViewModel();

    String getUUID();

    int getViewType();
}
