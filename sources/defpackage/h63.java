package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class h63 extends d23 {
    private static final h63 zze;
    private static volatile b33 zzf;
    private int zza;
    private String zzb = "";
    private int zzc;
    private int zzd;

    static {
        h63 h63Var = new h63();
        zze = h63Var;
        d23.t(h63.class, h63Var);
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zze, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003င\u0002", new Object[]{"zza", "zzb", "zzc", k43.y, "zzd"});
        }
        if (iZ == 3) {
            return new h63();
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
        synchronized (h63.class) {
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
