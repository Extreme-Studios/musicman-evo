package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public interface cd1 {
    public static final ByteBuffer a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    nb1 a(nb1 nb1Var);

    void b();

    void c(ByteBuffer byteBuffer);

    ByteBuffer d();

    boolean e();

    void g();

    boolean h();

    void j();

    default long f(long j) {
        return j;
    }
}
