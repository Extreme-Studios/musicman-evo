package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tv2 extends d23 {
    private static final tv2 zze;
    private static volatile b33 zzf;
    private int zza;
    private int zzb;
    private n13 zzc = n13.g;
    private vv2 zzd;

    static {
        tv2 tv2Var = new tv2();
        zze = tv2Var;
        d23.t(tv2.class, tv2Var);
    }

    public static tv2 C(n13 n13Var, v13 v13Var) {
        return (tv2) d23.m(zze, n13Var, v13Var);
    }

    public static sv2 D() {
        return (sv2) zze.q();
    }

    public static b33 E() {
        return zze.o();
    }

    public final n13 A() {
        return this.zzc;
    }

    public final vv2 B() {
        vv2 vv2Var = this.zzd;
        return vv2Var == null ? vv2.D() : vv2Var;
    }

    public final /* synthetic */ void F(n13 n13Var) {
        this.zzc = n13Var;
    }

    public final /* synthetic */ void G(vv2 vv2Var) {
        this.zzd = vv2Var;
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
            return new f33(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003ဉ\u0000", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iZ == 3) {
            return new tv2();
        }
        if (iZ == 4) {
            return new sv2(zze);
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
        synchronized (tv2.class) {
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
