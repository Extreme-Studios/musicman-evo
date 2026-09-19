package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class s20 extends ac implements pl {
    public final int i;

    public s20(int i, yb ybVar) {
        super(ybVar);
        this.i = i;
    }

    @Override // defpackage.pl
    public final int b() {
        return this.i;
    }

    @Override // defpackage.ac
    public final String toString() {
        if (this.f != null) {
            return super.toString();
        }
        tw.a.getClass();
        String string = getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }
}
