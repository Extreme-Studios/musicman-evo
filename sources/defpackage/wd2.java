package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wd2 extends d23 {
    private static final wd2 zzf;
    private static volatile b33 zzg;
    private int zza;
    private fe2 zzb;
    private n13 zzc;
    private n13 zzd;
    private int zze;

    static {
        wd2 wd2Var = new wd2();
        zzf = wd2Var;
        d23.t(wd2.class, wd2Var);
    }

    public wd2() {
        l13 l13Var = n13.g;
        this.zzc = l13Var;
        this.zzd = l13Var;
    }

    public static vd2 C() {
        return (vd2) zzf.q();
    }

    public final n13 A() {
        return this.zzc;
    }

    public final n13 B() {
        return this.zzd;
    }

    public final /* synthetic */ void D(fe2 fe2Var) {
        this.zzb = fe2Var;
        this.zza |= 1;
    }

    public final /* synthetic */ void E(n13 n13Var) {
        n13Var.getClass();
        this.zza |= 2;
        this.zzc = n13Var;
    }

    public final /* synthetic */ void F(n13 n13Var) {
        n13Var.getClass();
        this.zza |= 4;
        this.zzd = n13Var;
    }

    public final int G() {
        int iP = ej1.p(this.zze);
        if (iP == 0) {
            return 1;
        }
        return iP;
    }

    public final /* synthetic */ void H(int i) {
        this.zze = i - 1;
        this.zza |= 8;
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zzf, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002\u0004᠌\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", vo0.A});
        }
        if (iZ == 3) {
            return new wd2();
        }
        if (iZ == 4) {
            return new vd2(zzf);
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
        synchronized (wd2.class) {
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

    public final fe2 z() {
        fe2 fe2Var = this.zzb;
        return fe2Var == null ? fe2.D() : fe2Var;
    }
}
