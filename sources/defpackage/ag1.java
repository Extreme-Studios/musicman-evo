package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ag1 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ bg1 g;
    public final /* synthetic */ Runnable h;

    public /* synthetic */ ag1(bg1 bg1Var, Runnable runnable, int i) {
        this.f = i;
        this.g = bg1Var;
        this.h = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        Runnable runnable = this.h;
        bg1 bg1Var = this.g;
        switch (i) {
            case 0:
                za1.f.execute(new ag1(bg1Var, runnable, 1));
                return;
            default:
                dq.d("Adapters must be initialized on the main thread.");
                HashMap map = vc3.C.h.g().m().c;
                if (map.isEmpty()) {
                    return;
                }
                if (runnable != null) {
                    try {
                        runnable.run();
                    } catch (Throwable th) {
                        jn.V("Could not initialize rewarded ads.", th);
                        return;
                    }
                    break;
                }
                if (((l41) ((AtomicReference) bg1Var.h.a.i).get()) != null) {
                    HashMap map2 = new HashMap();
                    Iterator it = map.values().iterator();
                    while (it.hasNext()) {
                        for (h41 h41Var : ((i41) it.next()).a) {
                            String str = h41Var.b;
                            for (String str2 : h41Var.a) {
                                if (!map2.containsKey(str2)) {
                                    map2.put(str2, new ArrayList());
                                }
                                if (str != null) {
                                    ((List) map2.get(str2)).add(str);
                                }
                            }
                        }
                    }
                    JSONObject jSONObject = new JSONObject();
                    for (Map.Entry entry : map2.entrySet()) {
                        String str3 = (String) entry.getKey();
                        try {
                            ww1 ww1VarA = bg1Var.i.a(str3, jSONObject);
                            if (ww1VarA != null) {
                                s52 s52Var = (s52) ww1VarA.b;
                                boolean zA = s52Var.a();
                                n41 n41Var = s52Var.a;
                                if (!zA) {
                                    try {
                                        if (n41Var.J()) {
                                            try {
                                                n41Var.W2(new ju(bg1Var.f), (px1) ww1VarA.c, (List) entry.getValue());
                                                StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 45);
                                                sb.append("Initialized rewarded video mediation adapter ");
                                                sb.append(str3);
                                                jn.F(sb.toString());
                                            } catch (Throwable th2) {
                                                throw new l52(th2);
                                            }
                                        }
                                    } catch (Throwable th3) {
                                        throw new l52(th3);
                                    }
                                }
                            }
                        } catch (l52 e) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 56);
                            sb2.append("Failed to initialize rewarded video mediation adapter \"");
                            sb2.append(str3);
                            sb2.append("\"");
                            jn.V(sb2.toString(), e);
                        }
                    }
                    return;
                }
                return;
        }
    }
}
