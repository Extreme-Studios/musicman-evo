package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ms0 extends d23 {
    private static final ms0 zzc;
    private static volatile b33 zzd;
    private int zza;
    private et0 zzb;

    static {
        ms0 ms0Var = new ms0();
        zzc = ms0Var;
        d23.t(ms0.class, ms0Var);
    }

    public static ms0 A(byte[] bArr, v13 v13Var) throws o23 {
        d23 d23VarX = d23.x(zzc, bArr, bArr.length, v13Var);
        d23.y(d23VarX);
        return (ms0) d23VarX;
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zzc, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zza", "zzb"});
        }
        if (iZ == 3) {
            return new ms0();
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
        synchronized (ms0.class) {
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

    public final et0 z() {
        et0 et0Var = this.zzb;
        return et0Var == null ? et0.D() : et0Var;
    }
}
