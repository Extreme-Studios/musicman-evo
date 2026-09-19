package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class t72 extends d23 {
    private static final t72 zzc;
    private static volatile b33 zzd;
    private l23 zza = e33.j;
    private long zzb;

    static {
        t72 t72Var = new t72();
        zzc = t72Var;
        d23.t(t72.class, t72Var);
    }

    public static s72 z() {
        return (s72) zzc.q();
    }

    public final void A(z62 z62Var) {
        l23 l23Var = this.zza;
        if (!((g13) l23Var).f) {
            int size = l23Var.size();
            this.zza = l23Var.z(size + size);
        }
        this.zza.add(z62Var);
    }

    public final /* synthetic */ void B(long j) {
        this.zzb = j;
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zzc, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0002", new Object[]{"zza", z62.class, "zzb"});
        }
        if (iZ == 3) {
            return new t72();
        }
        if (iZ == 4) {
            return new s72(zzc);
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
        synchronized (t72.class) {
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
