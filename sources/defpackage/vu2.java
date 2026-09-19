package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vu2 extends d23 {
    private static final vu2 zzd;
    private static volatile b33 zze;
    private int zza;
    private xu2 zzb;
    private int zzc;

    static {
        vu2 vu2Var = new vu2();
        zzd = vu2Var;
        d23.t(vu2.class, vu2Var);
    }

    public static vu2 B(n13 n13Var, v13 v13Var) {
        return (vu2) d23.m(zzd, n13Var, v13Var);
    }

    public static uu2 C() {
        return (uu2) zzd.q();
    }

    public final int A() {
        return this.zzc;
    }

    public final /* synthetic */ void D(xu2 xu2Var) {
        this.zzb = xu2Var;
        this.zza |= 1;
    }

    public final /* synthetic */ void E(int i) {
        this.zzc = i;
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iZ == 3) {
            return new vu2();
        }
        if (iZ == 4) {
            return new uu2(zzd);
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
        synchronized (vu2.class) {
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

    public final xu2 z() {
        xu2 xu2Var = this.zzb;
        return xu2Var == null ? xu2.B() : xu2Var;
    }
}
