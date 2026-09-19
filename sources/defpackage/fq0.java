package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class fq0 extends v51 {
    public String s;
    public final long t;
    public final String u;
    public final String v;
    public final String w;

    public fq0(String str) {
        super(18);
        this.s = "E";
        this.t = -1L;
        this.u = "E";
        this.v = "E";
        this.w = "E";
        HashMap mapA = v51.A(str);
        if (mapA != null) {
            this.s = mapA.get(0) == null ? "E" : (String) mapA.get(0);
            this.t = mapA.get(1) != null ? ((Long) mapA.get(1)).longValue() : -1L;
            this.u = mapA.get(2) == null ? "E" : (String) mapA.get(2);
            this.v = mapA.get(3) == null ? "E" : (String) mapA.get(3);
            this.w = mapA.get(4) != null ? (String) mapA.get(4) : "E";
        }
    }

    @Override // defpackage.v51
    public final HashMap t() {
        HashMap map = new HashMap();
        map.put(0, this.s);
        map.put(4, this.w);
        map.put(3, this.v);
        map.put(2, this.u);
        map.put(1, Long.valueOf(this.t));
        return map;
    }
}
