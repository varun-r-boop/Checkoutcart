package checkoutcartsample.market.entity;




public interface PokemonCartBaseItem {

    int TYPE_CART = 0x0;
    int TYPE_HEADER = 0x1;

    int getCartItemType();

    String id();
}
