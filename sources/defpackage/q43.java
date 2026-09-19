package defpackage;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class q43 extends Exception {
    public final int f;
    public final long g;
    public final int h;
    public final String i;
    public final int j;
    public final de3 k;
    public final int l;
    public final yd3 m;
    public final boolean n;

    static {
        String str = qz1.a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public q43(int i, Exception exc, int i2, String str, int i3, de3 de3Var, int i4, yd3 yd3Var, boolean z) {
        String str2;
        int i5;
        String strN;
        String str3;
        if (i == 0) {
            str2 = str;
            i5 = i3;
            strN = "Source error";
        } else if (i != 1) {
            strN = "Unexpected runtime error";
            str2 = str;
            i5 = i3;
        } else {
            String strValueOf = String.valueOf(de3Var);
            String str4 = qz1.a;
            if (i4 == 0) {
                str3 = "NO";
            } else if (i4 == 1) {
                str3 = "NO_UNSUPPORTED_TYPE";
            } else if (i4 == 2) {
                str3 = "NO_UNSUPPORTED_DRM";
            } else if (i4 == 3) {
                str3 = "NO_EXCEEDS_CAPABILITIES";
            } else {
                if (i4 != 4) {
                    j7.a();
                    throw null;
                }
                str3 = "YES";
            }
            StringBuilder sb = new StringBuilder(str3.length() + strValueOf.length() + ec.f(String.valueOf(i3), String.valueOf(str).length() + 14, 9) + 19);
            str2 = str;
            sb.append(str2);
            sb.append(" error, index=");
            i5 = i3;
            sb.append(i5);
            sb.append(", format=");
            strN = ec.n(sb, strValueOf, ", format_supported=", str3);
        }
        this(TextUtils.isEmpty(null) ? strN : strN.concat(": null"), exc, i2, i, str2, i5, de3Var, i4, yd3Var, SystemClock.elapsedRealtime(), z);
    }

    public final q43 a(yd3 yd3Var) {
        String message = getMessage();
        String str = qz1.a;
        return new q43(message, getCause(), this.f, this.h, this.i, this.j, this.k, this.l, yd3Var, this.g, this.n);
    }

    public q43(int i, Exception exc, int i2) {
        this(i, exc, i2, null, -1, null, 4, null, false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q43(String str, Throwable th, int i, int i2, String str2, int i3, de3 de3Var, int i4, yd3 yd3Var, long j, boolean z) {
        boolean z2;
        super(str, th);
        Bundle bundle = Bundle.EMPTY;
        this.f = i;
        this.g = j;
        if (!z) {
            z2 = true;
        } else if (i2 == 1) {
            i2 = 1;
            z2 = true;
        } else {
            z2 = false;
        }
        hn.v(z2);
        hn.v(th != null);
        this.h = i2;
        this.i = str2;
        this.j = i3;
        this.k = de3Var;
        this.l = i4;
        this.m = yd3Var;
        this.n = z;
    }
}
