package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xu2 extends d23 {
    private static final xu2 zzb;
    private static volatile b33 zzc;
    private int zza;

    static {
        xu2 xu2Var = new xu2();
        zzb = xu2Var;
        d23.t(xu2.class, xu2Var);
    }

    public static wu2 A() {
        return (wu2) zzb.q();
    }

    public static xu2 B() {
        return zzb;
    }

    public final /* synthetic */ void C(int i) {
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
            return new f33(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zza"});
        }
        if (iZ == 3) {
            return new xu2();
        }
        if (iZ == 4) {
            return new wu2(zzb);
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
        synchronized (xu2.class) {
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

    public final int z() {
        return this.zza;
    }
}
