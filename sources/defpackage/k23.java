package defpackage;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class k23 implements d83 {
    public static final qk2 p;
    public final ex0 a;
    public final su0 b;
    public final ig3 c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final long k;
    public final long l;
    public final vk2 m;
    public final ConcurrentHashMap n;
    public long o;

    static {
        tj2 tj2Var = vj2.g;
        Object[] objArr = {"file", "content", "data", "android.resource", "rawresource", "asset"};
        dq.y(objArr, 6);
        p = vj2.o(objArr, 6);
    }

    public k23() {
        ig3 ig3Var = new ig3();
        l(1000, 0, "bufferForPlaybackMs", "0");
        l(1000, 0, "bufferForPlaybackForLocalPlaybackMs", "0");
        l(2000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        l(1000, 0, "bufferForPlaybackAfterRebufferForLocalPlaybackMs", "0");
        l(50000, 1000, "minBufferMs", "bufferForPlaybackMs");
        l(1000, 1000, "minBufferForLocalPlaybackMs", "bufferForPlaybackForLocalPlaybackMs");
        l(50000, 2000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        l(1000, 1000, "minBufferForLocalPlaybackMs", "bufferForPlaybackAfterRebufferForLocalPlaybackMs");
        l(50000, 50000, "maxBufferMs", "minBufferMs");
        l(50000, 1000, "maxBufferForLocalPlaybackMs", "minBufferForLocalPlaybackMs");
        l(0, 0, "backBufferDurationMs", "0");
        this.a = new ex0();
        this.b = new su0();
        this.c = ig3Var;
        long jR = qz1.r(50000L);
        this.d = jR;
        long jR2 = qz1.r(1000L);
        this.e = jR2;
        this.f = jR;
        this.g = jR;
        this.h = jR2;
        this.i = jR2;
        this.j = qz1.r(2000L);
        this.k = jR2;
        this.l = qz1.r(0L);
        this.n = new ConcurrentHashMap();
        this.m = vk2.a(vk2.l);
        this.o = -1L;
    }

    public static void l(int i, int i2, String str, String str2) {
        if (i >= i2) {
            return;
        }
        j7.p(jn.E("%s cannot be less than %s", str, str2));
    }

    @Override // defpackage.d83
    public final boolean a(c83 c83Var) {
        int i;
        ConcurrentHashMap concurrentHashMap = this.n;
        la3 la3Var = c83Var.a;
        w13 w13Var = (w13) concurrentHashMap.get(la3Var);
        w13Var.getClass();
        w13 w13Var2 = (w13) this.n.get(la3Var);
        w13Var2.getClass();
        synchronized (w13Var2) {
            i = w13Var2.d;
        }
        int i2 = i * 65536;
        w13 w13Var3 = (w13) this.n.get(la3Var);
        w13Var3.getClass();
        int i3 = w13Var3.c;
        if (la3Var.equals(la3.d)) {
            return i2 < i3;
        }
        boolean zK = k(c83Var);
        long jMin = zK ? this.e : this.d;
        long j = zK ? this.g : this.f;
        float f = c83Var.e;
        if (f > 1.0f) {
            jMin = Math.min(qz1.v(jMin, f), j);
        }
        long j2 = c83Var.d;
        if (j2 < Math.max(jMin, 500000L)) {
            boolean z = zK || i2 < i3;
            w13Var.b = z;
            if (!z && j2 < 500000) {
                s90.Q("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j2 >= j || i2 >= i3) {
            w13Var.b = false;
        }
        return w13Var.b;
    }

    @Override // defpackage.d83
    public final void b(c83 c83Var, bg3[] bg3VarArr) {
        la3 la3Var = c83Var.a;
        Integer num = (Integer) this.m.get(la3Var.a);
        int iIntValue = (num == null || num.intValue() == -1) ? -1 : num.intValue();
        w13 w13Var = (w13) this.n.get(la3Var);
        w13Var.getClass();
        if (iIntValue == -1) {
            boolean zK = k(c83Var);
            int length = bg3VarArr.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                int i3 = 13107200;
                if (i >= length) {
                    break;
                }
                bg3 bg3Var = bg3VarArr[i];
                if (bg3Var != null) {
                    int i4 = bg3Var.a().c;
                    if (i4 != -1) {
                        if (i4 == 0) {
                            i3 = 144310272;
                        } else if (i4 != 1) {
                            if (i4 != 2) {
                                i3 = i4 != 4 ? 131072 : 26214400;
                            } else {
                                i3 = zK ? 19660800 : 131072000;
                            }
                        }
                    }
                    i2 += i3;
                }
                i++;
            }
            iIntValue = Math.max(13107200, i2);
        }
        w13Var.c = iIntValue;
        j();
    }

    @Override // defpackage.d83
    public final void c(la3 la3Var) {
        long id = Thread.currentThread().getId();
        long j = this.o;
        hn.N("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).", j == -1 || j == id);
        this.o = id;
        ConcurrentHashMap concurrentHashMap = this.n;
        w13 w13Var = (w13) concurrentHashMap.get(la3Var);
        if (w13Var == null) {
            w13 w13Var2 = new w13();
            w13Var2.a = 1;
            concurrentHashMap.put(la3Var, w13Var2);
        } else {
            w13Var.a++;
        }
        w13 w13Var3 = (w13) concurrentHashMap.get(la3Var);
        w13Var3.getClass();
        Integer num = (Integer) this.m.get(la3Var.a);
        int iIntValue = (num == null || num.intValue() == -1) ? -1 : num.intValue();
        if (iIntValue == -1) {
            iIntValue = 13107200;
        }
        w13Var3.c = iIntValue;
        w13Var3.b = false;
    }

    @Override // defpackage.d83
    public final long d() {
        return this.l;
    }

    @Override // defpackage.d83
    public final void e(la3 la3Var) {
        ConcurrentHashMap concurrentHashMap = this.n;
        w13 w13Var = (w13) concurrentHashMap.get(la3Var);
        if (w13Var != null) {
            int i = w13Var.a - 1;
            w13Var.a = i;
            if (i == 0) {
                concurrentHashMap.remove(la3Var);
                j();
            }
        }
    }

    @Override // defpackage.d83
    public final boolean f(c83 c83Var) {
        long jMin;
        boolean z;
        int i;
        boolean z2 = c83Var.f;
        long j = c83Var.d;
        float f = c83Var.e;
        boolean zK = k(c83Var);
        long jW = qz1.w(j, f);
        if (z2) {
            if (zK) {
                jMin = this.k;
                z = true;
            } else {
                jMin = this.j;
                z = false;
            }
        } else if (zK) {
            jMin = this.i;
            z = true;
        } else {
            jMin = this.h;
            z = false;
        }
        long j2 = c83Var.g;
        if (j2 != -9223372036854775807L) {
            jMin = Math.min(j2 / 2, jMin);
        }
        if (jMin > 0 && jW < jMin) {
            if (!z) {
                la3 la3Var = c83Var.a;
                w13 w13Var = (w13) this.n.get(la3Var);
                w13Var.getClass();
                synchronized (w13Var) {
                    i = w13Var.d;
                }
                int i2 = i * 65536;
                w13 w13Var2 = (w13) this.n.get(la3Var);
                w13Var2.getClass();
                if (i2 >= w13Var2.c) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.d83
    public final boolean g() {
        Iterator it = this.n.values().iterator();
        while (it.hasNext()) {
            if (((w13) it.next()).b) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.d83
    public final void h(la3 la3Var) {
        ConcurrentHashMap concurrentHashMap = this.n;
        w13 w13Var = (w13) concurrentHashMap.get(la3Var);
        if (w13Var != null) {
            int i = w13Var.a - 1;
            w13Var.a = i;
            if (i == 0) {
                concurrentHashMap.remove(la3Var);
                j();
            }
        }
        if (concurrentHashMap.isEmpty()) {
            this.o = -1L;
        }
    }

    @Override // defpackage.d83
    public final fg3 i(la3 la3Var) {
        return new p83(this, la3Var);
    }

    public final void j() {
        ConcurrentHashMap concurrentHashMap = this.n;
        boolean zIsEmpty = concurrentHashMap.isEmpty();
        ig3 ig3Var = this.c;
        int i = 0;
        if (zIsEmpty) {
            synchronized (ig3Var) {
                ig3Var.b(0);
            }
        } else {
            Iterator it = concurrentHashMap.values().iterator();
            while (it.hasNext()) {
                i += ((w13) it.next()).c;
            }
            ig3Var.b(i);
        }
    }

    public final boolean k(c83 c83Var) {
        ox0 ox0Var = c83Var.b;
        of0 of0Var = ox0Var.b(ox0Var.o(c83Var.c.a, this.b).c, this.a, 0L).b.b;
        if (of0Var == null) {
            return false;
        }
        String scheme = of0Var.a.getScheme();
        return TextUtils.isEmpty(scheme) || p.contains(scheme);
    }
}
