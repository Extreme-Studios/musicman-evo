package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class z62 extends d23 {
    private static final z62 zzc;
    private static volatile b33 zzd;
    private int zza;
    private long zzb;

    static {
        z62 z62Var = new z62();
        zzc = z62Var;
        d23.t(z62.class, z62Var);
    }

    public static y62 z() {
        return (y62) zzc.q();
    }

    public final /* synthetic */ void A(long j) {
        this.zzb = j;
    }

    public final /* synthetic */ void B(int i) {
        this.zza = i - 2;
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zzc, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0002", new Object[]{"zza", "zzb"});
        }
        if (iZ == 3) {
            return new z62();
        }
        if (iZ == 4) {
            return new y62(zzc);
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
        synchronized (z62.class) {
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
