package defpackage;

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes.dex */
public final class e22 implements m22 {
    public static final j12 k = new j12(new JSONArray().toString(), new Bundle(), "");
    public final ya1 a;
    public final ScheduledExecutorService b;
    public final ez1 c;
    public final Context d;
    public final i52 e;
    public final cz1 f;
    public final rr1 g;
    public final et1 h;
    public final int i;
    public final String j;

    public e22(ya1 ya1Var, ScheduledExecutorService scheduledExecutorService, String str, ez1 ez1Var, Context context, i52 i52Var, cz1 cz1Var, rr1 rr1Var, et1 et1Var, int i) {
        this.a = ya1Var;
        this.b = scheduledExecutorService;
        this.j = str;
        this.c = ez1Var;
        this.d = context;
        this.e = i52Var;
        this.f = cz1Var;
        this.g = rr1Var;
        this.h = et1Var;
        this.i = i;
    }

    @Override // defpackage.m22
    public final hp a() {
        int i = this.i;
        j12 j12Var = k;
        if (i == 2) {
            return na1.t(j12Var);
        }
        i52 i52Var = this.e;
        if (i52Var.s) {
            if (!Arrays.asList(((String) tu0.e.c.a(lx0.N1)).split(",")).contains(jn.v(jn.z(i52Var.d)))) {
                return na1.t(j12Var);
            }
        }
        return na1.G(new dr0(28, this), this.a);
    }

    public final void b(ArrayList arrayList, Map map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            hz1 hz1Var = (hz1) ((Map.Entry) it.next()).getValue();
            String str = hz1Var.a;
            Bundle bundle = this.e.d.r;
            Bundle bundle2 = bundle != null ? bundle.getBundle(str) : null;
            e22 e22Var = this;
            arrayList.add(e22Var.d(str, Collections.singletonList(hz1Var.e), bundle2, hz1Var.b, hz1Var.c));
            this = e22Var;
        }
    }

    @Override // defpackage.m22
    public final int c() {
        return 32;
    }

    public final fn2 d(String str, List list, Bundle bundle, boolean z, boolean z2) {
        c22 c22Var = new c22(this, str, list, bundle, z, z2);
        ya1 ya1Var = this.a;
        fn2 fn2VarR = fn2.r(na1.G(c22Var, ya1Var));
        ix0 ix0Var = lx0.H1;
        tu0 tu0Var = tu0.e;
        if (!((Boolean) tu0Var.c.a(ix0Var)).booleanValue()) {
            fn2VarR = (fn2) na1.K(fn2VarR, ((Long) tu0Var.c.a(lx0.A1)).longValue(), TimeUnit.MILLISECONDS, this.b);
        }
        return na1.I(fn2VarR, Throwable.class, new r11(str, 3), ya1Var);
    }
}
