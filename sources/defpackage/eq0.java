package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class eq0 extends d23 {
    private static final eq0 zzf;
    private static volatile b33 zzg;
    private int zza;
    private l23 zzb = e33.j;
    private n13 zzc = n13.g;
    private int zzd = 1;
    private int zze = 1;

    static {
        eq0 eq0Var = new eq0();
        zzf = eq0Var;
        d23.t(eq0.class, eq0Var);
    }

    public static dq0 z() {
        return (dq0) zzf.q();
    }

    public final void A(l13 l13Var) {
        l23 l23Var = this.zzb;
        if (!((g13) l23Var).f) {
            int size = l23Var.size();
            this.zzb = l23Var.z(size + size);
        }
        this.zzb.add(l13Var);
    }

    public final /* synthetic */ void B(l13 l13Var) {
        this.zza |= 1;
        this.zzc = l13Var;
    }

    public final /* synthetic */ void C(int i) {
        this.zzd = 4;
        this.zza |= 2;
    }

    public final /* synthetic */ void D(int i) {
        this.zze = i - 1;
        this.zza |= 4;
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003᠌\u0001\u0004᠌\u0002", new Object[]{"zza", "zzb", "zzc", "zzd", vo0.m, "zze", vo0.k});
        }
        if (iZ == 3) {
            return new eq0();
        }
        if (iZ == 4) {
            return new dq0(zzf);
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
        synchronized (eq0.class) {
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
