package defpackage;

import android.content.Context;
import android.os.RemoteException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class gx1 implements zw1 {
    public final /* synthetic */ int a;
    public final Context b;
    public final Object c;

    public /* synthetic */ gx1(Context context, Object obj, int i) {
        this.a = i;
        this.b = context;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.zw1
    public final Object a(e52 e52Var, x42 x42Var, ww1 ww1Var) {
        int i = this.a;
        int i2 = 16;
        Object obj = this.c;
        int i3 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        md1 md1Var = null;
        switch (i) {
            case 0:
                y91 y91Var = new y91(x42Var, (s51) ww1Var.b, h2.APP_OPEN_AD);
                p83 p83Var = new p83(e52Var, x42Var, ww1Var.a);
                us2 us2Var = new us2(y91Var, md1Var, i2, objArr == true ? 1 : 0);
                yp ypVar = new yp(x42Var.a0, 1);
                nf1 nf1Var = (nf1) obj;
                if1 if1Var = nf1Var.c;
                nf1 nf1Var2 = nf1Var.d;
                lf1 lf1Var = new lf1(if1Var, nf1Var2, p83Var, us2Var, ypVar);
                q63 q63Var = lf1Var.S;
                y91Var.j = (kk1) q63Var.c();
                ((nx1) ww1Var.c).C3(new uy1((ak1) lf1Var.W.c(), (ym1) lf1Var.Y.c(), (kk1) q63Var.c(), (ok1) lf1Var.V.c(), (xk1) lf1Var.Z.c(), (zl1) nf1Var2.Q.c(), (gl1) lf1Var.a0.c(), (gn1) lf1Var.b0.c(), (wl1) lf1Var.c0.c(), (ik1) lf1Var.e0.c()));
                return lf1Var.I();
            case 1:
                y91 y91Var2 = new y91(x42Var, (s51) ww1Var.b, h2.INTERSTITIAL);
                p83 p83Var2 = new p83(e52Var, x42Var, ww1Var.a);
                us2 us2Var2 = new us2(y91Var2, md1Var, i2, objArr2 == true ? 1 : 0);
                sf1 sf1Var = (sf1) obj;
                if1 if1Var2 = sf1Var.b;
                sf1 sf1Var2 = sf1Var.c;
                rf1 rf1Var = new rf1(if1Var2, sf1Var2, p83Var2, us2Var2);
                q63 q63Var2 = rf1Var.R;
                y91Var2.j = (kk1) q63Var2.c();
                ((nx1) ww1Var.c).C3(new uy1((ak1) rf1Var.V.c(), (ym1) rf1Var.Y.c(), (kk1) q63Var2.c(), (ok1) rf1Var.U.c(), (xk1) rf1Var.Z.c(), (zl1) sf1Var2.Q.c(), (gl1) rf1Var.b0.c(), (gn1) rf1Var.c0.c(), (wl1) rf1Var.d0.c(), (ik1) rf1Var.f0.c()));
                return rf1Var.I();
            default:
                y91 y91Var3 = new y91(x42Var, (s51) ww1Var.b, h2.REWARDED);
                p83 p83Var3 = new p83(e52Var, x42Var, ww1Var.a);
                dr1 dr1Var = new dr1(y91Var3, md1Var, i3);
                wf1 wf1Var = (wf1) obj;
                if1 if1Var3 = wf1Var.c;
                wf1 wf1Var2 = wf1Var.d;
                vf1 vf1Var = new vf1(if1Var3, wf1Var2, p83Var3, dr1Var);
                q63 q63Var3 = vf1Var.R;
                y91Var3.j = (kk1) q63Var3.c();
                ((nx1) ww1Var.c).C3(new ty1((ak1) vf1Var.V.c(), (ym1) vf1Var.X.c(), (kk1) q63Var3.c(), (ok1) vf1Var.U.c(), (xk1) vf1Var.Y.c(), (ik1) vf1Var.e0.c(), (zl1) wf1Var2.U.c(), (gn1) vf1Var.b0.c(), (gl1) vf1Var.a0.c(), (dn1) vf1Var.g0.c(), (wl1) vf1Var.c0.c()));
                return vf1Var.I();
        }
    }

    @Override // defpackage.zw1
    public final void b(e52 e52Var, x42 x42Var, ww1 ww1Var) throws l52 {
        int i = this.a;
        Context context = this.b;
        switch (i) {
            case 0:
                try {
                    s51 s51Var = (s51) ww1Var.b;
                    s51Var.l1(x42Var.Z);
                    s51Var.g2(x42Var.U, x42Var.v.toString(), ((i52) e52Var.a.g).d, new ju(context), new fx1(ww1Var), (q41) ww1Var.c);
                    return;
                } catch (RemoteException e) {
                    jn.w("Remote exception loading an app open RTB ad", e);
                    throw new l52(e);
                }
            case 1:
                try {
                    s51 s51Var2 = (s51) ww1Var.b;
                    s51Var2.l1(x42Var.Z);
                    s51Var2.C0(x42Var.U, x42Var.v.toString(), ((i52) e52Var.a.g).d, new ju(context), new sx1(this, ww1Var), (q41) ww1Var.c);
                    return;
                } catch (RemoteException e2) {
                    jn.w("Remote exception loading a interstitial RTB ad", e2);
                    throw new l52(e2);
                }
            default:
                try {
                    Object obj = ww1Var.b;
                    pk1 pk1Var = ww1Var.c;
                    s51 s51Var3 = (s51) obj;
                    String str = x42Var.Z;
                    JSONObject jSONObject = x42Var.v;
                    s51Var3.l1(str);
                    i52 i52Var = (i52) e52Var.a.g;
                    int i2 = i52Var.p.g;
                    String str2 = x42Var.U;
                    if (i2 == 3) {
                        s51Var3.G2(str2, jSONObject.toString(), i52Var.d, new ju(context), new oy1(this, ww1Var), (q41) pk1Var);
                    } else {
                        s51Var3.h2(str2, jSONObject.toString(), i52Var.d, new ju(context), new oy1(this, ww1Var), (q41) pk1Var);
                    }
                    return;
                } catch (RemoteException e3) {
                    jn.w("Remote exception loading a rewarded RTB ad", e3);
                    return;
                }
        }
    }
}
