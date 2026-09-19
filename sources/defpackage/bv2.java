package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bv2 extends d23 {
    private static final bv2 zzc;
    private static volatile b33 zzd;
    private int zza;
    private int zzb;

    static {
        bv2 bv2Var = new bv2();
        zzc = bv2Var;
        d23.t(bv2.class, bv2Var);
    }

    public static bv2 B(n13 n13Var, v13 v13Var) {
        return (bv2) d23.m(zzc, n13Var, v13Var);
    }

    public static av2 C() {
        return (av2) zzc.q();
    }

    public final int A() {
        return this.zzb;
    }

    public final /* synthetic */ void D(int i) {
        this.zza = i;
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zzc, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zza", "zzb"});
        }
        if (iZ == 3) {
            return new bv2();
        }
        if (iZ == 4) {
            return new av2(zzc);
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
        synchronized (bv2.class) {
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
