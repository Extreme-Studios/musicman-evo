package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class hy1 {
    public final ae a;
    public final r52 b;
    public final f82 c;
    public final LinkedHashMap d = new LinkedHashMap();
    public final boolean e = ((Boolean) tu0.e.c.a(lx0.h7)).booleanValue();
    public final yw1 f;
    public boolean g;
    public long h;
    public long i;

    public hy1(ae aeVar, r52 r52Var, yw1 yw1Var, f82 f82Var) {
        this.a = aeVar;
        this.b = r52Var;
        this.f = yw1Var;
        this.c = f82Var;
    }

    public final synchronized void a(List list) {
        this.a.getClass();
        this.i = SystemClock.elapsedRealtime();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            x42 x42Var = (x42) it.next();
            String str = x42Var.w;
            if (!TextUtils.isEmpty(str)) {
                this.d.put(x42Var, new gy1(str, x42Var.f0, Integer.MAX_VALUE, 0L, null));
            }
        }
    }

    public final synchronized void b(e52 e52Var, x42 x42Var, hp hpVar, e82 e82Var) {
        z42 z42Var = (z42) e52Var.b.h;
        this.a.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        String str = x42Var.w;
        if (str != null) {
            this.d.put(x42Var, new gy1(str, x42Var.f0, 9, 0L, null));
            fy1 fy1Var = new fy1(this, jElapsedRealtime, z42Var, x42Var, str, e82Var, e52Var);
            hpVar.a(new in2(hpVar, 0, fy1Var), za1.g);
        }
    }

    public final synchronized void c(x42 x42Var) {
        gy1 gy1Var = (gy1) this.d.get(x42Var);
        if (gy1Var == null || this.g) {
            return;
        }
        gy1Var.c = 8;
    }

    public final synchronized String d() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator it = this.d.entrySet().iterator();
            while (it.hasNext()) {
                gy1 gy1Var = (gy1) ((Map.Entry) it.next()).getValue();
                if (gy1Var.c != Integer.MAX_VALUE) {
                    arrayList.add(gy1Var.toString());
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return TextUtils.join("_", arrayList);
    }
}
