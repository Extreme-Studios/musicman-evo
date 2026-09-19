package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vc2 extends d23 {
    private static final vc2 zzx;
    private static volatile b33 zzy;
    private int zza;
    private int zzb;
    private boolean zze;
    private zc2 zzf;
    private boolean zzg;
    private bd2 zzj;
    private boolean zzv;
    private boolean zzw;
    private boolean zzc = true;
    private String zzd = "unknown_host";
    private long zzh = 100;
    private long zzi = 2000;
    private long zzk = 200;
    private long zzl = 200;
    private long zzm = 20000;
    private String zzn = "";
    private String zzo = "";
    private long zzp = 500;
    private long zzu = 3000;

    static {
        vc2 vc2Var = new vc2();
        zzx = vc2Var;
        d23.t(vc2.class, vc2Var);
    }

    public static uc2 T() {
        return (uc2) zzx.q();
    }

    public final int A() {
        int i;
        int i2 = this.zzb;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                if (i2 != 2) {
                    i = i2 != 3 ? 0 : 4;
                } else {
                    i = 3;
                }
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public final /* synthetic */ void B(int i) {
        this.zzb = i - 1;
        this.zza |= 1;
    }

    public final boolean C() {
        return this.zzc;
    }

    public final String D() {
        return this.zzd;
    }

    public final boolean E() {
        return this.zze;
    }

    public final zc2 F() {
        zc2 zc2Var = this.zzf;
        return zc2Var == null ? zc2.E() : zc2Var;
    }

    public final boolean G() {
        return this.zzg;
    }

    public final long H() {
        return this.zzh;
    }

    public final long I() {
        return this.zzi;
    }

    public final bd2 J() {
        bd2 bd2Var = this.zzj;
        return bd2Var == null ? bd2.E() : bd2Var;
    }

    public final long K() {
        return this.zzk;
    }

    public final long L() {
        return this.zzl;
    }

    public final long M() {
        return this.zzm;
    }

    public final String N() {
        return this.zzn;
    }

    public final String O() {
        return this.zzo;
    }

    public final long P() {
        return this.zzp;
    }

    public final long Q() {
        return this.zzu;
    }

    public final boolean R() {
        return this.zzv;
    }

    public final boolean S() {
        return this.zzw;
    }

    public final /* synthetic */ void U(boolean z) {
        this.zza |= 2;
        this.zzc = z;
    }

    public final /* synthetic */ void V(String str) {
        str.getClass();
        this.zza |= 4;
        this.zzd = str;
    }

    public final /* synthetic */ void W(zc2 zc2Var) {
        this.zzf = zc2Var;
        this.zza |= 16;
    }

    public final /* synthetic */ void X(long j) {
        this.zza |= 64;
        this.zzh = j;
    }

    public final /* synthetic */ void Y(long j) {
        this.zza |= 128;
        this.zzi = j;
    }

    public final /* synthetic */ void Z(bd2 bd2Var) {
        this.zzj = bd2Var;
        this.zza |= 256;
    }

    public final /* synthetic */ void a0(long j) {
        this.zza |= 32768;
        this.zzu = j;
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zzx, "\u0004\u0012\u0000\u0001\u0001\u0013\u0012\u0000\u0000\u0000\u0001᠌\u0000\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဉ\u0004\u0006ဇ\u0005\u0007ဂ\u0007\bဉ\b\tဇ\u0001\nဂ\t\u000bဂ\n\fဂ\u000b\rဈ\f\u000eဈ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဇ\u0010\u0012ဂ\u0006\u0013ဇ\u0011", new Object[]{"zza", "zzb", vo0.z, "zzd", "zze", "zzf", "zzg", "zzi", "zzj", "zzc", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzu", "zzv", "zzh", "zzw"});
        }
        if (iZ == 3) {
            return new vc2();
        }
        if (iZ == 4) {
            return new uc2(zzx);
        }
        if (iZ == 5) {
            return zzx;
        }
        if (iZ != 6) {
            throw null;
        }
        b33 b33Var = zzy;
        if (b33Var != null) {
            return b33Var;
        }
        synchronized (vc2.class) {
            try {
                c23Var = zzy;
                if (c23Var == null) {
                    c23Var = new c23(zzx);
                    zzy = c23Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c23Var;
    }

    public final /* synthetic */ void z(boolean z) {
        this.zza |= 65536;
        this.zzv = z;
    }
}
