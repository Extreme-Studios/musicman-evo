package defpackage;

import java.util.ArrayList;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class p31 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ uj1 g;
    public final /* synthetic */ t31 h;
    public final /* synthetic */ k31 i;
    public final /* synthetic */ ArrayList j;
    public final /* synthetic */ long k;

    public /* synthetic */ p31(uj1 uj1Var, t31 t31Var, k31 k31Var, ArrayList arrayList, long j, int i) {
        this.f = i;
        this.h = t31Var;
        this.i = k31Var;
        this.j = arrayList;
        this.k = j;
        this.g = uj1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String string;
        switch (this.f) {
            case 0:
                jn.p("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Trying to acquire lock");
                uj1 uj1Var = this.g;
                synchronized (uj1Var.b) {
                    try {
                        jn.p("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock acquired");
                        t31 t31Var = this.h;
                        if (((AtomicInteger) t31Var.b).get() != -1 && ((AtomicInteger) t31Var.b).get() != 1) {
                            ix0 ix0Var = lx0.g8;
                            tu0 tu0Var = tu0.e;
                            if (((Boolean) tu0Var.c.a(ix0Var)).booleanValue()) {
                                t31Var.o("SdkJavascriptFactory.loadJavascriptEngine.Runnable", new TimeoutException("Unable to fully load JS engine."));
                            } else {
                                t31Var.n();
                            }
                            za1.f.execute(new o31(this.i, 0));
                            String strValueOf = String.valueOf(tu0Var.c.a(lx0.d));
                            int i = ((AtomicInteger) t31Var.b).get();
                            int i2 = uj1Var.g;
                            ArrayList arrayList = this.j;
                            if (arrayList.isEmpty()) {
                                string = ". Still waiting for the engine to be loaded";
                            } else {
                                String strValueOf2 = String.valueOf(arrayList.get(0));
                                StringBuilder sb = new StringBuilder(strValueOf2.length() + 88);
                                sb.append(". While waiting for the /jsLoaded gmsg, observed the loadNewJavascriptEngine latency is ");
                                sb.append(strValueOf2);
                                string = sb.toString();
                            }
                            vc3.C.k.getClass();
                            long jCurrentTimeMillis = System.currentTimeMillis() - this.k;
                            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 107 + String.valueOf(i).length() + 36 + String.valueOf(i2).length() + string.length() + 39 + String.valueOf(jCurrentTimeMillis).length() + 26);
                            sb2.append("Could not finish the full JS engine loading in ");
                            sb2.append(strValueOf);
                            sb2.append(" ms. JS engine session reference status(fullLoadTimeout) is ");
                            sb2.append(i);
                            sb2.append(". Update status(fullLoadTimeout) is ");
                            sb2.append(i2);
                            sb2.append(string);
                            sb2.append(" ms. Total latency(fullLoadTimeout) is ");
                            sb2.append(jCurrentTimeMillis);
                            sb2.append(" ms at timeout. Rejecting.");
                            jn.p(sb2.toString());
                            jn.p("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released");
                            return;
                        }
                        jn.p("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released, the promise is already settled");
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            default:
                uj1 uj1Var2 = this.g;
                t31 t31Var2 = this.h;
                k31 k31Var = this.i;
                ArrayList arrayList2 = this.j;
                long j = this.k;
                jn.p("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Trying to acquire lock");
                synchronized (uj1Var2.b) {
                    try {
                        jn.p("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock acquired");
                        if (((AtomicInteger) t31Var2.b).get() != -1 && ((AtomicInteger) t31Var2.b).get() != 1) {
                            ix0 ix0Var2 = lx0.g8;
                            tu0 tu0Var2 = tu0.e;
                            if (((Boolean) tu0Var2.c.a(ix0Var2)).booleanValue()) {
                                t31Var2.o("SdkJavascriptFactory.loadJavascriptEngine.setLoadedListener", new TimeoutException("Unable to receive /jsLoaded GMSG."));
                            } else {
                                t31Var2.n();
                            }
                            za1.f.execute(new o31(k31Var, 1));
                            String strValueOf3 = String.valueOf(tu0Var2.c.a(lx0.c));
                            int i3 = ((AtomicInteger) t31Var2.b).get();
                            int i4 = uj1Var2.g;
                            String strValueOf4 = String.valueOf(arrayList2.get(0));
                            vc3.C.k.getClass();
                            long jCurrentTimeMillis2 = System.currentTimeMillis() - j;
                            StringBuilder sb3 = new StringBuilder(strValueOf3.length() + 94 + String.valueOf(i3).length() + 39 + String.valueOf(i4).length() + 57 + strValueOf4.length() + 42 + String.valueOf(jCurrentTimeMillis2).length() + 15);
                            sb3.append("Could not receive /jsLoaded in ");
                            sb3.append(strValueOf3);
                            sb3.append(" ms. JS engine session reference status(onEngLoadedTimeout) is ");
                            sb3.append(i3);
                            sb3.append(". Update status(onEngLoadedTimeout) is ");
                            sb3.append(i4);
                            sb3.append(". LoadNewJavascriptEngine(onEngLoadedTimeout) latency is ");
                            sb3.append(strValueOf4);
                            sb3.append(" ms. Total latency(onEngLoadedTimeout) is ");
                            sb3.append(jCurrentTimeMillis2);
                            sb3.append(" ms. Rejecting.");
                            jn.p(sb3.toString());
                            jn.p("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released");
                            return;
                        }
                        jn.p("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released, the promise is already settled");
                        return;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
        }
    }
}
