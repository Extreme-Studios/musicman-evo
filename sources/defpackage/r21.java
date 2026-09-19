package defpackage;

import android.net.Uri;
import android.os.Parcel;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class r21 implements xm2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public r21(ie2 ie2Var) {
        this.a = 15;
        Objects.requireNonNull(ie2Var);
        this.b = ie2Var;
    }

    @Override // defpackage.xm2
    public final hp b(Object obj) throws JSONException, au1 {
        int length;
        j53 j53Var;
        qm2 qm2VarM;
        p02 p02Var;
        d62 d62Var;
        x32 x32Var;
        xn2 xn2VarF;
        int i = 0;
        int i2 = 4;
        int i3 = 2;
        int i4 = 5;
        int i5 = 1;
        switch (this.a) {
            case 0:
                p21 p21Var = (p21) obj;
                cb1 cb1Var = new cb1();
                q21 q21Var = new q21(this, cb1Var);
                n21 n21Var = (n21) this.b;
                Parcel parcelU = p21Var.U();
                kt0.c(parcelU, n21Var);
                kt0.e(parcelU, q21Var);
                p21Var.O0(parcelU, 2);
                return cb1Var;
            case 1:
                d91 d91Var = (d91) this.b;
                Map map = (Map) obj;
                d91Var.getClass();
                if (map != null) {
                    try {
                        for (String str : map.keySet()) {
                            JSONArray jSONArrayOptJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                            if (jSONArrayOptJSONArray != null) {
                                Object obj2 = d91Var.h;
                                synchronized (obj2) {
                                    try {
                                        length = jSONArrayOptJSONArray.length();
                                        synchronized (obj2) {
                                            try {
                                                j53Var = (j53) d91Var.b.get(str);
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                        }
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                    break;
                                }
                                if (j53Var == null) {
                                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 50);
                                    sb.append("Cannot find the corresponding resource object for ");
                                    sb.append(str);
                                    ss0.B(sb.toString());
                                } else {
                                    for (int i6 = 0; i6 < length; i6++) {
                                        String string = jSONArrayOptJSONArray.getJSONObject(i6).getString("threat_type");
                                        j53Var.b();
                                        ((k53) j53Var.g).F(string);
                                    }
                                    d91Var.f |= length > 0;
                                }
                            }
                        }
                    } catch (JSONException e) {
                        if (((Boolean) cz0.a.u()).booleanValue()) {
                            jn.H("Failed to get SafeBrowsing metadata", e);
                        }
                        return na1.C(new Exception("Safebrowsing report transmission failed."));
                    }
                }
                if (d91Var.f) {
                    synchronized (d91Var.h) {
                        n43 n43Var = d91Var.a;
                        n43Var.b();
                        ((s53) n43Var.g).N(10);
                        break;
                    }
                }
                boolean z = d91Var.f;
                if (!(z && d91Var.g.l) && (!(d91Var.k && d91Var.g.k) && (z || !d91Var.g.i))) {
                    return kn2.g;
                }
                synchronized (d91Var.h) {
                    try {
                        for (j53 j53Var2 : d91Var.b.values()) {
                            n43 n43Var2 = d91Var.a;
                            k53 k53Var = (k53) j53Var2.c();
                            n43Var2.b();
                            ((s53) n43Var2.g).G(k53Var);
                        }
                        n43 n43Var3 = d91Var.a;
                        ArrayList arrayList = d91Var.c;
                        n43Var3.b();
                        ((s53) n43Var3.g).L(arrayList);
                        ArrayList arrayList2 = d91Var.d;
                        n43Var3.b();
                        ((s53) n43Var3.g).M(arrayList2);
                        if (((Boolean) cz0.a.u()).booleanValue()) {
                            String strZ = ((s53) n43Var3.g).z();
                            String strB = ((s53) n43Var3.g).B();
                            StringBuilder sb2 = new StringBuilder(String.valueOf(strZ).length() + 38 + String.valueOf(strB).length() + 15);
                            sb2.append("Sending SB report\n  url: ");
                            sb2.append(strZ);
                            sb2.append("\n  clickUrl: ");
                            sb2.append(strB);
                            sb2.append("\n  resources: \n");
                            StringBuilder sb3 = new StringBuilder(sb2.toString());
                            for (k53 k53Var2 : Collections.unmodifiableList(((s53) n43Var3.g).A())) {
                                sb3.append("    [");
                                sb3.append(k53Var2.A());
                                sb3.append("] ");
                                sb3.append(k53Var2.z());
                            }
                            ss0.B(sb3.toString());
                        }
                        sz0 sz0VarA = new n11(d91Var.e).a(1, d91Var.g.g, null, ((s53) n43Var3.c()).b());
                        if (((Boolean) cz0.a.u()).booleanValue()) {
                            sz0VarA.f.a(t8.g, za1.a);
                        }
                        qm2VarM = na1.M(sz0VarA, lh0.f, za1.g);
                    } catch (Throwable th3) {
                        throw th3;
                    }
                    break;
                }
                return qm2VarM;
            case 2:
                String str2 = (String) tu0.e.c.a(lx0.Ya);
                Uri.Builder builder = (Uri.Builder) this.b;
                builder.appendQueryParameter(str2, "12");
                return na1.t(builder.toString());
            case 3:
                ((kd0) this.b).w((Throwable) obj);
                return kn2.g;
            case 4:
                return ((bv1) this.b).d((r71) obj);
            case 5:
                return obj != null ? (qm2) this.b : na1.C(new ky1("Retrieve required value in native ad response failed.", 1));
            case 6:
                ev1 ev1Var = (ev1) obj;
                return na1.t(new e52(new gv1(i4, ((qu1) this.b).c), y91.r(new InputStreamReader(ev1Var.a), ev1Var.b.r)));
            case 7:
                ru1 ru1Var = (ru1) this.b;
                return na1.t(new e52(new gv1(i4, ru1Var.d), y91.r(new StringReader(((JSONObject) obj).toString()), ru1Var.o)));
            case 8:
                String str3 = (String) obj;
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                String str4 = (String) this.b;
                try {
                    jSONObject3.put("headers", new JSONObject());
                    jSONObject3.put("body", str3);
                    jSONObject2.put("base_url", "");
                    jSONObject2.put("signals", new JSONObject(str4));
                    jSONObject.put("request", jSONObject2);
                    jSONObject.put("response", jSONObject3);
                    jSONObject.put("flags", new JSONObject());
                    return na1.t(jSONObject);
                } catch (JSONException e2) {
                    throw new JSONException("Preloaded loader: ".concat(String.valueOf(e2.getCause())));
                }
            case 9:
                t12 t12Var = (t12) this.b;
                Throwable th4 = (Throwable) obj;
                if (((Boolean) tu0.e.c.a(lx0.v2)).booleanValue()) {
                    m22 m22Var = t12Var.a;
                    sa1 sa1Var = vc3.C.h;
                    int iC = m22Var.c();
                    StringBuilder sb4 = new StringBuilder(String.valueOf(iC).length() + 22);
                    sb4.append("OptionalSignalTimeout:");
                    sb4.append(iC);
                    sa1Var.d(sb4.toString(), th4);
                }
                return kn2.g;
            case 10:
                Throwable th5 = (Throwable) obj;
                String str5 = "";
                ((u22) this.b).c.a(new ly1(i3, th5));
                if (th5 instanceof SecurityException) {
                    p02Var = new p02(str5, i3, i5);
                } else if (th5 instanceof IllegalStateException) {
                    p02Var = new p02(str5, 3, i5);
                } else if (th5 instanceof IllegalArgumentException) {
                    p02Var = new p02(str5, i2, i5);
                } else {
                    p02Var = th5 instanceof TimeoutException ? new p02(str5, i4, i5) : new p02(str5, i, i5);
                }
                return na1.t(p02Var);
            case 11:
                return na1.t(new f02((String) ((c02) this.b).c, i2));
            case 12:
                es0 es0Var = (es0) this.b;
                j62 j62Var = (j62) obj;
                if (j62Var == null || (d62Var = j62Var.a) == null || (x32Var = j62Var.b) == null) {
                    throw new au1("Empty prefetch", 1);
                }
                bw0 bw0VarZ = gw0.z();
                zv0 zv0VarA = aw0.A();
                zv0VarA.b();
                ((aw0) zv0VarA.g).B();
                dw0 dw0VarA = dw0.A();
                zv0VarA.b();
                ((aw0) zv0VarA.g).C(dw0VarA);
                bw0VarZ.b();
                ((gw0) bw0VarZ.g).A((aw0) zv0VarA.c());
                d62Var.a.a().f.y0((gw0) bw0VarZ.c());
                return es0Var.u(d62Var, x32Var.b);
            case 13:
                g92 g92Var = (g92) this.b;
                Exception exc = (Exception) obj;
                synchronized (g92Var) {
                    try {
                        g92Var.b = true;
                        throw exc;
                    } catch (Throwable th6) {
                        throw th6;
                    }
                }
            case 14:
                return na1.t(((n62) this.b).b(obj));
            case 15:
                ge2 ge2Var = (ge2) obj;
                if (ge2Var != null) {
                    return na1.t(ge2Var);
                }
                ie2 ie2Var = (ie2) this.b;
                ie2Var.e.b(51);
                return na1.L(fn2.r(na1.F(new he2(ie2Var, 2), ie2Var.d)), kg0.o, cn2.f);
            case 16:
                return ((gg2) ((tf2) this.b).b.c()).c();
            case 17:
                ig2 ig2Var = (ig2) this.b;
                if (!ig2Var.a.a((fe2) obj)) {
                    ig2Var.e.b(20103);
                    throw new na(1);
                }
                ng2 ng2Var = ig2Var.b;
                switch (ng2Var.a) {
                    case 0:
                        kd2 kd2Var = ng2Var.c;
                        kd2Var.getClass();
                        xn2VarF = na1.F(new s22(i4, kd2Var), kd2Var.b);
                        ng2Var.e.d(15304, xn2VarF);
                        break;
                    default:
                        kd2 kd2Var2 = ng2Var.c;
                        kd2Var2.getClass();
                        xn2VarF = na1.F(new s22(i4, kd2Var2), kd2Var2.b);
                        ng2Var.e.d(20304, xn2VarF);
                        break;
                }
                return na1.M(xn2VarF, new zl0(13, ig2Var), cn2.f);
            default:
                return ((ng2) ((lg2) this.b).f).a();
        }
    }

    public /* synthetic */ r21(g92 g92Var, gv1 gv1Var) {
        this.a = 13;
        this.b = g92Var;
    }

    public r21(vb vbVar, n21 n21Var) {
        this.a = 0;
        this.b = n21Var;
    }

    public /* synthetic */ r21(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
