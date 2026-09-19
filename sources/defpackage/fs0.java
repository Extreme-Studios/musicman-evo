package defpackage;

import android.net.NetworkCapabilities;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class fs0 extends js0 {
    public final dr0 h;
    public final long i;
    public final long j;

    public fs0(nr0 nr0Var, hp0 hp0Var, int i, dr0 dr0Var, long j, long j2) {
        super(nr0Var, "1MiCMWad12oLn5alnMxHwTvbBZm7RpaUcGFZ/LjrpVbPksWcBk53Qc+euKdOo/dG", "/cnUVQvNHFqi3ggOmiA4o/IdQSFHoegJ/H9a2xERT14=", hp0Var, i, 11);
        this.h = dr0Var;
        this.i = j;
        this.j = j2;
    }

    @Override // defpackage.js0
    public final void a() {
        dr0 dr0Var = this.h;
        if (dr0Var != null) {
            String str = (String) this.e.invoke(null, (NetworkCapabilities) dr0Var.g, Long.valueOf(this.i), Long.valueOf(this.j));
            cr0 cr0Var = new cr0();
            HashMap mapA = v51.A(str);
            if (mapA != null) {
                cr0Var.t = (Long) mapA.get(0);
                cr0Var.u = (Long) mapA.get(1);
                cr0Var.v = (Long) mapA.get(2);
            }
            hp0 hp0Var = this.d;
            synchronized (hp0Var) {
                try {
                    long jLongValue = cr0Var.t.longValue();
                    hp0Var.b();
                    ((sp0) hp0Var.g).I0(jLongValue);
                    if (((Long) cr0Var.u).longValue() >= 0) {
                        long jLongValue2 = ((Long) cr0Var.u).longValue();
                        hp0Var.b();
                        ((sp0) hp0Var.g).g0(jLongValue2);
                    }
                    if (((Long) cr0Var.v).longValue() >= 0) {
                        long jLongValue3 = ((Long) cr0Var.v).longValue();
                        hp0Var.b();
                        ((sp0) hp0Var.g).h0(jLongValue3);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
