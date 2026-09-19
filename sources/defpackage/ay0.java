package defpackage;

import android.content.Context;
import android.os.Bundle;
import java.util.Date;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class ay0 {
    public final ScheduledExecutorService a;
    public final x93 b;
    public final g32 c;
    public final hs1 d;
    public q7 e;
    public yx0 f;
    public u40 g;
    public String h;
    public long i = 0;
    public long j;
    public JSONArray k;
    public Context l;

    public ay0(ScheduledExecutorService scheduledExecutorService, x93 x93Var, g32 g32Var, hs1 hs1Var) {
        this.a = scheduledExecutorService;
        this.b = x93Var;
        this.c = g32Var;
        this.d = hs1Var;
    }

    public final void a(String str) {
        try {
            u40 u40Var = this.g;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("gsppack", true);
            jSONObject.put("fpt", new Date(this.j).toString());
            e(jSONObject);
            if (((Boolean) wy0.c.u()).booleanValue()) {
                jSONObject.put("as", this.c.b());
            }
            u40Var.h(jSONObject.toString());
            zx0 zx0Var = new zx0(this, str);
            if (((Boolean) wy0.e.u()).booleanValue()) {
                this.b.a(this.g, zx0Var);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("query_info_type", "requester_type_6");
            s70.h(this.l, new q2((p2) new p2(1).f1(bundle)), zx0Var);
        } catch (JSONException e) {
            jn.P("Error creating JSON: ", e);
        }
    }

    public final JSONObject b(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put("error", str2);
        jSONObject.put("sdk_ttl_ms", ((Boolean) wy0.e.u()).booleanValue() ? ((Long) wy0.h.u()).longValue() : 0L);
        e(jSONObject);
        if (((Boolean) wy0.c.u()).booleanValue()) {
            jSONObject.put("as", this.c.b());
        }
        return jSONObject;
    }

    public final JSONObject c(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put("signal", str2);
        jSONObject.put("sdk_ttl_ms", ((Boolean) wy0.e.u()).booleanValue() ? ((Long) wy0.h.u()).longValue() : 0L);
        e(jSONObject);
        if (((Boolean) wy0.c.u()).booleanValue()) {
            jSONObject.put("as", this.c.b());
        }
        return jSONObject;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003a  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
    
        if (((java.lang.Boolean) defpackage.tu0.e.c.a(defpackage.lx0.Ga)).booleanValue() != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            r7 = this;
            yx0 r0 = r7.f
            if (r0 != 0) goto La
            java.lang.String r7 = "PACT callback is not present, please initialize the PawCustomTabsImpl."
            defpackage.jn.M(r7)
            return
        La:
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.a
            boolean r0 = r0.get()
            if (r0 == 0) goto L13
            return
        L13:
            java.lang.String r0 = r7.h
            if (r0 == 0) goto L98
            u40 r0 = r7.g
            if (r0 == 0) goto L98
            java.util.concurrent.ScheduledExecutorService r0 = r7.a
            if (r0 == 0) goto L98
            long r1 = r7.i
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L28
            goto L3a
        L28:
            vc3 r1 = defpackage.vc3.C
            ae r1 = r1.k
            r1.getClass()
            long r1 = android.os.SystemClock.elapsedRealtime()
            long r3 = r7.i
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 > 0) goto L3a
            goto L4c
        L3a:
            ix0 r1 = defpackage.lx0.Ga
            tu0 r2 = defpackage.tu0.e
            kx0 r2 = r2.c
            java.lang.Object r1 = r2.a(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L98
        L4c:
            u40 r1 = r7.g
            java.lang.String r2 = r7.h
            android.net.Uri r2 = android.net.Uri.parse(r2)
            r1.getClass()
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            java.lang.Object r4 = r1.i
            id r4 = (defpackage.id) r4
            java.lang.Object r1 = r1.h
            pm r1 = (defpackage.pm) r1
            android.os.Bundle r5 = new android.os.Bundle     // Catch: android.os.RemoteException -> L80
            r5.<init>()     // Catch: android.os.RemoteException -> L80
            boolean r6 = r5.isEmpty()     // Catch: android.os.RemoteException -> L80
            if (r6 == 0) goto L70
            r5 = 0
        L70:
            if (r5 == 0) goto L7b
            r3.putAll(r5)     // Catch: android.os.RemoteException -> L80
            nm r1 = (defpackage.nm) r1     // Catch: android.os.RemoteException -> L80
            r1.K0(r4, r2, r3)     // Catch: android.os.RemoteException -> L80
            goto L80
        L7b:
            nm r1 = (defpackage.nm) r1     // Catch: android.os.RemoteException -> L80
            r1.Y(r4, r2)     // Catch: android.os.RemoteException -> L80
        L80:
            q7 r7 = r7.e
            ix0 r1 = defpackage.lx0.Ha
            tu0 r2 = defpackage.tu0.e
            kx0 r2 = r2.c
            java.lang.Object r1 = r2.a(r1)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.schedule(r7, r1, r3)
            return
        L98:
            java.lang.String r7 = "PACT max retry connection duration timed out"
            defpackage.jn.p(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ay0.d():void");
    }

    public final void e(JSONObject jSONObject) {
        try {
            if (this.k == null) {
                this.k = new JSONArray((String) tu0.e.c.a(lx0.Ja));
            }
            jSONObject.put("eids", this.k);
        } catch (JSONException e) {
            jn.P("Error fetching the PACT active eids JSON: ", e);
        }
    }
}
