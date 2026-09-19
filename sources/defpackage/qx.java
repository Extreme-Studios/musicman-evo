package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class qx {
    public final lu1 a;
    public final ArrayList b = new ArrayList();
    public final u2 c;

    public qx(lu1 lu1Var) {
        this.a = lu1Var;
        if (lu1Var != null) {
            try {
                List<ee3> listE = lu1Var.e();
                if (listE != null) {
                    for (ee3 ee3Var : listE) {
                        u2 u2Var = ee3Var != null ? new u2(ee3Var) : null;
                        if (u2Var != null) {
                            this.b.add(u2Var);
                        }
                    }
                }
            } catch (RemoteException e) {
                jn.P("Could not forward getAdapterResponseInfo to ResponseInfo.", e);
            }
        }
        lu1 lu1Var2 = this.a;
        if (lu1Var2 == null) {
            return;
        }
        try {
            ee3 ee3VarF = lu1Var2.f();
            if (ee3VarF != null) {
                this.c = new u2(ee3VarF);
            }
        } catch (RemoteException e2) {
            jn.P("Could not forward getLoadedAdapterResponse to ResponseInfo.", e2);
        }
    }

    public final JSONObject a() throws JSONException {
        String strD;
        Bundle bundleJ;
        JSONObject jSONObject = new JSONObject();
        String strB = null;
        lu1 lu1Var = this.a;
        if (lu1Var != null) {
            try {
                strD = lu1Var.d();
            } catch (RemoteException e) {
                jn.P("Could not forward getResponseId to ResponseInfo.", e);
                strD = null;
            }
        } else {
            strD = null;
        }
        if (strD == null) {
            jSONObject.put("Response ID", "null");
        } else {
            jSONObject.put("Response ID", strD);
        }
        if (lu1Var != null) {
            try {
                strB = lu1Var.b();
            } catch (RemoteException e2) {
                jn.P("Could not forward getMediationAdapterClassName to ResponseInfo.", e2);
            }
        }
        if (strB == null) {
            jSONObject.put("Mediation Adapter Class Name", "null");
        } else {
            jSONObject.put("Mediation Adapter Class Name", strB);
        }
        JSONArray jSONArray = new JSONArray();
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            jSONArray.put(((u2) obj).a());
        }
        jSONObject.put("Adapter Responses", jSONArray);
        u2 u2Var = this.c;
        if (u2Var != null) {
            jSONObject.put("Loaded Adapter Response", u2Var.a());
        }
        if (lu1Var != null) {
            try {
                bundleJ = lu1Var.j();
            } catch (RemoteException e3) {
                jn.P("Could not forward getResponseExtras to ResponseInfo.", e3);
                bundleJ = new Bundle();
            }
        } else {
            bundleJ = new Bundle();
        }
        if (bundleJ != null) {
            jSONObject.put("Response Extras", ut0.f.a.k(bundleJ));
        }
        return jSONObject;
    }

    public final String toString() {
        try {
            return a().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
