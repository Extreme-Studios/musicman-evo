package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class of0 {
    public final Uri a;
    public final List b;
    public final vj2 c;

    static {
        String str = qz1.a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
    }

    public of0(Uri uri, vj2 vj2Var) {
        List list = Collections.EMPTY_LIST;
        this.a = uri;
        ArrayList arrayList = rn0.a;
        this.b = list;
        this.c = vj2Var;
        tj2 tj2Var = vj2.g;
        w40.k0("initialCapacity", 4);
        Object[] objArr = new Object[4];
        if (vj2Var.size() <= 0) {
            vj2.o(objArr, 0);
        } else {
            vj2Var.get(0).getClass();
            j7.j();
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof of0)) {
            return false;
        }
        of0 of0Var = (of0) obj;
        return this.a.equals(of0Var.a) && this.b.equals(of0Var.b) && this.c.equals(of0Var.c);
    }

    public final int hashCode() {
        return (int) ((((long) ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 923521)) * 961)) * 31)) * 31) - Long.MAX_VALUE);
    }
}
