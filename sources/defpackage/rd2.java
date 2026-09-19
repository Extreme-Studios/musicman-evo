package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rd2 extends d23 {
    private static final rd2 zzd;
    private static volatile b33 zze;
    private int zza;
    private l23 zzb = e33.j;
    private e43 zzc;

    static {
        rd2 rd2Var = new rd2();
        zzd = rd2Var;
        d23.t(rd2.class, rd2Var);
    }

    public static qd2 z() {
        return (qd2) zzd.q();
    }

    public final void A(pd2 pd2Var) {
        l23 l23Var = this.zzb;
        if (!((g13) l23Var).f) {
            int size = l23Var.size();
            this.zzb = l23Var.z(size + size);
        }
        this.zzb.add(pd2Var);
    }

    public final /* synthetic */ void B(e43 e43Var) {
        e43Var.getClass();
        this.zzc = e43Var;
        this.zza |= 1;
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zzd, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zza", "zzb", pd2.class, "zzc"});
        }
        if (iZ == 3) {
            return new rd2();
        }
        if (iZ == 4) {
            return new qd2(zzd);
        }
        if (iZ == 5) {
            return zzd;
        }
        if (iZ != 6) {
            throw null;
        }
        b33 b33Var = zze;
        if (b33Var != null) {
            return b33Var;
        }
        synchronized (rd2.class) {
            try {
                c23Var = zze;
                if (c23Var == null) {
                    c23Var = new c23(zzd);
                    zze = c23Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c23Var;
    }
}
