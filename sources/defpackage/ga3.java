package defpackage;

import android.util.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class ga3 extends fw {
    public final x93 a;
    public final hs1 b;
    public final boolean c;
    public final int d;
    public final long e;
    public final Boolean f;

    public ga3(x93 x93Var, boolean z, int i, Boolean bool, hs1 hs1Var) {
        this.a = x93Var;
        this.c = z;
        this.d = i;
        this.f = bool;
        this.b = hs1Var;
        vc3.C.k.getClass();
        this.e = System.currentTimeMillis();
    }

    @Override // defpackage.fw
    public final void a(String str) {
        Pair pair = new Pair("sgf_reason", str);
        Pair pair2 = new Pair("se", "query_g");
        Pair pair3 = new Pair("ad_format", "BANNER");
        Pair pair4 = new Pair("rtype", Integer.toString(6));
        Pair pair5 = new Pair("scar", "true");
        vc3 vc3Var = vc3.C;
        vc3Var.k.getClass();
        Pair pair6 = new Pair("lat_ms", Long.toString(System.currentTimeMillis() - this.e));
        int i = this.d;
        Pair pair7 = new Pair("sgpc_rn", Integer.toString(i));
        Pair pair8 = new Pair("sgpc_lsu", String.valueOf(this.f));
        boolean z = this.c;
        jn.I(this.b, "sgpcf", pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, new Pair("tpc", true != z ? "0" : "1"));
        vc3Var.k.getClass();
        this.a.b(z, new ta3(null, str, ((Long) wy0.h.u()).longValue() + System.currentTimeMillis(), i));
    }

    @Override // defpackage.fw
    public final void b(s70 s70Var) {
        Pair pair = new Pair("se", "query_g");
        Pair pair2 = new Pair("ad_format", "BANNER");
        Pair pair3 = new Pair("rtype", Integer.toString(6));
        Pair pair4 = new Pair("scar", "true");
        vc3 vc3Var = vc3.C;
        vc3Var.k.getClass();
        Pair pair5 = new Pair("lat_ms", Long.toString(System.currentTimeMillis() - this.e));
        int i = this.d;
        Pair pair6 = new Pair("sgpc_rn", Integer.toString(i));
        Pair pair7 = new Pair("sgpc_lsu", String.valueOf(this.f));
        boolean z = this.c;
        jn.I(this.b, "sgpcs", pair, pair2, pair3, pair4, pair5, pair6, pair7, new Pair("tpc", true != z ? "0" : "1"));
        vc3Var.k.getClass();
        this.a.b(z, new ta3(s70Var, "", ((Long) wy0.h.u()).longValue() + System.currentTimeMillis(), i));
    }
}
