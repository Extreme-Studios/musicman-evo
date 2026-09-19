package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dt0 extends d23 {
    private static final dt0 zze;
    private static volatile b33 zzf;
    private int zza;
    private ht0 zzb;
    private n13 zzc;
    private n13 zzd;

    static {
        dt0 dt0Var = new dt0();
        zze = dt0Var;
        d23.t(dt0.class, dt0Var);
    }

    public dt0() {
        l13 l13Var = n13.g;
        this.zzc = l13Var;
        this.zzd = l13Var;
    }

    public static dt0 C(l13 l13Var, v13 v13Var) {
        return (dt0) d23.m(zze, l13Var, v13Var);
    }

    public static dt0 D(byte[] bArr, v13 v13Var) throws o23 {
        d23 d23VarX = d23.x(zze, bArr, bArr.length, v13Var);
        d23.y(d23VarX);
        return (dt0) d23VarX;
    }

    public final n13 A() {
        return this.zzc;
    }

    public final n13 B() {
        return this.zzd;
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zze, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iZ == 3) {
            return new dt0();
        }
        if (iZ == 4) {
            return new xo0(zze);
        }
        if (iZ == 5) {
            return zze;
        }
        if (iZ != 6) {
            throw null;
        }
        b33 b33Var = zzf;
        if (b33Var != null) {
            return b33Var;
        }
        synchronized (dt0.class) {
            try {
                c23Var = zzf;
                if (c23Var == null) {
                    c23Var = new c23(zze);
                    zzf = c23Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c23Var;
    }

    public final ht0 z() {
        ht0 ht0Var = this.zzb;
        return ht0Var == null ? ht0.H() : ht0Var;
    }
}
