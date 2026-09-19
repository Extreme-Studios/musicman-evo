package defpackage;

import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lx1 implements xm2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ lx1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0096  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:83:0x00a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.xm2
    public final hp b(Object obj) {
        g92 g92Var;
        boolean z;
        vl2 vl2Var;
        e62 e62Var;
        switch (this.a) {
            case 0:
                mx1 mx1Var = (mx1) this.b;
                Uri uri = (Uri) this.c;
                e52 e52Var = (e52) this.d;
                x42 x42Var = (x42) this.e;
                z42 z42Var = (z42) this.f;
                try {
                    Intent intent = (Intent) new md().a().g;
                    intent.setData(uri);
                    r91 r91Var = new r91(intent, null);
                    cb1 cb1Var = new cb1();
                    sf1 sf1Var = (sf1) mx1Var.c;
                    rf1 rf1Var = new rf1(sf1Var.b, sf1Var.c, new p83(e52Var, x42Var, (String) null), new us2(new r52(mx1Var, cb1Var, x42Var, 21), null, 16, false));
                    cb1Var.b(new AdOverlayInfoParcel(r91Var, null, (gl1) rf1Var.b0.c(), null, new d60(0, 0, false), null, null, z42Var.b));
                    ((w42) mx1Var.e).c(2, 3);
                    return na1.t(rf1Var.I());
                } catch (Throwable th) {
                    jn.P("Error in CustomTabsAdRenderer", th);
                    throw th;
                }
            default:
                es0 es0Var = (es0) this.b;
                vg2 vg2Var = (vg2) this.c;
                x32 x32Var = (x32) this.d;
                h42 h42Var = (h42) this.e;
                tj1 tj1Var = (tj1) this.f;
                z32 z32Var = (z32) obj;
                if (z32Var != null) {
                    h42 h42Var2 = x32Var.a;
                    vg2 vg2Var2 = x32Var.b;
                    f93 f93Var = x32Var.c;
                    String str = x32Var.d;
                    Executor executor = x32Var.e;
                    kf3 kf3Var = x32Var.f;
                    e62 e62Var2 = z32Var.a;
                    x32 x32Var2 = new x32(h42Var2, vg2Var2, f93Var, str, executor, kf3Var, e62Var2);
                    d62 d62Var = z32Var.c;
                    if (d62Var != null) {
                        es0Var.j = null;
                        dg3 dg3Var = (dg3) es0Var.h;
                        synchronized (dg3Var) {
                            ((ArrayDeque) dg3Var.i).add(x32Var2);
                        }
                        return es0Var.u(d62Var, vg2Var);
                    }
                    dg3 dg3Var2 = (dg3) es0Var.h;
                    synchronized (dg3Var2) {
                        try {
                            dg3Var2.f = 2;
                            synchronized (dg3Var2) {
                                try {
                                    g92Var = (g92) dg3Var2.j;
                                    z = g92Var == null;
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                            if (vl2Var != null) {
                                es0Var.j = null;
                                return na1.L(vl2Var, new r21(12, es0Var), (Executor) es0Var.k);
                            }
                            synchronized (dg3Var2) {
                                ((ArrayDeque) dg3Var2.i).add(x32Var2);
                            }
                            vg2Var = new vg2(vg2Var.h, (Object) z32Var.b, 19, false);
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    if (z) {
                        vl2Var = null;
                    } else {
                        synchronized (g92Var) {
                            try {
                                if (g92Var.b || g92Var.a || (e62Var = ((x32) g92Var.c).g) == null || !e62Var.equals(e62Var2)) {
                                    vl2Var = null;
                                } else {
                                    g92Var.a = true;
                                    vl2Var = (vl2) g92Var.d;
                                }
                            } catch (Throwable th4) {
                                throw th4;
                            }
                        }
                    }
                    if (vl2Var != null) {
                        es0Var.j = null;
                        return na1.L(vl2Var, new r21(12, es0Var), (Executor) es0Var.k);
                    }
                    synchronized (dg3Var2) {
                        ((ArrayDeque) dg3Var2.i).add(x32Var2);
                        vg2Var = new vg2(vg2Var.h, (Object) z32Var.b, 19, false);
                    }
                }
                hp hpVarT = ((un1) es0Var.f).t(vg2Var, h42Var, tj1Var);
                es0Var.j = tj1Var;
                return hpVarT;
        }
    }
}
