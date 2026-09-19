package defpackage;

import android.content.Context;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class uq1 {
    public final vg2 b;
    public final Context c;
    public final es1 d;
    public final Executor e;
    public final zq0 f;
    public final d60 g;
    public final bw1 i;
    public final f82 j;
    public final hw1 k;
    public final k52 l;
    public qm2 m;
    public final qq1 a = new qq1();
    public final s11 h = new s11();

    public uq1(tq1 tq1Var) {
        this.c = tq1Var.b;
        this.e = tq1Var.e;
        this.f = tq1Var.f;
        this.g = tq1Var.g;
        this.b = tq1Var.a;
        this.i = tq1Var.d;
        this.j = tq1Var.h;
        this.d = tq1Var.c;
        this.k = tq1Var.i;
        this.l = tq1Var.j;
    }

    public final synchronized hp a(String str, JSONObject jSONObject) {
        qm2 qm2Var = this.m;
        if (qm2Var == null) {
            return kn2.g;
        }
        return na1.L(qm2Var, new qn0(this, str, jSONObject), this.e);
    }

    public final synchronized void b(String str, v11 v11Var) {
        qm2 qm2Var = this.m;
        if (qm2Var == null) {
            return;
        }
        z61 z61Var = new z61(this, str, v11Var, 18);
        qm2Var.a(new in2(qm2Var, 0, z61Var), this.e);
    }

    public final synchronized void c(String str, v11 v11Var) {
        qm2 qm2Var = this.m;
        if (qm2Var == null) {
            return;
        }
        un1 un1Var = new un1(this, str, v11Var);
        qm2Var.a(new in2(qm2Var, 0, un1Var), this.e);
    }

    public final synchronized void d(Map map) {
        qm2 qm2Var = this.m;
        if (qm2Var == null) {
            return;
        }
        zx zxVar = new zx(this, map);
        qm2Var.a(new in2(qm2Var, 0, zxVar), this.e);
    }
}
