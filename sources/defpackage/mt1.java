package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes.dex */
public final class mt1 {
    public final dt1 a;
    public final qr1 b;
    public final Object c = new Object();
    public final ArrayList d = new ArrayList();
    public boolean e;

    public mt1(dt1 dt1Var, qr1 qr1Var) {
        this.a = dt1Var;
        this.b = qr1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final JSONArray a() {
        JSONArray jSONArray = new JSONArray();
        synchronized (this.c) {
            try {
                int i = 0;
                Object[] objArr = 0;
                if (!this.e) {
                    dt1 dt1Var = this.a;
                    if (!dt1Var.b) {
                        kt1 kt1Var = new kt1(0, this);
                        dt1 dt1Var2 = this.a;
                        dt1Var2.getClass();
                        dt1Var2.e.f.a(new hb1(dt1Var2, kt1Var, 16, objArr == true ? 1 : 0), dt1Var2.j);
                        return jSONArray;
                    }
                    b(dt1Var.b());
                }
                ArrayList arrayList = this.d;
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    jSONArray.put(((lt1) obj).a());
                }
                return jSONArray;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(List list) {
        x51 x51Var;
        pr1 pr1VarB;
        pr1 pr1VarB2;
        x51 x51Var2;
        synchronized (this.c) {
            try {
                if (this.e) {
                    return;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    s21 s21Var = (s21) it.next();
                    ix0 ix0Var = lx0.ea;
                    tu0 tu0Var = tu0.e;
                    String string = (!((Boolean) tu0Var.c.a(ix0Var)).booleanValue() || (pr1VarB2 = this.b.b(s21Var.f)) == null || (x51Var2 = pr1VarB2.c) == null) ? "" : x51Var2.toString();
                    String str = string;
                    boolean z = ((Boolean) tu0Var.c.a(lx0.fa)).booleanValue() && (pr1VarB = this.b.b(s21Var.f)) != null && pr1VarB.d;
                    ArrayList arrayList = this.d;
                    String str2 = s21Var.f;
                    pr1 pr1VarB3 = this.b.b(str2);
                    arrayList.add(new lt1(str2, str, (pr1VarB3 == null || (x51Var = pr1VarB3.b) == null) ? "" : x51Var.toString(), s21Var.g ? 1 : 0, s21Var.i, s21Var.h, z));
                }
                this.e = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
