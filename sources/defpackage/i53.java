package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class i53 extends d23 {
    private static final i53 zzf;
    private static volatile b33 zzg;
    private int zza;
    private int zzb;
    private String zzc = "";
    private n13 zzd;
    private n13 zze;

    static {
        i53 i53Var = new i53();
        zzf = i53Var;
        d23.t(i53.class, i53Var);
    }

    public i53() {
        l13 l13Var = n13.g;
        this.zzd = l13Var;
        this.zze = l13Var;
    }

    public static h53 z() {
        return (h53) zzf.q();
    }

    public final /* synthetic */ void A(String str) {
        this.zza |= 2;
        this.zzc = "image/png";
    }

    public final /* synthetic */ void B(n13 n13Var) {
        n13Var.getClass();
        this.zza |= 4;
        this.zzd = n13Var;
    }

    public final /* synthetic */ void C(int i) {
        this.zzb = 1;
        this.zza = 1 | this.zza;
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zza", "zzb", k43.l, "zzc", "zzd", "zze"});
        }
        if (iZ == 3) {
            return new i53();
        }
        if (iZ == 4) {
            return new h53(zzf);
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
        synchronized (i53.class) {
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
