package defpackage;

import android.content.Context;
import android.os.SystemClock;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class yl {
    public final Context f;
    public final String g;
    public final z61 h;
    public final s3 i;
    public final z3 j;
    public final int k;
    public final gm l;
    public final dm m;

    public yl(Context context, z61 z61Var, s3 s3Var, xl xlVar) {
        dq.g(context, "Null context is not permitted.");
        dq.g(z61Var, "Api must not be null.");
        dq.g(xlVar, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.f = context.getApplicationContext();
        String str = null;
        if (ej1.m()) {
            try {
                str = (String) Context.class.getMethod("getAttributionTag", null).invoke(context, null);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        this.g = str;
        this.h = z61Var;
        this.i = s3Var;
        this.j = new z3(z61Var, s3Var, str);
        dm dmVarE = dm.e(this.f);
        this.m = dmVarE;
        this.k = dmVarE.m.getAndIncrement();
        this.l = xlVar.a;
        za0 za0Var = dmVarE.r;
        za0Var.sendMessage(za0Var.obtainMessage(7, this));
    }

    public final r52 a() {
        r52 r52Var = new r52(2, false);
        Set set = Collections.EMPTY_SET;
        if (((n7) r52Var.g) == null) {
            r52Var.g = new n7(0);
        }
        ((n7) r52Var.g).addAll(set);
        Context context = this.f;
        r52Var.i = context.getClass().getName();
        r52Var.h = context.getPackageName();
        return r52Var;
    }

    public final ve3 b(int i, j30 j30Var) {
        boolean z;
        k30 k30Var = new k30();
        ve3 ve3Var = k30Var.a;
        dm dmVar = this.m;
        gm gmVar = this.l;
        za0 za0Var = dmVar.r;
        int i2 = j30Var.c;
        if (i2 != 0) {
            z3 z3Var = this.j;
            ia0 ia0Var = null;
            if (dmVar.a()) {
                ay ayVar = (ay) zx.o().g;
                if (ayVar == null) {
                    z = true;
                } else if (ayVar.g) {
                    z = ayVar.h;
                    z90 z90Var = (z90) dmVar.o.get(z3Var);
                    if (z90Var != null) {
                        Object obj = z90Var.g;
                        if (obj instanceof a8) {
                            a8 a8Var = (a8) obj;
                            if (a8Var.v != null && !a8Var.e()) {
                                eb ebVarA = ia0.a(z90Var, a8Var, i2);
                                if (ebVarA != null) {
                                    z90Var.q++;
                                    z = ebVarA.h;
                                }
                            }
                        }
                    }
                }
                ia0Var = new ia0(dmVar, i2, z3Var, z ? System.currentTimeMillis() : 0L, z ? SystemClock.elapsedRealtime() : 0L);
            }
            if (ia0Var != null) {
                za0Var.getClass();
                fx fxVar = new fx(za0Var, 1);
                ve3Var.getClass();
                ve3Var.b.b(new tk1(fxVar, ia0Var));
                ve3Var.h();
            }
        }
        za0Var.sendMessage(za0Var.obtainMessage(4, new ka0(new sa0(i, j30Var, k30Var, gmVar), dmVar.n.get(), this)));
        return ve3Var;
    }
}
