package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class so0 extends d23 {
    private static final so0 zzj;
    private static volatile b33 zzk;
    private int zza;
    private int zzb;
    private boolean zze;
    private ap0 zzg;
    private gp0 zzh;
    private boolean zzi;
    private boolean zzc = true;
    private String zzd = "unknown_host";
    private boolean zzf = true;

    static {
        so0 so0Var = new so0();
        zzj = so0Var;
        d23.t(so0.class, so0Var);
    }

    public static ro0 D() {
        return (ro0) zzj.q();
    }

    public final boolean A() {
        return this.zze;
    }

    public final ap0 B() {
        ap0 ap0Var = this.zzg;
        return ap0Var == null ? ap0.E() : ap0Var;
    }

    public final void C() {
        if (this.zzh == null) {
            int i = gp0.a;
        }
    }

    public final /* synthetic */ void E(String str) {
        str.getClass();
        this.zza |= 4;
        this.zzd = str;
    }

    public final /* synthetic */ void F(boolean z) {
        this.zza |= 8;
        this.zze = z;
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zzj, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဇ\u0007", new Object[]{"zza", "zzb", vo0.b, "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (iZ == 3) {
            return new so0();
        }
        if (iZ == 4) {
            return new ro0(zzj);
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
        synchronized (so0.class) {
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

    public final String z() {
        return this.zzd;
    }
}
