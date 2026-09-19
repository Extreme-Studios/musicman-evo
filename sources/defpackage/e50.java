package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class e50 {
    public static final ThreadLocal d = new ThreadLocal();
    public final int a;
    public final u40 b;
    public volatile int c = 0;

    public e50(u40 u40Var, int i) {
        this.b = u40Var;
        this.a = i;
    }

    public final int a(int i) {
        ls lsVarB = b();
        int iA = lsVarB.a(16);
        if (iA == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) lsVarB.d;
        int i2 = iA + lsVarB.a;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    public final ls b() {
        ThreadLocal threadLocal = d;
        ls lsVar = (ls) threadLocal.get();
        if (lsVar == null) {
            lsVar = new ls();
            threadLocal.set(lsVar);
        }
        ms msVar = (ms) this.b.g;
        int iA = msVar.a(6);
        if (iA != 0) {
            int i = iA + msVar.a;
            int i2 = (this.a * 4) + ((ByteBuffer) msVar.d).getInt(i) + i + 4;
            int i3 = ((ByteBuffer) msVar.d).getInt(i2) + i2;
            ByteBuffer byteBuffer = (ByteBuffer) msVar.d;
            lsVar.d = byteBuffer;
            if (byteBuffer != null) {
                lsVar.a = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                lsVar.b = i4;
                lsVar.c = ((ByteBuffer) lsVar.d).getShort(i4);
                return lsVar;
            }
            lsVar.a = 0;
            lsVar.b = 0;
            lsVar.c = 0;
        }
        return lsVar;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        ls lsVarB = b();
        int iA = lsVarB.a(4);
        sb.append(Integer.toHexString(iA != 0 ? ((ByteBuffer) lsVarB.d).getInt(iA + lsVarB.a) : 0));
        sb.append(", codepoints:");
        ls lsVarB2 = b();
        int iA2 = lsVarB2.a(16);
        if (iA2 != 0) {
            int i2 = iA2 + lsVarB2.a;
            i = ((ByteBuffer) lsVarB2.d).getInt(((ByteBuffer) lsVarB2.d).getInt(i2) + i2);
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(Integer.toHexString(a(i3)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
