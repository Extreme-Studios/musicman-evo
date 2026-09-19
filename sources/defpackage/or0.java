package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class or0 extends v51 {
    public final Long A;
    public final Long B;
    public final Long C;
    public final Long s;
    public final Long t;
    public final Long u;
    public final Long v;
    public final Long w;
    public final Long x;
    public final Long y;
    public final Long z;

    public or0(String str) {
        super(18);
        HashMap mapA = v51.A(str);
        if (mapA != null) {
            this.s = (Long) mapA.get(0);
            this.t = (Long) mapA.get(1);
            this.u = (Long) mapA.get(2);
            this.v = (Long) mapA.get(3);
            this.w = (Long) mapA.get(4);
            this.x = (Long) mapA.get(5);
            this.y = (Long) mapA.get(6);
            this.z = (Long) mapA.get(7);
            this.A = (Long) mapA.get(8);
            this.B = (Long) mapA.get(9);
            this.C = (Long) mapA.get(10);
        }
    }

    @Override // defpackage.v51
    public final HashMap t() {
        HashMap map = new HashMap();
        map.put(0, this.s);
        map.put(1, this.t);
        map.put(2, this.u);
        map.put(3, this.v);
        map.put(4, this.w);
        map.put(5, this.x);
        map.put(6, this.y);
        map.put(7, this.z);
        map.put(8, this.A);
        map.put(9, this.B);
        map.put(10, this.C);
        return map;
    }
}
