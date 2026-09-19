package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class rd0 {
    public long a;

    public long a(ByteBuffer byteBuffer) {
        fn0 fn0Var;
        en0 en0Var;
        long j = this.a;
        if (j > 0) {
            return j;
        }
        try {
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            byteBufferDuplicate.flip();
            cn0 cn0Var = new cn0(new lk(byteBufferDuplicate), dc1.c);
            ArrayList arrayList = cn0Var.k;
            List m63Var = arrayList;
            if (cn0Var.g != null && cn0Var.h != k63.l) {
                m63Var = arrayList;
                m63Var = new m63(arrayList, cn0Var);
            }
            m63Var = arrayList;
            Iterator it = m63Var.iterator();
            while (true) {
                fn0Var = null;
                if (!it.hasNext()) {
                    en0Var = null;
                    break;
                }
                dn0 dn0Var = (dn0) it.next();
                if (dn0Var instanceof en0) {
                    en0Var = (en0) dn0Var;
                    break;
                }
            }
            ArrayList arrayList2 = en0Var.k;
            List<dn0> m63Var2 = arrayList2;
            if (en0Var.g != null && en0Var.h != k63.l) {
                m63Var2 = arrayList2;
                m63Var2 = new m63(arrayList2, en0Var);
            }
            m63Var2 = arrayList2;
            for (dn0 dn0Var2 : m63Var2) {
                if (dn0Var2 instanceof fn0) {
                    fn0Var = (fn0) dn0Var2;
                    break;
                }
            }
            long j2 = (fn0Var.r * 1000) / fn0Var.q;
            this.a = j2;
            return j2;
        } catch (IOException | RuntimeException unused) {
            return 0L;
        }
    }
}
