package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class te1 implements vq0 {
    public final Context f;
    public final zy1 g;

    public te1(Context context, d60 d60Var) {
        int i;
        zy1 zy1Var;
        this.f = context;
        ix0 ix0Var = lx0.X2;
        tu0 tu0Var = tu0.e;
        int iIntValue = ((Integer) tu0Var.c.a(ix0Var)).intValue();
        if (iIntValue != 1) {
            i = 3;
            if (iIntValue != 2 && iIntValue == 3) {
                i = 4;
            }
        } else {
            i = 2;
        }
        yc2 yc2VarD = zc2.D();
        float fFloatValue = ((Float) tu0Var.c.a(lx0.e3)).floatValue();
        yc2VarD.b();
        ((zc2) yc2VarD.g).F(fFloatValue);
        zc2 zc2Var = (zc2) yc2VarD.c();
        ad2 ad2VarD = bd2.D();
        boolean zBooleanValue = ((Boolean) tu0Var.c.a(lx0.f3)).booleanValue();
        ad2VarD.b();
        ((bd2) ad2VarD.g).F(zBooleanValue);
        long jLongValue = ((Long) tu0Var.c.a(lx0.h3)).longValue();
        ad2VarD.b();
        ((bd2) ad2VarD.g).G(jLongValue);
        bd2 bd2Var = (bd2) ad2VarD.c();
        uc2 uc2VarT = vc2.T();
        uc2VarT.b();
        ((vc2) uc2VarT.g).B(i);
        String str = d60Var.f;
        uc2VarT.b();
        ((vc2) uc2VarT.g).V(str);
        boolean zBooleanValue2 = ((Boolean) tu0Var.c.a(lx0.B2)).booleanValue();
        uc2VarT.b();
        ((vc2) uc2VarT.g).U(zBooleanValue2);
        boolean z = ((Integer) tu0Var.c.a(lx0.U2)).intValue() == -1;
        uc2VarT.b();
        ((vc2) uc2VarT.g).z(z);
        long jIntValue = ((Integer) tu0Var.c.a(lx0.W2)).intValue();
        uc2VarT.b();
        ((vc2) uc2VarT.g).a0(jIntValue);
        long jLongValue2 = ((Long) tu0Var.c.a(lx0.g3)).longValue();
        uc2VarT.b();
        ((vc2) uc2VarT.g).Y(jLongValue2);
        long jIntValue2 = ((Integer) tu0Var.c.a(lx0.V2)).intValue();
        uc2VarT.b();
        ((vc2) uc2VarT.g).X(jIntValue2);
        uc2VarT.b();
        ((vc2) uc2VarT.g).W(zc2Var);
        uc2VarT.b();
        ((vc2) uc2VarT.g).Z(bd2Var);
        vc2 vc2Var = (vc2) uc2VarT.c();
        ya1 ya1Var = za1.a;
        synchronized (zy1.h) {
            try {
                if (zy1.i == null) {
                    zy1.i = new zy1(context, ya1Var, vc2Var);
                }
                zy1Var = zy1.i;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.g = zy1Var;
        nd2 nd2Var = ((tc2) zy1Var.g).a;
        synchronized (nd2Var) {
            try {
                if (nd2Var.e != null) {
                    return;
                }
                Set set = (Set) nd2Var.b.c();
                ArrayList arrayList = new ArrayList(set.size());
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    arrayList.add(((md2) it.next()).a());
                }
                dh2 dh2Var = (dh2) nd2Var.d.c();
                qm2 qm2VarM = na1.M(new ym2(vj2.m(arrayList), true), lh0.v, nd2Var.c);
                dh2Var.d(2, qm2VarM);
                nd2Var.e = qm2VarM;
                Iterator it2 = ((Set) nd2Var.a.c()).iterator();
                while (it2.hasNext()) {
                    ((md2) it2.next()).a();
                }
                if (nd2Var.e != null) {
                } else {
                    throw null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // defpackage.vq0
    public final void a(int i, int i2, int i3) {
        f32 f32Var = ut0.f.a;
        Context context = this.f;
        long j = i3;
        MotionEvent motionEventObtain = MotionEvent.obtain(0L, j, 0, f32.b(context, i), f32.n(context.getResources().getDisplayMetrics(), i2), 0);
        zy1 zy1Var = this.g;
        zy1Var.u(motionEventObtain);
        motionEventObtain.recycle();
        MotionEvent motionEventObtain2 = MotionEvent.obtain(0L, j, 2, f32.n(context.getResources().getDisplayMetrics(), i), f32.n(context.getResources().getDisplayMetrics(), i2), 0);
        zy1Var.u(motionEventObtain2);
        motionEventObtain2.recycle();
        MotionEvent motionEventObtain3 = MotionEvent.obtain(0L, j, 1, f32.n(context.getResources().getDisplayMetrics(), i), f32.n(context.getResources().getDisplayMetrics(), i2), 0);
        zy1Var.u(motionEventObtain3);
        motionEventObtain3.recycle();
    }

    @Override // defpackage.vq0
    public final String b(Context context) {
        return this.g.s(context);
    }

    @Override // defpackage.vq0
    public final void c(StackTraceElement[] stackTraceElementArr) {
        zy1 zy1Var = this.g;
        List listAsList = Arrays.asList(stackTraceElementArr);
        yg2 yg2Var = ((tc2) zy1Var.g).c.b;
        synchronized (yg2Var) {
            ArrayList arrayList = yg2Var.a;
            arrayList.clear();
            arrayList.addAll(listAsList);
        }
    }

    @Override // defpackage.vq0
    public final String d(Context context) {
        return this.g.s(context);
    }

    @Override // defpackage.vq0
    public final void f(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return;
        }
        this.g.u(motionEvent);
    }

    @Override // defpackage.vq0
    public final String g(Context context, String str, View view) {
        return this.g.t(context, str, view);
    }

    @Override // defpackage.vq0
    public final String h(Context context, String str, View view, Activity activity) {
        return this.g.t(context, str, view);
    }

    @Override // defpackage.vq0
    public final String i(Context context, View view, Activity activity) {
        String string;
        qm2 qm2Var;
        tc2 tc2Var = (tc2) this.g.g;
        ch2 ch2VarA = tc2Var.d.a(4);
        try {
            try {
                try {
                    ch2VarA.a();
                    nd2 nd2Var = tc2Var.a;
                    synchronized (nd2Var) {
                        qm2Var = nd2Var.e;
                        if (qm2Var == null) {
                            throw null;
                        }
                    }
                    string = (String) na1.L(qm2Var, new c41(tc2Var, context, view, activity), cn2.f).get(tc2Var.e, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    ch2VarA.b(e);
                    string = "";
                } catch (TimeoutException e2) {
                    ch2VarA.b(e2);
                    string = Integer.toString(17);
                }
            } catch (ExecutionException e3) {
                e = e3;
                Throwable cause = e.getCause();
                if (cause != null) {
                    e = cause;
                }
                ch2VarA.b(e);
                string = Integer.toString(3);
            } catch (Throwable th) {
                ch2VarA.b(th);
                throw th;
            }
            ch2VarA.c();
            return string;
        } catch (Throwable th2) {
            ch2VarA.c();
            throw th2;
        }
    }

    @Override // defpackage.vq0
    public final void e(View view) {
    }
}
