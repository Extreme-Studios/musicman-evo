package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class i60 {
    public boolean a;
    public boolean b;
    public boolean c;

    public qa3 a() {
        if (this.a || !(this.b || this.c)) {
            return new qa3(this);
        }
        j7.e("Secondary offload attribute fields are true but primary isFormatSupported is false");
        return null;
    }
}
