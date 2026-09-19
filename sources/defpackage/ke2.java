package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class ke2 implements ge2 {
    public final ExecutorService a;
    public final o63 b;
    public final o63 c;
    public final tg2 d;
    public final o63 e;
    public final wc2 f;
    public final vc2 g;

    public ke2(ExecutorService executorService, o63 o63Var, o63 o63Var2, tg2 tg2Var, o63 o63Var3, wc2 wc2Var, vc2 vc2Var) {
        this.a = executorService;
        this.b = o63Var;
        this.c = o63Var2;
        this.d = tg2Var;
        this.e = o63Var3;
        this.f = wc2Var;
        this.g = vc2Var;
    }

    @Override // defpackage.ge2
    public final String a() {
        return "1.808261137";
    }

    @Override // defpackage.ge2
    public final hp b(Context context, View view, Activity activity) {
        mx0 mx0Var = (mx0) this.f.c();
        context.getClass();
        mx0Var.g = context;
        mx0Var.f = view;
        mx0Var.h = activity;
        mx0Var.e = true != this.g.G() ? "" : null;
        mx0Var.d = this.d.b(context, view);
        hp0 hp0VarB0 = sp0.B0();
        hp0VarB0.getClass();
        mx0Var.a = hp0VarB0;
        mx0Var.i = dd2.g;
        return ((qe2) ((q63) mx0Var.a().f).c()).a();
    }

    @Override // defpackage.ge2
    public final hp c() {
        return na1.F(new s22(6, this), this.a);
    }

    @Override // defpackage.ge2
    public final void d(InputEvent inputEvent) {
        if (inputEvent instanceof MotionEvent) {
            ne2 ne2Var = (ne2) this.e.c();
            MotionEvent motionEvent = (MotionEvent) inputEvent;
            synchronized (ne2Var) {
                try {
                    if (motionEvent.getAction() == 1) {
                        ne2Var.b = MotionEvent.obtain(motionEvent);
                    }
                    ne2Var.c.a(motionEvent);
                    ArrayDeque arrayDeque = ne2Var.a;
                    if (arrayDeque.size() >= 6) {
                        arrayDeque.remove();
                    }
                    arrayDeque.add(new me2(motionEvent));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // defpackage.ge2
    public final int e() {
        return 2;
    }

    @Override // defpackage.ge2
    public final hp f(Context context, String str, View view) {
        o63 o63Var = this.e;
        HashMap mapC = this.d.c();
        ne2 ne2Var = (ne2) o63Var.c();
        synchronized (ne2Var) {
            try {
                MotionEvent motionEvent = ne2Var.b;
                if (motionEvent != null) {
                    mapC.put("nv", motionEvent);
                }
                mapC.put("oe", ne2Var.c);
                ArrayDeque arrayDeque = ne2Var.a;
                mapC.put("ro", arrayDeque.toArray(new me2[arrayDeque.size()]));
                ne2Var.c = new le2();
                arrayDeque.clear();
                MotionEvent motionEvent2 = ne2Var.b;
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                    ne2Var.b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        mx0 mx0Var = (mx0) this.f.c();
        context.getClass();
        mx0Var.g = context;
        mx0Var.f = view;
        mx0Var.h = null;
        mx0Var.e = str;
        mx0Var.d = mapC;
        mx0Var.i = dd2.h;
        hp0 hp0VarB0 = sp0.B0();
        hp0VarB0.getClass();
        mx0Var.a = hp0VarB0;
        return ((qe2) ((q63) mx0Var.a().f).c()).a();
    }

    @Override // defpackage.ge2
    public final hp h(Context context) {
        mx0 mx0Var = (mx0) this.f.c();
        mx0Var.g = context;
        mx0Var.d = this.d.a();
        hp0 hp0VarB0 = sp0.B0();
        hp0VarB0.getClass();
        mx0Var.a = hp0VarB0;
        mx0Var.i = dd2.f;
        return ((qe2) ((q63) mx0Var.a().f).c()).a();
    }
}
