package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class a53 extends d23 {
    private static final a53 zze;
    private static volatile b33 zzf;
    private int zza;
    private int zzb;
    private n13 zzc;
    private n13 zzd;

    static {
        a53 a53Var = new a53();
        zze = a53Var;
        d23.t(a53.class, a53Var);
    }

    public a53() {
        l13 l13Var = n13.g;
        this.zzc = l13Var;
        this.zzd = l13Var;
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zze, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iZ == 3) {
            return new a53();
        }
        if (iZ == 4) {
            return new r43(zze);
        }
        if (iZ == 5) {
            return zze;
        }
        if (iZ != 6) {
            throw null;
        }
        b33 b33Var = zzf;
        if (b33Var != null) {
            return b33Var;
        }
        synchronized (a53.class) {
            try {
                c23Var = zzf;
                if (c23Var == null) {
                    c23Var = new c23(zze);
                    zzf = c23Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c23Var;
    }
}
