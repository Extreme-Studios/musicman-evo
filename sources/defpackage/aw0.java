package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class aw0 extends d23 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final aw0 zzh;
    private static volatile b33 zzi;
    private int zzd;
    private int zze;
    private dw0 zzf;
    private fw0 zzg;

    static {
        aw0 aw0Var = new aw0();
        zzh = aw0Var;
        d23.t(aw0.class, aw0Var);
    }

    public static zv0 A() {
        return (zv0) zzh.q();
    }

    public final void B() {
        this.zze = ec.z(2);
        this.zzd |= 1;
    }

    public final void C(dw0 dw0Var) {
        dw0Var.getClass();
        this.zzf = dw0Var;
        this.zzd |= 2;
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", vo0.t, "zzf", "zzg"});
        }
        if (iZ == 3) {
            return new aw0();
        }
        if (iZ == 4) {
            return new zv0(zzh);
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
        synchronized (aw0.class) {
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

    public final void z(fw0 fw0Var) {
        this.zzg = fw0Var;
        this.zzd |= 4;
    }
}
