package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class s53 extends d23 {
    private static final s53 zzR;
    private static volatile b33 zzS;
    private p53 zzA;
    private l23 zzB;
    private t43 zzC;
    private String zzD;
    private m43 zzE;
    private l23 zzF;
    private d53 zzG;
    private int zzH;
    private l23 zzI;
    private l23 zzJ;
    private long zzK;
    private q53 zzL;
    private f53 zzM;
    private String zzN;
    private o53 zzO;
    private l23 zzP;
    private int zza;
    private int zzb;
    private int zzc;
    private p43 zzg;
    private l23 zzh;
    private l23 zzi;
    private String zzj;
    private i53 zzk;
    private boolean zzl;
    private l23 zzm;
    private String zzn;
    private boolean zzo;
    private boolean zzp;
    private n13 zzu;
    private m53 zzv;
    private boolean zzw;
    private String zzx;
    private l23 zzy;
    private l23 zzz;
    private byte zzQ = 2;
    private String zzd = "";
    private String zze = "";
    private String zzf = "";

    static {
        s53 s53Var = new s53();
        zzR = s53Var;
        d23.t(s53.class, s53Var);
    }

    public s53() {
        e33 e33Var = e33.j;
        this.zzh = e33Var;
        this.zzi = e33Var;
        this.zzj = "";
        this.zzm = e33Var;
        this.zzn = "";
        this.zzu = n13.g;
        this.zzx = "";
        this.zzy = e33Var;
        this.zzz = e33Var;
        this.zzB = e33Var;
        this.zzD = "";
        this.zzF = e33Var;
        this.zzI = e33Var;
        this.zzJ = e33Var;
        this.zzN = "";
        this.zzP = e33Var;
    }

    public static n43 C() {
        return (n43) zzR.q();
    }

    public final l23 A() {
        return this.zzh;
    }

    public final String B() {
        return this.zzj;
    }

    public final /* synthetic */ void D(String str) {
        this.zza |= 4;
        this.zzd = str;
    }

    public final /* synthetic */ void E(String str) {
        this.zza |= 8;
        this.zze = str;
    }

    public final /* synthetic */ void F(p43 p43Var) {
        this.zzg = p43Var;
        this.zza |= 32;
    }

    public final void G(k53 k53Var) {
        l23 l23Var = this.zzh;
        if (!((g13) l23Var).f) {
            int size = l23Var.size();
            this.zzh = l23Var.z(size + size);
        }
        this.zzh.add(k53Var);
    }

    public final /* synthetic */ void H(String str) {
        this.zza |= 64;
        this.zzj = str;
    }

    public final /* synthetic */ void I() {
        this.zza &= -65;
        this.zzj = zzR.zzj;
    }

    public final /* synthetic */ void J(i53 i53Var) {
        this.zzk = i53Var;
        this.zza |= 128;
    }

    public final /* synthetic */ void K(m53 m53Var) {
        this.zzv = m53Var;
        this.zza |= 8192;
    }

    public final void L(ArrayList arrayList) {
        l23 l23Var = this.zzy;
        if (!((g13) l23Var).f) {
            int size = l23Var.size();
            this.zzy = l23Var.z(size + size);
        }
        f13.e(arrayList, this.zzy);
    }

    public final void M(ArrayList arrayList) {
        l23 l23Var = this.zzz;
        if (!((g13) l23Var).f) {
            int size = l23Var.size();
            this.zzz = l23Var.z(size + size);
        }
        f13.e(arrayList, this.zzz);
    }

    public final /* synthetic */ void N(int i) {
        this.zzb = i - 1;
        this.zza |= 1;
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        switch (ec.z(i)) {
            case 0:
                return Byte.valueOf(this.zzQ);
            case 1:
                this.zzQ = d23Var == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return new f33(zzR, "\u0001%\u0000\u0001\u0001%%\u0000\n\u0001\u0001ဈ\u0002\u0002ဈ\u0003\u0003ဈ\u0004\u0004Л\u0005ဇ\b\u0006\u001a\u0007ဈ\t\bဇ\n\tဇ\u000b\n᠌\u0000\u000b᠌\u0001\fဉ\u0005\rဈ\u0006\u000eဉ\u0007\u000fည\f\u0010\u001b\u0011ဉ\r\u0012ဇ\u000e\u0013ဈ\u000f\u0014\u001a\u0015\u001a\u0016ဉ\u0010\u0017\u001b\u0018ဉ\u0011\u0019ဈ\u0012\u001aဉ\u0013\u001b\u001b\u001cဉ\u0014\u001d᠌\u0015\u001e\u001b\u001f\u001b ဂ\u0016!ဉ\u0017\"ဉ\u0018#ဈ\u0019$ဉ\u001a%\u001b", new Object[]{"zza", "zzd", "zze", "zzf", "zzh", k53.class, "zzl", "zzm", "zzn", "zzo", "zzp", "zzb", k43.m, "zzc", k43.f, "zzg", "zzj", "zzk", "zzu", "zzi", u53.class, "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", w53.class, "zzC", "zzD", "zzE", "zzF", u43.class, "zzG", "zzH", k43.q, "zzI", e53.class, "zzJ", g53.class, "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", n53.class});
            case 3:
                return new s53();
            case 4:
                return new n43(zzR);
            case 5:
                return zzR;
            case 6:
                b33 b33Var = zzS;
                if (b33Var != null) {
                    return b33Var;
                }
                synchronized (s53.class) {
                    try {
                        c23Var = zzS;
                        if (c23Var == null) {
                            c23Var = new c23(zzR);
                            zzS = c23Var;
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
        return this.zzd;
    }
}
