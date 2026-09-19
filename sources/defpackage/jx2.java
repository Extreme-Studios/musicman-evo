package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jx2 extends d23 {
    private static final jx2 zze;
    private static volatile b33 zzf;
    private int zza;
    private lx2 zzb;
    private int zzc;
    private n13 zzd = n13.g;

    static {
        jx2 jx2Var = new jx2();
        zze = jx2Var;
        d23.t(jx2.class, jx2Var);
    }

    public static jx2 C(n13 n13Var, v13 v13Var) {
        return (jx2) d23.m(zze, n13Var, v13Var);
    }

    public static ix2 D() {
        return (ix2) zze.q();
    }

    public final int A() {
        return this.zzc;
    }

    public final n13 B() {
        return this.zzd;
    }

    public final /* synthetic */ void E(lx2 lx2Var) {
        this.zzb = lx2Var;
        this.zza |= 1;
    }

    public final /* synthetic */ void F(int i) {
        this.zzc = i;
    }

    public final /* synthetic */ void G(l13 l13Var) {
        this.zzd = l13Var;
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\n", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iZ == 3) {
            return new jx2();
        }
        if (iZ == 4) {
            return new ix2(zze);
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
        synchronized (jx2.class) {
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

    public final lx2 z() {
        lx2 lx2Var = this.zzb;
        return lx2Var == null ? lx2.D() : lx2Var;
    }
}
