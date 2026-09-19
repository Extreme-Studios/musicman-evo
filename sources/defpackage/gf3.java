package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gf3 {
    public static final gf3 d = new gf3(new cy0[0]);
    public final int a;
    public final qk2 b;
    public int c;

    static {
        String str = qz1.a;
        Integer.toString(0, 36);
    }

    public gf3(cy0... cy0VarArr) {
        this.b = vj2.n(cy0VarArr);
        this.a = cy0VarArr.length;
        int i = 0;
        while (i < this.b.i) {
            int i2 = i + 1;
            int i3 = i2;
            while (true) {
                qk2 qk2Var = this.b;
                if (i3 < qk2Var.i) {
                    if (((cy0) qk2Var.get(i)).equals(this.b.get(i3))) {
                        s90.b0("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                    }
                    i3++;
                }
            }
            i = i2;
        }
    }

    public final cy0 a(int i) {
        return (cy0) this.b.get(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gf3.class != obj.getClass()) {
            return false;
        }
        gf3 gf3Var = (gf3) obj;
        return this.a == gf3Var.a && this.b.equals(gf3Var.b);
    }

    public final int hashCode() {
        int i = this.c;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.b.hashCode();
        this.c = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        return this.b.toString();
    }
}
