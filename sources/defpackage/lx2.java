package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lx2 extends d23 {
    private static final lx2 zzd;
    private static volatile b33 zze;
    private int zza;
    private int zzb;
    private int zzc;

    static {
        lx2 lx2Var = new lx2();
        zzd = lx2Var;
        d23.t(lx2.class, lx2Var);
    }

    public static kx2 C() {
        return (kx2) zzd.q();
    }

    public static lx2 D() {
        return zzd;
    }

    public final wv2 A() {
        wv2 wv2VarB = wv2.b(this.zzb);
        return wv2VarB == null ? wv2.UNRECOGNIZED : wv2VarB;
    }

    public final int B() {
        return this.zzc;
    }

    public final /* synthetic */ void E(wv2 wv2Var) {
        this.zza = wv2Var.a();
    }

    public final /* synthetic */ void F(wv2 wv2Var) {
        this.zzb = wv2Var.a();
    }

    public final /* synthetic */ void G(int i) {
        this.zzc = i;
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\u0004", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iZ == 3) {
            return new lx2();
        }
        if (iZ == 4) {
            return new kx2(zzd);
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
        synchronized (lx2.class) {
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

    public final wv2 z() {
        wv2 wv2VarB = wv2.b(this.zza);
        return wv2VarB == null ? wv2.UNRECOGNIZED : wv2VarB;
    }
}
