package defpackage;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class as0 extends js0 {
    public final Map h;
    public final View i;
    public final Context j;

    public as0(nr0 nr0Var, hp0 hp0Var, int i, HashMap map, View view, Context context) {
        super(nr0Var, "ykIQv59ak7YBU+e791IU15tGonhZPUUBXST76bDGm7zXSjUSNn9qtHdf61t20THy", "l48tDWlMY/G/BSkitRUvd80RiFbNrk8nR5qlkOsZWs8=", hp0Var, i, 85);
        this.h = map;
        this.i = view;
        this.j = context;
    }

    @Override // defpackage.js0
    public final void a() {
        Map map = this.h;
        long jLongValue = map.containsKey(1) ? ((Long) map.get(1)).longValue() : Long.MIN_VALUE;
        Map map2 = this.h;
        long[] jArr = {jLongValue, map2.containsKey(2) ? ((Long) map2.get(2)).longValue() : Long.MIN_VALUE};
        Context context = this.j;
        if (context == null) {
            context = this.a.a;
        }
        long[] jArr2 = (long[]) this.e.invoke(null, jArr, context, this.i);
        long j = jArr2[0];
        Map map3 = this.h;
        map3.put(1, Long.valueOf(jArr2[1]));
        long j2 = jArr2[2];
        map3.put(2, Long.valueOf(jArr2[3]));
        hp0 hp0Var = this.d;
        synchronized (hp0Var) {
            hp0Var.b();
            ((sp0) hp0Var.g).i0(j);
            hp0Var.b();
            ((sp0) hp0Var.g).j0(j2);
        }
    }
}
