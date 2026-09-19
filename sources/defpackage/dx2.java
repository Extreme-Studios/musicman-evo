package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dx2 extends d23 {
    private static final dx2 zzb;
    private static volatile b33 zzc;
    private int zza;

    static {
        dx2 dx2Var = new dx2();
        zzb = dx2Var;
        d23.t(dx2.class, dx2Var);
    }

    public static cx2 A() {
        return (cx2) zzb.q();
    }

    public static dx2 B() {
        return zzb;
    }

    public final /* synthetic */ void C(wv2 wv2Var) {
        this.zza = wv2Var.a();
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"zza"});
        }
        if (iZ == 3) {
            return new dx2();
        }
        if (iZ == 4) {
            return new cx2(zzb);
        }
        if (iZ == 5) {
            return zzb;
        }
        if (iZ != 6) {
            throw null;
        }
        b33 b33Var = zzc;
        if (b33Var != null) {
            return b33Var;
        }
        synchronized (dx2.class) {
            try {
                c23Var = zzc;
                if (c23Var == null) {
                    c23Var = new c23(zzb);
                    zzc = c23Var;
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
