package defpackage;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.Surface;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public final class p73 extends t33 {
    public static final /* synthetic */ int f0 = 0;
    public final ig A;
    public final d73 B;
    public final n73 C;
    public final ph0 D;
    public final ph0 E;
    public final long F;
    public final ts2 G;
    public final o93 H;
    public int I;
    public int J;
    public boolean K;
    public final b93 L;
    public final c93 M;
    public final a73 N;
    public xq0 O;
    public uk0 P;
    public Object Q;
    public Surface R;
    public final int S;
    public nw1 T;
    public final qk1 U;
    public float V;
    public boolean W;
    public final boolean X;
    public boolean Y;
    public final int Z;
    public uk0 a0;
    public u83 b0;
    public int c0;
    public long d0;
    public cf3 e0;
    public final dg3 h;
    public final xq0 i;
    public final km1 j;
    public final Context k;
    public final d93 l;
    public final yc3[] m;
    public final yc3[] n;
    public final zf3 o;
    public final wx1 p;
    public final gv1 q;
    public final b83 r;
    public final gr1 s;
    public final CopyOnWriteArraySet t;
    public final su0 u;
    public final ArrayList v;
    public final boolean w;
    public final z93 x;
    public final Looper y;
    public final kg3 z;

    static {
        ej0.a("media3.exoplayer");
    }

    public p73(z63 z63Var, d93 d93Var) {
        super(8);
        this.j = new km1();
        try {
            String hexString = Integer.toHexString(System.identityHashCode(this));
            String str = qz1.a;
            StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 30 + String.valueOf(str).length() + 1);
            sb.append("Init ");
            sb.append(hexString);
            sb.append(" [AndroidXMedia3/1.8.0] [");
            sb.append(str);
            sb.append("]");
            s90.K("ExoPlayerImpl", sb.toString());
            Context context = z63Var.a;
            ig igVar = z63Var.b;
            Looper looper = z63Var.h;
            this.k = context.getApplicationContext();
            this.x = new z93(igVar);
            this.Z = z63Var.i;
            this.U = z63Var.j;
            this.S = z63Var.k;
            this.W = false;
            this.F = z63Var.p;
            d73 d73Var = new d73(this);
            this.B = d73Var;
            this.C = new n73(0);
            this.m = ((s70) z63Var.c.g).P(new Handler(looper), d73Var, d73Var);
            this.n = new yc3[2];
            int i = 0;
            while (true) {
                yc3[] yc3VarArr = this.n;
                int length = yc3VarArr.length;
                if (i >= 2) {
                    break;
                }
                yc3 yc3Var = this.m[i];
                yc3VarArr[i] = null;
                i++;
            }
            this.o = (zf3) z63Var.e.a();
            z63Var.d.a();
            this.z = (kg3) z63Var.g.a();
            this.w = z63Var.l;
            this.M = z63Var.m;
            this.L = z63Var.n;
            this.y = looper;
            this.A = igVar;
            this.l = d93Var;
            this.s = new gr1(looper, igVar, new r53(this, 5));
            this.t = new CopyOnWriteArraySet();
            this.v = new ArrayList();
            this.e0 = new cf3();
            this.N = a73.a;
            int length2 = this.m.length;
            this.h = new dg3(new z83[2], new bg3[2], l21.b, null);
            this.u = new su0();
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32};
            for (int i2 = 0; i2 < 20; i2++) {
                int i3 = iArr[i2];
                hn.M(!false);
                sparseBooleanArray.append(i3, true);
            }
            this.o.getClass();
            hn.M(!false);
            sparseBooleanArray.append(29, true);
            hn.M(!false);
            cc3 cc3Var = new cc3(sparseBooleanArray);
            this.i = new xq0(cc3Var);
            SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
            for (int i4 = 0; i4 < cc3Var.a.size(); i4++) {
                int iA = cc3Var.a(i4);
                hn.M(!false);
                sparseBooleanArray2.append(iA, true);
            }
            hn.M(!false);
            sparseBooleanArray2.append(4, true);
            hn.M(!false);
            sparseBooleanArray2.append(10, true);
            hn.M(!false);
            this.O = new xq0(new cc3(sparseBooleanArray2));
            this.p = this.A.i(this.y, null);
            gv1 gv1Var = new gv1(14, this);
            this.q = gv1Var;
            this.b0 = u83.a(this.h);
            this.x.B(this.l, this.y);
            final la3 la3Var = new la3(z63Var.w);
            b83 b83Var = new b83(this.k, this.m, this.n, this.o, this.h, (d83) z63Var.f.a(), this.z, this.x, this.M, z63Var.x, z63Var.o, this.y, this.A, gv1Var, la3Var, this.N);
            Looper looper2 = b83Var.o;
            wx1 wx1Var = b83Var.m;
            this.r = b83Var;
            this.V = 1.0f;
            uk0 uk0Var = uk0.B;
            this.P = uk0Var;
            this.a0 = uk0Var;
            this.c0 = -1;
            fj2 fj2Var = hg1.a;
            this.X = true;
            z93 z93Var = this.x;
            z93Var.getClass();
            this.s.a(z93Var);
            kg3 kg3Var = this.z;
            Handler handler = new Handler(this.y);
            z93 z93Var2 = this.x;
            kg3Var.getClass();
            z93Var2.getClass();
            w32 w32Var = kg3Var.h;
            CopyOnWriteArrayList<hg3> copyOnWriteArrayList = (CopyOnWriteArrayList) w32Var.g;
            for (hg3 hg3Var : copyOnWriteArrayList) {
                if (hg3Var.b == z93Var2) {
                    hg3Var.c = true;
                    copyOnWriteArrayList.remove(hg3Var);
                }
            }
            ((CopyOnWriteArrayList) w32Var.g).add(new hg3(handler, z93Var2));
            this.t.add(this.B);
            if (Build.VERSION.SDK_INT >= 31) {
                final Context context2 = this.k;
                final boolean z = z63Var.u;
                this.A.i(looper2, null).d(new Runnable() { // from class: b73
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context3 = context2;
                        MediaMetricsManager mediaMetricsManagerJ = ob.j(context3.getSystemService("media_metrics"));
                        ea3 ea3Var = mediaMetricsManagerJ == null ? null : new ea3(context3, mediaMetricsManagerJ.createPlaybackSession());
                        if (ea3Var == null) {
                            s90.Q("ExoPlayerImpl", "MediaMetricsService unavailable.");
                            return;
                        }
                        if (z) {
                            this.S1(ea3Var);
                        }
                        la3 la3Var2 = la3Var;
                        LogSessionId sessionId = ea3Var.i.getSessionId();
                        synchronized (la3Var2) {
                            rz1 rz1Var = la3Var2.b;
                            if (rz1Var == null) {
                                throw null;
                            }
                            LogSessionId logSessionId = (LogSessionId) rz1Var.g;
                            LogSessionId unused = LogSessionId.LOG_SESSION_ID_NONE;
                            hn.M(logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE));
                            rz1Var.g = sessionId;
                        }
                    }
                });
            }
            ts2 ts2Var = new ts2(looper2, this.y, this.A, new rz1(11, this));
            this.G = ts2Var;
            ly1 ly1Var = new ly1(28, this);
            wx1 wx1Var2 = (wx1) ts2Var.g;
            if (wx1Var2.a.getLooper().getThread().isAlive()) {
                wx1Var2.d(ly1Var);
            }
            ig igVar2 = this.A;
            kt2 kt2Var = new kt2(6);
            context.getApplicationContext();
            igVar2.i(looper2, null);
            new y4(kt2Var, igVar2.i(looper, null));
            ig igVar3 = this.A;
            ph0 ph0Var = new ph0(5);
            context.getApplicationContext();
            igVar3.i(looper2, null);
            this.D = ph0Var;
            ig igVar4 = this.A;
            ph0 ph0Var2 = new ph0(6);
            context.getApplicationContext();
            igVar4.i(looper2, null);
            this.E = ph0Var2;
            int i5 = j93.a;
            i61 i61Var = i61.d;
            this.T = nw1.c;
            this.H = new o93(this, this.B, this.A, z63Var.q, z63Var.r, z63Var.s, z63Var.t);
            wx1Var.a(38, this.L).a();
            qk1 qk1Var = this.U;
            Handler handler2 = wx1Var.a;
            ox1 ox1VarF = wx1.f();
            ox1VarF.a = handler2.obtainMessage(31, 0, 0, qk1Var);
            ox1VarF.a();
            h2(1, 3, this.U);
            h2(2, 4, Integer.valueOf(this.S));
            h2(2, 5, 0);
            h2(1, 9, Boolean.valueOf(this.W));
            h2(6, 8, this.C);
            h2(-1, 16, Integer.valueOf(this.Z));
        } finally {
            this.j.a();
        }
    }

    public static long a2(u83 u83Var) {
        ex0 ex0Var = new ex0();
        su0 su0Var = new su0();
        ox0 ox0Var = u83Var.a;
        ox0Var.o(u83Var.b.a, su0Var);
        long j = u83Var.c;
        if (j != -9223372036854775807L) {
            return j;
        }
        ox0Var.b(su0Var.c, ex0Var, 0L).getClass();
        return 0L;
    }

    public static u83 c2(u83 u83Var, int i) {
        u83 u83VarD = u83Var.d(i);
        return (i == 1 || i == 4) ? u83VarD.f(false) : u83VarD;
    }

    @Override // defpackage.t33
    public final boolean B1() {
        g2();
        return this.b0.l;
    }

    @Override // defpackage.t33
    public final void D1() {
        g2();
    }

    @Override // defpackage.t33
    public final l21 E1() {
        g2();
        return (l21) this.b0.i.i;
    }

    @Override // defpackage.t33
    public final ox0 G1() {
        g2();
        return this.b0.a;
    }

    @Override // defpackage.t33
    public final int J1() {
        g2();
        if (this.b0.a.g()) {
            return 0;
        }
        u83 u83Var = this.b0;
        return u83Var.a.e(u83Var.b.a);
    }

    @Override // defpackage.t33
    public final int K1() {
        g2();
        int iW1 = W1(this.b0);
        if (iW1 == -1) {
            return 0;
        }
        return iW1;
    }

    @Override // defpackage.t33
    public final long M1() {
        g2();
        return qz1.q(Y1(this.b0));
    }

    @Override // defpackage.t33
    public final long O1() {
        g2();
        return qz1.q(this.b0.q);
    }

    @Override // defpackage.t33
    public final boolean P1() {
        g2();
        return this.b0.b.b();
    }

    @Override // defpackage.t33
    public final int Q1() {
        g2();
        if (P1()) {
            return this.b0.b.c;
        }
        return -1;
    }

    public final void R1(float f) {
        g2();
        String str = qz1.a;
        float fMax = Math.max(0.0f, Math.min(f, 1.0f));
        if (this.V == fMax) {
            return;
        }
        this.V = fMax;
        this.r.m.a(32, Float.valueOf(fMax)).a();
        r53 r53Var = new r53(fMax);
        gr1 gr1Var = this.s;
        gr1Var.c(22, r53Var);
        gr1Var.d();
    }

    public final void S1(r93 r93Var) {
        this.x.k.a(r93Var);
    }

    public final void T1(ed1 ed1Var) {
        g2();
        this.x.k.b(ed1Var);
    }

    public final void U1() {
        String str;
        boolean zC;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str2 = qz1.a;
        HashSet hashSet = ej0.a;
        synchronized (ej0.class) {
            str = ej0.b;
        }
        int i = 1;
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 33 + String.valueOf(str2).length() + 3 + String.valueOf(str).length() + 1);
        ec.x(sb, "Release ", hexString, " [AndroidXMedia3/1.8.0] [", str2);
        sb.append("] [");
        sb.append(str);
        sb.append("]");
        s90.K("ExoPlayerImpl", sb.toString());
        g2();
        ph0 ph0Var = this.D;
        if (ph0Var.g) {
            ph0Var.g = false;
        }
        ph0 ph0Var2 = this.E;
        if (ph0Var2.g) {
            ph0Var2.g = false;
        }
        o93 o93Var = this.H;
        o93Var.i.a.removeCallbacksAndMessages(null);
        p73 p73Var = o93Var.f;
        p73Var.g2();
        p73Var.s.b(o93Var);
        b83 b83Var = this.r;
        if (b83Var.M || !b83Var.o.getThread().isAlive()) {
            zC = true;
        } else {
            b83Var.M = true;
            km1 km1Var = new km1();
            b83Var.m.a(7, km1Var).a();
            zC = km1Var.c(b83Var.y);
        }
        if (!zC) {
            gr1 gr1Var = this.s;
            gr1Var.c(10, v33.g);
            gr1Var.d();
        }
        this.s.e();
        this.p.a.removeCallbacksAndMessages(null);
        kg3 kg3Var = this.z;
        z93 z93Var = this.x;
        CopyOnWriteArrayList<hg3> copyOnWriteArrayList = (CopyOnWriteArrayList) kg3Var.h.g;
        for (hg3 hg3Var : copyOnWriteArrayList) {
            if (hg3Var.b == z93Var) {
                hg3Var.c = true;
                copyOnWriteArrayList.remove(hg3Var);
            }
        }
        this.b0.getClass();
        u83 u83VarC2 = c2(this.b0, 1);
        this.b0 = u83VarC2;
        u83 u83VarG = u83VarC2.g(u83VarC2.b);
        this.b0 = u83VarG;
        u83VarG.p = u83VarG.r;
        this.b0.q = 0L;
        wx1 wx1Var = z93Var.m;
        wx1Var.getClass();
        wx1Var.d(new s73(i, z93Var));
        Surface surface = this.R;
        if (surface != null) {
            surface.release();
            this.R = null;
        }
        fj2 fj2Var = hg1.a;
    }

    public final void V1(q43 q43Var) {
        u83 u83Var = this.b0;
        u83 u83VarG = u83Var.g(u83Var.b);
        u83VarG.p = u83VarG.r;
        u83VarG.q = 0L;
        u83 u83VarC2 = c2(u83VarG, 1);
        if (q43Var != null) {
            u83VarC2 = u83VarC2.e(q43Var);
        }
        u83 u83Var2 = u83VarC2;
        this.I++;
        Handler handler = this.r.m.a;
        ox1 ox1VarF = wx1.f();
        ox1VarF.a = handler.obtainMessage(6);
        ox1VarF.a();
        Z1(u83Var2, 0, false, 5, -9223372036854775807L, -1);
    }

    public final int W1(u83 u83Var) {
        ox0 ox0Var = u83Var.a;
        return ox0Var.g() ? this.c0 : ox0Var.o(u83Var.b.a, this.u).c;
    }

    public final long X1(u83 u83Var) {
        long jQ = qz1.q(0L);
        yd3 yd3Var = u83Var.b;
        if (!yd3Var.b()) {
            return qz1.q(Y1(u83Var));
        }
        ox0 ox0Var = u83Var.a;
        ox0Var.o(yd3Var.a, this.u);
        long j = u83Var.c;
        if (j != -9223372036854775807L) {
            return qz1.q(j) + jQ;
        }
        ox0Var.b(W1(u83Var), (ex0) this.f, 0L).getClass();
        return jQ;
    }

    public final long Y1(u83 u83Var) {
        ox0 ox0Var = u83Var.a;
        if (ox0Var.g()) {
            return qz1.r(this.d0);
        }
        long j = u83Var.r;
        yd3 yd3Var = u83Var.b;
        if (yd3Var.b()) {
            return j;
        }
        ox0Var.o(yd3Var.a, this.u);
        return j;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:103:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:106:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:109:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:112:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:115:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:118:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:121:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:124:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:127:0x0201  */
    /* JADX WARN: Code duplicated, block: B:130:0x0207  */
    /* JADX WARN: Code duplicated, block: B:133:0x020d  */
    /* JADX WARN: Code duplicated, block: B:136:0x0213  */
    /* JADX WARN: Code duplicated, block: B:139:0x0219  */
    /* JADX WARN: Code duplicated, block: B:142:0x0223  */
    /* JADX WARN: Code duplicated, block: B:146:0x023c  */
    /* JADX WARN: Code duplicated, block: B:147:0x023e  */
    /* JADX WARN: Code duplicated, block: B:150:0x0246  */
    /* JADX WARN: Code duplicated, block: B:151:0x0248  */
    /* JADX WARN: Code duplicated, block: B:154:0x024e  */
    /* JADX WARN: Code duplicated, block: B:156:0x0259  */
    /* JADX WARN: Code duplicated, block: B:166:0x026f  */
    /* JADX WARN: Code duplicated, block: B:169:0x0280  */
    /* JADX WARN: Code duplicated, block: B:173:0x028b  */
    /* JADX WARN: Code duplicated, block: B:176:0x0293  */
    /* JADX WARN: Code duplicated, block: B:177:0x0295  */
    /* JADX WARN: Code duplicated, block: B:179:0x0298  */
    /* JADX WARN: Code duplicated, block: B:181:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:183:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:184:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:187:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:189:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:190:0x0301  */
    /* JADX WARN: Code duplicated, block: B:192:0x0306  */
    /* JADX WARN: Code duplicated, block: B:193:0x030c A[PHI: r10
  0x030c: PHI (r10v19 long) = (r10v18 long), (r10v41 long), (r10v42 long) binds: [B:196:0x0317, B:194:0x030e, B:192:0x0306] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:194:0x030e  */
    /* JADX WARN: Code duplicated, block: B:195:0x0311  */
    /* JADX WARN: Code duplicated, block: B:197:0x0319  */
    /* JADX WARN: Code duplicated, block: B:200:0x0346  */
    /* JADX WARN: Code duplicated, block: B:201:0x0379  */
    /* JADX WARN: Code duplicated, block: B:204:0x0391  */
    /* JADX WARN: Code duplicated, block: B:205:0x039e  */
    /* JADX WARN: Code duplicated, block: B:207:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:209:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:210:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:213:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:215:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:218:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:219:0x0412  */
    /* JADX WARN: Code duplicated, block: B:221:0x0415  */
    /* JADX WARN: Code duplicated, block: B:223:0x0425  */
    /* JADX WARN: Code duplicated, block: B:226:0x0435  */
    /* JADX WARN: Code duplicated, block: B:229:0x0443  */
    /* JADX WARN: Code duplicated, block: B:234:0x0456  */
    /* JADX WARN: Code duplicated, block: B:237:0x0468  */
    /* JADX WARN: Code duplicated, block: B:238:0x0474  */
    /* JADX WARN: Code duplicated, block: B:241:0x0480  */
    /* JADX WARN: Code duplicated, block: B:244:0x0496  */
    /* JADX WARN: Code duplicated, block: B:250:0x04ca  */
    /* JADX WARN: Code duplicated, block: B:253:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:254:0x04d8  */
    /* JADX WARN: Code duplicated, block: B:256:0x04e9  */
    /* JADX WARN: Code duplicated, block: B:257:0x04eb  */
    /* JADX WARN: Code duplicated, block: B:260:0x04f6  */
    /* JADX WARN: Code duplicated, block: B:261:0x04fa  */
    /* JADX WARN: Code duplicated, block: B:263:0x050b  */
    /* JADX WARN: Code duplicated, block: B:264:0x050e  */
    /* JADX WARN: Code duplicated, block: B:270:0x0530  */
    /* JADX WARN: Code duplicated, block: B:273:0x053b  */
    /* JADX WARN: Code duplicated, block: B:275:0x054f  */
    /* JADX WARN: Code duplicated, block: B:277:0x0553  */
    /* JADX WARN: Code duplicated, block: B:281:0x056f A[LOOP:0: B:279:0x0567->B:281:0x056f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:283:0x057b  */
    /* JADX WARN: Code duplicated, block: B:285:0x0580 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:287:0x0584  */
    /* JADX WARN: Code duplicated, block: B:289:0x0587  */
    /* JADX WARN: Code duplicated, block: B:291:0x058c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:293:0x0590  */
    /* JADX WARN: Code duplicated, block: B:295:0x0593  */
    /* JADX WARN: Code duplicated, block: B:297:0x0599 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:301:0x05a0  */
    /* JADX WARN: Code duplicated, block: B:305:0x05a7  */
    /* JADX WARN: Code duplicated, block: B:307:0x05ad A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:309:0x05b1  */
    /* JADX WARN: Code duplicated, block: B:311:0x05b4  */
    /* JADX WARN: Code duplicated, block: B:313:0x05bb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:317:0x05c2  */
    /* JADX WARN: Code duplicated, block: B:321:0x05c9  */
    /* JADX WARN: Code duplicated, block: B:323:0x05d0  */
    /* JADX WARN: Code duplicated, block: B:325:0x05d7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:327:0x05db  */
    /* JADX WARN: Code duplicated, block: B:329:0x05de  */
    /* JADX WARN: Code duplicated, block: B:331:0x05e5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:333:0x05e9  */
    /* JADX WARN: Code duplicated, block: B:335:0x05ec  */
    /* JADX WARN: Code duplicated, block: B:338:0x0602  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:42:0x0101  */
    /* JADX WARN: Code duplicated, block: B:44:0x0107  */
    /* JADX WARN: Code duplicated, block: B:50:0x0118  */
    /* JADX WARN: Code duplicated, block: B:53:0x0128  */
    /* JADX WARN: Code duplicated, block: B:56:0x0137 A[LOOP:2: B:54:0x0130->B:56:0x0137, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:61:0x015b  */
    /* JADX WARN: Code duplicated, block: B:62:0x015f  */
    /* JADX WARN: Code duplicated, block: B:65:0x017b  */
    /* JADX WARN: Code duplicated, block: B:67:0x017f  */
    /* JADX WARN: Code duplicated, block: B:70:0x0185  */
    /* JADX WARN: Code duplicated, block: B:73:0x018b  */
    /* JADX WARN: Code duplicated, block: B:76:0x0191  */
    /* JADX WARN: Code duplicated, block: B:79:0x0197  */
    /* JADX WARN: Code duplicated, block: B:82:0x019d  */
    /* JADX WARN: Code duplicated, block: B:85:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:88:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:91:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:94:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:97:0x01c5  */
    /* JADX WARN: Multi-variable type inference failed */
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
    public final void Z1(final u83 u83Var, int i, boolean z, int i2, long j, int i3) {
        int i4;
        int i5;
        boolean z2;
        Pair pair;
        boolean z3;
        boolean z4;
        int i6;
        boolean zBooleanValue;
        int iIntValue;
        li0 li0Var;
        ak0 ak0VarA;
        List list;
        int i7;
        boolean z5;
        am0 am0Var;
        int i8;
        il0[] il0VarArr;
        boolean z6;
        ox0 ox0VarG1;
        ak0 ak0VarA2;
        uk0 uk0Var;
        uk0 uk0Var2;
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence charSequence3;
        CharSequence charSequence4;
        CharSequence charSequence5;
        byte[] bArr;
        Integer num;
        Integer num2;
        Integer num3;
        Boolean bool;
        Integer num4;
        Integer num5;
        Integer num6;
        Integer num7;
        Integer num8;
        Integer num9;
        Integer num10;
        CharSequence charSequence6;
        CharSequence charSequence7;
        CharSequence charSequence8;
        Integer num11;
        Integer num12;
        CharSequence charSequence9;
        CharSequence charSequence10;
        Integer num13;
        vj2 vj2Var;
        boolean zEquals;
        int i9;
        int i10;
        ph0 ph0Var;
        ph0 ph0Var2;
        int iY1;
        boolean zB1;
        boolean zB2;
        boolean z7;
        boolean z8;
        final int i11;
        q43 q43Var;
        q43 q43Var2;
        int i12;
        dg3 dg3Var;
        dg3 dg3Var2;
        int i13;
        final int i14;
        xq0 xq0Var;
        d93 d93Var;
        boolean zP1;
        ox0 ox0VarG2;
        int i15;
        ox0 ox0VarG3;
        int i16;
        int i17;
        int i18;
        ox0 ox0VarG4;
        int iK1;
        int i19;
        int i20;
        ox0 ox0VarG5;
        int i21;
        ox0 ox0VarG6;
        int i22;
        int i23;
        boolean zG;
        mn0 mn0Var;
        cc3 cc3Var;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        xq0 xq0Var2;
        gr1 gr1Var;
        su0 su0Var;
        int i32;
        Object obj;
        li0 li0Var2;
        Object obj2;
        int i33;
        yd3 yd3Var;
        boolean zB;
        long jA2;
        long jA3;
        int iK2;
        Object obj3;
        li0 li0Var3;
        Object obj4;
        int i34;
        long jQ;
        long jQ2;
        int i35 = i2;
        u83 u83Var2 = this.b0;
        this.b0 = u83Var;
        ox0 ox0Var = u83Var2.a;
        ox0 ox0Var2 = u83Var.a;
        boolean zEquals2 = ox0Var.equals(ox0Var2);
        if (!ox0Var2.g() || !ox0Var.g()) {
            if (ox0Var2.g() != ox0Var.g()) {
                pair = new Pair(Boolean.TRUE, 3);
            } else {
                yd3 yd3Var2 = u83Var2.b;
                Object obj5 = yd3Var2.a;
                i4 = 0;
                su0 su0Var2 = this.u;
                int i36 = ox0Var.o(obj5, su0Var2).c;
                ex0 ex0Var = (ex0) this.f;
                Object obj6 = ox0Var.b(i36, ex0Var, 0L).a;
                yd3 yd3Var3 = u83Var.b;
                if (obj6.equals(ox0Var2.b(ox0Var2.o(yd3Var3.a, su0Var2).c, ex0Var, 0L).a)) {
                    if (z) {
                        if (i35 != 0) {
                            i5 = i35;
                        } else if (yd3Var2.d < yd3Var3.d) {
                            pair = new Pair(Boolean.TRUE, 0);
                            i5 = 0;
                            z2 = true;
                        } else {
                            i5 = 0;
                        }
                        z2 = true;
                    } else {
                        i5 = i35;
                        z2 = false;
                    }
                    pair = new Pair(Boolean.FALSE, -1);
                } else {
                    if (z) {
                        if (i35 == 0) {
                            i35 = 0;
                            z3 = true;
                            i6 = 1;
                        } else {
                            z3 = true;
                            z4 = true;
                        }
                        pair = new Pair(Boolean.TRUE, Integer.valueOf(i6));
                        boolean z9 = z3;
                        i5 = i35;
                        z2 = z9;
                    } else {
                        z3 = false;
                        z4 = false;
                    }
                    if (z3 && i35 == 1) {
                        z3 = z4;
                        i6 = 2;
                    } else {
                        if (zEquals2) {
                            j7.a();
                            return;
                        }
                        i6 = 3;
                    }
                    pair = new Pair(Boolean.TRUE, Integer.valueOf(i6));
                    boolean z10 = z3;
                    i5 = i35;
                    z2 = z10;
                }
            }
            zBooleanValue = ((Boolean) pair.first).booleanValue();
            iIntValue = ((Integer) pair.second).intValue();
            if (zBooleanValue) {
                if (ox0Var2.g()) {
                    li0Var = null;
                } else {
                    li0Var = ox0Var2.b(ox0Var2.o(u83Var.b.a, this.u).c, (ex0) this.f, 0L).b;
                }
                this.a0 = uk0.B;
            } else {
                li0Var = null;
            }
            if (zBooleanValue && u83Var2.j.equals(u83Var.j)) {
                z5 = z2;
            } else {
                ak0VarA = this.a0.a();
                list = u83Var.j;
                i7 = i4;
                while (i7 < list.size()) {
                    am0Var = (am0) list.get(i7);
                    i8 = i4;
                    while (true) {
                        il0VarArr = am0Var.a;
                        z6 = z2;
                        if (i8 < il0VarArr.length) {
                            il0VarArr[i8].a(ak0VarA);
                            i8++;
                            z2 = z6;
                        }
                    }
                    i7++;
                    z2 = z6;
                }
                z5 = z2;
                this.a0 = new uk0(ak0VarA);
            }
            ox0VarG1 = G1();
            if (ox0VarG1.g()) {
                uk0Var2 = this.a0;
            } else {
                li0 li0Var4 = ox0VarG1.b(K1(), (ex0) this.f, 0L).b;
                ak0VarA2 = this.a0.a();
                uk0Var = li0Var4.d;
                if (uk0Var != null) {
                    charSequence = uk0Var.a;
                    if (charSequence != null) {
                        ak0VarA2.a = charSequence;
                    }
                    charSequence2 = uk0Var.b;
                    if (charSequence2 != null) {
                        ak0VarA2.b = charSequence2;
                    }
                    charSequence3 = uk0Var.c;
                    if (charSequence3 != null) {
                        ak0VarA2.c = charSequence3;
                    }
                    charSequence4 = uk0Var.d;
                    if (charSequence4 != null) {
                        ak0VarA2.d = charSequence4;
                    }
                    charSequence5 = uk0Var.e;
                    if (charSequence5 != null) {
                        ak0VarA2.e = charSequence5;
                    }
                    bArr = uk0Var.f;
                    if (bArr != null) {
                        Integer num14 = uk0Var.g;
                        ak0VarA2.f = (byte[]) bArr.clone();
                        ak0VarA2.g = num14;
                    }
                    num = uk0Var.h;
                    if (num != null) {
                        ak0VarA2.h = num;
                    }
                    num2 = uk0Var.i;
                    if (num2 != null) {
                        ak0VarA2.i = num2;
                    }
                    num3 = uk0Var.j;
                    if (num3 != null) {
                        ak0VarA2.j = num3;
                    }
                    bool = uk0Var.k;
                    if (bool != null) {
                        ak0VarA2.k = bool;
                    }
                    num4 = uk0Var.l;
                    if (num4 != null) {
                        ak0VarA2.l = num4;
                    }
                    num5 = uk0Var.m;
                    if (num5 != null) {
                        ak0VarA2.l = num5;
                    }
                    num6 = uk0Var.n;
                    if (num6 != null) {
                        ak0VarA2.m = num6;
                    }
                    num7 = uk0Var.o;
                    if (num7 != null) {
                        ak0VarA2.n = num7;
                    }
                    num8 = uk0Var.p;
                    if (num8 != null) {
                        ak0VarA2.o = num8;
                    }
                    num9 = uk0Var.q;
                    if (num9 != null) {
                        ak0VarA2.p = num9;
                    }
                    num10 = uk0Var.r;
                    if (num10 != null) {
                        ak0VarA2.q = num10;
                    }
                    charSequence6 = uk0Var.s;
                    if (charSequence6 != null) {
                        ak0VarA2.r = charSequence6;
                    }
                    charSequence7 = uk0Var.t;
                    if (charSequence7 != null) {
                        ak0VarA2.s = charSequence7;
                    }
                    charSequence8 = uk0Var.u;
                    if (charSequence8 != null) {
                        ak0VarA2.t = charSequence8;
                    }
                    num11 = uk0Var.v;
                    if (num11 != null) {
                        ak0VarA2.u = num11;
                    }
                    num12 = uk0Var.w;
                    if (num12 != null) {
                        ak0VarA2.v = num12;
                    }
                    charSequence9 = uk0Var.x;
                    if (charSequence9 != null) {
                        ak0VarA2.w = charSequence9;
                    }
                    charSequence10 = uk0Var.y;
                    if (charSequence10 != null) {
                        ak0VarA2.x = charSequence10;
                    }
                    num13 = uk0Var.z;
                    if (num13 != null) {
                        ak0VarA2.y = num13;
                    }
                    vj2Var = uk0Var.A;
                    if (!vj2Var.isEmpty()) {
                        ak0VarA2.z = vj2.m(vj2Var);
                    }
                }
                uk0Var2 = new uk0(ak0VarA2);
            }
            zEquals = uk0Var2.equals(this.P);
            this.P = uk0Var2;
            if (u83Var2.l != u83Var.l) {
                i9 = 1;
            } else {
                i9 = i4;
            }
            if (u83Var2.e != u83Var.e) {
                i10 = 1;
            } else {
                i10 = i4;
            }
            if (i10 == 0 || i9 != 0) {
                ph0Var = this.E;
                ph0Var2 = this.D;
                iY1 = y1();
                if (iY1 != 2 || iY1 == 3) {
                    g2();
                    this.b0.getClass();
                    zB1 = B1();
                    if (ph0Var2.g != zB1) {
                        ph0Var2.g = zB1;
                    }
                    zB2 = B1();
                    if (ph0Var.g != zB2) {
                        ph0Var.g = zB2;
                    }
                } else {
                    if (ph0Var2.g) {
                        boolean z11 = i4;
                        ph0Var2.g = z11;
                        z7 = z11;
                    } else {
                        z7 = i4;
                    }
                    if (ph0Var.g) {
                        ph0Var.g = z7;
                    }
                }
            }
            if (u83Var2.g != u83Var.g) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (!zEquals2) {
                this.s.c(0, new l73(u83Var, i));
            }
            if (z5) {
                su0Var = new su0();
                if (ox0Var.g()) {
                    i32 = i3;
                    obj = null;
                    li0Var2 = null;
                    obj2 = null;
                    i33 = -1;
                } else {
                    Object obj7 = u83Var2.b.a;
                    ox0Var.o(obj7, su0Var);
                    int i37 = su0Var.c;
                    int iE = ox0Var.e(obj7);
                    ex0 ex0Var2 = (ex0) this.f;
                    obj = ox0Var.b(i37, ex0Var2, 0L).a;
                    li0Var2 = ex0Var2.b;
                    obj2 = obj7;
                    i32 = i37;
                    i33 = iE;
                }
                yd3Var = u83Var2.b;
                if (i5 == 0) {
                    zB = yd3Var.b();
                    jA2 = u83Var2.r;
                    if (zB) {
                        jA3 = a2(u83Var2);
                    } else {
                        jA3 = jA2;
                    }
                } else if (yd3Var.b()) {
                    jA2 = su0Var.b(yd3Var.b, yd3Var.c);
                    jA3 = a2(u83Var2);
                } else {
                    if (yd3Var.e != -1) {
                        jA2 = a2(this.b0);
                    } else {
                        jA2 = su0Var.d;
                    }
                    jA3 = jA2;
                }
                String str = qz1.a;
                yd3 yd3Var4 = u83Var2.b;
                at0 at0Var = new at0(obj, i32, li0Var2, obj2, i33, qz1.q(jA2), qz1.q(jA3), yd3Var4.b, yd3Var4.c);
                iK2 = K1();
                if (this.b0.a.g()) {
                    obj3 = null;
                    li0Var3 = null;
                    obj4 = null;
                    i34 = -1;
                } else {
                    u83 u83Var3 = this.b0;
                    Object obj8 = u83Var3.b.a;
                    u83Var3.a.o(obj8, this.u);
                    int iE2 = this.b0.a.e(obj8);
                    ox0 ox0Var3 = this.b0.a;
                    ex0 ex0Var3 = (ex0) this.f;
                    i34 = iE2;
                    obj3 = ox0Var3.b(iK2, ex0Var3, 0L).a;
                    li0Var3 = ex0Var3.b;
                    obj4 = obj8;
                }
                jQ = qz1.q(j);
                if (this.b0.b.b()) {
                    jQ2 = qz1.q(a2(this.b0));
                } else {
                    jQ2 = jQ;
                }
                yd3 yd3Var5 = this.b0.b;
                at0 at0Var2 = new at0(obj3, iK2, li0Var3, obj4, i34, jQ, jQ2, yd3Var5.b, yd3Var5.c);
                gr1 gr1Var2 = this.s;
                um0 um0Var = new um0();
                um0Var.f = i5;
                um0Var.g = at0Var;
                um0Var.h = at0Var2;
                gr1Var2.c(11, um0Var);
            } else {
                zEquals = zEquals;
                i10 = i10;
            }
            if (zBooleanValue) {
                gr1 gr1Var3 = this.s;
                v33 v33Var = new v33(li0Var, iIntValue);
                i11 = 1;
                gr1Var3.c(1, v33Var);
            } else {
                i11 = 1;
            }
            q43Var = u83Var2.f;
            q43Var2 = u83Var.f;
            i12 = 10;
            if (q43Var != q43Var2) {
                gr1Var = this.s;
                gr1Var.c(10, new hp1() { // from class: m73
                    @Override // defpackage.hp1
                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ void mo6b(Object obj9) {
                        int i38 = i11;
                        u83 u83Var4 = u83Var;
                        ds0 ds0Var = (ds0) obj9;
                        switch (i38) {
                            case 0:
                                int i39 = p73.f0;
                                boolean z12 = u83Var4.l;
                                ds0Var.g();
                                break;
                            default:
                                int i40 = p73.f0;
                                ds0Var.G(u83Var4.f);
                                break;
                        }
                    }
                });
                if (q43Var2 != null) {
                    final int i38 = 0;
                    gr1Var.c(10, new hp1() { // from class: e73
                        @Override // defpackage.hp1
                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ void mo6b(Object obj9) {
                            int i39 = i38;
                            u83 u83Var4 = u83Var;
                            ds0 ds0Var = (ds0) obj9;
                            switch (i39) {
                                case 0:
                                    int i40 = p73.f0;
                                    ds0Var.F(u83Var4.f);
                                    break;
                                default:
                                    int i41 = p73.f0;
                                    int i42 = u83Var4.n;
                                    ds0Var.k();
                                    break;
                            }
                        }
                    });
                }
            }
            dg3Var = u83Var2.i;
            dg3Var2 = u83Var.i;
            if (dg3Var != dg3Var2) {
                zf3 zf3Var = this.o;
                Object obj9 = dg3Var2.j;
                zf3Var.getClass();
                final int i39 = 0;
                i13 = 2;
                this.s.c(2, new hp1() { // from class: f73
                    @Override // defpackage.hp1
                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ void mo6b(Object obj10) {
                        int i40 = i39;
                        u83 u83Var4 = u83Var;
                        ds0 ds0Var = (ds0) obj10;
                        switch (i40) {
                            case 0:
                                int i41 = p73.f0;
                                Object obj11 = u83Var4.i.i;
                                ds0Var.l();
                                break;
                            default:
                                int i42 = p73.f0;
                                u83Var4.getClass();
                                ds0Var.i();
                                break;
                        }
                    }
                });
            } else {
                i13 = 2;
            }
            if (!zEquals) {
                this.s.c(14, new v33(i13, this.P));
            }
            if (z8) {
                final int i40 = 0;
                this.s.c(3, new hp1() { // from class: g73
                    @Override // defpackage.hp1
                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ void mo6b(Object obj10) {
                        int i41 = i40;
                        u83 u83Var4 = u83Var;
                        ds0 ds0Var = (ds0) obj10;
                        switch (i41) {
                            case 0:
                                int i42 = p73.f0;
                                boolean z12 = u83Var4.g;
                                ds0Var.d();
                                break;
                            default:
                                int i43 = p73.f0;
                                up0 up0Var = u83Var4.o;
                                ds0Var.q();
                                break;
                        }
                    }
                });
            }
            if (i10 == 0 || i9 != 0) {
                this.s.c(-1, new rz1(i12, u83Var));
            }
            if (i10 != 0) {
                this.s.c(4, new l73(u83Var));
            }
            if (i9 == 0 || u83Var2.m != u83Var.m) {
                final int i41 = 0;
                this.s.c(5, new hp1() { // from class: m73
                    @Override // defpackage.hp1
                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ void mo6b(Object obj10) {
                        int i310 = i41;
                        u83 u83Var4 = u83Var;
                        ds0 ds0Var = (ds0) obj10;
                        switch (i310) {
                            case 0:
                                int i311 = p73.f0;
                                boolean z12 = u83Var4.l;
                                ds0Var.g();
                                break;
                            default:
                                int i42 = p73.f0;
                                ds0Var.G(u83Var4.f);
                                break;
                        }
                    }
                });
            }
            if (u83Var2.n != u83Var.n) {
                i14 = 1;
                this.s.c(6, new hp1() { // from class: e73
                    @Override // defpackage.hp1
                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ void mo6b(Object obj10) {
                        int i310 = i14;
                        u83 u83Var4 = u83Var;
                        ds0 ds0Var = (ds0) obj10;
                        switch (i310) {
                            case 0:
                                int i42 = p73.f0;
                                ds0Var.F(u83Var4.f);
                                break;
                            default:
                                int i43 = p73.f0;
                                int i44 = u83Var4.n;
                                ds0Var.k();
                                break;
                        }
                    }
                });
            } else {
                i14 = 1;
            }
            if (u83Var2.i() != u83Var.i()) {
                this.s.c(7, new hp1() { // from class: f73
                    @Override // defpackage.hp1
                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ void mo6b(Object obj10) {
                        int i42 = i14;
                        u83 u83Var4 = u83Var;
                        ds0 ds0Var = (ds0) obj10;
                        switch (i42) {
                            case 0:
                                int i43 = p73.f0;
                                Object obj11 = u83Var4.i.i;
                                ds0Var.l();
                                break;
                            default:
                                int i44 = p73.f0;
                                u83Var4.getClass();
                                ds0Var.i();
                                break;
                        }
                    }
                });
            }
            if (!u83Var2.o.equals(u83Var.o)) {
                this.s.c(12, new hp1() { // from class: g73
                    @Override // defpackage.hp1
                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ void mo6b(Object obj10) {
                        int i42 = i14;
                        u83 u83Var4 = u83Var;
                        ds0 ds0Var = (ds0) obj10;
                        switch (i42) {
                            case 0:
                                int i43 = p73.f0;
                                boolean z12 = u83Var4.g;
                                ds0Var.d();
                                break;
                            default:
                                int i44 = p73.f0;
                                up0 up0Var = u83Var4.o;
                                ds0Var.q();
                                break;
                        }
                    }
                });
            }
            xq0Var = this.O;
            d93Var = this.l;
            xq0 xq0Var3 = this.i;
            String str2 = qz1.a;
            zP1 = d93Var.P1();
            ox0VarG2 = d93Var.G1();
            if (ox0VarG2.g() && ox0VarG2.b(d93Var.K1(), (ex0) d93Var.f, 0L).f) {
                i15 = i14;
            } else {
                i15 = 0;
            }
            ox0VarG3 = d93Var.G1();
            if (ox0VarG3.g()) {
                i18 = 0;
                i17 = -1;
            } else {
                int iK3 = d93Var.K1();
                d93Var.i();
                d93Var.D1();
                i16 = ox0VarG3.i(iK3);
                i17 = -1;
                if (i16 != -1) {
                    i18 = i14;
                } else {
                    i18 = 0;
                }
            }
            ox0VarG4 = d93Var.G1();
            if (ox0VarG4.g()) {
                i19 = 0;
                i20 = 0;
            } else {
                iK1 = d93Var.K1();
                d93Var.i();
                d93Var.D1();
                i19 = 0;
                if (ox0VarG4.h(iK1, 0, false) != i17) {
                    i20 = i14;
                } else {
                    i20 = 0;
                }
            }
            ox0VarG5 = d93Var.G1();
            if (ox0VarG5.g() && ox0VarG5.b(d93Var.K1(), (ex0) d93Var.f, 0L).b()) {
                i21 = 1;
            } else {
                i21 = i19;
            }
            ox0VarG6 = d93Var.G1();
            if (!ox0VarG6.g()) {
                i22 = i21;
                if (ox0VarG6.b(d93Var.K1(), (ex0) d93Var.f, 0L).g) {
                    i23 = 1;
                }
                zG = d93Var.G1().g();
                mn0Var = new mn0(3);
                cc3Var = xq0Var3.a;
                for (i24 = i19; i24 < cc3Var.a.size(); i24++) {
                    mn0Var.c(cc3Var.a(i24));
                }
                if (!zP1) {
                    mn0Var.c(4);
                }
                if (i15 != 0 || zP1) {
                    i25 = i19;
                } else {
                    i25 = 1;
                }
                if (i25 != 0) {
                    mn0Var.c(5);
                }
                if (i18 != 0 || zP1) {
                    i26 = i19;
                } else {
                    i26 = 1;
                }
                if (i26 != 0) {
                    mn0Var.c(6);
                }
                if (!zG || ((i18 == 0 && i22 != 0 && i15 == 0) || zP1)) {
                    i27 = i19;
                } else {
                    i27 = 1;
                }
                if (i27 != 0) {
                    mn0Var.c(7);
                }
                if (i20 != 0 || zP1) {
                    i28 = i19;
                } else {
                    i28 = 1;
                }
                if (i28 != 0) {
                    mn0Var.c(8);
                }
                if (!zG || ((i20 == 0 && (i22 == 0 || i23 == 0)) || zP1)) {
                    i29 = i19;
                } else {
                    i29 = 1;
                }
                if (i29 != 0) {
                    mn0Var.c(9);
                }
                if (!zP1) {
                    mn0Var.c(10);
                }
                if (i15 != 0 || zP1) {
                    i30 = i19;
                } else {
                    i30 = 1;
                }
                if (i30 != 0) {
                    mn0Var.c(11);
                }
                if (i15 != 0 || zP1) {
                    i31 = i19;
                } else {
                    i31 = 1;
                }
                if (i31 != 0) {
                    mn0Var.c(12);
                }
                xq0Var2 = new xq0(mn0Var.d());
                this.O = xq0Var2;
                if (!xq0Var2.equals(xq0Var)) {
                    this.s.c(13, new r53(this, 2));
                }
                this.s.d();
            }
            i22 = i21;
            i23 = i19;
            zG = d93Var.G1().g();
            mn0Var = new mn0(3);
            cc3Var = xq0Var3.a;
            while (i24 < cc3Var.a.size()) {
                mn0Var.c(cc3Var.a(i24));
            }
            if (!zP1) {
                mn0Var.c(4);
            }
            if (i15 != 0) {
                i25 = i19;
            } else {
                i25 = i19;
            }
            if (i25 != 0) {
                mn0Var.c(5);
            }
            if (i18 != 0) {
                i26 = i19;
            } else {
                i26 = i19;
            }
            if (i26 != 0) {
                mn0Var.c(6);
            }
            if (zG) {
                i27 = i19;
            } else {
                i27 = i19;
            }
            if (i27 != 0) {
                mn0Var.c(7);
            }
            if (i20 != 0) {
                i28 = i19;
            } else {
                i28 = i19;
            }
            if (i28 != 0) {
                mn0Var.c(8);
            }
            if (zG) {
                i29 = i19;
            } else {
                i29 = i19;
            }
            if (i29 != 0) {
                mn0Var.c(9);
            }
            if (!zP1) {
                mn0Var.c(10);
            }
            if (i15 != 0) {
                i30 = i19;
            } else {
                i30 = i19;
            }
            if (i30 != 0) {
                mn0Var.c(11);
            }
            if (i15 != 0) {
                i31 = i19;
            } else {
                i31 = i19;
            }
            if (i31 != 0) {
                mn0Var.c(12);
            }
            xq0Var2 = new xq0(mn0Var.d());
            this.O = xq0Var2;
            if (!xq0Var2.equals(xq0Var)) {
                this.s.c(13, new r53(this, 2));
            }
            this.s.d();
        }
        pair = new Pair(Boolean.FALSE, -1);
        i5 = i35;
        i4 = 0;
        z2 = z;
        zBooleanValue = ((Boolean) pair.first).booleanValue();
        iIntValue = ((Integer) pair.second).intValue();
        if (zBooleanValue) {
            if (ox0Var2.g()) {
                li0Var = ox0Var2.b(ox0Var2.o(u83Var.b.a, this.u).c, (ex0) this.f, 0L).b;
            } else {
                li0Var = null;
            }
            this.a0 = uk0.B;
        } else {
            li0Var = null;
        }
        if (zBooleanValue) {
            ak0VarA = this.a0.a();
            list = u83Var.j;
            i7 = i4;
            while (i7 < list.size()) {
                am0Var = (am0) list.get(i7);
                i8 = i4;
                while (true) {
                    il0VarArr = am0Var.a;
                    z6 = z2;
                    if (i8 < il0VarArr.length) {
                        il0VarArr[i8].a(ak0VarA);
                        i8++;
                        z2 = z6;
                    }
                }
                i7++;
                z2 = z6;
            }
            z5 = z2;
            this.a0 = new uk0(ak0VarA);
        } else {
            ak0VarA = this.a0.a();
            list = u83Var.j;
            i7 = i4;
            while (i7 < list.size()) {
                am0Var = (am0) list.get(i7);
                i8 = i4;
                while (true) {
                    il0VarArr = am0Var.a;
                    z6 = z2;
                    if (i8 < il0VarArr.length) {
                        il0VarArr[i8].a(ak0VarA);
                        i8++;
                        z2 = z6;
                    }
                }
                i7++;
                z2 = z6;
            }
            z5 = z2;
            this.a0 = new uk0(ak0VarA);
        }
        ox0VarG1 = G1();
        if (ox0VarG1.g()) {
            uk0Var2 = this.a0;
        } else {
            li0 li0Var5 = ox0VarG1.b(K1(), (ex0) this.f, 0L).b;
            ak0VarA2 = this.a0.a();
            uk0Var = li0Var5.d;
            if (uk0Var != null) {
                charSequence = uk0Var.a;
                if (charSequence != null) {
                    ak0VarA2.a = charSequence;
                }
                charSequence2 = uk0Var.b;
                if (charSequence2 != null) {
                    ak0VarA2.b = charSequence2;
                }
                charSequence3 = uk0Var.c;
                if (charSequence3 != null) {
                    ak0VarA2.c = charSequence3;
                }
                charSequence4 = uk0Var.d;
                if (charSequence4 != null) {
                    ak0VarA2.d = charSequence4;
                }
                charSequence5 = uk0Var.e;
                if (charSequence5 != null) {
                    ak0VarA2.e = charSequence5;
                }
                bArr = uk0Var.f;
                if (bArr != null) {
                    Integer num15 = uk0Var.g;
                    ak0VarA2.f = (byte[]) bArr.clone();
                    ak0VarA2.g = num15;
                }
                num = uk0Var.h;
                if (num != null) {
                    ak0VarA2.h = num;
                }
                num2 = uk0Var.i;
                if (num2 != null) {
                    ak0VarA2.i = num2;
                }
                num3 = uk0Var.j;
                if (num3 != null) {
                    ak0VarA2.j = num3;
                }
                bool = uk0Var.k;
                if (bool != null) {
                    ak0VarA2.k = bool;
                }
                num4 = uk0Var.l;
                if (num4 != null) {
                    ak0VarA2.l = num4;
                }
                num5 = uk0Var.m;
                if (num5 != null) {
                    ak0VarA2.l = num5;
                }
                num6 = uk0Var.n;
                if (num6 != null) {
                    ak0VarA2.m = num6;
                }
                num7 = uk0Var.o;
                if (num7 != null) {
                    ak0VarA2.n = num7;
                }
                num8 = uk0Var.p;
                if (num8 != null) {
                    ak0VarA2.o = num8;
                }
                num9 = uk0Var.q;
                if (num9 != null) {
                    ak0VarA2.p = num9;
                }
                num10 = uk0Var.r;
                if (num10 != null) {
                    ak0VarA2.q = num10;
                }
                charSequence6 = uk0Var.s;
                if (charSequence6 != null) {
                    ak0VarA2.r = charSequence6;
                }
                charSequence7 = uk0Var.t;
                if (charSequence7 != null) {
                    ak0VarA2.s = charSequence7;
                }
                charSequence8 = uk0Var.u;
                if (charSequence8 != null) {
                    ak0VarA2.t = charSequence8;
                }
                num11 = uk0Var.v;
                if (num11 != null) {
                    ak0VarA2.u = num11;
                }
                num12 = uk0Var.w;
                if (num12 != null) {
                    ak0VarA2.v = num12;
                }
                charSequence9 = uk0Var.x;
                if (charSequence9 != null) {
                    ak0VarA2.w = charSequence9;
                }
                charSequence10 = uk0Var.y;
                if (charSequence10 != null) {
                    ak0VarA2.x = charSequence10;
                }
                num13 = uk0Var.z;
                if (num13 != null) {
                    ak0VarA2.y = num13;
                }
                vj2Var = uk0Var.A;
                if (!vj2Var.isEmpty()) {
                    ak0VarA2.z = vj2.m(vj2Var);
                }
            }
            uk0Var2 = new uk0(ak0VarA2);
        }
        zEquals = uk0Var2.equals(this.P);
        this.P = uk0Var2;
        if (u83Var2.l != u83Var.l) {
            i9 = 1;
        } else {
            i9 = i4;
        }
        if (u83Var2.e != u83Var.e) {
            i10 = 1;
        } else {
            i10 = i4;
        }
        if (i10 == 0) {
            ph0Var = this.E;
            ph0Var2 = this.D;
            iY1 = y1();
            if (iY1 != 2) {
                g2();
                this.b0.getClass();
                zB1 = B1();
                if (ph0Var2.g != zB1) {
                    ph0Var2.g = zB1;
                }
                zB2 = B1();
                if (ph0Var.g != zB2) {
                    ph0Var.g = zB2;
                }
            } else {
                g2();
                this.b0.getClass();
                zB1 = B1();
                if (ph0Var2.g != zB1) {
                    ph0Var2.g = zB1;
                }
                zB2 = B1();
                if (ph0Var.g != zB2) {
                    ph0Var.g = zB2;
                }
            }
        } else {
            ph0Var = this.E;
            ph0Var2 = this.D;
            iY1 = y1();
            if (iY1 != 2) {
                g2();
                this.b0.getClass();
                zB1 = B1();
                if (ph0Var2.g != zB1) {
                    ph0Var2.g = zB1;
                }
                zB2 = B1();
                if (ph0Var.g != zB2) {
                    ph0Var.g = zB2;
                }
            } else {
                g2();
                this.b0.getClass();
                zB1 = B1();
                if (ph0Var2.g != zB1) {
                    ph0Var2.g = zB1;
                }
                zB2 = B1();
                if (ph0Var.g != zB2) {
                    ph0Var.g = zB2;
                }
            }
        }
        if (u83Var2.g != u83Var.g) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (!zEquals2) {
            this.s.c(0, new l73(u83Var, i));
        }
        if (z5) {
            su0Var = new su0();
            if (ox0Var.g()) {
                Object obj10 = u83Var2.b.a;
                ox0Var.o(obj10, su0Var);
                int i310 = su0Var.c;
                int iE3 = ox0Var.e(obj10);
                ex0 ex0Var4 = (ex0) this.f;
                obj = ox0Var.b(i310, ex0Var4, 0L).a;
                li0Var2 = ex0Var4.b;
                obj2 = obj10;
                i32 = i310;
                i33 = iE3;
            } else {
                i32 = i3;
                obj = null;
                li0Var2 = null;
                obj2 = null;
                i33 = -1;
            }
            yd3Var = u83Var2.b;
            if (i5 == 0) {
                zB = yd3Var.b();
                jA2 = u83Var2.r;
                if (zB) {
                    jA3 = a2(u83Var2);
                } else {
                    jA3 = jA2;
                }
            } else if (yd3Var.b()) {
                jA2 = su0Var.b(yd3Var.b, yd3Var.c);
                jA3 = a2(u83Var2);
            } else {
                if (yd3Var.e != -1) {
                    jA2 = a2(this.b0);
                } else {
                    jA2 = su0Var.d;
                }
                jA3 = jA2;
            }
            String str3 = qz1.a;
            yd3 yd3Var6 = u83Var2.b;
            at0 at0Var3 = new at0(obj, i32, li0Var2, obj2, i33, qz1.q(jA2), qz1.q(jA3), yd3Var6.b, yd3Var6.c);
            iK2 = K1();
            if (this.b0.a.g()) {
                u83 u83Var4 = this.b0;
                Object obj11 = u83Var4.b.a;
                u83Var4.a.o(obj11, this.u);
                int iE4 = this.b0.a.e(obj11);
                ox0 ox0Var4 = this.b0.a;
                ex0 ex0Var5 = (ex0) this.f;
                i34 = iE4;
                obj3 = ox0Var4.b(iK2, ex0Var5, 0L).a;
                li0Var3 = ex0Var5.b;
                obj4 = obj11;
            } else {
                obj3 = null;
                li0Var3 = null;
                obj4 = null;
                i34 = -1;
            }
            jQ = qz1.q(j);
            if (this.b0.b.b()) {
                jQ2 = qz1.q(a2(this.b0));
            } else {
                jQ2 = jQ;
            }
            yd3 yd3Var7 = this.b0.b;
            at0 at0Var4 = new at0(obj3, iK2, li0Var3, obj4, i34, jQ, jQ2, yd3Var7.b, yd3Var7.c);
            gr1 gr1Var4 = this.s;
            um0 um0Var2 = new um0();
            um0Var2.f = i5;
            um0Var2.g = at0Var3;
            um0Var2.h = at0Var4;
            gr1Var4.c(11, um0Var2);
        } else {
            zEquals = zEquals;
            i10 = i10;
        }
        if (zBooleanValue) {
            gr1 gr1Var5 = this.s;
            v33 v33Var2 = new v33(li0Var, iIntValue);
            i11 = 1;
            gr1Var5.c(1, v33Var2);
        } else {
            i11 = 1;
        }
        q43Var = u83Var2.f;
        q43Var2 = u83Var.f;
        i12 = 10;
        if (q43Var != q43Var2) {
            gr1Var = this.s;
            gr1Var.c(10, new hp1() { // from class: m73
                @Override // defpackage.hp1
                /* JADX INFO: renamed from: b */
                public final /* synthetic */ void mo6b(Object obj12) {
                    int i311 = i11;
                    u83 u83Var5 = u83Var;
                    ds0 ds0Var = (ds0) obj12;
                    switch (i311) {
                        case 0:
                            int i312 = p73.f0;
                            boolean z12 = u83Var5.l;
                            ds0Var.g();
                            break;
                        default:
                            int i42 = p73.f0;
                            ds0Var.G(u83Var5.f);
                            break;
                    }
                }
            });
            if (q43Var2 != null) {
                final int i311 = 0;
                gr1Var.c(10, new hp1() { // from class: e73
                    @Override // defpackage.hp1
                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ void mo6b(Object obj12) {
                        int i312 = i311;
                        u83 u83Var5 = u83Var;
                        ds0 ds0Var = (ds0) obj12;
                        switch (i312) {
                            case 0:
                                int i42 = p73.f0;
                                ds0Var.F(u83Var5.f);
                                break;
                            default:
                                int i43 = p73.f0;
                                int i44 = u83Var5.n;
                                ds0Var.k();
                                break;
                        }
                    }
                });
            }
        }
        dg3Var = u83Var2.i;
        dg3Var2 = u83Var.i;
        if (dg3Var != dg3Var2) {
            zf3 zf3Var2 = this.o;
            Object obj12 = dg3Var2.j;
            zf3Var2.getClass();
            final int i312 = 0;
            i13 = 2;
            this.s.c(2, new hp1() { // from class: f73
                @Override // defpackage.hp1
                /* JADX INFO: renamed from: b */
                public final /* synthetic */ void mo6b(Object obj13) {
                    int i42 = i312;
                    u83 u83Var5 = u83Var;
                    ds0 ds0Var = (ds0) obj13;
                    switch (i42) {
                        case 0:
                            int i43 = p73.f0;
                            Object obj14 = u83Var5.i.i;
                            ds0Var.l();
                            break;
                        default:
                            int i44 = p73.f0;
                            u83Var5.getClass();
                            ds0Var.i();
                            break;
                    }
                }
            });
        } else {
            i13 = 2;
        }
        if (!zEquals) {
            this.s.c(14, new v33(i13, this.P));
        }
        if (z8) {
            final int i42 = 0;
            this.s.c(3, new hp1() { // from class: g73
                @Override // defpackage.hp1
                /* JADX INFO: renamed from: b */
                public final /* synthetic */ void mo6b(Object obj13) {
                    int i43 = i42;
                    u83 u83Var5 = u83Var;
                    ds0 ds0Var = (ds0) obj13;
                    switch (i43) {
                        case 0:
                            int i44 = p73.f0;
                            boolean z12 = u83Var5.g;
                            ds0Var.d();
                            break;
                        default:
                            int i45 = p73.f0;
                            up0 up0Var = u83Var5.o;
                            ds0Var.q();
                            break;
                    }
                }
            });
        }
        if (i10 == 0) {
            this.s.c(-1, new rz1(i12, u83Var));
        } else {
            this.s.c(-1, new rz1(i12, u83Var));
        }
        if (i10 != 0) {
            this.s.c(4, new l73(u83Var));
        }
        if (i9 == 0) {
            final int i43 = 0;
            this.s.c(5, new hp1() { // from class: m73
                @Override // defpackage.hp1
                /* JADX INFO: renamed from: b */
                public final /* synthetic */ void mo6b(Object obj13) {
                    int i313 = i43;
                    u83 u83Var5 = u83Var;
                    ds0 ds0Var = (ds0) obj13;
                    switch (i313) {
                        case 0:
                            int i314 = p73.f0;
                            boolean z12 = u83Var5.l;
                            ds0Var.g();
                            break;
                        default:
                            int i44 = p73.f0;
                            ds0Var.G(u83Var5.f);
                            break;
                    }
                }
            });
        } else {
            final int i44 = 0;
            this.s.c(5, new hp1() { // from class: m73
                @Override // defpackage.hp1
                /* JADX INFO: renamed from: b */
                public final /* synthetic */ void mo6b(Object obj13) {
                    int i313 = i44;
                    u83 u83Var5 = u83Var;
                    ds0 ds0Var = (ds0) obj13;
                    switch (i313) {
                        case 0:
                            int i314 = p73.f0;
                            boolean z12 = u83Var5.l;
                            ds0Var.g();
                            break;
                        default:
                            int i45 = p73.f0;
                            ds0Var.G(u83Var5.f);
                            break;
                    }
                }
            });
        }
        if (u83Var2.n != u83Var.n) {
            i14 = 1;
            this.s.c(6, new hp1() { // from class: e73
                @Override // defpackage.hp1
                /* JADX INFO: renamed from: b */
                public final /* synthetic */ void mo6b(Object obj13) {
                    int i313 = i14;
                    u83 u83Var5 = u83Var;
                    ds0 ds0Var = (ds0) obj13;
                    switch (i313) {
                        case 0:
                            int i45 = p73.f0;
                            ds0Var.F(u83Var5.f);
                            break;
                        default:
                            int i46 = p73.f0;
                            int i47 = u83Var5.n;
                            ds0Var.k();
                            break;
                    }
                }
            });
        } else {
            i14 = 1;
        }
        if (u83Var2.i() != u83Var.i()) {
            this.s.c(7, new hp1() { // from class: f73
                @Override // defpackage.hp1
                /* JADX INFO: renamed from: b */
                public final /* synthetic */ void mo6b(Object obj13) {
                    int i45 = i14;
                    u83 u83Var5 = u83Var;
                    ds0 ds0Var = (ds0) obj13;
                    switch (i45) {
                        case 0:
                            int i46 = p73.f0;
                            Object obj14 = u83Var5.i.i;
                            ds0Var.l();
                            break;
                        default:
                            int i47 = p73.f0;
                            u83Var5.getClass();
                            ds0Var.i();
                            break;
                    }
                }
            });
        }
        if (!u83Var2.o.equals(u83Var.o)) {
            this.s.c(12, new hp1() { // from class: g73
                @Override // defpackage.hp1
                /* JADX INFO: renamed from: b */
                public final /* synthetic */ void mo6b(Object obj13) {
                    int i45 = i14;
                    u83 u83Var5 = u83Var;
                    ds0 ds0Var = (ds0) obj13;
                    switch (i45) {
                        case 0:
                            int i46 = p73.f0;
                            boolean z12 = u83Var5.g;
                            ds0Var.d();
                            break;
                        default:
                            int i47 = p73.f0;
                            up0 up0Var = u83Var5.o;
                            ds0Var.q();
                            break;
                    }
                }
            });
        }
        xq0Var = this.O;
        d93Var = this.l;
        xq0 xq0Var4 = this.i;
        String str4 = qz1.a;
        zP1 = d93Var.P1();
        ox0VarG2 = d93Var.G1();
        if (ox0VarG2.g()) {
            i15 = 0;
        } else {
            i15 = 0;
        }
        ox0VarG3 = d93Var.G1();
        if (ox0VarG3.g()) {
            i18 = 0;
            i17 = -1;
        } else {
            int iK4 = d93Var.K1();
            d93Var.i();
            d93Var.D1();
            i16 = ox0VarG3.i(iK4);
            i17 = -1;
            if (i16 != -1) {
                i18 = i14;
            } else {
                i18 = 0;
            }
        }
        ox0VarG4 = d93Var.G1();
        if (ox0VarG4.g()) {
            i19 = 0;
            i20 = 0;
        } else {
            iK1 = d93Var.K1();
            d93Var.i();
            d93Var.D1();
            i19 = 0;
            if (ox0VarG4.h(iK1, 0, false) != i17) {
                i20 = i14;
            } else {
                i20 = 0;
            }
        }
        ox0VarG5 = d93Var.G1();
        if (ox0VarG5.g()) {
            i21 = i19;
        } else {
            i21 = i19;
        }
        ox0VarG6 = d93Var.G1();
        if (!ox0VarG6.g()) {
            i22 = i21;
            if (ox0VarG6.b(d93Var.K1(), (ex0) d93Var.f, 0L).g) {
                i23 = 1;
            }
            zG = d93Var.G1().g();
            mn0Var = new mn0(3);
            cc3Var = xq0Var4.a;
            while (i24 < cc3Var.a.size()) {
                mn0Var.c(cc3Var.a(i24));
            }
            if (!zP1) {
                mn0Var.c(4);
            }
            if (i15 != 0) {
                i25 = i19;
            } else {
                i25 = i19;
            }
            if (i25 != 0) {
                mn0Var.c(5);
            }
            if (i18 != 0) {
                i26 = i19;
            } else {
                i26 = i19;
            }
            if (i26 != 0) {
                mn0Var.c(6);
            }
            if (zG) {
                i27 = i19;
            } else {
                i27 = i19;
            }
            if (i27 != 0) {
                mn0Var.c(7);
            }
            if (i20 != 0) {
                i28 = i19;
            } else {
                i28 = i19;
            }
            if (i28 != 0) {
                mn0Var.c(8);
            }
            if (zG) {
                i29 = i19;
            } else {
                i29 = i19;
            }
            if (i29 != 0) {
                mn0Var.c(9);
            }
            if (!zP1) {
                mn0Var.c(10);
            }
            if (i15 != 0) {
                i30 = i19;
            } else {
                i30 = i19;
            }
            if (i30 != 0) {
                mn0Var.c(11);
            }
            if (i15 != 0) {
                i31 = i19;
            } else {
                i31 = i19;
            }
            if (i31 != 0) {
                mn0Var.c(12);
            }
            xq0Var2 = new xq0(mn0Var.d());
            this.O = xq0Var2;
            if (!xq0Var2.equals(xq0Var)) {
                this.s.c(13, new r53(this, 2));
            }
            this.s.d();
        }
        i22 = i21;
        i23 = i19;
        zG = d93Var.G1().g();
        mn0Var = new mn0(3);
        cc3Var = xq0Var4.a;
        while (i24 < cc3Var.a.size()) {
            mn0Var.c(cc3Var.a(i24));
        }
        if (!zP1) {
            mn0Var.c(4);
        }
        if (i15 != 0) {
            i25 = i19;
        } else {
            i25 = i19;
        }
        if (i25 != 0) {
            mn0Var.c(5);
        }
        if (i18 != 0) {
            i26 = i19;
        } else {
            i26 = i19;
        }
        if (i26 != 0) {
            mn0Var.c(6);
        }
        if (zG) {
            i27 = i19;
        } else {
            i27 = i19;
        }
        if (i27 != 0) {
            mn0Var.c(7);
        }
        if (i20 != 0) {
            i28 = i19;
        } else {
            i28 = i19;
        }
        if (i28 != 0) {
            mn0Var.c(8);
        }
        if (zG) {
            i29 = i19;
        } else {
            i29 = i19;
        }
        if (i29 != 0) {
            mn0Var.c(9);
        }
        if (!zP1) {
            mn0Var.c(10);
        }
        if (i15 != 0) {
            i30 = i19;
        } else {
            i30 = i19;
        }
        if (i30 != 0) {
            mn0Var.c(11);
        }
        if (i15 != 0) {
            i31 = i19;
        } else {
            i31 = i19;
        }
        if (i31 != 0) {
            mn0Var.c(12);
        }
        xq0Var2 = new xq0(mn0Var.d());
        this.O = xq0Var2;
        if (!xq0Var2.equals(xq0Var)) {
            this.s.c(13, new r53(this, 2));
        }
        this.s.d();
    }

    /* JADX WARN: Code duplicated, block: B:24:0x008f  */
    public final u83 b2(u83 u83Var, ox0 ox0Var, Pair pair) {
        boolean z;
        List list;
        hn.v(ox0Var.g() || pair != null);
        ox0 ox0Var2 = u83Var.a;
        long jX1 = X1(u83Var);
        u83 u83VarC = u83Var.c(ox0Var);
        if (ox0Var.g()) {
            yd3 yd3Var = u83.t;
            long jR = qz1.r(this.d0);
            u83 u83VarG = u83VarC.b(yd3Var, jR, jR, jR, 0L, gf3.d, this.h, qk2.j).g(yd3Var);
            u83VarG.p = u83VarG.r;
            return u83VarG;
        }
        yd3 yd3Var2 = u83VarC.b;
        Object obj = yd3Var2.a;
        String str = qz1.a;
        boolean zEquals = obj.equals(pair.first);
        yd3 yd3Var3 = !zEquals ? new yd3(pair.first, -1L) : yd3Var2;
        long jLongValue = ((Long) pair.second).longValue();
        long jR2 = qz1.r(jX1);
        if (ox0Var2.g()) {
            z = true;
        } else {
            su0 su0Var = this.u;
            ox0Var2.o(obj, su0Var);
            if (zEquals && jR2 - jLongValue == 1) {
                su0 su0VarO = ox0Var2.o(obj, su0Var);
                z = true;
                if (jR2 == su0VarO.d) {
                    jR2--;
                }
            } else {
                z = true;
            }
        }
        if (!zEquals || jLongValue < jR2) {
            hn.M(yd3Var3.b() ^ z);
            gf3 gf3Var = !zEquals ? gf3.d : u83VarC.h;
            dg3 dg3Var = !zEquals ? this.h : u83VarC.i;
            if (zEquals) {
                list = u83VarC.j;
            } else {
                tj2 tj2Var = vj2.g;
                list = qk2.j;
            }
            yd3 yd3Var4 = yd3Var3;
            u83 u83VarG2 = u83VarC.b(yd3Var4, jLongValue, jLongValue, jLongValue, 0L, gf3Var, dg3Var, list).g(yd3Var4);
            u83VarG2.p = jLongValue;
            return u83VarG2;
        }
        if (jLongValue != jR2) {
            hn.M(yd3Var3.b() ^ z);
            long jMax = Math.max(0L, u83VarC.q - (jLongValue - jR2));
            long j = u83VarC.p;
            if (u83VarC.k.equals(yd3Var2)) {
                j = jLongValue + jMax;
            }
            u83 u83VarB = u83VarC.b(yd3Var3, jLongValue, jLongValue, jLongValue, jMax, u83VarC.h, u83VarC.i, u83VarC.j);
            u83VarB.p = j;
            return u83VarB;
        }
        int iE = ox0Var.e(u83VarC.k.a);
        if (iE != -1) {
            su0 su0Var2 = this.u;
            if (ox0Var.d(iE, su0Var2, false).c == ox0Var.o(yd3Var3.a, su0Var2).c) {
                return u83VarC;
            }
        }
        Object obj2 = yd3Var3.a;
        su0 su0Var3 = this.u;
        ox0Var.o(obj2, su0Var3);
        long jB = yd3Var3.b() ? su0Var3.b(yd3Var3.b, yd3Var3.c) : su0Var3.d;
        yd3 yd3Var5 = yd3Var3;
        u83 u83VarG3 = u83VarC.b(yd3Var5, u83VarC.r, u83VarC.r, u83VarC.d, jB - u83VarC.r, u83VarC.h, u83VarC.i, u83VarC.j).g(yd3Var5);
        u83VarG3.p = jB;
        return u83VarG3;
    }

    @Override // defpackage.t33
    public final int c() {
        g2();
        if (P1()) {
            return this.b0.b.b;
        }
        return -1;
    }

    public final Pair d2(ox0 ox0Var, int i, long j) {
        if (ox0Var.g()) {
            this.c0 = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.d0 = j;
            return null;
        }
        if (i == -1 || i >= ox0Var.a()) {
            i = ox0Var.k(false);
            ox0Var.b(i, (ex0) this.f, 0L).getClass();
            j = qz1.q(0L);
        }
        return ox0Var.m((ex0) this.f, this.u, i, qz1.r(j));
    }

    public final void e2(Surface surface) {
        Object obj = this.Q;
        boolean z = false;
        boolean zC = true;
        if (obj != null && obj != surface) {
            z = true;
        }
        long j = z ? this.F : -9223372036854775807L;
        b83 b83Var = this.r;
        if (!b83Var.M && b83Var.o.getThread().isAlive()) {
            km1 km1Var = new km1();
            b83Var.m.a(30, new Pair(surface, km1Var)).a();
            if (j != -9223372036854775807L) {
                zC = km1Var.c(j);
            }
        }
        if (z) {
            Object obj2 = this.Q;
            Surface surface2 = this.R;
            if (obj2 == surface2) {
                surface2.release();
                this.R = null;
            }
        }
        this.Q = surface;
        if (zC) {
            return;
        }
        V1(new q43(2, new na("Detaching surface timed out."), 1003));
    }

    public final void f2(int i, int i2) {
        nw1 nw1Var = this.T;
        if (i == nw1Var.a && i2 == nw1Var.b) {
            return;
        }
        this.T = new nw1(i, i2);
        v33 v33Var = new v33(i, i2);
        gr1 gr1Var = this.s;
        gr1Var.c(24, v33Var);
        gr1Var.d();
        h2(2, 14, new nw1(i, i2));
    }

    public final void g2() {
        this.j.b();
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.y;
        if (threadCurrentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            String str = qz1.a;
            Locale locale = Locale.US;
            String str2 = "Player is accessed on the wrong thread.\nCurrent thread: '" + name + "'\nExpected thread: '" + name2 + "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread";
            if (this.X) {
                j7.e(str2);
            } else {
                s90.T("ExoPlayerImpl", str2, this.Y ? null : new IllegalStateException());
                this.Y = true;
            }
        }
    }

    public final void h2(int i, int i2, Object obj) {
        b83 b83Var;
        yc3[] yc3VarArr = this.m;
        int length = yc3VarArr.length;
        int i3 = 0;
        while (true) {
            b83Var = this.r;
            if (i3 >= 2) {
                break;
            }
            yc3 yc3Var = yc3VarArr[i3];
            if (i == -1 || yc3Var.g == i) {
                W1(this.b0);
                ox0 ox0Var = this.b0.a;
                w83 w83Var = new w83(b83Var, yc3Var, b83Var.o);
                hn.M(!w83Var.f);
                w83Var.c = i2;
                hn.M(!w83Var.f);
                w83Var.d = obj;
                w83Var.a();
            }
            i3++;
        }
        yc3[] yc3VarArr2 = this.n;
        int length2 = yc3VarArr2.length;
        for (int i4 = 0; i4 < 2; i4++) {
            yc3 yc3Var2 = yc3VarArr2[i4];
            if (yc3Var2 != null && (i == -1 || yc3Var2.g == i)) {
                W1(this.b0);
                ox0 ox0Var2 = this.b0.a;
                w83 w83Var2 = new w83(b83Var, yc3Var2, b83Var.o);
                hn.M(!w83Var2.f);
                w83Var2.c = i2;
                hn.M(!w83Var2.f);
                w83Var2.d = obj;
                w83Var2.a();
            }
        }
    }

    @Override // defpackage.t33
    public final void i() {
        g2();
    }

    public final void i2(boolean z) {
        g2();
        u83 u83Var = this.b0;
        int i = u83Var.n;
        int i2 = 0;
        if (i == 1) {
            if (z) {
                i = 1;
            } else {
                i = 1;
                i2 = 1;
            }
        }
        if (u83Var.l == z && i == i2 && u83Var.m == 1) {
            return;
        }
        this.I++;
        u83 u83VarH = u83Var.h(1, i2, z);
        int i3 = (i2 << 4) | 1;
        Handler handler = this.r.m.a;
        ox1 ox1VarF = wx1.f();
        ox1VarF.a = handler.obtainMessage(1, z ? 1 : 0, i3);
        ox1VarF.a();
        Z1(u83VarH, 0, false, 5, -9223372036854775807L, -1);
    }

    public final long j2() {
        g2();
        if (!P1()) {
            ox0 ox0VarG1 = G1();
            if (ox0VarG1.g()) {
                return -9223372036854775807L;
            }
            return qz1.q(ox0VarG1.b(K1(), (ex0) this.f, 0L).j);
        }
        u83 u83Var = this.b0;
        yd3 yd3Var = u83Var.b;
        ox0 ox0Var = u83Var.a;
        Object obj = yd3Var.a;
        su0 su0Var = this.u;
        ox0Var.o(obj, su0Var);
        return qz1.q(su0Var.b(yd3Var.b, yd3Var.c));
    }

    public final long k2() {
        g2();
        if (P1()) {
            u83 u83Var = this.b0;
            return u83Var.k.equals(u83Var.b) ? qz1.q(this.b0.p) : j2();
        }
        g2();
        if (this.b0.a.g()) {
            return this.d0;
        }
        u83 u83Var2 = this.b0;
        long j = 0;
        if (u83Var2.k.d != u83Var2.b.d) {
            return qz1.q(u83Var2.a.b(K1(), (ex0) this.f, 0L).j);
        }
        long j2 = u83Var2.p;
        if (this.b0.k.b()) {
            u83 u83Var3 = this.b0;
            u83Var3.a.o(u83Var3.k.a, this.u).f.a(this.b0.k.b).getClass();
        } else {
            j = j2;
        }
        u83 u83Var4 = this.b0;
        u83Var4.a.o(u83Var4.k.a, this.u);
        return qz1.q(j);
    }

    @Override // defpackage.t33
    public final long l1() {
        g2();
        return X1(this.b0);
    }

    public final void p() {
        g2();
        V1(null);
        qk2 qk2Var = qk2.j;
        long j = this.b0.r;
        new hg1(qk2Var);
    }

    @Override // defpackage.t33
    public final void r1(int i, long j) {
        g2();
        if (i == -1) {
            return;
        }
        hn.v(i >= 0);
        ox0 ox0Var = this.b0.a;
        if (ox0Var.g() || i < ox0Var.a()) {
            z93 z93Var = this.x;
            if (!z93Var.n) {
                q93 q93VarT = z93Var.t();
                z93Var.n = true;
                z93Var.s(q93VarT, -1, new v33(15));
            }
            this.I++;
            if (P1()) {
                s90.Q("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                zk0 zk0Var = new zk0(this.b0);
                zk0Var.b(1);
                p73 p73Var = (p73) this.q.g;
                p73Var.p.d(new u52(p73Var, 12, zk0Var));
                return;
            }
            u83 u83VarD = this.b0;
            int i2 = u83VarD.e;
            if (i2 == 3 || (i2 == 4 && !ox0Var.g())) {
                u83VarD = this.b0.d(2);
            }
            int iK1 = K1();
            u83 u83VarB2 = b2(u83VarD, ox0Var, d2(ox0Var, i, j));
            long jR = qz1.r(j);
            b83 b83Var = this.r;
            b83Var.getClass();
            b83Var.m.a(3, new a83(ox0Var, i, jR)).a();
            Z1(u83VarB2, 0, true, 1, Y1(u83VarB2), iK1);
        }
    }

    @Override // defpackage.t33
    public final int y1() {
        g2();
        return this.b0.e;
    }

    @Override // defpackage.t33
    public final int z1() {
        g2();
        return this.b0.n;
    }
}
