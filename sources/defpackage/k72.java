package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class k72 extends d23 {
    private static final k72 zzc;
    private static volatile b33 zzd;
    private int zza;
    private h72 zzb;

    static {
        k72 k72Var = new k72();
        zzc = k72Var;
        d23.t(k72.class, k72Var);
    }

    public static j72 z() {
        return (j72) zzc.q();
    }

    public final /* synthetic */ void A(h72 h72Var) {
        this.zzb = h72Var;
        this.zza |= 1;
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zzc, "\u0004\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0000\u0006ဉ\u0000", new Object[]{"zza", "zzb"});
        }
        if (iZ == 3) {
            return new k72();
        }
        if (iZ == 4) {
            return new j72(zzc);
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
        synchronized (k72.class) {
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
