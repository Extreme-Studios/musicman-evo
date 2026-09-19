package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bh0 implements ie0 {
    public final /* synthetic */ int f = 1;
    public int g;
    public long h;
    public int i;

    public bh0(int i, long j, int i2) {
        this.g = i;
        this.h = j;
        this.i = i2;
    }

    public String toString() {
        switch (this.f) {
            case 0:
                String strX = qz1.x(this.g);
                int length = strX.length();
                long j = this.h;
                int length2 = String.valueOf(j).length();
                int i = this.i;
                StringBuilder sb = new StringBuilder(length + 29 + length2 + 16 + String.valueOf(i).length() + 1);
                sb.append("AtomSizeTooSmall{type=");
                sb.append(strX);
                sb.append(", size=");
                sb.append(j);
                sb.append(", minHeaderSize=");
                sb.append(i);
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ bh0() {
    }
}
