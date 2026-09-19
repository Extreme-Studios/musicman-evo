package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ra2 extends d23 {
    private static final ra2 zzf;
    private static volatile b33 zzg;
    private int zza;
    private int zzb;
    private String zzc = "";
    private String zzd = "";
    private pa2 zze;

    static {
        ra2 ra2Var = new ra2();
        zzf = ra2Var;
        d23.t(ra2.class, ra2Var);
    }

    public static qa2 z() {
        return (qa2) zzf.q();
    }

    public final /* synthetic */ void A(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzc = str;
    }

    public final /* synthetic */ void B(pa2 pa2Var) {
        this.zze = pa2Var;
        this.zza |= 8;
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
            return new f33(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"zza", "zzb", vo0.y, "zzc", "zzd", "zze"});
        }
        if (iZ == 3) {
            return new ra2();
        }
        if (iZ == 4) {
            return new qa2(zzf);
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
        synchronized (ra2.class) {
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
