package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cq0 extends d23 {
    private static final cq0 zzc;
    private static volatile b33 zzd;
    private int zza;
    private String zzb = "";

    static {
        cq0 cq0Var = new cq0();
        zzc = cq0Var;
        d23.t(cq0.class, cq0Var);
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zzc, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zza", "zzb"});
        }
        if (iZ == 3) {
            return new cq0();
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
        synchronized (cq0.class) {
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
