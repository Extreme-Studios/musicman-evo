package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class k53 extends d23 {
    private static final k53 zzl;
    private static volatile b33 zzm;
    private int zza;
    private int zzb;
    private z43 zzd;
    private b53 zze;
    private int zzf;
    private int zzi;
    private byte zzk = 2;
    private String zzc = "";
    private h23 zzg = e23.j;
    private String zzh = "";
    private l23 zzj = e33.j;

    static {
        k53 k53Var = new k53();
        zzl = k53Var;
        d23.t(k53.class, k53Var);
    }

    public static j53 B() {
        return (j53) zzl.q();
    }

    public final int A() {
        return this.zzj.size();
    }

    public final /* synthetic */ void C(int i) {
        this.zza |= 1;
        this.zzb = i;
    }

    public final /* synthetic */ void D(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzc = str;
    }

    public final /* synthetic */ void E(z43 z43Var) {
        this.zzd = z43Var;
        this.zza |= 4;
    }

    public final void F(String str) {
        str.getClass();
        l23 l23Var = this.zzj;
        if (!((g13) l23Var).f) {
            int size = l23Var.size();
            this.zzj = l23Var.z(size + size);
        }
        this.zzj.add(str);
    }

    public final /* synthetic */ void G(int i) {
        this.zzi = i - 1;
        this.zza |= 64;
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        switch (ec.z(i)) {
            case 0:
                return Byte.valueOf(this.zzk);
            case 1:
                this.zzk = d23Var == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return new f33(zzl, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006\u0016\u0007ဈ\u0005\b᠌\u0006\t\u001a", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", k43.n, "zzj"});
            case 3:
                return new k53();
            case 4:
                return new j53(zzl);
            case 5:
                return zzl;
            case 6:
                b33 b33Var = zzm;
                if (b33Var != null) {
                    return b33Var;
                }
                synchronized (k53.class) {
                    try {
                        c23Var = zzm;
                        if (c23Var == null) {
                            c23Var = new c23(zzl);
                            zzm = c23Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return c23Var;
            default:
                throw null;
        }
    }

    public final String z() {
        return this.zzc;
    }
}
