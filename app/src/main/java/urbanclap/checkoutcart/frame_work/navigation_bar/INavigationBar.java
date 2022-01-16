package urbanclap.checkoutcart.frame_work.navigation_bar;


import android.view.ViewGroup;

import androidx.annotation.NonNull;




@SuppressWarnings("unused")
public interface INavigationBar {
    void addView(@NonNull NavigationItemView navigationItemView);

    void addView(@NonNull NavigationItemView navigationItemView, int pos);

    void updateView(@NonNull NavigationItemView navigationItemView, int pos);

    void removeView(int pos);

    void clear();

    ViewGroup getView();

    void selectViewAt(int pos);
}
