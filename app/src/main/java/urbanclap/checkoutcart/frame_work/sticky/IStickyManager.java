package urbanclap.checkoutcart.frame_work.sticky;


import android.view.View;

import androidx.annotation.Nullable;




public interface IStickyManager {
    @Nullable
    View getStickyView(int pos);
}
