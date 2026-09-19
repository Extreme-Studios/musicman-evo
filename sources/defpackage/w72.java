package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class w72 extends d23 {
    private static final w72 zzb;
    private static volatile b33 zzc;
    private l23 zza = e33.j;

    static {
        w72 w72Var = new w72();
        zzb = w72Var;
        d23.t(w72.class, w72Var);
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zza", v72.class});
        }
        if (iZ == 3) {
            return new w72();
        }
        if (iZ == 4) {
            return new jw0(zzb);
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
        synchronized (w72.class) {
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
}
