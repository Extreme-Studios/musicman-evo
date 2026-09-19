package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class eb2 extends Exception {
    public final int f;

    public eb2(String str, int i) {
        super(str);
        this.f = i;
    }

    public eb2(int i, Exception exc) {
        super(exc);
        this.f = i;
    }
}
