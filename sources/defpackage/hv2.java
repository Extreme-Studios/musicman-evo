package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hv2 extends d23 {
    private static final hv2 zzc;
    private static volatile b33 zzd;
    private int zza;
    private n13 zzb = n13.g;

    static {
        hv2 hv2Var = new hv2();
        zzc = hv2Var;
        d23.t(hv2.class, hv2Var);
    }

    public static hv2 B(n13 n13Var, v13 v13Var) {
        return (hv2) d23.m(zzc, n13Var, v13Var);
    }

    public static gv2 C() {
        return (gv2) zzc.q();
    }

    public static b33 D() {
        return zzc.o();
    }

    public final n13 A() {
        return this.zzb;
    }

    public final /* synthetic */ void E(n13 n13Var) {
        this.zzb = n13Var;
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zza", "zzb"});
        }
        if (iZ == 3) {
            return new hv2();
        }
        if (iZ == 4) {
            return new gv2(zzc);
        }
        if (iZ == 5) {
            return zzc;
        }
        if (iZ != 6) {
            throw null;
        }
        b33 b33Var = zzd;
        if (b33Var != null) {
            return b33Var;
        }
        synchronized (hv2.class) {
            try {
                c23Var = zzd;
                if (c23Var == null) {
                    c23Var = new c23(zzc);
                    zzd = c23Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c23Var;
    }

    public final int z() {
        return this.zza;
    }
}
