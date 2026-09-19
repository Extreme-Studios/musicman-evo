package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cw2 extends d23 {
    private static final cw2 zzc;
    private static volatile b33 zzd;
    private int zza;
    private int zzb;

    static {
        cw2 cw2Var = new cw2();
        zzc = cw2Var;
        d23.t(cw2.class, cw2Var);
    }

    public static bw2 B() {
        return (bw2) zzc.q();
    }

    public static cw2 C() {
        return zzc;
    }

    public final int A() {
        return this.zzb;
    }

    public final /* synthetic */ void D(wv2 wv2Var) {
        this.zza = wv2Var.a();
    }

    public final /* synthetic */ void E(int i) {
        this.zzb = i;
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zza", "zzb"});
        }
        if (iZ == 3) {
            return new cw2();
        }
        if (iZ == 4) {
            return new bw2(zzc);
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
        synchronized (cw2.class) {
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

    public final wv2 z() {
        wv2 wv2VarB = wv2.b(this.zza);
        return wv2VarB == null ? wv2.UNRECOGNIZED : wv2VarB;
    }
}
