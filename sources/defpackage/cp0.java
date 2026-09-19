package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cp0 extends d23 {
    private static final cp0 zzi;
    private static volatile b33 zzj;
    private int zza;
    private long zzb;
    private long zzc;
    private int zzd;
    private long zzg;
    private String zze = "";
    private String zzf = "";
    private String zzh = "";

    static {
        cp0 cp0Var = new cp0();
        zzi = cp0Var;
        d23.t(cp0.class, cp0Var);
    }

    public static bp0 z() {
        return (bp0) zzi.q();
    }

    public final /* synthetic */ void A(long j) {
        this.zza |= 1;
        this.zzb = j;
    }

    public final /* synthetic */ void B(long j) {
        this.zza |= 2;
        this.zzc = j;
    }

    public final /* synthetic */ void C(String str) {
        this.zza |= 8;
        this.zze = str;
    }

    public final /* synthetic */ void D(String str) {
        str.getClass();
        this.zza |= 16;
        this.zzf = str;
    }

    public final /* synthetic */ void E(long j) {
        this.zza |= 32;
        this.zzg = j;
    }

    public final /* synthetic */ void F(String str) {
        this.zza |= 64;
        this.zzh = str;
    }

    public final /* synthetic */ void G(int i) {
        this.zzd = i - 1;
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
            return new f33(zzi, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003᠌\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဈ\u0006", new Object[]{"zza", "zzb", "zzc", "zzd", vo0.e, "zze", "zzf", "zzg", "zzh"});
        }
        if (iZ == 3) {
            return new cp0();
        }
        if (iZ == 4) {
            return new bp0(zzi);
        }
        if (iZ == 5) {
            return zzi;
        }
        if (iZ != 6) {
            throw null;
        }
        b33 b33Var = zzj;
        if (b33Var != null) {
            return b33Var;
        }
        synchronized (cp0.class) {
            try {
                c23Var = zzj;
                if (c23Var == null) {
                    c23Var = new c23(zzi);
                    zzj = c23Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c23Var;
    }
}
