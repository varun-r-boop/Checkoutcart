package checkoutcartsample.market;


import checkoutcartsample.market.entity.PokemonCartBaseItem;
import urbanclap.checkoutcart.frame_work.market.ItemData;



public class CartItem implements ItemData<PokemonCartBaseItem> {

    private PokemonCartBaseItem item;

    public CartItem(PokemonCartBaseItem item) {
        this.item = item;
    }

    @Override
    public PokemonCartBaseItem getViewModel() {
        return item;
    }

    @Override
    public String getUUID() {
        return item.id();
    }

    @Override
    public int getViewType() {
        return item.getCartItemType();
    }
}
