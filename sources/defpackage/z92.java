package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.WeakHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class z92 {
    public static final z92 f = new z92();
    public static final Handler g = new Handler(Looper.getMainLooper());
    public static Handler h = null;
    public static final t8 i = new t8(8);
    public static final t8 j = new t8(9);
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final qx1 d = new qx1();
    public final vg2 c = new vg2(21);
    public final us2 e = new us2(24, new r52(25));

    public static void b() {
        if (h == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            h = handler;
            handler.post(i);
            h.postDelayed(j, 200L);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(View view, gv1 gv1Var, JSONObject jSONObject, boolean z) {
        Object obj;
        Object[] objArr;
        int i2;
        if (ar.r(view) == null) {
            qx1 qx1Var = this.d;
            char c = ((HashSet) qx1Var.j).contains(view) ? (char) 1 : qx1Var.f ? (char) 2 : (char) 3;
            if (c == 3) {
                return;
            }
            JSONObject jSONObjectG = gv1Var.g(view);
            v92.c(jSONObject, jSONObjectG);
            HashMap map = (HashMap) qx1Var.g;
            if (map.size() == 0) {
                obj = null;
            } else {
                Object obj2 = (String) map.get(view);
                if (obj2 != null) {
                    map.remove(view);
                }
                obj = obj2;
            }
            boolean z2 = false;
            if (obj != null) {
                try {
                    jSONObjectG.put("adSessionId", obj);
                } catch (JSONException e) {
                    hn.u("Error with setting ad session id", e);
                }
                WeakHashMap weakHashMap = (WeakHashMap) qx1Var.o;
                if (weakHashMap.containsKey(view)) {
                    weakHashMap.put(view, Boolean.TRUE);
                } else {
                    z2 = true;
                }
                try {
                    jSONObjectG.put("hasWindowFocus", Boolean.valueOf(z2));
                } catch (JSONException e2) {
                    hn.u("Error with setting has window focus", e2);
                }
                boolean zContains = ((HashSet) qx1Var.n).contains(obj);
                Object objValueOf = Boolean.valueOf(zContains);
                if (zContains) {
                    try {
                        jSONObjectG.put("isPipActive", objValueOf);
                    } catch (JSONException e3) {
                        hn.u("Error with setting is picture-in-picture active", e3);
                    }
                }
                qx1Var.f = true;
                return;
            }
            HashMap map2 = (HashMap) qx1Var.h;
            x92 x92Var = (x92) map2.get(view);
            if (x92Var != null) {
                map2.remove(view);
            }
            if (x92Var != null) {
                l92 l92Var = x92Var.a;
                JSONArray jSONArray = new JSONArray();
                ArrayList arrayList = x92Var.b;
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    jSONArray.put((String) arrayList.get(i3));
                }
                try {
                    jSONObjectG.put("isFriendlyObstructionFor", jSONArray);
                    jSONObjectG.put("friendlyObstructionClass", l92Var.b);
                    jSONObjectG.put("friendlyObstructionPurpose", l92Var.c);
                    jSONObjectG.put("friendlyObstructionReason", l92Var.d);
                } catch (JSONException e4) {
                    hn.u("Error with setting friendly obstruction", e4);
                }
                objArr = true;
            } else {
                objArr = false;
            }
            boolean z3 = z || objArr == true;
            boolean z4 = c == 1;
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (!z4) {
                    for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                        a(viewGroup.getChildAt(i4), gv1Var, jSONObjectG, z3);
                    }
                    return;
                }
                HashMap map3 = new HashMap();
                for (int i5 = 0; i5 < viewGroup.getChildCount(); i5++) {
                    View childAt = viewGroup.getChildAt(i5);
                    ArrayList arrayList2 = (ArrayList) map3.get(Float.valueOf(childAt.getZ()));
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        map3.put(Float.valueOf(childAt.getZ()), arrayList2);
                    }
                    arrayList2.add(childAt);
                }
                ArrayList arrayList3 = new ArrayList(map3.keySet());
                Collections.sort(arrayList3);
                int size2 = arrayList3.size();
                int i6 = 0;
                while (i6 < size2) {
                    ArrayList arrayList4 = (ArrayList) map3.get((Float) arrayList3.get(i6));
                    int size3 = arrayList4.size();
                    int i7 = 0;
                    while (true) {
                        i2 = i6 + 1;
                        if (i7 < size3) {
                            a((View) arrayList4.get(i7), gv1Var, jSONObjectG, z3);
                            i7++;
                        }
                    }
                    i6 = i2;
                }
            }
        }
    }
}
