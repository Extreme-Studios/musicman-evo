package defpackage;

import java.io.ByteArrayInputStream;

/* JADX INFO: loaded from: classes.dex */
public final class lw2 extends d23 {
    private static final lw2 zzc;
    private static volatile b33 zzd;
    private int zza;
    private l23 zzb = e33.j;

    static {
        lw2 lw2Var = new lw2();
        zzc = lw2Var;
        d23.t(lw2.class, lw2Var);
    }

    public static lw2 D(byte[] bArr, v13 v13Var) {
        d23 d23VarX = d23.x(zzc, bArr, bArr.length, v13Var);
        d23.y(d23VarX);
        return (lw2) d23VarX;
    }

    public static lw2 E(ByteArrayInputStream byteArrayInputStream, v13 v13Var) throws o23 {
        d23 d23VarL = d23.l(zzc, new q13(byteArrayInputStream), v13Var);
        d23.y(d23VarL);
        return (lw2) d23VarL;
    }

    public static iw2 F() {
        return (iw2) zzc.q();
    }

    public final l23 A() {
        return this.zzb;
    }

    public final int B() {
        return this.zzb.size();
    }

    public final kw2 C(int i) {
        return (kw2) this.zzb.get(i);
    }

    public final /* synthetic */ void G(int i) {
        this.zza = i;
    }

    public final void H(kw2 kw2Var) {
        l23 l23Var = this.zzb;
        if (!((g13) l23Var).f) {
            int size = l23Var.size();
            this.zzb = l23Var.z(size + size);
        }
        this.zzb.add(kw2Var);
    }

    @Override // defpackage.d23
    public final Object v(int i, d23 d23Var) {
        b33 c23Var;
        int iZ = ec.z(i);
        if (iZ == 0) {
            return (byte) 1;
        }
        if (iZ == 2) {
            return new f33(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zza", "zzb", kw2.class});
        }
        if (iZ == 3) {
            return new lw2();
        }
        if (iZ == 4) {
            return new iw2(zzc);
        }
        if (iZ == 5) {
            return zzc;
        }
        if (iZ != 6) {
            throw null;
        }
        b33 b33Var = zzd;
        if (b33Var != null) {
            return b33Var;
        }
        synchronized (lw2.class) {
            try {
                c23Var = zzd;
                if (c23Var == null) {
                    c23Var = new c23(zzc);
                    zzd = c23Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c23Var;
    }

    public final int z() {
        return this.zza;
    }
}
