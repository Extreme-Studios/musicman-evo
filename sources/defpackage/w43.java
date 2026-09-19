package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class w43 extends d23 {
    private static final w43 zze;
    private static volatile b33 zzf;
    private int zza;
    private n13 zzb;
    private n13 zzc;
    private byte zzd = 2;

    static {
        w43 w43Var = new w43();
        zze = w43Var;
        d23.t(w43.class, w43Var);
    }

    public w43() {
        l13 l13Var = n13.g;
        this.zzb = l13Var;
        this.zzc = l13Var;
    }

    public static v43 z() {
        return (v43) zze.q();
    }

    public final /* synthetic */ void A(l13 l13Var) {
        this.zza |= 1;
        this.zzb = l13Var;
    }

    public final /* synthetic */ void B(n13 n13Var) {
        this.zza |= 2;
        this.zzc = n13Var;
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        switch (ec.z(i)) {
            case 0:
                return Byte.valueOf(this.zzd);
            case 1:
                this.zzd = d23Var == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return new f33(zze, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001", new Object[]{"zza", "zzb", "zzc"});
            case 3:
                return new w43();
            case 4:
                return new v43(zze);
            case 5:
                return zze;
            case 6:
                b33 b33Var = zzf;
                if (b33Var != null) {
                    return b33Var;
                }
                synchronized (w43.class) {
                    try {
                        c23Var = zzf;
                        if (c23Var == null) {
                            c23Var = new c23(zze);
                            zzf = c23Var;
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
