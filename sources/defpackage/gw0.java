package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gw0 extends d23 {
    public static final int zza = 1;
    private static final gw0 zzc;
    private static volatile b33 zzd;
    private l23 zzb = e33.j;

    static {
        gw0 gw0Var = new gw0();
        zzc = gw0Var;
        d23.t(gw0.class, gw0Var);
    }

    public static bw0 z() {
        return (bw0) zzc.q();
    }

    public final void A(aw0 aw0Var) {
        l23 l23Var = this.zzb;
        if (!((g13) l23Var).f) {
            int size = l23Var.size();
            this.zzb = l23Var.z(size + size);
        }
        this.zzb.add(aw0Var);
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zzc, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", aw0.class});
        }
        if (iZ == 3) {
            return new gw0();
        }
        if (iZ == 4) {
            return new bw0(zzc);
        }
        if (iZ == 5) {
            return zzc;
        }
        if (iZ != 6) {
            throw null;
        }
        b33 b33Var = zzd;
        if (b33Var != null) {
            return b33Var;
        }
        synchronized (gw0.class) {
            try {
                c23Var = zzd;
                if (c23Var == null) {
                    c23Var = new c23(zzc);
                    zzd = c23Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c23Var;
    }
}
