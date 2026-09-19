package defpackage;

import android.os.RemoteException;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class qy1 implements vw1 {
    public final /* synthetic */ int a;
    public final rr1 b;
    public final Object c;

    public qy1(rr1 rr1Var) {
        this.a = 0;
        this.c = new HashMap();
        this.b = rr1Var;
    }

    @Override // defpackage.vw1
    public final ww1 a(String str, JSONObject jSONObject) {
        ww1 ww1Var;
        s51 s51VarB;
        switch (this.a) {
            case 0:
                synchronized (this) {
                    try {
                        HashMap map = (HashMap) this.c;
                        ww1Var = (ww1) map.get(str);
                        if (ww1Var == null) {
                            ww1Var = new ww1(this.b.a(str, jSONObject), new px1(), str);
                            map.put(str, ww1Var);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return ww1Var;
            default:
                if (((Boolean) tu0.e.c.a(lx0.M1)).booleanValue()) {
                    try {
                        s51VarB = this.b.b(str);
                    } catch (RemoteException e) {
                        jn.P("Coundn't create RTB adapter: ", e);
                    }
                    break;
                } else {
                    ConcurrentHashMap concurrentHashMap = ((cz1) this.c).a;
                    s51VarB = concurrentHashMap.containsKey(str) ? (s51) concurrentHashMap.get(str) : null;
                }
                if (s51VarB == null) {
                    return null;
                }
                return new ww1(s51VarB, new nx1(), str);
        }
    }

    public qy1(cz1 cz1Var, rr1 rr1Var) {
        this.a = 1;
        this.c = cz1Var;
        this.b = rr1Var;
    }
}
