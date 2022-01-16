package urbanclap.checkoutcart.frame_work.sticky;


import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;




public interface IStickyView {
    void setStickyView(@Nullable View view);

    ViewGroup getView();
}
