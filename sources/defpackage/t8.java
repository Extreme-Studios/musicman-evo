package defpackage;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.view.View;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class t8 implements Runnable {
    public static final /* synthetic */ t8 g = new t8(3);
    public final /* synthetic */ int f;

    public t8(zy1 zy1Var, int i) {
        this.f = 0;
    }

    /* JADX WARN: Code duplicated, block: B:201:0x0150 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:203:0x015e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:204:0x0158 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:206:0x013c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x012d  */
    /* JADX WARN: Code duplicated, block: B:64:0x013e  */
    /* JADX WARN: Code duplicated, block: B:71:0x016f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x0171  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        CountDownLatch countDownLatch;
        HashSet hashSet;
        KeyguardManager keyguardManager;
        Iterator it;
        HashSet hashSet2;
        us2 us2Var;
        Activity activity;
        Boolean bool;
        String str;
        ArrayList arrayList;
        int size;
        int i;
        l92 l92Var;
        View view;
        x92 x92Var;
        switch (this.f) {
            case 0:
                return;
            case 1:
                try {
                    int i2 = t40.a;
                    Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if (qg.k != null) {
                        qg.a().c();
                        break;
                    }
                    return;
                } finally {
                    int i3 = t40.a;
                    Trace.endSection();
                }
            case 2:
                try {
                    iq0.b = MessageDigest.getInstance("MD5");
                    countDownLatch = iq0.e;
                } catch (NoSuchAlgorithmException unused) {
                    countDownLatch = iq0.e;
                } catch (Throwable th) {
                    iq0.e.countDown();
                    throw th;
                }
                countDownLatch.countDown();
                return;
            case 3:
                List list = d91.l;
                ss0.B("Pinged SB successfully.");
                return;
            case 4:
                Looper.myLooper().quit();
                return;
            case 5:
            case 6:
            case 7:
                return;
            case 8:
                z92 z92Var = z92.f;
                qx1 qx1Var = z92Var.d;
                us2 us2Var2 = z92Var.e;
                z92Var.b.clear();
                for (x82 x82Var : Collections.unmodifiableCollection(i92.c.b)) {
                }
                System.nanoTime();
                HashMap map = (HashMap) qx1Var.m;
                HashSet hashSet3 = (HashSet) qx1Var.k;
                HashMap map2 = (HashMap) qx1Var.h;
                HashMap map3 = (HashMap) qx1Var.g;
                HashSet hashSet4 = (HashSet) qx1Var.j;
                HashSet hashSet5 = (HashSet) qx1Var.n;
                HashSet<String> hashSet6 = (HashSet) qx1Var.l;
                HashMap map4 = (HashMap) qx1Var.i;
                i92 i92Var = i92.c;
                if (i92Var != null) {
                    Iterator it2 = Collections.unmodifiableCollection(i92Var.b).iterator();
                    while (it2.hasNext()) {
                        x82 x82Var2 = (x82) it2.next();
                        View view2 = (View) x82Var2.c.get();
                        String str2 = x82Var2.g;
                        if (!x82Var2.e || x82Var2.f) {
                            it = it2;
                            hashSet2 = hashSet5;
                            us2Var = us2Var2;
                            it2 = it;
                            us2Var2 = us2Var;
                            hashSet5 = hashSet2;
                        } else if (view2 != null) {
                            Context context = view2.getContext();
                            it = it2;
                            while (true) {
                                if (!(context instanceof ContextWrapper)) {
                                    activity = null;
                                } else if (context instanceof Activity) {
                                    activity = (Activity) context;
                                } else {
                                    context = ((ContextWrapper) context).getBaseContext();
                                }
                            }
                            boolean zIsInPictureInPictureMode = activity != null ? activity.isInPictureInPictureMode() : false;
                            if (zIsInPictureInPictureMode) {
                                hashSet5.add(str2);
                            }
                            boolean z = zIsInPictureInPictureMode;
                            if (view2.isAttachedToWindow()) {
                                boolean zHasWindowFocus = view2.hasWindowFocus();
                                hashSet2 = hashSet5;
                                WeakHashMap weakHashMap = (WeakHashMap) qx1Var.o;
                                if (zHasWindowFocus) {
                                    weakHashMap.remove(view2);
                                    bool = Boolean.FALSE;
                                } else if (weakHashMap.containsKey(view2)) {
                                    bool = (Boolean) weakHashMap.get(view2);
                                } else {
                                    Boolean bool2 = Boolean.FALSE;
                                    weakHashMap.put(view2, bool2);
                                    bool = bool2;
                                }
                                if (!bool.booleanValue() || z) {
                                    HashSet hashSet7 = new HashSet();
                                    View view3 = view2;
                                    while (true) {
                                        if (view3 == null) {
                                            us2Var = us2Var2;
                                            hashSet4.addAll(hashSet7);
                                            str = null;
                                        } else {
                                            String strR = ar.r(view3);
                                            if (strR != null) {
                                                str = strR;
                                            } else {
                                                hashSet7.add(view3);
                                                Object parent = view3.getParent();
                                                us2Var2 = us2Var2;
                                                view3 = parent instanceof View ? (View) parent : null;
                                            }
                                        }
                                    }
                                    if (str == null) {
                                        hashSet3.add(str2);
                                        map3.put(view2, str2);
                                        arrayList = x82Var2.b.a;
                                        size = arrayList.size();
                                        i = 0;
                                        while (i < size) {
                                            Object obj = arrayList.get(i);
                                            i++;
                                            l92Var = (l92) obj;
                                            view = (View) l92Var.a.get();
                                            if (view == null) {
                                                x92Var = (x92) map2.get(view);
                                                if (x92Var != null) {
                                                    x92Var.b.add(str2);
                                                } else {
                                                    map2.put(view, new x92(l92Var, str2));
                                                }
                                            }
                                        }
                                    } else if (str != "noWindowFocus") {
                                        hashSet6.add(str2);
                                        map4.put(str2, view2);
                                        map.put(str2, str);
                                    }
                                    it2 = it;
                                    us2Var2 = us2Var;
                                    hashSet5 = hashSet2;
                                } else {
                                    str = "noWindowFocus";
                                }
                            } else {
                                str = "notAttached";
                                hashSet2 = hashSet5;
                            }
                            us2Var = us2Var2;
                            if (str == null) {
                                hashSet3.add(str2);
                                map3.put(view2, str2);
                                arrayList = x82Var2.b.a;
                                size = arrayList.size();
                                i = 0;
                                while (i < size) {
                                    Object obj2 = arrayList.get(i);
                                    i++;
                                    l92Var = (l92) obj2;
                                    view = (View) l92Var.a.get();
                                    if (view == null) {
                                        x92Var = (x92) map2.get(view);
                                        if (x92Var != null) {
                                            x92Var.b.add(str2);
                                        } else {
                                            map2.put(view, new x92(l92Var, str2));
                                        }
                                    }
                                }
                            } else if (str != "noWindowFocus") {
                                hashSet6.add(str2);
                                map4.put(str2, view2);
                                map.put(str2, str);
                            }
                            it2 = it;
                            us2Var2 = us2Var;
                            hashSet5 = hashSet2;
                        } else {
                            hashSet6.add(str2);
                            map.put(str2, "noAdView");
                            it2 = it2;
                        }
                    }
                }
                HashSet hashSet8 = hashSet5;
                us2 us2Var3 = us2Var2;
                vg2 vg2Var = z92Var.c;
                long jNanoTime = System.nanoTime();
                w32 w32Var = (w32) vg2Var.h;
                if (hashSet6.size() > 0) {
                    for (String str3 : hashSet6) {
                        HashSet hashSet9 = hashSet6;
                        JSONObject jSONObjectD = w32Var.d(null);
                        View view4 = (View) map4.get(str3);
                        gv1 gv1Var = (gv1) vg2Var.g;
                        vg2 vg2Var2 = vg2Var;
                        String str4 = (String) map.get(str3);
                        if (str4 != null) {
                            JSONObject jSONObjectG = gv1Var.g(view4);
                            try {
                                jSONObjectG.put("adSessionId", str3);
                            } catch (JSONException e) {
                                hn.u("Error with setting ad session id", e);
                            }
                            try {
                                jSONObjectG.put("notVisibleReason", str4);
                            } catch (JSONException e2) {
                                hn.u("Error with setting not visible reason", e2);
                            }
                            v92.c(jSONObjectD, jSONObjectG);
                        } else {
                            w32Var = w32Var;
                        }
                        v92.d(jSONObjectD);
                        HashMap map5 = map4;
                        HashSet hashSet10 = new HashSet();
                        hashSet10.add(str3);
                        us2Var3.getClass();
                        HashMap map6 = map;
                        us2 us2Var4 = us2Var3;
                        w32 w32Var2 = w32Var;
                        ca2 ca2Var = new ca2(us2Var4, hashSet10, jSONObjectD, jNanoTime, 0);
                        r52 r52Var = (r52) us2Var4.h;
                        ca2Var.a = r52Var;
                        ArrayDeque arrayDeque = (ArrayDeque) r52Var.h;
                        arrayDeque.add(ca2Var);
                        if (((aa2) r52Var.i) == null) {
                            aa2 aa2Var = (aa2) arrayDeque.poll();
                            r52Var.i = aa2Var;
                            if (aa2Var != null) {
                                aa2Var.executeOnExecutor((ThreadPoolExecutor) r52Var.g, new Object[0]);
                            }
                        }
                        w32Var = w32Var2;
                        hashSet6 = hashSet9;
                        map4 = map5;
                        map = map6;
                        vg2Var = vg2Var2;
                        us2Var3 = us2Var4;
                        break;
                    }
                }
                HashSet hashSet11 = hashSet6;
                HashMap map7 = map;
                us2 us2Var5 = us2Var3;
                w32 w32Var3 = w32Var;
                HashMap map8 = map4;
                if (hashSet3.size() > 0) {
                    JSONObject jSONObjectD2 = w32Var3.d(null);
                    ArrayList arrayList2 = new ArrayList();
                    i92 i92Var2 = i92.c;
                    if (i92Var2 != null) {
                        Collection collectionUnmodifiableCollection = Collections.unmodifiableCollection(i92Var2.b);
                        int size2 = collectionUnmodifiableCollection.size();
                        IdentityHashMap identityHashMap = new IdentityHashMap(size2 + size2 + 3);
                        Iterator it3 = collectionUnmodifiableCollection.iterator();
                        while (it3.hasNext()) {
                            View view5 = (View) ((x82) it3.next()).c.get();
                            if (view5 != null && view5.isAttachedToWindow() && view5.isShown()) {
                                View view6 = view5;
                                while (true) {
                                    if (view6 == null) {
                                        Iterator it4 = it3;
                                        View rootView = view5.getRootView();
                                        if (rootView != null && !identityHashMap.containsKey(rootView)) {
                                            identityHashMap.put(rootView, rootView);
                                            float z2 = rootView.getZ();
                                            int size3 = arrayList2.size();
                                            while (size3 > 0) {
                                                float f = z2;
                                                int i4 = size3 - 1;
                                                if (((View) arrayList2.get(i4)).getZ() > f) {
                                                    size3 = i4;
                                                    z2 = f;
                                                } else {
                                                    arrayList2.add(size3, rootView);
                                                }
                                            }
                                            arrayList2.add(size3, rootView);
                                        }
                                        it3 = it4;
                                    }
                                    if (view6.getAlpha() == 0.0f) {
                                    }
                                    Object parent2 = view6.getParent();
                                    it3 = it3;
                                    view6 = parent2 instanceof View ? (View) parent2 : null;
                                    break;
                                    break;
                                }
                            }
                        }
                    }
                    int i5 = 0;
                    for (int size4 = arrayList2.size(); i5 < size4; size4 = size4) {
                        z92Var.a((View) arrayList2.get(i5), (gv1) w32Var3.g, jSONObjectD2, false);
                        i5++;
                    }
                    v92.d(jSONObjectD2);
                    us2Var5.getClass();
                    hashSet = hashSet3;
                    ca2 ca2Var2 = new ca2(us2Var5, hashSet, jSONObjectD2, jNanoTime, 1);
                    r52 r52Var2 = (r52) us2Var5.h;
                    ca2Var2.a = r52Var2;
                    ArrayDeque arrayDeque2 = (ArrayDeque) r52Var2.h;
                    arrayDeque2.add(ca2Var2);
                    if (((aa2) r52Var2.i) == null) {
                        aa2 aa2Var2 = (aa2) arrayDeque2.poll();
                        r52Var2.i = aa2Var2;
                        if (aa2Var2 != null) {
                            aa2Var2.executeOnExecutor((ThreadPoolExecutor) r52Var2.g, new Object[0]);
                        }
                    }
                } else {
                    hashSet = hashSet3;
                    us2Var5.getClass();
                    ba2 ba2Var = new ba2(us2Var5);
                    r52 r52Var3 = (r52) us2Var5.h;
                    ba2Var.a = r52Var3;
                    ArrayDeque arrayDeque3 = (ArrayDeque) r52Var3.h;
                    arrayDeque3.add(ba2Var);
                    if (((aa2) r52Var3.i) == null) {
                        aa2 aa2Var3 = (aa2) arrayDeque3.poll();
                        r52Var3.i = aa2Var3;
                        if (aa2Var3 != null) {
                            aa2Var3.executeOnExecutor((ThreadPoolExecutor) r52Var3.g, new Object[0]);
                        }
                    }
                }
                map3.clear();
                map2.clear();
                map8.clear();
                hashSet4.clear();
                hashSet.clear();
                hashSet11.clear();
                map7.clear();
                qx1Var.f = false;
                hashSet8.clear();
                System.nanoTime();
                ArrayList arrayList3 = z92Var.a;
                if (arrayList3.size() > 0) {
                    Iterator it5 = arrayList3.iterator();
                    if (it5.hasNext()) {
                        it5.next().getClass();
                        j7.j();
                        return;
                    }
                }
                q92 q92Var = q92.d;
                Context context2 = (Context) q92Var.a.get();
                if (context2 == null || (keyguardManager = (KeyguardManager) context2.getSystemService("keyguard")) == null) {
                    return;
                }
                boolean zIsDeviceLocked = keyguardManager.isDeviceLocked();
                q92Var.a(q92Var.b, zIsDeviceLocked);
                q92Var.c = zIsDeviceLocked;
                return;
            case 9:
                Handler handler = z92.h;
                if (handler != null) {
                    handler.post(z92.i);
                    z92.h.postDelayed(z92.j, 200L);
                    return;
                }
                return;
            case 10:
            default:
                return;
        }
    }

    public /* synthetic */ t8(int i) {
        this.f = i;
    }

    private final void a() {
    }

    private final /* synthetic */ void b() {
    }

    private final /* synthetic */ void c() {
    }

    private final /* synthetic */ void d() {
    }

    private final void e() {
    }

    private final /* synthetic */ void f() {
    }
}
