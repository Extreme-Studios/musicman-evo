package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class zw0 extends d23 {
    private static final zw0 zzF;
    private static volatile b33 zzG = null;
    public static final int zza = 9;
    public static final int zzb = 10;
    public static final int zzc = 11;
    public static final int zzd = 12;
    public static final int zze = 13;
    public static final int zzf = 14;
    public static final int zzg = 15;
    public static final int zzh = 16;
    public static final int zzi = 17;
    public static final int zzj = 18;
    public static final int zzk = 19;
    public static final int zzl = 20;
    public static final int zzm = 21;
    private hv0 zzA;
    private fv0 zzB;
    private nv0 zzC;
    private ow0 zzD;
    private gw0 zzE;
    private int zzn;
    private int zzo;
    private int zzu;
    private uv0 zzw;
    private ww0 zzy;
    private xw0 zzz;
    private String zzp = "";
    private int zzv = 1000;
    private j23 zzx = s23.j;

    static {
        zw0 zw0Var = new zw0();
        zzF = zw0Var;
        d23.t(zw0.class, zw0Var);
    }

    public static yw0 K() {
        return (yw0) zzF.q();
    }

    public final void A(String str) {
        str.getClass();
        this.zzn |= 2;
        this.zzp = str;
    }

    public final fv0 B() {
        fv0 fv0Var = this.zzB;
        return fv0Var == null ? fv0.z() : fv0Var;
    }

    public final void C(gw0 gw0Var) {
        this.zzE = gw0Var;
        this.zzn |= 2048;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void D(ArrayList arrayList) {
        j23 j23Var = this.zzx;
        if (!((g13) j23Var).f) {
            this.zzx = d23.k(j23Var);
        }
        f13.e(arrayList, this.zzx);
    }

    public final void E() {
        this.zzx = s23.j;
    }

    public final void F(ww0 ww0Var) {
        this.zzy = ww0Var;
        this.zzn |= 32;
    }

    public final void G(fv0 fv0Var) {
        this.zzB = fv0Var;
        this.zzn |= 256;
    }

    public final void H(nv0 nv0Var) {
        this.zzC = nv0Var;
        this.zzn |= 512;
    }

    public final void I(ow0 ow0Var) {
        this.zzD = ow0Var;
        this.zzn |= 1024;
    }

    public final String J() {
        return this.zzp;
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zzF, "\u0004\r\u0000\u0001\t\u0015\r\u0000\u0001\u0000\tင\u0000\nဈ\u0001\u000bဋ\u0002\f᠌\u0003\rဉ\u0004\u000e\u0015\u000fဉ\u0005\u0010ဉ\u0006\u0011ဉ\u0007\u0012ဉ\b\u0013ဉ\t\u0014ဉ\n\u0015ဉ\u000b", new Object[]{"zzn", "zzo", "zzp", "zzu", "zzv", vo0.w, "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE"});
        }
        if (iZ == 3) {
            return new zw0();
        }
        if (iZ == 4) {
            return new yw0(zzF);
        }
        if (iZ == 5) {
            return zzF;
        }
        if (iZ != 6) {
            throw null;
        }
        b33 b33Var = zzG;
        if (b33Var != null) {
            return b33Var;
        }
        synchronized (zw0.class) {
            try {
                c23Var = zzG;
                if (c23Var == null) {
                    c23Var = new c23(zzF);
                    zzG = c23Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c23Var;
    }

    public final ww0 z() {
        ww0 ww0Var = this.zzy;
        return ww0Var == null ? ww0.z() : ww0Var;
    }
}
