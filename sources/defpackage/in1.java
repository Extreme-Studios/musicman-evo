package defpackage;

import android.app.Activity;
import android.content.Context;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class in1 extends mi1 {
    public final Context l;
    public final WeakReference m;
    public final t62 n;
    public final pn1 o;
    public final ui1 p;
    public final ma2 q;
    public final ik1 r;
    public final ua1 s;
    public final es1 t;
    public boolean u;

    public in1(nm0 nm0Var, Context context, md1 md1Var, t62 t62Var, pn1 pn1Var, ui1 ui1Var, ma2 ma2Var, ik1 ik1Var, ua1 ua1Var, es1 es1Var) {
        super(nm0Var);
        this.u = false;
        this.l = context;
        this.m = new WeakReference(md1Var);
        this.n = t62Var;
        this.o = pn1Var;
        this.p = ui1Var;
        this.q = ma2Var;
        this.r = ik1Var;
        this.s = ua1Var;
        this.t = es1Var;
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
        x42 x42VarE;
        int i;
        Context context = this.l;
        ik1 ik1Var = this.r;
        t62 t62Var = this.n;
        t62Var.L1(fl1.o);
        zb3 zb3Var = vc3.C.c;
        pn1 pn1Var = this.o;
        if (!zb3.m(pn1Var.c())) {
            ix0 ix0Var = lx0.le;
            tu0 tu0Var = tu0.e;
            if (((Boolean) tu0Var.c.a(ix0Var)).booleanValue()) {
                zb3.l(context, this.b, this.t);
            }
            if (((Boolean) tu0Var.c.a(lx0.K0)).booleanValue() && zb3.g(context)) {
                jn.T("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://goo.gle/admob-interstitial-policies");
                ik1Var.b();
                if (((Boolean) tu0Var.c.a(lx0.L0)).booleanValue()) {
                    this.q.a(((z42) this.a.b.h).b);
                    return;
                }
                return;
            }
        }
        md1 md1Var = (md1) this.m.get();
        if (((Boolean) tu0.e.c.a(lx0.Hc)).booleanValue() && md1Var != null && (x42VarE = md1Var.E()) != null && x42VarE.r0) {
            int i2 = x42VarE.s0;
            ua1 ua1Var = this.s;
            synchronized (ua1Var.f) {
                ta1 ta1Var = ua1Var.i;
                synchronized (ta1Var.f) {
                    i = ta1Var.k;
                }
            }
            if (i2 != i) {
                jn.T("The interstitial consent form has been shown.");
                ik1Var.N(a23.E(12, "The consent form has already been shown.", null));
                return;
            }
        }
        if (this.u) {
            jn.T("The interstitial ad has been shown.");
            ik1Var.N(a23.E(10, null, null));
        }
        Context context2 = activity;
        if (this.u) {
            return;
        }
        if (activity == null) {
            context2 = context;
        }
        try {
            pn1Var.o(z, context2, ik1Var);
            t62Var.R1();
            this.u = true;
        } catch (on1 e) {
            ik1Var.P(e);
        }
    }

    public final void finalize() throws Throwable {
        try {
            md1 md1Var = (md1) this.m.get();
            if (((Boolean) tu0.e.c.a(lx0.b7)).booleanValue()) {
                if (!this.u && md1Var != null) {
                    za1.f.execute(new xd1(md1Var, 4));
                }
            } else if (md1Var != null) {
                md1Var.destroy();
            }
        } finally {
            super.finalize();
        }
    }
}
