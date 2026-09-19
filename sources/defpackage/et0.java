package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class et0 extends d23 {
    private static final et0 zzd;
    private static volatile b33 zze;
    private int zza;
    private ft0 zzb;
    private n13 zzc = n13.g;

    static {
        et0 et0Var = new et0();
        zzd = et0Var;
        d23.t(et0.class, et0Var);
    }

    public static et0 D() {
        return zzd;
    }

    public final ft0 A() {
        ft0 ft0Var = this.zzb;
        return ft0Var == null ? ft0.B() : ft0Var;
    }

    public final boolean B() {
        return (this.zza & 2) != 0;
    }

    public final n13 C() {
        return this.zzc;
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zzd, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iZ == 3) {
            return new et0();
        }
        if (iZ == 4) {
            return new xo0(zzd);
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
        synchronized (et0.class) {
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

    public final boolean z() {
        return (this.zza & 1) != 0;
    }
}
