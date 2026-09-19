package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fx2 extends d23 {
    private static final fx2 zzj;
    private static volatile b33 zzk;
    private int zza;
    private int zzb;
    private hx2 zzc;
    private n13 zzd;
    private n13 zze;
    private n13 zzf;
    private n13 zzg;
    private n13 zzh;
    private n13 zzi;

    static {
        fx2 fx2Var = new fx2();
        zzj = fx2Var;
        d23.t(fx2.class, fx2Var);
    }

    public fx2() {
        l13 l13Var = n13.g;
        this.zzd = l13Var;
        this.zze = l13Var;
        this.zzf = l13Var;
        this.zzg = l13Var;
        this.zzh = l13Var;
        this.zzi = l13Var;
    }

    public static fx2 H(n13 n13Var, v13 v13Var) {
        return (fx2) d23.m(zzj, n13Var, v13Var);
    }

    public static ex2 I() {
        return (ex2) zzj.q();
    }

    public static b33 J() {
        return zzj.o();
    }

    public final hx2 A() {
        hx2 hx2Var = this.zzc;
        return hx2Var == null ? hx2.F() : hx2Var;
    }

    public final n13 B() {
        return this.zzd;
    }

    public final n13 C() {
        return this.zze;
    }

    public final n13 D() {
        return this.zzf;
    }

    public final n13 E() {
        return this.zzg;
    }

    public final n13 F() {
        return this.zzh;
    }

    public final n13 G() {
        return this.zzi;
    }

    public final /* synthetic */ void K() {
        this.zzb = 0;
    }

    public final /* synthetic */ void L(hx2 hx2Var) {
        this.zzc = hx2Var;
        this.zza |= 1;
    }

    public final /* synthetic */ void M(l13 l13Var) {
        this.zzd = l13Var;
    }

    public final /* synthetic */ void N(l13 l13Var) {
        this.zze = l13Var;
    }

    public final /* synthetic */ void O(l13 l13Var) {
        this.zzf = l13Var;
    }

    public final /* synthetic */ void P(l13 l13Var) {
        this.zzg = l13Var;
    }

    public final /* synthetic */ void Q(l13 l13Var) {
        this.zzh = l13Var;
    }

    public final /* synthetic */ void R(l13 l13Var) {
        this.zzi = l13Var;
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zzj, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n\u0005\n\u0006\n\u0007\n\b\n", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (iZ == 3) {
            return new fx2();
        }
        if (iZ == 4) {
            return new ex2(zzj);
        }
        if (iZ == 5) {
            return zzj;
        }
        if (iZ != 6) {
            throw null;
        }
        b33 b33Var = zzk;
        if (b33Var != null) {
            return b33Var;
        }
        synchronized (fx2.class) {
            try {
                c23Var = zzk;
                if (c23Var == null) {
                    c23Var = new c23(zzj);
                    zzk = c23Var;
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
