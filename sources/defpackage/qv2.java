package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qv2 extends d23 {
    private static final qv2 zzf;
    private static volatile b33 zzg;
    private int zza;
    private int zzb;
    private mv2 zzc;
    private n13 zzd;
    private n13 zze;

    static {
        qv2 qv2Var = new qv2();
        zzf = qv2Var;
        d23.t(qv2.class, qv2Var);
    }

    public qv2() {
        l13 l13Var = n13.g;
        this.zzd = l13Var;
        this.zze = l13Var;
    }

    public static qv2 D(n13 n13Var, v13 v13Var) {
        return (qv2) d23.m(zzf, n13Var, v13Var);
    }

    public static pv2 E() {
        return (pv2) zzf.q();
    }

    public static qv2 F() {
        return zzf;
    }

    public static b33 G() {
        return zzf.o();
    }

    public final mv2 A() {
        mv2 mv2Var = this.zzc;
        return mv2Var == null ? mv2.B() : mv2Var;
    }

    public final n13 B() {
        return this.zzd;
    }

    public final n13 C() {
        return this.zze;
    }

    public final /* synthetic */ void H(mv2 mv2Var) {
        this.zzc = mv2Var;
        this.zza |= 1;
    }

    public final /* synthetic */ void I(l13 l13Var) {
        this.zzd = l13Var;
    }

    public final /* synthetic */ void J(l13 l13Var) {
        this.zze = l13Var;
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zzf, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (iZ == 3) {
            return new qv2();
        }
        if (iZ == 4) {
            return new pv2(zzf);
        }
        if (iZ == 5) {
            return zzf;
        }
        if (iZ != 6) {
            throw null;
        }
        b33 b33Var = zzg;
        if (b33Var != null) {
            return b33Var;
        }
        synchronized (qv2.class) {
            try {
                c23Var = zzg;
                if (c23Var == null) {
                    c23Var = new c23(zzf);
                    zzg = c23Var;
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
