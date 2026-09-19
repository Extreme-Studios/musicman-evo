package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public interface nc3 {
    ByteBuffer A(int i);

    void H(int i);

    void a(int i, int i2, long j, int i3);

    int b();

    default boolean c(w32 w32Var) {
        return false;
    }

    void c0(Bundle bundle);

    void d(int i);

    MediaFormat e();

    void f(int i, long j);

    void g();

    void h(int i, or2 or2Var, long j, int i2);

    void i(Surface surface);

    int j(MediaCodec.BufferInfo bufferInfo);

    void k();

    void o();

    ByteBuffer z(int i);
}
