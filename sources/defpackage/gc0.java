package defpackage;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Surface;

/* JADX INFO: loaded from: classes.dex */
public final class gc0 {
    public final ub0 a;
    public final kc0 b;
    public boolean c;
    public long f;
    public boolean i;
    public boolean l;
    public boolean m;
    public int d = 0;
    public long e = -9223372036854775807L;
    public long g = -9223372036854775807L;
    public long h = -9223372036854775807L;
    public float j = 1.0f;
    public ig k = ig.k;

    public gc0(Context context, ub0 ub0Var) {
        this.a = ub0Var;
        this.b = new kc0(context);
    }

    public final void a(int i) {
        if (i == 0) {
            this.d = 1;
        } else if (i != 1) {
            this.d = Math.min(this.d, 2);
        } else {
            this.d = 0;
        }
    }

    public final void b() {
        this.c = true;
        this.k.getClass();
        this.f = qz1.r(SystemClock.elapsedRealtime());
        kc0 kc0Var = this.b;
        kc0Var.d = true;
        kc0Var.m = 0L;
        kc0Var.p = -1L;
        kc0Var.n = -1L;
        ic0 ic0Var = kc0Var.b;
        if (ic0Var != null) {
            DisplayManager displayManager = ic0Var.a;
            jc0 jc0Var = kc0Var.c;
            jc0Var.getClass();
            jc0Var.g.sendEmptyMessage(2);
            Looper looperMyLooper = Looper.myLooper();
            looperMyLooper.getClass();
            displayManager.registerDisplayListener(ic0Var, new Handler(looperMyLooper, null));
            ic0Var.b.a(displayManager.getDisplay(0));
        }
        kc0Var.c(false);
    }

    public final void c() {
        this.c = false;
        this.h = -9223372036854775807L;
        kc0 kc0Var = this.b;
        kc0Var.d = false;
        ic0 ic0Var = kc0Var.b;
        if (ic0Var != null) {
            ic0Var.a.unregisterDisplayListener(ic0Var);
            jc0 jc0Var = kc0Var.c;
            jc0Var.getClass();
            jc0Var.g.sendEmptyMessage(3);
        }
        kc0Var.d();
    }

    public final void d(Surface surface) {
        this.l = surface != null;
        this.m = false;
        kc0 kc0Var = this.b;
        if (kc0Var.e != surface) {
            kc0Var.d();
            kc0Var.e = surface;
            kc0Var.c(true);
        }
        this.d = Math.min(this.d, 1);
    }

    public final void e(float f) {
        kc0 kc0Var = this.b;
        kc0Var.f = f;
        qb0 qb0Var = kc0Var.a;
        qb0Var.a.a();
        qb0Var.b.a();
        qb0Var.c = false;
        qb0Var.d = -9223372036854775807L;
        qb0Var.e = 0;
        kc0Var.b();
    }

    public final boolean f(boolean z) {
        if (z && (this.d == 3 || (!this.l && this.m))) {
            this.h = -9223372036854775807L;
            return true;
        }
        if (this.h == -9223372036854775807L) {
            return false;
        }
        this.k.getClass();
        if (SystemClock.elapsedRealtime() < this.h) {
            return true;
        }
        this.h = -9223372036854775807L;
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b4  */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x014c, code lost:
    
        if (r4 > 100000) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0155, code lost:
    
        if (r29 >= r33) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x015a, code lost:
    
        if (r26.c != false) goto L86;
     */
    /* JADX WARN: Multi-variable type inference failed */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int g(long r27, long r29, long r31, long r33, boolean r35, boolean r36, defpackage.ec0 r37) {
        /*
            Method dump skipped, instruction units count: 591
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gc0.g(long, long, long, long, boolean, boolean, ec0):int");
    }

    public final void h(float f) {
        hn.v(f > 0.0f);
        if (f == this.j) {
            return;
        }
        this.j = f;
        kc0 kc0Var = this.b;
        kc0Var.i = f;
        kc0Var.m = 0L;
        kc0Var.p = -1L;
        kc0Var.n = -1L;
        kc0Var.c(false);
    }
}
