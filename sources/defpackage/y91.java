package defpackage;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.core.graphics.drawable.IconCompat;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.net.URISyntaxException;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.zip.Inflater;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class y91 implements qi0, hn2, eb1, bv0, pn1, n62 {
    public static y91 k;
    public final /* synthetic */ int f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;

    /* JADX WARN: Multi-variable type inference failed */
    public y91(gu guVar) {
        int i;
        ArrayList arrayList;
        int i2;
        this.f = 2;
        new ArrayList();
        this.j = new Bundle();
        this.i = guVar;
        Context context = guVar.a;
        ArrayList arrayList2 = guVar.q;
        ArrayList arrayList3 = guVar.c;
        ArrayList arrayList4 = guVar.d;
        this.g = context;
        if (Build.VERSION.SDK_INT >= 26) {
            this.h = um.a(context, guVar.n);
        } else {
            this.h = new Notification.Builder(context);
        }
        Notification notification = guVar.p;
        Context context2 = null;
        ((Notification.Builder) this.h).setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((2 & notification.flags) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(guVar.e).setContentText(guVar.f).setContentInfo(null).setContentIntent(guVar.g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(0).setProgress(0, 0, false);
        Notification.Builder builder = (Notification.Builder) this.h;
        IconCompat iconCompat = guVar.h;
        builder.setLargeIcon(iconCompat == null ? null : iconCompat.f(context));
        ((Notification.Builder) this.h).setSubText(null).setUsesChronometer(false).setPriority(guVar.i);
        ArrayList arrayList5 = guVar.b;
        int size = arrayList5.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList5.get(i3);
            i3++;
            zt ztVar = (zt) obj;
            if (ztVar.b == null && (i2 = ztVar.e) != 0) {
                ztVar.b = IconCompat.b(i2);
            }
            IconCompat iconCompat2 = ztVar.b;
            boolean z = ztVar.c;
            Bundle bundle = ztVar.a;
            ArrayList arrayList6 = arrayList5;
            Notification.Action.Builder builder2 = new Notification.Action.Builder(iconCompat2 != null ? iconCompat2.f(context2) : context2, ztVar.f, ztVar.g);
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            bundle2.putBoolean("android.support.allowGeneratedReplies", z);
            builder2.setAllowGeneratedReplies(z);
            bundle2.putInt("android.support.action.semanticAction", 0);
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 28) {
                pe.o(builder2);
            }
            if (i4 >= 29) {
                z6.g(builder2);
            }
            if (i4 >= 31) {
                hu.a(builder2);
            }
            bundle2.putBoolean("android.support.action.showsUserInterface", ztVar.d);
            builder2.addExtras(bundle2);
            ((Notification.Builder) this.h).addAction(builder2.build());
            arrayList5 = arrayList6;
            context2 = null;
        }
        Bundle bundle3 = guVar.m;
        if (bundle3 != null) {
            ((Bundle) this.j).putAll(bundle3);
        }
        ((Notification.Builder) this.h).setShowWhen(guVar.j);
        ((Notification.Builder) this.h).setLocalOnly(guVar.l);
        ((Notification.Builder) this.h).setGroup(null);
        ((Notification.Builder) this.h).setSortKey(null);
        ((Notification.Builder) this.h).setGroupSummary(false);
        ((Notification.Builder) this.h).setCategory(null);
        ((Notification.Builder) this.h).setColor(0);
        ((Notification.Builder) this.h).setVisibility(0);
        ((Notification.Builder) this.h).setPublicVersion(null);
        ((Notification.Builder) this.h).setSound(notification.sound, notification.audioAttributes);
        if (Build.VERSION.SDK_INT < 28) {
            if (arrayList3 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(arrayList3.size());
                Iterator it = arrayList3.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    j7.j();
                    throw null;
                }
            }
            if (arrayList != null) {
                if (arrayList2 == null) {
                    arrayList2 = arrayList;
                } else {
                    n7 n7Var = new n7(arrayList2.size() + arrayList.size());
                    n7Var.addAll(arrayList);
                    n7Var.addAll(arrayList2);
                    arrayList2 = new ArrayList(n7Var);
                }
            }
        }
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            int size2 = arrayList2.size();
            int i5 = 0;
            while (i5 < size2) {
                Object obj2 = arrayList2.get(i5);
                i5++;
                ((Notification.Builder) this.h).addPerson((String) obj2);
            }
        }
        if (arrayList4.size() > 0) {
            if (guVar.m == null) {
                guVar.m = new Bundle();
            }
            Bundle bundle4 = guVar.m.getBundle("android.car.EXTENSIONS");
            bundle4 = bundle4 == null ? new Bundle() : bundle4;
            Bundle bundle5 = new Bundle(bundle4);
            Bundle bundle6 = new Bundle();
            for (int i6 = 0; i6 < arrayList4.size(); i6++) {
                String string = Integer.toString(i6);
                zt ztVar2 = (zt) arrayList4.get(i6);
                Bundle bundle7 = new Bundle();
                if (ztVar2.b == null && (i = ztVar2.e) != 0) {
                    ztVar2.b = IconCompat.b(i);
                }
                IconCompat iconCompat3 = ztVar2.b;
                Bundle bundle8 = ztVar2.a;
                bundle7.putInt("icon", iconCompat3 != null ? iconCompat3.c() : 0);
                bundle7.putCharSequence("title", ztVar2.f);
                bundle7.putParcelable("actionIntent", ztVar2.g);
                Bundle bundle9 = bundle8 != null ? new Bundle(bundle8) : new Bundle();
                bundle9.putBoolean("android.support.allowGeneratedReplies", ztVar2.c);
                bundle7.putBundle("extras", bundle9);
                bundle7.putParcelableArray("remoteInputs", null);
                bundle7.putBoolean("showsUserInterface", ztVar2.d);
                bundle7.putInt("semanticAction", 0);
                bundle6.putBundle(string, bundle7);
            }
            bundle4.putBundle("invisible_actions", bundle6);
            bundle5.putBundle("invisible_actions", bundle6);
            if (guVar.m == null) {
                guVar.m = new Bundle();
            }
            guVar.m.putBundle("android.car.EXTENSIONS", bundle4);
            ((Bundle) this.j).putBundle("android.car.EXTENSIONS", bundle5);
        }
        ((Notification.Builder) this.h).setExtras(guVar.m);
        ((Notification.Builder) this.h).setRemoteInputHistory(null);
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 26) {
            um.d((Notification.Builder) this.h);
            um.j((Notification.Builder) this.h);
            um.k((Notification.Builder) this.h);
            um.l((Notification.Builder) this.h);
            um.f((Notification.Builder) this.h);
            if (!TextUtils.isEmpty(guVar.n)) {
                ((Notification.Builder) this.h).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i7 >= 28) {
            Iterator it2 = arrayList3.iterator();
            if (it2.hasNext()) {
                it2.next().getClass();
                j7.j();
                throw null;
            }
        }
        if (i7 >= 29) {
            z6.e((Notification.Builder) this.h, guVar.o);
            z6.f((Notification.Builder) this.h);
        }
        if (i7 >= 36) {
            t0.e((Notification.Builder) this.h);
        }
    }

    public static y91 q(Context context, Executor executor, ga2 ga2Var) {
        y91 y91Var = new y91(context, executor, ga2Var, new na2());
        s22 s22Var = new s22(4, y91Var);
        dq.g(executor, "Executor must not be null");
        ve3 ve3Var = new ve3();
        executor.execute(new u52(ve3Var, 26, s22Var));
        ve3Var.b.b(new tk1(executor, new j52(y91Var)));
        ve3Var.h();
        y91Var.j = ve3Var;
        return y91Var;
    }

    public static y91 r(Reader reader, Bundle bundle) {
        try {
            try {
                y91 y91Var = new y91(new JsonReader(reader), bundle);
                ar.b(reader);
                return y91Var;
            } catch (Throwable th) {
                ar.b(reader);
                throw th;
            }
        } catch (IOException | AssertionError | IllegalStateException | NumberFormatException | JSONException e) {
            throw new a52("unable to parse ServerResponse", e);
        }
    }

    public static synchronized y91 v(Context context) {
        try {
            y91 y91Var = k;
            if (y91Var != null) {
                return y91Var;
            }
            Context applicationContext = context.getApplicationContext();
            lx0.a(applicationContext);
            vc3 vc3Var = vc3.C;
            h73 h73VarG = vc3Var.h.g();
            h73VarG.j(applicationContext);
            applicationContext.getClass();
            ae aeVar = vc3Var.k;
            aeVar.getClass();
            aa1 aa1Var = vc3Var.y;
            dq.F(aa1Var, aa1.class);
            y91 y91Var2 = new y91(applicationContext, aeVar, h73VarG, aa1Var);
            k = y91Var2;
            f91 f91Var = (f91) ((q63) y91Var2.h).c();
            SharedPreferences sharedPreferences = f91Var.b;
            sharedPreferences.registerOnSharedPreferenceChangeListener(f91Var);
            f91Var.onSharedPreferenceChanged(sharedPreferences, "gad_has_consent_for_cookies");
            ix0 ix0Var = lx0.J0;
            tu0 tu0Var = tu0.e;
            if (((Boolean) tu0Var.c.a(ix0Var)).booleanValue()) {
                f91Var.onSharedPreferenceChanged(sharedPreferences, "IABTCF_TCString");
            } else {
                f91Var.onSharedPreferenceChanged(sharedPreferences, "IABTCF_PurposeConsents");
            }
            ca1 ca1Var = (ca1) ((q63) k.j).c();
            if (((Boolean) tu0Var.c.a(lx0.D0)).booleanValue()) {
                HashMap mapQ = zb3.Q((String) tu0Var.c.a(lx0.E0));
                Iterator it = mapQ.keySet().iterator();
                while (it.hasNext()) {
                    ca1Var.a((String) it.next());
                }
                ba1 ba1Var = new ba1(ca1Var, mapQ);
                synchronized (ca1Var) {
                    ca1Var.b.add(ba1Var);
                }
            }
            return k;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void A() {
        this.i = 16;
    }

    public void B(js2 js2Var) throws GeneralSecurityException {
        at2 at2Var = new at2(js2Var.a, us2.class);
        HashMap map = (HashMap) this.i;
        if (!map.containsKey(at2Var)) {
            map.put(at2Var, js2Var);
            return;
        }
        js2 js2Var2 = (js2) map.get(at2Var);
        if (!js2Var2.equals(js2Var) || js2Var != js2Var2) {
            throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(at2Var.toString()));
        }
    }

    public synchronized boolean C(mm0 mm0Var) {
        try {
            HashMap map = (HashMap) this.g;
            String strD = mm0Var.d();
            if (!map.containsKey(strD)) {
                map.put(strD, null);
                synchronized (mm0Var.j) {
                    mm0Var.p = this;
                }
                if (tm0.a) {
                    tm0.b("new request, sending to network %s", strD);
                }
                return false;
            }
            List arrayList = (List) map.get(strD);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            mm0Var.a("waiting-for-response");
            arrayList.add(mm0Var);
            map.put(strD, arrayList);
            if (tm0.a) {
                tm0.b("Request for cacheKey=%s is in flight, putting on hold.", strD);
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void D(hs2 hs2Var) throws GeneralSecurityException {
        hs2Var.getClass();
        zs2 zs2Var = new zs2(us2.class, hs2Var.a);
        HashMap map = (HashMap) this.j;
        if (!map.containsKey(zs2Var)) {
            map.put(zs2Var, hs2Var);
            return;
        }
        hs2 hs2Var2 = (hs2) map.get(zs2Var);
        if (!hs2Var2.equals(hs2Var) || hs2Var != hs2Var2) {
            throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(zs2Var.toString()));
        }
    }

    public xk1 E(Set set) {
        return new xk1(set);
    }

    public cp2 F() throws GeneralSecurityException {
        Integer num = (Integer) this.g;
        if (num == null) {
            j7.r("Key size is not set");
            return null;
        }
        if (((Integer) this.h) == null) {
            j7.r("IV size is not set");
            return null;
        }
        if (((Integer) this.i) == null) {
            j7.r("Tag size is not set");
            return null;
        }
        int iIntValue = num.intValue();
        int iIntValue2 = ((Integer) this.h).intValue();
        ((Integer) this.i).getClass();
        return new cp2(iIntValue, iIntValue2, (bp2) this.j);
    }

    public by2 G() throws GeneralSecurityException {
        wo2 wo2Var = wo2.q;
        xo2 xo2Var = (xo2) this.g;
        if (xo2Var == null) {
            j7.r("signature encoding is not set");
            return null;
        }
        zx2 zx2Var = (zx2) this.h;
        if (zx2Var == null) {
            j7.r("EC curve type is not set");
            return null;
        }
        wo2 wo2Var2 = (wo2) this.i;
        if (wo2Var2 == null) {
            j7.r("hash type is not set");
            return null;
        }
        bp2 bp2Var = (bp2) this.j;
        if (zx2Var == zx2.c && wo2Var2 != wo2.o) {
            j7.r("NIST_P256 requires SHA256");
            return null;
        }
        if (zx2Var == zx2.d && wo2Var2 != wo2.p && wo2Var2 != wo2Var) {
            j7.r("NIST_P384 requires SHA384 or SHA512");
            return null;
        }
        if (zx2Var != zx2.e || wo2Var2 == wo2Var) {
            return new by2(xo2Var, zx2Var, wo2Var2, bp2Var);
        }
        j7.r("NIST_P521 requires SHA512");
        return null;
    }

    public void H(int i, hp hpVar) {
        if (((Boolean) tu0.e.c.a(lx0.t2)).booleanValue()) {
            e3 e3Var = new e3(i, 9, this);
            hpVar.a(new in2(hpVar, 0, e3Var), (ya1) this.g);
        }
    }

    public void a(kj kjVar) {
        if (((ArrayList) this.g).contains(kjVar)) {
            j7.d(kjVar, "Fragment already added: ");
            return;
        }
        synchronized (((ArrayList) this.g)) {
            ((ArrayList) this.g).add(kjVar);
        }
        kjVar.p = true;
    }

    @Override // defpackage.eb1
    /* JADX INFO: renamed from: b */
    public void mo11b(Object obj) {
        u31 u31Var = (u31) obj;
        jn.p("callJs > getEngine: Promise fulfilled");
        Object obj2 = this.h;
        cb1 cb1Var = (cb1) this.i;
        c41 c41Var = (c41) this.j;
        r31 r31Var = (r31) this.g;
        c41Var.getClass();
        try {
            zb3 zb3Var = vc3.C.c;
            String string = UUID.randomUUID().toString();
            u11.j.a(string, new b41(r31Var, c41Var, cb1Var));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", string);
            jSONObject.put("args", ((y31) c41Var.d).e(obj2));
            String str = (String) c41Var.b;
            g31 g31Var = (g31) u31Var;
            g31Var.getClass();
            g31Var.s(str, jSONObject.toString());
        } catch (Exception e) {
            try {
                cb1Var.c(e);
                jn.P("Unable to invokeJavascript", e);
            } finally {
                r31Var.p();
            }
        }
    }

    @Override // defpackage.pn1
    public x42 c() {
        return (x42) this.g;
    }

    public kj d(String str) {
        ek ekVar = (ek) ((HashMap) this.h).get(str);
        if (ekVar != null) {
            return ekVar.c;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:145:0x03fc  */
    @Override // defpackage.hn2
    /* JADX INFO: renamed from: e */
    public void mo5e(Object obj) {
        boolean zB;
        boolean z;
        qj1 qj1Var;
        d72 d72Var;
        switch (this.f) {
            case 6:
                String string = (String) obj;
                ix0 ix0Var = lx0.Qa;
                tu0 tu0Var = tu0.e;
                if (((Boolean) tu0Var.c.a(ix0Var)).booleanValue()) {
                    ((Map) this.g).put("u", string);
                }
                f21 f21Var = (f21) this.j;
                ib0 ib0Var = (ib0) this.h;
                Map map = (Map) this.g;
                String str = (String) this.i;
                f21Var.getClass();
                md1 md1Var = (md1) ib0Var;
                x42 x42VarE = md1Var.E();
                z42 z42VarD0 = md1Var.D0();
                String str2 = "";
                boolean zA = false;
                if (x42VarE == null || z42VarD0 == null) {
                    zB = false;
                } else {
                    str2 = z42VarD0.b;
                    zB = x42VarE.b();
                }
                boolean z2 = (((Boolean) tu0Var.c.a(lx0.yb)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("0")) ? false : true;
                boolean z3 = ((Boolean) tu0Var.c.a(lx0.Ad)).booleanValue() && map.containsKey("ig_cl") && ((String) map.get("ig_cl")).equals("true");
                if ("expand".equalsIgnoreCase(str)) {
                    if (md1Var.X0()) {
                        jn.T("Cannot expand WebView that is already expanded.");
                        return;
                    } else {
                        f21Var.h(false);
                        md1Var.Y0(f21.a(map), "1".equals(map.get("custom_close")), z2);
                        return;
                    }
                }
                if ("webapp".equalsIgnoreCase(str)) {
                    f21Var.h(false);
                    boolean z4 = ((Boolean) tu0Var.c.a(lx0.Ic)).booleanValue() && Objects.equals(map.get("is_allowed_for_lock_screen"), "1");
                    if (string != null) {
                        md1Var.G("1".equals(map.get("custom_close")), f21.a(map), string, z2, z4);
                        return;
                    } else {
                        md1Var.v("1".equals(map.get("custom_close")), f21.a(map), (String) map.get("html"), (String) map.get("baseurl"), z2);
                        return;
                    }
                }
                if ("chrome_custom_tab".equalsIgnoreCase(str)) {
                    Context context = md1Var.getContext();
                    if (((Boolean) tu0Var.c.a(lx0.f5)).booleanValue()) {
                        jn.p("User opt out chrome custom tab.");
                        f21Var.i(10);
                    } else {
                        if (((Boolean) tu0Var.c.a(lx0.Z4)).booleanValue()) {
                            String strA = nd.a(context);
                            if (strA != null && !context.getPackageName().equals(strA)) {
                                zA = true;
                            }
                        } else {
                            zA = xx0.a(context);
                        }
                        if (zA) {
                            boolean z5 = zB;
                            f21Var.h(true);
                            if (TextUtils.isEmpty(string)) {
                                jn.T("Cannot open browser with null or empty url");
                                f21Var.i(7);
                                return;
                            }
                            Uri uriC = f21.c(f21.b(md1Var.getContext(), md1Var.S(), Uri.parse(string), md1Var.p0(), md1Var.g(), md1Var.s0()));
                            if (z5 && f21Var.j != null && f21Var.d(ib0Var, md1Var.getContext(), uriC.toString(), str2)) {
                                return;
                            }
                            f21Var.m = new d21(f21Var);
                            String string2 = uriC.toString();
                            lb0 lb0Var = f21Var.m;
                            Bundle bundle = new Bundle();
                            if (((Boolean) tu0Var.c.a(lx0.e5)).booleanValue()) {
                                if (map.containsKey("cct_init_h")) {
                                    try {
                                        bundle.putInt("h", Integer.parseInt((String) map.get("cct_init_h")));
                                    } catch (NumberFormatException e) {
                                        jn.w("Invalid cct initial height parameter.", e);
                                        vc3.C.h.d("OpenGmsgHandler.getChromeCustomTabConfigBundle", e);
                                    }
                                }
                                if (map.containsKey("cct_bp")) {
                                    try {
                                        bundle.putInt("cbp", Integer.parseInt((String) map.get("cct_bp")));
                                    } catch (NumberFormatException e2) {
                                        jn.w("Invalid cct close button position parameter.", e2);
                                        vc3.C.h.d("OpenGmsgHandler.getChromeCustomTabConfigBundle", e2);
                                    }
                                }
                                break;
                            }
                            md1Var.K(new r91(null, string2, null, null, null, null, null, null, new ju(lb0Var), true, bundle), z2, z3, str2);
                            return;
                        }
                        f21Var.i(4);
                    }
                    map.put("use_first_package", "true");
                    map.put("use_running_process", "true");
                    f21Var.g(ib0Var, map, zB, str2, z2, z3);
                    return;
                }
                boolean z6 = zB;
                if ("app".equalsIgnoreCase(str) && "true".equalsIgnoreCase((String) map.get("system_browser"))) {
                    f21Var.g(ib0Var, map, z6, str2, z2, z3);
                    return;
                }
                boolean z7 = z3;
                String str3 = str2;
                if ("open_app".equalsIgnoreCase(str)) {
                    if (((Boolean) tu0Var.c.a(lx0.S8)).booleanValue()) {
                        f21Var.h(true);
                        String str4 = (String) map.get("p");
                        if (str4 == null) {
                            jn.T("Package name missing from open app action.");
                            return;
                        }
                        if (z6 && f21Var.j != null && f21Var.d(ib0Var, md1Var.getContext(), str4, str3)) {
                            return;
                        }
                        PackageManager packageManager = md1Var.getContext().getPackageManager();
                        if (packageManager == null) {
                            jn.T("Cannot get package manager from open app action.");
                            return;
                        }
                        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str4);
                        if (launchIntentForPackage != null) {
                            md1Var.K(new r91(launchIntentForPackage, f21Var.m), z2, z7, str3);
                            return;
                        }
                        return;
                    }
                    return;
                }
                f21Var.h(true);
                String str5 = (String) map.get("intent_url");
                Intent uri = null;
                if (!TextUtils.isEmpty(str5)) {
                    try {
                        uri = Intent.parseUri(str5, 0);
                    } catch (URISyntaxException e3) {
                        jn.P("Error parsing the url: ".concat(String.valueOf(str5)), e3);
                    }
                }
                Intent intent = uri;
                if (intent != null && intent.getData() != null) {
                    Uri data = intent.getData();
                    if (!Uri.EMPTY.equals(data)) {
                        Uri uriC2 = f21.c(f21.b(md1Var.getContext(), md1Var.S(), data, md1Var.p0(), md1Var.g(), md1Var.s0()));
                        if (TextUtils.isEmpty(intent.getType())) {
                            intent.setData(uriC2);
                        } else if (((Boolean) tu0.e.c.a(lx0.T8)).booleanValue()) {
                            intent.setDataAndType(uriC2, intent.getType());
                        } else {
                            intent.setData(uriC2);
                        }
                    }
                }
                ix0 ix0Var2 = lx0.o9;
                tu0 tu0Var2 = tu0.e;
                boolean z8 = ((Boolean) tu0Var2.c.a(ix0Var2)).booleanValue() && "intent_async".equalsIgnoreCase(str) && map.containsKey("event_id");
                if (((Boolean) tu0Var2.c.a(lx0.Fd)).booleanValue() && (qj1Var = f21Var.l) != null) {
                    synchronized (qj1Var.f) {
                        if (qj1Var.h.E0 > 0 && !qj1Var.m) {
                            s72 s72Var = qj1Var.l;
                            qj1Var.i.getClass();
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            s72Var.b();
                            ((t72) s72Var.g).B(jCurrentTimeMillis);
                            qj1Var.m = true;
                            qj1Var.k.schedule(new va1(16, qj1Var), qj1Var.h.E0, TimeUnit.MILLISECONDS);
                        }
                    }
                } else {
                    z8 = z8;
                }
                HashMap map2 = new HashMap();
                if (z8) {
                    f21Var.m = new e21(f21Var, z2, ib0Var, map2, map);
                    z = false;
                } else {
                    z = z2;
                }
                if (intent != null) {
                    if (!z6 || f21Var.j == null || !f21Var.d(ib0Var, md1Var.getContext(), intent.getData().toString(), str3)) {
                        md1Var.K(new r91(intent, f21Var.m), z, z7, str3);
                        return;
                    } else {
                        if (z8) {
                            map2.put((String) map.get("event_id"), Boolean.TRUE);
                            ((f31) ib0Var).a("openIntentAsync", map2);
                            return;
                        }
                        return;
                    }
                }
                if (!TextUtils.isEmpty(string)) {
                    f21Var = f21Var;
                    ib0Var = ib0Var;
                    map = map;
                    string = f21.c(f21.b(md1Var.getContext(), md1Var.S(), Uri.parse(string), md1Var.p0(), md1Var.g(), md1Var.s0())).toString();
                }
                if (!z6 || f21Var.j == null || !f21Var.d(ib0Var, md1Var.getContext(), string, str3)) {
                    md1Var.K(new r91((String) map.get("i"), string, (String) map.get("m"), (String) map.get("p"), (String) map.get("c"), (String) map.get("f"), (String) map.get("e"), f21Var.m), z, z7, str3);
                    return;
                } else {
                    if (z8) {
                        map2.put((String) map.get("event_id"), Boolean.TRUE);
                        ((f31) ib0Var).a("openIntentAsync", map2);
                        return;
                    }
                    return;
                }
                break;
            default:
                v32 v32Var = (v32) this.j;
                sh1 sh1Var = (sh1) obj;
                synchronized (v32Var) {
                    if (sh1Var != null) {
                        try {
                            sh1Var.b();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (v32Var.m) {
                        v32Var.c();
                    }
                    if (!((Boolean) my0.c.u()).booleanValue() || (d72Var = (d72) this.g) == null) {
                        e72 e72Var = v32Var.i;
                        a72 a72Var = (a72) this.h;
                        a72Var.l(sh1Var.a.b);
                        a72Var.r0(sh1Var.f.f);
                        a72Var.b(true);
                        e72Var.b(a72Var.m());
                    } else {
                        d72Var.e(sh1Var.a.b);
                        d72Var.g(sh1Var.f.f);
                        a72 a72Var2 = (a72) this.h;
                        a72Var2.b(true);
                        d72Var.a(a72Var2);
                        d72Var.h();
                    }
                    break;
                }
                return;
        }
    }

    @Override // defpackage.bv0
    public void f(yw0 yw0Var) {
        ev0 ev0Var = (ev0) ((zw0) yw0Var.g).B().r();
        dv0 dv0Var = (dv0) this.g;
        ev0Var.b();
        ((fv0) ev0Var.g).A(dv0Var);
        yw0Var.b();
        ((zw0) yw0Var.g).G((fv0) ev0Var.c());
        vw0 vw0Var = (vw0) ((zw0) yw0Var.g).z().r();
        String str = (String) this.h;
        vw0Var.b();
        ((ww0) vw0Var.g).A(str);
        uv0 uv0Var = (uv0) this.i;
        vw0Var.b();
        ((ww0) vw0Var.g).B(uv0Var);
        yw0Var.b();
        ((zw0) yw0Var.g).F((ww0) vw0Var.c());
        String str2 = (String) this.j;
        yw0Var.b();
        ((zw0) yw0Var.g).A(str2);
    }

    public kj g(String str) {
        for (ek ekVar : ((HashMap) this.h).values()) {
            if (ekVar != null) {
                kj kjVarG = ekVar.c;
                if (!str.equals(kjVarG.j)) {
                    kjVarG = kjVarG.y.c.g(str);
                }
                if (kjVarG != null) {
                    return kjVarG;
                }
            }
        }
        return null;
    }

    public j20 h(v1 v1Var) {
        ArrayList arrayList = (ArrayList) this.i;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            j20 j20Var = (j20) arrayList.get(i);
            if (j20Var != null && j20Var.b == v1Var) {
                return j20Var;
            }
        }
        j20 j20Var2 = new j20((Context) this.h, v1Var);
        arrayList.add(j20Var2);
        return j20Var2;
    }

    public ArrayList i() {
        ArrayList arrayList = new ArrayList();
        for (ek ekVar : ((HashMap) this.h).values()) {
            if (ekVar != null) {
                arrayList.add(ekVar);
            }
        }
        return arrayList;
    }

    public ArrayList j() {
        ArrayList arrayList = new ArrayList();
        for (ek ekVar : ((HashMap) this.h).values()) {
            if (ekVar != null) {
                arrayList.add(ekVar.c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public List k() {
        ArrayList arrayList;
        if (((ArrayList) this.g).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.g)) {
            arrayList = new ArrayList((ArrayList) this.g);
        }
        return arrayList;
    }

    public void l(ek ekVar) {
        kj kjVar = ekVar.c;
        String str = kjVar.j;
        HashMap map = (HashMap) this.h;
        if (map.get(str) != null) {
            return;
        }
        map.put(kjVar.j, ekVar);
        if (xj.E(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + kjVar);
        }
    }

    public void m(ek ekVar) {
        kj kjVar = ekVar.c;
        if (kjVar.F) {
            ((ak) this.j).e(kjVar);
        }
        if (((ek) ((HashMap) this.h).put(kjVar.j, null)) != null && xj.E(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + kjVar);
        }
    }

    public boolean n(v1 v1Var, MenuItem menuItem) {
        return ((ActionMode.Callback) this.g).onActionItemClicked(h(v1Var), new yr((Context) this.h, (o20) menuItem));
    }

    @Override // defpackage.pn1
    public void o(boolean z, Context context, ik1 ik1Var) throws on1 {
        boolean zI2;
        s51 s51Var = (s51) this.h;
        try {
            int iOrdinal = ((h2) this.i).ordinal();
            if (iOrdinal == 1) {
                zI2 = s51Var.i2(new ju(context));
            } else {
                if (iOrdinal != 2) {
                    if (iOrdinal == 5) {
                        zI2 = s51Var.q0(new ju(context));
                    }
                    throw new on1("Adapter failed to show.");
                }
                zI2 = s51Var.I0(new ju(context));
            }
            if (zI2) {
                kk1 kk1Var = (kk1) this.j;
                if (kk1Var == null) {
                    return;
                }
                if (((Boolean) tu0.e.c.a(lx0.E1)).booleanValue() || ((x42) this.g).Y != 2) {
                    return;
                }
                kk1Var.a();
                return;
            }
            throw new on1("Adapter failed to show.");
        } catch (Throwable th) {
            throw new on1(th);
        }
    }

    public boolean p(v1 v1Var, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.g;
        j20 j20VarH = h(v1Var);
        q00 q00Var = (q00) this.j;
        Menu ksVar = (Menu) q00Var.get(menu);
        if (ksVar == null) {
            ksVar = new ks((Context) this.h, (rr) menu);
            q00Var.put(menu, ksVar);
        }
        return callback.onCreateActionMode(j20VarH, ksVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.qi0
    public void s(byte[] bArr, int i, int i2, ri0 ri0Var) {
        cw1 cw1Var;
        cw1 cw1Var2;
        tf1 tf1Var;
        int i3;
        int i4;
        int i5;
        int i6;
        int iO;
        cw1 cw1Var3 = (cw1) this.g;
        cw1Var3.z(i + i2, bArr);
        cw1Var3.E(i);
        if (((Inflater) this.j) == null) {
            this.j = new Inflater();
        }
        cw1 cw1Var4 = (cw1) this.h;
        if (qz1.g(cw1Var3, cw1Var4, (Inflater) this.j)) {
            cw1Var3.z(cw1Var4.c, cw1Var4.a);
        }
        aj0 aj0Var = (aj0) this.i;
        int i7 = 0;
        aj0Var.d = 0;
        cw1 cw1Var5 = aj0Var.a;
        aj0Var.e = 0;
        aj0Var.f = 0;
        aj0Var.g = 0;
        aj0Var.h = 0;
        aj0Var.i = 0;
        cw1Var5.y(0);
        aj0Var.c = false;
        int[] iArr = aj0Var.b;
        ArrayList arrayList = new ArrayList();
        while (cw1Var3.B() >= 3) {
            int i8 = cw1Var3.c;
            int iK = cw1Var3.K();
            int iL = cw1Var3.L();
            int i9 = cw1Var3.b + iL;
            if (i9 > i8) {
                cw1Var3.E(i8);
                cw1Var = cw1Var5;
                cw1Var2 = cw1Var3;
                tf1Var = null;
                i3 = i7;
            } else {
                if (iK != 128) {
                    switch (iK) {
                        case 20:
                            if (iL % 5 != 2) {
                                cw1Var = cw1Var5;
                                cw1Var2 = cw1Var3;
                            } else {
                                cw1Var3.G(2);
                                Arrays.fill(iArr, i7);
                                int i10 = iL / 5;
                                int i11 = i7;
                                while (i11 < i10) {
                                    int iK2 = cw1Var3.K();
                                    int iK3 = cw1Var3.K();
                                    int iK4 = cw1Var3.K();
                                    int iK5 = cw1Var3.K();
                                    double d = iK3;
                                    int iK6 = cw1Var3.K() << 24;
                                    String str = qz1.a;
                                    cw1 cw1Var6 = cw1Var5;
                                    double d2 = iK4 - 128;
                                    double d3 = iK5 - 128;
                                    iArr[iK2] = (Math.max(0, Math.min((int) ((d - (0.34414d * d3)) - (0.71414d * d2)), 255)) << 8) | iK6 | (Math.max(0, Math.min((int) ((1.402d * d2) + d), 255)) << 16) | Math.max(0, Math.min((int) ((1.772d * d3) + d), 255));
                                    i11++;
                                    cw1Var3 = cw1Var3;
                                    cw1Var5 = cw1Var6;
                                }
                                cw1Var = cw1Var5;
                                cw1Var2 = cw1Var3;
                                aj0Var.c = true;
                            }
                            i3 = 0;
                            tf1Var = null;
                            break;
                        case zw0.zzm /* 21 */:
                            if (iL >= 4) {
                                cw1Var3.G(3);
                                int i12 = iL - 4;
                                if ((128 & cw1Var3.K()) == 0) {
                                    i5 = cw1Var5.b;
                                    i6 = cw1Var5.c;
                                    if (i5 < i6 && i12 > 0) {
                                        int iMin = Math.min(i12, i6 - i5);
                                        cw1Var3.H(cw1Var5.a, i5, iMin);
                                        cw1Var5.E(i5 + iMin);
                                    }
                                } else if (i12 >= 7 && (iO = cw1Var3.O()) >= 4) {
                                    aj0Var.h = cw1Var3.L();
                                    aj0Var.i = cw1Var3.L();
                                    cw1Var5.y(iO - 4);
                                    i12 = iL - 11;
                                    i5 = cw1Var5.b;
                                    i6 = cw1Var5.c;
                                    if (i5 < i6) {
                                        int iMin2 = Math.min(i12, i6 - i5);
                                        cw1Var3.H(cw1Var5.a, i5, iMin2);
                                        cw1Var5.E(i5 + iMin2);
                                    }
                                }
                            }
                            cw1Var = cw1Var5;
                            cw1Var2 = cw1Var3;
                            tf1Var = null;
                            i3 = i7;
                            break;
                        case 22:
                            if (iL >= 19) {
                                aj0Var.d = cw1Var3.L();
                                aj0Var.e = cw1Var3.L();
                                cw1Var3.G(11);
                                aj0Var.f = cw1Var3.L();
                                aj0Var.g = cw1Var3.L();
                            }
                            cw1Var = cw1Var5;
                            cw1Var2 = cw1Var3;
                            tf1Var = null;
                            i3 = i7;
                            break;
                        default:
                            cw1Var = cw1Var5;
                            cw1Var2 = cw1Var3;
                            tf1Var = null;
                            i3 = i7;
                            break;
                    }
                } else {
                    cw1Var = cw1Var5;
                    cw1Var2 = cw1Var3;
                    if (aj0Var.d == 0 || aj0Var.e == 0 || aj0Var.h == 0 || aj0Var.i == 0 || (i4 = cw1Var.c) == 0 || cw1Var.b != i4 || !aj0Var.c) {
                        tf1Var = null;
                    } else {
                        cw1Var.E(0);
                        int i13 = aj0Var.h * aj0Var.i;
                        int[] iArr2 = new int[i13];
                        int i14 = 0;
                        while (i14 < i13) {
                            int iK7 = cw1Var.K();
                            if (iK7 != 0) {
                                iArr2[i14] = iArr[iK7];
                                i14++;
                            } else {
                                int iK8 = cw1Var.K();
                                if (iK8 != 0) {
                                    int iK9 = iK8 & 63;
                                    if ((iK8 & 64) != 0) {
                                        iK9 = (iK9 << 8) | cw1Var.K();
                                    }
                                    int i15 = (iK8 & 128) == 0 ? iArr[0] : iArr[cw1Var.K()];
                                    int i16 = i14 + iK9;
                                    Arrays.fill(iArr2, i14, i16, i15);
                                    i14 = i16;
                                }
                            }
                        }
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr2, aj0Var.h, aj0Var.i, Bitmap.Config.ARGB_8888);
                        float f = aj0Var.f;
                        float f2 = aj0Var.d;
                        float f3 = f / f2;
                        float f4 = aj0Var.g;
                        float f5 = aj0Var.e;
                        tf1Var = new tf1(null, null, null, bitmapCreateBitmap, f4 / f5, 0, 0, f3, 0, Integer.MIN_VALUE, -3.4028235E38f, aj0Var.h / f2, aj0Var.i / f5, Integer.MIN_VALUE, 0.0f, 0);
                    }
                    i3 = 0;
                    aj0Var.d = 0;
                    aj0Var.e = 0;
                    aj0Var.f = 0;
                    aj0Var.g = 0;
                    aj0Var.h = 0;
                    aj0Var.i = 0;
                    cw1Var.y(0);
                    aj0Var.c = false;
                }
                cw1Var2.E(i9);
            }
            if (tf1Var != null) {
                arrayList.add(tf1Var);
            }
            i7 = i3;
            cw1Var3 = cw1Var2;
            cw1Var5 = cw1Var;
        }
        ri0Var.mo0b(new mi0(arrayList, -9223372036854775807L, -9223372036854775807L));
    }

    public void t(int i) throws InvalidAlgorithmParameterException {
        if (i != 16 && i != 24 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.g = Integer.valueOf(i);
    }

    public void u(pr2 pr2Var) throws GeneralSecurityException {
        at2 at2Var = new at2(pr2Var.a, ts2.class);
        HashMap map = (HashMap) this.g;
        if (!map.containsKey(at2Var)) {
            map.put(at2Var, pr2Var);
            return;
        }
        pr2 pr2Var2 = (pr2) map.get(at2Var);
        if (!pr2Var2.equals(pr2Var) || pr2Var != pr2Var2) {
            throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(at2Var.toString()));
        }
    }

    @Override // defpackage.hn2
    public void w(Throwable th) {
        d72 d72Var;
        int i;
        switch (this.f) {
            case 6:
                vc3.C.h.d("OpenGmsgHandler.attributionReportingManager", th);
                return;
            default:
                if (((Boolean) tu0.e.c.a(lx0.h6)).booleanValue()) {
                    jn.w("Banner ad failed to load", th);
                }
                v32 v32Var = (v32) this.j;
                synchronized (v32Var) {
                    pf1 pf1Var = (pf1) this.i;
                    fu1 fu1VarV = a23.v(th, ((vi1) pf1Var.r.c()).l);
                    v32Var.n = fu1VarV;
                    ((dk1) pf1Var.l.c()).Z(fu1VarV);
                    dq.w(fu1VarV.f, th, "BannerAdLoader.onFailure");
                    if (v32Var.m) {
                        v32Var.e();
                        nl1 nl1Var = v32Var.h;
                        am1 am1Var = v32Var.j;
                        synchronized (am1Var) {
                            i = am1Var.f;
                        }
                        nl1Var.R1(i);
                    }
                    if (!((Boolean) my0.c.u()).booleanValue() || (d72Var = (d72) this.g) == null) {
                        e72 e72Var = v32Var.i;
                        a72 a72Var = (a72) this.h;
                        a72Var.g(fu1VarV);
                        a72Var.f(th);
                        a72Var.b(false);
                        e72Var.b(a72Var.m());
                    } else {
                        d72Var.f(fu1VarV);
                        a72 a72Var2 = (a72) this.h;
                        a72Var2.f(th);
                        a72Var2.b(false);
                        d72Var.a(a72Var2);
                        d72Var.h();
                    }
                }
                return;
        }
    }

    public void x(int i) throws GeneralSecurityException {
        if (i != 12 && i != 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(i)));
        }
        this.h = Integer.valueOf(i);
    }

    public synchronized void y(mm0 mm0Var) {
        try {
            HashMap map = (HashMap) this.g;
            String strD = mm0Var.d();
            List list = (List) map.remove(strD);
            if (list == null || list.isEmpty()) {
                return;
            }
            if (tm0.a) {
                tm0.a("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), strD);
            }
            mm0 mm0Var2 = (mm0) list.remove(0);
            map.put(strD, list);
            synchronized (mm0Var2.j) {
                mm0Var2.p = this;
            }
            try {
                ((BlockingQueue) this.i).put(mm0Var2);
            } catch (InterruptedException e) {
                tm0.c("Couldn't add request to queue. %s", e.toString());
                Thread.currentThread().interrupt();
                em0 em0Var = (em0) this.h;
                em0Var.i = true;
                em0Var.interrupt();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void z(mr2 mr2Var) throws GeneralSecurityException {
        mr2Var.getClass();
        zs2 zs2Var = new zs2(ts2.class, mr2Var.a);
        HashMap map = (HashMap) this.h;
        if (!map.containsKey(zs2Var)) {
            map.put(zs2Var, mr2Var);
            return;
        }
        mr2 mr2Var2 = (mr2) map.get(zs2Var);
        if (!mr2Var2.equals(mr2Var) || mr2Var != mr2Var2) {
            throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(zs2Var.toString()));
        }
    }

    @Override // defpackage.n62
    public /* synthetic */ Object b(Object obj) {
        vy1 vy1Var = (vy1) this.g;
        return ((zw1) vy1Var.e).a((e52) this.h, (x42) this.i, (ww1) this.j);
    }

    public y91(Context context, Executor executor, ga2 ga2Var, na2 na2Var) {
        this.f = 17;
        this.g = context;
        this.h = executor;
        this.i = ga2Var;
    }

    public y91(View view, md1 md1Var, li1 li1Var, y42 y42Var) {
        this.f = 9;
        this.h = view;
        this.j = md1Var;
        this.g = li1Var;
        this.i = y42Var;
    }

    public /* synthetic */ y91(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f = i;
        this.g = obj2;
        this.h = obj3;
        this.i = obj4;
        this.j = obj;
    }

    public /* synthetic */ y91(Object obj, Object obj2, Object obj3, Object obj4, int i, boolean z) {
        this.f = i;
        this.g = obj;
        this.h = obj2;
        this.i = obj3;
        this.j = obj4;
    }

    public y91(if1 if1Var, e3 e3Var) {
        this.f = 8;
        this.j = if1Var;
        this.g = e3Var;
        this.h = q63.a(new q12(if1Var.t, 9));
        j32 j32Var = new j32(e3Var, 1);
        j32 j32Var2 = new j32(e3Var, 2);
        j32 j32Var3 = new j32(e3Var, 3);
        xe1 xe1Var = if1Var.g;
        q63 q63Var = if1Var.d;
        new u91(xe1Var, q63Var, j32Var, j32Var2, j32Var3, 17);
        int i = 5;
        new q12(xe1Var, i);
        j32 j32Var4 = new j32(e3Var, 0);
        new tz0(22, j32Var4);
        int i2 = 10;
        new zh1(q63Var, xe1Var, i2);
        j32 j32Var5 = new j32(e3Var, i);
        j32 j32Var6 = new j32(e3Var, 6);
        q63 q63Var2 = if1Var.U;
        new yn1(q63Var2, j32Var3, j32Var4, q63Var, j32Var5, j32Var6);
        new i91(j32Var4, q63Var2, q63Var, 28);
        j32 j32Var7 = new j32(e3Var, 4);
        q63 q63VarA = q63.a(na1.m);
        q63 q63VarA2 = q63.a(v51.k);
        q63 q63VarA3 = q63.a(ej1.l);
        q63 q63VarA4 = q63.a(dq.s);
        int i3 = t63.b;
        LinkedHashMap linkedHashMapX = ej1.x(4);
        linkedHashMapX.put(r62.k, q63VarA);
        linkedHashMapX.put(r62.l, q63VarA2);
        linkedHashMapX.put(r62.m, q63VarA3);
        linkedHashMapX.put(r62.n, q63VarA4);
        q63 q63VarA5 = q63.a(new i91(j32Var7, if1Var.g, new t63(linkedHashMapX), i2));
        int i4 = w63.c;
        List list = Collections.EMPTY_LIST;
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(q63VarA5);
        this.i = q63.a(new g12(if1Var.d, new bk1(new w63(list, arrayList), 25)));
    }

    public y91(x42 x42Var, s51 s51Var, h2 h2Var) {
        this.f = 12;
        this.j = null;
        this.g = x42Var;
        this.h = s51Var;
        this.i = h2Var;
    }

    public y91(gf3 gf3Var, boolean[] zArr) {
        this.f = 23;
        this.g = gf3Var;
        this.h = zArr;
        int i = gf3Var.a;
        this.i = new boolean[i];
        this.j = new boolean[i];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.ArrayList] */
    public y91(JsonReader jsonReader, Bundle bundle) throws IOException {
        this.f = 15;
        this.j = bundle;
        if (((Boolean) tu0.e.c.a(lx0.m2)).booleanValue() && bundle != null) {
            ec.q(vc3.C.k, bundle, "server-response-parse-start");
        }
        ?? arrayList = Collections.EMPTY_LIST;
        ArrayList arrayList2 = new ArrayList();
        jsonReader.beginObject();
        z42 z42Var = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if ("responses".equals(strNextName)) {
                jsonReader.beginArray();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    if ("ad_configs".equals(strNextName2)) {
                        arrayList = new ArrayList();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            arrayList.add(new x42(jsonReader));
                        }
                        jsonReader.endArray();
                    } else if (strNextName2.equals("common")) {
                        z42Var = new z42(jsonReader);
                        if (((Boolean) tu0.e.c.a(lx0.n2)).booleanValue() && bundle != null) {
                            bundle.putLong("normalize-ad-response-start", z42Var.s);
                            bundle.putLong("normalize-ad-response-end", z42Var.t);
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                jsonReader.endArray();
            } else if (strNextName.equals("actions")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonReader.beginObject();
                    String strNextString = null;
                    JSONObject jSONObjectQ0 = null;
                    while (jsonReader.hasNext()) {
                        String strNextName3 = jsonReader.nextName();
                        if ("name".equals(strNextName3)) {
                            strNextString = jsonReader.nextString();
                        } else if ("info".equals(strNextName3)) {
                            jSONObjectQ0 = w40.q0(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    if (strNextString != null) {
                        arrayList2.add(new d52(strNextString, jSONObjectQ0));
                    }
                    jsonReader.endObject();
                }
                jsonReader.endArray();
            }
        }
        this.i = arrayList2;
        this.g = arrayList;
        this.h = z42Var == null ? new z42(new JsonReader(new StringReader("{}"))) : z42Var;
    }

    public y91(em0 em0Var, BlockingQueue blockingQueue, s70 s70Var) {
        this.f = 5;
        this.g = new HashMap();
        this.j = s70Var;
        this.h = em0Var;
        this.i = blockingQueue;
    }

    public y91(hm1 hm1Var) {
        this.f = 18;
        this.j = this;
        this.g = hm1Var;
        q63 q63VarA = q63.a(new jj1((s63) hm1Var.b, (s63) hm1Var.d, (q63) hm1Var.l, q63.a(dq.u), (q63) hm1Var.n, (q63) hm1Var.i, (s63) hm1Var.f));
        this.h = q63VarA;
        this.i = q63.a(new jj1((s63) hm1Var.d, q63VarA, (q63) hm1Var.l, (q63) hm1Var.k, q63.a(a23.F), new wc2(3, this), (s63) hm1Var.f));
    }

    public y91(qk2 qk2Var, r32 r32Var, us2 us2Var, r32 r32Var2) {
        Object objM;
        this.f = 16;
        if (qk2Var != null) {
            objM = vj2.m(qk2Var);
        } else {
            tj2 tj2Var = vj2.g;
            objM = qk2.j;
        }
        this.g = objM;
        this.h = r32Var;
        this.i = us2Var;
        this.j = r32Var2;
    }

    public y91(zb3 zb3Var, xx0 xx0Var, Bundle bundle, Context context, Uri uri) {
        this.f = 22;
        this.g = xx0Var;
        this.h = bundle;
        this.i = context;
        this.j = uri;
    }

    public y91(bt2 bt2Var) {
        this.f = 20;
        this.g = new HashMap(bt2Var.a);
        this.h = new HashMap(bt2Var.b);
        this.i = new HashMap(bt2Var.c);
        this.j = new HashMap(bt2Var.d);
    }

    public y91(int i) {
        this.f = i;
        switch (i) {
            case 4:
                this.g = new cw1();
                this.h = new cw1();
                this.i = new aj0();
                break;
            case 19:
                this.g = null;
                this.h = null;
                this.i = null;
                this.j = bp2.j;
                break;
            case 20:
                this.g = new HashMap();
                this.h = new HashMap();
                this.i = new HashMap();
                this.j = new HashMap();
                break;
            case zw0.zzm /* 21 */:
                this.g = null;
                this.h = null;
                this.i = null;
                this.j = bp2.p;
                break;
            default:
                this.g = new ArrayList();
                this.h = new HashMap();
                this.i = new HashMap();
                break;
        }
    }

    public y91(Context context, ae aeVar, h73 h73Var, aa1 aa1Var) {
        int i = 0;
        this.f = 0;
        this.g = aeVar;
        s63 s63VarA = s63.a(context);
        s63 s63VarA2 = s63.a(h73Var);
        this.h = q63.a(new g91(s63VarA, s63VarA2, i));
        s63 s63VarA3 = s63.a(aeVar);
        q63 q63VarA = q63.a(new i91(s63VarA3, s63VarA2, s63.a(aa1Var), i));
        this.i = q63VarA;
        this.j = q63.a(new da1(s63VarA, new j91(s63VarA3, q63VarA), i));
    }

    public y91(Context context, ActionMode.Callback callback) {
        this.f = 3;
        this.h = context;
        this.g = callback;
        this.i = new ArrayList();
        this.j = new q00(0);
    }
}
