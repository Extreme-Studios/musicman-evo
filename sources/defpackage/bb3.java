package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bb3 extends Exception {
    public final int f;
    public final boolean g;
    public final de3 h;

    public bb3(int i, de3 de3Var, boolean z) {
        super(ec.j(new StringBuilder(String.valueOf(i).length() + 25), "AudioTrack write failed: ", i));
        this.g = z;
        this.f = i;
        this.h = de3Var;
    }
}
