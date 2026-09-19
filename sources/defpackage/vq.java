package defpackage;

import android.net.Uri;
import android.view.InputEvent;

/* JADX INFO: loaded from: classes.dex */
public final class vq extends s20 implements gl {
    public int j;
    public final /* synthetic */ wq k;
    public final /* synthetic */ Uri l;
    public final /* synthetic */ InputEvent m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vq(wq wqVar, Uri uri, InputEvent inputEvent, yb ybVar) {
        super(2, ybVar);
        this.k = wqVar;
        this.l = uri;
        this.m = inputEvent;
    }

    @Override // defpackage.gl
    public final Object f(Object obj, Object obj2) {
        return ((vq) k((yb) obj2, (qc) obj)).m(k50.a);
    }

    @Override // defpackage.ac
    public final yb k(yb ybVar, Object obj) {
        return new vq(this.k, this.l, this.m, ybVar);
    }

    @Override // defpackage.ac
    public final Object m(Object obj) throws Throwable {
        int i = this.j;
        if (i == 0) {
            ar.n(obj);
            uq uqVar = this.k.a;
            this.j = 1;
            Object objC = uqVar.c(this.l, this.m, this);
            rc rcVar = rc.f;
            if (objC == rcVar) {
                return rcVar;
            }
        } else {
            if (i != 1) {
                j7.e("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ar.n(obj);
        }
        return k50.a;
    }
}
