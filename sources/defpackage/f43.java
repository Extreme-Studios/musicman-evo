package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class f43 extends d23 {
    private static final f43 zzc;
    private static volatile b33 zzd;
    private h23 zza;
    private h23 zzb;

    static {
        f43 f43Var = new f43();
        zzc = f43Var;
        d23.t(f43.class, f43Var);
    }

    public f43() {
        e23 e23Var = e23.j;
        this.zza = e23Var;
        this.zzb = e23Var;
    }

    public static f43 z(byte[] bArr, v13 v13Var) {
        return (f43) d23.n(zzc, bArr, v13Var);
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zzc, "\u0004\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0002\u0000\u0001\u0016\u0003\u0016", new Object[]{"zza", "zzb"});
        }
        if (iZ == 3) {
            return new f43();
        }
        if (iZ == 4) {
            return new jw0(zzc);
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
        synchronized (f43.class) {
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
