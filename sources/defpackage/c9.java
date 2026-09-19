package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class c9 {
    public final /* synthetic */ int a;
    public final int b;

    public /* synthetic */ c9(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    public static String a(int i) {
        char c = (char) ((i >> 24) & 255);
        int length = String.valueOf(c).length();
        char c2 = (char) ((i >> 16) & 255);
        int length2 = String.valueOf(c2).length();
        char c3 = (char) ((i >> 8) & 255);
        char c4 = (char) (i & 255);
        StringBuilder sb = new StringBuilder(length + length2 + String.valueOf(c3).length() + String.valueOf(c4).length());
        sb.append(c);
        sb.append(c2);
        sb.append(c3);
        sb.append(c4);
        return sb.toString();
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return a(this.b);
            default:
                return super.toString();
        }
    }
}
