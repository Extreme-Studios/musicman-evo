package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fe2 extends d23 {
    private static final fe2 zze;
    private static volatile b33 zzf;
    private int zza;
    private int zzb = 0;
    private Object zzc;
    private int zzd;

    static {
        fe2 fe2Var = new fe2();
        zze = fe2Var;
        d23.t(fe2.class, fe2Var);
    }

    public static xd2 C() {
        return (xd2) zze.q();
    }

    public static fe2 D() {
        return zze;
    }

    public final ft0 A() {
        return this.zzb == 2 ? (ft0) this.zzc : ft0.B();
    }

    public final ct0 B() {
        ct0 ct0VarB = ct0.b(this.zzd);
        return ct0VarB == null ? ct0.UNSUPPORTED : ct0VarB;
    }

    public final /* synthetic */ void E(ht0 ht0Var) {
        ht0Var.getClass();
        this.zzc = ht0Var;
        this.zzb = 1;
    }

    public final /* synthetic */ void F(ft0 ft0Var) {
        ft0Var.getClass();
        this.zzc = ft0Var;
        this.zzb = 2;
    }

    public final void G(ct0 ct0Var) {
        this.zzd = ct0Var.f;
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
            return new f33(zze, "\u0004\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003᠌\u0000", new Object[]{"zzc", "zzb", "zza", ht0.class, ft0.class, "zzd", vo0.n});
        }
        if (iZ == 3) {
            return new fe2();
        }
        if (iZ == 4) {
            return new xd2(zze);
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
        synchronized (fe2.class) {
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

    public final ht0 z() {
        return this.zzb == 1 ? (ht0) this.zzc : ht0.H();
    }
}
