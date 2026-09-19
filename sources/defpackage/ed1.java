package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.util.SparseBooleanArray;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class ed1 implements qp2, r93 {
    public final Context f;
    public final wc1 g;
    public final zf3 h;
    public final ub1 i;
    public final WeakReference j;
    public final g2 k;
    public d93 l;
    public ByteBuffer m;
    public boolean n;
    public qb1 o;
    public int p;
    public int q;
    public long r;
    public final String s;
    public final int t;
    public Integer v;
    public final ArrayList w;
    public volatile xc1 x;
    public static final AtomicInteger z = new AtomicInteger(0);
    public static final AtomicInteger A = new AtomicInteger(0);
    public final Object u = new Object();
    public final HashSet y = new HashSet();

    /* JADX WARN: Code duplicated, block: B:25:0x010d  */
    /* JADX WARN: Code duplicated, block: B:26:0x010f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0114  */
    /* JADX WARN: Multi-variable type inference failed */
    public ed1(Context context, ub1 ub1Var, md1 md1Var, Integer num) {
        final boolean z2;
        de2 de2Var;
        de2 us2Var;
        this.f = context;
        this.i = ub1Var;
        this.v = num;
        this.j = new WeakReference(md1Var);
        wc1 wc1Var = new wc1();
        this.g = wc1Var;
        zf3 zf3Var = new zf3(context);
        this.h = zf3Var;
        if (jn.B()) {
            jn.p("SimpleExoPlayerAdapter initialize ".concat(toString()));
        }
        z.incrementAndGet();
        z63 z63Var = new z63(context, new s70(20, this));
        final int i = 1;
        hn.M(!z63Var.v);
        z63Var.e = new bz1(zf3Var);
        hn.M(!z63Var.v);
        z63Var.f = new s62(wc1Var);
        hn.M(!z63Var.v);
        z63Var.v = true;
        d93 d93Var = new d93(z63Var);
        this.l = d93Var;
        d93Var.i.b();
        d93Var.h.S1(this);
        final int i2 = 0;
        Object[] objArr = 0;
        this.p = 0;
        this.r = 0L;
        this.q = 0;
        this.w = new ArrayList();
        this.x = null;
        String strO = md1Var != null ? md1Var.o() : null;
        this.s = (String) (strO == null ? uh2.f : new ci2(strO)).b();
        this.t = md1Var != null ? md1Var.q() : 0;
        final String strE = vc3.C.c.E(context, md1Var.u().f);
        if (!this.n || this.m.limit() <= 0) {
            ix0 ix0Var = lx0.g2;
            tu0 tu0Var = tu0.e;
            if (((Boolean) tu0Var.c.a(ix0Var)).booleanValue()) {
                if (((Boolean) tu0Var.c.a(lx0.Y1)).booleanValue()) {
                    z2 = true;
                } else if (ub1Var.i) {
                    z2 = false;
                } else {
                    z2 = true;
                }
            } else if (ub1Var.i) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (ub1Var.l) {
                de2Var = new de2(this) { // from class: ad1
                    public final /* synthetic */ ed1 g;

                    {
                        this.g = this;
                    }

                    @Override // defpackage.de2
                    /* JADX INFO: renamed from: a */
                    public final oe2 mo12a() {
                        int i3 = i2;
                        boolean z3 = z2;
                        ed1 ed1Var = this.g;
                        switch (i3) {
                            case 0:
                                ed1 ed1Var2 = true != z3 ? null : ed1Var;
                                ub1 ub1Var2 = ed1Var.i;
                                return new gd1(strE, ed1Var2, ub1Var2.d, ub1Var2.e, ub1Var2.m, ub1Var2.n);
                            case 1:
                                us2 us2Var2 = new us2(25);
                                ed1 ed1Var3 = true == z3 ? ed1Var : null;
                                ub1 ub1Var3 = ed1Var.i;
                                yh2 yh2Var = new yh2(strE, ub1Var3.d, ub1Var3.e, true, us2Var2);
                                if (ed1Var3 != null) {
                                    yh2Var.c(ed1Var3);
                                }
                                return yh2Var;
                            default:
                                ed1 ed1Var4 = true != z3 ? null : ed1Var;
                                ub1 ub1Var4 = ed1Var.i;
                                vc1 vc1Var = new vc1(strE, ed1Var4, ub1Var4.d, ub1Var4.e, ub1Var4.h);
                                ed1Var.y.add(new WeakReference(vc1Var));
                                return vc1Var;
                        }
                    }
                };
            } else if (ub1Var.h > 0) {
                final int i3 = 2;
                de2Var = new de2(this) { // from class: ad1
                    public final /* synthetic */ ed1 g;

                    {
                        this.g = this;
                    }

                    @Override // defpackage.de2
                    /* JADX INFO: renamed from: a */
                    public final oe2 mo12a() {
                        int i4 = i3;
                        boolean z3 = z2;
                        ed1 ed1Var = this.g;
                        switch (i4) {
                            case 0:
                                ed1 ed1Var2 = true != z3 ? null : ed1Var;
                                ub1 ub1Var2 = ed1Var.i;
                                return new gd1(strE, ed1Var2, ub1Var2.d, ub1Var2.e, ub1Var2.m, ub1Var2.n);
                            case 1:
                                us2 us2Var2 = new us2(25);
                                ed1 ed1Var3 = true == z3 ? ed1Var : null;
                                ub1 ub1Var3 = ed1Var.i;
                                yh2 yh2Var = new yh2(strE, ub1Var3.d, ub1Var3.e, true, us2Var2);
                                if (ed1Var3 != null) {
                                    yh2Var.c(ed1Var3);
                                }
                                return yh2Var;
                            default:
                                ed1 ed1Var4 = true != z3 ? null : ed1Var;
                                ub1 ub1Var4 = ed1Var.i;
                                vc1 vc1Var = new vc1(strE, ed1Var4, ub1Var4.d, ub1Var4.e, ub1Var4.h);
                                ed1Var.y.add(new WeakReference(vc1Var));
                                return vc1Var;
                        }
                    }
                };
            } else {
                de2Var = new de2(this) { // from class: ad1
                    public final /* synthetic */ ed1 g;

                    {
                        this.g = this;
                    }

                    @Override // defpackage.de2
                    /* JADX INFO: renamed from: a */
                    public final oe2 mo12a() {
                        int i4 = i;
                        boolean z3 = z2;
                        ed1 ed1Var = this.g;
                        switch (i4) {
                            case 0:
                                ed1 ed1Var2 = true != z3 ? null : ed1Var;
                                ub1 ub1Var2 = ed1Var.i;
                                return new gd1(strE, ed1Var2, ub1Var2.d, ub1Var2.e, ub1Var2.m, ub1Var2.n);
                            case 1:
                                us2 us2Var2 = new us2(25);
                                ed1 ed1Var3 = true == z3 ? ed1Var : null;
                                ub1 ub1Var3 = ed1Var.i;
                                yh2 yh2Var = new yh2(strE, ub1Var3.d, ub1Var3.e, true, us2Var2);
                                if (ed1Var3 != null) {
                                    yh2Var.c(ed1Var3);
                                }
                                return yh2Var;
                            default:
                                ed1 ed1Var4 = true != z3 ? null : ed1Var;
                                ub1 ub1Var4 = ed1Var.i;
                                vc1 vc1Var = new vc1(strE, ed1Var4, ub1Var4.d, ub1Var4.e, ub1Var4.h);
                                ed1Var.y.add(new WeakReference(vc1Var));
                                return vc1Var;
                        }
                    }
                };
            }
            us2Var = ub1Var.i ? new us2(this, de2Var, 13, objArr == true ? 1 : 0) : de2Var;
            ByteBuffer byteBuffer = this.m;
            if (byteBuffer != null && byteBuffer.limit() > 0) {
                byte[] bArr = new byte[this.m.limit()];
                this.m.get(bArr);
                us2Var = new z61(us2Var, 14, bArr);
            }
        } else {
            byte[] bArr2 = new byte[this.m.limit()];
            this.m.get(bArr2);
            us2Var = new zc1(bArr2);
        }
        this.k = new g2(us2Var, ((Boolean) tu0.e.c.a(lx0.o)).booleanValue() ? zf0.j : ue0.g);
    }

    @Override // defpackage.r93
    public final void a(int i) {
        this.q += i;
    }

    @Override // defpackage.r93
    public final void d(int i) {
        qb1 qb1Var = this.o;
        if (qb1Var != null) {
            qb1Var.f0(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.qp2
    public final void e(za2 za2Var, eg2 eg2Var, boolean z2) {
        if (za2Var instanceof en2) {
            synchronized (this.u) {
                this.w.add((en2) za2Var);
            }
        } else if (za2Var instanceof xc1) {
            this.x = (xc1) za2Var;
            md1 md1Var = (md1) this.j.get();
            if (((Boolean) tu0.e.c.a(lx0.Y1)).booleanValue() && md1Var != null && this.x.t) {
                HashMap map = new HashMap();
                map.put("gcacheHit", String.valueOf(this.x.v));
                map.put("gcacheDownloaded", String.valueOf(this.x.w));
                zb3.l.post(new hb1(md1Var, map, 1, false));
            }
        }
    }

    @Override // defpackage.qp2
    public final void f(eg2 eg2Var, boolean z2, int i) {
        this.p += i;
    }

    public final void finalize() {
        z.decrementAndGet();
        if (jn.B()) {
            jn.p("SimpleExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    @Override // defpackage.r93
    public final void g(de3 de3Var) {
        md1 md1Var = (md1) this.j.get();
        if (!((Boolean) tu0.e.c.a(lx0.Y1)).booleanValue() || md1Var == null) {
            return;
        }
        HashMap map = new HashMap();
        String str = de3Var.l;
        if (str != null) {
            map.put("audioMime", str);
        }
        String str2 = de3Var.m;
        if (str2 != null) {
            map.put("audioSampleMime", str2);
        }
        String str3 = de3Var.j;
        if (str3 != null) {
            map.put("audioCodec", str3);
        }
        md1Var.a("onMetadataEvent", map);
    }

    @Override // defpackage.r93
    public final void j(q43 q43Var) {
        qb1 qb1Var = this.o;
        if (qb1Var != null) {
            qb1Var.x("onPlayerError", q43Var);
        }
    }

    @Override // defpackage.r93
    public final void k(i61 i61Var) {
        qb1 qb1Var = this.o;
        if (qb1Var != null) {
            qb1Var.w(i61Var.a, i61Var.b);
        }
    }

    @Override // defpackage.r93
    public final void l(de3 de3Var) {
        md1 md1Var = (md1) this.j.get();
        if (!((Boolean) tu0.e.c.a(lx0.Y1)).booleanValue() || md1Var == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("frameRate", String.valueOf(de3Var.x));
        map.put("bitRate", String.valueOf(de3Var.i));
        int i = de3Var.t;
        int i2 = de3Var.u;
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 1 + String.valueOf(i2).length());
        sb.append(i);
        sb.append("x");
        sb.append(i2);
        map.put("resolution", sb.toString());
        String str = de3Var.l;
        if (str != null) {
            map.put("videoMime", str);
        }
        String str2 = de3Var.m;
        if (str2 != null) {
            map.put("videoSampleMime", str2);
        }
        String str3 = de3Var.j;
        if (str3 != null) {
            map.put("videoCodec", str3);
        }
        md1Var.a("onMetadataEvent", map);
    }

    @Override // defpackage.r93
    public final void o(IOException iOException) {
        qb1 qb1Var = this.o;
        if (qb1Var != null) {
            if (this.i.j) {
                qb1Var.u(iOException);
            } else {
                qb1Var.x("onLoadError", iOException);
            }
        }
    }

    @Override // defpackage.r93
    public final void p() {
        qb1 qb1Var = this.o;
        if (qb1Var != null) {
            qb1Var.t();
        }
    }

    public final long q() {
        if (this.x != null && this.x.u && this.x.v) {
            return Math.min(this.p, this.x.x);
        }
        return 0L;
    }

    public final long r() {
        if (this.x != null && this.x.u) {
            xc1 xc1Var = this.x;
            if (xc1Var.s != null) {
                AtomicLong atomicLong = xc1Var.z;
                if (atomicLong.get() != -1) {
                    return atomicLong.get();
                }
                synchronized (xc1Var) {
                    try {
                        if (xc1Var.y == null) {
                            xc1Var.y = za1.a.b(new br0(4, xc1Var));
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (xc1Var.y.isDone()) {
                    try {
                        xc1Var.z.compareAndSet(-1L, ((Long) xc1Var.y.get()).longValue());
                        return xc1Var.z.get();
                    } catch (InterruptedException | ExecutionException unused) {
                    }
                }
            }
            return -1L;
        }
        synchronized (this.u) {
            while (true) {
                ArrayList arrayList = this.w;
                if (!arrayList.isEmpty()) {
                    long j = this.r;
                    Map mapG = ((en2) arrayList.remove(0)).g();
                    long j2 = 0;
                    if (mapG != null) {
                        for (Map.Entry entry : mapG.entrySet()) {
                            if (entry != null) {
                                try {
                                    if (entry.getKey() != null && dq.J("content-length", (CharSequence) entry.getKey()) && entry.getValue() != null && ((List) entry.getValue()).get(0) != null) {
                                        j2 = Long.parseLong((String) ((List) entry.getValue()).get(0));
                                        break;
                                    }
                                } catch (NumberFormatException unused2) {
                                    continue;
                                }
                            }
                        }
                    }
                    this.r = j + j2;
                }
            }
        }
        return this.r;
    }

    public final void s(boolean z2) {
        sf3 sf3Var;
        boolean zEquals;
        if (this.l == null) {
            return;
        }
        int i = 0;
        while (true) {
            d93 d93Var = this.l;
            d93Var.i.b();
            p73 p73Var = d93Var.h;
            p73Var.g2();
            int length = p73Var.m.length;
            if (i >= 2) {
                return;
            }
            zf3 zf3Var = this.h;
            synchronized (zf3Var.c) {
                sf3Var = zf3Var.e;
            }
            sf3Var.getClass();
            rf3 rf3Var = new rf3(sf3Var);
            boolean z3 = !z2;
            SparseBooleanArray sparseBooleanArray = rf3Var.E;
            if (sparseBooleanArray.get(i) != z3) {
                if (z2) {
                    sparseBooleanArray.delete(i);
                } else {
                    sparseBooleanArray.put(i, true);
                }
            }
            sf3 sf3Var2 = new sf3(rf3Var);
            synchronized (zf3Var.c) {
                zEquals = zf3Var.e.equals(sf3Var2);
                zf3Var.e = sf3Var2;
            }
            if (!zEquals) {
                if (sf3Var2.A && zf3Var.d == null) {
                    s90.Q("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
                }
                b83 b83Var = zf3Var.a;
                if (b83Var != null) {
                    b83Var.m.b(10);
                }
            }
            i++;
        }
    }

    public final we3 t(Uri uri) {
        tj2 tj2Var = vj2.g;
        qk2 qk2Var = qk2.j;
        List list = Collections.EMPTY_LIST;
        qk2 qk2Var2 = qk2.j;
        dh0 dh0Var = dh0.a;
        li0 li0Var = new li0("", new vc0(), uri != null ? new of0(uri, qk2Var2) : null, new te0(), uk0.B);
        int i = this.i.f;
        g2 g2Var = this.k;
        g2Var.g = i;
        li0Var.b.getClass();
        return new we3(li0Var, (de2) g2Var.h, (bz1) g2Var.i, (lg3) g2Var.j, g2Var.g);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0116  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void u(Uri[] uriArr, ByteBuffer byteBuffer, boolean z2) {
        Object ke3Var;
        if (this.l != null) {
            this.m = byteBuffer;
            this.n = z2;
            int length = uriArr.length;
            if (length == 1) {
                ke3Var = t(uriArr[0]);
            } else {
                dd3[] dd3VarArr = new dd3[length];
                for (int i = 0; i < uriArr.length; i++) {
                    dd3VarArr[i] = t(uriArr[i]);
                }
                ke3Var = new ke3(new v33(28), dd3VarArr);
            }
            d93 d93Var = this.l;
            d93Var.i.b();
            p73 p73Var = d93Var.h;
            p73Var.g2();
            List listSingletonList = Collections.singletonList(ke3Var);
            p73Var.g2();
            p73Var.g2();
            p73Var.W1(p73Var.b0);
            p73Var.M1();
            p73Var.I++;
            ArrayList arrayList = p73Var.v;
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                for (int i2 = size - 1; i2 >= 0; i2--) {
                    arrayList.remove(i2);
                }
                cf3 cf3Var = p73Var.e0;
                int[] iArr = cf3Var.b;
                int[] iArr2 = new int[iArr.length - size];
                int i3 = 0;
                for (int i4 = 0; i4 < iArr.length; i4++) {
                    int i5 = iArr[i4];
                    if (i5 < 0 || i5 >= size) {
                        int i6 = i4 - i3;
                        if (i5 >= 0) {
                            i5 -= size;
                        }
                        iArr2[i6] = i5;
                    } else {
                        i3++;
                    }
                }
                p73Var.e0 = new cf3(iArr2, new Random(cf3Var.a.nextLong()));
            }
            ArrayList arrayList2 = new ArrayList();
            for (int i7 = 0; i7 < listSingletonList.size(); i7++) {
                s83 s83Var = new s83((dd3) listSingletonList.get(i7), p73Var.w);
                arrayList2.add(s83Var);
                arrayList.add(i7, new o73(s83Var.b, s83Var.a));
            }
            p73Var.e0 = p73Var.e0.a(arrayList2.size());
            y83 y83Var = new y83(arrayList, p73Var.e0);
            boolean zG = y83Var.g();
            int i8 = y83Var.d;
            if (!zG && i8 < 0) {
                throw new v9();
            }
            int iK = y83Var.k(false);
            u83 u83VarB2 = p73Var.b2(p73Var.b0, y83Var, p73Var.d2(y83Var, iK, -9223372036854775807L));
            int i9 = u83VarB2.e;
            if (i9 == 1) {
                i9 = 1;
            } else if (y83Var.g()) {
                i9 = 4;
            } else if (iK != -1) {
                if (iK >= i8) {
                    i9 = 4;
                } else {
                    i9 = 2;
                }
            }
            u83 u83VarC2 = p73.c2(u83VarB2, i9);
            b83 b83Var = p73Var.r;
            long jR = qz1.r(-9223372036854775807L);
            cf3 cf3Var2 = p73Var.e0;
            b83Var.getClass();
            b83Var.m.a(17, new z73(arrayList2, cf3Var2, iK, jR)).a();
            p73Var.Z1(u83VarC2, 0, (p73Var.b0.b.a.equals(u83VarC2.b.a) || p73Var.b0.a.g()) ? false : true, 4, p73Var.Y1(u83VarC2), -1);
            d93 d93Var2 = this.l;
            d93Var2.i.b();
            p73 p73Var2 = d93Var2.h;
            p73Var2.g2();
            u83 u83Var = p73Var2.b0;
            if (u83Var.e == 1) {
                u83 u83VarE = u83Var.e(null);
                u83 u83VarC3 = p73.c2(u83VarE, true != u83VarE.a.g() ? 2 : 4);
                p73Var2.I++;
                Handler handler = p73Var2.r.m.a;
                ox1 ox1VarF = wx1.f();
                ox1VarF.a = handler.obtainMessage(29);
                ox1VarF.a();
                p73Var2.Z1(u83VarC3, 1, false, 5, -9223372036854775807L, -1);
            }
            A.incrementAndGet();
        }
    }

    @Override // defpackage.qp2
    public final void c(eg2 eg2Var, boolean z2) {
    }
}
