package defpackage;

import android.content.Context;
import android.os.Build;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class dg2 implements gb2 {
    public final Context a;
    public final tg2 b;
    public final String c;
    public final long d;
    public final long e;

    public dg2(Context context, vc2 vc2Var, tg2 tg2Var) {
        this.a = context;
        this.c = vc2Var.D();
        this.d = vc2Var.K();
        this.e = vc2Var.L();
        this.b = tg2Var;
    }

    public final void a(HashMap map) {
        String strU0;
        sp0 sp0Var;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        map.put("v", this.c);
        map.put("t", new Throwable());
        try {
            hp hpVar = (hp) map.get("gs");
            strU0 = (hpVar == null || (Build.VERSION.SDK_INT >= 31 && !hpVar.isDone()) || (sp0Var = (sp0) hpVar.get(this.d, timeUnit)) == null || sp0Var.u0().length() <= 1) ? "E" : sp0Var.u0();
        } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused) {
        }
        if (strU0.equals("E")) {
            try {
                hp hpVar2 = (hp) map.get("ai");
                if (hpVar2 != null) {
                    String str = (String) hpVar2.get(this.e, timeUnit);
                    if (!yd.v(str)) {
                        strU0 = str;
                    }
                }
            } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused2) {
            }
        }
        map.put("int", strU0);
    }

    @Override // defpackage.gb2
    public final HashMap b() {
        HashMap map = new HashMap();
        map.put("t", new Throwable());
        return map;
    }

    @Override // defpackage.gb2
    public final HashMap c() {
        HashMap mapA = this.b.a();
        a(mapA);
        return mapA;
    }

    @Override // defpackage.gb2
    public final HashMap h() {
        HashMap mapB = this.b.b(this.a, null);
        a(mapB);
        return mapB;
    }

    @Override // defpackage.gb2
    public final HashMap l() {
        HashMap mapC = this.b.c();
        a(mapC);
        return mapC;
    }
}
