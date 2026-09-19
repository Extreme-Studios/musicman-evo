package defpackage;

import android.app.Activity;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class ph1 extends mi1 {
    public final md1 l;
    public final int m;
    public final Context n;
    public final z61 o;
    public final pn1 p;
    public final t62 q;
    public final ik1 r;
    public final boolean s;
    public final ua1 t;
    public final es1 u;
    public boolean v;

    public ph1(nm0 nm0Var, Context context, md1 md1Var, int i, z61 z61Var, pn1 pn1Var, t62 t62Var, ik1 ik1Var, ua1 ua1Var, es1 es1Var) {
        super(nm0Var);
        this.v = false;
        this.l = md1Var;
        this.n = context;
        this.m = i;
        this.o = z61Var;
        this.p = pn1Var;
        this.q = t62Var;
        this.r = ik1Var;
        this.s = ((Boolean) tu0.e.c.a(lx0.R5)).booleanValue();
        this.t = ua1Var;
        this.u = es1Var;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void c(Activity activity, boolean z) {
        md1 md1Var;
        x42 x42VarE;
        int i;
        t62 t62Var = this.q;
        ik1 ik1Var = this.r;
        Context context = activity;
        if (activity == null) {
            context = this.n;
        }
        boolean z2 = this.s;
        if (z2) {
            t62Var.L1(fl1.o);
        }
        vc3 vc3Var = vc3.C;
        zb3 zb3Var = vc3Var.c;
        pn1 pn1Var = this.p;
        if (!zb3.m(pn1Var.c())) {
            ix0 ix0Var = lx0.le;
            tu0 tu0Var = tu0.e;
            if (((Boolean) tu0Var.c.a(ix0Var)).booleanValue()) {
                zb3.l(context, this.b, this.u);
            }
            if (((Boolean) tu0Var.c.a(lx0.K0)).booleanValue() && zb3.g(context)) {
                jn.T("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://goo.gle/admob-interstitial-policies");
                ik1Var.b();
                if (((Boolean) tu0Var.c.a(lx0.L0)).booleanValue()) {
                    new ma2(context.getApplicationContext(), vc3Var.t.c()).a(((z42) this.a.b.h).b);
                    return;
                }
                return;
            }
        }
        if (((Boolean) tu0.e.c.a(lx0.Hc)).booleanValue() && (md1Var = this.l) != null && (x42VarE = md1Var.E()) != null && x42VarE.r0) {
            int i2 = x42VarE.s0;
            ua1 ua1Var = this.t;
            synchronized (ua1Var.f) {
                ta1 ta1Var = ua1Var.i;
                synchronized (ta1Var.f) {
                    i = ta1Var.k;
                }
            }
            if (i2 != i) {
                jn.T("The app open consent form has been shown.");
                ik1Var.N(a23.E(12, "The consent form has already been shown.", null));
                return;
            }
        }
        if (this.v) {
            jn.T("App open interstitial ad is already visible.");
            ik1Var.N(a23.E(10, null, null));
        }
        if (this.v) {
            return;
        }
        try {
            pn1Var.o(z, context, ik1Var);
            if (z2) {
                t62Var.R1();
            }
            this.v = true;
        } catch (on1 e) {
            ik1Var.P(e);
        }
    }

    public final void d() {
        nk1 nk1Var = this.c;
        nk1Var.getClass();
        nk1Var.L1(new iv(null));
        md1 md1Var = this.l;
        if (md1Var != null) {
            md1Var.destroy();
        }
    }

    public final void e(int i, long j) {
        String str;
        z61 z61Var = this.o;
        us2 us2VarA = ((es1) z61Var.g).a();
        us2VarA.s("gqi", ((z42) ((e52) z61Var.h).b.h).b);
        us2VarA.s("action", "ad_closed");
        us2VarA.s("show_time", String.valueOf(j));
        us2VarA.s("ad_format", "app_open_ad");
        int i2 = i - 1;
        if (i2 == 0) {
            str = "h";
        } else if (i2 == 1) {
            str = "bb";
        } else if (i2 == 2) {
            str = "cc";
        } else if (i2 != 3) {
            str = i2 != 4 ? "u" : "ac";
        } else {
            str = "cb";
        }
        us2VarA.s("acr", str);
        us2VarA.t();
    }
}
