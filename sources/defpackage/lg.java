package defpackage;

import android.os.Build;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class lg extends s90 {
    public final /* synthetic */ mg x;

    public lg(mg mgVar) {
        this.x = mgVar;
    }

    @Override // defpackage.s90
    public final void j(Throwable th) {
        this.x.a.d(th);
    }

    @Override // defpackage.s90
    public final void k(u40 u40Var) {
        mg mgVar = this.x;
        mgVar.c = u40Var;
        u40 u40Var2 = mgVar.c;
        qg qgVar = mgVar.a;
        mgVar.b = new r52(u40Var2, qgVar.g, qgVar.i, Build.VERSION.SDK_INT >= 34 ? vg.a() : rs0.f());
        qg qgVar2 = mgVar.a;
        ArrayList arrayList = new ArrayList();
        qgVar2.a.writeLock().lock();
        try {
            qgVar2.c = 1;
            arrayList.addAll(qgVar2.b);
            qgVar2.b.clear();
            qgVar2.a.writeLock().unlock();
            qgVar2.d.post(new og(arrayList, qgVar2.c, (Throwable) null));
        } catch (Throwable th) {
            qgVar2.a.writeLock().unlock();
            throw th;
        }
    }
}
