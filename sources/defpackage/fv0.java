package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fv0 extends d23 {
    private static final fv0 zzB;
    private static volatile b33 zzC = null;
    public static final int zza = 7;
    public static final int zzb = 8;
    public static final int zzc = 9;
    public static final int zzd = 10;
    public static final int zze = 11;
    public static final int zzf = 12;
    public static final int zzg = 13;
    public static final int zzh = 14;
    public static final int zzi = 15;
    public static final int zzj = 16;
    public static final int zzk = 17;
    private l23 zzA;
    private int zzl;
    private int zzm;
    private int zzn = 1000;
    private rw0 zzo;
    private tw0 zzp;
    private l23 zzu;
    private uw0 zzv;
    private ov0 zzw;
    private iv0 zzx;
    private bx0 zzy;
    private cx0 zzz;

    static {
        fv0 fv0Var = new fv0();
        zzB = fv0Var;
        d23.t(fv0.class, fv0Var);
    }

    public fv0() {
        e33 e33Var = e33.j;
        this.zzu = e33Var;
        this.zzA = e33Var;
    }

    public static fv0 z() {
        return zzB;
    }

    public final void A(dv0 dv0Var) {
        this.zzm = dv0Var.f;
        this.zzl |= 1;
    }

    public final void B(tw0 tw0Var) {
        this.zzp = tw0Var;
        this.zzl |= 8;
    }

    public final tw0 C() {
        tw0 tw0Var = this.zzp;
        return tw0Var == null ? tw0.z() : tw0Var;
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zzB, "\u0004\u000b\u0000\u0001\u0007\u0011\u000b\u0000\u0002\u0000\u0007᠌\u0000\b᠌\u0001\tဉ\u0002\nဉ\u0003\u000b\u001b\fဉ\u0004\rဉ\u0005\u000eဉ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011\u001b", new Object[]{"zzl", "zzm", vo0.o, "zzn", vo0.w, "zzo", "zzp", "zzu", qw0.class, "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", vv0.class});
        }
        if (iZ == 3) {
            return new fv0();
        }
        if (iZ == 4) {
            return new ev0(zzB);
        }
        if (iZ == 5) {
            return zzB;
        }
        if (iZ != 6) {
            throw null;
        }
        b33 b33Var = zzC;
        if (b33Var != null) {
            return b33Var;
        }
        synchronized (fv0.class) {
            try {
                c23Var = zzC;
                if (c23Var == null) {
                    c23Var = new c23(zzB);
                    zzC = c23Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c23Var;
    }
}
