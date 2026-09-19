package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pd2 extends d23 {
    private static final pd2 zzc;
    private static volatile b33 zzd;
    private int zza;
    private uo0 zzb;

    static {
        pd2 pd2Var = new pd2();
        zzc = pd2Var;
        d23.t(pd2.class, pd2Var);
    }

    public static od2 z() {
        return (od2) zzc.q();
    }

    public final /* synthetic */ void A(uo0 uo0Var) {
        this.zzb = uo0Var;
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
            return new f33(zzc, "\u0004\u0001\u0000\u0001\u0012\u0012\u0001\u0000\u0000\u0000\u0012ဉ\u0000", new Object[]{"zza", "zzb"});
        }
        if (iZ == 3) {
            return new pd2();
        }
        if (iZ == 4) {
            return new od2(zzc);
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
        synchronized (pd2.class) {
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
