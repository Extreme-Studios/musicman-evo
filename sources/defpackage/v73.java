package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class v73 extends j73 {
    public final byte[] h;

    public v73(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.h = bArr;
    }

    @Override // defpackage.j73
    public final byte[] Z0() {
        return this.h;
    }
}
