package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class ny1 implements zw1 {
    public final /* synthetic */ int a;
    public final Context b;
    public final Executor c;
    public final wf1 d;

    public /* synthetic */ ny1(Context context, Executor executor, wf1 wf1Var, int i) {
        this.a = i;
        this.b = context;
        this.c = executor;
        this.d = wf1Var;
    }

    public static final void c(e52 e52Var, x42 x42Var, ww1 ww1Var) {
        try {
            s52 s52Var = (s52) ww1Var.b;
            f93 f93Var = ((i52) e52Var.a.g).d;
            try {
                s52Var.a.V1(x42Var.v.toString(), f93Var);
            } catch (Throwable th) {
                throw new l52(th);
            }
        } catch (Exception e) {
            jn.V("Fail to load ad from adapter ".concat(String.valueOf(ww1Var.a)), e);
        }
    }

    @Override // defpackage.zw1
    public final Object a(e52 e52Var, x42 x42Var, ww1 ww1Var) {
        md1 md1Var = null;
        int i = 0;
        switch (this.a) {
            case 0:
                p83 p83Var = new p83(e52Var, x42Var, ww1Var.a);
                dr1 dr1Var = new dr1(new z61(this, ww1Var, x42Var, 21), md1Var, i);
                wf1 wf1Var = this.d;
                vf1 vf1Var = new vf1(wf1Var.c, wf1Var.d, p83Var, dr1Var);
                ((nk1) vf1Var.N.c()).I1(new og1(0, (s52) ww1Var.b), this.c);
                ((nx1) ww1Var.c).C3((py1) vf1Var.i0.c());
                return vf1Var.I();
            default:
                p83 p83Var2 = new p83(e52Var, x42Var, ww1Var.a);
                dr1 dr1Var2 = new dr1(new un1(this, ww1Var, x42Var, 18), md1Var, i);
                wf1 wf1Var2 = this.d;
                vf1 vf1Var2 = new vf1(wf1Var2.c, wf1Var2.d, p83Var2, dr1Var2);
                ((nk1) vf1Var2.N.c()).I1(new og1(0, (s52) ww1Var.b), this.c);
                ok1 ok1Var = (ok1) vf1Var2.U.c();
                ak1 ak1Var = (ak1) vf1Var2.V.c();
                gl1 gl1Var = (gl1) vf1Var2.a0.c();
                dn1 dn1Var = (dn1) vf1Var2.g0.c();
                px1 px1Var = (px1) ww1Var.c;
                sy1 sy1Var = new sy1(this, gl1Var, ak1Var, ok1Var, dn1Var);
                synchronized (px1Var) {
                    px1Var.f = sy1Var;
                }
                return vf1Var2.I();
        }
    }

    @Override // defpackage.zw1
    public final void b(e52 e52Var, x42 x42Var, ww1 ww1Var) throws l52 {
        switch (this.a) {
            case 0:
                JSONObject jSONObject = x42Var.v;
                pk1 pk1Var = ww1Var.c;
                Context context = this.b;
                try {
                    i52 i52Var = (i52) e52Var.a.g;
                    yp ypVar = i52Var.p;
                    f93 f93Var = i52Var.d;
                    int i = ypVar.g;
                    Object obj = ww1Var.b;
                    if (i == 3) {
                        s52 s52Var = (s52) obj;
                        try {
                            s52Var.a.c3(new ju(context), f93Var, jSONObject.toString(), (q41) pk1Var);
                            return;
                        } catch (Throwable th) {
                            throw new l52(th);
                        }
                    }
                    s52 s52Var2 = (s52) obj;
                    try {
                        s52Var2.a.z0(new ju(context), f93Var, jSONObject.toString(), (q41) pk1Var);
                        return;
                    } catch (Throwable th2) {
                        throw new l52(th2);
                    }
                } catch (Exception e) {
                    jn.V("Fail to load ad from adapter ".concat(String.valueOf(ww1Var.a)), e);
                    return;
                }
                jn.V("Fail to load ad from adapter ".concat(String.valueOf(ww1Var.a)), e);
                return;
            default:
                s52 s52Var3 = (s52) ww1Var.b;
                if (s52Var3.a()) {
                    c(e52Var, x42Var, ww1Var);
                    return;
                }
                u40 u40Var = new u40(this, e52Var, x42Var, ww1Var, 13);
                pk1 pk1Var2 = ww1Var.c;
                px1 px1Var = (px1) pk1Var2;
                synchronized (px1Var) {
                    px1Var.h = u40Var;
                }
                Context context2 = this.b;
                i52 i52Var2 = (i52) e52Var.a.g;
                f81 f81Var = (f81) pk1Var2;
                String string = x42Var.v.toString();
                try {
                    s52Var3.a.v1(new ju(context2), i52Var2.d, f81Var, string);
                    return;
                } catch (Throwable th3) {
                    throw new l52(th3);
                }
        }
    }
}
