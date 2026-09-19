package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes.dex */
public final class kb3 extends f0 {
    public static final Parcelable.Creator<kb3> CREATOR = new b42(19);
    public final String f;
    public final int g;
    public final int h;
    public final boolean i;
    public final int j;
    public final int k;
    public final kb3[] l;
    public final boolean m;
    public final boolean n;
    public boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;

    /* JADX WARN: Code duplicated, block: B:41:0x00d0  */
    public kb3(Context context, s2[] s2VarArr) {
        int i;
        int i2;
        String string;
        int dimensionPixelSize;
        s2 s2Var = s2VarArr[0];
        this.i = false;
        int i3 = s2Var.a;
        int i4 = s2Var.b;
        boolean z = i3 == -3 && i4 == -4;
        this.n = z;
        this.r = false;
        boolean z2 = s2Var.d;
        this.s = z2;
        boolean z3 = s2Var.f;
        this.t = z3;
        if (z) {
            s2 s2Var2 = s2.h;
            this.j = s2Var2.a;
            i4 = s2Var2.b;
            this.g = i4;
        } else if (z2) {
            this.j = i3;
            i4 = s2Var.e;
            this.g = i4;
        } else if (z3) {
            this.j = i3;
            i4 = s2Var.g;
            this.g = i4;
        } else {
            this.j = i3;
            this.g = i4;
        }
        boolean z4 = this.j == -1;
        boolean z5 = i4 == -2;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (z4) {
            f32 f32Var = ut0.f.a;
            if (context.getResources().getConfiguration().orientation != 2) {
                dimensionPixelSize = displayMetrics.widthPixels;
                this.k = dimensionPixelSize;
            } else {
                DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
                if (((int) (displayMetrics2.heightPixels / displayMetrics2.density)) < 600) {
                    DisplayMetrics displayMetrics3 = context.getResources().getDisplayMetrics();
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    if (windowManager != null) {
                        Display defaultDisplay = windowManager.getDefaultDisplay();
                        defaultDisplay.getRealMetrics(displayMetrics3);
                        int i5 = displayMetrics3.heightPixels;
                        int i6 = displayMetrics3.widthPixels;
                        defaultDisplay.getMetrics(displayMetrics3);
                        int i7 = displayMetrics3.heightPixels;
                        int i8 = displayMetrics3.widthPixels;
                        if (i7 == i5 && i8 == i6) {
                            int i9 = displayMetrics.widthPixels;
                            int identifier = context.getResources().getIdentifier("navigation_bar_width", "dimen", "android");
                            dimensionPixelSize = i9 - (identifier > 0 ? context.getResources().getDimensionPixelSize(identifier) : 0);
                            this.k = dimensionPixelSize;
                        } else {
                            dimensionPixelSize = displayMetrics.widthPixels;
                            this.k = dimensionPixelSize;
                        }
                    } else {
                        dimensionPixelSize = displayMetrics.widthPixels;
                        this.k = dimensionPixelSize;
                    }
                } else {
                    dimensionPixelSize = displayMetrics.widthPixels;
                    this.k = dimensionPixelSize;
                }
            }
            double d = dimensionPixelSize / displayMetrics.density;
            i = (int) d;
            if (d - ((double) i) >= 0.01d) {
                i++;
            }
        } else {
            i = this.j;
            f32 f32Var2 = ut0.f.a;
            this.k = f32.n(displayMetrics, i);
        }
        if (z5) {
            int i10 = (int) (displayMetrics.heightPixels / displayMetrics.density);
            i2 = i10 <= 400 ? 32 : i10 <= 720 ? 50 : 90;
        } else {
            i2 = this.g;
        }
        f32 f32Var3 = ut0.f.a;
        this.h = f32.n(displayMetrics, i2);
        if (z4 || z5) {
            StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + g72.a(i, 1) + 3);
            sb.append(i);
            sb.append("x");
            sb.append(i2);
            sb.append("_as");
            this.f = sb.toString();
        } else {
            if (z2 || z3) {
                int i11 = this.j;
                int i12 = this.g;
                StringBuilder sb2 = new StringBuilder(String.valueOf(i12).length() + g72.a(i11, 1) + 3);
                sb2.append(i11);
                sb2.append("x");
                sb2.append(i12);
                sb2.append("_as");
                string = sb2.toString();
            } else if (z) {
                string = "320x50_mb";
            } else {
                this.f = s2Var.c;
            }
            this.f = string;
        }
        int length = s2VarArr.length;
        if (length > 1) {
            this.l = new kb3[length];
            for (int i13 = 0; i13 < s2VarArr.length; i13++) {
                this.l[i13] = new kb3(context, s2VarArr[i13]);
            }
        } else {
            this.l = null;
        }
        this.m = false;
        this.o = false;
    }

    public static kb3 a() {
        return new kb3("320x50_mb", 0, 0, false, 0, 0, null, true, false, false, false, false, false, false, false);
    }

    public static kb3 b() {
        return new kb3("interstitial_mb", 0, 0, false, 0, 0, null, false, false, false, false, true, false, false, false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iW = s90.w(parcel, 20293);
        s90.q(parcel, 2, this.f);
        s90.P(parcel, 3, 4);
        parcel.writeInt(this.g);
        s90.P(parcel, 4, 4);
        parcel.writeInt(this.h);
        s90.P(parcel, 5, 4);
        parcel.writeInt(this.i ? 1 : 0);
        s90.P(parcel, 6, 4);
        parcel.writeInt(this.j);
        s90.P(parcel, 7, 4);
        parcel.writeInt(this.k);
        s90.t(parcel, 8, this.l, i);
        s90.P(parcel, 9, 4);
        parcel.writeInt(this.m ? 1 : 0);
        s90.P(parcel, 10, 4);
        parcel.writeInt(this.n ? 1 : 0);
        boolean z = this.o;
        s90.P(parcel, 11, 4);
        parcel.writeInt(z ? 1 : 0);
        s90.P(parcel, 12, 4);
        parcel.writeInt(this.p ? 1 : 0);
        s90.P(parcel, 13, 4);
        parcel.writeInt(this.q ? 1 : 0);
        s90.P(parcel, 14, 4);
        parcel.writeInt(this.r ? 1 : 0);
        s90.P(parcel, 15, 4);
        parcel.writeInt(this.s ? 1 : 0);
        s90.P(parcel, 16, 4);
        parcel.writeInt(this.t ? 1 : 0);
        s90.J(parcel, iW);
    }

    public kb3(String str, int i, int i2, boolean z, int i3, int i4, kb3[] kb3VarArr, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        this.f = str;
        this.g = i;
        this.h = i2;
        this.i = z;
        this.j = i3;
        this.k = i4;
        this.l = kb3VarArr;
        this.m = z2;
        this.n = z3;
        this.o = z4;
        this.p = z5;
        this.q = z6;
        this.r = z7;
        this.s = z8;
        this.t = z9;
    }

    public kb3() {
        this("interstitial_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
    }

    public kb3(Context context, s2 s2Var) {
        this(context, new s2[]{s2Var});
    }
}
