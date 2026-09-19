package defpackage;

import java.io.FileInputStream;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class tb2 extends d23 {
    private static final tb2 zzb;
    private static volatile b33 zzc;
    private u23 zza = u23.g;

    static {
        tb2 tb2Var = new tb2();
        zzb = tb2Var;
        d23.t(tb2.class, tb2Var);
    }

    public static tb2 B(FileInputStream fileInputStream) throws o23 {
        tb2 tb2Var = zzb;
        q13 q13Var = new q13(fileInputStream);
        v13 v13Var = v13.a;
        int i = h13.a;
        d23 d23VarL = d23.l(tb2Var, q13Var, v13.b);
        d23.y(d23VarL);
        return (tb2) d23VarL;
    }

    public static tb2 C() {
        return zzb;
    }

    public final Map A() {
        return Collections.unmodifiableMap(this.zza);
    }

    public final u23 D() {
        u23 u23Var = this.zza;
        if (!u23Var.f) {
            this.zza = u23Var.a();
        }
        return this.zza;
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"zza", sb2.a});
        }
        if (iZ == 3) {
            return new tb2();
        }
        if (iZ == 4) {
            return new rb2(zzb);
        }
        if (iZ == 5) {
            return zzb;
        }
        if (iZ != 6) {
            throw null;
        }
        b33 b33Var = zzc;
        if (b33Var != null) {
            return b33Var;
        }
        synchronized (tb2.class) {
            try {
                c23Var = zzc;
                if (c23Var == null) {
                    c23Var = new c23(zzb);
                    zzc = c23Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c23Var;
    }

    public final int z() {
        return this.zza.size();
    }
}
