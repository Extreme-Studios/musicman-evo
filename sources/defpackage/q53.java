package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class q53 extends d23 {
    private static final q53 zzd;
    private static volatile b33 zze;
    private int zza;
    private int zzb;
    private String zzc = "";

    static {
        q53 q53Var = new q53();
        zzd = q53Var;
        d23.t(q53.class, q53Var);
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zzd, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"zza", "zzb", k43.r, "zzc"});
        }
        if (iZ == 3) {
            return new q53();
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
        synchronized (q53.class) {
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
