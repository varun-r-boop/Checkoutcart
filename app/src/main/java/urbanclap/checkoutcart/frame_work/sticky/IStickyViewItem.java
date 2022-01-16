package urbanclap.checkoutcart.frame_work.sticky;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;



public interface IStickyViewItem {
    View createView(@NonNull ViewGroup parent);
}
