package defpackage;

import android.R;
import android.content.res.ColorStateList;

/* JADX INFO: loaded from: classes.dex */
public final class oq extends m5 {
    public static final int[][] l = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public ColorStateList j;
    public boolean k;

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.j == null) {
            int i = i8.i(this, com.extremestudios.musicmanevo.R.attr.colorControlActivated);
            int i2 = i8.i(this, com.extremestudios.musicmanevo.R.attr.colorOnSurface);
            int i3 = i8.i(this, com.extremestudios.musicmanevo.R.attr.colorSurface);
            this.j = new ColorStateList(l, new int[]{i8.m(1.0f, i3, i), i8.m(0.54f, i3, i2), i8.m(0.38f, i3, i2), i8.m(0.38f, i3, i2)});
        }
        return this.j;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.k && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.k = z;
        if (z) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }
}
