package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pw2 extends d23 {
    private static final pw2 zzc;
    private static volatile b33 zzd;
    private int zza;
    private l23 zzb = e33.j;

    static {
        pw2 pw2Var = new pw2();
        zzc = pw2Var;
        d23.t(pw2.class, pw2Var);
    }

    public static mw2 z() {
        return (mw2) zzc.q();
    }

    public final /* synthetic */ void A(int i) {
        this.zza = i;
    }

    public final void B(ow2 ow2Var) {
        l23 l23Var = this.zzb;
        if (!((g13) l23Var).f) {
            int size = l23Var.size();
            this.zzb = l23Var.z(size + size);
        }
        this.zzb.add(ow2Var);
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zza", "zzb", ow2.class});
        }
        if (iZ == 3) {
            return new pw2();
        }
        if (iZ == 4) {
            return new mw2(zzc);
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
        synchronized (pw2.class) {
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
