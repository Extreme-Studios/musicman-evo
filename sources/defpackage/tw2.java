package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tw2 extends d23 {
    private static final tw2 zzb;
    private static volatile b33 zzc;
    private String zza = "";

    static {
        tw2 tw2Var = new tw2();
        zzb = tw2Var;
        d23.t(tw2.class, tw2Var);
    }

    public static tw2 A(n13 n13Var, v13 v13Var) {
        return (tw2) d23.m(zzb, n13Var, v13Var);
    }

    public static sw2 B() {
        return (sw2) zzb.q();
    }

    public static tw2 C() {
        return zzb;
    }

    public final /* synthetic */ void D(String str) {
        str.getClass();
        this.zza = str;
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zza"});
        }
        if (iZ == 3) {
            return new tw2();
        }
        if (iZ == 4) {
            return new sw2(zzb);
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
        synchronized (tw2.class) {
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

    public final String z() {
        return this.zza;
    }
}
