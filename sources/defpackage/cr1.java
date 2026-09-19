package defpackage;

import android.app.Activity;
import android.content.Context;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class cr1 extends mi1 {
    public final Context l;
    public final WeakReference m;
    public final pn1 n;
    public final t62 o;
    public final ik1 p;
    public final bl1 q;
    public final ui1 r;
    public final a91 s;
    public final ma2 t;
    public final g52 u;
    public final es1 v;
    public boolean w;

    public cr1(nm0 nm0Var, Context context, md1 md1Var, pn1 pn1Var, t62 t62Var, ik1 ik1Var, bl1 bl1Var, ui1 ui1Var, x42 x42Var, ma2 ma2Var, g52 g52Var, es1 es1Var) {
        super(nm0Var);
        this.w = false;
        this.l = context;
        this.n = pn1Var;
        this.m = new WeakReference(md1Var);
        this.o = t62Var;
        this.p = ik1Var;
        this.q = bl1Var;
        this.r = ui1Var;
        this.t = ma2Var;
        g81 g81Var = x42Var.l;
        this.s = new a91(g81Var != null ? g81Var.f : "", g81Var != null ? g81Var.g : 1);
        this.u = g52Var;
        this.v = es1Var;
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
        Context context;
        zb3 zb3Var = vc3.C.c;
        pn1 pn1Var = this.n;
        boolean zM = zb3.m(pn1Var.c());
        Context context2 = this.l;
        ik1 ik1Var = this.p;
        if (!zM) {
            ix0 ix0Var = lx0.le;
            tu0 tu0Var = tu0.e;
            kx0 kx0Var = tu0Var.c;
            kx0 kx0Var2 = tu0Var.c;
            if (((Boolean) kx0Var.a(ix0Var)).booleanValue()) {
                zb3.l(context2, this.b, this.v);
            }
            if (((Boolean) kx0Var2.a(lx0.K0)).booleanValue() && zb3.g(context2)) {
                jn.T("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://goo.gle/admob-interstitial-policies");
                ik1Var.b();
                if (((Boolean) kx0Var2.a(lx0.L0)).booleanValue()) {
                    this.t.a(((z42) this.a.b.h).b);
                    return;
                }
                return;
            }
        }
        if (this.w) {
            jn.T("The rewarded ad have been showed.");
            ik1Var.N(a23.E(10, null, null));
            return;
        }
        this.w = true;
        fl1 fl1Var = fl1.o;
        t62 t62Var = this.o;
        t62Var.L1(fl1Var);
        if (activity == null) {
            context = activity;
            context = context2;
        }
        try {
            context = activity;
            pn1Var.o(z, context, ik1Var);
            t62Var.R1();
        } catch (on1 e) {
            ik1Var.P(e);
        }
    }

    public final void finalize() throws Throwable {
        try {
            md1 md1Var = (md1) this.m.get();
            if (((Boolean) tu0.e.c.a(lx0.b7)).booleanValue()) {
                if (!this.w && md1Var != null) {
                    za1.f.execute(new xd1(md1Var, 6));
                }
            } else if (md1Var != null) {
                md1Var.destroy();
            }
        } finally {
            super.finalize();
        }
    }
}
