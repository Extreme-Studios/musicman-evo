package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pu2 extends d23 {
    private static final pu2 zzd;
    private static volatile b33 zze;
    private int zza;
    private ru2 zzb;
    private int zzc;

    static {
        pu2 pu2Var = new pu2();
        zzd = pu2Var;
        d23.t(pu2.class, pu2Var);
    }

    public static ou2 B() {
        return (ou2) zzd.q();
    }

    public static pu2 C() {
        return zzd;
    }

    public final int A() {
        return this.zzc;
    }

    public final /* synthetic */ void D(ru2 ru2Var) {
        this.zzb = ru2Var;
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
            return new pu2();
        }
        if (iZ == 4) {
            return new ou2(zzd);
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
        synchronized (pu2.class) {
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

    public final ru2 z() {
        ru2 ru2Var = this.zzb;
        return ru2Var == null ? ru2.B() : ru2Var;
    }
}
