package defpackage;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class a71 implements SharedPreferences.OnSharedPreferenceChangeListener {
    public final /* synthetic */ int a;
    public final Object b;
    public Object c;

    public a71() {
        this.a = 3;
        this.b = new JSONObject();
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        int i = 0;
        switch (this.a) {
            case 0:
                v81 v81Var = (v81) this.c;
                synchronized (v81Var) {
                    try {
                        ArrayList arrayList = v81Var.b;
                        int size = arrayList.size();
                        int i2 = 0;
                        while (i2 < size) {
                            Object obj = arrayList.get(i2);
                            i2++;
                            String str2 = (String) this.b;
                            HashMap map = ((z71) obj).a;
                            if (map.containsKey(str2) && ((Set) map.get(str2)).contains(str)) {
                                vc3.C.h.g().t(false);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            case 1:
                ca1 ca1Var = (ca1) this.c;
                synchronized (ca1Var) {
                    try {
                        ArrayList arrayList2 = ca1Var.b;
                        int size2 = arrayList2.size();
                        while (i < size2) {
                            Object obj2 = arrayList2.get(i);
                            i++;
                            ba1 ba1Var = (ba1) obj2;
                            String str3 = (String) this.b;
                            ca1 ca1Var2 = ba1Var.a;
                            HashMap map2 = ba1Var.b;
                            ca1Var2.getClass();
                            if (map2.containsKey(str3) && ((Set) map2.get(str3)).contains(str)) {
                                z61 z61Var = ca1Var2.d;
                                ((ae) z61Var.g).getClass();
                                ((h91) z61Var.h).a(-1, System.currentTimeMillis());
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return;
            case 2:
                hs1 hs1Var = (hs1) this.c;
                hs1Var.j.set(w40.h0(hs1Var.b, (String) this.b));
                return;
            default:
                if (str != null && ((List) this.c).contains(str)) {
                    try {
                        Object obj3 = sharedPreferences.getAll().get(str);
                        JSONObject jSONObject = (JSONObject) this.b;
                        if (obj3 == null) {
                            jSONObject.remove(str);
                        } else {
                            jSONObject.put(str, obj3);
                        }
                        return;
                    } catch (JSONException e) {
                        vc3.C.h.e("InspectorSharedPreferenceCollector.onSharedPreferenceChanged", e);
                        return;
                    }
                }
                return;
        }
    }

    public /* synthetic */ a71(String str, hs1 hs1Var) {
        this.a = 2;
        this.c = hs1Var;
        this.b = str;
    }

    public a71(v81 v81Var, String str) {
        this.a = 0;
        Objects.requireNonNull(v81Var);
        this.c = v81Var;
        this.b = str;
    }

    public a71(ca1 ca1Var, String str) {
        this.a = 1;
        Objects.requireNonNull(ca1Var);
        this.c = ca1Var;
        this.b = str;
    }
}
