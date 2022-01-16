package checkoutcartsample.market;

import android.view.View;
import android.widget.TextView;

import com.example.firebase.R;

import checkoutcartsample.market.entity.PokemonCartBaseItem;
import checkoutcartsample.market.entity.PokemonSectionItem;
import checkoutcartsample.model.PokemonItem;
import urbanclap.checkoutcart.market_impl.recycler_view_market.RecyclerItemViewHolder;
import urbanclap.checkoutcart.utils.DefaultCartItem;





public class SectionItemViewHolder extends RecyclerItemViewHolder<PokemonCartBaseItem, DefaultCartItem<PokemonItem>> {

    private TextView tvTitle;

    SectionItemViewHolder(View itemView) {
        super(itemView);
        tvTitle = itemView.findViewById(R.id.tv_itemSection_title);
    }

    @Override
    public void onBindView(PokemonCartBaseItem viewModel) {
        PokemonSectionItem sectionItem = (PokemonSectionItem) viewModel;
        tvTitle.setText(sectionItem.getTitle());
    }

}
