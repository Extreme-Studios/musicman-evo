package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fv2 extends d23 {
    private static final fv2 zzc;
    private static volatile b33 zzd;
    private int zza;
    private int zzb;

    static {
        fv2 fv2Var = new fv2();
        zzc = fv2Var;
        d23.t(fv2.class, fv2Var);
    }

    public static fv2 B(n13 n13Var, v13 v13Var) {
        return (fv2) d23.m(zzc, n13Var, v13Var);
    }

    public static ev2 C() {
        return (ev2) zzc.q();
    }

    public final int A() {
        return this.zzb;
    }

    public final /* synthetic */ void D(int i) {
        this.zza = i;
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zzb", "zza"});
        }
        if (iZ == 3) {
            return new fv2();
        }
        if (iZ == 4) {
            return new ev2(zzc);
        }
        if (iZ == 5) {
            return zzc;
        }
        if (iZ != 6) {
            throw null;
        }
        b33 b33Var = zzd;
        if (b33Var != null) {
            return b33Var;
        }
        synchronized (fv2.class) {
            try {
                c23Var = zzd;
                if (c23Var == null) {
                    c23Var = new c23(zzc);
                    zzd = c23Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c23Var;
    }

    public final int z() {
        return this.zza;
    }
}
