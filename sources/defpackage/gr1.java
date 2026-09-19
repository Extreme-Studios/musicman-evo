package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class gr1 {
    public boolean a;
    public boolean b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public Cloneable g;
    public final Object h;
    public final Object i;

    public gr1(i10 i10Var, s62 s62Var, or1 or1Var, el1 el1Var) {
        i10Var.getClass();
        or1Var.getClass();
        this.i = or1Var;
        this.c = v51.b(new ai((ExecutorService) s62Var.f));
        this.d = new dt();
        this.e = new dt();
        this.f = new dt();
        this.h = i10Var;
    }

    public void a(Object obj) {
        synchronized (this.i) {
            try {
                if (this.a) {
                    return;
                }
                ((CopyOnWriteArraySet) this.f).add(new cq1(obj));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b(Object obj) {
        g();
        CopyOnWriteArraySet<cq1> copyOnWriteArraySet = (CopyOnWriteArraySet) this.f;
        for (cq1 cq1Var : copyOnWriteArraySet) {
            if (cq1Var.a.equals(obj)) {
                rp1 rp1Var = (rp1) this.e;
                cq1Var.d = true;
                if (cq1Var.c) {
                    cq1Var.c = false;
                    rp1Var.d(cq1Var.a, cq1Var.b.d());
                }
                copyOnWriteArraySet.remove(cq1Var);
            }
        }
    }

    public void c(int i, hp1 hp1Var) {
        g();
        ((ArrayDeque) this.h).add(new e6(new CopyOnWriteArraySet((CopyOnWriteArraySet) this.f), i, hp1Var, 4));
    }

    public void d() {
        g();
        ArrayDeque arrayDeque = (ArrayDeque) this.h;
        if (arrayDeque.isEmpty()) {
            return;
        }
        wx1 wx1Var = (wx1) this.d;
        Handler handler = wx1Var.a;
        Handler handler2 = wx1Var.a;
        if (!handler.hasMessages(1)) {
            ox1 ox1VarF = wx1.f();
            Message messageObtainMessage = handler2.obtainMessage(1);
            ox1VarF.a = messageObtainMessage;
            messageObtainMessage.getClass();
            handler2.sendMessageAtFrontOfQueue(messageObtainMessage);
            ox1VarF.a = null;
            wx1.e(ox1VarF);
        }
        ArrayDeque arrayDeque2 = (ArrayDeque) this.g;
        boolean zIsEmpty = arrayDeque2.isEmpty();
        arrayDeque2.addAll(arrayDeque);
        arrayDeque.clear();
        if (zIsEmpty) {
            while (!arrayDeque2.isEmpty()) {
                ((Runnable) arrayDeque2.peekFirst()).run();
                arrayDeque2.removeFirst();
            }
        }
    }

    public void e() {
        g();
        synchronized (this.i) {
            this.a = true;
        }
        CopyOnWriteArraySet<cq1> copyOnWriteArraySet = (CopyOnWriteArraySet) this.f;
        for (cq1 cq1Var : copyOnWriteArraySet) {
            rp1 rp1Var = (rp1) this.e;
            cq1Var.d = true;
            if (cq1Var.c) {
                cq1Var.c = false;
                rp1Var.d(cq1Var.a, cq1Var.b.d());
            }
        }
        copyOnWriteArraySet.clear();
    }

    /* JADX WARN: Code duplicated, block: B:37:0x008c  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v5, types: [dt] */
    public Object f(ac acVar) {
        hc2 hc2Var;
        dt dtVar;
        tb2 tb2Var;
        pb2 pb2Var;
        qb2 qb2Var;
        j23 j23VarL;
        Long l;
        boolean z;
        boolean z2;
        Object obj;
        if (acVar instanceof hc2) {
            hc2Var = (hc2) acVar;
            int i = hc2Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                hc2Var.l = i - Integer.MIN_VALUE;
            } else {
                hc2Var = new hc2(this, acVar);
            }
        } else {
            hc2Var = new hc2(this, acVar);
        }
        Object objJ = hc2Var.j;
        dt dtVar2 = hc2Var.l;
        k50 k50Var = k50.a;
        Object obj2 = rc.f;
        try {
            if (dtVar2 == 0) {
                ar.n(objJ);
                dt dtVar3 = (dt) this.f;
                hc2Var.i = dtVar3;
                hc2Var.l = 1;
                if (dtVar3.c(hc2Var) != obj2) {
                    dtVar = dtVar3;
                }
                return obj2;
            }
            if (dtVar2 == 1) {
                dt dtVar4 = hc2Var.i;
                ar.n(objJ);
                dtVar = dtVar4;
            } else {
                if (dtVar2 != 2) {
                    if (dtVar2 == 3) {
                        ar.n(objJ);
                        return k50Var;
                    }
                    j7.e("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dt dtVar5 = hc2Var.i;
                ar.n(objJ);
                dtVar2 = dtVar5;
            }
            tb2Var = (tb2) objJ;
            dtVar2.d(null);
            if (tb2Var != null && tb2Var.z() != 0) {
                for (Map.Entry entry : tb2Var.A().entrySet()) {
                    pb2Var = (pb2) ((qb2) entry.getValue()).r();
                    Object value = entry.getValue();
                    value.getClass();
                    qb2Var = (qb2) value;
                    j23VarL = qb2Var.L();
                    if (j23VarL != null) {
                        if (j23VarL.isEmpty()) {
                            obj = null;
                        } else {
                            s23 s23Var = (s23) j23VarL;
                            obj = s23Var.get(s23Var.h - 1);
                        }
                        l = (Long) obj;
                    } else {
                        l = null;
                    }
                    z = false;
                    if (qb2Var.M() > qb2Var.N() || qb2Var.F()) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (l != null) {
                        if (qb2Var.J() - l.longValue() > 5000) {
                            z = true;
                        }
                    }
                    if (z2 || z) {
                        pb2Var.b();
                        ((qb2) pb2Var.g).V(true);
                    }
                    ((or1) this.i).a((qb2) pb2Var.c());
                }
                hc2Var.i = null;
                hc2Var.l = 3;
                if (o(hc2Var) == obj2) {
                    return obj2;
                }
            }
            return k50Var;
            zy1 zy1Var = ((i10) this.h).b;
            hc2Var.i = dtVar;
            hc2Var.l = 2;
            objJ = dq.j(zy1Var, hc2Var);
            dtVar2 = dtVar;
            if (objJ != obj2) {
                tb2Var = (tb2) objJ;
                dtVar2.d(null);
                if (tb2Var != null) {
                    while (r1.hasNext()) {
                        pb2Var = (pb2) ((qb2) entry.getValue()).r();
                        Object value2 = entry.getValue();
                        value2.getClass();
                        qb2Var = (qb2) value2;
                        j23VarL = qb2Var.L();
                        if (j23VarL != null) {
                            if (j23VarL.isEmpty()) {
                                obj = null;
                            } else {
                                s23 s23Var2 = (s23) j23VarL;
                                obj = s23Var2.get(s23Var2.h - 1);
                            }
                            l = (Long) obj;
                        } else {
                            l = null;
                        }
                        z = false;
                        if (qb2Var.M() > qb2Var.N()) {
                            z2 = false;
                        } else {
                            z2 = false;
                        }
                        if (l != null) {
                            if (qb2Var.J() - l.longValue() > 5000) {
                                z = true;
                            }
                        }
                        if (z2) {
                            pb2Var.b();
                            ((qb2) pb2Var.g).V(true);
                        } else {
                            pb2Var.b();
                            ((qb2) pb2Var.g).V(true);
                        }
                        ((or1) this.i).a((qb2) pb2Var.c());
                    }
                    hc2Var.i = null;
                    hc2Var.l = 3;
                    if (o(hc2Var) == obj2) {
                    }
                }
                return k50Var;
            }
            return obj2;
        } catch (Throwable th) {
            dtVar2.d(null);
            throw th;
        }
    }

    public void g() {
        if (this.b) {
            hn.M(Thread.currentThread() == ((wx1) this.d).a.getLooper().getThread());
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object h(String str, ac acVar) throws Throwable {
        ec2 ec2Var;
        long jCurrentTimeMillis;
        String str2;
        dt dtVar;
        if (acVar instanceof ec2) {
            ec2Var = (ec2) acVar;
            int i = ec2Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                ec2Var.m = i - Integer.MIN_VALUE;
            } else {
                ec2Var = new ec2(this, acVar);
            }
        } else {
            ec2Var = new ec2(this, acVar);
        }
        Object obj = ec2Var.k;
        int i2 = ec2Var.m;
        if (i2 == 0) {
            ar.n(obj);
            dt dtVar2 = (dt) this.d;
            jCurrentTimeMillis = System.currentTimeMillis();
            ec2Var.n = str;
            ec2Var.i = dtVar2;
            ec2Var.j = jCurrentTimeMillis;
            ec2Var.m = 1;
            Object objC = dtVar2.c(ec2Var);
            rc rcVar = rc.f;
            if (objC == rcVar) {
                return rcVar;
            }
            str2 = str;
            dtVar = dtVar2;
        } else {
            if (i2 != 1) {
                j7.e("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jCurrentTimeMillis = ec2Var.j;
            dtVar = ec2Var.i;
            str2 = ec2Var.n;
            ar.n(obj);
        }
        try {
            boolean z = this.a;
            k50 k50Var = k50.a;
            if (z) {
                return k50Var;
            }
            this.a = true;
            pb2 pb2Var = (pb2) qb2.Q().r();
            this.g = pb2Var;
            pb2Var.b();
            ((qb2) pb2Var.g).R(str2);
            pb2Var.b();
            ((qb2) pb2Var.g).X(jCurrentTimeMillis);
            return k50Var;
        } finally {
            dtVar.d(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0086 A[Catch: all -> 0x00ad, TRY_LEAVE, TryCatch #1 {all -> 0x00ad, blocks: (B:31:0x0080, B:33:0x0086, B:40:0x00a7, B:41:0x00ac), top: B:51:0x0080 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00a6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x00a7 A[Catch: all -> 0x00ad, TRY_ENTER, TryCatch #1 {all -> 0x00ad, blocks: (B:31:0x0080, B:33:0x0086, B:40:0x00a7, B:41:0x00ac), top: B:51:0x0080 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object i(ac acVar) {
        ac2 ac2Var;
        dt dtVar;
        dt dtVar2;
        long j;
        pb2 pb2Var;
        if (acVar instanceof ac2) {
            ac2Var = (ac2) acVar;
            int i = ac2Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                ac2Var.m = i - Integer.MIN_VALUE;
            } else {
                ac2Var = new ac2(this, acVar);
            }
        } else {
            ac2Var = new ac2(this, acVar);
        }
        Object obj = ac2Var.k;
        int i2 = ac2Var.m;
        k50 k50Var = k50.a;
        Object obj2 = rc.f;
        try {
            if (i2 == 0) {
                ar.n(obj);
                dtVar = (dt) this.e;
                ac2Var.i = dtVar;
                ac2Var.m = 1;
                if (dtVar.c(ac2Var) != obj2) {
                }
                return obj2;
            }
            if (i2 == 1) {
                dtVar = ac2Var.i;
                ar.n(obj);
            } else {
                if (i2 == 2) {
                    j = ac2Var.j;
                    dtVar2 = ac2Var.i;
                    ar.n(obj);
                    try {
                        pb2Var = (pb2) this.g;
                        if (pb2Var != null) {
                            jn.k("adQualityDataBuilder");
                            throw null;
                        }
                        pb2Var.b();
                        ((qb2) pb2Var.g).a0(j);
                        dtVar2.d(null);
                        ac2Var.i = null;
                        ac2Var.m = 3;
                        if (p(j, ac2Var) != obj2) {
                        }
                        return obj2;
                    } catch (Throwable th) {
                        dtVar2.d(null);
                        throw th;
                    }
                }
                if (i2 != 3) {
                    if (i2 == 4) {
                        ar.n(obj);
                        return k50Var;
                    }
                    j7.e("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ar.n(obj);
            }
            ac2Var.m = 4;
            if (q(ac2Var) != obj2) {
                return obj2;
            }
            return k50Var;
            if (this.b) {
                dtVar.d(null);
                return k50Var;
            }
            this.b = true;
            dtVar.d(null);
            dtVar2 = (dt) this.d;
            long jCurrentTimeMillis = System.currentTimeMillis();
            ac2Var.i = dtVar2;
            ac2Var.j = jCurrentTimeMillis;
            ac2Var.m = 2;
            if (dtVar2.c(ac2Var) != obj2) {
                j = jCurrentTimeMillis;
                pb2Var = (pb2) this.g;
                if (pb2Var != null) {
                    jn.k("adQualityDataBuilder");
                    throw null;
                }
                pb2Var.b();
                ((qb2) pb2Var.g).a0(j);
                dtVar2.d(null);
                ac2Var.i = null;
                ac2Var.m = 3;
                if (p(j, ac2Var) != obj2) {
                    ac2Var.m = 4;
                    if (q(ac2Var) != obj2) {
                        return k50Var;
                    }
                }
            }
            return obj2;
        } catch (Throwable th2) {
            dtVar.d(null);
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007b A[Catch: all -> 0x00ee, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00ee, blocks: (B:27:0x0073, B:30:0x007b, B:33:0x0087, B:35:0x008d, B:37:0x00a2, B:39:0x00bc, B:41:0x00cc, B:43:0x00d2, B:44:0x00e6, B:45:0x00e9, B:46:0x00ea, B:47:0x00ed, B:50:0x00f1, B:51:0x00f6, B:52:0x00f7, B:53:0x00fa, B:54:0x00fb, B:56:0x0101, B:58:0x010b, B:60:0x0111, B:62:0x0126, B:64:0x0140, B:65:0x0154, B:66:0x0157, B:67:0x0158, B:68:0x015d, B:69:0x015e, B:70:0x0161, B:71:0x0162, B:73:0x0168, B:76:0x0176, B:77:0x0179, B:78:0x017a, B:79:0x017d, B:80:0x017e, B:81:0x0181), top: B:90:0x0073 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0087 A[Catch: all -> 0x00ee, TRY_ENTER, TryCatch #1 {all -> 0x00ee, blocks: (B:27:0x0073, B:30:0x007b, B:33:0x0087, B:35:0x008d, B:37:0x00a2, B:39:0x00bc, B:41:0x00cc, B:43:0x00d2, B:44:0x00e6, B:45:0x00e9, B:46:0x00ea, B:47:0x00ed, B:50:0x00f1, B:51:0x00f6, B:52:0x00f7, B:53:0x00fa, B:54:0x00fb, B:56:0x0101, B:58:0x010b, B:60:0x0111, B:62:0x0126, B:64:0x0140, B:65:0x0154, B:66:0x0157, B:67:0x0158, B:68:0x015d, B:69:0x015e, B:70:0x0161, B:71:0x0162, B:73:0x0168, B:76:0x0176, B:77:0x0179, B:78:0x017a, B:79:0x017d, B:80:0x017e, B:81:0x0181), top: B:90:0x0073 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x008d A[Catch: all -> 0x00ee, TryCatch #1 {all -> 0x00ee, blocks: (B:27:0x0073, B:30:0x007b, B:33:0x0087, B:35:0x008d, B:37:0x00a2, B:39:0x00bc, B:41:0x00cc, B:43:0x00d2, B:44:0x00e6, B:45:0x00e9, B:46:0x00ea, B:47:0x00ed, B:50:0x00f1, B:51:0x00f6, B:52:0x00f7, B:53:0x00fa, B:54:0x00fb, B:56:0x0101, B:58:0x010b, B:60:0x0111, B:62:0x0126, B:64:0x0140, B:65:0x0154, B:66:0x0157, B:67:0x0158, B:68:0x015d, B:69:0x015e, B:70:0x0161, B:71:0x0162, B:73:0x0168, B:76:0x0176, B:77:0x0179, B:78:0x017a, B:79:0x017d, B:80:0x017e, B:81:0x0181), top: B:90:0x0073 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00a2 A[Catch: all -> 0x00ee, TryCatch #1 {all -> 0x00ee, blocks: (B:27:0x0073, B:30:0x007b, B:33:0x0087, B:35:0x008d, B:37:0x00a2, B:39:0x00bc, B:41:0x00cc, B:43:0x00d2, B:44:0x00e6, B:45:0x00e9, B:46:0x00ea, B:47:0x00ed, B:50:0x00f1, B:51:0x00f6, B:52:0x00f7, B:53:0x00fa, B:54:0x00fb, B:56:0x0101, B:58:0x010b, B:60:0x0111, B:62:0x0126, B:64:0x0140, B:65:0x0154, B:66:0x0157, B:67:0x0158, B:68:0x015d, B:69:0x015e, B:70:0x0161, B:71:0x0162, B:73:0x0168, B:76:0x0176, B:77:0x0179, B:78:0x017a, B:79:0x017d, B:80:0x017e, B:81:0x0181), top: B:90:0x0073 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00bc A[Catch: all -> 0x00ee, TryCatch #1 {all -> 0x00ee, blocks: (B:27:0x0073, B:30:0x007b, B:33:0x0087, B:35:0x008d, B:37:0x00a2, B:39:0x00bc, B:41:0x00cc, B:43:0x00d2, B:44:0x00e6, B:45:0x00e9, B:46:0x00ea, B:47:0x00ed, B:50:0x00f1, B:51:0x00f6, B:52:0x00f7, B:53:0x00fa, B:54:0x00fb, B:56:0x0101, B:58:0x010b, B:60:0x0111, B:62:0x0126, B:64:0x0140, B:65:0x0154, B:66:0x0157, B:67:0x0158, B:68:0x015d, B:69:0x015e, B:70:0x0161, B:71:0x0162, B:73:0x0168, B:76:0x0176, B:77:0x0179, B:78:0x017a, B:79:0x017d, B:80:0x017e, B:81:0x0181), top: B:90:0x0073 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00cc A[Catch: all -> 0x00ee, TryCatch #1 {all -> 0x00ee, blocks: (B:27:0x0073, B:30:0x007b, B:33:0x0087, B:35:0x008d, B:37:0x00a2, B:39:0x00bc, B:41:0x00cc, B:43:0x00d2, B:44:0x00e6, B:45:0x00e9, B:46:0x00ea, B:47:0x00ed, B:50:0x00f1, B:51:0x00f6, B:52:0x00f7, B:53:0x00fa, B:54:0x00fb, B:56:0x0101, B:58:0x010b, B:60:0x0111, B:62:0x0126, B:64:0x0140, B:65:0x0154, B:66:0x0157, B:67:0x0158, B:68:0x015d, B:69:0x015e, B:70:0x0161, B:71:0x0162, B:73:0x0168, B:76:0x0176, B:77:0x0179, B:78:0x017a, B:79:0x017d, B:80:0x017e, B:81:0x0181), top: B:90:0x0073 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00d2 A[Catch: all -> 0x00ee, TryCatch #1 {all -> 0x00ee, blocks: (B:27:0x0073, B:30:0x007b, B:33:0x0087, B:35:0x008d, B:37:0x00a2, B:39:0x00bc, B:41:0x00cc, B:43:0x00d2, B:44:0x00e6, B:45:0x00e9, B:46:0x00ea, B:47:0x00ed, B:50:0x00f1, B:51:0x00f6, B:52:0x00f7, B:53:0x00fa, B:54:0x00fb, B:56:0x0101, B:58:0x010b, B:60:0x0111, B:62:0x0126, B:64:0x0140, B:65:0x0154, B:66:0x0157, B:67:0x0158, B:68:0x015d, B:69:0x015e, B:70:0x0161, B:71:0x0162, B:73:0x0168, B:76:0x0176, B:77:0x0179, B:78:0x017a, B:79:0x017d, B:80:0x017e, B:81:0x0181), top: B:90:0x0073 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00e6 A[Catch: all -> 0x00ee, TryCatch #1 {all -> 0x00ee, blocks: (B:27:0x0073, B:30:0x007b, B:33:0x0087, B:35:0x008d, B:37:0x00a2, B:39:0x00bc, B:41:0x00cc, B:43:0x00d2, B:44:0x00e6, B:45:0x00e9, B:46:0x00ea, B:47:0x00ed, B:50:0x00f1, B:51:0x00f6, B:52:0x00f7, B:53:0x00fa, B:54:0x00fb, B:56:0x0101, B:58:0x010b, B:60:0x0111, B:62:0x0126, B:64:0x0140, B:65:0x0154, B:66:0x0157, B:67:0x0158, B:68:0x015d, B:69:0x015e, B:70:0x0161, B:71:0x0162, B:73:0x0168, B:76:0x0176, B:77:0x0179, B:78:0x017a, B:79:0x017d, B:80:0x017e, B:81:0x0181), top: B:90:0x0073 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00ea A[Catch: all -> 0x00ee, TryCatch #1 {all -> 0x00ee, blocks: (B:27:0x0073, B:30:0x007b, B:33:0x0087, B:35:0x008d, B:37:0x00a2, B:39:0x00bc, B:41:0x00cc, B:43:0x00d2, B:44:0x00e6, B:45:0x00e9, B:46:0x00ea, B:47:0x00ed, B:50:0x00f1, B:51:0x00f6, B:52:0x00f7, B:53:0x00fa, B:54:0x00fb, B:56:0x0101, B:58:0x010b, B:60:0x0111, B:62:0x0126, B:64:0x0140, B:65:0x0154, B:66:0x0157, B:67:0x0158, B:68:0x015d, B:69:0x015e, B:70:0x0161, B:71:0x0162, B:73:0x0168, B:76:0x0176, B:77:0x0179, B:78:0x017a, B:79:0x017d, B:80:0x017e, B:81:0x0181), top: B:90:0x0073 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00f1 A[Catch: all -> 0x00ee, TryCatch #1 {all -> 0x00ee, blocks: (B:27:0x0073, B:30:0x007b, B:33:0x0087, B:35:0x008d, B:37:0x00a2, B:39:0x00bc, B:41:0x00cc, B:43:0x00d2, B:44:0x00e6, B:45:0x00e9, B:46:0x00ea, B:47:0x00ed, B:50:0x00f1, B:51:0x00f6, B:52:0x00f7, B:53:0x00fa, B:54:0x00fb, B:56:0x0101, B:58:0x010b, B:60:0x0111, B:62:0x0126, B:64:0x0140, B:65:0x0154, B:66:0x0157, B:67:0x0158, B:68:0x015d, B:69:0x015e, B:70:0x0161, B:71:0x0162, B:73:0x0168, B:76:0x0176, B:77:0x0179, B:78:0x017a, B:79:0x017d, B:80:0x017e, B:81:0x0181), top: B:90:0x0073 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00f7 A[Catch: all -> 0x00ee, TryCatch #1 {all -> 0x00ee, blocks: (B:27:0x0073, B:30:0x007b, B:33:0x0087, B:35:0x008d, B:37:0x00a2, B:39:0x00bc, B:41:0x00cc, B:43:0x00d2, B:44:0x00e6, B:45:0x00e9, B:46:0x00ea, B:47:0x00ed, B:50:0x00f1, B:51:0x00f6, B:52:0x00f7, B:53:0x00fa, B:54:0x00fb, B:56:0x0101, B:58:0x010b, B:60:0x0111, B:62:0x0126, B:64:0x0140, B:65:0x0154, B:66:0x0157, B:67:0x0158, B:68:0x015d, B:69:0x015e, B:70:0x0161, B:71:0x0162, B:73:0x0168, B:76:0x0176, B:77:0x0179, B:78:0x017a, B:79:0x017d, B:80:0x017e, B:81:0x0181), top: B:90:0x0073 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0101 A[Catch: all -> 0x00ee, TryCatch #1 {all -> 0x00ee, blocks: (B:27:0x0073, B:30:0x007b, B:33:0x0087, B:35:0x008d, B:37:0x00a2, B:39:0x00bc, B:41:0x00cc, B:43:0x00d2, B:44:0x00e6, B:45:0x00e9, B:46:0x00ea, B:47:0x00ed, B:50:0x00f1, B:51:0x00f6, B:52:0x00f7, B:53:0x00fa, B:54:0x00fb, B:56:0x0101, B:58:0x010b, B:60:0x0111, B:62:0x0126, B:64:0x0140, B:65:0x0154, B:66:0x0157, B:67:0x0158, B:68:0x015d, B:69:0x015e, B:70:0x0161, B:71:0x0162, B:73:0x0168, B:76:0x0176, B:77:0x0179, B:78:0x017a, B:79:0x017d, B:80:0x017e, B:81:0x0181), top: B:90:0x0073 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x010b A[Catch: all -> 0x00ee, TryCatch #1 {all -> 0x00ee, blocks: (B:27:0x0073, B:30:0x007b, B:33:0x0087, B:35:0x008d, B:37:0x00a2, B:39:0x00bc, B:41:0x00cc, B:43:0x00d2, B:44:0x00e6, B:45:0x00e9, B:46:0x00ea, B:47:0x00ed, B:50:0x00f1, B:51:0x00f6, B:52:0x00f7, B:53:0x00fa, B:54:0x00fb, B:56:0x0101, B:58:0x010b, B:60:0x0111, B:62:0x0126, B:64:0x0140, B:65:0x0154, B:66:0x0157, B:67:0x0158, B:68:0x015d, B:69:0x015e, B:70:0x0161, B:71:0x0162, B:73:0x0168, B:76:0x0176, B:77:0x0179, B:78:0x017a, B:79:0x017d, B:80:0x017e, B:81:0x0181), top: B:90:0x0073 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0111 A[Catch: all -> 0x00ee, TryCatch #1 {all -> 0x00ee, blocks: (B:27:0x0073, B:30:0x007b, B:33:0x0087, B:35:0x008d, B:37:0x00a2, B:39:0x00bc, B:41:0x00cc, B:43:0x00d2, B:44:0x00e6, B:45:0x00e9, B:46:0x00ea, B:47:0x00ed, B:50:0x00f1, B:51:0x00f6, B:52:0x00f7, B:53:0x00fa, B:54:0x00fb, B:56:0x0101, B:58:0x010b, B:60:0x0111, B:62:0x0126, B:64:0x0140, B:65:0x0154, B:66:0x0157, B:67:0x0158, B:68:0x015d, B:69:0x015e, B:70:0x0161, B:71:0x0162, B:73:0x0168, B:76:0x0176, B:77:0x0179, B:78:0x017a, B:79:0x017d, B:80:0x017e, B:81:0x0181), top: B:90:0x0073 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0126 A[Catch: all -> 0x00ee, TryCatch #1 {all -> 0x00ee, blocks: (B:27:0x0073, B:30:0x007b, B:33:0x0087, B:35:0x008d, B:37:0x00a2, B:39:0x00bc, B:41:0x00cc, B:43:0x00d2, B:44:0x00e6, B:45:0x00e9, B:46:0x00ea, B:47:0x00ed, B:50:0x00f1, B:51:0x00f6, B:52:0x00f7, B:53:0x00fa, B:54:0x00fb, B:56:0x0101, B:58:0x010b, B:60:0x0111, B:62:0x0126, B:64:0x0140, B:65:0x0154, B:66:0x0157, B:67:0x0158, B:68:0x015d, B:69:0x015e, B:70:0x0161, B:71:0x0162, B:73:0x0168, B:76:0x0176, B:77:0x0179, B:78:0x017a, B:79:0x017d, B:80:0x017e, B:81:0x0181), top: B:90:0x0073 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0140 A[Catch: all -> 0x00ee, TryCatch #1 {all -> 0x00ee, blocks: (B:27:0x0073, B:30:0x007b, B:33:0x0087, B:35:0x008d, B:37:0x00a2, B:39:0x00bc, B:41:0x00cc, B:43:0x00d2, B:44:0x00e6, B:45:0x00e9, B:46:0x00ea, B:47:0x00ed, B:50:0x00f1, B:51:0x00f6, B:52:0x00f7, B:53:0x00fa, B:54:0x00fb, B:56:0x0101, B:58:0x010b, B:60:0x0111, B:62:0x0126, B:64:0x0140, B:65:0x0154, B:66:0x0157, B:67:0x0158, B:68:0x015d, B:69:0x015e, B:70:0x0161, B:71:0x0162, B:73:0x0168, B:76:0x0176, B:77:0x0179, B:78:0x017a, B:79:0x017d, B:80:0x017e, B:81:0x0181), top: B:90:0x0073 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0154 A[Catch: all -> 0x00ee, TryCatch #1 {all -> 0x00ee, blocks: (B:27:0x0073, B:30:0x007b, B:33:0x0087, B:35:0x008d, B:37:0x00a2, B:39:0x00bc, B:41:0x00cc, B:43:0x00d2, B:44:0x00e6, B:45:0x00e9, B:46:0x00ea, B:47:0x00ed, B:50:0x00f1, B:51:0x00f6, B:52:0x00f7, B:53:0x00fa, B:54:0x00fb, B:56:0x0101, B:58:0x010b, B:60:0x0111, B:62:0x0126, B:64:0x0140, B:65:0x0154, B:66:0x0157, B:67:0x0158, B:68:0x015d, B:69:0x015e, B:70:0x0161, B:71:0x0162, B:73:0x0168, B:76:0x0176, B:77:0x0179, B:78:0x017a, B:79:0x017d, B:80:0x017e, B:81:0x0181), top: B:90:0x0073 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0158 A[Catch: all -> 0x00ee, TryCatch #1 {all -> 0x00ee, blocks: (B:27:0x0073, B:30:0x007b, B:33:0x0087, B:35:0x008d, B:37:0x00a2, B:39:0x00bc, B:41:0x00cc, B:43:0x00d2, B:44:0x00e6, B:45:0x00e9, B:46:0x00ea, B:47:0x00ed, B:50:0x00f1, B:51:0x00f6, B:52:0x00f7, B:53:0x00fa, B:54:0x00fb, B:56:0x0101, B:58:0x010b, B:60:0x0111, B:62:0x0126, B:64:0x0140, B:65:0x0154, B:66:0x0157, B:67:0x0158, B:68:0x015d, B:69:0x015e, B:70:0x0161, B:71:0x0162, B:73:0x0168, B:76:0x0176, B:77:0x0179, B:78:0x017a, B:79:0x017d, B:80:0x017e, B:81:0x0181), top: B:90:0x0073 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x015e A[Catch: all -> 0x00ee, TryCatch #1 {all -> 0x00ee, blocks: (B:27:0x0073, B:30:0x007b, B:33:0x0087, B:35:0x008d, B:37:0x00a2, B:39:0x00bc, B:41:0x00cc, B:43:0x00d2, B:44:0x00e6, B:45:0x00e9, B:46:0x00ea, B:47:0x00ed, B:50:0x00f1, B:51:0x00f6, B:52:0x00f7, B:53:0x00fa, B:54:0x00fb, B:56:0x0101, B:58:0x010b, B:60:0x0111, B:62:0x0126, B:64:0x0140, B:65:0x0154, B:66:0x0157, B:67:0x0158, B:68:0x015d, B:69:0x015e, B:70:0x0161, B:71:0x0162, B:73:0x0168, B:76:0x0176, B:77:0x0179, B:78:0x017a, B:79:0x017d, B:80:0x017e, B:81:0x0181), top: B:90:0x0073 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0168 A[Catch: all -> 0x00ee, TRY_LEAVE, TryCatch #1 {all -> 0x00ee, blocks: (B:27:0x0073, B:30:0x007b, B:33:0x0087, B:35:0x008d, B:37:0x00a2, B:39:0x00bc, B:41:0x00cc, B:43:0x00d2, B:44:0x00e6, B:45:0x00e9, B:46:0x00ea, B:47:0x00ed, B:50:0x00f1, B:51:0x00f6, B:52:0x00f7, B:53:0x00fa, B:54:0x00fb, B:56:0x0101, B:58:0x010b, B:60:0x0111, B:62:0x0126, B:64:0x0140, B:65:0x0154, B:66:0x0157, B:67:0x0158, B:68:0x015d, B:69:0x015e, B:70:0x0161, B:71:0x0162, B:73:0x0168, B:76:0x0176, B:77:0x0179, B:78:0x017a, B:79:0x017d, B:80:0x017e, B:81:0x0181), top: B:90:0x0073 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0176 A[Catch: all -> 0x00ee, TRY_ENTER, TryCatch #1 {all -> 0x00ee, blocks: (B:27:0x0073, B:30:0x007b, B:33:0x0087, B:35:0x008d, B:37:0x00a2, B:39:0x00bc, B:41:0x00cc, B:43:0x00d2, B:44:0x00e6, B:45:0x00e9, B:46:0x00ea, B:47:0x00ed, B:50:0x00f1, B:51:0x00f6, B:52:0x00f7, B:53:0x00fa, B:54:0x00fb, B:56:0x0101, B:58:0x010b, B:60:0x0111, B:62:0x0126, B:64:0x0140, B:65:0x0154, B:66:0x0157, B:67:0x0158, B:68:0x015d, B:69:0x015e, B:70:0x0161, B:71:0x0162, B:73:0x0168, B:76:0x0176, B:77:0x0179, B:78:0x017a, B:79:0x017d, B:80:0x017e, B:81:0x0181), top: B:90:0x0073 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x017a A[Catch: all -> 0x00ee, TryCatch #1 {all -> 0x00ee, blocks: (B:27:0x0073, B:30:0x007b, B:33:0x0087, B:35:0x008d, B:37:0x00a2, B:39:0x00bc, B:41:0x00cc, B:43:0x00d2, B:44:0x00e6, B:45:0x00e9, B:46:0x00ea, B:47:0x00ed, B:50:0x00f1, B:51:0x00f6, B:52:0x00f7, B:53:0x00fa, B:54:0x00fb, B:56:0x0101, B:58:0x010b, B:60:0x0111, B:62:0x0126, B:64:0x0140, B:65:0x0154, B:66:0x0157, B:67:0x0158, B:68:0x015d, B:69:0x015e, B:70:0x0161, B:71:0x0162, B:73:0x0168, B:76:0x0176, B:77:0x0179, B:78:0x017a, B:79:0x017d, B:80:0x017e, B:81:0x0181), top: B:90:0x0073 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:80:0x017e A[Catch: all -> 0x00ee, TryCatch #1 {all -> 0x00ee, blocks: (B:27:0x0073, B:30:0x007b, B:33:0x0087, B:35:0x008d, B:37:0x00a2, B:39:0x00bc, B:41:0x00cc, B:43:0x00d2, B:44:0x00e6, B:45:0x00e9, B:46:0x00ea, B:47:0x00ed, B:50:0x00f1, B:51:0x00f6, B:52:0x00f7, B:53:0x00fa, B:54:0x00fb, B:56:0x0101, B:58:0x010b, B:60:0x0111, B:62:0x0126, B:64:0x0140, B:65:0x0154, B:66:0x0157, B:67:0x0158, B:68:0x015d, B:69:0x015e, B:70:0x0161, B:71:0x0162, B:73:0x0168, B:76:0x0176, B:77:0x0179, B:78:0x017a, B:79:0x017d, B:80:0x017e, B:81:0x0181), top: B:90:0x0073 }] */
    public Object j(ac acVar) {
        jc2 jc2Var;
        dt dtVar;
        dt dtVar2;
        long j;
        pb2 pb2Var;
        pb2 pb2Var2;
        pb2 pb2Var3;
        pb2 pb2Var4;
        List listUnmodifiableList;
        long jLongValue;
        pb2 pb2Var5;
        pb2 pb2Var6;
        List listUnmodifiableList2;
        long jLongValue2;
        pb2 pb2Var7;
        pb2 pb2Var8;
        if (acVar instanceof jc2) {
            jc2Var = (jc2) acVar;
            int i = jc2Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                jc2Var.m = i - Integer.MIN_VALUE;
            } else {
                jc2Var = new jc2(this, acVar);
            }
        } else {
            jc2Var = new jc2(this, acVar);
        }
        Object obj = jc2Var.k;
        int i2 = jc2Var.m;
        k50 k50Var = k50.a;
        rc rcVar = rc.f;
        try {
            if (i2 == 0) {
                ar.n(obj);
                dtVar = (dt) this.e;
                jc2Var.i = dtVar;
                jc2Var.m = 1;
                if (dtVar.c(jc2Var) != rcVar) {
                }
                return rcVar;
            }
            if (i2 == 1) {
                dtVar = jc2Var.i;
                ar.n(obj);
            } else {
                if (i2 != 2) {
                    j7.e("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j = jc2Var.j;
                dtVar2 = jc2Var.i;
                ar.n(obj);
            }
            try {
                pb2Var = (pb2) this.g;
                if (pb2Var != null) {
                    jn.k("adQualityDataBuilder");
                    throw null;
                }
                if (((qb2) pb2Var.g).P() > 0) {
                    pb2Var6 = (pb2) this.g;
                    if (pb2Var6 != null) {
                        jn.k("adQualityDataBuilder");
                        throw null;
                    }
                    listUnmodifiableList2 = Collections.unmodifiableList(((qb2) pb2Var6.g).O());
                    listUnmodifiableList2.getClass();
                    if (!listUnmodifiableList2.isEmpty()) {
                        throw new NoSuchElementException("List is empty.");
                    }
                    Object obj2 = listUnmodifiableList2.get(listUnmodifiableList2.size() - 1);
                    obj2.getClass();
                    jLongValue2 = j - ((Number) obj2).longValue();
                    pb2Var7 = (pb2) this.g;
                    if (pb2Var7 != null) {
                        jn.k("adQualityDataBuilder");
                        throw null;
                    }
                    pb2Var7.b();
                    ((qb2) pb2Var7.g).B();
                    if (jLongValue2 < 5000) {
                        pb2Var8 = (pb2) this.g;
                        if (pb2Var8 != null) {
                            jn.k("adQualityDataBuilder");
                            throw null;
                        }
                        int iE = ((qb2) pb2Var8.g).E() + 1;
                        pb2Var8.b();
                        ((qb2) pb2Var8.g).T(iE);
                    }
                }
                pb2Var2 = (pb2) this.g;
                if (pb2Var2 != null) {
                    jn.k("adQualityDataBuilder");
                    throw null;
                }
                if (((qb2) pb2Var2.g).M() > 0) {
                    pb2Var4 = (pb2) this.g;
                    if (pb2Var4 != null) {
                        jn.k("adQualityDataBuilder");
                        throw null;
                    }
                    listUnmodifiableList = Collections.unmodifiableList(((qb2) pb2Var4.g).L());
                    listUnmodifiableList.getClass();
                    if (!listUnmodifiableList.isEmpty()) {
                        throw new NoSuchElementException("List is empty.");
                    }
                    Object obj3 = listUnmodifiableList.get(listUnmodifiableList.size() - 1);
                    obj3.getClass();
                    jLongValue = j - ((Number) obj3).longValue();
                    pb2Var5 = (pb2) this.g;
                    if (pb2Var5 != null) {
                        jn.k("adQualityDataBuilder");
                        throw null;
                    }
                    long jH = ((qb2) pb2Var5.g).H() + jLongValue;
                    pb2Var5.b();
                    ((qb2) pb2Var5.g).W(jH);
                }
                pb2Var3 = (pb2) this.g;
                if (pb2Var3 != null) {
                    jn.k("adQualityDataBuilder");
                    throw null;
                }
                pb2Var3.b();
                ((qb2) pb2Var3.g).z(j);
                dtVar2.d(null);
                return k50Var;
            } catch (Throwable th) {
                dtVar2.d(null);
                throw th;
            }
            if (!this.b) {
                dtVar.d(null);
                return k50Var;
            }
            this.b = false;
            dtVar.d(null);
            dt dtVar3 = (dt) this.d;
            long jCurrentTimeMillis = System.currentTimeMillis();
            jc2Var.i = dtVar3;
            jc2Var.j = jCurrentTimeMillis;
            jc2Var.m = 2;
            if (dtVar3.c(jc2Var) != rcVar) {
                dtVar2 = dtVar3;
                j = jCurrentTimeMillis;
                pb2Var = (pb2) this.g;
                if (pb2Var != null) {
                    jn.k("adQualityDataBuilder");
                    throw null;
                }
                if (((qb2) pb2Var.g).P() > 0) {
                    pb2Var6 = (pb2) this.g;
                    if (pb2Var6 != null) {
                        jn.k("adQualityDataBuilder");
                        throw null;
                    }
                    listUnmodifiableList2 = Collections.unmodifiableList(((qb2) pb2Var6.g).O());
                    listUnmodifiableList2.getClass();
                    if (!listUnmodifiableList2.isEmpty()) {
                        throw new NoSuchElementException("List is empty.");
                    }
                    Object obj4 = listUnmodifiableList2.get(listUnmodifiableList2.size() - 1);
                    obj4.getClass();
                    jLongValue2 = j - ((Number) obj4).longValue();
                    pb2Var7 = (pb2) this.g;
                    if (pb2Var7 != null) {
                        jn.k("adQualityDataBuilder");
                        throw null;
                    }
                    pb2Var7.b();
                    ((qb2) pb2Var7.g).B();
                    if (jLongValue2 < 5000) {
                        pb2Var8 = (pb2) this.g;
                        if (pb2Var8 != null) {
                            jn.k("adQualityDataBuilder");
                            throw null;
                        }
                        int iE2 = ((qb2) pb2Var8.g).E() + 1;
                        pb2Var8.b();
                        ((qb2) pb2Var8.g).T(iE2);
                    }
                }
                pb2Var2 = (pb2) this.g;
                if (pb2Var2 != null) {
                    jn.k("adQualityDataBuilder");
                    throw null;
                }
                if (((qb2) pb2Var2.g).M() > 0) {
                    pb2Var4 = (pb2) this.g;
                    if (pb2Var4 != null) {
                        jn.k("adQualityDataBuilder");
                        throw null;
                    }
                    listUnmodifiableList = Collections.unmodifiableList(((qb2) pb2Var4.g).L());
                    listUnmodifiableList.getClass();
                    if (!listUnmodifiableList.isEmpty()) {
                        throw new NoSuchElementException("List is empty.");
                    }
                    Object obj5 = listUnmodifiableList.get(listUnmodifiableList.size() - 1);
                    obj5.getClass();
                    jLongValue = j - ((Number) obj5).longValue();
                    pb2Var5 = (pb2) this.g;
                    if (pb2Var5 != null) {
                        jn.k("adQualityDataBuilder");
                        throw null;
                    }
                    long jH2 = ((qb2) pb2Var5.g).H() + jLongValue;
                    pb2Var5.b();
                    ((qb2) pb2Var5.g).W(jH2);
                }
                pb2Var3 = (pb2) this.g;
                if (pb2Var3 != null) {
                    jn.k("adQualityDataBuilder");
                    throw null;
                }
                pb2Var3.b();
                ((qb2) pb2Var3.g).z(j);
                dtVar2.d(null);
                return k50Var;
            }
            return rcVar;
        } catch (Throwable th2) {
            dtVar.d(null);
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x008d A[Catch: all -> 0x00f7, TRY_ENTER, TryCatch #0 {all -> 0x00f7, blocks: (B:33:0x0085, B:36:0x008d, B:38:0x009d, B:40:0x00b6, B:42:0x00c6, B:54:0x00f9, B:55:0x00fc, B:56:0x00fd, B:57:0x0100, B:58:0x0101, B:59:0x0104, B:60:0x0105, B:61:0x0108), top: B:68:0x0085 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x009d A[Catch: all -> 0x00f7, TryCatch #0 {all -> 0x00f7, blocks: (B:33:0x0085, B:36:0x008d, B:38:0x009d, B:40:0x00b6, B:42:0x00c6, B:54:0x00f9, B:55:0x00fc, B:56:0x00fd, B:57:0x0100, B:58:0x0101, B:59:0x0104, B:60:0x0105, B:61:0x0108), top: B:68:0x0085 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00b6 A[Catch: all -> 0x00f7, TryCatch #0 {all -> 0x00f7, blocks: (B:33:0x0085, B:36:0x008d, B:38:0x009d, B:40:0x00b6, B:42:0x00c6, B:54:0x00f9, B:55:0x00fc, B:56:0x00fd, B:57:0x0100, B:58:0x0101, B:59:0x0104, B:60:0x0105, B:61:0x0108), top: B:68:0x0085 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00c6 A[Catch: all -> 0x00f7, TRY_LEAVE, TryCatch #0 {all -> 0x00f7, blocks: (B:33:0x0085, B:36:0x008d, B:38:0x009d, B:40:0x00b6, B:42:0x00c6, B:54:0x00f9, B:55:0x00fc, B:56:0x00fd, B:57:0x0100, B:58:0x0101, B:59:0x0104, B:60:0x0105, B:61:0x0108), top: B:68:0x0085 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f9 A[Catch: all -> 0x00f7, TRY_ENTER, TryCatch #0 {all -> 0x00f7, blocks: (B:33:0x0085, B:36:0x008d, B:38:0x009d, B:40:0x00b6, B:42:0x00c6, B:54:0x00f9, B:55:0x00fc, B:56:0x00fd, B:57:0x0100, B:58:0x0101, B:59:0x0104, B:60:0x0105, B:61:0x0108), top: B:68:0x0085 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00fd A[Catch: all -> 0x00f7, TryCatch #0 {all -> 0x00f7, blocks: (B:33:0x0085, B:36:0x008d, B:38:0x009d, B:40:0x00b6, B:42:0x00c6, B:54:0x00f9, B:55:0x00fc, B:56:0x00fd, B:57:0x0100, B:58:0x0101, B:59:0x0104, B:60:0x0105, B:61:0x0108), top: B:68:0x0085 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0101 A[Catch: all -> 0x00f7, TryCatch #0 {all -> 0x00f7, blocks: (B:33:0x0085, B:36:0x008d, B:38:0x009d, B:40:0x00b6, B:42:0x00c6, B:54:0x00f9, B:55:0x00fc, B:56:0x00fd, B:57:0x0100, B:58:0x0101, B:59:0x0104, B:60:0x0105, B:61:0x0108), top: B:68:0x0085 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0105 A[Catch: all -> 0x00f7, TryCatch #0 {all -> 0x00f7, blocks: (B:33:0x0085, B:36:0x008d, B:38:0x009d, B:40:0x00b6, B:42:0x00c6, B:54:0x00f9, B:55:0x00fc, B:56:0x00fd, B:57:0x0100, B:58:0x0101, B:59:0x0104, B:60:0x0105, B:61:0x0108), top: B:68:0x0085 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object k(ac acVar) {
        gc2 gc2Var;
        dt dtVar;
        long j;
        pb2 pb2Var;
        long jI;
        pb2 pb2Var2;
        pb2 pb2Var3;
        pb2 pb2Var4;
        qb2 qb2Var;
        qb2 qb2Var2;
        String strC;
        dt dtVar2 = (dt) this.d;
        if (acVar instanceof gc2) {
            gc2Var = (gc2) acVar;
            int i = gc2Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                gc2Var.m = i - Integer.MIN_VALUE;
            } else {
                gc2Var = new gc2(this, acVar);
            }
        } else {
            gc2Var = new gc2(this, acVar);
        }
        Object obj = gc2Var.k;
        int i2 = gc2Var.m;
        k50 k50Var = k50.a;
        Object obj2 = rc.f;
        try {
            if (i2 == 0) {
                ar.n(obj);
                gc2Var.i = dtVar2;
                gc2Var.m = 1;
                if (dtVar2.c(gc2Var) != obj2) {
                    dtVar = dtVar2;
                }
                return obj2;
            }
            if (i2 == 1) {
                dtVar = (dt) gc2Var.i;
                ar.n(obj);
            } else {
                if (i2 == 2) {
                    j = gc2Var.j;
                    dtVar2 = (dt) gc2Var.i;
                    ar.n(obj);
                    try {
                        pb2Var = (pb2) this.g;
                        if (pb2Var != null) {
                            jn.k("adQualityDataBuilder");
                            throw null;
                        }
                        jI = j - ((qb2) pb2Var.g).I();
                        pb2Var2 = (pb2) this.g;
                        if (pb2Var2 != null) {
                            jn.k("adQualityDataBuilder");
                            throw null;
                        }
                        long jH = jI - ((qb2) pb2Var2.g).H();
                        pb2Var.b();
                        ((qb2) pb2Var.g).S(jH);
                        pb2Var3 = (pb2) this.g;
                        if (pb2Var3 != null) {
                            jn.k("adQualityDataBuilder");
                            throw null;
                        }
                        pb2Var3.b();
                        ((qb2) pb2Var3.g).Z(j);
                        pb2Var4 = (pb2) this.g;
                        if (pb2Var4 != null) {
                            jn.k("adQualityDataBuilder");
                            throw null;
                        }
                        qb2Var = (qb2) pb2Var4.c();
                        dtVar2.d(null);
                        gc2Var.i = qb2Var;
                        gc2Var.m = 3;
                        if (q(gc2Var) != obj2) {
                            qb2Var2 = qb2Var;
                        }
                        return obj2;
                    } catch (Throwable th) {
                        dtVar2.d(null);
                        throw th;
                    }
                }
                if (i2 != 3) {
                    if (i2 == 4) {
                        ar.n(obj);
                        return k50Var;
                    }
                    j7.e("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qb2Var2 = (qb2) gc2Var.i;
                ar.n(obj);
            }
            if (((or1) this.i).a(qb2Var2)) {
                strC = qb2Var2.C();
                strC.getClass();
                gc2Var.i = null;
                gc2Var.m = 4;
                if (n(strC, gc2Var) == obj2) {
                    return obj2;
                }
            }
            return k50Var;
            if (!this.a) {
                dtVar.d(null);
                return k50Var;
            }
            this.a = false;
            dtVar.d(null);
            long jCurrentTimeMillis = System.currentTimeMillis();
            gc2Var.i = dtVar2;
            gc2Var.j = jCurrentTimeMillis;
            gc2Var.m = 2;
            if (dtVar2.c(gc2Var) != obj2) {
                j = jCurrentTimeMillis;
                pb2Var = (pb2) this.g;
                if (pb2Var != null) {
                    jn.k("adQualityDataBuilder");
                    throw null;
                }
                jI = j - ((qb2) pb2Var.g).I();
                pb2Var2 = (pb2) this.g;
                if (pb2Var2 != null) {
                    jn.k("adQualityDataBuilder");
                    throw null;
                }
                long jH2 = jI - ((qb2) pb2Var2.g).H();
                pb2Var.b();
                ((qb2) pb2Var.g).S(jH2);
                pb2Var3 = (pb2) this.g;
                if (pb2Var3 != null) {
                    jn.k("adQualityDataBuilder");
                    throw null;
                }
                pb2Var3.b();
                ((qb2) pb2Var3.g).Z(j);
                pb2Var4 = (pb2) this.g;
                if (pb2Var4 != null) {
                    jn.k("adQualityDataBuilder");
                    throw null;
                }
                qb2Var = (qb2) pb2Var4.c();
                dtVar2.d(null);
                gc2Var.i = qb2Var;
                gc2Var.m = 3;
                if (q(gc2Var) != obj2) {
                    qb2Var2 = qb2Var;
                    if (((or1) this.i).a(qb2Var2)) {
                        strC = qb2Var2.C();
                        strC.getClass();
                        gc2Var.i = null;
                        gc2Var.m = 4;
                        if (n(strC, gc2Var) == obj2) {
                        }
                    }
                    return k50Var;
                }
            }
            return obj2;
        } catch (Throwable th2) {
            dtVar.d(null);
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0090 A[Catch: all -> 0x010b, TRY_ENTER, TryCatch #1 {all -> 0x010b, blocks: (B:32:0x0088, B:35:0x0090, B:37:0x00a0, B:39:0x00ba, B:41:0x00ca, B:43:0x00da, B:55:0x010d, B:56:0x0110, B:57:0x0111, B:58:0x0114, B:59:0x0115, B:60:0x0118, B:61:0x0119, B:62:0x011c, B:63:0x011d, B:64:0x0120), top: B:73:0x0088 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00a0 A[Catch: all -> 0x010b, TryCatch #1 {all -> 0x010b, blocks: (B:32:0x0088, B:35:0x0090, B:37:0x00a0, B:39:0x00ba, B:41:0x00ca, B:43:0x00da, B:55:0x010d, B:56:0x0110, B:57:0x0111, B:58:0x0114, B:59:0x0115, B:60:0x0118, B:61:0x0119, B:62:0x011c, B:63:0x011d, B:64:0x0120), top: B:73:0x0088 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00ba A[Catch: all -> 0x010b, TryCatch #1 {all -> 0x010b, blocks: (B:32:0x0088, B:35:0x0090, B:37:0x00a0, B:39:0x00ba, B:41:0x00ca, B:43:0x00da, B:55:0x010d, B:56:0x0110, B:57:0x0111, B:58:0x0114, B:59:0x0115, B:60:0x0118, B:61:0x0119, B:62:0x011c, B:63:0x011d, B:64:0x0120), top: B:73:0x0088 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00ca A[Catch: all -> 0x010b, TryCatch #1 {all -> 0x010b, blocks: (B:32:0x0088, B:35:0x0090, B:37:0x00a0, B:39:0x00ba, B:41:0x00ca, B:43:0x00da, B:55:0x010d, B:56:0x0110, B:57:0x0111, B:58:0x0114, B:59:0x0115, B:60:0x0118, B:61:0x0119, B:62:0x011c, B:63:0x011d, B:64:0x0120), top: B:73:0x0088 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00da A[Catch: all -> 0x010b, TRY_LEAVE, TryCatch #1 {all -> 0x010b, blocks: (B:32:0x0088, B:35:0x0090, B:37:0x00a0, B:39:0x00ba, B:41:0x00ca, B:43:0x00da, B:55:0x010d, B:56:0x0110, B:57:0x0111, B:58:0x0114, B:59:0x0115, B:60:0x0118, B:61:0x0119, B:62:0x011c, B:63:0x011d, B:64:0x0120), top: B:73:0x0088 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:55:0x010d A[Catch: all -> 0x010b, TRY_ENTER, TryCatch #1 {all -> 0x010b, blocks: (B:32:0x0088, B:35:0x0090, B:37:0x00a0, B:39:0x00ba, B:41:0x00ca, B:43:0x00da, B:55:0x010d, B:56:0x0110, B:57:0x0111, B:58:0x0114, B:59:0x0115, B:60:0x0118, B:61:0x0119, B:62:0x011c, B:63:0x011d, B:64:0x0120), top: B:73:0x0088 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0111 A[Catch: all -> 0x010b, TryCatch #1 {all -> 0x010b, blocks: (B:32:0x0088, B:35:0x0090, B:37:0x00a0, B:39:0x00ba, B:41:0x00ca, B:43:0x00da, B:55:0x010d, B:56:0x0110, B:57:0x0111, B:58:0x0114, B:59:0x0115, B:60:0x0118, B:61:0x0119, B:62:0x011c, B:63:0x011d, B:64:0x0120), top: B:73:0x0088 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0115 A[Catch: all -> 0x010b, TryCatch #1 {all -> 0x010b, blocks: (B:32:0x0088, B:35:0x0090, B:37:0x00a0, B:39:0x00ba, B:41:0x00ca, B:43:0x00da, B:55:0x010d, B:56:0x0110, B:57:0x0111, B:58:0x0114, B:59:0x0115, B:60:0x0118, B:61:0x0119, B:62:0x011c, B:63:0x011d, B:64:0x0120), top: B:73:0x0088 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0119 A[Catch: all -> 0x010b, TryCatch #1 {all -> 0x010b, blocks: (B:32:0x0088, B:35:0x0090, B:37:0x00a0, B:39:0x00ba, B:41:0x00ca, B:43:0x00da, B:55:0x010d, B:56:0x0110, B:57:0x0111, B:58:0x0114, B:59:0x0115, B:60:0x0118, B:61:0x0119, B:62:0x011c, B:63:0x011d, B:64:0x0120), top: B:73:0x0088 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x011d A[Catch: all -> 0x010b, TryCatch #1 {all -> 0x010b, blocks: (B:32:0x0088, B:35:0x0090, B:37:0x00a0, B:39:0x00ba, B:41:0x00ca, B:43:0x00da, B:55:0x010d, B:56:0x0110, B:57:0x0111, B:58:0x0114, B:59:0x0115, B:60:0x0118, B:61:0x0119, B:62:0x011c, B:63:0x011d, B:64:0x0120), top: B:73:0x0088 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public Object l(ac acVar) {
        ic2 ic2Var;
        dt dtVar;
        long jCurrentTimeMillis;
        pb2 pb2Var;
        long jI;
        pb2 pb2Var2;
        pb2 pb2Var3;
        pb2 pb2Var4;
        pb2 pb2Var5;
        qb2 qb2Var;
        qb2 qb2Var2;
        String strC;
        dt dtVar2 = (dt) this.d;
        if (acVar instanceof ic2) {
            ic2Var = (ic2) acVar;
            int i = ic2Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                ic2Var.m = i - Integer.MIN_VALUE;
            } else {
                ic2Var = new ic2(this, acVar);
            }
        } else {
            ic2Var = new ic2(this, acVar);
        }
        Object obj = ic2Var.k;
        int i2 = ic2Var.m;
        k50 k50Var = k50.a;
        Object obj2 = rc.f;
        try {
            if (i2 == 0) {
                ar.n(obj);
                ic2Var.i = dtVar2;
                ic2Var.m = 1;
                if (dtVar2.c(ic2Var) != obj2) {
                    dtVar = dtVar2;
                }
                return obj2;
            }
            if (i2 == 1) {
                dtVar = (dt) ic2Var.i;
                ar.n(obj);
            } else {
                if (i2 == 2) {
                    jCurrentTimeMillis = ic2Var.j;
                    dtVar2 = (dt) ic2Var.i;
                    ar.n(obj);
                    try {
                        pb2Var = (pb2) this.g;
                        if (pb2Var != null) {
                            jn.k("adQualityDataBuilder");
                            throw null;
                        }
                        jI = jCurrentTimeMillis - ((qb2) pb2Var.g).I();
                        pb2Var2 = (pb2) this.g;
                        if (pb2Var2 != null) {
                            jn.k("adQualityDataBuilder");
                            throw null;
                        }
                        long jH = jI - ((qb2) pb2Var2.g).H();
                        pb2Var.b();
                        ((qb2) pb2Var.g).S(jH);
                        pb2Var3 = (pb2) this.g;
                        if (pb2Var3 != null) {
                            jn.k("adQualityDataBuilder");
                            throw null;
                        }
                        pb2Var3.b();
                        ((qb2) pb2Var3.g).Y(jCurrentTimeMillis);
                        pb2Var4 = (pb2) this.g;
                        if (pb2Var4 != null) {
                            jn.k("adQualityDataBuilder");
                            throw null;
                        }
                        pb2Var4.b();
                        ((qb2) pb2Var4.g).U(true);
                        pb2Var5 = (pb2) this.g;
                        if (pb2Var5 != null) {
                            jn.k("adQualityDataBuilder");
                            throw null;
                        }
                        qb2Var = (qb2) pb2Var5.c();
                        dtVar2.d(null);
                        ic2Var.i = qb2Var;
                        ic2Var.m = 3;
                        if (q(ic2Var) != obj2) {
                            qb2Var2 = qb2Var;
                        }
                        return obj2;
                    } catch (Throwable th) {
                        dtVar2.d(null);
                        throw th;
                    }
                }
                if (i2 != 3) {
                    if (i2 == 4) {
                        ar.n(obj);
                        return k50Var;
                    }
                    j7.e("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qb2Var2 = (qb2) ic2Var.i;
                ar.n(obj);
            }
            if (((or1) this.i).a(qb2Var2)) {
                strC = qb2Var2.C();
                strC.getClass();
                ic2Var.i = null;
                ic2Var.m = 4;
                if (n(strC, ic2Var) == obj2) {
                    return obj2;
                }
            }
            return k50Var;
            if (!this.a) {
                dtVar.d(null);
                return k50Var;
            }
            this.a = false;
            dtVar.d(null);
            jCurrentTimeMillis = System.currentTimeMillis();
            ic2Var.i = dtVar2;
            ic2Var.j = jCurrentTimeMillis;
            ic2Var.m = 2;
            if (dtVar2.c(ic2Var) != obj2) {
                pb2Var = (pb2) this.g;
                if (pb2Var != null) {
                    jn.k("adQualityDataBuilder");
                    throw null;
                }
                jI = jCurrentTimeMillis - ((qb2) pb2Var.g).I();
                pb2Var2 = (pb2) this.g;
                if (pb2Var2 != null) {
                    jn.k("adQualityDataBuilder");
                    throw null;
                }
                long jH2 = jI - ((qb2) pb2Var2.g).H();
                pb2Var.b();
                ((qb2) pb2Var.g).S(jH2);
                pb2Var3 = (pb2) this.g;
                if (pb2Var3 != null) {
                    jn.k("adQualityDataBuilder");
                    throw null;
                }
                pb2Var3.b();
                ((qb2) pb2Var3.g).Y(jCurrentTimeMillis);
                pb2Var4 = (pb2) this.g;
                if (pb2Var4 != null) {
                    jn.k("adQualityDataBuilder");
                    throw null;
                }
                pb2Var4.b();
                ((qb2) pb2Var4.g).U(true);
                pb2Var5 = (pb2) this.g;
                if (pb2Var5 != null) {
                    jn.k("adQualityDataBuilder");
                    throw null;
                }
                qb2Var = (qb2) pb2Var5.c();
                dtVar2.d(null);
                ic2Var.i = qb2Var;
                ic2Var.m = 3;
                if (q(ic2Var) != obj2) {
                    qb2Var2 = qb2Var;
                    if (((or1) this.i).a(qb2Var2)) {
                        strC = qb2Var2.C();
                        strC.getClass();
                        ic2Var.i = null;
                        ic2Var.m = 4;
                        if (n(strC, ic2Var) == obj2) {
                        }
                    }
                    return k50Var;
                }
            }
            return obj2;
        } catch (Throwable th2) {
            dtVar.d(null);
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object m(ac acVar) throws Throwable {
        fc2 fc2Var;
        dt dtVar;
        long j;
        if (acVar instanceof fc2) {
            fc2Var = (fc2) acVar;
            int i = fc2Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                fc2Var.m = i - Integer.MIN_VALUE;
            } else {
                fc2Var = new fc2(this, acVar);
            }
        } else {
            fc2Var = new fc2(this, acVar);
        }
        Object obj = fc2Var.k;
        int i2 = fc2Var.m;
        if (i2 == 0) {
            ar.n(obj);
            dt dtVar2 = (dt) this.d;
            long jCurrentTimeMillis = System.currentTimeMillis();
            fc2Var.j = dtVar2;
            fc2Var.i = jCurrentTimeMillis;
            fc2Var.m = 1;
            Object objC = dtVar2.c(fc2Var);
            rc rcVar = rc.f;
            if (objC == rcVar) {
                return rcVar;
            }
            dtVar = dtVar2;
            j = jCurrentTimeMillis;
        } else {
            if (i2 != 1) {
                j7.e("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = fc2Var.i;
            dtVar = fc2Var.j;
            ar.n(obj);
        }
        try {
            pb2 pb2Var = (pb2) this.g;
            if (pb2Var == null) {
                jn.k("adQualityDataBuilder");
                throw null;
            }
            pb2Var.b();
            ((qb2) pb2Var.g).A(j);
            dtVar.d(null);
            return k50.a;
        } catch (Throwable th) {
            dtVar.d(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object n(String str, ac acVar) throws Throwable {
        wb2 wb2Var;
        String str2;
        dt dtVar;
        Throwable th;
        dt dtVar2;
        if (acVar instanceof wb2) {
            wb2Var = (wb2) acVar;
            int i = wb2Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                wb2Var.m = i - Integer.MIN_VALUE;
            } else {
                wb2Var = new wb2(this, acVar);
            }
        } else {
            wb2Var = new wb2(this, acVar);
        }
        Object objI = wb2Var.k;
        int i2 = wb2Var.m;
        int i3 = 1;
        yb ybVar = null;
        rc rcVar = rc.f;
        try {
            if (i2 == 0) {
                ar.n(objI);
                dt dtVar3 = (dt) this.f;
                wb2Var.i = str;
                wb2Var.j = dtVar3;
                wb2Var.m = 1;
                if (dtVar3.c(wb2Var) != rcVar) {
                    str2 = str;
                    dtVar = dtVar3;
                }
                return rcVar;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    j7.e("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dtVar2 = (dt) wb2Var.i;
                try {
                    ar.n(objI);
                    dtVar2.d(null);
                    return k50.a;
                } catch (Throwable th2) {
                    th = th2;
                    dtVar2.d(null);
                    throw th;
                }
            }
            dtVar = wb2Var.j;
            str2 = (String) wb2Var.i;
            ar.n(objI);
            i10 i10Var = (i10) this.h;
            w00 w00Var = new w00(str2, ybVar, i3);
            wb2Var.i = dtVar;
            wb2Var.j = null;
            wb2Var.m = 2;
            objI = i10Var.i(w00Var, wb2Var);
            if (objI != rcVar) {
                dtVar2 = dtVar;
                dtVar2.d(null);
                return k50.a;
            }
            return rcVar;
        } catch (Throwable th3) {
            dt dtVar4 = dtVar;
            th = th3;
            dtVar2 = dtVar4;
            dtVar2.d(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object o(ac acVar) throws Throwable {
        yb2 yb2Var;
        dt dtVar;
        Throwable th;
        dt dtVar2;
        if (acVar instanceof yb2) {
            yb2Var = (yb2) acVar;
            int i = yb2Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                yb2Var.l = i - Integer.MIN_VALUE;
            } else {
                yb2Var = new yb2(this, acVar);
            }
        } else {
            yb2Var = new yb2(this, acVar);
        }
        Object obj = yb2Var.j;
        int i2 = yb2Var.l;
        rc rcVar = rc.f;
        try {
            if (i2 == 0) {
                ar.n(obj);
                dtVar = (dt) this.f;
                yb2Var.i = dtVar;
                yb2Var.l = 1;
                if (dtVar.c(yb2Var) != rcVar) {
                }
                return rcVar;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    j7.e("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dtVar2 = yb2Var.i;
                try {
                    ar.n(obj);
                    dtVar2.d(null);
                    return k50.a;
                } catch (Throwable th2) {
                    th = th2;
                    dtVar2.d(null);
                    throw th;
                }
            }
            dt dtVar3 = yb2Var.i;
            ar.n(obj);
            dtVar = dtVar3;
            i10 i10Var = (i10) this.h;
            zb2 zb2Var = new zb2(2, null);
            yb2Var.i = dtVar;
            yb2Var.l = 2;
            Object objI = i10Var.i(zb2Var, yb2Var);
            if (objI != rcVar) {
                dt dtVar4 = dtVar;
                obj = objI;
                dtVar2 = dtVar4;
                dtVar2.d(null);
                return k50.a;
            }
            return rcVar;
        } catch (Throwable th3) {
            dt dtVar5 = dtVar;
            th = th3;
            dtVar2 = dtVar5;
            dtVar2.d(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object p(long j, ac acVar) throws Throwable {
        xb2 xb2Var;
        dt dtVar;
        if (acVar instanceof xb2) {
            xb2Var = (xb2) acVar;
            int i = xb2Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                xb2Var.m = i - Integer.MIN_VALUE;
            } else {
                xb2Var = new xb2(this, acVar);
            }
        } else {
            xb2Var = new xb2(this, acVar);
        }
        Object obj = xb2Var.k;
        int i2 = xb2Var.m;
        if (i2 == 0) {
            ar.n(obj);
            dt dtVar2 = (dt) this.d;
            xb2Var.j = dtVar2;
            xb2Var.i = j;
            xb2Var.m = 1;
            Object objC = dtVar2.c(xb2Var);
            rc rcVar = rc.f;
            if (objC == rcVar) {
                return rcVar;
            }
            dtVar = dtVar2;
        } else {
            if (i2 != 1) {
                j7.e("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = xb2Var.i;
            dtVar = xb2Var.j;
            ar.n(obj);
        }
        try {
            pb2 pb2Var = (pb2) this.g;
            if (pb2Var == null) {
                jn.k("adQualityDataBuilder");
                throw null;
            }
            long jI = j - ((qb2) pb2Var.g).I();
            pb2 pb2Var2 = (pb2) this.g;
            if (pb2Var2 == null) {
                jn.k("adQualityDataBuilder");
                throw null;
            }
            long jH = jI - ((qb2) pb2Var2.g).H();
            pb2Var.b();
            ((qb2) pb2Var.g).S(jH);
            dtVar.d(null);
            return k50.a;
        } catch (Throwable th) {
            dtVar.d(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0095  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object q(ac acVar) throws Throwable {
        dc2 dc2Var;
        dt dtVar;
        qb2 qb2Var;
        dt dtVar2;
        Throwable th;
        dt dtVar3;
        Object objI;
        if (acVar instanceof dc2) {
            dc2Var = (dc2) acVar;
            int i = dc2Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                dc2Var.m = i - Integer.MIN_VALUE;
            } else {
                dc2Var = new dc2(this, acVar);
            }
        } else {
            dc2Var = new dc2(this, acVar);
        }
        Object obj = dc2Var.k;
        int i2 = dc2Var.m;
        int i3 = 2;
        yb ybVar = null;
        rc rcVar = rc.f;
        try {
            if (i2 == 0) {
                ar.n(obj);
                dtVar = (dt) this.d;
                dc2Var.i = dtVar;
                dc2Var.m = 1;
                if (dtVar.c(dc2Var) != rcVar) {
                }
                return rcVar;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        j7.e("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    dtVar3 = (dt) dc2Var.i;
                    try {
                        ar.n(obj);
                        dtVar3.d(null);
                        return k50.a;
                    } catch (Throwable th2) {
                        th = th2;
                        dtVar3.d(null);
                        throw th;
                    }
                }
                dt dtVar4 = dc2Var.j;
                qb2Var = (qb2) dc2Var.i;
                ar.n(obj);
                dtVar2 = dtVar4;
                try {
                    i10 i10Var = (i10) this.h;
                    w00 w00Var = new w00(qb2Var, ybVar, i3);
                    dc2Var.i = dtVar2;
                    dc2Var.j = null;
                    dc2Var.m = 3;
                    objI = i10Var.i(w00Var, dc2Var);
                    if (objI != rcVar) {
                        dt dtVar5 = dtVar2;
                        obj = objI;
                        dtVar3 = dtVar5;
                        dtVar3.d(null);
                        return k50.a;
                    }
                    return rcVar;
                } catch (Throwable th3) {
                    dt dtVar6 = dtVar2;
                    th = th3;
                    dtVar3 = dtVar6;
                    dtVar3.d(null);
                    throw th;
                }
            }
            dtVar = (dt) dc2Var.i;
            ar.n(obj);
            pb2 pb2Var = (pb2) this.g;
            if (pb2Var == null) {
                jn.k("adQualityDataBuilder");
                throw null;
            }
            qb2Var = (qb2) pb2Var.c();
            dtVar.d(null);
            dtVar2 = (dt) this.f;
            dc2Var.i = qb2Var;
            dc2Var.j = dtVar2;
            dc2Var.m = 2;
            if (dtVar2.c(dc2Var) != rcVar) {
                i10 i10Var2 = (i10) this.h;
                w00 w00Var2 = new w00(qb2Var, ybVar, i3);
                dc2Var.i = dtVar2;
                dc2Var.j = null;
                dc2Var.m = 3;
                objI = i10Var2.i(w00Var2, dc2Var);
                if (objI != rcVar) {
                    dt dtVar7 = dtVar2;
                    obj = objI;
                    dtVar3 = dtVar7;
                    dtVar3.d(null);
                    return k50.a;
                }
            }
            return rcVar;
        } catch (Throwable th4) {
            dtVar.d(null);
            throw th4;
        }
    }

    public gr1(Looper looper, ig igVar, rp1 rp1Var) {
        this(new CopyOnWriteArraySet(), looper, igVar, rp1Var, true);
    }

    public gr1(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, ig igVar, rp1 rp1Var, boolean z) {
        this.c = igVar;
        this.f = copyOnWriteArraySet;
        this.e = rp1Var;
        this.i = new Object();
        this.g = new ArrayDeque();
        this.h = new ArrayDeque();
        this.d = igVar.i(looper, new yq1(0, this));
        this.b = z;
    }
}
