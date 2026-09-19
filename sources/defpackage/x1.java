package defpackage;

import android.R;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.view.Choreographer;
import android.widget.TextView;
import com.extremestudios.musicmanevo.MainActivity;
import com.extremestudios.musicmanevo.PlayerActivity;
import com.extremestudios.musicmanevo.SplashActivity;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x1 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ x1(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0193  */
    /* JADX WARN: Code duplicated, block: B:117:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:118:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:120:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:122:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:125:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:127:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:128:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:131:0x0204  */
    /* JADX WARN: Code duplicated, block: B:133:0x0210  */
    /* JADX WARN: Code duplicated, block: B:134:0x0244  */
    /* JADX WARN: Code duplicated, block: B:143:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:145:0x02be  */
    /* JADX WARN: Code duplicated, block: B:149:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:151:0x02d6 A[LOOP:1: B:147:0x02ca->B:151:0x02d6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:155:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:157:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:240:0x02d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:243:0x02fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:247:0x02f7 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v50 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7 */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        ?? r5;
        ?? r3;
        long j;
        long j2;
        float f;
        long j3;
        long j4;
        boolean z;
        float f2;
        r10 r10Var;
        float f3;
        float f4;
        float f5;
        r10 r10Var2;
        boolean z2;
        ArrayList arrayList;
        q3 q3VarA;
        ArrayList arrayList2;
        int iIndexOf;
        int i;
        int size;
        int i2 = 2;
        boolean z3 = false;
        switch (this.f) {
            case 0:
                Activity activity = (Activity) this.g;
                if (activity.isFinishing()) {
                    return;
                }
                Handler handler = z1.g;
                Method method = z1.f;
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 28) {
                    activity.recreate();
                    return;
                }
                y1 y1Var = 27;
                if (((i3 != 26 && i3 != 27) || method != null) && (z1.e != null || z1.d != null)) {
                    try {
                        Object obj2 = z1.c.get(activity);
                        if (obj2 != null && (obj = z1.b.get(activity)) != null) {
                            Application application = activity.getApplication();
                            y1Var = new y1(activity);
                            application.registerActivityLifecycleCallbacks(y1Var);
                            handler.post(new in2(y1Var, i2, obj2));
                            application = (i3 == 26 || i3 == 27) ? 1 : 0;
                            int i4 = 3;
                            try {
                                if (application != 0) {
                                    try {
                                        Boolean bool = Boolean.FALSE;
                                        method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                    } catch (Throwable th) {
                                        th = th;
                                        r3 = application;
                                        r5 = y1Var;
                                        handler.post(new in2((Object) r3, i4, (Object) r5));
                                        throw th;
                                    }
                                } else {
                                    activity.recreate();
                                }
                                handler.post(new in2(application, i4, y1Var));
                                return;
                            } catch (Throwable th2) {
                                th = th2;
                                r3 = application;
                                r5 = y1Var;
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                activity.recreate();
                return;
            case 1:
                q3 q3Var = (q3) ((q3) this.g).c.g;
                long jUptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList3 = q3Var.b;
                long jUptimeMillis2 = SystemClock.uptimeMillis();
                int i5 = 0;
                while (i5 < arrayList3.size()) {
                    q10 q10Var = (q10) arrayList3.get(i5);
                    if (q10Var == null) {
                        i5 = i5;
                        jUptimeMillis = jUptimeMillis;
                    } else {
                        q00 q00Var = q3Var.a;
                        Long l = (Long) q00Var.get(q10Var);
                        if (l == null) {
                            j = q10Var.f;
                            if (j == 0) {
                                q10Var.f = jUptimeMillis;
                                q10Var.b(q10Var.b);
                                i5 = i5;
                                jUptimeMillis = jUptimeMillis;
                            } else {
                                j2 = jUptimeMillis - j;
                                q10Var.f = jUptimeMillis;
                                f = q10.a().g;
                                if (f == 0.0f) {
                                    j3 = 2147483647L;
                                } else {
                                    j3 = (long) (j2 / f);
                                }
                                j4 = j3;
                                z = q10Var.l;
                                f2 = q10Var.k;
                                if (z) {
                                    if (f2 != Float.MAX_VALUE) {
                                        q10Var.j.i = f2;
                                        q10Var.k = Float.MAX_VALUE;
                                    }
                                    q10Var.b = (float) q10Var.j.i;
                                    q10Var.a = 0.0f;
                                    q10Var.l = z3;
                                    jUptimeMillis = jUptimeMillis;
                                } else {
                                    i5 = i5;
                                    r10Var = q10Var.j;
                                    f3 = q10Var.b;
                                    f4 = q10Var.a;
                                    if (f2 != Float.MAX_VALUE) {
                                        long j5 = j4 / 2;
                                        ag agVarA = r10Var.a(f3, f4, j5);
                                        r10 r10Var3 = q10Var.j;
                                        r10Var3.i = q10Var.k;
                                        q10Var.k = Float.MAX_VALUE;
                                        ag agVarA2 = r10Var3.a(agVarA.a, agVarA.b, j5);
                                        q10Var.b = agVarA2.a;
                                        q10Var.a = agVarA2.b;
                                    } else {
                                        ag agVarA3 = r10Var.a(f3, f4, j4);
                                        q10Var.b = agVarA3.a;
                                        q10Var.a = agVarA3.b;
                                    }
                                    float fMax = Math.max(q10Var.b, -3.4028235E38f);
                                    q10Var.b = fMax;
                                    float fMin = Math.min(fMax, Float.MAX_VALUE);
                                    q10Var.b = fMin;
                                    f5 = q10Var.a;
                                    r10Var2 = q10Var.j;
                                    r10Var2.getClass();
                                    if (Math.abs(f5) < r10Var2.e) {
                                    }
                                    z2 = false;
                                    float fMin2 = Math.min(q10Var.b, Float.MAX_VALUE);
                                    q10Var.b = fMin2;
                                    float fMax2 = Math.max(fMin2, -3.4028235E38f);
                                    q10Var.b = fMax2;
                                    q10Var.b(fMax2);
                                    if (z2) {
                                        arrayList = q10Var.h;
                                        q10Var.e = false;
                                        q3VarA = q10.a();
                                        q3VarA.a.remove(q10Var);
                                        arrayList2 = q3VarA.b;
                                        iIndexOf = arrayList2.indexOf(q10Var);
                                        if (iIndexOf >= 0) {
                                            arrayList2.set(iIndexOf, null);
                                            q3VarA.f = true;
                                        }
                                        q10Var.f = 0L;
                                        for (i = 0; i < arrayList.size(); i++) {
                                            if (arrayList.get(i) == null) {
                                                arrayList.get(i).getClass();
                                                j7.j();
                                                return;
                                            }
                                        }
                                        for (size = arrayList.size() - 1; size >= 0; size--) {
                                            if (arrayList.get(size) == null) {
                                                arrayList.remove(size);
                                            }
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                                z2 = true;
                                float fMin3 = Math.min(q10Var.b, Float.MAX_VALUE);
                                q10Var.b = fMin3;
                                float fMax3 = Math.max(fMin3, -3.4028235E38f);
                                q10Var.b = fMax3;
                                q10Var.b(fMax3);
                                if (z2) {
                                    arrayList = q10Var.h;
                                    q10Var.e = false;
                                    q3VarA = q10.a();
                                    q3VarA.a.remove(q10Var);
                                    arrayList2 = q3VarA.b;
                                    iIndexOf = arrayList2.indexOf(q10Var);
                                    if (iIndexOf >= 0) {
                                        arrayList2.set(iIndexOf, null);
                                        q3VarA.f = true;
                                    }
                                    q10Var.f = 0L;
                                    while (i < arrayList.size()) {
                                        if (arrayList.get(i) == null) {
                                            arrayList.get(i).getClass();
                                            j7.j();
                                            return;
                                        }
                                    }
                                    while (size >= 0) {
                                        if (arrayList.get(size) == null) {
                                            arrayList.remove(size);
                                        }
                                    }
                                } else {
                                    continue;
                                }
                            }
                        } else if (l.longValue() < jUptimeMillis2) {
                            q00Var.remove(q10Var);
                            j = q10Var.f;
                            if (j == 0) {
                                q10Var.f = jUptimeMillis;
                                q10Var.b(q10Var.b);
                                i5 = i5;
                                jUptimeMillis = jUptimeMillis;
                            } else {
                                j2 = jUptimeMillis - j;
                                q10Var.f = jUptimeMillis;
                                f = q10.a().g;
                                if (f == 0.0f) {
                                    j3 = 2147483647L;
                                } else {
                                    j3 = (long) (j2 / f);
                                }
                                j4 = j3;
                                z = q10Var.l;
                                f2 = q10Var.k;
                                if (z) {
                                    if (f2 != Float.MAX_VALUE) {
                                        q10Var.j.i = f2;
                                        q10Var.k = Float.MAX_VALUE;
                                    }
                                    q10Var.b = (float) q10Var.j.i;
                                    q10Var.a = 0.0f;
                                    q10Var.l = z3;
                                    jUptimeMillis = jUptimeMillis;
                                } else {
                                    i5 = i5;
                                    r10Var = q10Var.j;
                                    f3 = q10Var.b;
                                    f4 = q10Var.a;
                                    if (f2 != Float.MAX_VALUE) {
                                        long j6 = j4 / 2;
                                        ag agVarA4 = r10Var.a(f3, f4, j6);
                                        r10 r10Var4 = q10Var.j;
                                        r10Var4.i = q10Var.k;
                                        q10Var.k = Float.MAX_VALUE;
                                        ag agVarA5 = r10Var4.a(agVarA4.a, agVarA4.b, j6);
                                        q10Var.b = agVarA5.a;
                                        q10Var.a = agVarA5.b;
                                    } else {
                                        ag agVarA6 = r10Var.a(f3, f4, j4);
                                        q10Var.b = agVarA6.a;
                                        q10Var.a = agVarA6.b;
                                    }
                                    float fMax4 = Math.max(q10Var.b, -3.4028235E38f);
                                    q10Var.b = fMax4;
                                    float fMin4 = Math.min(fMax4, Float.MAX_VALUE);
                                    q10Var.b = fMin4;
                                    f5 = q10Var.a;
                                    r10Var2 = q10Var.j;
                                    r10Var2.getClass();
                                    if (Math.abs(f5) < r10Var2.e || Math.abs(fMin4 - ((float) r10Var2.i)) >= r10Var2.d) {
                                        z2 = false;
                                    } else {
                                        q10Var.b = (float) q10Var.j.i;
                                        q10Var.a = 0.0f;
                                    }
                                    float fMin5 = Math.min(q10Var.b, Float.MAX_VALUE);
                                    q10Var.b = fMin5;
                                    float fMax5 = Math.max(fMin5, -3.4028235E38f);
                                    q10Var.b = fMax5;
                                    q10Var.b(fMax5);
                                    if (z2) {
                                        arrayList = q10Var.h;
                                        q10Var.e = false;
                                        q3VarA = q10.a();
                                        q3VarA.a.remove(q10Var);
                                        arrayList2 = q3VarA.b;
                                        iIndexOf = arrayList2.indexOf(q10Var);
                                        if (iIndexOf >= 0) {
                                            arrayList2.set(iIndexOf, null);
                                            q3VarA.f = true;
                                        }
                                        q10Var.f = 0L;
                                        while (i < arrayList.size()) {
                                            if (arrayList.get(i) == null) {
                                                arrayList.get(i).getClass();
                                                j7.j();
                                                return;
                                            }
                                        }
                                        while (size >= 0) {
                                            if (arrayList.get(size) == null) {
                                                arrayList.remove(size);
                                            }
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                                z2 = true;
                                float fMin6 = Math.min(q10Var.b, Float.MAX_VALUE);
                                q10Var.b = fMin6;
                                float fMax6 = Math.max(fMin6, -3.4028235E38f);
                                q10Var.b = fMax6;
                                q10Var.b(fMax6);
                                if (z2) {
                                    arrayList = q10Var.h;
                                    q10Var.e = false;
                                    q3VarA = q10.a();
                                    q3VarA.a.remove(q10Var);
                                    arrayList2 = q3VarA.b;
                                    iIndexOf = arrayList2.indexOf(q10Var);
                                    if (iIndexOf >= 0) {
                                        arrayList2.set(iIndexOf, null);
                                        q3VarA.f = true;
                                    }
                                    q10Var.f = 0L;
                                    while (i < arrayList.size()) {
                                        if (arrayList.get(i) == null) {
                                            arrayList.get(i).getClass();
                                            j7.j();
                                            return;
                                        }
                                    }
                                    while (size >= 0) {
                                        if (arrayList.get(size) == null) {
                                            arrayList.remove(size);
                                        }
                                    }
                                } else {
                                    continue;
                                }
                            }
                        } else {
                            i5 = i5;
                            jUptimeMillis = jUptimeMillis;
                        }
                    }
                    i5++;
                    jUptimeMillis = jUptimeMillis;
                    z3 = false;
                }
                if (q3Var.f) {
                    for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
                        if (arrayList3.get(size2) == null) {
                            arrayList3.remove(size2);
                        }
                    }
                    if (arrayList3.size() == 0 && Build.VERSION.SDK_INT >= 33) {
                        vg2 vg2Var = q3Var.h;
                        ValueAnimator.unregisterDurationScaleChangeListener((o3) vg2Var.g);
                        vg2Var.g = null;
                    }
                    q3Var.f = false;
                }
                if (arrayList3.size() > 0) {
                    ((Choreographer) q3Var.e.g).postFrameCallback(new p3(q3Var.d));
                    return;
                }
                return;
            case 2:
                ((c4) this.g).invalidateOptionsMenu();
                return;
            case 3:
                va vaVar = (va) this.g;
                Runnable runnable = vaVar.g;
                if (runnable != null) {
                    runnable.run();
                    vaVar.g = null;
                    return;
                }
                return;
            case 4:
                ya.a((ya) this.g);
                return;
            case 5:
                ti tiVar = (ti) this.g;
                synchronized (tiVar.i) {
                    try {
                        if (tiVar.m == null) {
                            return;
                        }
                        try {
                            dj djVarC = tiVar.c();
                            int i6 = djVarC.f;
                            if (i6 == 2) {
                                synchronized (tiVar.i) {
                                }
                            }
                            if (i6 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i6 + ")");
                            }
                            try {
                                int i7 = t40.a;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                gm gmVar = tiVar.h;
                                Context context = tiVar.f;
                                gmVar.getClass();
                                dj[] djVarArr = {djVarC};
                                w40 w40Var = x40.a;
                                jn.d("TypefaceCompat.createFromFontInfo");
                                try {
                                    Typeface typefaceG = x40.a.g(context, djVarArr, 0);
                                    Trace.endSection();
                                    MappedByteBuffer mappedByteBufferI = s90.i(tiVar.f, djVarC.a);
                                    if (mappedByteBufferI == null || typefaceG == null) {
                                        throw new RuntimeException("Unable to open file.");
                                    }
                                    try {
                                        Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                        u40 u40Var = new u40(typefaceG, ar.k(mappedByteBufferI));
                                        Trace.endSection();
                                        Trace.endSection();
                                        synchronized (tiVar.i) {
                                            try {
                                                s90 s90Var = tiVar.m;
                                                if (s90Var != null) {
                                                    s90Var.k(u40Var);
                                                }
                                            } catch (Throwable th3) {
                                                throw th3;
                                            }
                                            break;
                                        }
                                        tiVar.b();
                                        return;
                                    } catch (Throwable th4) {
                                        int i8 = t40.a;
                                        Trace.endSection();
                                        throw th4;
                                    }
                                } catch (Throwable th5) {
                                    Trace.endSection();
                                    throw th5;
                                }
                            } catch (Throwable th6) {
                                int i9 = t40.a;
                                Trace.endSection();
                                throw th6;
                            }
                            break;
                        } catch (Throwable th7) {
                            synchronized (tiVar.i) {
                                try {
                                    s90 s90Var2 = tiVar.m;
                                    if (s90Var2 != null) {
                                        s90Var2.j(th7);
                                    }
                                    tiVar.b();
                                    return;
                                } catch (Throwable th8) {
                                    throw th8;
                                }
                            }
                        }
                    } catch (Throwable th9) {
                        throw th9;
                    }
                }
            case 6:
                jq.a((jq) this.g);
                return;
            case 7:
                PlayerActivity playerActivity = (PlayerActivity) this.g;
                int i10 = PlayerActivity.Y;
                playerActivity.w();
                playerActivity.s();
                return;
            case 8:
                wv wvVar = (wv) this.g;
                oo ooVar = wvVar.k;
                if (wvVar.g == 0) {
                    wvVar.h = true;
                    ooVar.d(eo.ON_PAUSE);
                }
                if (wvVar.f == 0 && wvVar.h) {
                    ooVar.d(eo.ON_STOP);
                    wvVar.i = true;
                    return;
                }
                return;
            case 9:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) ((kc2) this.g).g;
                int i11 = sideSheetBehavior.u;
                if (i11 != 2 || i11 == 0) {
                    return;
                }
                sideSheetBehavior.u = 0;
                return;
            case 10:
                TextView textView = (TextView) this.g;
                int i12 = SplashActivity.C;
                textView.animate().alpha(1.0f).setDuration(1000L).start();
                return;
            default:
                SplashActivity splashActivity = (SplashActivity) this.g;
                int i13 = SplashActivity.C;
                splashActivity.startActivity(new Intent(splashActivity, (Class<?>) MainActivity.class));
                splashActivity.overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                splashActivity.finish();
                return;
        }
    }
}
