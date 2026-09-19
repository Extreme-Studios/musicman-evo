package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fw0 extends d23 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final fw0 zzh;
    private static volatile b33 zzi;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;

    static {
        fw0 fw0Var = new fw0();
        zzh = fw0Var;
        d23.t(fw0.class, fw0Var);
    }

    public static ew0 A() {
        return (ew0) zzh.q();
    }

    public final void B(boolean z) {
        this.zzd |= 1;
        this.zze = z;
    }

    public final void C(boolean z) {
        this.zzd |= 2;
        this.zzf = z;
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဋ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (iZ == 3) {
            return new fw0();
        }
        if (iZ == 4) {
            return new ew0(zzh);
        }
        if (iZ == 5) {
            return zzh;
        }
        if (iZ != 6) {
            throw null;
        }
        b33 b33Var = zzi;
        if (b33Var != null) {
            return b33Var;
        }
        synchronized (fw0.class) {
            try {
                c23Var = zzi;
                if (c23Var == null) {
                    c23Var = new c23(zzh);
                    zzi = c23Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c23Var;
    }

    public final void z(int i) {
        this.zzd |= 4;
        this.zzg = i;
    }
}
