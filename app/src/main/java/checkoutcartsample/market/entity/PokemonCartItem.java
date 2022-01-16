package checkoutcartsample.market.entity;




public class PokemonCartItem implements PokemonCartBaseItem {

    private int uuid;
    private String name;
    private String description;

    public PokemonCartItem(int uuid, String name, String description) {
        this.uuid = uuid;
        this.name = name;
        this.description = description;
    }

    @Override
    public int getCartItemType() {
        return TYPE_CART;
    }

    @Override
    public String id() {
        return String.valueOf(uuid);
    }

    public int getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
