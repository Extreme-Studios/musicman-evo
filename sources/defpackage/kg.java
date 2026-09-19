package defpackage;

import android.content.Context;
import com.extremestudios.musicmanevo.R;

/* JADX INFO: loaded from: classes.dex */
public final class kg {
    public static final int f = (int) Math.round(5.1000000000000005d);
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;

    public kg(Context context) {
        boolean zN = a23.n(context, R.attr.elevationOverlayEnabled, false);
        int iH = i8.h(context, R.attr.elevationOverlayColor);
        int iH2 = i8.h(context, R.attr.elevationOverlayAccentColor);
        int iH3 = i8.h(context, R.attr.colorSurface);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.a = zN;
        this.b = iH;
        this.c = iH2;
        this.d = iH3;
        this.e = f2;
    }
}
