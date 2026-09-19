package defpackage;

import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ra {
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public ArrayList d = new ArrayList();
    public final transient HashMap e = new HashMap();
    public final HashMap f = new HashMap();
    public final Bundle g = new Bundle();

    public ra(c4 c4Var) {
    }

    public final boolean a(int i, int i2, Intent intent) {
        String str = (String) this.a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        e2 e2Var = (e2) this.e.get(str);
        if (e2Var != null) {
            c2 c2Var = e2Var.a;
            if (this.d.contains(str)) {
                c2Var.p(e2Var.b.j(intent, i2));
                this.d.remove(str);
                return true;
            }
        }
        this.f.remove(str);
        this.g.putParcelable(str, new b2(intent, i2));
        return true;
    }

    public final un1 b(String str, a23 a23Var, c2 c2Var) {
        int i;
        HashMap map;
        HashMap map2 = this.b;
        if (((Integer) map2.get(str)) == null) {
            x xVar = nw.f;
            int iNextInt = nw.f.a().nextInt(2147418112);
            while (true) {
                i = iNextInt + 65536;
                Integer numValueOf = Integer.valueOf(i);
                map = this.a;
                if (!map.containsKey(numValueOf)) {
                    break;
                }
                x xVar2 = nw.f;
                iNextInt = nw.f.a().nextInt(2147418112);
            }
            map.put(Integer.valueOf(i), str);
            map2.put(str, Integer.valueOf(i));
        }
        this.e.put(str, new e2(c2Var, a23Var));
        HashMap map3 = this.f;
        if (map3.containsKey(str)) {
            Object obj = map3.get(str);
            map3.remove(str);
            c2Var.p(obj);
        }
        Bundle bundle = this.g;
        b2 b2Var = (b2) bundle.getParcelable(str);
        if (b2Var != null) {
            bundle.remove(str);
            c2Var.p(a23Var.j(b2Var.g, b2Var.f));
        }
        return new un1(this, str, a23Var);
    }
}
