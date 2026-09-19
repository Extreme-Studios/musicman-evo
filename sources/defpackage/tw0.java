package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tw0 extends d23 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    private static final tw0 zzl;
    private static volatile b33 zzm;
    private int zzf;
    private String zzg = "";
    private l23 zzh = e33.j;
    private int zzi = 1000;
    private int zzj = 1000;
    private int zzk = 1000;

    static {
        tw0 tw0Var = new tw0();
        zzl = tw0Var;
        d23.t(tw0.class, tw0Var);
    }

    public static tw0 z() {
        return zzl;
    }

    public final void A(String str) {
        str.getClass();
        this.zzf |= 1;
        this.zzg = str;
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            vo0 vo0Var = vo0.w;
            return new f33(zzl, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003᠌\u0001\u0004᠌\u0002\u0005᠌\u0003", new Object[]{"zzf", "zzg", "zzh", qw0.class, "zzi", vo0Var, "zzj", vo0Var, "zzk", vo0Var});
        }
        if (iZ == 3) {
            return new tw0();
        }
        if (iZ == 4) {
            return new sw0(zzl);
        }
        if (iZ == 5) {
            return zzl;
        }
        if (iZ != 6) {
            throw null;
        }
        b33 b33Var = zzm;
        if (b33Var != null) {
            return b33Var;
        }
        synchronized (tw0.class) {
            try {
                c23Var = zzm;
                if (c23Var == null) {
                    c23Var = new c23(zzl);
                    zzm = c23Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c23Var;
    }
}
