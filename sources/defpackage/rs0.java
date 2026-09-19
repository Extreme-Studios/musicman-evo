package defpackage;

import android.app.KeyguardManager;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public abstract class rs0 {
    public static ClassLoader g;
    public static Thread h;
    public static Method l;
    public static boolean m;
    public final /* synthetic */ int f;
    public static final int[] i = new int[0];
    public static final Object[] j = new Object[0];
    public static final Object k = new Object();
    public static final String[] n = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    public static final String[] o = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    public static final String[] p = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};
    public static final tt0 q = new tt0(15);
    public static final xn1 r = new xn1(11);
    public static final xn1 s = new xn1(24);
    public static final l32 t = new l32(12);
    public static final int[] u = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

    public /* synthetic */ rs0(int i2) {
        this.f = i2;
    }

    public static JSONObject A(Context context, View view) {
        JSONObject jSONObject = new JSONObject();
        if (view != null) {
            try {
                zb3 zb3Var = vc3.C.c;
                jSONObject.put("can_show_on_lock_screen", zb3.L(view));
                boolean z = false;
                if (context != null) {
                    Object systemService = context.getSystemService("keyguard");
                    KeyguardManager keyguardManager = (systemService == null || !(systemService instanceof KeyguardManager)) ? null : (KeyguardManager) systemService;
                    if (keyguardManager != null && keyguardManager.isKeyguardLocked()) {
                        z = true;
                    }
                }
                jSONObject.put("is_keyguard_locked", z);
                return jSONObject;
            } catch (JSONException unused) {
                jn.T("Unable to get lock screen information");
            }
        }
        return jSONObject;
    }

    public static JSONObject B(Context context, Map map, Map map2, View view, ImageView.ScaleType scaleType) {
        int[] iArr;
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        if (map != null && view != null) {
            int i2 = 2;
            int[] iArr2 = new int[2];
            view.getLocationOnScreen(iArr2);
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                View view2 = (View) ((WeakReference) entry.getValue()).get();
                if (view2 != null) {
                    int[] iArr3 = new int[i2];
                    view2.getLocationOnScreen(iArr3);
                    JSONObject jSONObject3 = new JSONObject();
                    JSONObject jSONObject4 = new JSONObject();
                    Iterator it2 = it;
                    try {
                        int measuredWidth = view2.getMeasuredWidth();
                        iArr = iArr2;
                        try {
                            ut0 ut0Var = ut0.f;
                            jSONObject4.put("width", ut0Var.a.i(context, measuredWidth));
                            jSONObject4.put("height", ut0Var.a.i(context, view2.getMeasuredHeight()));
                            jSONObject4.put("x", ut0Var.a.i(context, iArr3[0] - iArr[0]));
                            jSONObject4.put("y", ut0Var.a.i(context, iArr3[1] - iArr[1]));
                            jSONObject4.put("relative_to", "ad_view");
                            jSONObject3.put("frame", jSONObject4);
                            Rect rect = new Rect();
                            if (view2.getLocalVisibleRect(rect)) {
                                jSONObject = H(context, rect);
                            } else {
                                jSONObject = new JSONObject();
                                jSONObject.put("width", 0);
                                jSONObject.put("height", 0);
                                jSONObject.put("x", ut0Var.a.i(context, iArr3[0] - iArr[0]));
                                jSONObject.put("y", ut0Var.a.i(context, iArr3[1] - iArr[1]));
                                jSONObject.put("relative_to", "ad_view");
                            }
                            jSONObject3.put("visible_bounds", jSONObject);
                            if (((String) entry.getKey()).equals("3010")) {
                                ix0 ix0Var = lx0.C8;
                                tu0 tu0Var = tu0.e;
                                if (((Boolean) tu0Var.c.a(ix0Var)).booleanValue()) {
                                    jSONObject3.put("mediaview_graphics_matrix", view2.getMatrix().toShortString());
                                }
                                if (((Boolean) tu0Var.c.a(lx0.D8)).booleanValue()) {
                                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                                    jSONObject3.put("view_width_layout_type", I(layoutParams.width) - 1);
                                    jSONObject3.put("view_height_layout_type", I(layoutParams.height) - 1);
                                }
                                if (((Boolean) tu0Var.c.a(lx0.E8)).booleanValue()) {
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add(Integer.valueOf(view2.getId()));
                                    for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                        arrayList.add(Integer.valueOf(((View) parent).getId()));
                                    }
                                    jSONObject3.put("view_path", TextUtils.join("/", arrayList));
                                }
                                if (scaleType != null) {
                                    jSONObject3.put("mediaview_scale_type", scaleType.ordinal());
                                }
                            }
                            if (view2 instanceof TextView) {
                                TextView textView = (TextView) view2;
                                jSONObject3.put("text_color", textView.getCurrentTextColor());
                                jSONObject3.put("font_size", textView.getTextSize());
                                jSONObject3.put("text", textView.getText());
                            }
                            jSONObject3.put("is_clickable", map2 != null && map2.containsKey(entry.getKey()) && view2.isClickable());
                            if (((Boolean) tu0.e.c.a(lx0.F8)).booleanValue()) {
                                jSONObject3.put("alpha", view2.getAlpha());
                            }
                            jSONObject2.put((String) entry.getKey(), jSONObject3);
                        } catch (JSONException unused) {
                            jn.T("Unable to get asset views information");
                        }
                    } catch (JSONException unused2) {
                        iArr = iArr2;
                    }
                    it = it2;
                    iArr2 = iArr;
                    i2 = 2;
                }
            }
        }
        return jSONObject2;
    }

    public static int C(int i2) {
        if (i2 == 20) {
            return 63750;
        }
        if (i2 == 30) {
            return 2250000;
        }
        switch (i2) {
            case 5:
                return 80000;
            case 6:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            default:
                switch (i2) {
                    case 14:
                        return 3062500;
                    case 15:
                        return 8000;
                    case 16:
                        return 256000;
                    case 17:
                        return 336000;
                    case 18:
                        return 768000;
                    default:
                        return -2147483647;
                }
        }
    }

    public static JSONObject D(String str, Context context, Point point, Point point2) {
        JSONObject jSONObject = null;
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    int i2 = point2.x;
                    ut0 ut0Var = ut0.f;
                    jSONObject3.put("x", ut0Var.a.i(context, i2));
                    jSONObject3.put("y", ut0Var.a.i(context, point2.y));
                    jSONObject3.put("start_x", ut0Var.a.i(context, point.x));
                    jSONObject3.put("start_y", ut0Var.a.i(context, point.y));
                    jSONObject = jSONObject3;
                } catch (JSONException e) {
                    jn.P("Error occurred while putting signals into JSON object.", e);
                }
                jSONObject2.put("click_point", jSONObject);
                jSONObject2.put("asset_id", str);
                return jSONObject2;
            } catch (Exception e2) {
                e = e2;
                jSONObject = jSONObject2;
                jn.P("Error occurred while grabbing click signals.", e);
                return jSONObject;
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    public static boolean E(Context context, x42 x42Var) {
        gi2 gi2Var;
        if (!x42Var.N) {
            return false;
        }
        ix0 ix0Var = lx0.G8;
        tu0 tu0Var = tu0.e;
        kx0 kx0Var = tu0Var.c;
        kx0 kx0Var2 = tu0Var.c;
        if (((Boolean) kx0Var.a(ix0Var)).booleanValue()) {
            return ((Boolean) kx0Var2.a(lx0.J8)).booleanValue();
        }
        String str = (String) kx0Var2.a(lx0.H8);
        if (str.isEmpty() || context == null) {
            return false;
        }
        String packageName = context.getPackageName();
        bz1 bz1VarC = bz1.c(new vh2(';'));
        Iterator itF = ((hi2) bz1VarC.f).f(bz1VarC, str);
        do {
            gi2Var = (gi2) itF;
            if (!gi2Var.hasNext()) {
                return false;
            }
        } while (!((String) gi2Var.next()).equals(packageName));
        return true;
    }

    public static JSONObject F(Context context) {
        JSONObject jSONObject = new JSONObject();
        zb3 zb3Var = vc3.C.c;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        try {
            int i2 = displayMetrics.widthPixels;
            ut0 ut0Var = ut0.f;
            jSONObject.put("width", ut0Var.a.i(context, i2));
            jSONObject.put("height", ut0Var.a.i(context, displayMetrics.heightPixels));
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public static WindowManager.LayoutParams G() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 0, 0, -2);
        layoutParams.flags = ((Integer) tu0.e.c.a(lx0.I8)).intValue();
        layoutParams.type = 2;
        layoutParams.gravity = 8388659;
        return layoutParams;
    }

    public static JSONObject H(Context context, Rect rect) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        int i2 = rect.right - rect.left;
        ut0 ut0Var = ut0.f;
        jSONObject.put("width", ut0Var.a.i(context, i2));
        int i3 = rect.bottom - rect.top;
        f32 f32Var = ut0Var.a;
        jSONObject.put("height", f32Var.i(context, i3));
        jSONObject.put("x", f32Var.i(context, rect.left));
        jSONObject.put("y", f32Var.i(context, rect.top));
        jSONObject.put("relative_to", "self");
        return jSONObject;
    }

    public static int I(int i2) {
        if (i2 != -2) {
            return i2 != -1 ? 2 : 3;
        }
        return 4;
    }

    public static re b(wb wbVar, gl glVar) {
        boolean z = true;
        ic icVarF = s90.f(wbVar.a(), jh.f, true);
        ke keVar = jf.a;
        if (icVarF != keVar && icVarF.f(ig.g) == null) {
            icVarF = icVarF.e(keVar);
        }
        re reVar = new re(icVarF, z, 0);
        reVar.O(tc.f, reVar, glVar);
        return reVar;
    }

    public static final int c(int i2, int i3, int[] iArr) {
        iArr.getClass();
        int i4 = i2 - 1;
        int i5 = 0;
        while (i5 <= i4) {
            int i6 = (i5 + i4) >>> 1;
            int i7 = iArr[i6];
            if (i7 < i3) {
                i5 = i6 + 1;
            } else {
                if (i7 <= i3) {
                    return i6;
                }
                i4 = i6 - 1;
            }
        }
        return ~i5;
    }

    public static final int d(long[] jArr, int i2, long j2) {
        jArr.getClass();
        int i3 = i2 - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            long j3 = jArr[i5];
            if (j3 < j2) {
                i4 = i5 + 1;
            } else {
                if (j3 <= j2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    public static final void e(ic icVar, CancellationException cancellationException) {
        wn wnVar = (wn) icVar.f(gm.h);
        if (wnVar != null) {
            wnVar.l(cancellationException);
        }
    }

    public static Set f() {
        try {
            Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (objInvoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) objInvoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    public static final Bundle g(String str, Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 != null) {
            return bundle2;
        }
        j7.p(ec.i("No valid saved state was found for the key '", str, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
        return null;
    }

    public static final void h(ic icVar, Throwable th) {
        Throwable runtimeException;
        Iterator it = mc.a.iterator();
        while (it.hasNext()) {
            try {
                ((i3) it.next()).a(th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    na1.d(runtimeException, th);
                }
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        try {
            na1.d(th, new ze(icVar));
        } catch (Throwable unused) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
    }

    public static final lf i(wn wnVar, boolean z, sn snVar) {
        if (wnVar instanceof wn) {
            return wnVar.z(z, snVar);
        }
        boolean zK = snVar.k();
        rn rnVar = new rn(1, snVar, sn.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 0);
        return wnVar.z(z, zK ? new kn(rnVar) : new k9(1, rnVar));
    }

    public static void j(qc qcVar, gl glVar) {
        boolean z = true;
        char c = 1;
        ic icVarF = s90.f(qcVar.a(), jh.f, true);
        ke keVar = jf.a;
        if (icVarF != keVar && icVarF.f(ig.g) == null) {
            icVarF = icVarF.e(keVar);
        }
        h reVar = new re(icVarF, z, c == true ? 1 : 0);
        reVar.O(tc.f, reVar, glVar);
    }

    public static final Object k(fz fzVar, fz fzVar2, sd sdVar) throws Throwable {
        Object maVar;
        Object objD;
        try {
            w40.b(2, sdVar);
            maVar = sdVar.f(fzVar2, fzVar);
        } catch (Throwable th) {
            maVar = new ma(th, false);
        }
        rc rcVar = rc.f;
        if (maVar == rcVar || (objD = fzVar.D(maVar)) == dq.g) {
            return rcVar;
        }
        if (objD instanceof ma) {
            throw ((ma) objD).a;
        }
        return dq.r(objD);
    }

    public static byte l(long j2) {
        hn.I((j2 >> 8) == 0, "out of range: %s", j2);
        return (byte) j2;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00ab A[Catch: all -> 0x00a7, PHI: r1
  0x00ab: PHI (r1v4 java.lang.Thread) = (r1v3 java.lang.Thread), (r1v15 java.lang.Thread) binds: [B:7:0x000a, B:47:0x00a4] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #4 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000c, B:46:0x00a2, B:61:0x00d1, B:12:0x001f, B:52:0x00aa, B:53:0x00ab, B:64:0x00d5, B:65:0x00d6, B:54:0x00ac, B:60:0x00d0, B:59:0x00b6, B:13:0x0020, B:15:0x002d, B:25:0x0047, B:26:0x004e, B:28:0x0059, B:34:0x006e, B:35:0x0075, B:43:0x0086, B:44:0x00a0, B:18:0x003c), top: B:77:0x0003, inners: #2, #6 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x00ac A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static synchronized ClassLoader m() {
        SecurityException e;
        Thread thread;
        ThreadGroup threadGroup;
        if (g == null) {
            Thread thread2 = h;
            ClassLoader contextClassLoader = null;
            if (thread2 != null) {
                synchronized (thread2) {
                    try {
                        contextClassLoader = h.getContextClassLoader();
                    } catch (SecurityException e2) {
                        Log.w("DynamiteLoaderV2CL", "Failed to get thread context classloader " + e2.getMessage());
                    }
                }
                g = contextClassLoader;
            } else {
                ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
                if (threadGroup2 == null) {
                    thread2 = null;
                } else {
                    synchronized (Void.class) {
                        try {
                            try {
                                int iActiveGroupCount = threadGroup2.activeGroupCount();
                                ThreadGroup[] threadGroupArr = new ThreadGroup[iActiveGroupCount];
                                threadGroup2.enumerate(threadGroupArr);
                                int i2 = 0;
                                int i3 = 0;
                                while (true) {
                                    if (i3 >= iActiveGroupCount) {
                                        threadGroup = null;
                                        break;
                                    }
                                    threadGroup = threadGroupArr[i3];
                                    if ("dynamiteLoader".equals(threadGroup.getName())) {
                                        break;
                                    }
                                    i3++;
                                }
                                if (threadGroup == null) {
                                    threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                                }
                                int iActiveCount = threadGroup.activeCount();
                                Thread[] threadArr = new Thread[iActiveCount];
                                threadGroup.enumerate(threadArr);
                                while (true) {
                                    if (i2 >= iActiveCount) {
                                        thread = null;
                                        break;
                                    }
                                    thread = threadArr[i2];
                                    if ("GmsDynamite".equals(thread.getName())) {
                                        break;
                                    }
                                    i2++;
                                }
                                if (thread == null) {
                                    try {
                                        eb0 eb0Var = new eb0(threadGroup, "GmsDynamite");
                                        try {
                                            eb0Var.setContextClassLoader(null);
                                            eb0Var.start();
                                            thread = eb0Var;
                                        } catch (SecurityException e3) {
                                            e = e3;
                                            thread = eb0Var;
                                            Log.w("DynamiteLoaderV2CL", "Failed to enumerate thread/threadgroup " + e.getMessage());
                                        }
                                    } catch (SecurityException e4) {
                                        e = e4;
                                    }
                                }
                            } catch (SecurityException e5) {
                                e = e5;
                                thread = null;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    thread2 = thread;
                }
                h = thread2;
                if (thread2 != null) {
                    synchronized (thread2) {
                        contextClassLoader = h.getContextClassLoader();
                    }
                }
                g = contextClassLoader;
            }
        }
        return g;
    }

    public static String o(n13 n13Var) {
        StringBuilder sb = new StringBuilder(n13Var.d());
        for (int i2 = 0; i2 < n13Var.d(); i2++) {
            byte b = n13Var.b(i2);
            if (b == 34) {
                sb.append("\\\"");
            } else if (b == 39) {
                sb.append("\\'");
            } else if (b != 92) {
                switch (b) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (b < 32 || b > 126) {
                            sb.append('\\');
                            sb.append((char) (((b >>> 6) & 3) + 48));
                            sb.append((char) (((b >>> 3) & 7) + 48));
                            sb.append((char) ((b & 7) + 48));
                        } else {
                            sb.append((char) b);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static pj0 p(pj0 pj0Var, String[] strArr, Map map) {
        int length;
        int i2 = 0;
        if (pj0Var == null) {
            if (strArr == null) {
                return null;
            }
            int length2 = strArr.length;
            if (length2 == 1) {
                return (pj0) map.get(strArr[0]);
            }
            if (length2 > 1) {
                pj0 pj0Var2 = new pj0();
                while (i2 < length2) {
                    pj0Var2.c((pj0) map.get(strArr[i2]));
                    i2++;
                }
                return pj0Var2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                pj0Var.c((pj0) map.get(strArr[0]));
                return pj0Var;
            }
            if (strArr != null && (length = strArr.length) > 1) {
                while (i2 < length) {
                    pj0Var.c((pj0) map.get(strArr[i2]));
                    i2++;
                }
            }
        }
        return pj0Var;
    }

    public static void q(String str, boolean z) throws no0 {
        if (!z) {
            throw no0.a(null, str);
        }
    }

    public static boolean r(int i2) {
        ix0 ix0Var = lx0.P3;
        tu0 tu0Var = tu0.e;
        if (((Boolean) tu0Var.c.a(ix0Var)).booleanValue()) {
            return ((Boolean) tu0Var.c.a(lx0.Q3)).booleanValue() || i2 <= 15299999;
        }
        return true;
    }

    public static boolean s(ct0 ct0Var) {
        int iOrdinal = ct0Var.ordinal();
        return iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4 || iOrdinal == 5;
    }

    public static byte[] t() {
        int i2 = (((((~1070575321) & 53864535) | 741512112) + ((1070575321 & 1665624655) | 1758594712)) - 1358657052) ^ (1555319301 % 382697713);
        int i3 = (((((~1529195746) & 118097808) | 3345166) + ((1529195746 & 656934035) | 821390159)) - 940522761) ^ (1037127828 % 1034949299);
        int[] iArr = {350322227, 1077471394, 1759186290, 18931840, 769005128, 1847857001, 24413078, 1982275856, 1275373743};
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        int i8 = iArr[4];
        int i9 = iArr[5];
        int i10 = iArr[6];
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((iArr[7] % 1275373743) ^ ec.e((i5 & (~i4)) | i6, (i4 & i7) | i8, i9, i10));
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.putShort((short) i3);
        byteBufferAllocate.putInt(i2);
        return byteBufferAllocate.array();
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0111  */
    /* JADX WARN: Code duplicated, block: B:34:0x011e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0133  */
    /* JADX WARN: Code duplicated, block: B:46:0x013b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0141 A[Catch: JSONException -> 0x0131, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0131, blocks: (B:31:0x0113, B:40:0x012d, B:48:0x0141, B:47:0x013d), top: B:65:0x0113 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x015c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x0192 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x00f5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static JSONObject v(Context context, View view) {
        int i2;
        ViewParent parent;
        String str;
        int iHashCode;
        JSONObject jSONObjectH;
        JSONObject jSONObject = new JSONObject();
        if (view != null) {
            int i3 = 1;
            try {
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                int[] iArr2 = {view.getMeasuredWidth(), view.getMeasuredHeight()};
                ViewParent parent2 = view.getParent();
                while (parent2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) parent2;
                    i2 = i3;
                    try {
                        iArr2[0] = Math.min(viewGroup.getMeasuredWidth(), iArr2[0]);
                        iArr2[i2] = Math.min(viewGroup.getMeasuredHeight(), iArr2[i2]);
                        parent2 = parent2.getParent();
                        i3 = i2;
                    } catch (Exception unused) {
                        jn.T("Unable to get native ad view bounding box");
                        parent = view.getParent();
                        if (parent != null) {
                            try {
                                str = (String) parent.getClass().getMethod("getTemplateTypeName", null).invoke(parent, null);
                            } catch (IllegalAccessException e) {
                                e = e;
                                jn.P("Cannot access method getTemplateTypeName: ", e);
                                str = "";
                            } catch (NoSuchMethodException unused2) {
                                str = "";
                            } catch (SecurityException e2) {
                                e = e2;
                                jn.P("Cannot access method getTemplateTypeName: ", e);
                                str = "";
                            } catch (InvocationTargetException e3) {
                                e = e3;
                                jn.P("Cannot access method getTemplateTypeName: ", e);
                                str = "";
                            }
                        } else {
                            str = "";
                        }
                        iHashCode = str.hashCode();
                        if (iHashCode != -2066603854) {
                            if (iHashCode != 2019754500) {
                                jSONObject.put("native_template_type", 0);
                            } else {
                                jSONObject.put("native_template_type", 2);
                            }
                        } else if (str.equals("small_template")) {
                            jSONObject.put("native_template_type", i2);
                        } else {
                            jSONObject.put("native_template_type", 0);
                        }
                        if (((Boolean) tu0.e.c.a(lx0.D8)).booleanValue()) {
                            try {
                                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                                jSONObject.put("view_width_layout_type", I(layoutParams.width) - 1);
                                jSONObject.put("view_height_layout_type", I(layoutParams.height) - 1);
                            } catch (Exception unused3) {
                                jn.p("Unable to get native ad view layout types");
                            }
                        }
                        if (((Boolean) tu0.e.c.a(lx0.F8)).booleanValue()) {
                            try {
                                jSONObject.put("alpha", view.getAlpha());
                            } catch (JSONException e4) {
                                jn.P("Could not log container view alpha signal to JSON", e4);
                            }
                        }
                        return jSONObject;
                    }
                }
                i2 = i3;
                JSONObject jSONObject2 = new JSONObject();
                int measuredWidth = view.getMeasuredWidth();
                ut0 ut0Var = ut0.f;
                f32 f32Var = ut0Var.a;
                f32 f32Var2 = ut0Var.a;
                jSONObject2.put("width", f32Var.i(context, measuredWidth));
                jSONObject2.put("height", f32Var2.i(context, view.getMeasuredHeight()));
                jSONObject2.put("x", f32Var2.i(context, iArr[0]));
                jSONObject2.put("y", f32Var2.i(context, iArr[i2]));
                jSONObject2.put("maximum_visible_width", f32Var2.i(context, iArr2[0]));
                jSONObject2.put("maximum_visible_height", f32Var2.i(context, iArr2[i2]));
                jSONObject2.put("relative_to", "window");
                jSONObject.put("frame", jSONObject2);
                Rect rect = new Rect();
                if (view.getGlobalVisibleRect(rect)) {
                    jSONObjectH = H(context, rect);
                } else {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("width", 0);
                    jSONObject3.put("height", 0);
                    jSONObject3.put("x", f32Var2.i(context, iArr[0]));
                    jSONObject3.put("y", f32Var2.i(context, iArr[i2]));
                    jSONObject3.put("relative_to", "window");
                    jSONObjectH = jSONObject3;
                }
                jSONObject.put("visible_bounds", jSONObjectH);
            } catch (Exception unused4) {
                i2 = i3;
            }
            parent = view.getParent();
            if (parent != null) {
                str = (String) parent.getClass().getMethod("getTemplateTypeName", null).invoke(parent, null);
            } else {
                str = "";
            }
            try {
                iHashCode = str.hashCode();
                if (iHashCode != -2066603854) {
                    if (iHashCode != 2019754500 && str.equals("medium_template")) {
                        jSONObject.put("native_template_type", 2);
                    } else {
                        jSONObject.put("native_template_type", 0);
                    }
                } else if (str.equals("small_template")) {
                    jSONObject.put("native_template_type", i2);
                } else {
                    jSONObject.put("native_template_type", 0);
                }
            } catch (JSONException e5) {
                jn.P("Could not log native template signal to JSON", e5);
            }
            if (((Boolean) tu0.e.c.a(lx0.D8)).booleanValue()) {
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                jSONObject.put("view_width_layout_type", I(layoutParams2.width) - 1);
                jSONObject.put("view_height_layout_type", I(layoutParams2.height) - 1);
            }
            if (((Boolean) tu0.e.c.a(lx0.F8)).booleanValue()) {
                jSONObject.put("alpha", view.getAlpha());
            }
        }
        return jSONObject;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0032  */
    public static final ct0 w(Context context, ga2 ga2Var) {
        ct0 ct0Var;
        File file = new File(new File(context.getApplicationInfo().dataDir), "lib");
        boolean zExists = file.exists();
        ct0 ct0Var2 = ct0.X86;
        ct0 ct0Var3 = ct0.ARM7;
        ct0 ct0Var4 = ct0.X86_64;
        ct0 ct0Var5 = ct0.ARM64;
        ct0 ct0Var6 = ct0.RISCV64;
        ct0 ct0Var7 = ct0.UNKNOWN;
        ct0 ct0Var8 = ct0.UNSUPPORTED;
        if (zExists) {
            File[] fileArrListFiles = file.listFiles(new nl2(Pattern.compile(".*\\.so$", 2)));
            if (fileArrListFiles == null || fileArrListFiles.length == 0) {
                if (ga2Var != null) {
                    ga2Var.d("No .so", 5017);
                } else {
                    ga2Var = null;
                }
                ct0Var = ct0Var7;
            } else {
                try {
                    FileInputStream fileInputStream = new FileInputStream(fileArrListFiles[0]);
                    try {
                        byte[] bArr = new byte[20];
                        if (fileInputStream.read(bArr) == 20) {
                            byte[] bArr2 = {0, 0};
                            if (bArr[5] == 2) {
                                z(bArr, null, ga2Var);
                            } else {
                                bArr2[0] = bArr[19];
                                bArr2[1] = bArr[18];
                                short s2 = ByteBuffer.wrap(bArr2).getShort();
                                if (s2 == 3) {
                                    ct0Var = ct0Var2;
                                } else if (s2 == 40) {
                                    ct0Var = ct0Var3;
                                } else if (s2 == 62) {
                                    ct0Var = ct0Var4;
                                } else if (s2 == 183) {
                                    ct0Var = ct0Var5;
                                } else if (s2 != 243) {
                                    z(bArr, null, ga2Var);
                                    ct0Var = ct0Var8;
                                } else {
                                    ct0Var = ct0Var6;
                                }
                                fileInputStream.close();
                            }
                        }
                        fileInputStream.close();
                    } catch (Throwable th) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    z(null, e.toString(), ga2Var);
                }
                ct0Var = ct0Var8;
            }
        } else {
            if (ga2Var != null) {
                ga2Var.d("No lib/", 5017);
            } else {
                ga2Var = null;
            }
            ct0Var = ct0Var7;
        }
        if (ct0Var == ct0Var7) {
            HashSet hashSet = new HashSet(Arrays.asList("i686", "armv71"));
            String property = System.getProperty("os.arch");
            if (TextUtils.isEmpty(property) || !hashSet.contains(property)) {
                try {
                    String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
                    if (strArr == null || strArr.length <= 0) {
                        property = Build.CPU_ABI;
                        if (property == null) {
                            property = Build.CPU_ABI2;
                        }
                    } else {
                        property = strArr[0];
                    }
                } catch (IllegalAccessException e2) {
                    if (ga2Var != null) {
                        ga2Var.c(2024, 0L, e2);
                    }
                } catch (NoSuchFieldException e3) {
                    if (ga2Var != null) {
                        ga2Var.c(2024, 0L, e3);
                    }
                }
            }
            if (TextUtils.isEmpty(property)) {
                z(null, "Empty dev arch", ga2Var);
            } else if (!property.equalsIgnoreCase("i686") && !property.equalsIgnoreCase("x86")) {
                if (property.equalsIgnoreCase("x86_64")) {
                    ct0Var2 = ct0Var4;
                } else if (property.equalsIgnoreCase("arm64-v8a")) {
                    ct0Var2 = ct0Var5;
                } else if (property.equalsIgnoreCase("armeabi-v7a") || property.equalsIgnoreCase("armv71")) {
                    ct0Var2 = ct0Var3;
                } else if (property.equalsIgnoreCase("riscv64")) {
                    ct0Var2 = ct0Var6;
                } else {
                    z(null, property, ga2Var);
                }
            }
            ct0Var2 = ct0Var8;
        } else {
            ct0Var2 = ct0Var;
        }
        if (ga2Var != null) {
            ga2Var.d(ct0Var2.name(), 5018);
        }
        return ct0Var2;
    }

    public static JSONObject x(View view) {
        JSONObject jSONObject = new JSONObject();
        if (view != null) {
            try {
                boolean z = true;
                if (((Boolean) tu0.e.c.a(lx0.B8)).booleanValue()) {
                    zb3 zb3Var = vc3.C.c;
                    ViewParent parent = view.getParent();
                    while (parent != null && !(parent instanceof ScrollView)) {
                        parent = parent.getParent();
                    }
                    jSONObject.put("contained_in_scroll_view", parent != null);
                    return jSONObject;
                }
                zb3 zb3Var2 = vc3.C.c;
                ViewParent parent2 = view.getParent();
                while (parent2 != null && !(parent2 instanceof AdapterView)) {
                    parent2 = parent2.getParent();
                }
                if ((parent2 == null ? -1 : ((AdapterView) parent2).getPositionForView(view)) == -1) {
                    z = false;
                }
                jSONObject.put("contained_in_scroll_view", z);
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }

    public static qk2 y(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        tj2 tj2Var = vj2.g;
        w40.k0("initialCapacity", 4);
        Object[] objArrCopyOf = new Object[4];
        int i2 = 0;
        do {
            String strConcat = str.concat(":Item");
            xmlPullParser.next();
            if (ss0.N(xmlPullParser, strConcat)) {
                String strConcat2 = str2.concat(":Mime");
                String strConcat3 = str2.concat(":Semantic");
                String strConcat4 = str2.concat(":Length");
                String strConcat5 = str2.concat(":Padding");
                String strQ = ss0.Q(xmlPullParser, strConcat2);
                String strQ2 = ss0.Q(xmlPullParser, strConcat3);
                String strQ3 = ss0.Q(xmlPullParser, strConcat4);
                String strQ4 = ss0.Q(xmlPullParser, strConcat5);
                if (strQ == null || strQ2 == null) {
                    return qk2.j;
                }
                lf0 lf0Var = new lf0(strQ3 != null ? Long.parseLong(strQ3) : 0L, strQ4 != null ? Long.parseLong(strQ4) : 0L, strQ);
                int length = objArrCopyOf.length;
                int i3 = i2 + 1;
                int iD = pj2.d(length, i3);
                if (iD > length) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, iD);
                }
                objArrCopyOf[i2] = lf0Var;
                i2 = i3;
            }
        } while (!ss0.E(xmlPullParser, str.concat(":Directory")));
        return vj2.o(objArrCopyOf, i2);
    }

    public static final void z(byte[] bArr, String str, ga2 ga2Var) {
        if (ga2Var == null) {
            return;
        }
        StringBuilder sb = new StringBuilder("os.arch:");
        sb.append(System.getProperty("os.arch"));
        sb.append(";");
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null) {
                sb.append("supported_abis:");
                sb.append(Arrays.toString(strArr));
                sb.append(";");
            }
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
        sb.append("CPU_ABI:");
        sb.append(Build.CPU_ABI);
        sb.append(";CPU_ABI2:");
        sb.append(Build.CPU_ABI2);
        sb.append(";");
        if (bArr != null) {
            sb.append("ELF:");
            sb.append(Arrays.toString(bArr));
            sb.append(";");
        }
        if (str != null) {
            sb.append("dbg:");
            sb.append(str);
            sb.append(";");
        }
        ga2Var.d(sb.toString(), 4007);
    }

    public abstract Object n(r52 r52Var, xr2 xr2Var, Class cls);

    public String toString() {
        switch (this.f) {
            case 22:
                return u().toString();
            default:
                return super.toString();
        }
    }

    public abstract Object u();
}
