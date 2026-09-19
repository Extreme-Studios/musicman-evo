package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class o53 extends d23 {
    private static final o53 zzd;
    private static volatile b33 zze;
    private int zza;
    private int zzb;
    private int zzc;

    static {
        o53 o53Var = new o53();
        zzd = o53Var;
        d23.t(o53.class, o53Var);
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            k43 k43Var = k43.p;
            return new f33(zzd, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zza", "zzb", k43Var, "zzc", k43Var});
        }
        if (iZ == 3) {
            return new o53();
        }
        if (iZ == 4) {
            return new r43(zzd);
        }
        if (iZ == 5) {
            return zzd;
        }
        if (iZ != 6) {
            throw null;
        }
        b33 b33Var = zze;
        if (b33Var != null) {
            return b33Var;
        }
        synchronized (o53.class) {
            try {
                c23Var = zze;
                if (c23Var == null) {
                    c23Var = new c23(zzd);
                    zze = c23Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c23Var;
    }
}
