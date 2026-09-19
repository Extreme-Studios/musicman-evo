package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class sc1 extends pc1 implements qp2 {
    public static final AtomicInteger t = new AtomicInteger(0);
    public String i;
    public final ub1 j;
    public boolean k;
    public final je0 l;
    public final rd0 m;
    public ByteBuffer n;
    public boolean o;
    public final Object p;
    public final String q;
    public final int r;
    public boolean s;

    public sc1(md1 md1Var, ub1 ub1Var) {
        super(md1Var);
        this.j = ub1Var;
        this.l = new je0(3);
        this.m = new rd0();
        this.p = new Object();
        String strO = md1Var.o();
        this.q = (String) (strO == null ? uh2.f : new ci2(strO)).b();
        this.r = md1Var.q();
        t.incrementAndGet();
    }

    @Override // defpackage.pc1
    public final void a() {
        t.decrementAndGet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v9, types: [boolean] */
    @Override // defpackage.pc1
    public final boolean b(String str) {
        String str2;
        String str3;
        oe2 oe2Var;
        String str4 = str;
        this.i = str4;
        String str5 = "error";
        String strConcat = "cache:".concat(String.valueOf(f32.d(str4, "MD5")));
        try {
            us2 us2Var = new us2(25);
            String str6 = this.g;
            ub1 ub1Var = this.j;
            yh2 yh2Var = new yh2(str6, ub1Var.d, ub1Var.e, true, us2Var);
            yh2Var.c(this);
            boolean z = ub1Var.i;
            oe2 cc1Var = yh2Var;
            if (z) {
                cc1Var = new cc1(this.f, yh2Var, this.q, this.r);
            }
            cc1Var.a(new eg2(Uri.parse(str4), 0L, -1L));
            md1 md1Var = (md1) this.h.get();
            if (md1Var != null) {
                md1Var.b1(strConcat, this);
            }
            vc3.C.k.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            ix0 ix0Var = lx0.K;
            tu0 tu0Var = tu0.e;
            long jLongValue = ((Long) tu0Var.c.a(ix0Var)).longValue();
            long jLongValue2 = ((Long) tu0Var.c.a(lx0.J)).longValue();
            this.n = ByteBuffer.allocate(ub1Var.c);
            byte[] bArr = new byte[8192];
            long j = jCurrentTimeMillis;
            oe2 oe2Var2 = cc1Var;
            while (true) {
                try {
                    int iD = oe2Var2.d(bArr, 0, Math.min(this.n.remaining(), 8192));
                    if (iD == -1) {
                        this.s = true;
                        str4 = str;
                        f32.b.post(new nc1(this, str4, strConcat, (int) this.m.a(this.n)));
                        return true;
                    }
                    str4 = str;
                    str2 = str5;
                    try {
                        synchronized (this.p) {
                            oe2Var = oe2Var2;
                            try {
                                if (!this.k) {
                                    this.n.put(bArr, 0, iD);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (this.n.remaining() <= 0) {
                            o();
                            return true;
                        }
                        str3 = this.k;
                        try {
                            if (str3 != 0) {
                                int iLimit = this.n.limit();
                                StringBuilder sb = new StringBuilder(String.valueOf(iLimit).length() + 24);
                                sb.append("Precache abort at ");
                                sb.append(iLimit);
                                sb.append(" bytes");
                                throw new IOException(sb.toString());
                            }
                            long jCurrentTimeMillis2 = System.currentTimeMillis();
                            if (jCurrentTimeMillis2 - j >= jLongValue) {
                                o();
                                j = jCurrentTimeMillis2;
                            }
                            if (jCurrentTimeMillis2 - jCurrentTimeMillis > 1000 * jLongValue2) {
                                StringBuilder sb2 = new StringBuilder(String.valueOf(jLongValue2).length() + 29);
                                sb2.append("Timeout exceeded. Limit: ");
                                sb2.append(jLongValue2);
                                sb2.append(" sec");
                                throw new IOException(sb2.toString());
                            }
                            str5 = str2;
                            oe2Var2 = oe2Var;
                            jCurrentTimeMillis = jCurrentTimeMillis;
                        } catch (Exception e) {
                            e = e;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        str3 = str2;
                    }
                } catch (Exception e3) {
                    e = e3;
                    str4 = str;
                    str2 = str5;
                }
                str3 = str2;
                String canonicalName = e.getClass().getCanonicalName();
                String message = e.getMessage();
                String strN = ec.n(new StringBuilder(String.valueOf(canonicalName).length() + 1 + String.valueOf(message).length()), canonicalName, ":", message);
                StringBuilder sb3 = new StringBuilder(strN.length() + String.valueOf(str4).length() + 34);
                sb3.append("Failed to preload url ");
                sb3.append(str4);
                sb3.append(" Exception: ");
                sb3.append(strN);
                jn.T(sb3.toString());
                m(str4, strConcat, str3, strN);
                return false;
            }
        } catch (Exception e4) {
            e = e4;
        }
    }

    @Override // defpackage.qp2
    public final void e(za2 za2Var, eg2 eg2Var, boolean z) {
        if (za2Var instanceof yh2) {
            ((ArrayList) this.l.g).add((yh2) za2Var);
        }
    }

    @Override // defpackage.pc1
    public final void l() {
        this.k = true;
    }

    public final void o() {
        je0 je0Var = this.l;
        Iterator it = ((ArrayList) je0Var.g).iterator();
        while (it.hasNext()) {
            for (Map.Entry entry : ((yh2) it.next()).g().entrySet()) {
                try {
                    if ("content-length".equalsIgnoreCase((String) entry.getKey())) {
                        je0Var.f = Math.max(je0Var.f, Long.parseLong((String) ((List) entry.getValue()).get(0)));
                    }
                } catch (RuntimeException unused) {
                }
            }
            it.remove();
        }
        int i = (int) je0Var.f;
        int iA = (int) this.m.a(this.n);
        int iPosition = this.n.position();
        int iRound = Math.round((iPosition / i) * iA);
        int i2 = ed1.z.get();
        int i3 = ed1.A.get();
        String str = this.i;
        f32.b.post(new lc1(this, str, "cache:".concat(String.valueOf(f32.d(str, "MD5"))), iPosition, i, iRound, iA, iRound > 0, i2, i3));
    }

    @Override // defpackage.qp2
    public final void c(eg2 eg2Var, boolean z) {
    }

    @Override // defpackage.qp2
    public final void f(eg2 eg2Var, boolean z, int i) {
    }
}
