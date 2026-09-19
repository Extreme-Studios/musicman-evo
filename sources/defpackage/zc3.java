package defpackage;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class zc3 {
    public final String a;
    public final boolean b;
    public final boolean c;

    public zc3(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != zc3.class) {
            return false;
        }
        zc3 zc3Var = (zc3) obj;
        return TextUtils.equals(this.a, zc3Var.a) && this.b == zc3Var.b && this.c == zc3Var.c;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() + 31) * 31) + (true != this.b ? 1237 : 1231)) * 31) + (true != this.c ? 1237 : 1231);
    }
}
