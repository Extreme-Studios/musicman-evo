package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class my1 implements xm2 {
    public final u62 a;
    public final dk1 b;
    public final e82 c;
    public final f82 d;
    public final Executor e;
    public final ScheduledExecutorService f;
    public final oi1 g;
    public final hy1 h;
    public final yw1 i;
    public final Context j;
    public final d72 k;
    public final mx0 l;
    public final cs1 m;

    public my1(Context context, u62 u62Var, hy1 hy1Var, dk1 dk1Var, e82 e82Var, f82 f82Var, oi1 oi1Var, ya1 ya1Var, ScheduledExecutorService scheduledExecutorService, yw1 yw1Var, d72 d72Var, mx0 mx0Var, cs1 cs1Var) {
        this.j = context;
        this.a = u62Var;
        this.h = hy1Var;
        this.b = dk1Var;
        this.c = e82Var;
        this.d = f82Var;
        this.g = oi1Var;
        this.e = ya1Var;
        this.f = scheduledExecutorService;
        this.i = yw1Var;
        this.k = d72Var;
        this.l = mx0Var;
        this.m = cs1Var;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005b  */
    public static String a(e52 e52Var) {
        ix0 ix0Var = lx0.X5;
        tu0 tu0Var = tu0.e;
        String strJ = "No fill.";
        String str = true != ((Boolean) tu0Var.c.a(ix0Var)).booleanValue() ? "No ad config." : "No fill.";
        z42 z42Var = (z42) e52Var.b.h;
        int i = z42Var.f;
        if (i == 0) {
            strJ = str;
        } else if (i < 200 || i >= 300) {
            strJ = (i < 300 || i >= 400) ? ec.j(new StringBuilder(String.valueOf(i).length() + 35), "Received error HTTP response code: ", i) : "No location header to follow redirect or too many redirects.";
        } else {
            if (((Boolean) tu0Var.c.a(lx0.W5)).booleanValue()) {
                strJ = str;
            }
        }
        xo2 xo2Var = z42Var.j;
        return xo2Var != null ? xo2Var.g : strJ;
    }

    @Override // defpackage.xm2
    public final hp b(Object obj) {
        hp hpVarY;
        int i;
        Bundle bundle;
        my1 my1Var = this;
        e52 e52Var = (e52) obj;
        ix0 ix0Var = lx0.m2;
        tu0 tu0Var = tu0.e;
        if (((Boolean) tu0Var.c.a(ix0Var)).booleanValue() && (bundle = (Bundle) e52Var.b.j) != null) {
            my1Var.m.e.putAll(bundle);
        }
        if (((Boolean) tu0Var.c.a(lx0.n2)).booleanValue()) {
            ec.q(vc3.C.k, my1Var.m.e, "rendering-start");
        }
        String strA = a(e52Var);
        yw1 yw1Var = my1Var.i;
        y91 y91Var = e52Var.b;
        z42 z42Var = (z42) y91Var.h;
        yw1Var.d = z42Var;
        if (((Boolean) tu0Var.c.a(lx0.W8)).booleanValue() && (i = z42Var.f) != 0 && (i < 200 || i >= 300)) {
            return na1.C(new ky1(strA, 3));
        }
        String str = z42Var.q;
        if (!((Boolean) tu0Var.c.a(lx0.V3)).booleanValue() || TextUtils.isEmpty(str)) {
            for (x42 x42Var : (List) y91Var.g) {
                yw1Var.b(x42Var, yw1Var.a.size());
                Iterator it = x42Var.a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        yw1Var.c(x42Var, 0L, a23.E(1, null, null), false);
                        break;
                    }
                    tw1 tw1VarA = my1Var.g.a((String) it.next(), x42Var.b);
                    if (tw1VarA != null && tw1VarA.a(e52Var, x42Var)) {
                        break;
                    }
                }
            }
        } else {
            List list = (List) y91Var.g;
            synchronized (yw1Var) {
                Map map = yw1Var.b;
                if (map.containsKey(str)) {
                    ee3 ee3Var = (ee3) map.get(str);
                    List list2 = yw1Var.a;
                    int iIndexOf = list2.indexOf(ee3Var);
                    try {
                        list2.remove(iIndexOf);
                    } catch (IndexOutOfBoundsException e) {
                        vc3.C.h.d("AdapterResponseInfoCollector.replaceAdapterResponseInfoEntry", e);
                    }
                    yw1Var.b.remove(str);
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        yw1Var.b((x42) it2.next(), iIndexOf);
                        iIndexOf++;
                    }
                }
            }
        }
        dk1 dk1Var = my1Var.b;
        wg1 wg1Var = new wg1(e52Var, my1Var.d, my1Var.c);
        Executor executor = my1Var.e;
        dk1Var.I1(wg1Var, executor);
        if (z42Var.r > 1) {
            mx0 mx0Var = my1Var.l;
            synchronized (mx0Var) {
                try {
                    if (!((AtomicBoolean) mx0Var.a).getAndSet(true)) {
                        List list3 = (List) e52Var.b.g;
                        if (list3.isEmpty()) {
                            ((tn2) mx0Var.g).e(new ky1(a(e52Var), 3));
                        } else {
                            mx0Var.i = e52Var;
                            hy1 hy1Var = (hy1) mx0Var.e;
                            mx0Var.h = new ay1(e52Var, hy1Var, (tn2) mx0Var.g);
                            hy1Var.a(list3);
                            for (x42 x42VarA = ((ay1) mx0Var.h).a(); x42VarA != null; x42VarA = ((ay1) mx0Var.h).a()) {
                                mx0Var.c(x42VarA);
                            }
                        }
                    }
                    hpVarY = (tn2) mx0Var.g;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            String strA2 = a(e52Var);
            u62 u62Var = my1Var.a;
            r62 r62Var = r62.q;
            Objects.requireNonNull(u62Var);
            hpVarY = new es0(u62Var, r62Var, null, u62.d, Collections.EMPTY_LIST, na1.C(new ky1(strA2, 3))).y();
            hy1 hy1Var2 = my1Var.h;
            synchronized (hy1Var2) {
                hy1Var2.a.getClass();
                hy1Var2.i = SystemClock.elapsedRealtime();
            }
            int i2 = 0;
            for (x42 x42Var2 : (List) y91Var.g) {
                for (String str2 : x42Var2.a) {
                    tw1 tw1VarA2 = my1Var.g.a(str2, x42Var2.b);
                    if (tw1VarA2 != null && tw1VarA2.a(e52Var, x42Var2)) {
                        es0 es0VarA = u62Var.a(hpVarY, r62.r);
                        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 15 + String.valueOf(str2).length());
                        sb.append("render-config-");
                        sb.append(i2);
                        sb.append("-");
                        sb.append(str2);
                        String string = sb.toString();
                        hp hpVar = (hp) es0VarA.h;
                        List list4 = (List) es0VarA.i;
                        hp hpVar2 = (hp) es0VarA.j;
                        u62 u62Var2 = (u62) es0VarA.k;
                        Object obj2 = es0VarA.f;
                        Objects.requireNonNull(u62Var2);
                        hpVarY = new es0(u62Var2, obj2, string, hpVar, list4, na1.J(hpVar2, Throwable.class, new c41(my1Var, x42Var2, e52Var, tw1VarA2, 5), u62Var2.a)).y();
                        break;
                    }
                    my1Var = this;
                }
                i2++;
                my1Var = this;
            }
            hpVarY.a(new ly1(0, hy1Var2), executor);
        }
        return hpVarY;
    }
}
