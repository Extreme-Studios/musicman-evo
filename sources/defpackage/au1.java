package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class au1 extends Exception {
    public final int f;

    public au1(String str, Throwable th) {
        super(str, th);
        this.f = 1;
    }

    public au1(String str, int i) {
        super(str);
        this.f = i;
    }

    public au1(int i) {
        this.f = i;
    }
}
