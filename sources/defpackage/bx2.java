package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bx2 extends d23 {
    private static final bx2 zze;
    private static volatile b33 zzf;
    private int zza;
    private dx2 zzb;
    private int zzc;
    private n13 zzd = n13.g;

    static {
        bx2 bx2Var = new bx2();
        zze = bx2Var;
        d23.t(bx2.class, bx2Var);
    }

    public static bx2 C(n13 n13Var, v13 v13Var) {
        return (bx2) d23.m(zze, n13Var, v13Var);
    }

    public static ax2 D() {
        return (ax2) zze.q();
    }

    public final int A() {
        return this.zzc;
    }

    public final n13 B() {
        return this.zzd;
    }

    public final /* synthetic */ void E(dx2 dx2Var) {
        this.zzb = dx2Var;
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
            return new bx2();
        }
        if (iZ == 4) {
            return new ax2(zze);
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
        synchronized (bx2.class) {
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

    public final dx2 z() {
        dx2 dx2Var = this.zzb;
        return dx2Var == null ? dx2.B() : dx2Var;
    }
}
