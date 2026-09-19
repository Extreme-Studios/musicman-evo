package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ow0 extends d23 {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final ow0 zzf;
    private static volatile b33 zzg;
    private int zzc;
    private boolean zzd;
    private int zze;

    static {
        ow0 ow0Var = new ow0();
        zzf = ow0Var;
        d23.t(ow0.class, ow0Var);
    }

    public static nw0 A() {
        return (nw0) zzf.q();
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
            return new f33(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001", new Object[]{"zzc", "zzd", "zze"});
        }
        if (iZ == 3) {
            return new ow0();
        }
        if (iZ == 4) {
            return new nw0(zzf);
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
        synchronized (ow0.class) {
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

    public final boolean z() {
        return this.zzd;
    }
}
