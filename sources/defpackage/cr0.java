package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class cr0 extends v51 {
    public final /* synthetic */ int s = 0;
    public Long t;
    public Object u;
    public Object v;

    public cr0(String str) {
        super(18);
        HashMap mapA = v51.A(str);
        if (mapA != null) {
            this.t = (Long) mapA.get(0);
            this.u = (Boolean) mapA.get(1);
            this.v = (Boolean) mapA.get(2);
        }
    }

    @Override // defpackage.v51
    public final HashMap t() {
        switch (this.s) {
            case 0:
                HashMap map = new HashMap();
                map.put(0, this.t);
                map.put(1, (Long) this.u);
                map.put(2, (Long) this.v);
                return map;
            default:
                HashMap map2 = new HashMap();
                map2.put(0, this.t);
                map2.put(1, (Boolean) this.u);
                map2.put(2, (Boolean) this.v);
                return map2;
        }
    }

    public /* synthetic */ cr0() {
        super(18);
    }
}
