package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dw0 extends d23 {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final dw0 zzf;
    private static volatile b33 zzg;
    private int zzc;
    private boolean zzd;
    private int zze;

    static {
        dw0 dw0Var = new dw0();
        zzf = dw0Var;
        d23.t(dw0.class, dw0Var);
    }

    public static dw0 A() {
        return zzf;
    }

    public static cw0 z() {
        return (cw0) zzf.q();
    }

    public final void B(boolean z) {
        this.zzc |= 1;
        this.zzd = z;
    }

    public final void C(int i) {
        this.zzc |= 2;
        this.zze = i;
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဋ\u0001", new Object[]{"zzc", "zzd", "zze"});
        }
        if (iZ == 3) {
            return new dw0();
        }
        if (iZ == 4) {
            return new cw0(zzf);
        }
        if (iZ == 5) {
            return zzf;
        }
        if (iZ != 6) {
            throw null;
        }
        b33 b33Var = zzg;
        if (b33Var != null) {
            return b33Var;
        }
        synchronized (dw0.class) {
            try {
                c23Var = zzg;
                if (c23Var == null) {
                    c23Var = new c23(zzf);
                    zzg = c23Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c23Var;
    }
}
