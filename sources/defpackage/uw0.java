package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class uw0 extends d23 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    private static final uw0 zzn;
    private static volatile b33 zzo;
    private int zzg;
    private int zzh;
    private sv0 zzi;
    private sv0 zzj;
    private sv0 zzk;
    private l23 zzl = e33.j;
    private int zzm;

    static {
        uw0 uw0Var = new uw0();
        zzn = uw0Var;
        d23.t(uw0.class, uw0Var);
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zzn, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005\u001b\u0006င\u0004", new Object[]{"zzg", "zzh", "zzi", "zzj", "zzk", "zzl", sv0.class, "zzm"});
        }
        if (iZ == 3) {
            return new uw0();
        }
        if (iZ == 4) {
            return new jw0(zzn);
        }
        if (iZ == 5) {
            return zzn;
        }
        if (iZ != 6) {
            throw null;
        }
        b33 b33Var = zzo;
        if (b33Var != null) {
            return b33Var;
        }
        synchronized (uw0.class) {
            try {
                c23Var = zzo;
                if (c23Var == null) {
                    c23Var = new c23(zzn);
                    zzo = c23Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c23Var;
    }
}
