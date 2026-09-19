package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ds1 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ us2 g;

    public /* synthetic */ ds1(us2 us2Var, int i) {
        this.f = i;
        this.g = us2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        us2 us2Var = this.g;
        switch (i) {
            case 0:
                hs1 hs1Var = ((es1) us2Var.h).a;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) us2Var.g;
                hs1Var.getClass();
                if (!concurrentHashMap.isEmpty()) {
                    hs1Var.b(concurrentHashMap);
                    String strC = hs1Var.f.c(concurrentHashMap);
                    jn.p(strC);
                    if (((Boolean) tu0.e.c.a(lx0.Wd)).booleanValue() || hs1Var.e) {
                        hs1Var.c.execute(new is1(hs1Var, strC, 1));
                    }
                } else {
                    jn.F("Empty paramMap.");
                }
                break;
            case 1:
                ((es1) us2Var.h).a.a((ConcurrentHashMap) us2Var.g, true);
                break;
            default:
                ((es1) us2Var.h).a.a((ConcurrentHashMap) us2Var.g, false);
                break;
        }
    }
}
