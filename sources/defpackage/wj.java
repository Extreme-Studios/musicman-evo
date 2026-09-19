package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class wj implements vj {
    public final int a;
    public final /* synthetic */ xj b;

    public wj(xj xjVar, int i) {
        this.b = xjVar;
        this.a = i;
    }

    @Override // defpackage.vj
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        xj xjVar = this.b;
        kj kjVar = xjVar.w;
        int i = this.a;
        if (kjVar == null || i >= 0 || !kjVar.g().L()) {
            return xjVar.M(arrayList, arrayList2, i, 1);
        }
        return false;
    }
}
