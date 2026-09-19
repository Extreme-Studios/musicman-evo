package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tx2 extends d23 {
    private static final tx2 zzd;
    private static volatile b33 zze;
    private int zza;
    private int zzb;
    private vx2 zzc;

    static {
        tx2 tx2Var = new tx2();
        zzd = tx2Var;
        d23.t(tx2.class, tx2Var);
    }

    public static tx2 B(n13 n13Var, v13 v13Var) {
        return (tx2) d23.m(zzd, n13Var, v13Var);
    }

    public static sx2 C() {
        return (sx2) zzd.q();
    }

    public final vx2 A() {
        vx2 vx2Var = this.zzc;
        return vx2Var == null ? vx2.B() : vx2Var;
    }

    public final /* synthetic */ void D(vx2 vx2Var) {
        this.zzc = vx2Var;
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
            return new f33(zzd, "\u0000\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003ဉ\u0000", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iZ == 3) {
            return new tx2();
        }
        if (iZ == 4) {
            return new sx2(zzd);
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
        synchronized (tx2.class) {
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

    public final int z() {
        return this.zzb;
    }
}
