package defpackage;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class f21 implements v11 {
    public final vs0 f;
    public final es1 g;
    public final d61 i;
    public final bw1 j;
    public final sg1 k;
    public final qj1 l;
    public id3 h = null;
    public lb0 m = null;
    public final ya1 n = za1.g;

    public f21(vs0 vs0Var, d61 d61Var, bw1 bw1Var, es1 es1Var, sg1 sg1Var, qj1 qj1Var) {
        this.f = vs0Var;
        this.i = d61Var;
        this.j = bw1Var;
        this.g = es1Var;
        this.k = sg1Var;
        this.l = qj1Var;
    }

    public static int a(Map map) {
        String str = (String) map.get("o");
        if (str == null) {
            return -1;
        }
        if ("p".equalsIgnoreCase(str)) {
            return 7;
        }
        if ("l".equalsIgnoreCase(str)) {
            return 6;
        }
        return "c".equalsIgnoreCase(str) ? 14 : -1;
    }

    public static Uri b(Context context, zq0 zq0Var, Uri uri, View view, Activity activity, k52 k52Var) {
        if (zq0Var != null) {
            try {
                if (!((Boolean) tu0.e.c.a(lx0.Mc)).booleanValue() || k52Var == null) {
                    if (zq0Var.c(uri)) {
                        return zq0Var.b(uri, context, view, activity);
                    }
                } else if (zq0Var.c(uri)) {
                    return k52Var.a(uri, context, view, activity);
                }
            } catch (ar0 unused) {
            } catch (Exception e) {
                vc3.C.h.d("OpenGmsgHandler.maybeAddClickSignalsToUri", e);
            }
        }
        return uri;
    }

    public static Uri c(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") == null) {
                return uri;
            }
            return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
        } catch (UnsupportedOperationException e) {
            jn.P("Error adding click uptime parameter to url: ".concat(String.valueOf(uri.toString())), e);
            return uri;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0080, code lost:
    
        if (((java.lang.Boolean) defpackage.tu0.e.c.a(defpackage.lx0.i9)).booleanValue() != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e3, code lost:
    
        if ((android.os.Build.VERSION.SDK_INT < 33 ? ((java.lang.Boolean) defpackage.tu0.e.c.a(defpackage.lx0.d9)).booleanValue() : ((java.lang.Boolean) defpackage.tu0.e.c.a(defpackage.lx0.c9)).booleanValue()) != false) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(defpackage.ib0 r11, android.content.Context r12, java.lang.String r13, java.lang.String r14) {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f21.d(ib0, android.content.Context, java.lang.String, java.lang.String):boolean");
    }

    public final void e(Context context, String str, String str2) {
        bw1 bw1Var = this.j;
        bw1Var.b(str);
        es1 es1Var = this.g;
        if (es1Var != null) {
            w40.b0("dialog_not_shown_reason", str2);
            hw1.C3(context, es1Var, bw1Var, str, "dialog_not_shown", vk2.d(1, new Object[]{"dialog_not_shown_reason", str2}, null));
        }
    }

    @Override // defpackage.v11
    public final void f(Object obj, Map map) {
        sg1 sg1Var;
        ib0 ib0Var = (ib0) obj;
        String str = (String) map.get("u");
        HashMap map2 = new HashMap();
        md1 md1Var = (md1) ib0Var;
        if (md1Var.E() != null) {
            map2 = md1Var.E().w0;
        }
        String strR = v51.r(str, md1Var.getContext(), true, map2);
        String str2 = (String) map.get("a");
        if (str2 == null) {
            jn.T("Action missing from an open GMSG.");
            return;
        }
        vs0 vs0Var = this.f;
        if (vs0Var != null && !vs0Var.a()) {
            vs0Var.b(strR);
        } else {
            hp hpVarA = (((Boolean) tu0.e.c.a(lx0.Pa)).booleanValue() && (sg1Var = this.k) != null && sg1.b(strR)) ? sg1Var.a(strR, ut0.f.e) : na1.t(strR);
            hpVarA.a(new in2(hpVarA, 0, new y91(this, map, ib0Var, str2, 6)), this.n);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0112  */
    /* JADX WARN: Code duplicated, block: B:35:0x0119  */
    /* JADX WARN: Code duplicated, block: B:48:0x0155 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x0157  */
    /* JADX WARN: Code duplicated, block: B:50:0x0162  */
    public final void g(ib0 ib0Var, Map map, boolean z, String str, boolean z2, boolean z3) {
        Uri uriBuild;
        Intent intent;
        Intent intentD;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        ResolveInfo resolveInfoB;
        boolean z4 = true;
        h(true);
        md1 md1Var = (md1) ib0Var;
        Context context = md1Var.getContext();
        zq0 zq0VarS = md1Var.S();
        View viewP0 = md1Var.p0();
        k52 k52VarS0 = md1Var.s0();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        String str2 = (String) map.get("u");
        if (TextUtils.isEmpty(str2)) {
            intentD = null;
        } else {
            Uri uriC = c(b(context, zq0VarS, Uri.parse(str2), viewP0, null, k52VarS0));
            boolean z5 = Boolean.parseBoolean((String) map.get("use_first_package"));
            boolean z6 = Boolean.parseBoolean((String) map.get("use_running_process"));
            if (!Boolean.parseBoolean((String) map.get("use_custom_tabs"))) {
                if (!((Boolean) tu0.e.c.a(lx0.V4)).booleanValue()) {
                    z4 = false;
                }
            }
            if ("http".equalsIgnoreCase(uriC.getScheme())) {
                uriBuild = uriC.buildUpon().scheme("https").build();
            } else {
                uriBuild = "https".equalsIgnoreCase(uriC.getScheme()) ? uriC.buildUpon().scheme("http").build() : null;
            }
            ArrayList arrayList = new ArrayList();
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.addFlags(268435456);
            intent2.setData(uriC);
            intent2.setAction("android.intent.action.VIEW");
            if (uriBuild == null) {
                intent = null;
            } else {
                Intent intent3 = new Intent("android.intent.action.VIEW");
                intent3.addFlags(268435456);
                intent3.setData(uriBuild);
                intent3.setAction("android.intent.action.VIEW");
                intent = intent3;
            }
            if (z4) {
                zb3 zb3Var = vc3.C.c;
                zb3.M(context, intent2);
                zb3.M(context, intent);
            }
            ResolveInfo resolveInfoB2 = ar.B(intent2, arrayList, context);
            if (resolveInfoB2 != null) {
                intentD = ar.D(intent2, resolveInfoB2);
            } else if (intent != null && (resolveInfoB = ar.B(intent, new ArrayList(), context)) != null) {
                intentD = ar.D(intent2, resolveInfoB);
                if (ar.B(intentD, new ArrayList(), context) == null) {
                    if (!arrayList.isEmpty()) {
                        intentD = intent2;
                    } else if (!z6) {
                        if (z5) {
                            intentD = ar.D(intent2, (ResolveInfo) arrayList.get(0));
                        } else {
                            intentD = intent2;
                        }
                    } else if (z5) {
                        intentD = ar.D(intent2, (ResolveInfo) arrayList.get(0));
                    } else {
                        intentD = intent2;
                    }
                }
            } else if (!arrayList.isEmpty()) {
                intentD = intent2;
            } else if (!z6 && activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
                int size = arrayList.size();
                int i = 0;
                while (true) {
                    if (i < size) {
                        ResolveInfo resolveInfo = (ResolveInfo) arrayList.get(i);
                        Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                        while (true) {
                            int i2 = i + 1;
                            if (!it.hasNext()) {
                                i = i2;
                            } else if (it.next().processName.equals(resolveInfo.activityInfo.packageName)) {
                                intentD = ar.D(intent2, resolveInfo);
                            }
                        }
                    } else if (z5) {
                        intentD = ar.D(intent2, (ResolveInfo) arrayList.get(0));
                    } else {
                        intentD = intent2;
                    }
                }
            } else if (z5) {
                intentD = ar.D(intent2, (ResolveInfo) arrayList.get(0));
            } else {
                intentD = intent2;
            }
        }
        if (!z || this.j == null || intentD == null || !d(ib0Var, md1Var.getContext(), intentD.getData().toString(), str)) {
            try {
                ((md1) ib0Var).K(new r91(intentD, this.m), z2, z3, str);
            } catch (ActivityNotFoundException e) {
                jn.T(e.getMessage());
            }
        }
    }

    public final void h(boolean z) {
        d61 d61Var = this.i;
        if (d61Var != null) {
            d61Var.E(z);
        }
    }

    public final void i(int i) {
        es1 es1Var;
        String str;
        if (!((Boolean) tu0.e.c.a(lx0.Y4)).booleanValue() || (es1Var = this.g) == null) {
            return;
        }
        us2 us2VarA = es1Var.a();
        us2VarA.s("action", "cct_action");
        switch (i) {
            case 2:
                str = "CONTEXT_NOT_AN_ACTIVITY";
                break;
            case 3:
                str = "CONTEXT_NULL";
                break;
            case 4:
                str = "CCT_NOT_SUPPORTED";
                break;
            case 5:
                str = "CCT_READY_TO_OPEN";
                break;
            case 6:
                str = "ACTIVITY_NOT_FOUND";
                break;
            case 7:
                str = "EMPTY_URL";
                break;
            case 8:
                str = "UNKNOWN";
                break;
            case 9:
                str = "WRONG_EXP_SETUP";
                break;
            default:
                str = "OPT_OUT";
                break;
        }
        us2VarA.s("cct_open_status", str);
        us2VarA.t();
    }
}
