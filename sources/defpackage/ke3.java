package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ke3 extends ld3 {
    public static final li0 r;
    public final dd3[] k;
    public final ArrayList l;
    public final ox0[] m;
    public final ArrayList n;
    public int o = -1;
    public long[][] p;
    public e13 q;

    static {
        tj2 tj2Var = vj2.g;
        qk2 qk2Var = qk2.j;
        List list = Collections.EMPTY_LIST;
        dh0 dh0Var = dh0.a;
        r = new li0("MergingMediaSource", new vc0(), null, new te0(), uk0.B);
    }

    public ke3(v33 v33Var, dd3... dd3VarArr) {
        this.k = dd3VarArr;
        this.n = new ArrayList(Arrays.asList(dd3VarArr));
        this.l = new ArrayList(dd3VarArr.length);
        int i = 0;
        while (true) {
            int length = dd3VarArr.length;
            if (i >= length) {
                this.m = new ox0[length];
                this.p = new long[0][];
                new HashMap();
                hn.v(new jj2(0).isEmpty());
                return;
            }
            this.l.add(new ArrayList());
            i++;
        }
    }

    @Override // defpackage.dd3
    public final void a(li0 li0Var) {
        this.k[0].a(li0Var);
    }

    @Override // defpackage.dd3
    public final void b(xd3 xd3Var) {
        ie3 ie3Var = (ie3) xd3Var;
        int i = 0;
        while (true) {
            dd3[] dd3VarArr = this.k;
            if (i >= dd3VarArr.length) {
                return;
            }
            List list = (List) this.l.get(i);
            boolean[] zArr = ie3Var.g;
            xd3[] xd3VarArr = ie3Var.f;
            xd3 xd3Var2 = zArr[i] ? ((ff3) xd3VarArr[i]).f : xd3VarArr[i];
            for (int i2 = 0; i2 < list.size(); i2++) {
                if (((je3) list.get(i2)).b.equals(xd3Var2)) {
                    list.remove(i2);
                    break;
                }
            }
            dd3VarArr[i].b(ie3Var.g[i] ? ((ff3) xd3VarArr[i]).f : xd3VarArr[i]);
            i++;
        }
    }

    @Override // defpackage.dd3
    public final xd3 c(yd3 yd3Var, fg3 fg3Var, long j) {
        dd3[] dd3VarArr = this.k;
        int length = dd3VarArr.length;
        xd3[] xd3VarArr = new xd3[length];
        ox0[] ox0VarArr = this.m;
        int iE = ox0VarArr[0].e(yd3Var.a);
        for (int i = 0; i < length; i++) {
            yd3 yd3VarA = yd3Var.a(ox0VarArr[i].f(iE));
            xd3VarArr[i] = dd3VarArr[i].c(yd3VarA, fg3Var, j - this.p[iE][i]);
            ((List) this.l.get(i)).add(new je3(yd3VarA, xd3VarArr[i]));
        }
        return new ie3(this.p[iE], xd3VarArr);
    }

    @Override // defpackage.dd3
    public final li0 f() {
        dd3[] dd3VarArr = this.k;
        return dd3VarArr.length > 0 ? dd3VarArr[0].f() : r;
    }

    @Override // defpackage.dd3
    public final void h(qp2 qp2Var) {
        this.j = qp2Var;
        String str = qz1.a;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        this.i = new Handler(looperMyLooper, null);
        int i = 0;
        while (true) {
            dd3[] dd3VarArr = this.k;
            if (i >= dd3VarArr.length) {
                return;
            }
            t(Integer.valueOf(i), dd3VarArr[i]);
            i++;
        }
    }

    @Override // defpackage.ld3, defpackage.dd3
    public final void j() {
        super.j();
        Arrays.fill(this.m, (Object) null);
        this.o = -1;
        this.q = null;
        ArrayList arrayList = this.n;
        arrayList.clear();
        Collections.addAll(arrayList, this.k);
    }

    @Override // defpackage.ld3, defpackage.dd3
    public final void r() throws e13 {
        e13 e13Var = this.q;
        if (e13Var != null) {
            throw e13Var;
        }
        super.r();
    }

    @Override // defpackage.ld3
    public final void s(Object obj, dd3 dd3Var, ox0 ox0Var) {
        int iC;
        Integer num = (Integer) obj;
        if (this.q != null) {
            return;
        }
        if (this.o == -1) {
            iC = ox0Var.c();
            this.o = iC;
        } else {
            int iC2 = ox0Var.c();
            int i = this.o;
            if (iC2 != i) {
                this.q = new e13();
                return;
            }
            iC = i;
        }
        int length = this.p.length;
        ox0[] ox0VarArr = this.m;
        if (length == 0) {
            this.p = (long[][]) Array.newInstance((Class<?>) Long.TYPE, iC, ox0VarArr.length);
        }
        ArrayList arrayList = this.n;
        arrayList.remove(dd3Var);
        ox0VarArr[num.intValue()] = ox0Var;
        if (arrayList.isEmpty()) {
            k(ox0VarArr[0]);
        }
    }

    @Override // defpackage.ld3
    public final /* synthetic */ yd3 v(Object obj, yd3 yd3Var) {
        int iIntValue = ((Integer) obj).intValue();
        ArrayList arrayList = this.l;
        List list = (List) arrayList.get(iIntValue);
        for (int i = 0; i < list.size(); i++) {
            if (((je3) list.get(i)).a.equals(yd3Var)) {
                return ((je3) ((List) arrayList.get(0)).get(i)).a;
            }
        }
        return null;
    }
}
