package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zo0 extends d23 {
    private static final zo0 zzo;
    private static volatile b33 zzp;
    private int zza;
    private long zzc;
    private long zzg;
    private long zzh;
    private long zzj;
    private int zzn;
    private String zzb = "";
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzi = "";
    private String zzk = "";
    private String zzl = "";
    private l23 zzm = e33.j;

    static {
        zo0 zo0Var = new zo0();
        zzo = zo0Var;
        d23.t(zo0.class, zo0Var);
    }

    public static wo0 z() {
        return (wo0) zzo.q();
    }

    public final /* synthetic */ void A(String str) {
        str.getClass();
        this.zza |= 1;
        this.zzb = str;
    }

    public final /* synthetic */ void B(long j) {
        this.zza |= 2;
        this.zzc = j;
    }

    public final /* synthetic */ void C(String str) {
        str.getClass();
        this.zza |= 4;
        this.zzd = str;
    }

    public final /* synthetic */ void D(String str) {
        this.zza |= 8;
        this.zze = str;
    }

    public final /* synthetic */ void E(String str) {
        this.zza |= 16;
        this.zzf = str;
    }

    public final /* synthetic */ void F(String str) {
        this.zza |= 1024;
        this.zzl = str;
    }

    public final /* synthetic */ void G(int i) {
        this.zzn = i - 1;
        this.zza |= 2048;
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zzo, "\u0004\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဈ\u0007\tဂ\b\nဈ\t\u000bဈ\n\f\u001b\r᠌\u000b", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", yo0.class, "zzn", vo0.c});
        }
        if (iZ == 3) {
            return new zo0();
        }
        if (iZ == 4) {
            return new wo0(zzo);
        }
        if (iZ == 5) {
            return zzo;
        }
        if (iZ != 6) {
            throw null;
        }
        b33 b33Var = zzp;
        if (b33Var != null) {
            return b33Var;
        }
        synchronized (zo0.class) {
            try {
                c23Var = zzp;
                if (c23Var == null) {
                    c23Var = new c23(zzo);
                    zzp = c23Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c23Var;
    }
}
