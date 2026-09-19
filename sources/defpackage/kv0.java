package defpackage;

import java.util.ArrayList;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class kv0 extends d23 {
    private static final kv0 zzG;
    private static volatile b33 zzH = null;
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    public static final int zzg = 7;
    public static final int zzh = 8;
    public static final int zzi = 9;
    public static final int zzj = 10;
    public static final int zzk = 11;
    public static final int zzl = 12;
    public static final int zzm = 13;
    private static final i23 zzx = new ue0(6);
    private int zzA;
    private int zzB;
    private int zzC;
    private int zzD;
    private int zzE;
    private long zzF;
    private int zzn;
    private long zzo;
    private int zzp;
    private long zzu;
    private long zzv;
    private h23 zzw = e23.j;
    private hv0 zzy;
    private int zzz;

    static {
        kv0 kv0Var = new kv0();
        zzG = kv0Var;
        d23.t(kv0.class, kv0Var);
    }

    public static kv0 O(byte[] bArr) throws o23 {
        kv0 kv0Var = zzG;
        int length = bArr.length;
        v13 v13Var = v13.a;
        int i = h13.a;
        d23 d23VarX = d23.x(kv0Var, bArr, length, v13.b);
        d23.y(d23VarX);
        return (kv0) d23VarX;
    }

    public static jv0 P() {
        return (jv0) zzG.q();
    }

    public final void A(int i) {
        this.zzp = ec.d(i);
        this.zzn |= 2;
    }

    public final void B(long j) {
        this.zzn |= 4;
        this.zzu = j;
    }

    public final void C(long j) {
        this.zzn |= 8;
        this.zzv = j;
    }

    public final void D(ArrayList arrayList) {
        RandomAccess randomAccess = this.zzw;
        if (!((g13) randomAccess).f) {
            e23 e23Var = (e23) randomAccess;
            int i = e23Var.h;
            this.zzw = e23Var.z(i + i);
        }
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((e23) this.zzw).d(((pw0) obj).f);
        }
    }

    public final void E(hv0 hv0Var) {
        this.zzy = hv0Var;
        this.zzn |= 16;
    }

    public final void F(int i) {
        this.zzz = ec.d(i);
        this.zzn |= 32;
    }

    public final void G(int i) {
        this.zzA = ec.d(i);
        this.zzn |= 64;
    }

    public final void H(int i) {
        this.zzB = ec.d(i);
        this.zzn |= 128;
    }

    public final void I(int i) {
        this.zzn |= 256;
        this.zzC = i;
    }

    public final void J(int i) {
        this.zzD = ec.d(i);
        this.zzn |= 512;
    }

    public final void K(mv0 mv0Var) {
        this.zzE = mv0Var.f;
        this.zzn |= 1024;
    }

    public final void L(long j) {
        this.zzn |= 2048;
        this.zzF = j;
    }

    public final long M() {
        return this.zzo;
    }

    public final int N() {
        int i;
        int i2 = this.zzp;
        if (i2 == 0) {
            i = 1;
        } else if (i2 != 1) {
            i = i2 != 1000 ? 0 : 3;
        } else {
            i = 2;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            vo0 vo0Var = vo0.w;
            return new f33(zzG, "\u0004\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ࠞ\u0006ဉ\u0004\u0007᠌\u0005\b᠌\u0006\t᠌\u0007\nင\b\u000b᠌\t\f᠌\n\rဂ\u000b", new Object[]{"zzn", "zzo", "zzp", vo0Var, "zzu", "zzv", "zzw", vo0.u, "zzy", "zzz", vo0Var, "zzA", vo0Var, "zzB", vo0Var, "zzC", "zzD", vo0Var, "zzE", vo0.r, "zzF"});
        }
        if (iZ == 3) {
            return new kv0();
        }
        if (iZ == 4) {
            return new jv0(zzG);
        }
        if (iZ == 5) {
            return zzG;
        }
        if (iZ != 6) {
            throw null;
        }
        b33 b33Var = zzH;
        if (b33Var != null) {
            return b33Var;
        }
        synchronized (kv0.class) {
            try {
                c23Var = zzH;
                if (c23Var == null) {
                    c23Var = new c23(zzG);
                    zzH = c23Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c23Var;
    }

    public final void z(long j) {
        this.zzn |= 1;
        this.zzo = j;
    }
}
