package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ww0 extends d23 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    public static final int zzg = 7;
    public static final int zzh = 8;
    private static final ww0 zzv;
    private static volatile b33 zzw;
    private int zzi;
    private sv0 zzk;
    private int zzl;
    private uv0 zzm;
    private int zzn;
    private String zzj = "";
    private int zzo = 1000;
    private int zzp = 1000;
    private int zzu = 1000;

    static {
        ww0 ww0Var = new ww0();
        zzv = ww0Var;
        d23.t(ww0.class, ww0Var);
    }

    public static ww0 z() {
        return zzv;
    }

    public final void A(String str) {
        this.zzi |= 1;
        this.zzj = str;
    }

    public final void B(uv0 uv0Var) {
        this.zzm = uv0Var;
        this.zzi |= 8;
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
            return new f33(zzv, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004ဉ\u0003\u0005င\u0004\u0006᠌\u0005\u0007᠌\u0006\b᠌\u0007", new Object[]{"zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", vo0Var, "zzp", vo0Var, "zzu", vo0Var});
        }
        if (iZ == 3) {
            return new ww0();
        }
        if (iZ == 4) {
            return new vw0(zzv);
        }
        if (iZ == 5) {
            return zzv;
        }
        if (iZ != 6) {
            throw null;
        }
        b33 b33Var = zzw;
        if (b33Var != null) {
            return b33Var;
        }
        synchronized (ww0.class) {
            try {
                c23Var = zzw;
                if (c23Var == null) {
                    c23Var = new c23(zzv);
                    zzw = c23Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c23Var;
    }
}
