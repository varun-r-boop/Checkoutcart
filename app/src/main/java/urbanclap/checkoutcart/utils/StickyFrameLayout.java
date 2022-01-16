package urbanclap.checkoutcart.utils;

import android.content.Context;
import android.graphics.Color;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import urbanclap.checkoutcart.frame_work.sticky.IStickyView;



public class StickyFrameLayout extends FrameLayout implements IStickyView {

    StickyFrameLayout(@NonNull Context context) {
        super(context);
        init();
    }

    private void init() {
        ViewGroup.LayoutParams layoutParams = new LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        setLayoutParams(layoutParams);
        setBackgroundColor(Color.WHITE);
    }

    @Override
    public void setStickyView(@Nullable View view) {
        removeAllViews();
        if (view != null)
            addView(view,
                    new ViewGroup.LayoutParams(
                            ViewGroup.LayoutParams.MATCH_PARENT,
                            ViewGroup.LayoutParams.WRAP_CONTENT)
            );
    }

    @Override
    public ViewGroup getView() {
        return this;
    }
}
