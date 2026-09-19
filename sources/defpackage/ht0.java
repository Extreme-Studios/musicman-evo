package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ht0 extends d23 {
    private static final ht0 zzg;
    private static volatile b33 zzh;
    private int zza;
    private String zzb = "";
    private String zzc = "";
    private long zzd;
    private long zze;
    private long zzf;

    static {
        ht0 ht0Var = new ht0();
        zzg = ht0Var;
        d23.t(ht0.class, ht0Var);
    }

    public static ht0 E(l13 l13Var) {
        ht0 ht0Var = zzg;
        v13 v13Var = v13.a;
        int i = h13.a;
        d23 d23VarM = d23.m(ht0Var, l13Var, v13.b);
        d23.y(d23VarM);
        return (ht0) d23VarM;
    }

    public static ht0 F(l13 l13Var, v13 v13Var) {
        return (ht0) d23.m(zzg, l13Var, v13Var);
    }

    public static gt0 G() {
        return (gt0) zzg.q();
    }

    public static ht0 H() {
        return zzg;
    }

    public final String A() {
        return this.zzc;
    }

    public final long B() {
        return this.zzd;
    }

    public final long C() {
        return this.zze;
    }

    public final long D() {
        return this.zzf;
    }

    public final /* synthetic */ void I(String str) {
        str.getClass();
        this.zza |= 1;
        this.zzb = str;
    }

    public final /* synthetic */ void J(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzc = str;
    }

    public final /* synthetic */ void K(long j) {
        this.zza |= 4;
        this.zzd = j;
    }

    public final /* synthetic */ void L(long j) {
        this.zza |= 8;
        this.zze = j;
    }

    public final /* synthetic */ void M(long j) {
        this.zza |= 16;
        this.zzf = j;
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zzg, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf"});
        }
        if (iZ == 3) {
            return new ht0();
        }
        if (iZ == 4) {
            return new gt0(zzg);
        }
        if (iZ == 5) {
            return zzg;
        }
        if (iZ != 6) {
            throw null;
        }
        b33 b33Var = zzh;
        if (b33Var != null) {
            return b33Var;
        }
        synchronized (ht0.class) {
            try {
                c23Var = zzh;
                if (c23Var == null) {
                    c23Var = new c23(zzg);
                    zzh = c23Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c23Var;
    }

    public final String z() {
        return this.zzb;
    }
}
