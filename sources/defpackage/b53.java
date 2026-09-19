package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class b53 extends d23 {
    private static final b53 zzi;
    private static volatile b33 zzj;
    private int zza;
    private a53 zzb;
    private n13 zzd;
    private n13 zze;
    private int zzf;
    private n13 zzg;
    private byte zzh = 2;
    private l23 zzc = e33.j;

    static {
        b53 b53Var = new b53();
        zzi = b53Var;
        d23.t(b53.class, b53Var);
    }

    public b53() {
        l13 l13Var = n13.g;
        this.zzd = l13Var;
        this.zze = l13Var;
        this.zzg = l13Var;
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        switch (ec.z(i)) {
            case 0:
                return Byte.valueOf(this.zzh);
            case 1:
                this.zzh = d23Var == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return new f33(zzi, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003\u0006ည\u0004", new Object[]{"zza", "zzb", "zzc", w43.class, "zzd", "zze", "zzf", "zzg"});
            case 3:
                return new b53();
            case 4:
                return new r43(zzi);
            case 5:
                return zzi;
            case 6:
                b33 b33Var = zzj;
                if (b33Var != null) {
                    return b33Var;
                }
                synchronized (b53.class) {
                    try {
                        c23Var = zzj;
                        if (c23Var == null) {
                            c23Var = new c23(zzi);
                            zzj = c23Var;
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
