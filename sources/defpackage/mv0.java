package defpackage;

/* JADX INFO: loaded from: classes.dex */
public enum mv0 implements f23 {
    UNSPECIFIED(0),
    CONNECTING(1),
    CONNECTED(2),
    DISCONNECTING(3),
    DISCONNECTED(4),
    SUSPENDED(5);

    public final int f;

    mv0(int i) {
        this.f = i;
    }

    @Override // defpackage.f23
    public final int a() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
