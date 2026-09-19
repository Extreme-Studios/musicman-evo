package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ov0 extends d23 {
    private static final ov0 zzB;
    private static volatile b33 zzC = null;
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    public static final int zzg = 7;
    public static final int zzh = 8;
    public static final int zzi = 9;
    public static final int zzj = 10;
    public static final int zzk = 11;
    private pv0 zzA;
    private int zzl;
    private int zzm = 1000;
    private int zzn = 1000;
    private int zzo;
    private int zzp;
    private int zzu;
    private int zzv;
    private int zzw;
    private int zzx;
    private int zzy;
    private int zzz;

    static {
        ov0 ov0Var = new ov0();
        zzB = ov0Var;
        d23.t(ov0.class, ov0Var);
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
            return new f33(zzB, "\u0004\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tင\b\nင\t\u000bဉ\n", new Object[]{"zzl", "zzm", vo0Var, "zzn", vo0Var, "zzo", "zzp", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA"});
        }
        if (iZ == 3) {
            return new ov0();
        }
        if (iZ == 4) {
            return new xo0(zzB);
        }
        if (iZ == 5) {
            return zzB;
        }
        if (iZ != 6) {
            throw null;
        }
        b33 b33Var = zzC;
        if (b33Var != null) {
            return b33Var;
        }
        synchronized (ov0.class) {
            try {
                c23Var = zzC;
                if (c23Var == null) {
                    c23Var = new c23(zzB);
                    zzC = c23Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c23Var;
    }
}
