package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ak2 extends pj2 {
    public Object[] d;
    public int e;

    @Override // defpackage.pj2
    public final /* bridge */ /* synthetic */ pj2 c(Object obj) {
        f(obj);
        return this;
    }

    public final void f(Object obj) {
        obj.getClass();
        if (this.d != null) {
            int i = bk2.i(this.b);
            Object[] objArr = this.d;
            if (i <= objArr.length) {
                int length = objArr.length - 1;
                int iHashCode = obj.hashCode();
                int iG = ss0.G(iHashCode);
                while (true) {
                    int i2 = iG & length;
                    Object[] objArr2 = this.d;
                    Object obj2 = objArr2[i2];
                    if (obj2 == null) {
                        objArr2[i2] = obj;
                        this.e += iHashCode;
                        a(obj);
                        return;
                    } else if (obj2.equals(obj)) {
                        return;
                    } else {
                        iG = i2 + 1;
                    }
                }
            }
        }
        this.d = null;
        a(obj);
    }

    public final void g(Iterable iterable) {
        iterable.getClass();
        if (this.d == null) {
            b(iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            f(it.next());
        }
    }

    public final bk2 h() {
        bk2 bk2VarM;
        int i = this.b;
        if (i == 0) {
            return wk2.o;
        }
        if (i == 1) {
            Object obj = this.a[0];
            Objects.requireNonNull(obj);
            return new ck2(obj);
        }
        if (this.d == null || bk2.i(i) != this.d.length) {
            bk2VarM = bk2.m(this.a, this.b);
            this.b = bk2VarM.size();
        } else {
            int i2 = this.b;
            Object[] objArrCopyOf = this.a;
            int length = objArrCopyOf.length;
            if (i2 < (length >> 1) + (length >> 2)) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i2);
            }
            int i3 = this.e;
            Object[] objArr = this.d;
            bk2VarM = new wk2(i3, objArr.length - 1, this.b, objArrCopyOf, objArr);
        }
        this.c = true;
        this.d = null;
        return bk2VarM;
    }
}
