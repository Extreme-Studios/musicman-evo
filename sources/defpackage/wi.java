package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class wi implements mb {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wi(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.mb
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                xi xiVar = (xi) obj;
                if (xiVar == null) {
                    xiVar = new xi(-3);
                }
                ((z61) this.b).x(xiVar);
                return;
            default:
                xi xiVar2 = (xi) obj;
                synchronized (yi.c) {
                    try {
                        q00 q00Var = yi.d;
                        ArrayList arrayList = (ArrayList) q00Var.get((String) this.b);
                        if (arrayList == null) {
                            return;
                        }
                        q00Var.remove((String) this.b);
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((mb) arrayList.get(i)).accept(xiVar2);
                        }
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
        }
    }
}
