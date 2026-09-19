package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c61 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ Object h;

    public /* synthetic */ c61(Object obj, boolean z, int i) {
        this.f = i;
        this.h = obj;
        this.g = z;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i = this.f;
        boolean z = this.g;
        Object obj = this.h;
        switch (i) {
            case 0:
                ((d61) obj).F(z);
                break;
            case 1:
                no1 no1Var = (no1) obj;
                np1 np1Var = no1Var.w;
                if (np1Var != null) {
                    no1Var.n.j(null, np1Var.Z0(), no1Var.w.g(), no1Var.w.k(), this.g, no1Var.k(), 0);
                } else {
                    jn.F("Ad should be associated with an ad view before calling recordCustomClickGesture()");
                }
                break;
            case 2:
                y73 y73Var = (y73) obj;
                long jCurrentTimeMillis = System.currentTimeMillis();
                try {
                    y73.p(y73Var.o, y73Var.q, z, y73Var.r).k();
                } catch (NullPointerException e) {
                    y73Var.m.c(2027, System.currentTimeMillis() - jCurrentTimeMillis, e);
                    return;
                }
                break;
            case 3:
                ((x93) obj).d(z, false);
                break;
            default:
                un1 un1Var = (un1) obj;
                un1Var.getClass();
                String str = qz1.a;
                p73 p73Var = ((d73) un1Var.h).f;
                if (p73Var.W != z) {
                    p73Var.W = z;
                    gr1 gr1Var = p73Var.s;
                    gr1Var.c(23, new v33(z));
                    gr1Var.d();
                    break;
                }
                break;
        }
    }
}
