package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public abstract class gs2 {
    public static final j03 a = j03.a(new byte[0]);

    public static final j03 a(int i) {
        return j03.a(ByteBuffer.allocate(5).put((byte) 0).putInt(i).array());
    }

    public static final j03 b(int i) {
        return j03.a(ByteBuffer.allocate(5).put((byte) 1).putInt(i).array());
    }
}
