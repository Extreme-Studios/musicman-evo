package defpackage;

import android.os.Bundle;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class s12 implements j22 {
    public final /* synthetic */ int a;
    public final HashMap b;

    public /* synthetic */ s12(HashMap map, int i) {
        this.a = i;
        this.b = map;
    }

    @Override // defpackage.j22
    public final void b(Object obj) {
        int i = this.a;
        HashMap map = this.b;
        switch (i) {
            case 0:
                rj1 rj1Var = (rj1) obj;
                if (!map.isEmpty()) {
                    Bundle bundle = rj1Var.a;
                    JSONArray jSONArray = new JSONArray();
                    for (Map.Entry entry : map.entrySet()) {
                        ArrayDeque arrayDeque = (ArrayDeque) entry.getValue();
                        if (!arrayDeque.isEmpty()) {
                            ns1 ns1Var = (ns1) entry.getKey();
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put("id", ns1Var.a);
                                jSONObject.put("event_type", ns1Var.b);
                                JSONArray jSONArray2 = new JSONArray();
                                Iterator it = arrayDeque.iterator();
                                while (it.hasNext()) {
                                    jSONArray2.put((Long) it.next());
                                }
                                jSONObject.put("timestamps", jSONArray2);
                                jSONArray.put(jSONObject);
                            } catch (JSONException e) {
                                jn.w("Failed putting the on-device storage record.", e);
                            }
                        }
                    }
                    if (jSONArray.length() > 0) {
                        bundle.putString("on_device_storage_records", jSONArray.toString());
                    }
                    break;
                }
                break;
            default:
                try {
                    ((JSONObject) obj).put("video_decoders", ut0.f.a.j(map));
                } catch (JSONException e2) {
                    jn.p("Could not encode video decoder properties: ".concat(String.valueOf(e2.getMessage())));
                }
                break;
        }
    }
}
