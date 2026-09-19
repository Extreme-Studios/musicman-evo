package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ml0 {
    public final String a;
    public final int b;
    public final int c;
    public int d;
    public String e;

    public ml0(int i, int i2, int i3) {
        String string;
        if (i != Integer.MIN_VALUE) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 1);
            sb.append(i);
            sb.append("/");
            string = sb.toString();
        } else {
            string = "";
        }
        this.a = string;
        this.b = i2;
        this.c = i3;
        this.d = Integer.MIN_VALUE;
        this.e = "";
    }

    public final void a() {
        int i = this.d;
        int i2 = i == Integer.MIN_VALUE ? this.b : i + this.c;
        this.d = i2;
        int length = String.valueOf(i2).length();
        String str = this.a;
        this.e = ec.j(new StringBuilder(str.length() + length), str, i2);
    }

    public final void b() {
        if (this.d != Integer.MIN_VALUE) {
            return;
        }
        j7.e("generateNewId() must be called before retrieving ids.");
    }
}
