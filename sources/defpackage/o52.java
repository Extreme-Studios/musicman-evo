package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class o52 {
    public final x42 a;
    public final z42 b;
    public final f82 c;
    public final c82 d;
    public final d72 e;
    public final sg1 f;

    public o52(f82 f82Var, c82 c82Var, x42 x42Var, z42 z42Var, sg1 sg1Var, d72 d72Var) {
        this.a = x42Var;
        this.b = z42Var;
        this.c = f82Var;
        this.d = c82Var;
        this.f = sg1Var;
        this.e = d72Var;
    }

    public final void a(ArrayList arrayList, il1 il1Var) {
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str = (String) obj;
            x42 x42Var = this.a;
            if (x42Var.i0) {
                String str2 = this.b.b;
                c82 c82Var = this.d;
                c82Var.getClass();
                vc3.C.k.getClass();
                ym0 ym0Var = new ym0(System.currentTimeMillis(), str2, str, 2);
                bw1 bw1Var = c82Var.a;
                bw1Var.getClass();
                bw1Var.a(new z61(bw1Var, 20, ym0Var));
            } else {
                d72 d72Var = this.e;
                this.c.b(str, x42Var.x0, d72Var, il1Var);
            }
        }
    }

    public final void b(int i, ArrayList arrayList) {
        hp hpVarT;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            String str = (String) obj;
            if (((Boolean) tu0.e.c.a(lx0.Pa)).booleanValue() && sg1.b(str)) {
                hpVarT = this.f.a(str, ut0.f.e);
            } else {
                hpVarT = na1.t(str);
            }
            hpVarT.a(new in2(hpVarT, i2, new e3(i, 12, this)), za1.a);
        }
    }
}
