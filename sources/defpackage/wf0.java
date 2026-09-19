package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class wf0 extends bg0 {
    public final String b;
    public final boolean c;
    public final boolean d;
    public final String[] e;
    public final bg0[] f;

    public wf0(String str, boolean z, boolean z2, String[] strArr, bg0[] bg0VarArr) {
        super("CTOC");
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = strArr;
        this.f = bg0VarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wf0.class != obj.getClass()) {
            return false;
        }
        wf0 wf0Var = (wf0) obj;
        return this.c == wf0Var.c && this.d == wf0Var.d && this.b.equals(wf0Var.b) && Arrays.equals(this.e, wf0Var.e) && Arrays.equals(this.f, wf0Var.f);
    }

    public final int hashCode() {
        return this.b.hashCode() + (((((this.c ? 1 : 0) + 527) * 31) + (this.d ? 1 : 0)) * 31);
    }
}
