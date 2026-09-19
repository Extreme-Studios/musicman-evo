package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rp0 extends d23 {
    private static final rp0 zzj;
    private static volatile b33 zzk;
    private int zza;
    private long zzb = -1;
    private long zzc = -1;
    private long zzd = -1;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;

    static {
        rp0 rp0Var = new rp0();
        zzj = rp0Var;
        d23.t(rp0.class, rp0Var);
    }

    public static qp0 z() {
        return (qp0) zzj.q();
    }

    public final /* synthetic */ void A(long j) {
        this.zza |= 1;
        this.zzb = j;
    }

    public final /* synthetic */ void B(long j) {
        this.zza |= 4;
        this.zzd = j;
    }

    public final /* synthetic */ void C(long j) {
        this.zza |= 8;
        this.zze = j;
    }

    public final /* synthetic */ void D(long j) {
        this.zza |= 16;
        this.zzf = j;
    }

    public final /* synthetic */ void E(long j) {
        this.zza |= 32;
        this.zzg = j;
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zzj, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (iZ == 3) {
            return new rp0();
        }
        if (iZ == 4) {
            return new qp0(zzj);
        }
        if (iZ == 5) {
            return zzj;
        }
        if (iZ != 6) {
            throw null;
        }
        b33 b33Var = zzk;
        if (b33Var != null) {
            return b33Var;
        }
        synchronized (rp0.class) {
            try {
                c23Var = zzk;
                if (c23Var == null) {
                    c23Var = new c23(zzj);
                    zzk = c23Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c23Var;
    }
}
