package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kv2 extends d23 {
    private static final kv2 zzd;
    private static volatile b33 zze;
    private int zza;
    private mv2 zzb;
    private int zzc;

    static {
        kv2 kv2Var = new kv2();
        zzd = kv2Var;
        d23.t(kv2.class, kv2Var);
    }

    public static kv2 A(n13 n13Var, v13 v13Var) {
        return (kv2) d23.m(zzd, n13Var, v13Var);
    }

    public static jv2 B() {
        return (jv2) zzd.q();
    }

    public final /* synthetic */ void C(mv2 mv2Var) {
        this.zzb = mv2Var;
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
            return new f33(zzd, "\u0000\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဉ\u0000\u0003\u000b", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iZ == 3) {
            return new kv2();
        }
        if (iZ == 4) {
            return new jv2(zzd);
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
        synchronized (kv2.class) {
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

    public final mv2 z() {
        mv2 mv2Var = this.zzb;
        return mv2Var == null ? mv2.B() : mv2Var;
    }
}
