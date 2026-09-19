package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class qb3 {
    public static final Object f0 = new Object();
    public static ScheduledExecutorService g0;
    public static int h0;
    public long A;
    public long B;
    public long C;
    public long D;
    public int E;
    public boolean F;
    public boolean G;
    public long H;
    public float I;
    public ByteBuffer J;
    public int K;
    public ByteBuffer L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public int Q;
    public boolean R;
    public cu1 S;
    public AudioDeviceInfo T;
    public long U;
    public boolean V;
    public Looper W;
    public long X;
    public long Y;
    public Handler Z;
    public final Context a;
    public Context a0;
    public final eb3 b;
    public final boolean b0;
    public final ub3 c;
    public int c0;
    public final ye1 d;
    public final hb3 d0;
    public final tb3 e;
    public final fb3 e0;
    public final qk2 f;
    public final db3 g;
    public final ArrayDeque h;
    public dy2 i;
    public final vl0 j;
    public final vl0 k;
    public final int l;
    public la3 m;
    public bz1 n;
    public gb3 o;
    public gb3 p;
    public ab1 q;
    public AudioTrack r;
    public na3 s;
    public qx1 t;
    public u40 u;
    public qk1 v;
    public jb3 w;
    public jb3 x;
    public up0 y;
    public boolean z;

    public qb3(db2 db2Var) {
        int deviceId;
        Context context = (Context) db2Var.g;
        Context applicationContext = context == null ? null : context.getApplicationContext();
        this.a = applicationContext;
        this.v = qk1.b;
        this.s = applicationContext == null ? (na3) db2Var.h : null;
        this.d0 = (hb3) db2Var.i;
        fb3 fb3Var = (fb3) db2Var.j;
        fb3Var.getClass();
        this.e0 = fb3Var;
        this.g = new db3(new j52(this));
        eb3 eb3Var = new eb3();
        this.b = eb3Var;
        ub3 ub3Var = new ub3();
        ub3Var.m = qz1.b;
        this.c = ub3Var;
        this.d = new ye1();
        this.e = new tb3();
        this.f = vj2.j(ub3Var, eb3Var);
        this.I = 1.0f;
        this.Q = 0;
        this.S = new cu1();
        up0 up0Var = up0.d;
        this.x = new jb3(up0Var, 0L, 0L);
        this.y = up0Var;
        this.z = false;
        this.h = new ArrayDeque();
        this.j = new vl0();
        this.k = new vl0();
        int i = -1;
        if (Build.VERSION.SDK_INT >= 34 && context != null && (deviceId = context.getDeviceId()) != 0 && deviceId != -1) {
            i = deviceId;
        }
        this.l = i;
        this.b0 = true;
    }

    public static boolean l(AudioTrack audioTrack) {
        return Build.VERSION.SDK_INT >= 29 && audioTrack.isOffloadedPlayback();
    }

    public static final AudioTrack n(ya3 ya3Var, qk1 qk1Var, int i, de3 de3Var, Context context) throws ab3 {
        RuntimeException runtimeException;
        try {
            int i2 = ya3Var.b;
            int i3 = ya3Var.c;
            int i4 = ya3Var.a;
            try {
                String str = qz1.a;
                AudioFormat audioFormatBuild = new AudioFormat.Builder().setSampleRate(i2).setChannelMask(i3).setEncoding(i4).build();
                AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(qk1Var.a()).setAudioFormat(audioFormatBuild).setTransferMode(1).setBufferSizeInBytes(ya3Var.e).setSessionId(i);
                int i5 = Build.VERSION.SDK_INT;
                if (i5 >= 29) {
                    try {
                        sessionId.setOffloadedPlayback(ya3Var.d);
                    } catch (IllegalArgumentException e) {
                        e = e;
                        runtimeException = e;
                        throw new ab3(0, ya3Var.b, ya3Var.c, ya3Var.a, ya3Var.e, de3Var, ya3Var.d, runtimeException);
                    } catch (UnsupportedOperationException e2) {
                        e = e2;
                        runtimeException = e;
                        throw new ab3(0, ya3Var.b, ya3Var.c, ya3Var.a, ya3Var.e, de3Var, ya3Var.d, runtimeException);
                    }
                }
                if (i5 >= 34 && context != null) {
                    sessionId.setContext(context);
                }
                AudioTrack audioTrackBuild = sessionId.build();
                int state = audioTrackBuild.getState();
                if (state == 1) {
                    return audioTrackBuild;
                }
                try {
                    audioTrackBuild.release();
                } catch (Exception unused) {
                }
                throw new ab3(state, ya3Var.b, ya3Var.c, ya3Var.a, ya3Var.e, de3Var, ya3Var.d, null);
            } catch (IllegalArgumentException e3) {
                e = e3;
                runtimeException = e;
                throw new ab3(0, ya3Var.b, ya3Var.c, ya3Var.a, ya3Var.e, de3Var, ya3Var.d, runtimeException);
            } catch (UnsupportedOperationException e4) {
                e = e4;
                runtimeException = e;
                throw new ab3(0, ya3Var.b, ya3Var.c, ya3Var.a, ya3Var.e, de3Var, ya3Var.d, runtimeException);
            }
        } catch (IllegalArgumentException e5) {
            e = e5;
        } catch (UnsupportedOperationException e6) {
            e = e6;
        }
    }

    public final void a() {
        t();
        qk2 qk2Var = this.f;
        int i = qk2Var.i;
        for (int i2 = 0; i2 < i; i2++) {
            ((cd1) qk2Var.get(i2)).g();
        }
        this.d.g();
        this.e.g();
        ab1 ab1Var = this.q;
        if (ab1Var != null) {
            int i3 = 0;
            while (true) {
                vj2 vj2Var = ab1Var.a;
                if (i3 >= vj2Var.size()) {
                    break;
                }
                cd1 cd1Var = (cd1) vj2Var.get(i3);
                zb1 zb1Var = zb1.b;
                cd1Var.j();
                cd1Var.g();
                i3++;
            }
            ab1Var.c = new ByteBuffer[0];
            nb1 nb1Var = nb1.e;
            ab1Var.d = false;
        }
        this.P = false;
        this.V = false;
    }

    public final AudioTrack b(gb3 gb3Var) throws ab3 {
        Context context;
        try {
            int i = this.Q;
            int i2 = this.l;
            Context context2 = null;
            if (i2 != -1 && (context = this.a) != null && Build.VERSION.SDK_INT >= 34) {
                if (this.a0 == null) {
                    this.a0 = context.createDeviceContext(i2);
                }
                context2 = this.a0;
                i = 0;
            }
            return n(gb3Var.a(), this.v, i, gb3Var.a, context2);
        } catch (ab3 e) {
            bz1 bz1Var = this.n;
            if (bz1Var != null) {
                bz1Var.i(e);
            }
            throw e;
        }
    }

    public final void c() throws bb3 {
        ByteBuffer byteBuffer;
        f();
        if (this.L != null) {
            return;
        }
        if (!this.q.c()) {
            ByteBuffer byteBuffer2 = this.J;
            if (byteBuffer2 != null) {
                e(byteBuffer2);
                f();
                return;
            }
            return;
        }
        while (!this.q.d()) {
            do {
                ab1 ab1Var = this.q;
                if (ab1Var.c()) {
                    ByteBuffer byteBuffer3 = ab1Var.c[ab1Var.f()];
                    if (byteBuffer3.hasRemaining()) {
                        byteBuffer = byteBuffer3;
                    } else {
                        ab1Var.e(cd1.a);
                        byteBuffer = ab1Var.c[ab1Var.f()];
                    }
                } else {
                    byteBuffer = cd1.a;
                }
                if (byteBuffer.hasRemaining()) {
                    e(byteBuffer);
                    f();
                } else {
                    ByteBuffer byteBuffer4 = this.J;
                    if (byteBuffer4 == null || !byteBuffer4.hasRemaining()) {
                        return;
                    }
                    ab1 ab1Var2 = this.q;
                    ByteBuffer byteBuffer5 = this.J;
                    if (ab1Var2.c() && !ab1Var2.d) {
                        ab1Var2.e(byteBuffer5);
                    }
                }
            } while (this.L == null);
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0042 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:21:0x0043 A[RETURN] */
    public final boolean d() throws bb3 {
        ByteBuffer byteBuffer;
        if (!this.q.c()) {
            f();
            if (this.L == null) {
                return true;
            }
            return false;
        }
        ab1 ab1Var = this.q;
        if (ab1Var.c() && !ab1Var.d) {
            ab1Var.d = true;
            ((cd1) ab1Var.b.get(0)).b();
        }
        c();
        if (!this.q.d() || ((byteBuffer = this.L) != null && byteBuffer.hasRemaining())) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0145 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x0147 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x0149  */
    /* JADX WARN: Code duplicated, block: B:49:0x014d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0151  */
    /* JADX WARN: Code duplicated, block: B:53:0x0155  */
    /* JADX WARN: Code duplicated, block: B:55:0x0159  */
    /* JADX WARN: Code duplicated, block: B:57:0x015d  */
    /* JADX WARN: Code duplicated, block: B:60:0x0179  */
    /* JADX WARN: Code duplicated, block: B:61:0x018c  */
    /* JADX WARN: Code duplicated, block: B:62:0x0199  */
    /* JADX WARN: Code duplicated, block: B:63:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:64:0x01c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:66:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:67:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:68:0x01db  */
    /* JADX WARN: Code duplicated, block: B:73:0x0201  */
    /* JADX WARN: Code duplicated, block: B:79:0x0175 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x01ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x0051 A[SYNTHETIC] */
    public final void e(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        hn.M(this.L == null);
        if (byteBuffer.hasRemaining()) {
            if (this.p.c == 0) {
                int iT = (int) qz1.t(qz1.r(20L), this.p.e, 1000000L, RoundingMode.UP);
                long j = j();
                long j2 = iT;
                if (j < j2) {
                    gb3 gb3Var = this.p;
                    int i12 = gb3Var.g;
                    int i13 = gb3Var.d;
                    ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(byteBuffer.remaining()).order(ByteOrder.nativeOrder());
                    int iPosition = byteBuffer.position();
                    int i14 = (int) j;
                    while (byteBuffer.hasRemaining() && i14 < iT) {
                        if (i12 != 2) {
                            if (i12 == 3) {
                                i3 = (byteBuffer.get() & 255) << 24;
                            } else if (i12 != 4) {
                                if (i12 != 21) {
                                    if (i12 == 22) {
                                        i8 = byteBuffer.get() & 255;
                                        i9 = (byteBuffer.get() & 255) << 8;
                                        i10 = (byteBuffer.get() & 255) << 16;
                                        i11 = (byteBuffer.get() & 255) << 24;
                                    } else if (i12 == 268435456) {
                                        i = (byteBuffer.get() & 255) << 24;
                                        i2 = (byteBuffer.get() & 255) << 16;
                                    } else if (i12 == 1342177280) {
                                        i5 = (byteBuffer.get() & 255) << 24;
                                        i6 = (byteBuffer.get() & 255) << 16;
                                        i7 = (byteBuffer.get() & 255) << 8;
                                    } else {
                                        if (i12 != 1610612736) {
                                            j7.a();
                                            return;
                                        }
                                        i8 = (byteBuffer.get() & 255) << 24;
                                        i9 = (byteBuffer.get() & 255) << 16;
                                        i10 = (byteBuffer.get() & 255) << 8;
                                        i11 = byteBuffer.get() & 255;
                                    }
                                    i3 = i8 | i9 | i10 | i11;
                                } else {
                                    i5 = (byteBuffer.get() & 255) << 8;
                                    i6 = (byteBuffer.get() & 255) << 16;
                                    i7 = (byteBuffer.get() & 255) << 24;
                                }
                                i3 = i5 | i6 | i7;
                            } else {
                                float fMax = Math.max(-1.0f, Math.min(byteBuffer.getFloat(), 1.0f));
                                i3 = (int) (fMax < 0.0f ? (-fMax) * (-2.1474836E9f) : fMax * 2.1474836E9f);
                            }
                            i4 = (int) ((((long) i3) * ((long) i14)) / j2);
                            if (i12 != 2) {
                                byteBufferOrder.put((byte) (i4 >> 16));
                                byteBufferOrder.put((byte) (i4 >> 24));
                            } else if (i12 != 3) {
                                byteBufferOrder.put((byte) (i4 >> 24));
                            } else if (i12 != 4) {
                                if (i12 != 21) {
                                    byteBufferOrder.put((byte) (i4 >> 8));
                                    byteBufferOrder.put((byte) (i4 >> 16));
                                    byteBufferOrder.put((byte) (i4 >> 24));
                                } else if (i12 != 22) {
                                    byteBufferOrder.put((byte) i4);
                                    byteBufferOrder.put((byte) (i4 >> 8));
                                    byteBufferOrder.put((byte) (i4 >> 16));
                                    byteBufferOrder.put((byte) (i4 >> 24));
                                } else if (i12 != 268435456) {
                                    byteBufferOrder.put((byte) (i4 >> 24));
                                    byteBufferOrder.put((byte) (i4 >> 16));
                                } else if (i12 != 1342177280) {
                                    byteBufferOrder.put((byte) (i4 >> 24));
                                    byteBufferOrder.put((byte) (i4 >> 16));
                                    byteBufferOrder.put((byte) (i4 >> 8));
                                } else {
                                    if (i12 == 1610612736) {
                                        j7.a();
                                        return;
                                    }
                                    byteBufferOrder.put((byte) (i4 >> 24));
                                    byteBufferOrder.put((byte) (i4 >> 16));
                                    byteBufferOrder.put((byte) (i4 >> 8));
                                    byteBufferOrder.put((byte) i4);
                                }
                            } else if (i4 < 0) {
                                byteBufferOrder.putFloat((-i4) / (-2.1474836E9f));
                            } else {
                                byteBufferOrder.putFloat(i4 / 2.1474836E9f);
                            }
                            if (byteBuffer.position() == iPosition + i13) {
                                i14++;
                                iPosition = byteBuffer.position();
                            }
                        } else {
                            i = (byteBuffer.get() & 255) << 16;
                            i2 = (byteBuffer.get() & 255) << 24;
                        }
                        i3 = i | i2;
                        i4 = (int) ((((long) i3) * ((long) i14)) / j2);
                        if (i12 != 2) {
                            byteBufferOrder.put((byte) (i4 >> 16));
                            byteBufferOrder.put((byte) (i4 >> 24));
                        } else if (i12 != 3) {
                            byteBufferOrder.put((byte) (i4 >> 24));
                        } else if (i12 != 4) {
                            if (i12 != 21) {
                                byteBufferOrder.put((byte) (i4 >> 8));
                                byteBufferOrder.put((byte) (i4 >> 16));
                                byteBufferOrder.put((byte) (i4 >> 24));
                            } else if (i12 != 22) {
                                byteBufferOrder.put((byte) i4);
                                byteBufferOrder.put((byte) (i4 >> 8));
                                byteBufferOrder.put((byte) (i4 >> 16));
                                byteBufferOrder.put((byte) (i4 >> 24));
                            } else if (i12 != 268435456) {
                                byteBufferOrder.put((byte) (i4 >> 24));
                                byteBufferOrder.put((byte) (i4 >> 16));
                            } else if (i12 != 1342177280) {
                                byteBufferOrder.put((byte) (i4 >> 24));
                                byteBufferOrder.put((byte) (i4 >> 16));
                                byteBufferOrder.put((byte) (i4 >> 8));
                            } else {
                                if (i12 == 1610612736) {
                                    j7.a();
                                    return;
                                }
                                byteBufferOrder.put((byte) (i4 >> 24));
                                byteBufferOrder.put((byte) (i4 >> 16));
                                byteBufferOrder.put((byte) (i4 >> 8));
                                byteBufferOrder.put((byte) i4);
                            }
                        } else if (i4 < 0) {
                            byteBufferOrder.putFloat((-i4) / (-2.1474836E9f));
                        } else {
                            byteBufferOrder.putFloat(i4 / 2.1474836E9f);
                        }
                        if (byteBuffer.position() == iPosition + i13) {
                            i14++;
                            iPosition = byteBuffer.position();
                        }
                    }
                    byteBufferOrder.put(byteBuffer);
                    byteBufferOrder.flip();
                    byteBuffer2 = byteBufferOrder;
                } else {
                    byteBuffer2 = byteBuffer;
                }
            } else {
                byteBuffer2 = byteBuffer;
            }
            this.L = byteBuffer2;
        }
    }

    public final void f() throws bb3 {
        boolean z;
        if (this.L == null) {
            return;
        }
        vl0 vl0Var = this.k;
        boolean z2 = false;
        if (((Exception) vl0Var.h) != null) {
            synchronized (f0) {
                z = h0 > 0;
            }
            if (z || SystemClock.elapsedRealtime() < vl0Var.g) {
                return;
            }
        }
        int iRemaining = this.L.remaining();
        int iWrite = this.r.write(this.L, iRemaining, 1);
        this.U = SystemClock.elapsedRealtime();
        if (iWrite >= 0) {
            vl0Var.h = null;
            vl0Var.f = -9223372036854775807L;
            vl0Var.g = -9223372036854775807L;
            l(this.r);
            int i = this.p.c;
            if (i == 0) {
                this.C += (long) iWrite;
            }
            if (iWrite == iRemaining) {
                if (i != 0) {
                    hn.M(this.L == this.J);
                    this.D = (((long) this.E) * ((long) this.K)) + this.D;
                }
                this.L = null;
                return;
            }
            return;
        }
        if (iWrite == -6 || iWrite == -32) {
            if (j() > 0) {
                z2 = true;
            } else if (l(this.r)) {
                if (this.p.c == 1) {
                    this.V = true;
                }
                z2 = true;
            }
        }
        bb3 bb3Var = new bb3(iWrite, this.p.a, z2);
        bz1 bz1Var = this.n;
        if (bz1Var != null) {
            bz1Var.i(bb3Var);
        }
        if (!bb3Var.g || this.a == null) {
            vl0Var.b(bb3Var);
            return;
        }
        na3 na3Var = na3.c;
        this.s = na3Var;
        this.t.b(na3Var);
        throw bb3Var;
    }

    public final void g(long j) {
        up0 up0Var;
        gb3 gb3Var = this.p;
        int i = gb3Var.c;
        boolean z = false;
        hb3 hb3Var = this.d0;
        if (i == 0) {
            int i2 = gb3Var.a.G;
            up0Var = this.y;
            ne1 ne1Var = (ne1) hb3Var.h;
            float f = up0Var.a;
            ne1Var.getClass();
            hn.v(f > 0.0f);
            if (ne1Var.c != f) {
                ne1Var.c = f;
                ne1Var.i = true;
            }
            float f2 = up0Var.b;
            hn.v(f2 > 0.0f);
            if (ne1Var.d != f2) {
                ne1Var.d = f2;
                ne1Var.i = true;
            }
        } else {
            up0Var = up0.d;
        }
        up0 up0Var2 = up0Var;
        this.y = up0Var2;
        gb3 gb3Var2 = this.p;
        if (gb3Var2.c == 0) {
            int i3 = gb3Var2.a.G;
            z = this.z;
            ((sb3) hb3Var.g).j = z;
        }
        this.z = z;
        this.h.add(new jb3(up0Var2, Math.max(0L, j), qz1.s(this.p.e, j())));
        ab1 ab1Var = this.p.i;
        this.q = ab1Var;
        ab1Var.b(zb1.b);
        bz1 bz1Var = this.n;
        if (bz1Var != null) {
            boolean z2 = this.z;
            un1 un1Var = ((rb3) bz1Var.f).E0;
            Handler handler = (Handler) un1Var.g;
            if (handler != null) {
                handler.post(new c61(un1Var, z2, 4));
            }
        }
    }

    public final boolean h() {
        return this.r != null;
    }

    public final long i() {
        gb3 gb3Var = this.p;
        return gb3Var.c == 0 ? this.A / ((long) gb3Var.b) : this.B;
    }

    public final long j() {
        gb3 gb3Var = this.p;
        if (gb3Var.c != 0) {
            return this.D;
        }
        long j = this.C;
        long j2 = gb3Var.d;
        String str = qz1.a;
        return ((j + j2) - 1) / j2;
    }

    public final void k() {
        Context context;
        na3 na3Var;
        Looper looperMyLooper = Looper.myLooper();
        boolean z = this.t == null || this.W == looperMyLooper;
        Looper looper = this.W;
        String name = looper == null ? "null" : looper.getThread().getName();
        String name2 = looperMyLooper != null ? looperMyLooper.getThread().getName() : "null";
        if (!z) {
            j7.e(jn.E("DefaultAudioSink accessed on multiple threads: %s and %s", name, name2));
            return;
        }
        if (this.t == null && (context = this.a) != null) {
            this.W = looperMyLooper;
            qx1 qx1Var = new qx1(context, new gv1(16, this), this.v, this.T);
            this.t = qx1Var;
            if (qx1Var.f) {
                na3Var = (na3) qx1Var.m;
                na3Var.getClass();
            } else {
                qx1Var.f = true;
                pa3 pa3Var = (pa3) qx1Var.l;
                if (pa3Var != null) {
                    pa3Var.a.registerContentObserver(pa3Var.b, false, pa3Var);
                }
                Context context2 = (Context) qx1Var.g;
                oa3 oa3Var = (oa3) qx1Var.j;
                Handler handler = (Handler) qx1Var.i;
                na1.o(context2).registerAudioDeviceCallback(oa3Var, handler);
                na3 na3VarB = na3.b(context2, context2.registerReceiver((y4) qx1Var.k, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), (qk1) qx1Var.o, (AudioDeviceInfo) qx1Var.n);
                qx1Var.m = na3VarB;
                na3Var = na3VarB;
            }
            this.s = na3Var;
        }
        this.s.getClass();
    }

    public final void m() {
        if (this.N) {
            return;
        }
        this.N = true;
        long j = j();
        db3 db3Var = this.g;
        db3Var.w = db3Var.e();
        db3Var.B.getClass();
        db3Var.u = qz1.r(SystemClock.elapsedRealtime());
        db3Var.x = j;
        if (l(this.r)) {
            this.O = false;
        }
        this.r.stop();
    }

    public final int o(de3 de3Var) {
        k();
        if (!"audio/raw".equals(de3Var.m)) {
            return this.s.c(de3Var, this.v) != null ? 2 : 0;
        }
        int i = de3Var.G;
        if (qz1.a(i)) {
            return i != 2 ? 1 : 2;
        }
        ec.u(new StringBuilder(String.valueOf(i).length() + 22), "Invalid PCM encoding: ", i, "DefaultAudioSink");
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x010c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0113  */
    /* JADX WARN: Code duplicated, block: B:45:0x0119  */
    /* JADX WARN: Code duplicated, block: B:46:0x011b  */
    public final void p(de3 de3Var, int[] iArr) throws za3 {
        int iIntValue;
        ab1 ab1Var;
        int i;
        int iIntValue2;
        int i2;
        int iMax;
        int i3;
        int i4;
        int iC;
        boolean z;
        k();
        String str = de3Var.m;
        int i5 = de3Var.F;
        int i6 = 2;
        if ("audio/raw".equals(str)) {
            int i7 = de3Var.G;
            hn.v(qz1.a(i7));
            int i8 = de3Var.E;
            int iD = qz1.d(i7) * i8;
            sj2 sj2Var = new sj2(4);
            sj2Var.b(this.f);
            sj2Var.a(this.d);
            cd1[] cd1VarArr = (cd1[]) this.d0.f;
            dq.y(cd1VarArr, 2);
            sj2Var.e(2);
            System.arraycopy(cd1VarArr, 0, sj2Var.a, sj2Var.b, 2);
            sj2Var.b += 2;
            ab1 ab1Var2 = new ab1(sj2Var.f());
            if (ab1Var2.equals(this.q)) {
                ab1Var2 = this.q;
            }
            int i9 = de3Var.H;
            int i10 = de3Var.I;
            ub3 ub3Var = this.c;
            ub3Var.i = i9;
            ub3Var.j = i10;
            this.b.i = iArr;
            try {
                nb1 nb1VarA = ab1Var2.a(new nb1(i5, i8, i7));
                int i11 = nb1VarA.c;
                int i12 = nb1VarA.a;
                int i13 = nb1VarA.b;
                int iB = qz1.b(i13);
                int iD2 = qz1.d(i11) * i13;
                i = iD;
                iIntValue = i11;
                i5 = i12;
                iIntValue2 = iB;
                i2 = iD2;
                ab1Var = ab1Var2;
                i6 = 0;
            } catch (jc1 e) {
                throw new za3(e, de3Var);
            }
        } else {
            ab1 ab1Var3 = new ab1(qk2.j);
            qa3 qa3Var = qa3.d;
            Pair pairC = this.s.c(de3Var, this.v);
            if (pairC == null) {
                throw new za3("Unable to configure passthrough for: ".concat(String.valueOf(de3Var)), de3Var);
            }
            iIntValue = ((Integer) pairC.first).intValue();
            ab1Var = ab1Var3;
            i = -1;
            iIntValue2 = ((Integer) pairC.second).intValue();
            i2 = -1;
        }
        if (iIntValue == 0) {
            String strValueOf = String.valueOf(de3Var);
            StringBuilder sb = new StringBuilder(g72.a(i6, 37) + strValueOf.length());
            sb.append("Invalid output encoding (mode=");
            sb.append(i6);
            sb.append(") for: ");
            sb.append(strValueOf);
            throw new za3(sb.toString(), de3Var);
        }
        if (iIntValue2 == 0) {
            String strValueOf2 = String.valueOf(de3Var);
            StringBuilder sb2 = new StringBuilder(g72.a(i6, 43) + strValueOf2.length());
            sb2.append("Invalid output channel config (mode=");
            sb2.append(i6);
            sb2.append(") for: ");
            sb2.append(strValueOf2);
            throw new za3(sb2.toString(), de3Var);
        }
        int i14 = de3Var.i;
        if ("audio/vnd.dts.hd;profile=lbr".equals(de3Var.m) && i14 == -1) {
            i14 = 768000;
        }
        int minBufferSize = AudioTrack.getMinBufferSize(i5, iIntValue2, iIntValue);
        hn.M(minBufferSize != -2);
        int i15 = i2 != -1 ? i2 : 1;
        if (i6 == 0) {
            iIntValue2 = iIntValue2;
            long j = i5;
            long j2 = i15;
            int iV = w40.V(((250000 * j) * j2) / 1000000);
            int iV2 = w40.V(((750000 * j) * j2) / 1000000);
            String str2 = qz1.a;
            iMax = Math.max(iV, Math.min(minBufferSize * 4, iV2));
        } else if (i6 != 1) {
            if (iIntValue == 5) {
                i3 = 500000;
            } else {
                if (iIntValue == 8) {
                    i3 = 1000000;
                    i4 = 8;
                } else {
                    i3 = 250000;
                }
                if (i14 != -1) {
                    RoundingMode roundingMode = RoundingMode.CEILING;
                    iC = hn.x(i14, 8);
                } else {
                    iC = rs0.C(i4);
                    if (iC != -2147483647) {
                        z = true;
                    } else {
                        z = false;
                    }
                    hn.M(z);
                }
                iMax = w40.V((((long) i3) * ((long) iC)) / 1000000);
            }
            i4 = iIntValue;
            if (i14 != -1) {
                RoundingMode roundingMode2 = RoundingMode.CEILING;
                iC = hn.x(i14, 8);
            } else {
                iC = rs0.C(i4);
                if (iC != -2147483647) {
                    z = true;
                } else {
                    z = false;
                }
                hn.M(z);
            }
            iMax = w40.V((((long) i3) * ((long) iC)) / 1000000);
        } else {
            int iC2 = rs0.C(iIntValue);
            hn.M(iC2 != -2147483647);
            iMax = w40.V((((long) iC2) * 50000000) / 1000000);
        }
        int iMax2 = (((Math.max(minBufferSize, iMax) + i15) - 1) / i15) * i15;
        this.V = false;
        gb3 gb3Var = new gb3(de3Var, i, i6, i2, i5, iIntValue2, iIntValue, iMax2, ab1Var);
        if (h()) {
            this.o = gb3Var;
        } else {
            this.p = gb3Var;
        }
    }

    public final void q() {
        this.P = true;
        if (h()) {
            db3 db3Var = this.g;
            if (db3Var.u != -9223372036854775807L) {
                db3Var.B.getClass();
                db3Var.u = qz1.r(SystemClock.elapsedRealtime());
            }
            db3Var.i = qz1.s(db3Var.e, db3Var.e());
            cb3 cb3Var = db3Var.d;
            cb3Var.getClass();
            cb3Var.a(0);
            if (!this.N || l(this.r)) {
                this.r.play();
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:102:0x01a3 A[Catch: ab3 -> 0x0117, TryCatch #4 {ab3 -> 0x0117, blocks: (B:35:0x0077, B:66:0x00ea, B:68:0x00f2, B:70:0x00f8, B:73:0x011a, B:74:0x0134, B:76:0x013a, B:78:0x013e, B:79:0x0140, B:83:0x0149, B:84:0x014a, B:86:0x0153, B:91:0x015a, B:92:0x015b, B:94:0x0181, B:95:0x0188, B:97:0x0191, B:99:0x019a, B:100:0x019f, B:102:0x01a3, B:103:0x01ac, B:105:0x01bd, B:107:0x01cf, B:109:0x01da, B:111:0x01e5, B:113:0x01ed, B:114:0x01f0, B:116:0x01fc, B:60:0x00b0, B:62:0x00b9, B:299:0x05eb, B:300:0x05ee, B:302:0x05f5, B:303:0x05f7, B:38:0x0080, B:39:0x0082, B:47:0x0090, B:306:0x05fa, B:54:0x00a3, B:56:0x00a7, B:59:0x00af, B:64:0x00e3, B:40:0x0083, B:44:0x008a, B:80:0x0141, B:82:0x0145, B:88:0x0157), top: B:317:0x0077, inners: #0, #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x01bd A[Catch: ab3 -> 0x0117, TryCatch #4 {ab3 -> 0x0117, blocks: (B:35:0x0077, B:66:0x00ea, B:68:0x00f2, B:70:0x00f8, B:73:0x011a, B:74:0x0134, B:76:0x013a, B:78:0x013e, B:79:0x0140, B:83:0x0149, B:84:0x014a, B:86:0x0153, B:91:0x015a, B:92:0x015b, B:94:0x0181, B:95:0x0188, B:97:0x0191, B:99:0x019a, B:100:0x019f, B:102:0x01a3, B:103:0x01ac, B:105:0x01bd, B:107:0x01cf, B:109:0x01da, B:111:0x01e5, B:113:0x01ed, B:114:0x01f0, B:116:0x01fc, B:60:0x00b0, B:62:0x00b9, B:299:0x05eb, B:300:0x05ee, B:302:0x05f5, B:303:0x05f7, B:38:0x0080, B:39:0x0082, B:47:0x0090, B:306:0x05fa, B:54:0x00a3, B:56:0x00a7, B:59:0x00af, B:64:0x00e3, B:40:0x0083, B:44:0x008a, B:80:0x0141, B:82:0x0145, B:88:0x0157), top: B:317:0x0077, inners: #0, #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:107:0x01cf A[Catch: ab3 -> 0x0117, TryCatch #4 {ab3 -> 0x0117, blocks: (B:35:0x0077, B:66:0x00ea, B:68:0x00f2, B:70:0x00f8, B:73:0x011a, B:74:0x0134, B:76:0x013a, B:78:0x013e, B:79:0x0140, B:83:0x0149, B:84:0x014a, B:86:0x0153, B:91:0x015a, B:92:0x015b, B:94:0x0181, B:95:0x0188, B:97:0x0191, B:99:0x019a, B:100:0x019f, B:102:0x01a3, B:103:0x01ac, B:105:0x01bd, B:107:0x01cf, B:109:0x01da, B:111:0x01e5, B:113:0x01ed, B:114:0x01f0, B:116:0x01fc, B:60:0x00b0, B:62:0x00b9, B:299:0x05eb, B:300:0x05ee, B:302:0x05f5, B:303:0x05f7, B:38:0x0080, B:39:0x0082, B:47:0x0090, B:306:0x05fa, B:54:0x00a3, B:56:0x00a7, B:59:0x00af, B:64:0x00e3, B:40:0x0083, B:44:0x008a, B:80:0x0141, B:82:0x0145, B:88:0x0157), top: B:317:0x0077, inners: #0, #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:109:0x01da A[Catch: ab3 -> 0x0117, TryCatch #4 {ab3 -> 0x0117, blocks: (B:35:0x0077, B:66:0x00ea, B:68:0x00f2, B:70:0x00f8, B:73:0x011a, B:74:0x0134, B:76:0x013a, B:78:0x013e, B:79:0x0140, B:83:0x0149, B:84:0x014a, B:86:0x0153, B:91:0x015a, B:92:0x015b, B:94:0x0181, B:95:0x0188, B:97:0x0191, B:99:0x019a, B:100:0x019f, B:102:0x01a3, B:103:0x01ac, B:105:0x01bd, B:107:0x01cf, B:109:0x01da, B:111:0x01e5, B:113:0x01ed, B:114:0x01f0, B:116:0x01fc, B:60:0x00b0, B:62:0x00b9, B:299:0x05eb, B:300:0x05ee, B:302:0x05f5, B:303:0x05f7, B:38:0x0080, B:39:0x0082, B:47:0x0090, B:306:0x05fa, B:54:0x00a3, B:56:0x00a7, B:59:0x00af, B:64:0x00e3, B:40:0x0083, B:44:0x008a, B:80:0x0141, B:82:0x0145, B:88:0x0157), top: B:317:0x0077, inners: #0, #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:111:0x01e5 A[Catch: ab3 -> 0x0117, TryCatch #4 {ab3 -> 0x0117, blocks: (B:35:0x0077, B:66:0x00ea, B:68:0x00f2, B:70:0x00f8, B:73:0x011a, B:74:0x0134, B:76:0x013a, B:78:0x013e, B:79:0x0140, B:83:0x0149, B:84:0x014a, B:86:0x0153, B:91:0x015a, B:92:0x015b, B:94:0x0181, B:95:0x0188, B:97:0x0191, B:99:0x019a, B:100:0x019f, B:102:0x01a3, B:103:0x01ac, B:105:0x01bd, B:107:0x01cf, B:109:0x01da, B:111:0x01e5, B:113:0x01ed, B:114:0x01f0, B:116:0x01fc, B:60:0x00b0, B:62:0x00b9, B:299:0x05eb, B:300:0x05ee, B:302:0x05f5, B:303:0x05f7, B:38:0x0080, B:39:0x0082, B:47:0x0090, B:306:0x05fa, B:54:0x00a3, B:56:0x00a7, B:59:0x00af, B:64:0x00e3, B:40:0x0083, B:44:0x008a, B:80:0x0141, B:82:0x0145, B:88:0x0157), top: B:317:0x0077, inners: #0, #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:116:0x01fc A[Catch: ab3 -> 0x0117, TRY_LEAVE, TryCatch #4 {ab3 -> 0x0117, blocks: (B:35:0x0077, B:66:0x00ea, B:68:0x00f2, B:70:0x00f8, B:73:0x011a, B:74:0x0134, B:76:0x013a, B:78:0x013e, B:79:0x0140, B:83:0x0149, B:84:0x014a, B:86:0x0153, B:91:0x015a, B:92:0x015b, B:94:0x0181, B:95:0x0188, B:97:0x0191, B:99:0x019a, B:100:0x019f, B:102:0x01a3, B:103:0x01ac, B:105:0x01bd, B:107:0x01cf, B:109:0x01da, B:111:0x01e5, B:113:0x01ed, B:114:0x01f0, B:116:0x01fc, B:60:0x00b0, B:62:0x00b9, B:299:0x05eb, B:300:0x05ee, B:302:0x05f5, B:303:0x05f7, B:38:0x0080, B:39:0x0082, B:47:0x0090, B:306:0x05fa, B:54:0x00a3, B:56:0x00a7, B:59:0x00af, B:64:0x00e3, B:40:0x0083, B:44:0x008a, B:80:0x0141, B:82:0x0145, B:88:0x0157), top: B:317:0x0077, inners: #0, #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:118:0x0209  */
    /* JADX WARN: Code duplicated, block: B:203:0x03be  */
    /* JADX WARN: Code duplicated, block: B:208:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:209:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:211:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:214:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:216:0x0400  */
    /* JADX WARN: Code duplicated, block: B:302:0x05f5 A[Catch: ab3 -> 0x0117, TryCatch #4 {ab3 -> 0x0117, blocks: (B:35:0x0077, B:66:0x00ea, B:68:0x00f2, B:70:0x00f8, B:73:0x011a, B:74:0x0134, B:76:0x013a, B:78:0x013e, B:79:0x0140, B:83:0x0149, B:84:0x014a, B:86:0x0153, B:91:0x015a, B:92:0x015b, B:94:0x0181, B:95:0x0188, B:97:0x0191, B:99:0x019a, B:100:0x019f, B:102:0x01a3, B:103:0x01ac, B:105:0x01bd, B:107:0x01cf, B:109:0x01da, B:111:0x01e5, B:113:0x01ed, B:114:0x01f0, B:116:0x01fc, B:60:0x00b0, B:62:0x00b9, B:299:0x05eb, B:300:0x05ee, B:302:0x05f5, B:303:0x05f7, B:38:0x0080, B:39:0x0082, B:47:0x0090, B:306:0x05fa, B:54:0x00a3, B:56:0x00a7, B:59:0x00af, B:64:0x00e3, B:40:0x0083, B:44:0x008a, B:80:0x0141, B:82:0x0145, B:88:0x0157), top: B:317:0x0077, inners: #0, #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:311:0x00a3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:316:0x0141 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:325:? A[Catch: ab3 -> 0x0117, SYNTHETIC, TRY_LEAVE, TryCatch #4 {ab3 -> 0x0117, blocks: (B:35:0x0077, B:66:0x00ea, B:68:0x00f2, B:70:0x00f8, B:73:0x011a, B:74:0x0134, B:76:0x013a, B:78:0x013e, B:79:0x0140, B:83:0x0149, B:84:0x014a, B:86:0x0153, B:91:0x015a, B:92:0x015b, B:94:0x0181, B:95:0x0188, B:97:0x0191, B:99:0x019a, B:100:0x019f, B:102:0x01a3, B:103:0x01ac, B:105:0x01bd, B:107:0x01cf, B:109:0x01da, B:111:0x01e5, B:113:0x01ed, B:114:0x01f0, B:116:0x01fc, B:60:0x00b0, B:62:0x00b9, B:299:0x05eb, B:300:0x05ee, B:302:0x05f5, B:303:0x05f7, B:38:0x0080, B:39:0x0082, B:47:0x0090, B:306:0x05fa, B:54:0x00a3, B:56:0x00a7, B:59:0x00af, B:64:0x00e3, B:40:0x0083, B:44:0x008a, B:80:0x0141, B:82:0x0145, B:88:0x0157), top: B:317:0x0077, inners: #0, #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:333:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x00a7 A[Catch: ab3 -> 0x00ac, TryCatch #0 {ab3 -> 0x00ac, blocks: (B:54:0x00a3, B:56:0x00a7, B:59:0x00af), top: B:311:0x00a3, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x00af A[Catch: ab3 -> 0x00ac, TRY_LEAVE, TryCatch #0 {ab3 -> 0x00ac, blocks: (B:54:0x00a3, B:56:0x00a7, B:59:0x00af), top: B:311:0x00a3, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x00f2 A[Catch: ab3 -> 0x0117, TryCatch #4 {ab3 -> 0x0117, blocks: (B:35:0x0077, B:66:0x00ea, B:68:0x00f2, B:70:0x00f8, B:73:0x011a, B:74:0x0134, B:76:0x013a, B:78:0x013e, B:79:0x0140, B:83:0x0149, B:84:0x014a, B:86:0x0153, B:91:0x015a, B:92:0x015b, B:94:0x0181, B:95:0x0188, B:97:0x0191, B:99:0x019a, B:100:0x019f, B:102:0x01a3, B:103:0x01ac, B:105:0x01bd, B:107:0x01cf, B:109:0x01da, B:111:0x01e5, B:113:0x01ed, B:114:0x01f0, B:116:0x01fc, B:60:0x00b0, B:62:0x00b9, B:299:0x05eb, B:300:0x05ee, B:302:0x05f5, B:303:0x05f7, B:38:0x0080, B:39:0x0082, B:47:0x0090, B:306:0x05fa, B:54:0x00a3, B:56:0x00a7, B:59:0x00af, B:64:0x00e3, B:40:0x0083, B:44:0x008a, B:80:0x0141, B:82:0x0145, B:88:0x0157), top: B:317:0x0077, inners: #0, #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x00f8 A[Catch: ab3 -> 0x0117, TryCatch #4 {ab3 -> 0x0117, blocks: (B:35:0x0077, B:66:0x00ea, B:68:0x00f2, B:70:0x00f8, B:73:0x011a, B:74:0x0134, B:76:0x013a, B:78:0x013e, B:79:0x0140, B:83:0x0149, B:84:0x014a, B:86:0x0153, B:91:0x015a, B:92:0x015b, B:94:0x0181, B:95:0x0188, B:97:0x0191, B:99:0x019a, B:100:0x019f, B:102:0x01a3, B:103:0x01ac, B:105:0x01bd, B:107:0x01cf, B:109:0x01da, B:111:0x01e5, B:113:0x01ed, B:114:0x01f0, B:116:0x01fc, B:60:0x00b0, B:62:0x00b9, B:299:0x05eb, B:300:0x05ee, B:302:0x05f5, B:303:0x05f7, B:38:0x0080, B:39:0x0082, B:47:0x0090, B:306:0x05fa, B:54:0x00a3, B:56:0x00a7, B:59:0x00af, B:64:0x00e3, B:40:0x0083, B:44:0x008a, B:80:0x0141, B:82:0x0145, B:88:0x0157), top: B:317:0x0077, inners: #0, #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x013a A[Catch: ab3 -> 0x0117, TryCatch #4 {ab3 -> 0x0117, blocks: (B:35:0x0077, B:66:0x00ea, B:68:0x00f2, B:70:0x00f8, B:73:0x011a, B:74:0x0134, B:76:0x013a, B:78:0x013e, B:79:0x0140, B:83:0x0149, B:84:0x014a, B:86:0x0153, B:91:0x015a, B:92:0x015b, B:94:0x0181, B:95:0x0188, B:97:0x0191, B:99:0x019a, B:100:0x019f, B:102:0x01a3, B:103:0x01ac, B:105:0x01bd, B:107:0x01cf, B:109:0x01da, B:111:0x01e5, B:113:0x01ed, B:114:0x01f0, B:116:0x01fc, B:60:0x00b0, B:62:0x00b9, B:299:0x05eb, B:300:0x05ee, B:302:0x05f5, B:303:0x05f7, B:38:0x0080, B:39:0x0082, B:47:0x0090, B:306:0x05fa, B:54:0x00a3, B:56:0x00a7, B:59:0x00af, B:64:0x00e3, B:40:0x0083, B:44:0x008a, B:80:0x0141, B:82:0x0145, B:88:0x0157), top: B:317:0x0077, inners: #0, #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x0145 A[Catch: all -> 0x0158, TRY_LEAVE, TryCatch #3 {, blocks: (B:80:0x0141, B:82:0x0145, B:88:0x0157), top: B:316:0x0141, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x0153 A[Catch: ab3 -> 0x0117, TRY_LEAVE, TryCatch #4 {ab3 -> 0x0117, blocks: (B:35:0x0077, B:66:0x00ea, B:68:0x00f2, B:70:0x00f8, B:73:0x011a, B:74:0x0134, B:76:0x013a, B:78:0x013e, B:79:0x0140, B:83:0x0149, B:84:0x014a, B:86:0x0153, B:91:0x015a, B:92:0x015b, B:94:0x0181, B:95:0x0188, B:97:0x0191, B:99:0x019a, B:100:0x019f, B:102:0x01a3, B:103:0x01ac, B:105:0x01bd, B:107:0x01cf, B:109:0x01da, B:111:0x01e5, B:113:0x01ed, B:114:0x01f0, B:116:0x01fc, B:60:0x00b0, B:62:0x00b9, B:299:0x05eb, B:300:0x05ee, B:302:0x05f5, B:303:0x05f7, B:38:0x0080, B:39:0x0082, B:47:0x0090, B:306:0x05fa, B:54:0x00a3, B:56:0x00a7, B:59:0x00af, B:64:0x00e3, B:40:0x0083, B:44:0x008a, B:80:0x0141, B:82:0x0145, B:88:0x0157), top: B:317:0x0077, inners: #0, #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x0157 A[Catch: all -> 0x0158, TRY_ENTER, TryCatch #3 {, blocks: (B:80:0x0141, B:82:0x0145, B:88:0x0157), top: B:316:0x0141, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x0181 A[Catch: ab3 -> 0x0117, TryCatch #4 {ab3 -> 0x0117, blocks: (B:35:0x0077, B:66:0x00ea, B:68:0x00f2, B:70:0x00f8, B:73:0x011a, B:74:0x0134, B:76:0x013a, B:78:0x013e, B:79:0x0140, B:83:0x0149, B:84:0x014a, B:86:0x0153, B:91:0x015a, B:92:0x015b, B:94:0x0181, B:95:0x0188, B:97:0x0191, B:99:0x019a, B:100:0x019f, B:102:0x01a3, B:103:0x01ac, B:105:0x01bd, B:107:0x01cf, B:109:0x01da, B:111:0x01e5, B:113:0x01ed, B:114:0x01f0, B:116:0x01fc, B:60:0x00b0, B:62:0x00b9, B:299:0x05eb, B:300:0x05ee, B:302:0x05f5, B:303:0x05f7, B:38:0x0080, B:39:0x0082, B:47:0x0090, B:306:0x05fa, B:54:0x00a3, B:56:0x00a7, B:59:0x00af, B:64:0x00e3, B:40:0x0083, B:44:0x008a, B:80:0x0141, B:82:0x0145, B:88:0x0157), top: B:317:0x0077, inners: #0, #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x0191 A[Catch: ab3 -> 0x0117, TryCatch #4 {ab3 -> 0x0117, blocks: (B:35:0x0077, B:66:0x00ea, B:68:0x00f2, B:70:0x00f8, B:73:0x011a, B:74:0x0134, B:76:0x013a, B:78:0x013e, B:79:0x0140, B:83:0x0149, B:84:0x014a, B:86:0x0153, B:91:0x015a, B:92:0x015b, B:94:0x0181, B:95:0x0188, B:97:0x0191, B:99:0x019a, B:100:0x019f, B:102:0x01a3, B:103:0x01ac, B:105:0x01bd, B:107:0x01cf, B:109:0x01da, B:111:0x01e5, B:113:0x01ed, B:114:0x01f0, B:116:0x01fc, B:60:0x00b0, B:62:0x00b9, B:299:0x05eb, B:300:0x05ee, B:302:0x05f5, B:303:0x05f7, B:38:0x0080, B:39:0x0082, B:47:0x0090, B:306:0x05fa, B:54:0x00a3, B:56:0x00a7, B:59:0x00af, B:64:0x00e3, B:40:0x0083, B:44:0x008a, B:80:0x0141, B:82:0x0145, B:88:0x0157), top: B:317:0x0077, inners: #0, #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x019a A[Catch: ab3 -> 0x0117, TryCatch #4 {ab3 -> 0x0117, blocks: (B:35:0x0077, B:66:0x00ea, B:68:0x00f2, B:70:0x00f8, B:73:0x011a, B:74:0x0134, B:76:0x013a, B:78:0x013e, B:79:0x0140, B:83:0x0149, B:84:0x014a, B:86:0x0153, B:91:0x015a, B:92:0x015b, B:94:0x0181, B:95:0x0188, B:97:0x0191, B:99:0x019a, B:100:0x019f, B:102:0x01a3, B:103:0x01ac, B:105:0x01bd, B:107:0x01cf, B:109:0x01da, B:111:0x01e5, B:113:0x01ed, B:114:0x01f0, B:116:0x01fc, B:60:0x00b0, B:62:0x00b9, B:299:0x05eb, B:300:0x05ee, B:302:0x05f5, B:303:0x05f7, B:38:0x0080, B:39:0x0082, B:47:0x0090, B:306:0x05fa, B:54:0x00a3, B:56:0x00a7, B:59:0x00af, B:64:0x00e3, B:40:0x0083, B:44:0x008a, B:80:0x0141, B:82:0x0145, B:88:0x0157), top: B:317:0x0077, inners: #0, #1, #2, #3 }] */
    public final boolean r(ByteBuffer byteBuffer, long j, int i) throws Throwable {
        boolean z;
        Throwable th;
        boolean z2;
        AudioTrack audioTrackB;
        int i2;
        AudioDeviceInfo audioDeviceInfo;
        qx1 qx1Var;
        int audioSessionId;
        int i3;
        bz1 bz1Var;
        int i4;
        Throwable th2;
        ya3 ya3VarA;
        un1 un1Var;
        Handler handler;
        int i5;
        un1 un1Var2;
        Handler handler2;
        vg2 vg2Var;
        qx1 qx1Var2;
        la3 la3Var;
        AudioTrack audioTrack;
        rz1 rz1Var;
        LogSessionId logSessionId;
        gb3 gb3Var;
        long j2;
        int i6;
        int iH;
        int i7;
        int i8;
        byte b;
        int i9;
        int i10;
        int i11;
        int i12;
        long jS;
        vl0 vl0Var = this.j;
        ByteBuffer byteBuffer2 = this.J;
        hn.v(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.o != null) {
            if (!d()) {
                return false;
            }
            gb3 gb3Var2 = this.o;
            gb3 gb3Var3 = this.p;
            if (gb3Var3.c == gb3Var2.c && gb3Var3.g == gb3Var2.g && gb3Var3.e == gb3Var2.e && gb3Var3.f == gb3Var2.f && gb3Var3.d == gb3Var2.d) {
                this.p = gb3Var2;
                this.o = null;
                AudioTrack audioTrack2 = this.r;
                if (audioTrack2 != null && l(audioTrack2)) {
                    this.p.getClass();
                }
            } else {
                m();
                if (s()) {
                    return false;
                }
                t();
            }
            g(j);
        }
        if (h()) {
            th2 = null;
            i4 = 9;
        } else {
            try {
                if (((Exception) vl0Var.h) == null) {
                    th = null;
                } else {
                    synchronized (f0) {
                        z = h0 > 0;
                    }
                    if (z) {
                        th = null;
                    } else {
                        th = null;
                        if (SystemClock.elapsedRealtime() < vl0Var.g) {
                        }
                        if (z2) {
                            return false;
                        }
                        try {
                            gb3Var = this.p;
                            if (gb3Var == null) {
                                throw th;
                            }
                            audioTrackB = b(gb3Var);
                            this.r = audioTrackB;
                            if (l(audioTrackB)) {
                                AudioTrack audioTrack3 = this.r;
                                if (this.i == null) {
                                    dy2 dy2Var = new dy2();
                                    Objects.requireNonNull(this);
                                    dy2Var.f = this;
                                    dy2Var.g = new Handler(Looper.myLooper());
                                    dy2Var.h = new pb3(dy2Var);
                                    this.i = dy2Var;
                                }
                                dy2 dy2Var2 = this.i;
                                Handler handler3 = (Handler) dy2Var2.g;
                                Objects.requireNonNull(handler3);
                                audioTrack3.registerStreamEventCallback(new fx(handler3, 3), (pb3) dy2Var2.h);
                                this.p.getClass();
                            }
                            i2 = Build.VERSION.SDK_INT;
                            if (i2 >= 31 && (la3Var = this.m) != null) {
                                audioTrack = this.r;
                                synchronized (la3Var) {
                                    rz1Var = la3Var.b;
                                    if (rz1Var == null) {
                                        throw th;
                                    }
                                    logSessionId = (LogSessionId) rz1Var.g;
                                }
                                LogSessionId unused = LogSessionId.LOG_SESSION_ID_NONE;
                                if (!logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                                    audioTrack.setLogSessionId(logSessionId);
                                }
                            }
                            db3 db3Var = this.g;
                            AudioTrack audioTrack4 = this.r;
                            gb3 gb3Var4 = this.p;
                            db3Var.a(audioTrack4, gb3Var4.g, gb3Var4.d, gb3Var4.h, this.b0);
                            this.c0 = 0;
                            if (h()) {
                                this.r.setVolume(this.I);
                            }
                            this.S.getClass();
                            audioDeviceInfo = this.T;
                            if (audioDeviceInfo != null) {
                                this.r.setPreferredDevice(audioDeviceInfo);
                                qx1Var2 = this.t;
                                if (qx1Var2 != null) {
                                    qx1Var2.a(this.T);
                                }
                            }
                            qx1Var = this.t;
                            if (qx1Var != null) {
                                this.u = new u40(this.r, qx1Var);
                            }
                            this.G = true;
                            audioSessionId = this.r.getAudioSessionId();
                            i3 = this.Q;
                            this.Q = audioSessionId;
                            bz1Var = this.n;
                            if (bz1Var != null) {
                                ya3VarA = this.p.a();
                                un1Var = ((rb3) bz1Var.f).E0;
                                handler = (Handler) un1Var.g;
                                if (handler != null) {
                                    handler.post(new ra3(un1Var, ya3VarA, 7));
                                }
                                if (audioSessionId != i3) {
                                    this.R = true;
                                    bz1 bz1Var2 = this.n;
                                    i5 = this.Q;
                                    if (i2 >= 35 && (vg2Var = ((rb3) bz1Var2.f).G0) != null) {
                                        vg2Var.n(i5);
                                    }
                                    un1Var2 = ((rb3) bz1Var2.f).E0;
                                    handler2 = (Handler) un1Var2.g;
                                    if (handler2 != null) {
                                        i4 = 9;
                                        handler2.post(new og(i5, i4, un1Var2));
                                    } else {
                                        i4 = 9;
                                    }
                                } else {
                                    i4 = 9;
                                }
                            } else {
                                i4 = 9;
                            }
                            th2 = th;
                        } catch (ab3 e) {
                            gb3 gb3Var5 = this.p;
                            if (gb3Var5.h > 1000000) {
                                gb3 gb3Var6 = new gb3(gb3Var5.a, gb3Var5.b, gb3Var5.c, gb3Var5.d, gb3Var5.e, gb3Var5.f, gb3Var5.g, 1000000, gb3Var5.i);
                                try {
                                    AudioTrack audioTrackB2 = b(gb3Var6);
                                    this.p = gb3Var6;
                                    audioTrackB = audioTrackB2;
                                } catch (ab3 e2) {
                                    e.addSuppressed(e2);
                                    if (this.p.c == 1) {
                                        throw e;
                                    }
                                    this.V = true;
                                    throw e;
                                }
                            }
                            if (this.p.c == 1) {
                                throw e;
                            }
                            this.V = true;
                            throw e;
                        }
                    }
                    z2 = true;
                    if (z2) {
                        return false;
                    }
                    gb3Var = this.p;
                    if (gb3Var == null) {
                        throw th;
                    }
                    audioTrackB = b(gb3Var);
                    this.r = audioTrackB;
                    if (l(audioTrackB)) {
                        AudioTrack audioTrack5 = this.r;
                        if (this.i == null) {
                            dy2 dy2Var3 = new dy2();
                            Objects.requireNonNull(this);
                            dy2Var3.f = this;
                            dy2Var3.g = new Handler(Looper.myLooper());
                            dy2Var3.h = new pb3(dy2Var3);
                            this.i = dy2Var3;
                        }
                        dy2 dy2Var4 = this.i;
                        Handler handler4 = (Handler) dy2Var4.g;
                        Objects.requireNonNull(handler4);
                        audioTrack5.registerStreamEventCallback(new fx(handler4, 3), (pb3) dy2Var4.h);
                        this.p.getClass();
                    }
                    i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 31) {
                        audioTrack = this.r;
                        synchronized (la3Var) {
                            rz1Var = la3Var.b;
                            if (rz1Var == null) {
                                throw th;
                            }
                            logSessionId = (LogSessionId) rz1Var.g;
                            LogSessionId unused2 = LogSessionId.LOG_SESSION_ID_NONE;
                            if (!logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                                audioTrack.setLogSessionId(logSessionId);
                            }
                        }
                    }
                    db3 db3Var2 = this.g;
                    AudioTrack audioTrack6 = this.r;
                    gb3 gb3Var7 = this.p;
                    db3Var2.a(audioTrack6, gb3Var7.g, gb3Var7.d, gb3Var7.h, this.b0);
                    this.c0 = 0;
                    if (h()) {
                        this.r.setVolume(this.I);
                    }
                    this.S.getClass();
                    audioDeviceInfo = this.T;
                    if (audioDeviceInfo != null) {
                        this.r.setPreferredDevice(audioDeviceInfo);
                        qx1Var2 = this.t;
                        if (qx1Var2 != null) {
                            qx1Var2.a(this.T);
                        }
                    }
                    qx1Var = this.t;
                    if (qx1Var != null) {
                        this.u = new u40(this.r, qx1Var);
                    }
                    this.G = true;
                    audioSessionId = this.r.getAudioSessionId();
                    i3 = this.Q;
                    this.Q = audioSessionId;
                    bz1Var = this.n;
                    if (bz1Var != null) {
                        ya3VarA = this.p.a();
                        un1Var = ((rb3) bz1Var.f).E0;
                        handler = (Handler) un1Var.g;
                        if (handler != null) {
                            handler.post(new ra3(un1Var, ya3VarA, 7));
                        }
                        if (audioSessionId != i3) {
                            this.R = true;
                            bz1 bz1Var3 = this.n;
                            i5 = this.Q;
                            if (i2 >= 35) {
                                vg2Var.n(i5);
                            }
                            un1Var2 = ((rb3) bz1Var3.f).E0;
                            handler2 = (Handler) un1Var2.g;
                            if (handler2 != null) {
                                i4 = 9;
                                handler2.post(new og(i5, i4, un1Var2));
                            } else {
                                i4 = 9;
                            }
                        } else {
                            i4 = 9;
                        }
                    } else {
                        i4 = 9;
                    }
                    th2 = th;
                }
                z2 = false;
                if (z2) {
                    return false;
                }
                gb3Var = this.p;
                if (gb3Var == null) {
                    throw th;
                }
                audioTrackB = b(gb3Var);
                this.r = audioTrackB;
                if (l(audioTrackB)) {
                    AudioTrack audioTrack7 = this.r;
                    if (this.i == null) {
                        dy2 dy2Var5 = new dy2();
                        Objects.requireNonNull(this);
                        dy2Var5.f = this;
                        dy2Var5.g = new Handler(Looper.myLooper());
                        dy2Var5.h = new pb3(dy2Var5);
                        this.i = dy2Var5;
                    }
                    dy2 dy2Var6 = this.i;
                    Handler handler5 = (Handler) dy2Var6.g;
                    Objects.requireNonNull(handler5);
                    audioTrack7.registerStreamEventCallback(new fx(handler5, 3), (pb3) dy2Var6.h);
                    this.p.getClass();
                }
                i2 = Build.VERSION.SDK_INT;
                if (i2 >= 31) {
                    audioTrack = this.r;
                    synchronized (la3Var) {
                        rz1Var = la3Var.b;
                        if (rz1Var == null) {
                            throw th;
                        }
                        logSessionId = (LogSessionId) rz1Var.g;
                        LogSessionId unused3 = LogSessionId.LOG_SESSION_ID_NONE;
                        if (!logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                            audioTrack.setLogSessionId(logSessionId);
                        }
                    }
                }
                db3 db3Var3 = this.g;
                AudioTrack audioTrack8 = this.r;
                gb3 gb3Var8 = this.p;
                db3Var3.a(audioTrack8, gb3Var8.g, gb3Var8.d, gb3Var8.h, this.b0);
                this.c0 = 0;
                if (h()) {
                    this.r.setVolume(this.I);
                }
                this.S.getClass();
                audioDeviceInfo = this.T;
                if (audioDeviceInfo != null) {
                    this.r.setPreferredDevice(audioDeviceInfo);
                    qx1Var2 = this.t;
                    if (qx1Var2 != null) {
                        qx1Var2.a(this.T);
                    }
                }
                qx1Var = this.t;
                if (qx1Var != null) {
                    this.u = new u40(this.r, qx1Var);
                }
                this.G = true;
                audioSessionId = this.r.getAudioSessionId();
                i3 = this.Q;
                this.Q = audioSessionId;
                bz1Var = this.n;
                if (bz1Var != null) {
                    ya3VarA = this.p.a();
                    un1Var = ((rb3) bz1Var.f).E0;
                    handler = (Handler) un1Var.g;
                    if (handler != null) {
                        handler.post(new ra3(un1Var, ya3VarA, 7));
                    }
                    if (audioSessionId != i3) {
                        this.R = true;
                        bz1 bz1Var4 = this.n;
                        i5 = this.Q;
                        if (i2 >= 35) {
                            vg2Var.n(i5);
                        }
                        un1Var2 = ((rb3) bz1Var4.f).E0;
                        handler2 = (Handler) un1Var2.g;
                        if (handler2 != null) {
                            i4 = 9;
                            handler2.post(new og(i5, i4, un1Var2));
                        } else {
                            i4 = 9;
                        }
                    } else {
                        i4 = 9;
                    }
                } else {
                    i4 = 9;
                }
                th2 = th;
            } catch (ab3 e3) {
                if (e3.g) {
                    throw e3;
                }
                vl0Var.b(e3);
                return false;
            }
        }
        vl0Var.h = th2;
        vl0Var.f = -9223372036854775807L;
        vl0Var.g = -9223372036854775807L;
        if (this.G) {
            this.H = Math.max(0L, j);
            this.F = false;
            this.G = false;
            g(j);
            if (this.P) {
                q();
            }
        }
        j();
        AudioTrack audioTrack9 = this.r;
        audioTrack9.getClass();
        int underrunCount = audioTrack9.getUnderrunCount();
        int i13 = this.c0;
        this.c0 = underrunCount;
        if (underrunCount <= i13 || this.n == null) {
            j2 = -9223372036854775807L;
        } else {
            gb3 gb3Var9 = this.p;
            int i14 = gb3Var9.d;
            if (i14 != -1) {
                long j3 = gb3Var9.h / i14;
                AudioTrack audioTrack10 = this.r;
                audioTrack10.getClass();
                jS = qz1.s(audioTrack10.getSampleRate(), j3);
            } else {
                jS = -9223372036854775807L;
            }
            j2 = -9223372036854775807L;
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.U;
            bz1 bz1Var5 = this.n;
            int i15 = this.p.h;
            un1 un1Var3 = ((rb3) bz1Var5.f).E0;
            long jQ = qz1.q(jS);
            Handler handler6 = (Handler) un1Var3.g;
            if (handler6 != null) {
                handler6.post(new ra3(un1Var3, i15, jQ, jElapsedRealtime));
            }
        }
        if (this.J == null) {
            hn.v(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            gb3 gb3Var10 = this.p;
            if (gb3Var10.c != 0 && this.E == 0) {
                int i16 = gb3Var10.g;
                if (i16 == 20) {
                    if ((byteBuffer.get(5) & 2) == 0) {
                        i6 = 0;
                    } else {
                        byte b2 = byteBuffer.get(26);
                        int i17 = 28;
                        int i18 = 28;
                        for (int i19 = 0; i19 < b2; i19++) {
                            i18 += byteBuffer.get(i19 + 27);
                        }
                        byte b3 = byteBuffer.get(i18 + 26);
                        for (int i20 = 0; i20 < b3; i20++) {
                            i17 += byteBuffer.get(i18 + 27 + i20);
                        }
                        i6 = i18 + i17;
                    }
                    int i21 = byteBuffer.get(i6 + 26) + 27 + i6;
                    iH = (int) ((na1.H(byteBuffer.get(i21), byteBuffer.limit() - i21 > 1 ? byteBuffer.get(i21 + 1) : (byte) 0) * 48000) / 1000000);
                } else if (i16 != 30) {
                    switch (i16) {
                        case 5:
                        case 6:
                            if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
                                iH = jn.c[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
                            } else {
                                iH = 1536;
                            }
                            break;
                        case 7:
                        case 8:
                            if (byteBuffer.getInt(0) == -233094848 && byteBuffer.getInt(0) != -398277519) {
                                if (byteBuffer.getInt(0) == 622876772) {
                                    iH = 4096;
                                } else {
                                    int iPosition = byteBuffer.position();
                                    byte b4 = byteBuffer.get(iPosition);
                                    if (b4 != -2) {
                                        if (b4 != -1) {
                                            if (b4 != 31) {
                                                i8 = (byteBuffer.get(iPosition + 4) & 1) << 6;
                                                i9 = byteBuffer.get(iPosition + 5) & 252;
                                            } else {
                                                i8 = (byteBuffer.get(iPosition + 5) & 7) << 4;
                                                b = byteBuffer.get(iPosition + 6);
                                            }
                                            i7 = (i9 >> 2) | i8;
                                        } else {
                                            i8 = (byteBuffer.get(iPosition + 4) & 7) << 4;
                                            b = byteBuffer.get(iPosition + 7);
                                        }
                                        i9 = b & 60;
                                        i7 = (i9 >> 2) | i8;
                                    } else {
                                        i7 = ((byteBuffer.get(iPosition + 5) & 1) << 6) | ((byteBuffer.get(iPosition + 4) & 252) >> 2);
                                    }
                                    iH = (i7 + 1) * 32;
                                }
                            }
                            break;
                        case 9:
                            int iPosition2 = byteBuffer.position();
                            String str = qz1.a;
                            int iReverseBytes = byteBuffer.getInt(iPosition2);
                            if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                                iReverseBytes = Integer.reverseBytes(iReverseBytes);
                            }
                            if ((iReverseBytes & (-2097152)) != -2097152 || (i10 = (iReverseBytes >>> 19) & 3) == 1 || (i11 = (iReverseBytes >>> 17) & 3) == 0) {
                                iH = -1;
                            } else {
                                int i22 = iReverseBytes >>> 12;
                                int i23 = (iReverseBytes >>> 10) & 3;
                                int i24 = i22 & 15;
                                if (i24 == 0 || i24 == 15 || i23 == 3) {
                                    iH = -1;
                                } else {
                                    iH = 1152;
                                    if (i11 != 1) {
                                        if (i11 != 2) {
                                            iH = 384;
                                        }
                                    } else if (i10 != 3) {
                                        iH = 576;
                                    }
                                }
                            }
                            if (iH == -1) {
                                throw new IllegalArgumentException();
                            }
                            break;
                        case 10:
                            iH = 1024;
                            break;
                        case 11:
                        case 12:
                            iH = 2048;
                            break;
                        default:
                            char c = 16;
                            switch (i16) {
                                case 14:
                                    int iPosition3 = byteBuffer.position();
                                    int iLimit = byteBuffer.limit() - 10;
                                    int i25 = iPosition3;
                                    while (true) {
                                        if (i25 <= iLimit) {
                                            String str2 = qz1.a;
                                            int iReverseBytes2 = byteBuffer.getInt(i25 + 4);
                                            char c2 = c;
                                            if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                                                iReverseBytes2 = Integer.reverseBytes(iReverseBytes2);
                                            }
                                            if ((iReverseBytes2 & (-2)) == -126718022) {
                                                i12 = i25 - iPosition3;
                                            } else {
                                                i25++;
                                                c = c2;
                                            }
                                        } else {
                                            i12 = -1;
                                        }
                                    }
                                    if (i12 == -1) {
                                        iH = 0;
                                    } else {
                                        int i26 = byteBuffer.get(byteBuffer.position() + i12 + 7) & 255;
                                        int iPosition4 = byteBuffer.position() + i12;
                                        if (i26 != 187) {
                                            i4 = 8;
                                        }
                                        iH = (40 << ((byteBuffer.get(iPosition4 + i4) >> 4) & 7)) * 16;
                                    }
                                    break;
                                case 15:
                                    iH = 512;
                                    break;
                                case 16:
                                    iH = 1024;
                                    break;
                                case 17:
                                    byte[] bArr = new byte[16];
                                    int iPosition5 = byteBuffer.position();
                                    byteBuffer.get(bArr);
                                    byteBuffer.position(iPosition5);
                                    iH = ar.y(new oe0(16, bArr)).c;
                                    break;
                                case 18:
                                    if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
                                        iH = jn.c[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
                                    } else {
                                        iH = 1536;
                                    }
                                    break;
                                default:
                                    j7.e(ec.j(new StringBuilder(String.valueOf(i16).length() + 27), "Unexpected audio encoding: ", i16));
                                    return false;
                            }
                            break;
                    }
                } else {
                    iH = byteBuffer.getInt(0) == -233094848 ? 1024 : 1024;
                }
                this.E = iH;
                if (iH == 0) {
                    return true;
                }
            }
            if (this.w != null) {
                if (!d()) {
                    return false;
                }
                g(j);
                this.w = null;
            }
            long jS2 = qz1.s(this.p.a.F, i() - this.c.o) + this.H;
            if (!this.F && Math.abs(jS2 - j) > 200000) {
                bz1 bz1Var6 = this.n;
                if (bz1Var6 != null) {
                    StringBuilder sb = new StringBuilder(String.valueOf(jS2).length() + 63 + String.valueOf(j).length());
                    ec.w(sb, "Unexpected audio track timestamp discontinuity: expected ", jS2, ", got ");
                    sb.append(j);
                    bz1Var6.i(new w31(sb.toString()));
                }
                this.F = true;
            }
            if (this.F) {
                if (!d()) {
                    return false;
                }
                long j4 = j - jS2;
                this.H += j4;
                this.F = false;
                g(j);
                bz1 bz1Var7 = this.n;
                if (bz1Var7 != null && j4 != 0) {
                    ((rb3) bz1Var7.f).M0 = true;
                }
            }
            if (this.p.c == 0) {
                this.A += (long) byteBuffer.remaining();
            } else {
                this.B = (((long) this.E) * ((long) i)) + this.B;
            }
            this.J = byteBuffer;
            this.K = i;
        }
        c();
        if (!this.J.hasRemaining()) {
            this.J = null;
            this.K = 0;
            return true;
        }
        db3 db3Var4 = this.g;
        long j5 = j();
        if (db3Var4.v == j2 || j5 <= 0) {
            return false;
        }
        db3Var4.B.getClass();
        if (SystemClock.elapsedRealtime() - db3Var4.v < 200) {
            return false;
        }
        s90.Q("DefaultAudioSink", "Resetting stalled audio track");
        t();
        return true;
    }

    public final boolean s() {
        if (!h()) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 29 && this.r.isOffloadedPlayback() && this.O) {
            return false;
        }
        long j = j();
        long jB = this.g.b();
        AudioTrack audioTrack = this.r;
        audioTrack.getClass();
        int sampleRate = audioTrack.getSampleRate();
        String str = qz1.a;
        return j > qz1.t(jB, (long) sampleRate, 1000000L, RoundingMode.UP);
    }

    public final void t() {
        if (h()) {
            this.A = 0L;
            this.B = 0L;
            this.C = 0L;
            this.D = 0L;
            this.E = 0;
            this.x = new jb3(this.y, 0L, 0L);
            this.H = 0L;
            this.w = null;
            this.h.clear();
            this.J = null;
            this.K = 0;
            this.L = null;
            this.N = false;
            this.M = false;
            this.O = false;
            this.c.o = 0L;
            ab1 ab1Var = this.p.i;
            this.q = ab1Var;
            ab1Var.b(zb1.b);
            db3 db3Var = this.g;
            AudioTrack audioTrack = db3Var.c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                this.r.pause();
            }
            if (l(this.r)) {
                dy2 dy2Var = this.i;
                dy2Var.getClass();
                this.r.unregisterStreamEventCallback((pb3) dy2Var.h);
                ((Handler) dy2Var.g).removeCallbacksAndMessages(null);
            }
            ya3 ya3VarA = this.p.a();
            gb3 gb3Var = this.o;
            if (gb3Var != null) {
                this.p = gb3Var;
                this.o = null;
            }
            db3Var.j = 0L;
            db3Var.t = 0;
            db3Var.s = 0;
            db3Var.k = 0L;
            db3Var.z = -9223372036854775807L;
            db3Var.A = -9223372036854775807L;
            db3Var.h = false;
            db3Var.c = null;
            db3Var.d = null;
            u40 u40Var = this.u;
            if (u40Var != null) {
                ob3 ob3Var = (ob3) u40Var.j;
                ob3Var.getClass();
                ((AudioTrack) u40Var.g).removeOnRoutingChangedListener(ob3Var);
                u40Var.j = null;
                this.u = null;
            }
            AudioTrack audioTrack2 = this.r;
            bz1 bz1Var = this.n;
            Handler handler = new Handler(Looper.myLooper());
            synchronized (f0) {
                try {
                    int i = 1;
                    if (g0 == null) {
                        String str = qz1.a;
                        g0 = Executors.newSingleThreadScheduledExecutor(new ex(i));
                    }
                    h0++;
                    g0.schedule(new e9(audioTrack2, bz1Var, handler, ya3VarA, 7), 20L, TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.r = null;
        }
        vl0 vl0Var = this.k;
        vl0Var.h = null;
        vl0Var.f = -9223372036854775807L;
        vl0Var.g = -9223372036854775807L;
        vl0 vl0Var2 = this.j;
        vl0Var2.h = null;
        vl0Var2.f = -9223372036854775807L;
        vl0Var2.g = -9223372036854775807L;
        this.X = 0L;
        this.Y = 0L;
        Handler handler2 = this.Z;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
    }
}
