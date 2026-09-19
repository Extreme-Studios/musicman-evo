package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class hm1 {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;
    public final Object n;
    public Object o;

    public hm1(ExecutorService executorService, Context context, vc2 vc2Var) {
        this.a = this;
        s63 s63VarA = s63.a(context);
        this.b = s63VarA;
        q63 q63VarA = q63.a(na1.o);
        this.c = q63VarA;
        s63 s63VarA2 = s63.a(executorService);
        this.d = s63VarA2;
        q63 q63VarA2 = q63.a(new i91(s63VarA, q63VarA, s63VarA2));
        int i = 2;
        q63 q63VarA3 = q63.a(new g91(s63VarA, s63VarA2, i));
        q63 q63VarA4 = q63.a(new g91(s63VarA, s63VarA2, 3));
        q63 q63VarA5 = q63.a(ej1.n);
        this.e = q63VarA5;
        s63 s63VarA3 = s63.a(vc2Var);
        this.f = s63VarA3;
        int i2 = 1;
        q63 q63VarA6 = q63.a(new g91(s63VarA2, s63VarA3, i2));
        this.g = q63VarA6;
        q63 q63VarA7 = q63.a(new u91(s63VarA, q63VarA5, s63VarA2, q63VarA6, s63VarA3));
        this.h = q63VarA7;
        int i3 = w63.c;
        ArrayList arrayList = new ArrayList(4);
        List list = Collections.EMPTY_LIST;
        arrayList.add(q63VarA2);
        arrayList.add(q63VarA3);
        arrayList.add(q63VarA4);
        arrayList.add(q63VarA7);
        w63 w63Var = new w63(arrayList, list);
        q63 q63VarA8 = q63.a(new tz0(24, new wc2(0, this)));
        q63 q63VarA9 = q63.a(new tz0(25, new wc2(i2, this)));
        q63 q63VarA10 = q63.a(new tz0(26, new wc2(i, this)));
        q63 q63VarA11 = q63.a(new re1(q63VarA, q63VarA7, 17));
        this.i = q63VarA11;
        q63 q63VarA12 = q63.a(new u91(s63VarA3, q63.a(new u91(q63VarA8, q63VarA9, q63VarA10, s63VarA2, q63VarA11)), q63VarA7, s63VarA2, q63VarA11));
        q63 q63VarA13 = q63.a(new rs1(s63VarA2, 5));
        this.j = q63VarA13;
        q63 q63VarA14 = q63.a(new sf2(s63VarA, q63VarA11, s63VarA3, q63VarA13));
        q63 q63VarA15 = q63.a(new sf2(2, q63VarA11, q63VarA13, s63VarA, s63VarA3));
        ArrayList arrayList2 = new ArrayList(3);
        List list2 = Collections.EMPTY_LIST;
        arrayList2.add(q63VarA12);
        arrayList2.add(q63VarA14);
        arrayList2.add(q63VarA15);
        q63 q63VarA16 = q63.a(new dy0((v63) w63Var, (v63) new w63(arrayList2, list2), (r63) s63VarA2, q63VarA11, 15));
        q63 q63VarA17 = q63.a(hn.s);
        q63 q63VarA18 = q63.a(new jt1(q63VarA, 14));
        ArrayList arrayList3 = new ArrayList(7);
        List list3 = Collections.EMPTY_LIST;
        arrayList3.add(q63VarA17);
        arrayList3.add(q63VarA2);
        arrayList3.add(q63VarA3);
        arrayList3.add(q63VarA18);
        arrayList3.add(q63VarA4);
        arrayList3.add(q63VarA14);
        arrayList3.add(q63VarA15);
        q63 q63VarA19 = q63.a(new g12(q63VarA17, new w63(arrayList3, list3), 16));
        this.k = q63VarA19;
        q63 q63VarA20 = q63.a(new jt1(q63VarA11, 13));
        this.l = q63VarA20;
        this.m = q63.a(new yn1(q63VarA16, q63VarA12, q63VarA19, q63VarA11, q63.a(new sf2(0, q63VarA11, q63VarA20, s63VarA, s63VarA3)), s63VarA3));
        this.n = q63.a(new rs1(s63VarA, 4));
        this.o = q63.a(new rs1(s63VarA2, 6));
    }

    public void a(ek1 ek1Var, Executor executor) {
        ((HashSet) this.i).add(new wm1(ek1Var, executor));
    }

    public void b(v6 v6Var, Executor executor) {
        ((HashSet) this.k).add(new wm1(v6Var, executor));
    }

    public void c(zm1 zm1Var, Executor executor) {
        ((HashSet) this.d).add(new wm1(zm1Var, executor));
    }

    public void d(pl1 pl1Var, Executor executor) {
        ((HashSet) this.b).add(new wm1(pl1Var, executor));
    }

    public hm1() {
        this.a = new HashSet();
        this.b = new HashSet();
        this.c = new HashSet();
        this.d = new HashSet();
        this.e = new HashSet();
        this.f = new HashSet();
        this.g = new HashSet();
        this.h = new HashSet();
        this.i = new HashSet();
        this.j = new HashSet();
        this.k = new HashSet();
        this.l = new HashSet();
        this.m = new HashSet();
        this.n = new HashSet();
    }
}
