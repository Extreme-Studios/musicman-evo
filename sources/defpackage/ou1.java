package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class ou1 implements r63 {
    public final /* synthetic */ int a = 1;
    public final v63 b;
    public final yj1 c;
    public final v63 d;
    public final v63 e;

    public ou1(q63 q63Var, yj1 yj1Var, xe1 xe1Var, q63 q63Var2) {
        this.b = q63Var;
        this.c = yj1Var;
        this.d = xe1Var;
        this.e = q63Var2;
    }

    public a02 a() {
        return new a02((b12) this.b.c(), this.c.a(), ((xe1) this.d).a(), (sa1) this.e.c(), 1);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0058  */
    /* JADX WARN: Code duplicated, block: B:12:0x0077  */
    /* JADX WARN: Code duplicated, block: B:13:0x0082  */
    @Override // defpackage.v63
    public final Object c() {
        hp hpVarB;
        switch (this.a) {
            case 0:
                final zq0 zq0Var = (zq0) this.b.c();
                final Context contextA = ((xe1) this.d).a();
                i52 i52VarA = this.c.a();
                long jLongValue = ((Long) this.e.c()).longValue();
                ya1 ya1Var = za1.a;
                dq.D(ya1Var);
                ix0 ix0Var = lx0.U2;
                tu0 tu0Var = tu0.e;
                int iIntValue = ((Integer) tu0Var.c.a(ix0Var)).intValue();
                if (iIntValue != -1) {
                    if (Integer.toString(iIntValue).equals(jn.v(jn.z(i52VarA.d)))) {
                        vc3.C.k.getClass();
                        if (System.currentTimeMillis() - jLongValue < ((Integer) tu0Var.c.a(lx0.W2)).intValue()) {
                            final int i = 1;
                            hpVarB = ya1Var.b(new Callable() { // from class: nu1
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    int i2 = i;
                                    Context context = contextA;
                                    zq0 zq0Var2 = zq0Var;
                                    switch (i2) {
                                        case 0:
                                            return zq0Var2.b.d(context);
                                        default:
                                            return zq0Var2.b.b(context);
                                    }
                                }
                            });
                        } else {
                            final int i2 = 0;
                            hpVarB = ya1Var.b(new Callable() { // from class: nu1
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    int i3 = i2;
                                    Context context = contextA;
                                    zq0 zq0Var2 = zq0Var;
                                    switch (i3) {
                                        case 0:
                                            return zq0Var2.b.d(context);
                                        default:
                                            return zq0Var2.b.b(context);
                                    }
                                }
                            });
                        }
                    } else {
                        final int i3 = 0;
                        hpVarB = ya1Var.b(new Callable() { // from class: nu1
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                int i4 = i3;
                                Context context = contextA;
                                zq0 zq0Var2 = zq0Var;
                                switch (i4) {
                                    case 0:
                                        return zq0Var2.b.d(context);
                                    default:
                                        return zq0Var2.b.b(context);
                                }
                            }
                        });
                    }
                } else {
                    vc3.C.k.getClass();
                    if (System.currentTimeMillis() - jLongValue < ((Integer) tu0Var.c.a(lx0.W2)).intValue()) {
                        final int i4 = 1;
                        hpVarB = ya1Var.b(new Callable() { // from class: nu1
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                int i5 = i4;
                                Context context = contextA;
                                zq0 zq0Var2 = zq0Var;
                                switch (i5) {
                                    case 0:
                                        return zq0Var2.b.d(context);
                                    default:
                                        return zq0Var2.b.b(context);
                                }
                            }
                        });
                    } else {
                        final int i5 = 0;
                        hpVarB = ya1Var.b(new Callable() { // from class: nu1
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                int i6 = i5;
                                Context context = contextA;
                                zq0 zq0Var2 = zq0Var;
                                switch (i6) {
                                    case 0:
                                        return zq0Var2.b.d(context);
                                    default:
                                        return zq0Var2.b.b(context);
                                }
                            }
                        });
                    }
                }
                dq.D(hpVarB);
                return hpVarB;
            default:
                return a();
        }
    }

    public ou1(v63 v63Var, v63 v63Var2, yj1 yj1Var, v63 v63Var3) {
        this.b = v63Var;
        this.d = v63Var2;
        this.c = yj1Var;
        this.e = v63Var3;
    }
}
