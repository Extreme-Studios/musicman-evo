package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lu2 extends d23 {
    private static final lu2 zzd;
    private static volatile b33 zze;
    private int zza;
    private pu2 zzb;
    private aw2 zzc;

    static {
        lu2 lu2Var = new lu2();
        zzd = lu2Var;
        d23.t(lu2.class, lu2Var);
    }

    public static lu2 B(n13 n13Var, v13 v13Var) {
        return (lu2) d23.m(zzd, n13Var, v13Var);
    }

    public static ku2 C() {
        return (ku2) zzd.q();
    }

    public final aw2 A() {
        aw2 aw2Var = this.zzc;
        return aw2Var == null ? aw2.E() : aw2Var;
    }

    public final /* synthetic */ void D(pu2 pu2Var) {
        this.zzb = pu2Var;
        this.zza |= 1;
    }

    public final /* synthetic */ void E(aw2 aw2Var) {
        this.zzc = aw2Var;
        this.zza |= 2;
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iZ == 3) {
            return new lu2();
        }
        if (iZ == 4) {
            return new ku2(zzd);
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
        synchronized (lu2.class) {
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

    public final pu2 z() {
        pu2 pu2Var = this.zzb;
        return pu2Var == null ? pu2.C() : pu2Var;
    }
}
