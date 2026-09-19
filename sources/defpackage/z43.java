package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class z43 extends d23 {
    private static final z43 zzh;
    private static volatile b33 zzi;
    private int zza;
    private y43 zzb;
    private n13 zzd;
    private n13 zze;
    private int zzf;
    private byte zzg = 2;
    private l23 zzc = e33.j;

    static {
        z43 z43Var = new z43();
        zzh = z43Var;
        d23.t(z43.class, z43Var);
    }

    public z43() {
        l13 l13Var = n13.g;
        this.zzd = l13Var;
        this.zze = l13Var;
    }

    public static x43 z() {
        return (x43) zzh.q();
    }

    public final void A(w43 w43Var) {
        l23 l23Var = this.zzc;
        if (!((g13) l23Var).f) {
            int size = l23Var.size();
            this.zzc = l23Var.z(size + size);
        }
        this.zzc.add(w43Var);
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        switch (ec.z(i)) {
            case 0:
                return Byte.valueOf(this.zzg);
            case 1:
                this.zzg = d23Var == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return new f33(zzh, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003", new Object[]{"zza", "zzb", "zzc", w43.class, "zzd", "zze", "zzf"});
            case 3:
                return new z43();
            case 4:
                return new x43(zzh);
            case 5:
                return zzh;
            case 6:
                b33 b33Var = zzi;
                if (b33Var != null) {
                    return b33Var;
                }
                synchronized (z43.class) {
                    try {
                        c23Var = zzi;
                        if (c23Var == null) {
                            c23Var = new c23(zzh);
                            zzi = c23Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return c23Var;
            default:
                throw null;
        }
    }
}
