package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ab3 extends Exception {
    public final int f;
    public final boolean g;

    public ab3(int i, int i2, int i3, int i4, int i5, de3 de3Var, boolean z, RuntimeException runtimeException) {
        String strValueOf = String.valueOf(de3Var);
        int length = String.valueOf(i).length();
        int length2 = String.valueOf(i2).length();
        int length3 = String.valueOf(i3).length();
        int length4 = String.valueOf(i4).length();
        int length5 = String.valueOf(i5).length();
        int length6 = strValueOf.length();
        int i6 = length + 31 + length2 + 2 + length3 + 2 + length4 + 2 + length5 + 2;
        String str = true != z ? "" : " (recoverable)";
        StringBuilder sb = new StringBuilder(str.length() + i6 + length6);
        ec.v(sb, "AudioTrack init failed ", i, " Config(", i2);
        ec.v(sb, ", ", i3, ", ", i4);
        sb.append(", ");
        sb.append(i5);
        sb.append(") ");
        sb.append(strValueOf);
        sb.append(str);
        super(sb.toString(), runtimeException);
        this.f = i;
        this.g = z;
    }
}
