package checkoutcartsample.market;

import android.content.Context;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.example.firebase.R;

import urbanclap.checkoutcart.frame_work.navigation_bar.NavigationItemView;
import urbanclap.checkoutcart.frame_work.navigation_bar.NavigationItemViewHolder;





public class PokemonNavigationViewHolder extends NavigationItemViewHolder<String> {

    PokemonNavigationViewHolder(int layoutId, @NonNull Context context) {
        super(layoutId, context);
    }

    @Override
    public void onBind(String viewModel) {
        NavigationItemView itemView = getNavigationItemView();
        TextView tvTitle = itemView.findViewById(R.id.tv_nav);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "you clicked and it still scrolls.... wow", Toast.LENGTH_SHORT).show();
            }
        });
        tvTitle.setText("" + viewModel.charAt(0));
    }
}
