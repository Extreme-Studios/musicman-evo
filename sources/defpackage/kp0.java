package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kp0 extends d23 {
    private static final kp0 zzc;
    private static volatile b33 zzd;
    private int zza;
    private long zzb = -1;

    static {
        kp0 kp0Var = new kp0();
        zzc = kp0Var;
        d23.t(kp0.class, kp0Var);
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zzc, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"zza", "zzb"});
        }
        if (iZ == 3) {
            return new kp0();
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
        synchronized (kp0.class) {
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
