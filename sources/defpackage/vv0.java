package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vv0 extends d23 {
    private static final vv0 zzL;
    private static volatile b33 zzM = null;
    public static final int zza = 5;
    public static final int zzb = 6;
    public static final int zzc = 7;
    public static final int zzd = 8;
    public static final int zze = 9;
    public static final int zzf = 10;
    public static final int zzg = 11;
    public static final int zzh = 12;
    public static final int zzi = 13;
    public static final int zzj = 14;
    public static final int zzk = 15;
    public static final int zzl = 16;
    public static final int zzm = 17;
    public static final int zzn = 18;
    public static final int zzo = 19;
    public static final int zzp = 20;
    private iw0 zzA;
    private yv0 zzB;
    private int zzC;
    private int zzD;
    private sv0 zzE;
    private int zzF;
    private int zzG;
    private int zzH;
    private int zzI;
    private int zzJ;
    private long zzK;
    private int zzu;
    private hw0 zzv;
    private kw0 zzw;
    private lw0 zzx;
    private mw0 zzy;
    private wv0 zzz;

    static {
        vv0 vv0Var = new vv0();
        zzL = vv0Var;
        d23.t(vv0.class, vv0Var);
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zzL, "\u0004\u0010\u0000\u0001\u0005\u0014\u0010\u0000\u0000\u0000\u0005ဉ\u0000\u0006ဉ\u0001\u0007ဉ\u0002\bဉ\u0003\tဉ\u0004\nဉ\u0005\u000bဉ\u0006\fင\u0007\rင\b\u000eဉ\t\u000fင\n\u0010င\u000b\u0011င\f\u0012င\r\u0013င\u000e\u0014ဃ\u000f", new Object[]{"zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE", "zzF", "zzG", "zzH", "zzI", "zzJ", "zzK"});
        }
        if (iZ == 3) {
            return new vv0();
        }
        if (iZ == 4) {
            return new xo0(zzL);
        }
        if (iZ == 5) {
            return zzL;
        }
        if (iZ != 6) {
            throw null;
        }
        b33 b33Var = zzM;
        if (b33Var != null) {
            return b33Var;
        }
        synchronized (vv0.class) {
            try {
                c23Var = zzM;
                if (c23Var == null) {
                    c23Var = new c23(zzL);
                    zzM = c23Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c23Var;
    }
}
