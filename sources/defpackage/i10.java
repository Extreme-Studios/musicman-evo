package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class i10 {
    public static final LinkedHashSet h = new LinkedHashSet();
    public static final Object i = new Object();
    public final vb2 a;
    public final zy1 b;
    public final String c;
    public final u20 d;
    public final y10 e;
    public List f;
    public final u40 g;

    public i10(vb2 vb2Var, List list, ig igVar, qc qcVar) {
        tb2 tb2Var = ub2.a;
        this.a = vb2Var;
        yb ybVar = null;
        this.b = new zy1(6, new v00(this, ybVar, 1));
        this.c = ".tmp";
        this.d = new u20(new nu(3, this));
        this.e = new y10(g50.a);
        this.f = x9.J(list);
        this.g = new u40(qcVar, new mu(2, this), new v00(this, ybVar, 0));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009e, code lost:
    
        if (r9 == r6) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.i10 r9, defpackage.s00 r10, defpackage.ac r11) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i10.a(i10, s00, ac):java.lang.Object");
    }

    public final File b() {
        return (File) this.d.a();
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:42:0x0109  */
    /* JADX WARN: Code duplicated, block: B:46:0x0117  */
    /* JADX WARN: Code duplicated, block: B:47:0x011c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0108 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:? A[LOOP:0: B:33:0x00cd->B:58:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(ac acVar) throws IOException {
        z00 z00Var;
        dt dtVar;
        i10 i10Var;
        sw swVar;
        sw swVar2;
        rw rwVar;
        Iterator it;
        dt dtVar2;
        i10 i10Var2;
        sw swVar3;
        b10 b10Var;
        i10 i10Var3;
        rw rwVar2;
        dt dtVar3;
        sw swVar4;
        gl glVar;
        Object obj;
        int iHashCode;
        if (acVar instanceof z00) {
            z00Var = (z00) acVar;
            int i2 = z00Var.q;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                z00Var.q = i2 - Integer.MIN_VALUE;
            } else {
                z00Var = new z00(this, acVar);
            }
        } else {
            z00Var = new z00(this, acVar);
        }
        Object obj2 = z00Var.o;
        int i3 = z00Var.q;
        rc rcVar = rc.f;
        if (i3 == 0) {
            ar.n(obj2);
            y10 y10Var = this.e;
            if (!jn.b(y10Var.b(), g50.a) && !(y10Var.b() instanceof ow)) {
                j7.e("Check failed.");
                return null;
            }
            dtVar = new dt();
            sw swVar5 = new sw();
            z00Var.i = this;
            z00Var.j = dtVar;
            z00Var.k = swVar5;
            z00Var.l = swVar5;
            z00Var.q = 1;
            Object objG = g(z00Var);
            if (objG != rcVar) {
                i10Var = this;
                swVar = swVar5;
                obj2 = objG;
                swVar2 = swVar;
            }
            return rcVar;
        }
        if (i3 == 1) {
            swVar = (sw) z00Var.l;
            swVar2 = (sw) z00Var.k;
            dtVar = (dt) z00Var.j;
            i10Var = z00Var.i;
            ar.n(obj2);
        } else {
            if (i3 == 2) {
                it = z00Var.n;
                b10Var = z00Var.m;
                rwVar = (rw) z00Var.l;
                swVar3 = (sw) z00Var.k;
                dtVar2 = (dt) z00Var.j;
                i10Var2 = z00Var.i;
                ar.n(obj2);
                while (it.hasNext()) {
                    glVar = (gl) it.next();
                    z00Var.i = i10Var2;
                    z00Var.j = dtVar2;
                    z00Var.k = swVar3;
                    z00Var.l = rwVar;
                    z00Var.m = b10Var;
                    z00Var.n = it;
                    z00Var.q = 2;
                    if (glVar.f(b10Var, z00Var) == rcVar) {
                        return rcVar;
                    }
                }
                rwVar2 = rwVar;
                dtVar3 = dtVar2;
                i10Var3 = i10Var2;
                i10Var3.f = null;
                z00Var.i = i10Var3;
                z00Var.j = swVar3;
                z00Var.k = rwVar2;
                z00Var.l = dtVar3;
                z00Var.m = null;
                z00Var.n = null;
                z00Var.q = 3;
                if (dtVar3.c(z00Var) != rcVar) {
                    swVar4 = swVar3;
                }
                return rcVar;
            }
            if (i3 != 3) {
                j7.e("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dtVar3 = (dt) z00Var.l;
            rwVar2 = (rw) z00Var.k;
            swVar4 = (sw) z00Var.j;
            i10Var3 = z00Var.i;
            ar.n(obj2);
        }
        try {
            rwVar2.f = true;
            dtVar3.d(null);
            y10 y10Var2 = i10Var3.e;
            obj = swVar4.f;
            if (obj != null) {
                iHashCode = obj.hashCode();
            } else {
                iHashCode = 0;
            }
            y10Var2.c(new rd(iHashCode, obj));
            return k50.a;
        } catch (Throwable th) {
            dtVar3.d(null);
            throw th;
        }
        swVar.f = obj2;
        rw rwVar3 = new rw();
        b10 b10Var2 = new b10(dtVar, rwVar3, swVar2, i10Var);
        List list = i10Var.f;
        if (list == null) {
            i10Var3 = i10Var;
            swVar3 = swVar2;
            rwVar2 = rwVar3;
            dtVar3 = dtVar;
        } else {
            dt dtVar4 = dtVar;
            rwVar = rwVar3;
            it = list.iterator();
            dtVar2 = dtVar4;
            i10Var2 = i10Var;
            swVar3 = swVar2;
            b10Var = b10Var2;
            while (it.hasNext()) {
                glVar = (gl) it.next();
                z00Var.i = i10Var2;
                z00Var.j = dtVar2;
                z00Var.k = swVar3;
                z00Var.l = rwVar;
                z00Var.m = b10Var;
                z00Var.n = it;
                z00Var.q = 2;
                if (glVar.f(b10Var, z00Var) == rcVar) {
                    return rcVar;
                }
            }
            rwVar2 = rwVar;
            dtVar3 = dtVar2;
            i10Var3 = i10Var2;
        }
        i10Var3.f = null;
        z00Var.i = i10Var3;
        z00Var.j = swVar3;
        z00Var.k = rwVar2;
        z00Var.l = dtVar3;
        z00Var.m = null;
        z00Var.n = null;
        z00Var.q = 3;
        if (dtVar3.c(z00Var) != rcVar) {
            swVar4 = swVar3;
            rwVar2.f = true;
            dtVar3.d(null);
            y10 y10Var3 = i10Var3.e;
            obj = swVar4.f;
            if (obj != null) {
                iHashCode = obj.hashCode();
            } else {
                iHashCode = 0;
            }
            y10Var3.c(new rd(iHashCode, obj));
            return k50.a;
        }
        return rcVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, k50] */
    public final Object d(ac acVar) {
        c10 c10Var;
        if (acVar instanceof c10) {
            c10Var = (c10) acVar;
            int i2 = c10Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c10Var.l = i2 - Integer.MIN_VALUE;
            } else {
                c10Var = new c10(this, acVar);
            }
        } else {
            c10Var = new c10(this, acVar);
        }
        Object obj = c10Var.j;
        int i3 = c10Var.l;
        try {
            if (i3 == 0) {
                ar.n(obj);
                c10Var.i = this;
                c10Var.l = 1;
                Object objC = c(c10Var);
                rc rcVar = rc.f;
                if (objC == rcVar) {
                    return rcVar;
                }
            } else {
                if (i3 != 1) {
                    j7.e("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i10 i10Var = c10Var.i;
                ar.n(obj);
            }
            this = k50.a;
            return this;
        } catch (Throwable th) {
            this.e.c(new ow(th));
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(ac acVar) {
        d10 d10Var;
        if (acVar instanceof d10) {
            d10Var = (d10) acVar;
            int i2 = d10Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                d10Var.l = i2 - Integer.MIN_VALUE;
            } else {
                d10Var = new d10(this, acVar);
            }
        } else {
            d10Var = new d10(this, acVar);
        }
        Object obj = d10Var.j;
        int i3 = d10Var.l;
        try {
            if (i3 == 0) {
                ar.n(obj);
                d10Var.i = this;
                d10Var.l = 1;
                Object objC = c(d10Var);
                rc rcVar = rc.f;
                this = objC;
                if (objC == rcVar) {
                    return rcVar;
                }
            } else {
                if (i3 != 1) {
                    j7.e("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i10 i10Var = d10Var.i;
                ar.n(obj);
                this = i10Var;
            }
        } catch (Throwable th) {
            this.e.c(new ow(th));
        }
        return k50.a;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:45:0x007b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13, types: [i10] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v2, types: [e10] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [i10] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public final Object f(ac acVar) throws IOException {
        ?? e10Var;
        FileInputStream fileInputStream;
        Throwable th;
        tb2 tb2VarB;
        if (acVar instanceof e10) {
            e10 e10Var2 = (e10) acVar;
            int i2 = e10Var2.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                e10Var2.m = i2 - Integer.MIN_VALUE;
                e10Var = e10Var2;
            } else {
                e10Var = new e10(this, acVar);
            }
        } else {
            e10Var = new e10(this, acVar);
        }
        Object obj = e10Var.k;
        int i3 = e10Var.m;
        try {
            if (i3 != 0) {
                if (i3 != 1) {
                    j7.e("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fileInputStream = e10Var.j;
                e10Var = e10Var.i;
                try {
                    ar.n(obj);
                    dq.i(fileInputStream, null);
                    return obj;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        throw th;
                    } catch (Throwable th3) {
                        dq.i(fileInputStream, th);
                        throw th3;
                    }
                }
            }
            ar.n(obj);
            try {
                FileInputStream fileInputStream2 = new FileInputStream(b());
                try {
                    tb2 tb2Var = ub2.a;
                    e10Var.i = this;
                    e10Var.j = fileInputStream2;
                    e10Var.m = 1;
                    try {
                        tb2VarB = tb2.B(fileInputStream2);
                    } catch (Exception unused) {
                        tb2VarB = ub2.a;
                    }
                    rc rcVar = rc.f;
                    if (tb2VarB == rcVar) {
                        return rcVar;
                    }
                    fileInputStream = fileInputStream2;
                    obj = tb2VarB;
                    dq.i(fileInputStream, null);
                    return obj;
                } catch (Throwable th4) {
                    e10Var = this;
                    fileInputStream = fileInputStream2;
                    th = th4;
                    throw th;
                }
            } catch (FileNotFoundException e) {
                e10Var = this;
                e = e;
                if (!e10Var.b().exists()) {
                    throw e;
                }
                tb2 tb2Var2 = ub2.a;
                return ub2.a;
            }
        } catch (FileNotFoundException e2) {
            e = e2;
            if (!e10Var.b().exists()) {
                throw e;
            }
            tb2 tb2Var3 = ub2.a;
            return ub2.a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(ac acVar) throws IOException {
        f10 f10Var;
        if (acVar instanceof f10) {
            f10Var = (f10) acVar;
            int i2 = f10Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                f10Var.m = i2 - Integer.MIN_VALUE;
            } else {
                f10Var = new f10(this, acVar);
            }
        } else {
            f10Var = new f10(this, acVar);
        }
        Object obj = f10Var.k;
        int i3 = f10Var.m;
        Object obj2 = rc.f;
        if (i3 == 0) {
            ar.n(obj);
            f10Var.i = this;
            f10Var.m = 1;
            Object objF = f(f10Var);
            if (objF != obj2) {
                return objF;
            }
        } else {
            if (i3 == 1) {
                ar.n(obj);
                return obj;
            }
            try {
                if (i3 != 2) {
                    if (i3 != 3) {
                        j7.e("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Object obj3 = f10Var.j;
                    if (f10Var.i == null) {
                        ar.n(obj);
                        return obj3;
                    }
                    j7.j();
                    return null;
                }
                if (f10Var.j != null) {
                    j7.j();
                    return null;
                }
                i10 i10Var = f10Var.i;
                ar.n(obj);
                f10Var.i = null;
                f10Var.j = obj;
                f10Var.m = 3;
                if (i10Var.j(obj, f10Var) != obj2) {
                    return obj;
                }
            } catch (IOException e) {
                na1.d(null, e);
                throw null;
            }
        }
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:77:0x014a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(gl glVar, ic icVar, ac acVar) throws Throwable {
        g10 g10Var;
        Object objR;
        rd rdVar;
        i10 i10Var;
        Object obj;
        i10 i10Var2;
        Object obj2;
        if (acVar instanceof g10) {
            g10Var = (g10) acVar;
            int i2 = g10Var.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                g10Var.n = i2 - Integer.MIN_VALUE;
            } else {
                g10Var = new g10(this, acVar);
            }
        } else {
            g10Var = new g10(this, acVar);
        }
        Object obj3 = g10Var.l;
        int i3 = g10Var.n;
        rc rcVar = rc.f;
        if (i3 != 0) {
            if (i3 == 1) {
                obj = g10Var.k;
                rdVar = (rd) g10Var.j;
                i10Var = g10Var.i;
                ar.n(obj3);
            } else {
                if (i3 != 2) {
                    j7.e("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                obj2 = g10Var.j;
                i10Var2 = g10Var.i;
                ar.n(obj3);
            }
            i10Var2.e.c(new rd(obj2 != null ? obj2.hashCode() : 0, obj2));
            return obj2;
        }
        ar.n(obj3);
        rd rdVar2 = (rd) this.e.b();
        Object obj4 = rdVar2.a;
        if ((obj4 != null ? obj4.hashCode() : 0) != rdVar2.b) {
            j7.e("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
            return null;
        }
        Object obj5 = rdVar2.a;
        sd sdVar = new sd(glVar, obj5, (yb) null);
        g10Var.i = this;
        g10Var.j = rdVar2;
        g10Var.k = obj5;
        g10Var.n = 1;
        ic icVar2 = g10Var.g;
        icVar2.getClass();
        ic icVarE = !((Boolean) icVar.b(Boolean.FALSE, new ga(2))).booleanValue() ? icVar2.e(icVar) : s90.f(icVar2, icVar, false);
        wn wnVar = (wn) icVarE.f(gm.h);
        if (wnVar != null && !wnVar.A()) {
            throw wnVar.s();
        }
        if (icVarE == icVar2) {
            fz fzVar = new fz(icVarE, g10Var);
            objR = rs0.k(fzVar, fzVar, sdVar);
        } else {
            ig igVar = ig.g;
            if (jn.b(icVarE.f(igVar), icVar2.f(igVar))) {
                i50 i50Var = new i50(icVarE, g10Var);
                ic icVar3 = i50Var.h;
                Object objS = dq.s(icVar3, null);
                try {
                    objR = rs0.k(i50Var, i50Var, sdVar);
                    dq.o(icVar3, objS);
                } catch (Throwable th) {
                    dq.o(icVar3, objS);
                    throw th;
                }
            } else {
                gf gfVar = new gf(icVarE, g10Var);
                try {
                    ss0.t(s90.h(sdVar.k(gfVar, gfVar)), k50.a);
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = gf.j;
                    while (true) {
                        int i4 = atomicIntegerFieldUpdater.get(gfVar);
                        if (i4 != 0) {
                            if (i4 != 2) {
                                j7.e("Already suspended");
                                return null;
                            }
                            objR = dq.r(wn.f.get(gfVar));
                            if (!(objR instanceof ma)) {
                                break;
                            }
                            throw ((ma) objR).a;
                        }
                        if (atomicIntegerFieldUpdater.compareAndSet(gfVar, 0, 1)) {
                            objR = rcVar;
                            break;
                        }
                    }
                } catch (Throwable th2) {
                    gfVar.d(new rx(th2));
                    throw th2;
                }
            }
        }
        if (objR != rcVar) {
            obj3 = objR;
            rdVar = rdVar2;
            i10Var = this;
            obj = obj5;
        }
        return rcVar;
        Object obj6 = rdVar.a;
        if ((obj6 != null ? obj6.hashCode() : 0) != rdVar.b) {
            j7.e("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
            return null;
        }
        if (jn.b(obj, obj3)) {
            return obj;
        }
        g10Var.i = i10Var;
        g10Var.j = obj3;
        g10Var.k = null;
        g10Var.n = 2;
        if (i10Var.j(obj3, g10Var) != rcVar) {
            i10Var2 = i10Var;
            obj2 = obj3;
            i10Var2.e.c(new rd(obj2 != null ? obj2.hashCode() : 0, obj2));
            return obj2;
        }
        return rcVar;
    }

    public final Object i(gl glVar, ac acVar) throws Throwable {
        Object obj;
        ja jaVar = new ja(true);
        jaVar.y(null);
        this.g.g(new s00(glVar, jaVar, (w10) this.e.b(), acVar.getContext()));
        do {
            obj = wn.f.get(jaVar);
            if (!(obj instanceof wm)) {
                if (obj instanceof ma) {
                    throw ((ma) obj).a;
                }
                return dq.r(obj);
            }
        } while (jaVar.K(obj) < 0);
        tn tnVar = new tn(s90.h(acVar), jaVar);
        tnVar.t();
        tnVar.v(new mf(rs0.i(jaVar, true, new k9(2, tnVar))));
        return tnVar.s();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object j(Object obj, ac acVar) throws IOException {
        h10 h10Var;
        File file;
        FileOutputStream fileOutputStream;
        i10 i10Var;
        FileOutputStream fileOutputStream2;
        if (acVar instanceof h10) {
            h10Var = (h10) acVar;
            int i2 = h10Var.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                h10Var.o = i2 - Integer.MIN_VALUE;
            } else {
                h10Var = new h10(this, acVar);
            }
        } else {
            h10Var = new h10(this, acVar);
        }
        Object obj2 = h10Var.m;
        int i3 = h10Var.o;
        k50 k50Var = k50.a;
        if (i3 == 0) {
            ar.n(obj2);
            File fileB = b();
            File parentFile = fileB.getCanonicalFile().getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
                if (!parentFile.isDirectory()) {
                    throw new IOException("Unable to create parent directories of " + fileB);
                }
            }
            file = new File(b().getAbsolutePath() + ((Object) this.c));
            try {
                FileOutputStream fileOutputStream3 = new FileOutputStream(file);
                try {
                    tb2 tb2Var = ub2.a;
                    u00 u00Var = new u00(fileOutputStream3);
                    h10Var.i = this;
                    h10Var.j = file;
                    h10Var.k = fileOutputStream3;
                    h10Var.l = fileOutputStream3;
                    h10Var.o = 1;
                    ((tb2) obj).c(u00Var);
                    rc rcVar = rc.f;
                    if (k50Var == rcVar) {
                        return rcVar;
                    }
                    i10Var = this;
                    fileOutputStream2 = fileOutputStream3;
                    fileOutputStream = fileOutputStream2;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream3;
                    throw th;
                }
            } catch (IOException e) {
                if (file.exists()) {
                    file.delete();
                }
                throw e;
            }
        } else {
            if (i3 != 1) {
                j7.e("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fileOutputStream2 = h10Var.l;
            fileOutputStream = h10Var.k;
            file = h10Var.j;
            i10Var = h10Var.i;
            try {
                ar.n(obj2);
            } catch (Throwable th2) {
                th = th2;
                try {
                    throw th;
                } catch (Throwable th3) {
                    dq.i(fileOutputStream, th);
                    throw th3;
                }
            }
        }
        fileOutputStream2.getFD().sync();
        dq.i(fileOutputStream, null);
        if (file.renameTo(i10Var.b())) {
            return k50Var;
        }
        throw new IOException("Unable to rename " + file + ".This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
    }
}
