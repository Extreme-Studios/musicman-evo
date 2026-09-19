package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fu2 extends d23 {
    private static final fu2 zzd;
    private static volatile b33 zze;
    private int zza;
    private int zzb;
    private hu2 zzc;

    static {
        fu2 fu2Var = new fu2();
        zzd = fu2Var;
        d23.t(fu2.class, fu2Var);
    }

    public static fu2 B(n13 n13Var, v13 v13Var) {
        return (fu2) d23.m(zzd, n13Var, v13Var);
    }

    public static eu2 C() {
        return (eu2) zzd.q();
    }

    public final hu2 A() {
        hu2 hu2Var = this.zzc;
        return hu2Var == null ? hu2.B() : hu2Var;
    }

    public final /* synthetic */ void D(int i) {
        this.zzb = i;
    }

    public final /* synthetic */ void E(hu2 hu2Var) {
        this.zzc = hu2Var;
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
            return new f33(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iZ == 3) {
            return new fu2();
        }
        if (iZ == 4) {
            return new eu2(zzd);
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
        synchronized (fu2.class) {
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

    public final int z() {
        return this.zzb;
    }
}
