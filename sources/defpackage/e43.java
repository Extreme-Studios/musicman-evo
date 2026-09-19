package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class e43 extends d23 {
    private static final e43 zzc;
    private static volatile b33 zzd;
    private int zza;
    private String zzb = "";

    static {
        e43 e43Var = new e43();
        zzc = e43Var;
        d23.t(e43.class, e43Var);
    }

    public static a43 z() {
        return (a43) zzc.q();
    }

    public final /* synthetic */ void A(int i) {
        this.zza = 15;
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zzc, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"zza", "zzb"});
        }
        if (iZ == 3) {
            return new e43();
        }
        if (iZ == 4) {
            return new a43(zzc);
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
        synchronized (e43.class) {
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
