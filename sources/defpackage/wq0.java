package defpackage;

import android.app.Activity;
import android.content.Context;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class wq0 implements vq0 {
    public static volatile nr0 C = null;
    public static final Object D = new Object();
    public static boolean E = false;
    public static long F;
    public static dr0 G;
    public static tr0 H;
    public static ad0 I;
    public static p83 J;
    public static dr0 K;
    public rr0 A;
    public final HashMap B;
    public MotionEvent f;
    public double o;
    public double p;
    public double q;
    public float r;
    public float s;
    public float t;
    public float u;
    public final DisplayMetrics x;
    public final zy1 y;
    public final qk z;
    public final LinkedList g = new LinkedList();
    public long h = 0;
    public long i = 0;
    public long j = 0;
    public long k = 0;
    public long l = 0;
    public long m = 0;
    public long n = 0;
    public boolean v = false;
    public boolean w = false;

    public wq0(Context context, qk qkVar) {
        try {
            iq0.a();
            this.x = context.getResources().getDisplayMetrics();
            if (((Boolean) tu0.e.c.a(lx0.b3)).booleanValue()) {
                this.y = new zy1(13);
            }
        } catch (Throwable unused) {
        }
        this.B = new HashMap();
        this.z = qkVar;
    }

    public static nr0 q(Context context, boolean z) {
        if (C == null) {
            synchronized (D) {
                try {
                    if (C == null) {
                        nr0 nr0VarA = nr0.a(context, z, K);
                        if (nr0VarA.n) {
                            try {
                                if (((Boolean) tu0.e.c.a(lx0.F3)).booleanValue()) {
                                    nr0VarA.c("hTLiiIA7LJpRCIVGwbLw56sBtWYdpFA3KN/lVIAoqlyIo4UMQoQK3mH52LWi8hnG", "S64wW/9/kcrI6i+T76YThiZ/p514KjvGlvxi0Ei4eDg=", new Class[0]);
                                }
                            } catch (IllegalStateException unused) {
                            }
                            nr0VarA.c("Fl0NzymWHJhyDpr9GrhyVi62KX+d2kj13lp1AwiYQHKKCKe1X2FxmeM5KLeNR5D2", "WhU/3eeIEz43+QqYTIKNH8p88w1+Uh4fQMNHsNTU34U=", Context.class);
                            ix0 ix0Var = lx0.N3;
                            tu0 tu0Var = tu0.e;
                            if (((Boolean) tu0Var.c.a(ix0Var)).booleanValue()) {
                                nr0VarA.c("gyMGe4SoPVIhBgFM+VlZQFWek2IoqCotue6ayBNgVb95WbB68suDu+Zv4jWiM6iG", "etp1batKULd2kwg+5GPfxliTu8RjfdN0zKvZOjQe8mU=", new Class[0]);
                            }
                            nr0VarA.c("yCCrg1bENISzqqs7fgrfIgqRoB89Hc58RpoZe38mDWknXggRGBdzPAEdsprm/nAh", "ygsxUks9qSJOiPMXEo9qlLCVVsFNNRfyc6WjXaB0M8U=", Context.class);
                            nr0VarA.c("JC98YOkW1OV00In88Kxh39aoA4/Lc5LugpNahl16Tw21h78xPzCO3AkqsFSMWF+O", "uHu4aeoXgHtmEAr/p8TbphROLjKobmRTgSnNeTPf/24=", Context.class);
                            nr0VarA.c("0k0HoJtCvAtrnTz0UbiSqrs0BGKzSTMoo+ZxCfyJrLcMn8tbsvf/NG2/ui2bKbWP", "z6GzXqyR8kvBYJKVLhMc9mqmsbq6ZkNeWqgTkONnpqg=", Context.class);
                            nr0VarA.c("01PVhP+doaGKdC1W6GrY+2IWUVFKtg3RWpQDin/wN/cS8wkuezVXqSDwZNREySxt", "hY1jxg+6DUCngCe0vbxb4cMsyHNENce67SGKWd6hzv8=", Context.class);
                            Class cls = Boolean.TYPE;
                            nr0VarA.c("8W5EiIZWvw8ca0gdEf2baMelwD0v1LgWFEv6AqIRDGIzRlZJKgzzVYcusXATxgKN", "ZXwHOojdfPkjtU4/T1kRX8Zucxdzz/LL+/XimOcPDrc=", Context.class, cls);
                            nr0VarA.c("f5uC0Q5BJBhs1YfPGy7Wx7MnBjWVUX5JNaW+Lz6dfUOfz0sIXH0KubqvIhiUByWt", "klWlopX/vpRWeyQx7GUjF52wT93EUJwbeMp05ev02yc=", Context.class);
                            nr0VarA.c("Ps5Xy95qN5Bq7sgqC6/M4zZXLDS2M1Isx7H/g2/CV37zoy2ILxNb7iAARKvnhAcR", "UDDHIUrqun7cz3t6d4j2iVVfWcHKtBQnSOoDChOFM5Y=", Context.class);
                            nr0VarA.c("6ZjnfgvB9wgS+Y8hZDivPhgjxRZbCY4q7zFEc6BukViF66w3fH7pDgMpCmaLCsbG", "yV5Ezpu/FJ5eBLvg/Gvr42qBX8KcXLyHBG0rFZzzuBY=", MotionEvent.class, DisplayMetrics.class);
                            nr0VarA.c("0F2tRPtJ+oackwCEaR1ilzSWBDq3birdEdy954kTVJ/3hlaiiP5kh1SmVilvcwVI", "bSUQaKDGEujzsstvFAmuaLuv9mtefCQQKWZn9uZj/LI=", MotionEvent.class, DisplayMetrics.class);
                            nr0VarA.c("6Tbgi6IQESKZikJOpZcClcVJxza1rhAf3nfasZu/vDcTd3loITpTNbH23xjyLA5L", "g107GCb4k6+PXON8scRHoxvRnyAK9ZOpFHjKTWKkbXc=", new Class[0]);
                            nr0VarA.c("VYNLVwJcUVwKHNYqtTAMU2Cbdf8xQvz3Fr3MGMTI+Feinwv11ysZpnAq/2AMk2I1", "XCAdtiyR5t8AMQ7u4CMXLD5NJ9dD+Tw+KRPDn9OS+vQ=", new Class[0]);
                            nr0VarA.c("MMDDWI2IGLmF5pG/RRqJJZVb/JAirVaBalbjWCkub0DwWmFp7b+bfaTjmPK9uiWU", "m1dpreCDNlkoMOYdr+vmzaz+jSmUZiIrETih78jZTqg=", new Class[0]);
                            nr0VarA.c("N+SNt584k90MWn4aBLIhSutg85cYgcNyu+q+5WGRUo/oWkmPivq/1xlEIBG+GcFK", "VOVDFi9LxFQe2QWzKEnmStNUha/UwjqmQV12jeIMYds=", new Class[0]);
                            nr0VarA.c("b8WdxwEW5LYMXGC6g6q07uNIFUV3fs77AEo1YVb/4q/M8KyV69so1cxJ+MsKyWwh", "kazSW9iygMpHEkKh5zVqXBXYRU+noi3Tzu4hpFfxZG4=", new Class[0]);
                            nr0VarA.c("cOth2BAAthu6X8KDmzC58653OwqftcurhEiV9l+3uxMh7KBnOgbdhGM0zSnSPufi", "2EDSTVCwfkpT+1duJ+umEyNIZ3jEP0NWyK78oeLPLhI=", new Class[0]);
                            nr0VarA.c("yYlfo3JOLIfvdgBq3U3deu0pC6YiXdEdqGnVULE/KCllAkaO/XSsVQU+sKDN/uG0", "5ZNtOO3srzHnbl5PLlxEIuHlg0l+6HDun864hT7P5ko=", Context.class, cls, String.class);
                            nr0VarA.c("ffEAQyBH71yR4B2obQT/Qgb3Fo0ajWwFYmmZt2nfIS2fjNh6ir76IWAmhSUkzxpD", "s+erUKEK0AKg0XrZCH85OEIt0v0u2CGPZAaj/S6Q0Yk=", StackTraceElement[].class);
                            nr0VarA.c("UGogIgDf9q+IGA3QKHqW/91b9ZzRTVJqtfmUoLBkD310fwrDg1hJZvDQk8/WK1MH", "sEqRe1gPhw/PwjhUj/qVAEUjKSVJDrXHsmrE44pcjTE=", View.class, DisplayMetrics.class, cls, cls);
                            nr0VarA.c("i1MP+hbN0GtKV+UrtunReVDE3xh08srd5laBoZPswSp8P1i6BkpyGoiKZr6P+aBQ", "NQ1lo07HyX6R6o9xhF+JysjB/gJoli3QRzxLpFE7RH8=", Context.class, cls);
                            nr0VarA.c("YJMz4lZ/SFOXN6kW19UKnvAqcLtndNv4f6er9d24/5MuXcrsMTIC+9Jfbhpe2HMW", "6iuDHA2XEqaGCIdpenyLvoYWzHjKpoW5EjYN40bz5Cs=", View.class, Activity.class, cls);
                            nr0VarA.c("7i2iPrjrwVOXQymI9kbzBw+Saen0JiBKsL25H084g9vqkkZvrS3PC/gXCAaliMdd", "jjLuguQ1TtUBIYvLkWHGRHLEQB49t1f8VaYjdD5pX6Q=", Long.TYPE);
                            nr0VarA.c("zPJzhz1QtGvdwoq8b/etTeYWv9LDeLRPadnOSNl7lohby1/0Z3YfZB4nvs0ev2QM", "fVJK5Q/FtQnQT4sQUZztmOn3k4N5bqyd4pz/QTy2bEo=", new Class[0]);
                            try {
                                if (((Boolean) tu0Var.c.a(lx0.I3)).booleanValue()) {
                                    nr0VarA.c("ExKA4wjDRRYdztAsabUEoV5NOADo4vSkAwQNa4IGw0yLC0NQlDOhDdBTfDT5YHOb", "1Gz3ZRhjJNvXJ0g284S9b/dpVAajMMfg8CE3pBcFNFA=", Context.class);
                                }
                            } catch (IllegalStateException unused2) {
                            }
                            nr0VarA.c("71OvRH8RKLL5CGPm3dKOf5cGs3Y2jxvT4WismqAQzm1qJBvyLIz7vuBnvO3+wiyt", "6gmo4xnyZNalDG+/4eFYRg3H75rhcg0JPASG/y34gQ8=", Context.class);
                            try {
                                if (Build.VERSION.SDK_INT >= 26) {
                                    if (((Boolean) tu0.e.c.a(lx0.J3)).booleanValue()) {
                                        Class cls2 = Long.TYPE;
                                        nr0VarA.c("1MiCMWad12oLn5alnMxHwTvbBZm7RpaUcGFZ/LjrpVbPksWcBk53Qc+euKdOo/dG", "/cnUVQvNHFqi3ggOmiA4o/IdQSFHoegJ/H9a2xERT14=", NetworkCapabilities.class, cls2, cls2);
                                    }
                                }
                            } catch (IllegalStateException unused3) {
                            }
                            try {
                                if (((Boolean) tu0.e.c.a(lx0.b3)).booleanValue()) {
                                    nr0VarA.c("sl6J6ogR1CQFBNHXqYqYlsoHhQEQ3GzqykotbgjuxxtAslvwVDD28XhO/FGDcWNY", "etPaLFHhmzrmC9guV7/txSJ19uqkwWx/gSnrE4vBCvs=", List.class);
                                }
                            } catch (IllegalStateException unused4) {
                            }
                            try {
                                if (((Boolean) tu0.e.c.a(lx0.S2)).booleanValue()) {
                                    Class cls3 = Long.TYPE;
                                    nr0VarA.c("OKoG374XK3cB1cjYFPuO/Bg6vy6AufzuCyu4QCURxkWhJwL4+NqQjs8XziSHB+CQ", "PjHrXBXcXoGkJe75zH8RZ0khapXmOV4o2gX+YgkGdus=", cls3, cls3, cls3, cls3);
                                } else {
                                    try {
                                        if (((Boolean) tu0.e.c.a(lx0.R2)).booleanValue()) {
                                            nr0VarA.c("ykIQv59ak7YBU+e791IU15tGonhZPUUBXST76bDGm7zXSjUSNn9qtHdf61t20THy", "l48tDWlMY/G/BSkitRUvd80RiFbNrk8nR5qlkOsZWs8=", long[].class, Context.class, View.class);
                                        }
                                    } catch (IllegalStateException unused5) {
                                    }
                                }
                            } catch (IllegalStateException unused6) {
                            }
                        }
                        C = nr0VarA;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return C;
    }

    public static or0 r(nr0 nr0Var, MotionEvent motionEvent, DisplayMetrics displayMetrics) throws hr0 {
        Method methodD = nr0Var.d("6ZjnfgvB9wgS+Y8hZDivPhgjxRZbCY4q7zFEc6BukViF66w3fH7pDgMpCmaLCsbG", "yV5Ezpu/FJ5eBLvg/Gvr42qBX8KcXLyHBG0rFZzzuBY=");
        if (methodD == null || motionEvent == null) {
            throw new hr0();
        }
        try {
            return new or0((String) methodD.invoke(null, motionEvent, displayMetrics));
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new hr0(e);
        }
    }

    public static final void t(List list) {
        ExecutorService executorService;
        if (C == null || (executorService = C.b) == null || list.isEmpty()) {
            return;
        }
        try {
            executorService.invokeAll(list, ((Long) tu0.e.c.a(lx0.N2)).longValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            char[] cArr = pr0.a;
            StringWriter stringWriter = new StringWriter();
            e.printStackTrace(new PrintWriter(stringWriter));
            Log.d("wq0", "class methods got exception: " + stringWriter.toString());
        }
    }

    @Override // defpackage.vq0
    public final synchronized void a(int i, int i2, int i3) {
        try {
            if (this.f != null) {
                if (((Boolean) tu0.e.c.a(lx0.K2)).booleanValue()) {
                    o();
                } else {
                    this.f.recycle();
                }
            }
            DisplayMetrics displayMetrics = this.x;
            if (displayMetrics != null) {
                float f = displayMetrics.density;
                this.f = MotionEvent.obtain(0L, i3, 1, i * f, i2 * f, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
            } else {
                this.f = null;
            }
            this.w = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.vq0
    public final String b(Context context) {
        return "19";
    }

    @Override // defpackage.vq0
    public final void c(StackTraceElement[] stackTraceElementArr) {
        zy1 zy1Var;
        if (!((Boolean) tu0.e.c.a(lx0.b3)).booleanValue() || (zy1Var = this.y) == null) {
            return;
        }
        zy1Var.g = new ArrayList(Arrays.asList(stackTraceElementArr));
    }

    @Override // defpackage.vq0
    public final String d(Context context) {
        char[] cArr = pr0.a;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return p(context, null, 1, null, null);
        }
        j7.e("The caller must not be called from the UI thread.");
        return null;
    }

    @Override // defpackage.vq0
    public final void e(View view) {
        if (((Boolean) tu0.e.c.a(lx0.Q2)).booleanValue()) {
            if (this.A == null) {
                nr0 nr0Var = C;
                this.A = new rr0(nr0Var.a, nr0Var.o);
            }
            this.A.a(view);
        }
    }

    @Override // defpackage.vq0
    public final synchronized void f(MotionEvent motionEvent) {
        Long l;
        try {
            if (this.v) {
                o();
                this.v = false;
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                this.o = 0.0d;
                this.p = motionEvent.getRawX();
                this.q = motionEvent.getRawY();
            } else if (action == 1 || action == 2) {
                double rawX = motionEvent.getRawX();
                double rawY = motionEvent.getRawY();
                double d = rawX - this.p;
                double d2 = rawY - this.q;
                this.o += Math.sqrt((d2 * d2) + (d * d));
                this.p = rawX;
                this.q = rawY;
            }
            int action2 = motionEvent.getAction();
            if (action2 != 0) {
                try {
                    if (action2 == 1) {
                        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                        this.f = motionEventObtain;
                        LinkedList linkedList = this.g;
                        linkedList.add(motionEventObtain);
                        if (linkedList.size() > 6) {
                            ((MotionEvent) linkedList.remove()).recycle();
                        }
                        this.j++;
                        this.l = n(new Throwable().getStackTrace());
                    } else if (action2 == 2) {
                        this.i += (long) (motionEvent.getHistorySize() + 1);
                        or0 or0VarM = m(motionEvent);
                        Long l2 = or0VarM.v;
                        if (l2 != null && or0VarM.y != null) {
                            this.m = l2.longValue() + or0VarM.y.longValue() + this.m;
                        }
                        if (this.x != null && (l = or0VarM.w) != null && or0VarM.z != null) {
                            this.n = l.longValue() + or0VarM.z.longValue() + this.n;
                        }
                    } else if (action2 == 3) {
                        this.k++;
                    }
                } catch (hr0 unused) {
                }
            } else {
                this.r = motionEvent.getX();
                this.s = motionEvent.getY();
                this.t = motionEvent.getRawX();
                this.u = motionEvent.getRawY();
                this.h++;
            }
            this.w = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.vq0
    public final String g(Context context, String str, View view) {
        return p(context, str, 3, view, null);
    }

    @Override // defpackage.vq0
    public final String h(Context context, String str, View view, Activity activity) {
        return p(context, str, 3, view, activity);
    }

    @Override // defpackage.vq0
    public final String i(Context context, View view, Activity activity) {
        return p(context, null, 2, view, activity);
    }

    public final hp0 j(Context context) {
        int i;
        long j;
        long j2;
        tr0 tr0Var = H;
        if (tr0Var != null && tr0Var.d) {
            tr0Var.b = System.currentTimeMillis();
        }
        ix0 ix0Var = lx0.S2;
        tu0 tu0Var = tu0.e;
        kx0 kx0Var = tu0Var.c;
        kx0 kx0Var2 = tu0Var.c;
        if (((Boolean) kx0Var.a(ix0Var)).booleanValue()) {
            ad0 ad0Var = I;
            ad0Var.b = ad0Var.a;
            ad0Var.a = SystemClock.uptimeMillis();
        }
        hp0 hp0VarB0 = sp0.B0();
        qk qkVar = this.z;
        String str = (String) qkVar.g;
        if (!TextUtils.isEmpty(str)) {
            hp0VarB0.b();
            ((sp0) hp0VarB0.g).E0(str);
        }
        nr0 nr0VarQ = q(context, qkVar.f);
        if (nr0VarQ.b == null) {
            return hp0VarB0;
        }
        int iE = nr0VarQ.e();
        ArrayList arrayList = new ArrayList();
        if (nr0VarQ.n) {
            arrayList.add(new wr0(nr0VarQ, hp0VarB0, iE, context, (ap0) qkVar.h, J));
            arrayList.add(new yr0(nr0VarQ, hp0VarB0, F, i));
            arrayList.add(new xr0(nr0VarQ, hp0VarB0, i, 3));
            arrayList.add(new ur0(nr0VarQ, hp0VarB0, i, context));
            arrayList.add(new xr0(nr0VarQ, hp0VarB0, i, 4));
            arrayList.add(new vr0(nr0VarQ, hp0VarB0, i, context));
            arrayList.add(new xr0(nr0VarQ, hp0VarB0, i, 7));
            arrayList.add(new xr0(nr0VarQ, hp0VarB0, i, 9));
            arrayList.add(new xr0(nr0VarQ, hp0VarB0, i, 10));
            arrayList.add(new xr0(nr0VarQ, hp0VarB0, i, 0));
            arrayList.add(new xr0(nr0VarQ, hp0VarB0, i, 2));
            arrayList.add(new xr0(nr0VarQ, hp0VarB0, i, 13));
            arrayList.add(new xr0(nr0VarQ, hp0VarB0, i, 6));
            arrayList.add(new xr0(nr0VarQ, hp0VarB0, i, 12));
            arrayList.add(new gs0(nr0VarQ, hp0VarB0, i));
            if (((Boolean) kx0Var2.a(lx0.J3)).booleanValue()) {
                tr0 tr0Var2 = H;
                long j3 = -1;
                if (tr0Var2 != null) {
                    if (tr0Var2.d) {
                        i = iE;
                        j2 = tr0Var2.b - tr0Var2.a;
                    } else {
                        i = iE;
                        j2 = -1;
                    }
                    long j4 = tr0Var2.c;
                    tr0Var2.c = -1L;
                    j3 = j2;
                    j = j4;
                } else {
                    i = iE;
                    j = -1;
                }
                fs0 fs0Var = new fs0(nr0VarQ, hp0VarB0, i, G, j3, j);
                i = i;
                arrayList.add(fs0Var);
            }
            i = iE;
            if (((Boolean) kx0Var2.a(lx0.I3)).booleanValue()) {
                arrayList.add(new xr0(nr0VarQ, hp0VarB0, i, 11));
            }
            xr0 xr0Var = new xr0(nr0VarQ, "71OvRH8RKLL5CGPm3dKOf5cGs3Y2jxvT4WismqAQzm1qJBvyLIz7vuBnvO3+wiyt", "6gmo4xnyZNalDG+/4eFYRg3H75rhcg0JPASG/y34gQ8=", hp0VarB0, i, 76, 8);
            hp0VarB0 = hp0VarB0;
            arrayList.add(xr0Var);
            if (((Boolean) kx0Var2.a(lx0.M3)).booleanValue()) {
                arrayList.add(new xr0(nr0VarQ, hp0VarB0, i, 5));
            }
            if (((Boolean) kx0Var2.a(lx0.N3)).booleanValue()) {
                xr0 xr0Var2 = new xr0(nr0VarQ, "gyMGe4SoPVIhBgFM+VlZQFWek2IoqCotue6ayBNgVb95WbB68suDu+Zv4jWiM6iG", "etp1batKULd2kwg+5GPfxliTu8RjfdN0zKvZOjQe8mU=", hp0VarB0, i, 82, 1);
                hp0VarB0 = hp0VarB0;
                arrayList.add(xr0Var2);
            }
        } else {
            hp0VarB0.g(16384L);
        }
        t(arrayList);
        return hp0VarB0;
    }

    public final hp0 k(Context context, View view, Activity activity) {
        tr0 tr0Var = H;
        if (tr0Var != null && tr0Var.d) {
            tr0Var.b = System.currentTimeMillis();
        }
        if (((Boolean) tu0.e.c.a(lx0.S2)).booleanValue()) {
            ad0 ad0Var = I;
            ad0Var.h = ad0Var.g;
            ad0Var.g = SystemClock.uptimeMillis();
        }
        hp0 hp0VarB0 = sp0.B0();
        qk qkVar = this.z;
        String str = (String) qkVar.g;
        if (!TextUtils.isEmpty(str)) {
            hp0VarB0.b();
            ((sp0) hp0VarB0.g).E0(str);
        }
        s(q(context, qkVar.f), hp0VarB0, view, activity, true, context);
        return hp0VarB0;
    }

    public final hp0 l(Context context, View view, Activity activity) {
        tr0 tr0Var = H;
        if (tr0Var != null && tr0Var.d) {
            tr0Var.b = System.currentTimeMillis();
        }
        if (((Boolean) tu0.e.c.a(lx0.S2)).booleanValue()) {
            I.b(context, view);
        }
        hp0 hp0VarB0 = sp0.B0();
        qk qkVar = this.z;
        String str = (String) qkVar.g;
        hp0VarB0.b();
        ((sp0) hp0VarB0.g).E0(str);
        s(q(context, qkVar.f), hp0VarB0, view, activity, false, context);
        return hp0VarB0;
    }

    public final or0 m(MotionEvent motionEvent) throws hr0 {
        Method methodD = C.d("0F2tRPtJ+oackwCEaR1ilzSWBDq3birdEdy954kTVJ/3hlaiiP5kh1SmVilvcwVI", "bSUQaKDGEujzsstvFAmuaLuv9mtefCQQKWZn9uZj/LI=");
        if (methodD == null || motionEvent == null) {
            throw new hr0();
        }
        try {
            return new or0((String) methodD.invoke(null, motionEvent, this.x));
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new hr0(e);
        }
    }

    public final long n(StackTraceElement[] stackTraceElementArr) throws hr0 {
        Method methodD = C.d("ffEAQyBH71yR4B2obQT/Qgb3Fo0ajWwFYmmZt2nfIS2fjNh6ir76IWAmhSUkzxpD", "s+erUKEK0AKg0XrZCH85OEIt0v0u2CGPZAaj/S6Q0Yk=");
        if (methodD == null || stackTraceElementArr == null) {
            throw new hr0();
        }
        try {
            return new cr0((String) methodD.invoke(null, stackTraceElementArr)).t.longValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new hr0(e);
        }
    }

    public final void o() {
        this.l = 0L;
        this.h = 0L;
        this.i = 0L;
        this.j = 0L;
        this.k = 0L;
        this.m = 0L;
        this.n = 0L;
        LinkedList linkedList = this.g;
        if (linkedList.isEmpty()) {
            MotionEvent motionEvent = this.f;
            if (motionEvent != null) {
                motionEvent.recycle();
            }
        } else {
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                ((MotionEvent) it.next()).recycle();
            }
            linkedList.clear();
        }
        this.f = null;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0080  */
    /* JADX WARN: Code duplicated, block: B:41:0x0084 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0086  */
    /* JADX WARN: Code duplicated, block: B:43:0x0089  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:50:0x00aa A[Catch: Exception -> 0x0103, TryCatch #4 {Exception -> 0x0103, blocks: (B:47:0x009d, B:50:0x00aa, B:52:0x00bc, B:54:0x00de, B:63:0x00f6, B:53:0x00d4, B:66:0x0107), top: B:87:0x009d }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00bc A[Catch: Exception -> 0x0103, TryCatch #4 {Exception -> 0x0103, blocks: (B:47:0x009d, B:50:0x00aa, B:52:0x00bc, B:54:0x00de, B:63:0x00f6, B:53:0x00d4, B:66:0x0107), top: B:87:0x009d }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00d4 A[Catch: Exception -> 0x0103, TryCatch #4 {Exception -> 0x0103, blocks: (B:47:0x009d, B:50:0x00aa, B:52:0x00bc, B:54:0x00de, B:63:0x00f6, B:53:0x00d4, B:66:0x0107), top: B:87:0x009d }] */
    /* JADX WARN: Code duplicated, block: B:87:0x009d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final String p(Context context, String str, int i, View view, Activity activity) {
        uq0 uq0Var;
        String str2;
        int i2;
        Exception exc;
        hp0 hp0VarJ;
        int i3;
        int i4;
        long jCurrentTimeMillis;
        int i5;
        dq0 dq0VarB;
        byte[] bArrB;
        String strEncodeToString;
        int i6;
        int i7;
        int i8 = i;
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        boolean zBooleanValue = ((Boolean) tu0.e.c.a(lx0.M2)).booleanValue();
        if (zBooleanValue) {
            uq0Var = C != null ? C.k : null;
            str2 = "be";
        } else {
            uq0Var = null;
            str2 = null;
        }
        try {
            if (i8 == 3) {
                hp0VarJ = k(context, view, activity);
                try {
                    this.v = true;
                    i7 = 1002;
                } catch (Exception e) {
                    exc = e;
                    i2 = 3;
                    if (zBooleanValue) {
                        if (i8 == i2) {
                            i4 = 1003;
                        } else {
                            if (i8 == 2) {
                                i4 = 1009;
                            } else {
                                i3 = 1001;
                                i8 = 1;
                            }
                            uq0Var.a(i3, -1, System.currentTimeMillis() - jCurrentTimeMillis2, str2, exc);
                        }
                        i3 = i4;
                        uq0Var.a(i3, -1, System.currentTimeMillis() - jCurrentTimeMillis2, str2, exc);
                    }
                    jCurrentTimeMillis = System.currentTimeMillis();
                    if (hp0VarJ != null) {
                        try {
                            if (((sp0) hp0VarJ.c()).d(null) == 0) {
                                sp0 sp0Var = (sp0) hp0VarJ.c();
                                boolean z = iq0.a;
                                dq0VarB = iq0.b(str, sp0Var.b());
                                if (dq0VarB == null) {
                                    hp0 hp0VarB0 = sp0.B0();
                                    hp0VarB0.g(4096L);
                                    bArrB = iq0.d(((sp0) hp0VarB0.c()).b(), str, true);
                                } else {
                                    bArrB = ((eq0) dq0VarB.c()).b();
                                }
                                strEncodeToString = Base64.encodeToString(bArrB, 11);
                                return !zBooleanValue ? strEncodeToString : strEncodeToString;
                            }
                        } catch (Exception e2) {
                            String string = Integer.toString(7);
                            if (!zBooleanValue || uq0Var == null) {
                                return string;
                            }
                            if (i8 == i2) {
                                i5 = 1007;
                            } else {
                                i5 = i8 == 2 ? 1011 : 1005;
                            }
                            uq0Var.a(i5, -1, System.currentTimeMillis() - jCurrentTimeMillis, str2, e2);
                            return string;
                        }
                    }
                    return Integer.toString(5);
                }
            } else if (i8 == 2) {
                hp0VarJ = l(context, view, activity);
                i7 = 1008;
            } else {
                hp0VarJ = j(context);
                i7 = 1000;
            }
            if (!zBooleanValue || uq0Var == null) {
                i2 = 3;
            } else {
                try {
                    i2 = 3;
                    try {
                        uq0Var.a(i7, -1, System.currentTimeMillis() - jCurrentTimeMillis2, str2, null);
                    } catch (Exception e3) {
                        e = e3;
                        exc = e;
                        if (zBooleanValue && uq0Var != null) {
                            if (i8 == i2) {
                                i4 = 1003;
                            } else {
                                if (i8 == 2) {
                                    i4 = 1009;
                                } else {
                                    i3 = 1001;
                                    i8 = 1;
                                }
                                uq0Var.a(i3, -1, System.currentTimeMillis() - jCurrentTimeMillis2, str2, exc);
                            }
                            i3 = i4;
                            uq0Var.a(i3, -1, System.currentTimeMillis() - jCurrentTimeMillis2, str2, exc);
                        }
                    }
                } catch (Exception e4) {
                    e = e4;
                    i2 = 3;
                }
            }
        } catch (Exception e5) {
            i2 = 3;
            exc = e5;
            hp0VarJ = null;
        }
        jCurrentTimeMillis = System.currentTimeMillis();
        if (hp0VarJ != null) {
            if (((sp0) hp0VarJ.c()).d(null) == 0) {
                sp0 sp0Var2 = (sp0) hp0VarJ.c();
                boolean z2 = iq0.a;
                dq0VarB = iq0.b(str, sp0Var2.b());
                if (dq0VarB == null) {
                    hp0 hp0VarB1 = sp0.B0();
                    hp0VarB1.g(4096L);
                    bArrB = iq0.d(((sp0) hp0VarB1.c()).b(), str, true);
                } else {
                    bArrB = ((eq0) dq0VarB.c()).b();
                }
                strEncodeToString = Base64.encodeToString(bArrB, 11);
                if (!zBooleanValue && uq0Var != null) {
                    if (i8 == i2) {
                        i6 = 1006;
                    } else {
                        i6 = i8 == 2 ? 1010 : 1004;
                    }
                    uq0Var.a(i6, -1, System.currentTimeMillis() - jCurrentTimeMillis, str2, null);
                    return strEncodeToString;
                }
            }
        }
        return Integer.toString(5);
    }

    public final void s(nr0 nr0Var, hp0 hp0Var, View view, Activity activity, boolean z, Context context) {
        ArrayList arrayList;
        Context context2;
        long j;
        long j2;
        MotionEvent motionEvent;
        List listAsList;
        int i = 1;
        if (nr0Var.n) {
            synchronized (this) {
                try {
                    try {
                        or0 or0VarR = r(nr0Var, this.f, this.x);
                        Long l = or0VarR.s;
                        if (l != null) {
                            long jLongValue = l.longValue();
                            hp0Var.b();
                            ((sp0) hp0Var.g).K0(jLongValue);
                        }
                        Long l2 = or0VarR.t;
                        if (l2 != null) {
                            long jLongValue2 = l2.longValue();
                            hp0Var.b();
                            ((sp0) hp0Var.g).L0(jLongValue2);
                        }
                        Long l3 = or0VarR.u;
                        if (l3 != null) {
                            long jLongValue3 = l3.longValue();
                            hp0Var.b();
                            ((sp0) hp0Var.g).M0(jLongValue3);
                        }
                        if (this.w) {
                            Long l4 = or0VarR.v;
                            if (l4 != null) {
                                long jLongValue4 = l4.longValue();
                                hp0Var.b();
                                ((sp0) hp0Var.g).F(jLongValue4);
                            }
                            Long l5 = or0VarR.w;
                            if (l5 != null) {
                                long jLongValue5 = l5.longValue();
                                hp0Var.b();
                                ((sp0) hp0Var.g).G(jLongValue5);
                            }
                        }
                    } catch (hr0 unused) {
                    }
                    op0 op0VarZ = pp0.z();
                    if (this.h > 0) {
                        DisplayMetrics displayMetrics = this.x;
                        char[] cArr = pr0.a;
                        if ((displayMetrics == null || displayMetrics.density == 0.0f) ? false : true) {
                            long jB = pr0.b(this.o, displayMetrics);
                            op0VarZ.b();
                            ((pp0) op0VarZ.g).L(jB);
                            long jB2 = pr0.b(this.t - this.r, this.x);
                            op0VarZ.b();
                            ((pp0) op0VarZ.g).M(jB2);
                            long jB3 = pr0.b(this.u - this.s, this.x);
                            op0VarZ.b();
                            ((pp0) op0VarZ.g).N(jB3);
                            long jB4 = pr0.b(this.r, this.x);
                            op0VarZ.b();
                            ((pp0) op0VarZ.g).Q(jB4);
                            long jB5 = pr0.b(this.s, this.x);
                            op0VarZ.b();
                            ((pp0) op0VarZ.g).R(jB5);
                            if (this.w && (motionEvent = this.f) != null) {
                                long jB6 = pr0.b(((this.r - this.t) + motionEvent.getRawX()) - this.f.getX(), this.x);
                                if (jB6 != 0) {
                                    op0VarZ.b();
                                    ((pp0) op0VarZ.g).O(jB6);
                                }
                                long jB7 = pr0.b(((this.s - this.u) + this.f.getRawY()) - this.f.getY(), this.x);
                                if (jB7 != 0) {
                                    op0VarZ.b();
                                    ((pp0) op0VarZ.g).P(jB7);
                                }
                            }
                        }
                    }
                    try {
                        or0 or0VarM = m(this.f);
                        Long l6 = or0VarM.s;
                        if (l6 != null) {
                            long jLongValue6 = l6.longValue();
                            op0VarZ.b();
                            ((pp0) op0VarZ.g).A(jLongValue6);
                        }
                        Long l7 = or0VarM.t;
                        if (l7 != null) {
                            long jLongValue7 = l7.longValue();
                            op0VarZ.b();
                            ((pp0) op0VarZ.g).B(jLongValue7);
                        }
                        long jLongValue8 = or0VarM.u.longValue();
                        op0VarZ.b();
                        ((pp0) op0VarZ.g).H(jLongValue8);
                        if (this.w) {
                            Long l8 = or0VarM.w;
                            if (l8 != null) {
                                long jLongValue9 = l8.longValue();
                                op0VarZ.b();
                                ((pp0) op0VarZ.g).C(jLongValue9);
                            }
                            Long l9 = or0VarM.v;
                            if (l9 != null) {
                                long jLongValue10 = l9.longValue();
                                op0VarZ.b();
                                ((pp0) op0VarZ.g).F(jLongValue10);
                            }
                            Long l10 = or0VarM.x;
                            if (l10 != null) {
                                int i2 = l10.longValue() != 0 ? 2 : 1;
                                op0VarZ.b();
                                ((pp0) op0VarZ.g).S(i2);
                            }
                            long j3 = this.i;
                            if (j3 > 0) {
                                DisplayMetrics displayMetrics2 = this.x;
                                char[] cArr2 = pr0.a;
                                Long lValueOf = displayMetrics2 != null && (displayMetrics2.density > 0.0f ? 1 : (displayMetrics2.density == 0.0f ? 0 : -1)) != 0 ? Long.valueOf(Math.round(this.n / j3)) : null;
                                if (lValueOf != null) {
                                    long jLongValue11 = lValueOf.longValue();
                                    op0VarZ.b();
                                    ((pp0) op0VarZ.g).D(jLongValue11);
                                } else {
                                    op0VarZ.b();
                                    ((pp0) op0VarZ.g).E();
                                }
                                long jRound = Math.round(this.m / this.i);
                                op0VarZ.b();
                                ((pp0) op0VarZ.g).G(jRound);
                            }
                            Long l11 = or0VarM.A;
                            if (l11 != null) {
                                long jLongValue12 = l11.longValue();
                                op0VarZ.b();
                                ((pp0) op0VarZ.g).J(jLongValue12);
                            }
                            Long l12 = or0VarM.B;
                            if (l12 != null) {
                                long jLongValue13 = l12.longValue();
                                op0VarZ.b();
                                ((pp0) op0VarZ.g).I(jLongValue13);
                            }
                            Long l13 = or0VarM.C;
                            if (l13 != null) {
                                int i3 = l13.longValue() != 0 ? 2 : 1;
                                op0VarZ.b();
                                ((pp0) op0VarZ.g).T(i3);
                            }
                        }
                    } catch (hr0 unused2) {
                    }
                    long j4 = this.l;
                    if (j4 > 0) {
                        op0VarZ.b();
                        ((pp0) op0VarZ.g).K(j4);
                    }
                    pp0 pp0Var = (pp0) op0VarZ.c();
                    hp0Var.b();
                    ((sp0) hp0Var.g).S(pp0Var);
                    long j5 = this.h;
                    if (j5 > 0) {
                        hp0Var.b();
                        ((sp0) hp0Var.g).J(j5);
                    }
                    long j6 = this.i;
                    if (j6 > 0) {
                        hp0Var.b();
                        ((sp0) hp0Var.g).I(j6);
                    }
                    long j7 = this.j;
                    if (j7 > 0) {
                        hp0Var.b();
                        ((sp0) hp0Var.g).H(j7);
                    }
                    long j8 = this.k;
                    if (j8 > 0) {
                        hp0Var.b();
                        ((sp0) hp0Var.g).K(j8);
                    }
                    try {
                        LinkedList linkedList = this.g;
                        int size = linkedList.size() - 1;
                        if (size > 0) {
                            hp0Var.b();
                            ((sp0) hp0Var.g).U();
                            for (int i4 = 0; i4 < size; i4++) {
                                or0 or0VarR2 = r(C, (MotionEvent) linkedList.get(i4), this.x);
                                op0 op0VarZ2 = pp0.z();
                                long jLongValue14 = or0VarR2.s.longValue();
                                op0VarZ2.b();
                                ((pp0) op0VarZ2.g).A(jLongValue14);
                                long jLongValue15 = or0VarR2.t.longValue();
                                op0VarZ2.b();
                                ((pp0) op0VarZ2.g).B(jLongValue15);
                                pp0 pp0Var2 = (pp0) op0VarZ2.c();
                                hp0Var.b();
                                ((sp0) hp0Var.g).T(pp0Var2);
                            }
                        }
                    } catch (hr0 unused3) {
                        hp0Var.b();
                        ((sp0) hp0Var.g).U();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            arrayList = new ArrayList();
            listAsList = arrayList;
            if (nr0Var.b != null) {
                int iE = nr0Var.e();
                ix0 ix0Var = lx0.a3;
                tu0 tu0Var = tu0.e;
                if (((Boolean) tu0Var.c.a(ix0Var)).booleanValue()) {
                    context2 = context;
                    arrayList.add(new wr0(nr0Var, hp0Var, iE, context, (ap0) this.z.h, J));
                    arrayList.add(new vr0(nr0Var, hp0Var, iE, context2));
                    arrayList.add(new ur0(nr0Var, hp0Var, iE, context2));
                    arrayList.add(new xr0(nr0Var, hp0Var, iE, 4));
                    tr0 tr0Var = H;
                    if (tr0Var != null) {
                        long j9 = tr0Var.d ? tr0Var.b - tr0Var.a : -1L;
                        long j10 = tr0Var.c;
                        tr0Var.c = -1L;
                        j2 = j9;
                        j = j10;
                    } else {
                        tu0Var = tu0Var;
                        j = -1;
                        j2 = -1;
                    }
                    arrayList.add(new fs0(nr0Var, hp0Var, iE, G, j2, j));
                    arrayList.add(new xr0(nr0Var, hp0Var, iE, 11));
                } else {
                    context2 = context;
                    tu0Var = tu0Var;
                }
                arrayList.add(new hq0(nr0Var, i, hp0Var));
                arrayList.add(new xr0(nr0Var, hp0Var, iE, 3));
                arrayList.add(new yr0(nr0Var, hp0Var, F, iE));
                arrayList.add(new xr0(nr0Var, hp0Var, iE, 0));
                arrayList.add(new xr0(nr0Var, hp0Var, iE, 9));
                arrayList.add(new xr0(nr0Var, hp0Var, iE, 10));
                arrayList.add(new xr0(nr0Var, hp0Var, iE, 2));
                arrayList.add(new xr0(nr0Var, hp0Var, iE, 7));
                arrayList.add(new xr0(nr0Var, hp0Var, iE, 13));
                arrayList.add(new xr0(nr0Var, hp0Var, iE, 6));
                arrayList.add(new xr0(nr0Var, hp0Var, iE, 12));
                arrayList.add(new zr0(nr0Var, hp0Var, iE, new Throwable().getStackTrace()));
                arrayList.add(new zr0(nr0Var, hp0Var, iE, view));
                arrayList.add(new gs0(nr0Var, hp0Var, iE));
                tu0 tu0Var2 = tu0Var;
                if (((Boolean) tu0Var2.c.a(lx0.O2)).booleanValue()) {
                    arrayList.add(new ur0(nr0Var, hp0Var, iE, view, activity));
                }
                if (((Boolean) tu0Var2.c.a(lx0.M3)).booleanValue()) {
                    arrayList.add(new xr0(nr0Var, hp0Var, iE, 5));
                }
                if (!z) {
                    try {
                        if (((Boolean) tu0Var2.c.a(lx0.R2)).booleanValue()) {
                            arrayList.add(new as0(nr0Var, hp0Var, iE, this.B, view, context2));
                        }
                    } catch (IllegalStateException unused4) {
                    }
                    try {
                        if (((Boolean) tu0.e.c.a(lx0.S2)).booleanValue()) {
                            arrayList.add(new zr0(nr0Var, hp0Var, iE, I));
                        }
                    } catch (IllegalStateException unused5) {
                    }
                    listAsList = arrayList;
                    if (((Boolean) tu0.e.c.a(lx0.b3)).booleanValue()) {
                        arrayList.add(new zr0(nr0Var, hp0Var, iE, this.y));
                        listAsList = arrayList;
                    }
                } else if (((Boolean) tu0Var2.c.a(lx0.Q2)).booleanValue()) {
                    listAsList = arrayList;
                    arrayList.add(new hs0(nr0Var, hp0Var, iE, this.A));
                    listAsList = arrayList;
                }
            }
        } else {
            hp0Var.g(16384L);
            listAsList = Arrays.asList(new hq0(nr0Var, i, hp0Var));
        }
        listAsList = arrayList;
        t(listAsList);
    }
}
