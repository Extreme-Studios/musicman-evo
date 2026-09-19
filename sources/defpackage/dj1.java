package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class dj1 implements pl1, en1 {
    public kd0 f;
    public final Context h;
    public final e72 i;
    public final d60 j;
    public final Executor k;
    public boolean l = false;
    public boolean m = false;
    public final AtomicBoolean g = new AtomicBoolean();

    public dj1(Context context, e72 e72Var, d60 d60Var, ya1 ya1Var) {
        this.h = context;
        this.i = e72Var;
        this.j = d60Var;
        this.k = ya1Var;
    }

    @Override // defpackage.pl1
    public final void E0(r71 r71Var) {
        b();
    }

    @Override // defpackage.en1
    public final void F(String str) {
        b();
    }

    @Override // defpackage.en1
    public final void a(j01 j01Var) {
        b();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003a  */
    public final void b() {
        kd0 kd0Var;
        int i;
        a41 a41VarN;
        if (!this.g.getAndSet(true)) {
            if (((Boolean) ry0.l.u()).booleanValue()) {
                i = 2;
            } else {
                i = 3;
                if (!((Boolean) ry0.m.u()).booleanValue()) {
                    if (((Boolean) ry0.k.u()).booleanValue()) {
                        try {
                            String strOptString = new JSONObject(vc3.C.h.g().m().e).optString("local_flag_write");
                            if (TextUtils.equals(strOptString, "client")) {
                                i = 2;
                            } else if (!TextUtils.equals(strOptString, "service")) {
                                i = 1;
                            }
                        } catch (JSONException unused) {
                        }
                    } else {
                        i = 1;
                    }
                }
            }
            int i2 = i - 1;
            e72 e72Var = this.i;
            Context context = this.h;
            if (i2 == 1) {
                a41VarN = vc3.C.r.n(context, d60.a(), e72Var);
            } else if (i2 == 2) {
                a41VarN = vc3.C.r.i(context, d60.a(), e72Var);
            }
            ue0 ue0Var = z31.b;
            this.f = new kd0(context, a41VarN.a("google.afma.sdkConstants.getSdkConstants", ue0Var, ue0Var), this.j);
            this.l = true;
        }
        if (this.l && (kd0Var = this.f) != null) {
            hp hpVarB = kd0Var.b();
            if (!this.m && ((Boolean) ly0.i.u()).booleanValue()) {
                hpVarB.a(new va1(14, this), this.k);
            }
            ej1.s(hpVarB, "persistFlagsClient");
        }
    }

    @Override // defpackage.pl1
    public final void A(e52 e52Var) {
    }
}
