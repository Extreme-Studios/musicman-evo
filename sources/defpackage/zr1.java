package defpackage;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class zr1 implements xl1, ib0, lk1, fk1, ll1 {
    public final Context f;
    public final q52 g;
    public final es1 h;
    public final e52 i;
    public final x42 j;
    public final bw1 k;
    public final String l;
    public Boolean n;
    public long m = -1;
    public final AtomicBoolean p = new AtomicBoolean(false);
    public final AtomicBoolean q = new AtomicBoolean(false);
    public final boolean o = ((Boolean) tu0.e.c.a(lx0.g7)).booleanValue();

    public zr1(Context context, q52 q52Var, es1 es1Var, e52 e52Var, x42 x42Var, bw1 bw1Var, String str) {
        this.f = context;
        this.g = q52Var;
        this.h = es1Var;
        this.i = e52Var;
        this.j = x42Var;
        this.k = bw1Var;
        this.l = str;
    }

    @Override // defpackage.ib0
    public final void B() {
        if (this.j.b()) {
            e(d("click"));
        }
    }

    @Override // defpackage.lk1
    public final void B0() {
        boolean zA = a();
        x42 x42Var = this.j;
        if (zA || x42Var.b()) {
            us2 us2VarD = d("impression");
            us2VarD.s("imp_type", String.valueOf(x42Var.e));
            if (this.m > 0) {
                vc3.C.k.getClass();
                us2VarD.s("p_imp_l", String.valueOf(System.currentTimeMillis() - this.m));
            }
            if (((Boolean) tu0.e.c.a(lx0.je)).booleanValue() && h()) {
                zb3 zb3Var = vc3.C.c;
                us2VarD.s("foreground", true != zb3.g(this.f) ? "1" : "0");
                us2VarD.s("fg_show", true == this.p.get() ? "1" : "0");
            }
            e(us2VarD);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0055  */
    @Override // defpackage.fk1
    public final void N(fu1 fu1Var) {
        String strGroup;
        fu1 fu1Var2;
        if (this.o) {
            us2 us2VarD = d("ifts");
            us2VarD.s("reason", "adapter");
            int i = fu1Var.f;
            String str = fu1Var.g;
            if (fu1Var.h.equals("com.google.android.gms.ads") && (fu1Var2 = fu1Var.i) != null && !fu1Var2.h.equals("com.google.android.gms.ads")) {
                fu1 fu1Var3 = fu1Var.i;
                i = fu1Var3.f;
                str = fu1Var3.g;
            }
            if (i >= 0) {
                us2VarD.s("arec", String.valueOf(i));
            }
            Pattern pattern = this.g.a;
            if (pattern == null || str == null) {
                strGroup = null;
            } else {
                Matcher matcher = pattern.matcher(str);
                if (matcher.find()) {
                    strGroup = matcher.group();
                } else {
                    strGroup = null;
                }
            }
            if (strGroup != null) {
                us2VarD.s("areec", strGroup);
            }
            us2VarD.t();
        }
    }

    @Override // defpackage.fk1
    public final void P(on1 on1Var) {
        if (this.o) {
            us2 us2VarD = d("ifts");
            us2VarD.s("reason", "exception");
            if (!TextUtils.isEmpty(on1Var.getMessage())) {
                us2VarD.s("msg", on1Var.getMessage());
            }
            us2VarD.t();
        }
    }

    public final boolean a() {
        String strN;
        if (this.n == null) {
            synchronized (this) {
                if (this.n == null) {
                    String str = (String) tu0.e.c.a(lx0.B1);
                    zb3 zb3Var = vc3.C.c;
                    try {
                        strN = zb3.N(this.f);
                    } catch (RemoteException unused) {
                        strN = null;
                    }
                    boolean zMatches = false;
                    if (str != null && strN != null) {
                        try {
                            zMatches = Pattern.matches(str, strN);
                        } catch (RuntimeException e) {
                            vc3.C.h.d("CsiActionsListener.isPatternMatched", e);
                        }
                    }
                    this.n = Boolean.valueOf(zMatches);
                }
            }
        }
        return this.n.booleanValue();
    }

    @Override // defpackage.fk1
    public final void b() {
        if (this.o) {
            us2 us2VarD = d("ifts");
            us2VarD.s("reason", "blocked");
            us2VarD.t();
        }
    }

    public final us2 d(String str) {
        e52 e52Var = this.i;
        y91 y91Var = e52Var.b;
        gv1 gv1Var = e52Var.a;
        us2 us2VarA = this.h.a();
        us2VarA.s("gqi", ((z42) y91Var.h).b);
        x42 x42Var = this.j;
        us2VarA.r(x42Var);
        us2VarA.s("action", str);
        us2VarA.s("ad_format", this.l.toUpperCase(Locale.ROOT));
        List list = x42Var.t;
        if (!list.isEmpty()) {
            us2VarA.s("ancn", (String) list.get(0));
        }
        if (x42Var.b()) {
            vc3 vc3Var = vc3.C;
            us2VarA.s("device_connectivity", true != vc3Var.h.i(this.f) ? "offline" : "online");
            vc3Var.k.getClass();
            us2VarA.s("event_timestamp", String.valueOf(System.currentTimeMillis()));
            us2VarA.s("offline_ad", "1");
        }
        if (((Boolean) tu0.e.c.a(lx0.n7)).booleanValue()) {
            boolean z = jn.N((i52) gv1Var.g) != 1;
            us2VarA.s("scar", String.valueOf(z));
            if (z) {
                f93 f93Var = ((i52) gv1Var.g).d;
                us2VarA.s("ragent", f93Var.u);
                us2VarA.s("rtype", jn.v(jn.z(f93Var)));
            }
        }
        return us2VarA;
    }

    public final void e(us2 us2Var) {
        if (!this.j.b()) {
            us2Var.t();
            return;
        }
        hs1 hs1Var = ((es1) us2Var.h).a;
        String strC = hs1Var.f.c((ConcurrentHashMap) us2Var.g);
        vc3.C.k.getClass();
        ym0 ym0Var = new ym0(System.currentTimeMillis(), ((z42) this.i.b.h).b, strC, 2);
        bw1 bw1Var = this.k;
        bw1Var.getClass();
        bw1Var.a(new z61(bw1Var, 20, ym0Var));
    }

    public final boolean h() {
        int i = this.j.b;
        return i == 2 || i == 5 || i == 6 || i == 7;
    }

    @Override // defpackage.ll1
    public final void k() {
        if (a()) {
            this.q.set(true);
            vc3 vc3Var = vc3.C;
            vc3Var.k.getClass();
            this.m = System.currentTimeMillis();
            us2 us2VarD = d("presentation");
            ix0 ix0Var = lx0.je;
            tu0 tu0Var = tu0.e;
            if (((Boolean) tu0Var.c.a(ix0Var)).booleanValue() && h()) {
                boolean z = !zb3.g(this.f);
                AtomicBoolean atomicBoolean = this.p;
                atomicBoolean.set(z);
                us2VarD.s("foreground", true != atomicBoolean.get() ? "0" : "1");
            }
            if (((Boolean) tu0Var.c.a(lx0.ke)).booleanValue() && h()) {
                us2VarD.s("fg_al", true != vc3Var.g.k() ? "0" : "1");
            }
            us2VarD.t();
        }
    }

    @Override // defpackage.xl1
    public final void p() {
        if (a()) {
            us2 us2VarD = d("adapter_impression");
            us2VarD.s("imp_type", String.valueOf(this.j.e));
            if (this.q.get()) {
                us2VarD.s("po", "1");
                vc3.C.k.getClass();
                us2VarD.s("pil", String.valueOf(System.currentTimeMillis() - this.m));
            } else {
                us2VarD.s("po", "0");
            }
            ix0 ix0Var = lx0.je;
            tu0 tu0Var = tu0.e;
            if (((Boolean) tu0Var.c.a(ix0Var)).booleanValue() && h()) {
                zb3 zb3Var = vc3.C.c;
                us2VarD.s("foreground", true != zb3.g(this.f) ? "1" : "0");
                us2VarD.s("fg_show", true != this.p.get() ? "0" : "1");
            }
            if (((Boolean) tu0Var.c.a(lx0.ke)).booleanValue() && h()) {
                us2VarD.s("fg_al", true == vc3.C.g.k() ? "1" : "0");
            }
            us2VarD.t();
        }
    }

    @Override // defpackage.xl1
    public final void w() {
        if (a()) {
            d("adapter_shown").t();
        }
    }
}
