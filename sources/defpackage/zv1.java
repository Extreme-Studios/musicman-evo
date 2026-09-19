package defpackage;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class zv1 {
    public final String a;
    public final String b;
    public final Drawable c;

    public zv1(String str, String str2, Drawable drawable) {
        this.a = str;
        if (str2 == null) {
            j7.l("Null imageUrl");
            throw null;
        }
        this.b = str2;
        this.c = drawable;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zv1) {
            zv1 zv1Var = (zv1) obj;
            String str = zv1Var.a;
            String str2 = this.a;
            if (str2 != null ? str2.equals(str) : str == null) {
                if (this.b.equals(zv1Var.b)) {
                    Drawable drawable = zv1Var.c;
                    Drawable drawable2 = this.c;
                    if (drawable2 != null ? drawable2.equals(drawable) : drawable == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode();
        Drawable drawable = this.c;
        return (iHashCode * 1000003) ^ (drawable != null ? drawable.hashCode() : 0);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.c);
        String str = this.a;
        int length = String.valueOf(str).length();
        int length2 = strValueOf.length();
        String str2 = this.b;
        StringBuilder sb = new StringBuilder(str2.length() + length + 42 + 7 + length2 + 1);
        ec.x(sb, "OfflineAdAssets{advertiserName=", str, ", imageUrl=", str2);
        return ec.n(sb, ", icon=", strValueOf, "}");
    }
}
