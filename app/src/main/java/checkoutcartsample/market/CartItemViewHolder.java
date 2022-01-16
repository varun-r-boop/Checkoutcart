package checkoutcartsample.market;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.firebase.R;

import checkoutcartsample.market.entity.PokemonCartBaseItem;
import checkoutcartsample.market.entity.PokemonCartItem;
import checkoutcartsample.model.PokemonItem;
import urbanclap.checkoutcart.market_impl.recycler_view_market.RecyclerItemViewHolder;
import urbanclap.checkoutcart.utils.DefaultCartItem;





public class CartItemViewHolder extends RecyclerItemViewHolder<PokemonCartBaseItem, DefaultCartItem<PokemonItem>> {

    private TextView tvId;
    private TextView tvName;
    private TextView tvDesc;

    CartItemViewHolder(final View itemView) {
        super(itemView);
        tvId = itemView.findViewById(R.id.tv_item_id);
        tvName = itemView.findViewById(R.id.tv_item_name);
        tvDesc = itemView.findViewById(R.id.tv_item_desc);
    }

    @Override
    public void onBindView(final PokemonCartBaseItem vm) {
        final PokemonCartItem viewModel = (PokemonCartItem) vm;
        tvId.setText("# " + viewModel.getUuid());
        tvName.setText(viewModel.getName());
        tvDesc.setText(viewModel.getDescription());
        PokemonItem pokemonItem = new PokemonItem(viewModel.getUuid(), viewModel.getName(), viewModel.getDescription());
        final DefaultCartItem<PokemonItem> cartItem = new DefaultCartItem<>(1, 5.0, pokemonItem);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(itemView.getContext(), "added to cart", Toast.LENGTH_SHORT).show();
                increment(vm.id(), cartItem);
            }
        });
    }

}
