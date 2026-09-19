package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class e63 extends d23 {
    private static final e63 zzl;
    private static volatile b33 zzm;
    private int zza;
    private n13 zzb = n13.g;
    private h23 zzc;
    private long zzd;
    private h23 zze;
    private l23 zzf;
    private String zzg;
    private l23 zzh;
    private f63 zzi;
    private g63 zzj;
    private l03 zzk;

    static {
        e63 e63Var = new e63();
        zzl = e63Var;
        d23.t(e63.class, e63Var);
    }

    public e63() {
        e23 e23Var = e23.j;
        this.zzc = e23Var;
        this.zze = e23Var;
        e33 e33Var = e33.j;
        this.zzf = e33Var;
        this.zzg = "";
        this.zzh = e33Var;
    }

    public static e63 z(byte[] bArr, v13 v13Var) throws o23 {
        d23 d23VarX = d23.x(zzl, bArr, bArr.length, v13Var);
        d23.y(d23VarX);
        return (e63) d23VarX;
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zzl, "\u0001\n\u0000\u0001\u0001\u000f\n\u0000\u0004\u0000\u0001'\u0002ဂ\u0001\u0003'\u0004\u001b\u0005ဉ\u0003\u0007ဈ\u0002\tဉ\u0004\n\u001a\rည\u0000\u000fဉ\u0005", new Object[]{"zza", "zzc", "zzd", "zze", "zzh", a63.class, "zzi", "zzg", "zzj", "zzf", "zzb", "zzk"});
        }
        if (iZ == 3) {
            return new e63();
        }
        if (iZ == 4) {
            return new r43(zzl);
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
        synchronized (e63.class) {
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
