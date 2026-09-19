package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class l72 extends d23 {
    private static final l72 zzb;
    private static volatile b33 zzc;
    private l23 zza = e33.j;

    static {
        l72 l72Var = new l72();
        zzb = l72Var;
        d23.t(l72.class, l72Var);
    }

    public static i72 A() {
        return (i72) zzb.q();
    }

    public final void B(k72 k72Var) {
        l23 l23Var = this.zza;
        if (!((g13) l23Var).f) {
            int size = l23Var.size();
            this.zza = l23Var.z(size + size);
        }
        this.zza.add(k72Var);
    }

    public final void C() {
        this.zza = e33.j;
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zza", k72.class});
        }
        if (iZ == 3) {
            return new l72();
        }
        if (iZ == 4) {
            return new i72(zzb);
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
        synchronized (l72.class) {
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

    public final int z() {
        return this.zza.size();
    }
}
