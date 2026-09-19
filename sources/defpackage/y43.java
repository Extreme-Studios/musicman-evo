package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class y43 extends d23 {
    private static final y43 zze;
    private static volatile b33 zzf;
    private int zza;
    private n13 zzb;
    private n13 zzc;
    private n13 zzd;

    static {
        y43 y43Var = new y43();
        zze = y43Var;
        d23.t(y43.class, y43Var);
    }

    public y43() {
        l13 l13Var = n13.g;
        this.zzb = l13Var;
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
            return new f33(zze, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iZ == 3) {
            return new y43();
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
        synchronized (y43.class) {
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
