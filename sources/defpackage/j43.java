package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class j43 extends d23 {
    private static final j43 zzb;
    private static volatile b33 zzc;
    private l23 zza = e33.j;

    static {
        j43 j43Var = new j43();
        zzb = j43Var;
        d23.t(j43.class, j43Var);
    }

    public static i43 z() {
        return (i43) zzb.q();
    }

    public final void A(h43 h43Var) {
        l23 l23Var = this.zza;
        if (!((g13) l23Var).f) {
            int size = l23Var.size();
            this.zza = l23Var.z(size + size);
        }
        this.zza.add(h43Var);
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zza", h43.class});
        }
        if (iZ == 3) {
            return new j43();
        }
        if (iZ == 4) {
            return new i43(zzb);
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
        synchronized (j43.class) {
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
