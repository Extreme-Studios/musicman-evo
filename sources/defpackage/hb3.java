package defpackage;

import android.net.Uri;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class hb3 implements pm1 {
    public final Object f;
    public Object g;
    public Object h;

    public hb3(cd1... cd1VarArr) {
        sb3 sb3Var = new sb3();
        sb3Var.m = 0;
        sb3Var.o = 0;
        sb3Var.p = 0;
        byte[] bArr = qz1.b;
        sb3Var.n = bArr;
        sb3Var.q = bArr;
        ne1 ne1Var = new ne1();
        ne1Var.c = 1.0f;
        ne1Var.d = 1.0f;
        nb1 nb1Var = nb1.e;
        ne1Var.e = nb1Var;
        ne1Var.f = nb1Var;
        ne1Var.g = nb1Var;
        ne1Var.h = nb1Var;
        ByteBuffer byteBuffer = cd1.a;
        ne1Var.k = byteBuffer;
        ne1Var.l = byteBuffer.asShortBuffer();
        ne1Var.m = byteBuffer;
        ne1Var.b = -1;
        cd1[] cd1VarArr2 = {sb3Var, ne1Var};
        this.f = cd1VarArr2;
        System.arraycopy(cd1VarArr, 0, cd1VarArr2, 0, 0);
        this.g = sb3Var;
        this.h = ne1Var;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0055  */
    public void a(oe2 oe2Var, Uri uri, Map map, long j, long j2, qe3 qe3Var) throws hf3 {
        fd0 fd0Var = new fd0(oe2Var, j, j2);
        this.h = fd0Var;
        if (((nd0) this.g) != null) {
            return;
        }
        nd0[] nd0VarArrL = ((qd0) this.f).l(uri, map);
        int length = nd0VarArrL.length;
        tj2 tj2Var = vj2.g;
        w40.k0("expectedSize", length);
        sj2 sj2Var = new sj2(length);
        boolean z = true;
        if (length == 1) {
            this.g = nd0VarArrL[0];
        } else {
            for (nd0 nd0Var : nd0VarArrL) {
                try {
                    if (nd0Var.d(fd0Var)) {
                        this.g = nd0Var;
                        fd0Var.k = 0;
                        break;
                    }
                    sj2Var.b(nd0Var.c());
                    boolean z2 = ((nd0) this.g) != null || fd0Var.i == j;
                    hn.M(z2);
                    fd0Var.k = 0;
                } catch (EOFException unused) {
                    if (((nd0) this.g) != null || fd0Var.i == j) {
                    }
                } catch (Throwable th) {
                    if (((nd0) this.g) == null && fd0Var.i != j) {
                        z = false;
                    }
                    hn.M(z);
                    fd0Var.k = 0;
                    throw th;
                }
                hn.M(z2);
                fd0Var.k = 0;
            }
            if (((nd0) this.g) == null) {
                Iterator it = na1.B(vj2.n(nd0VarArrL), zf2.f).iterator();
                StringBuilder sb = new StringBuilder();
                i8.D(sb, it, ", ");
                String string = sb.toString();
                throw new hf3(ec.n(new StringBuilder(string.length() + 58), "None of the available extractors (", string, ") could read the stream."), sj2Var.f());
            }
        }
        ((nd0) this.g).g(qe3Var);
    }

    @Override // defpackage.pm1
    /* JADX INFO: renamed from: b */
    public /* synthetic */ void mo0b(Object obj) {
        ((ge3) obj).j(0, ((xb3) this.f).a, (qd3) this.g, (vd3) this.h);
    }

    public long c() {
        fd0 fd0Var = (fd0) this.h;
        if (fd0Var != null) {
            return fd0Var.i;
        }
        return -1L;
    }

    public /* synthetic */ hb3(xb3 xb3Var, qd3 qd3Var, vd3 vd3Var) {
        this.f = xb3Var;
        this.g = qd3Var;
        this.h = vd3Var;
    }

    public hb3(qd0 qd0Var) {
        this.f = qd0Var;
    }
}
