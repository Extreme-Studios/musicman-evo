package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rw2 extends d23 {
    private static final rw2 zzd;
    private static volatile b33 zze;
    private int zza;
    private int zzb;
    private tw2 zzc;

    static {
        rw2 rw2Var = new rw2();
        zzd = rw2Var;
        d23.t(rw2.class, rw2Var);
    }

    public static rw2 B(n13 n13Var, v13 v13Var) {
        return (rw2) d23.m(zzd, n13Var, v13Var);
    }

    public static qw2 C() {
        return (qw2) zzd.q();
    }

    public static b33 D() {
        return zzd.o();
    }

    public final tw2 A() {
        tw2 tw2Var = this.zzc;
        return tw2Var == null ? tw2.C() : tw2Var;
    }

    public final /* synthetic */ void E(tw2 tw2Var) {
        this.zzc = tw2Var;
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
            return new rw2();
        }
        if (iZ == 4) {
            return new qw2(zzd);
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
        synchronized (rw2.class) {
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
