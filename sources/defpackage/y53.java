package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class y53 extends d23 {
    private static final y53 zzb;
    private static volatile b33 zzc;
    private l23 zza = e33.j;

    static {
        y53 y53Var = new y53();
        zzb = y53Var;
        d23.t(y53.class, y53Var);
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zza", x53.class});
        }
        if (iZ == 3) {
            return new y53();
        }
        if (iZ == 4) {
            return new r43(zzb);
        }
        if (iZ == 5) {
            return zzb;
        }
        if (iZ != 6) {
            throw null;
        }
        b33 b33Var = zzc;
        if (b33Var != null) {
            return b33Var;
        }
        synchronized (y53.class) {
            try {
                c23Var = zzc;
                if (c23Var == null) {
                    c23Var = new c23(zzb);
                    zzc = c23Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c23Var;
    }
}
