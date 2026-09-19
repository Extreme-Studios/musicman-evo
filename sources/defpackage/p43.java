package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class p43 extends d23 {
    private static final p43 zzc;
    private static volatile b33 zzd;
    private int zza;
    private String zzb = "";

    static {
        p43 p43Var = new p43();
        zzc = p43Var;
        d23.t(p43.class, p43Var);
    }

    public static o43 z() {
        return (o43) zzc.q();
    }

    public final /* synthetic */ void A(String str) {
        this.zza |= 1;
        this.zzb = str;
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zzc, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zza", "zzb"});
        }
        if (iZ == 3) {
            return new p43();
        }
        if (iZ == 4) {
            return new o43(zzc);
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
        synchronized (p43.class) {
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
}
