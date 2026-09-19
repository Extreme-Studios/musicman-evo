package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ov2 extends d23 {
    private static final ov2 zze;
    private static volatile b33 zzf;
    private int zza;
    private int zzb;
    private qv2 zzc;
    private n13 zzd = n13.g;

    static {
        ov2 ov2Var = new ov2();
        zze = ov2Var;
        d23.t(ov2.class, ov2Var);
    }

    public static ov2 C(n13 n13Var, v13 v13Var) {
        return (ov2) d23.m(zze, n13Var, v13Var);
    }

    public static nv2 D() {
        return (nv2) zze.q();
    }

    public static b33 E() {
        return zze.o();
    }

    public final qv2 A() {
        qv2 qv2Var = this.zzc;
        return qv2Var == null ? qv2.F() : qv2Var;
    }

    public final n13 B() {
        return this.zzd;
    }

    public final /* synthetic */ void F(qv2 qv2Var) {
        this.zzc = qv2Var;
        this.zza |= 1;
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
            return new f33(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iZ == 3) {
            return new ov2();
        }
        if (iZ == 4) {
            return new nv2(zze);
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
        synchronized (ov2.class) {
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
