package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ip0 extends d23 {
    private static final ip0 zzc;
    private static volatile b33 zzd;
    private int zza;
    private int zzb;

    static {
        ip0 ip0Var = new ip0();
        zzc = ip0Var;
        d23.t(ip0.class, ip0Var);
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zzc, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zza", "zzb", vo0.i});
        }
        if (iZ == 3) {
            return new ip0();
        }
        if (iZ == 4) {
            return new xo0(zzc);
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
        synchronized (ip0.class) {
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
}
