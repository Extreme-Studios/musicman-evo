package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class uv0 extends d23 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final uv0 zzh;
    private static volatile b33 zzi;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        uv0 uv0Var = new uv0();
        zzh = uv0Var;
        d23.t(uv0.class, uv0Var);
    }

    public static tv0 A() {
        return (tv0) zzh.q();
    }

    public final void B(int i) {
        this.zzd |= 1;
        this.zze = i;
    }

    public final void C(int i) {
        this.zzd |= 2;
        this.zzf = i;
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (iZ == 3) {
            return new uv0();
        }
        if (iZ == 4) {
            return new tv0(zzh);
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
        synchronized (uv0.class) {
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
