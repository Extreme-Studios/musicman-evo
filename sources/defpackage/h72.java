package defpackage;

import android.os.Build;
import java.util.AbstractCollection;

/* JADX INFO: loaded from: classes.dex */
public final class h72 extends d23 {
    private static final h72 zzaw;
    private static volatile b33 zzax;
    private int zzD;
    private int zzE;
    private int zzF;
    private long zzG;
    private boolean zzH;
    private boolean zzI;
    private boolean zzJ;
    private int zzK;
    private int zzR;
    private int zzS;
    private int zzU;
    private int zza;
    private long zzae;
    private int zzag;
    private int zzah;
    private int zzai;
    private y72 zzaj;
    private int zzak;
    private w72 zzal;
    private m72 zzam;
    private p72 zzan;
    private o72 zzao;
    private x72 zzap;
    private u72 zzaq;
    private r72 zzar;
    private f43 zzas;
    private z72 zzau;
    private t72 zzav;
    private int zzb;
    private int zzc;
    private long zze;
    private long zzf;
    private long zzg;
    private boolean zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private int zzn;
    private int zzz;
    private String zzd = "";
    private h23 zzh = e23.j;
    private String zzo = "";
    private String zzp = "";
    private String zzu = "";
    private String zzv = "";
    private String zzw = "";
    private String zzx = "";
    private String zzy = "";
    private String zzA = "";
    private String zzB = "";
    private j23 zzC = s23.j;
    private String zzL = "";
    private String zzM = "";
    private String zzN = "";
    private String zzO = "";
    private String zzP = "";
    private String zzQ = "";
    private String zzT = "";
    private String zzV = "";
    private String zzW = "";
    private String zzX = "";
    private String zzY = "";
    private String zzZ = "";
    private String zzaa = "";
    private String zzab = "";
    private String zzac = "";
    private String zzad = "";
    private String zzaf = "";
    private String zzat = "";

    static {
        h72 h72Var = new h72();
        zzaw = h72Var;
        d23.t(h72.class, h72Var);
    }

    public static f72 B() {
        return (f72) zzaw.q();
    }

    public final /* synthetic */ void A(int i) {
        if (i != 1) {
            this.zzK = i - 2;
        } else {
            j7.p("Can't get the number of an unknown enum value.");
        }
    }

    public final /* synthetic */ void C(boolean z) {
        this.zzi = z;
    }

    public final /* synthetic */ void D(long j) {
        this.zzj = j;
    }

    public final /* synthetic */ void E(long j) {
        this.zzk = j;
    }

    public final /* synthetic */ void F(String str) {
        str.getClass();
        this.zzo = str;
    }

    public final /* synthetic */ void G(String str) {
        str.getClass();
        this.zzw = str;
    }

    public final /* synthetic */ void H(String str) {
        String str2 = Build.VERSION.RELEASE;
        str2.getClass();
        this.zzy = str2;
    }

    public final /* synthetic */ void I(int i) {
        this.zzz = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void J(AbstractCollection abstractCollection) {
        j23 j23Var = this.zzC;
        if (!((g13) j23Var).f) {
            this.zzC = d23.k(j23Var);
        }
        f13.e(abstractCollection, this.zzC);
    }

    public final /* synthetic */ void K(int i) {
        this.zzF = i;
    }

    public final /* synthetic */ void L(long j) {
        this.zzG = j;
    }

    public final /* synthetic */ void M(String str) {
        str.getClass();
        this.zzL = str;
    }

    public final /* synthetic */ void N(String str) {
        str.getClass();
        this.zzM = str;
    }

    public final /* synthetic */ void O(String str) {
        str.getClass();
        this.zzY = str;
    }

    public final /* synthetic */ void P(String str) {
        this.zzZ = str;
    }

    public final /* synthetic */ void Q(String str) {
        str.getClass();
        this.zzaa = str;
    }

    public final /* synthetic */ void R(String str) {
        str.getClass();
        this.zzab = str;
    }

    public final /* synthetic */ void S(String str) {
        this.zzac = str;
    }

    public final /* synthetic */ void T(String str) {
        str.getClass();
        this.zzad = str;
    }

    public final void U(int i) {
        int i2;
        if (i != 11) {
            i2 = -1;
            switch (i) {
                case 1:
                    break;
                case 2:
                case 11:
                    break;
                case 3:
                    i2 = 1;
                    break;
                case 4:
                    i2 = 2;
                    break;
                case 5:
                    i2 = 3;
                    break;
                case 6:
                    i2 = 4;
                    break;
                case 7:
                    i2 = 5;
                    break;
                case 8:
                    i2 = 6;
                    break;
                case 9:
                    i2 = 7;
                    break;
                case 10:
                    i2 = 8;
                    break;
                default:
                    throw null;
            }
            this.zzak = i2;
        }
        j7.p("Can't get the number of an unknown enum value.");
        i2 = 0;
        this.zzak = i2;
    }

    public final /* synthetic */ void V(f43 f43Var) {
        this.zzas = f43Var;
        this.zza |= 256;
    }

    public final /* synthetic */ void W(String str) {
        this.zzat = str;
    }

    public final /* synthetic */ void X(int i) {
        this.zzb = i - 2;
    }

    public final /* synthetic */ void Y() {
        this.zzn = 1;
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zzaw, "\u0004E\u0000\u0001\u0001EE\u0000\u0002\u0000\u0001\f\u0002\u0007\u0003\u0002\u0004\f\u0005Ȉ\u0006Ȉ\u0007Ȉ\b\u0004\t\f\n\u0004\u000b\u0002\f\f\rȈ\u000eȈ\u000fȈ\u0010Ȉ\u0011Ȉ\u0012Ȉ\u0013Ȉ\u0014Ȉ\u0015Ȉ\u0016Ȉ\u0017Ȉ\u0018Ȉ\u0019%\u001aȈ\u001bȈ\u001cȈ\u001d\u0002\u001eȈ\u001f\u0002 \u0002!\u0002\"\u0002#\u0002$\u0002%,&\f'\f(\f)ဉ\u0001*ဉ\u0002+\u0004,Ȉ-Ȉ.Ȉ/\f0\u00041\u00042Ȉ3Ȉ4ဉ\u00035\f6ဉ\u00047Ȉ8\u00049ဉ\u0000:ဉ\u0005;ဉ\u0006<Ȉ=ဉ\u0007>ဉ\b?Ȉ@ȈAဉ\tB\u0007C\u0007D\u0007Eဉ\n", new Object[]{"zza", "zzb", "zzi", "zzj", "zzn", "zzo", "zzw", "zzy", "zzz", "zzD", "zzF", "zzG", "zzK", "zzL", "zzM", "zzY", "zzZ", "zzaa", "zzab", "zzac", "zzad", "zzp", "zzu", "zzA", "zzB", "zzC", "zzN", "zzO", "zzW", "zzae", "zzd", "zze", "zzf", "zzg", "zzk", "zzl", "zzm", "zzh", "zzah", "zzai", "zzc", "zzal", "zzam", "zzR", "zzT", "zzQ", "zzP", "zzak", "zzS", "zzU", "zzV", "zzx", "zzan", "zzE", "zzao", "zzaf", "zzag", "zzaj", "zzap", "zzaq", "zzX", "zzar", "zzas", "zzat", "zzv", "zzau", "zzH", "zzI", "zzJ", "zzav"});
        }
        if (iZ == 3) {
            return new h72();
        }
        if (iZ == 4) {
            return new f72(zzaw);
        }
        if (iZ == 5) {
            return zzaw;
        }
        if (iZ != 6) {
            throw null;
        }
        b33 b33Var = zzax;
        if (b33Var != null) {
            return b33Var;
        }
        synchronized (h72.class) {
            try {
                c23Var = zzax;
                if (c23Var == null) {
                    c23Var = new c23(zzaw);
                    zzax = c23Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c23Var;
    }

    public final /* synthetic */ void z(int i) {
        if (i != 1) {
            this.zzD = i - 2;
        } else {
            j7.p("Can't get the number of an unknown enum value.");
        }
    }
}
