package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class cn0 extends k63 {
    static {
        na1.y(cn0.class);
    }

    public cn0(lk lkVar, bn0 bn0Var) {
        ByteBuffer byteBuffer = (ByteBuffer) lkVar.g;
        long jLimit = byteBuffer.limit();
        this.g = lkVar;
        this.i = lkVar.g();
        byteBuffer.position((int) (lkVar.g() + jLimit));
        this.j = lkVar.g();
        this.f = bn0Var;
    }

    @Override // defpackage.k63
    public final String toString() {
        String string = this.g.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 7);
        sb.append("model(");
        sb.append(string);
        sb.append(")");
        return sb.toString();
    }

    @Override // defpackage.k63, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
