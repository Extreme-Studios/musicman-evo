package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class h43 extends d23 {
    private static final h43 zzd;
    private static volatile b33 zze;
    private int zza;
    private long zzb;
    private long zzc;

    static {
        h43 h43Var = new h43();
        zzd = h43Var;
        d23.t(h43.class, h43Var);
    }

    public static g43 z() {
        return (g43) zzd.q();
    }

    public final /* synthetic */ void A(int i) {
        this.zza = i;
    }

    public final /* synthetic */ void B(long j) {
        this.zzb = j;
    }

    public final /* synthetic */ void C(long j) {
        this.zzc = j;
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0002\u0003\u0002", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iZ == 3) {
            return new h43();
        }
        if (iZ == 4) {
            return new g43(zzd);
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
        synchronized (h43.class) {
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
}
