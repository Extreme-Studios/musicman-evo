package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vw2 extends d23 {
    private static final vw2 zzd;
    private static volatile b33 zze;
    private int zza;
    private int zzb;
    private xw2 zzc;

    static {
        vw2 vw2Var = new vw2();
        zzd = vw2Var;
        d23.t(vw2.class, vw2Var);
    }

    public static vw2 B(n13 n13Var, v13 v13Var) {
        return (vw2) d23.m(zzd, n13Var, v13Var);
    }

    public static uw2 C() {
        return (uw2) zzd.q();
    }

    public static b33 D() {
        return zzd.o();
    }

    public final xw2 A() {
        xw2 xw2Var = this.zzc;
        return xw2Var == null ? xw2.D() : xw2Var;
    }

    public final /* synthetic */ void E(xw2 xw2Var) {
        this.zzc = xw2Var;
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
            return new vw2();
        }
        if (iZ == 4) {
            return new uw2(zzd);
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
        synchronized (vw2.class) {
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
