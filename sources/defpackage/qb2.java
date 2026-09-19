package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qb2 extends d23 {
    private static final qb2 zzn;
    private static volatile b33 zzo;
    private int zza;
    private String zzb = "";
    private long zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private j23 zzk;
    private j23 zzl;
    private j23 zzm;

    static {
        qb2 qb2Var = new qb2();
        zzn = qb2Var;
        d23.t(qb2.class, qb2Var);
    }

    public qb2() {
        s23 s23Var = s23.j;
        this.zzk = s23Var;
        this.zzl = s23Var;
        this.zzm = s23Var;
    }

    public static qb2 Q() {
        return zzn;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A(long j) {
        j23 j23Var = this.zzm;
        if (!((g13) j23Var).f) {
            this.zzm = d23.k(j23Var);
        }
        ((s23) this.zzm).c(j);
    }

    public final void B() {
        this.zzm = s23.j;
    }

    public final String C() {
        return this.zzb;
    }

    public final long D() {
        return this.zzc;
    }

    public final int E() {
        return this.zzd;
    }

    public final boolean F() {
        return this.zze;
    }

    public final boolean G() {
        return this.zzf;
    }

    public final long H() {
        return this.zzg;
    }

    public final long I() {
        return this.zzh;
    }

    public final long J() {
        return this.zzi;
    }

    public final boolean K() {
        return (this.zza & 64) != 0;
    }

    public final j23 L() {
        return this.zzk;
    }

    public final int M() {
        return ((s23) this.zzk).size();
    }

    public final int N() {
        return ((s23) this.zzl).size();
    }

    public final j23 O() {
        return this.zzm;
    }

    public final int P() {
        return ((s23) this.zzm).size();
    }

    public final /* synthetic */ void R(String str) {
        str.getClass();
        this.zzb = str;
    }

    public final /* synthetic */ void S(long j) {
        this.zza |= 1;
        this.zzc = j;
    }

    public final /* synthetic */ void T(int i) {
        this.zza |= 2;
        this.zzd = i;
    }

    public final /* synthetic */ void U(boolean z) {
        this.zza |= 4;
        this.zze = true;
    }

    public final /* synthetic */ void V(boolean z) {
        this.zza |= 8;
        this.zzf = true;
    }

    public final /* synthetic */ void W(long j) {
        this.zza |= 16;
        this.zzg = j;
    }

    public final /* synthetic */ void X(long j) {
        this.zzh = j;
    }

    public final /* synthetic */ void Y(long j) {
        this.zza |= 32;
        this.zzi = j;
    }

    public final /* synthetic */ void Z(long j) {
        this.zza |= 64;
        this.zzj = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a0(long j) {
        j23 j23Var = this.zzk;
        if (!((g13) j23Var).f) {
            this.zzk = d23.k(j23Var);
        }
        ((s23) this.zzk).c(j);
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zzn, "\u0004\f\u0000\u0001\u0001\f\f\u0000\u0003\u0000\u0001Ȉ\u0002ဂ\u0000\u0003င\u0001\u0004ဇ\u0002\u0005ဇ\u0003\u0006ဂ\u0004\u0007\u0002\bဂ\u0005\tဂ\u0006\n%\u000b%\f%", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (iZ == 3) {
            return new qb2();
        }
        if (iZ == 4) {
            return new pb2(zzn);
        }
        if (iZ == 5) {
            return zzn;
        }
        if (iZ != 6) {
            throw null;
        }
        b33 b33Var = zzo;
        if (b33Var != null) {
            return b33Var;
        }
        synchronized (qb2.class) {
            try {
                c23Var = zzo;
                if (c23Var == null) {
                    c23Var = new c23(zzn);
                    zzo = c23Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c23Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void z(long j) {
        j23 j23Var = this.zzl;
        if (!((g13) j23Var).f) {
            this.zzl = d23.k(j23Var);
        }
        ((s23) this.zzl).c(j);
    }
}
