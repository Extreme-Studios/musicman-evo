package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rx2 extends d23 {
    private static final rx2 zze;
    private static volatile b33 zzf;
    private int zza;
    private int zzb;
    private vx2 zzc;
    private n13 zzd = n13.g;

    static {
        rx2 rx2Var = new rx2();
        zze = rx2Var;
        d23.t(rx2.class, rx2Var);
    }

    public static rx2 C(n13 n13Var, v13 v13Var) {
        return (rx2) d23.m(zze, n13Var, v13Var);
    }

    public static qx2 D() {
        return (qx2) zze.q();
    }

    public final vx2 A() {
        vx2 vx2Var = this.zzc;
        return vx2Var == null ? vx2.B() : vx2Var;
    }

    public final n13 B() {
        return this.zzd;
    }

    public final /* synthetic */ void E(vx2 vx2Var) {
        this.zzc = vx2Var;
        this.zza |= 1;
    }

    public final /* synthetic */ void F(n13 n13Var) {
        this.zzd = n13Var;
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iZ == 3) {
            return new rx2();
        }
        if (iZ == 4) {
            return new qx2(zze);
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
        synchronized (rx2.class) {
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

    public final int z() {
        return this.zzb;
    }
}
