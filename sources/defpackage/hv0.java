package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hv0 extends d23 {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final hv0 zzf;
    private static volatile b33 zzg;
    private int zzc;
    private int zzd;
    private int zze;

    static {
        hv0 hv0Var = new hv0();
        zzf = hv0Var;
        d23.t(hv0.class, hv0Var);
    }

    public static gv0 z() {
        return (gv0) zzf.q();
    }

    public final void A(int i) {
        this.zzd = ec.z(i);
        this.zzc |= 1;
    }

    public final void B(int i) {
        int i2 = 1;
        if (i == 1) {
            i2 = 0;
        } else if (i != 2) {
            if (i != 3) {
                i2 = 4;
                if (i != 4) {
                    throw null;
                }
            } else {
                i2 = 2;
            }
        }
        this.zze = i2;
        this.zzc |= 2;
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzc", "zzd", vo0.q, "zze", vo0.p});
        }
        if (iZ == 3) {
            return new hv0();
        }
        if (iZ == 4) {
            return new gv0(zzf);
        }
        if (iZ == 5) {
            return zzf;
        }
        if (iZ != 6) {
            throw null;
        }
        b33 b33Var = zzg;
        if (b33Var != null) {
            return b33Var;
        }
        synchronized (hv0.class) {
            try {
                c23Var = zzg;
                if (c23Var == null) {
                    c23Var = new c23(zzf);
                    zzg = c23Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c23Var;
    }
}
