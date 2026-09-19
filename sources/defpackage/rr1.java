package defpackage;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.zzbub;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class rr1 {
    public final r52 a;
    public final qr1 b;

    public rr1(r52 r52Var, qr1 qr1Var) {
        this.a = r52Var;
        this.b = qr1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v14, types: [l41] */
    /* JADX WARN: Type inference failed for: r5v15, types: [n41] */
    /* JADX WARN: Type inference failed for: r5v16, types: [b51] */
    /* JADX WARN: Type inference failed for: r5v17, types: [n41] */
    /* JADX WARN: Type inference failed for: r5v18, types: [b51] */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v6, types: [l41] */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final s52 a(String str, JSONObject jSONObject) {
        ?? W;
        ?? r5;
        qr1 qr1Var = this.b;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                W = new b51(new AdMobAdapter());
            } else if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str)) {
                W = new b51(new zzbub());
            } else {
                W = (l41) ((AtomicReference) this.a.i).get();
                if (W == 0) {
                    jn.T("Unexpected call to adapter creator.");
                    throw new RemoteException();
                }
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    try {
                        r5 = W;
                        String string = jSONObject.getString("class_name");
                        if (W.O(string)) {
                            W = W.w("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
                        } else {
                            W = W.I(string) ? W.w(string) : W.w("com.google.ads.mediation.customevent.CustomEventAdapter");
                        }
                    } catch (JSONException e) {
                        jn.P("Invalid custom event.", e);
                        r5 = W;
                        r5 = W;
                        W = r5.w(str);
                    }
                } else {
                    r5 = W;
                    W = r5.w(str);
                }
            }
            s52 s52Var = new s52(W);
            qr1Var.a(str, s52Var);
            return s52Var;
        } catch (Throwable th) {
            if (((Boolean) tu0.e.c.a(lx0.fa)).booleanValue()) {
                qr1Var.a(str, null);
            }
            throw new l52(th);
        }
    }

    public final s51 b(String str) throws RemoteException {
        l41 l41Var = (l41) ((AtomicReference) this.a.i).get();
        if (l41Var == null) {
            jn.T("Unexpected call to adapter creator.");
            j7.n();
            return null;
        }
        s51 s51VarF = l41Var.F(str);
        qr1 qr1Var = this.b;
        synchronized (qr1Var) {
            if (qr1Var.a.containsKey(str)) {
                return s51VarF;
            }
            try {
                qr1Var.a.put(str, new pr1(str, s51VarF.d(), s51VarF.e(), true));
                return s51VarF;
            } catch (Throwable unused) {
                return s51VarF;
            }
        }
    }
}
