package defpackage;

import android.view.View;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zr0 extends js0 {
    public final /* synthetic */ int h = 0;
    public final Object i;

    public zr0(nr0 nr0Var, hp0 hp0Var, int i, View view) {
        super(nr0Var, "UGogIgDf9q+IGA3QKHqW/91b9ZzRTVJqtfmUoLBkD310fwrDg1hJZvDQk8/WK1MH", "sEqRe1gPhw/PwjhUj/qVAEUjKSVJDrXHsmrE44pcjTE=", hp0Var, i, 57);
        this.i = view;
    }

    @Override // defpackage.js0
    public final void a() {
        int i = 2;
        switch (this.h) {
            case 0:
                Method method = this.e;
                ad0 ad0Var = (ad0) this.i;
                long[] jArr = (long[]) method.invoke(null, Long.valueOf(ad0Var.c), Long.valueOf(ad0Var.d), Long.valueOf(ad0Var.e), Long.valueOf(ad0Var.f));
                hp0 hp0Var = this.d;
                synchronized (hp0Var) {
                    long j = jArr[0];
                    hp0Var.b();
                    ((sp0) hp0Var.g).i0(j);
                    long j2 = jArr[1];
                    hp0Var.b();
                    ((sp0) hp0Var.g).j0(j2);
                    break;
                }
                return;
            case 1:
                Method method2 = this.e;
                zy1 zy1Var = (zy1) this.i;
                List list = (List) zy1Var.g;
                zy1Var.g = Collections.EMPTY_LIST;
                int iIntValue = ((Integer) method2.invoke(null, list)).intValue();
                hp0 hp0Var2 = this.d;
                synchronized (hp0Var2) {
                    int iX = ss0.x(iIntValue);
                    hp0Var2.b();
                    ((sp0) hp0Var2.g).t0(iX);
                    break;
                }
                return;
            case 2:
                StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) this.i;
                if (stackTraceElementArr != null) {
                    cr0 cr0Var = new cr0((String) this.e.invoke(null, stackTraceElementArr));
                    hp0 hp0Var3 = this.d;
                    synchronized (hp0Var3) {
                        try {
                            long jLongValue = cr0Var.t.longValue();
                            hp0Var3.b();
                            ((sp0) hp0Var3.g).M(jLongValue);
                            if (((Boolean) cr0Var.u).booleanValue()) {
                                if (true == ((Boolean) cr0Var.v).booleanValue()) {
                                    i = 1;
                                }
                                hp0Var3.b();
                                ((sp0) hp0Var3.g).q0(i);
                            } else {
                                hp0Var3.b();
                                ((sp0) hp0Var3.g).q0(3);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return;
                }
                return;
            default:
                View view = (View) this.i;
                if (view != null) {
                    ix0 ix0Var = lx0.L3;
                    tu0 tu0Var = tu0.e;
                    Boolean bool = (Boolean) tu0Var.c.a(ix0Var);
                    Boolean bool2 = (Boolean) tu0Var.c.a(lx0.Lb);
                    String str = (String) this.e.invoke(null, view, this.a.a.getResources().getDisplayMetrics(), bool, bool2);
                    qr0 qr0Var = new qr0(18);
                    HashMap mapA = v51.A(str);
                    if (mapA != null) {
                        qr0Var.s = (Long) mapA.get(0);
                        qr0Var.t = (Long) mapA.get(1);
                        qr0Var.u = (Long) mapA.get(2);
                        qr0Var.v = (Long) mapA.get(3);
                        qr0Var.w = (Long) mapA.get(4);
                    }
                    qp0 qp0VarZ = rp0.z();
                    long jLongValue2 = qr0Var.s.longValue();
                    qp0VarZ.b();
                    ((rp0) qp0VarZ.g).B(jLongValue2);
                    long jLongValue3 = qr0Var.t.longValue();
                    qp0VarZ.b();
                    ((rp0) qp0VarZ.g).C(jLongValue3);
                    long jLongValue4 = qr0Var.u.longValue();
                    qp0VarZ.b();
                    ((rp0) qp0VarZ.g).D(jLongValue4);
                    if (bool2.booleanValue()) {
                        long jLongValue5 = qr0Var.w.longValue();
                        qp0VarZ.b();
                        ((rp0) qp0VarZ.g).A(jLongValue5);
                    }
                    if (bool.booleanValue()) {
                        long jLongValue6 = qr0Var.v.longValue();
                        qp0VarZ.b();
                        ((rp0) qp0VarZ.g).E(jLongValue6);
                    }
                    hp0 hp0Var4 = this.d;
                    rp0 rp0Var = (rp0) qp0VarZ.c();
                    hp0Var4.b();
                    ((sp0) hp0Var4.g).V(rp0Var);
                    return;
                }
                return;
        }
    }

    public zr0(nr0 nr0Var, hp0 hp0Var, int i, ad0 ad0Var) {
        super(nr0Var, "OKoG374XK3cB1cjYFPuO/Bg6vy6AufzuCyu4QCURxkWhJwL4+NqQjs8XziSHB+CQ", "PjHrXBXcXoGkJe75zH8RZ0khapXmOV4o2gX+YgkGdus=", hp0Var, i, 85);
        this.i = ad0Var;
    }

    public zr0(nr0 nr0Var, hp0 hp0Var, int i, zy1 zy1Var) {
        super(nr0Var, "sl6J6ogR1CQFBNHXqYqYlsoHhQEQ3GzqykotbgjuxxtAslvwVDD28XhO/FGDcWNY", "etPaLFHhmzrmC9guV7/txSJ19uqkwWx/gSnrE4vBCvs=", hp0Var, i, 94);
        this.i = zy1Var;
    }

    public zr0(nr0 nr0Var, hp0 hp0Var, int i, StackTraceElement[] stackTraceElementArr) {
        super(nr0Var, "ffEAQyBH71yR4B2obQT/Qgb3Fo0ajWwFYmmZt2nfIS2fjNh6ir76IWAmhSUkzxpD", "s+erUKEK0AKg0XrZCH85OEIt0v0u2CGPZAaj/S6Q0Yk=", hp0Var, i, 45);
        this.i = stackTraceElementArr;
    }
}
