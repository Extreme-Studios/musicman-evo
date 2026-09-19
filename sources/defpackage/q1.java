package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.extremestudios.musicmanevo.R;

/* JADX INFO: loaded from: classes.dex */
public final class q1 extends j5 implements s1 {
    public final /* synthetic */ r1 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(r1 r1Var, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.i = r1Var;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        hn.p(this, getContentDescription());
        setOnTouchListener(new m1(this, this));
    }

    @Override // defpackage.s1
    public final boolean b() {
        return false;
    }

    @Override // defpackage.s1
    public final boolean c() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.i.l();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int iMax = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            background.setHotspotBounds(paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
        }
        return frame;
    }
}
