package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class u20 implements Serializable {
    public rk f;
    public volatile Object g = gm.i;
    public final Object h = this;

    public u20(rk rkVar) {
        this.f = rkVar;
    }

    public final Object a() {
        Object objA;
        Object obj = this.g;
        gm gmVar = gm.i;
        if (obj != gmVar) {
            return obj;
        }
        synchronized (this.h) {
            objA = this.g;
            if (objA == gmVar) {
                rk rkVar = this.f;
                rkVar.getClass();
                objA = rkVar.a();
                this.g = objA;
                this.f = null;
            }
        }
        return objA;
    }

    public final String toString() {
        return this.g != gm.i ? String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}
