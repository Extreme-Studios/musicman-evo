package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class ec1 implements v11 {
    public boolean f;

    public static int a(Context context, Map map, String str, int i) {
        String str2 = (String) map.get(str);
        if (str2 != null) {
            try {
                f32 f32Var = ut0.f.a;
                i = f32.b(context, Integer.parseInt(str2));
            } catch (NumberFormatException unused) {
                StringBuilder sb = new StringBuilder(str.length() + 34 + str2.length());
                sb.append("Could not parse ");
                sb.append(str);
                sb.append(" in a video GMSG: ");
                sb.append(str2);
                jn.T(sb.toString());
            }
        }
        if (jn.B()) {
            int length = str.length();
            StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + length + 30 + String.valueOf(str2).length() + 6 + 1);
            ec.x(sb2, "Parse pixels for ", str, ", got string ", str2);
            sb2.append(", int ");
            sb2.append(i);
            sb2.append(".");
            jn.p(sb2.toString());
        }
        return i;
    }

    public static void b(pb1 pb1Var, Map map) {
        lb1 lb1Var = pb1Var.l;
        String str = (String) map.get("minBufferMs");
        String str2 = (String) map.get("maxBufferMs");
        String str3 = (String) map.get("bufferForPlaybackMs");
        String str4 = (String) map.get("bufferForPlaybackAfterRebufferMs");
        String str5 = (String) map.get("socketReceiveBufferSize");
        if (str != null) {
            try {
                int i = Integer.parseInt(str);
                if (lb1Var != null) {
                    lb1Var.B(i);
                }
            } catch (NumberFormatException unused) {
                jn.T("Could not parse buffer parameters in loadControl video GMSG: (" + str + ", " + str2 + ")");
                return;
            }
        }
        if (str2 != null) {
            int i2 = Integer.parseInt(str2);
            if (lb1Var != null) {
                lb1Var.C(i2);
            }
        }
        if (str3 != null) {
            int i3 = Integer.parseInt(str3);
            if (lb1Var != null) {
                lb1Var.a(i3);
            }
        }
        if (str4 != null) {
            int i4 = Integer.parseInt(str4);
            if (lb1Var != null) {
                lb1Var.b(i4);
            }
        }
        if (str5 != null) {
            int i5 = Integer.parseInt(str5);
            if (lb1Var == null) {
                return;
            }
            lb1Var.c(i5);
        }
    }

    @Override // defpackage.v11
    public final void f(Object obj, Map map) {
        int iMin;
        int iMin2;
        int i;
        boolean z;
        int i2;
        pb1 pb1Var;
        lb1 lb1Var;
        md1 md1Var = (md1) obj;
        String str = (String) map.get("action");
        if (str == null) {
            jn.T("Action missing from video GMSG.");
            return;
        }
        Integer numValueOf = null;
        Integer numValueOf2 = map.containsKey("playerId") ? Integer.valueOf(Integer.parseInt((String) map.get("playerId"))) : null;
        Integer numZ = (md1Var.c0() == null || (pb1Var = (pb1) md1Var.c0().k) == null || (lb1Var = pb1Var.l) == null) ? null : lb1Var.z();
        if (numValueOf2 != null && numZ != null && !numValueOf2.equals(numZ) && !str.equals("load")) {
            Locale locale = Locale.US;
            jn.R("Event intended for player " + numValueOf2 + ", but sent to player " + numZ + " - event ignored");
            return;
        }
        if (jn.a0(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            String string = jSONObject.toString();
            StringBuilder sb = new StringBuilder(str.length() + 13 + String.valueOf(string).length());
            sb.append("Video GMSG: ");
            sb.append(str);
            sb.append(" ");
            sb.append(string);
            jn.F(sb.toString());
        }
        if (str.equals("background")) {
            String str2 = (String) map.get("color");
            if (TextUtils.isEmpty(str2)) {
                jn.T("Color parameter missing from background video GMSG.");
                return;
            }
            try {
                md1Var.setBackgroundColor(Color.parseColor(str2));
                return;
            } catch (IllegalArgumentException unused) {
                jn.T("Invalid color parameter in background video GMSG.");
                return;
            }
        }
        if (str.equals("playerBackground")) {
            String str3 = (String) map.get("color");
            if (TextUtils.isEmpty(str3)) {
                jn.T("Color parameter missing from playerBackground video GMSG.");
                return;
            }
            try {
                md1Var.O(Color.parseColor(str3));
                return;
            } catch (IllegalArgumentException unused2) {
                jn.T("Invalid color parameter in playerBackground video GMSG.");
                return;
            }
        }
        if (str.equals("decoderProps")) {
            String str4 = (String) map.get("mimeTypes");
            if (str4 == null) {
                jn.T("No MIME types specified for decoder properties inspection.");
                HashMap map2 = new HashMap();
                map2.put("event", "decoderProps");
                map2.put("error", "missingMimeTypes");
                md1Var.a("onVideoEvent", map2);
                return;
            }
            HashMap map3 = new HashMap();
            for (String str5 : str4.split(",")) {
                map3.put(str5, pd1.a(str5.trim()));
            }
            HashMap map4 = new HashMap();
            map4.put("event", "decoderProps");
            map4.put("mimeTypes", map3);
            md1Var.a("onVideoEvent", map4);
            return;
        }
        kd0 kd0VarC0 = md1Var.c0();
        if (kd0VarC0 == null) {
            jn.T("Could not get underlay container for a video GMSG.");
            return;
        }
        boolean zEquals = str.equals("new");
        boolean zEquals2 = str.equals("position");
        if (zEquals || zEquals2) {
            Context context = md1Var.getContext();
            int iA = a(context, map, "x", 0);
            int iA2 = a(context, map, "y", 0);
            int iA3 = a(context, map, "w", -1);
            ix0 ix0Var = lx0.k4;
            tu0 tu0Var = tu0.e;
            if (((Boolean) tu0Var.c.a(ix0Var)).booleanValue()) {
                iMin = iA3 == -1 ? md1Var.c() : Math.min(iA3, md1Var.c());
            } else {
                if (jn.B()) {
                    int iC = md1Var.c();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(iA).length() + ec.f(String.valueOf(iC), String.valueOf(iA3).length() + 72, 4) + 1);
                    sb2.append("Calculate width with original width ");
                    sb2.append(iA3);
                    sb2.append(", videoHost.getVideoBoundingWidth() ");
                    sb2.append(iC);
                    sb2.append(", x ");
                    sb2.append(iA);
                    sb2.append(".");
                    jn.p(sb2.toString());
                }
                iMin = Math.min(iA3, md1Var.c() - iA);
            }
            int iA4 = a(context, map, "h", -1);
            if (((Boolean) tu0Var.c.a(ix0Var)).booleanValue()) {
                iMin2 = iA4 == -1 ? md1Var.J() : Math.min(iA4, md1Var.J());
            } else {
                if (jn.B()) {
                    int iJ = md1Var.J();
                    StringBuilder sb3 = new StringBuilder(String.valueOf(iA2).length() + ec.f(String.valueOf(iJ), String.valueOf(iA4).length() + 75, 4) + 1);
                    sb3.append("Calculate height with original height ");
                    sb3.append(iA4);
                    sb3.append(", videoHost.getVideoBoundingHeight() ");
                    sb3.append(iJ);
                    sb3.append(", y ");
                    sb3.append(iA2);
                    sb3.append(".");
                    jn.p(sb3.toString());
                }
                iMin2 = Math.min(iA4, md1Var.J() - iA2);
            }
            try {
                i = Integer.parseInt((String) map.get("player"));
            } catch (NumberFormatException unused3) {
                i = 0;
            }
            boolean z2 = Boolean.parseBoolean((String) map.get("spherical"));
            if (!zEquals || ((pb1) kd0VarC0.k) != null) {
                dq.d("The underlay may only be modified from the UI thread.");
                pb1 pb1Var2 = (pb1) kd0VarC0.k;
                if (pb1Var2 != null) {
                    pb1Var2.l(iA, iA2, iMin, iMin2);
                    return;
                }
                return;
            }
            ub1 ub1Var = new ub1((String) map.get("flags"));
            if (((pb1) kd0VarC0.k) == null) {
                yd1 yd1Var = (yd1) kd0VarC0.h;
                de1 de1Var = yd1Var.f;
                jn.q((sx0) de1Var.Q.h, de1Var.O, "vpr2");
                pb1 pb1Var3 = new pb1((Context) kd0VarC0.g, yd1Var, i, z2, (sx0) yd1Var.f.Q.h, ub1Var, (es1) kd0VarC0.j);
                kd0VarC0.k = pb1Var3;
                ((yd1) kd0VarC0.i).addView(pb1Var3, 0, new ViewGroup.LayoutParams(-1, -1));
                ((pb1) kd0VarC0.k).l(iA, iA2, iMin, iMin2);
                yd1Var.f.s.q = false;
            }
            pb1 pb1Var4 = (pb1) kd0VarC0.k;
            if (pb1Var4 != null) {
                b(pb1Var4, map);
                return;
            }
            return;
        }
        fe1 fe1VarF = md1Var.f();
        if (fe1VarF != null) {
            if (str.equals("timeupdate")) {
                String str6 = (String) map.get("currentTime");
                if (str6 == null) {
                    jn.T("currentTime parameter missing from timeupdate video GMSG.");
                    return;
                }
                try {
                    float f = Float.parseFloat(str6);
                    synchronized (fe1VarF.g) {
                        try {
                            fe1VarF.o = f;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return;
                } catch (NumberFormatException unused4) {
                    jn.T("Could not parse currentTime parameter from timeupdate video GMSG: ".concat(str6));
                    return;
                }
            }
            if (str.equals("skip")) {
                synchronized (fe1VarF.g) {
                    z = fe1VarF.m;
                    i2 = fe1VarF.j;
                    fe1VarF.j = 3;
                }
                za1.f.execute(new ee1(fe1VarF, i2, 3, z, z));
                return;
            }
        }
        pb1 pb1Var5 = (pb1) kd0VarC0.k;
        if (pb1Var5 == null) {
            HashMap map5 = new HashMap();
            map5.put("event", "no_video_view");
            md1Var.a("onVideoEvent", map5);
            return;
        }
        if (str.equals("click")) {
            Context context2 = md1Var.getContext();
            int iA5 = a(context2, map, "x", 0);
            float fA = a(context2, map, "y", 0);
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, iA5, fA, 0);
            lb1 lb1Var2 = pb1Var5.l;
            if (lb1Var2 != null) {
                lb1Var2.dispatchTouchEvent(motionEventObtain);
            }
            motionEventObtain.recycle();
            return;
        }
        if (str.equals("currentTime")) {
            String str7 = (String) map.get("time");
            if (str7 == null) {
                jn.T("Time parameter missing from currentTime video GMSG.");
                return;
            }
            try {
                int i3 = (int) (Float.parseFloat(str7) * 1000.0f);
                lb1 lb1Var3 = pb1Var5.l;
                if (lb1Var3 == null) {
                    return;
                }
                lb1Var3.l(i3);
                return;
            } catch (NumberFormatException unused5) {
                jn.T("Could not parse time parameter from currentTime video GMSG: ".concat(str7));
                return;
            }
        }
        if (str.equals("hide")) {
            pb1Var5.setVisibility(4);
            return;
        }
        if (str.equals("remove")) {
            pb1Var5.setVisibility(8);
            return;
        }
        if (str.equals("load")) {
            lb1 lb1Var4 = pb1Var5.l;
            if (lb1Var4 == null) {
                return;
            }
            if (TextUtils.isEmpty(pb1Var5.s)) {
                pb1Var5.c("no_src", new String[0]);
                return;
            } else {
                lb1Var4.A(pb1Var5.s, pb1Var5.t, numValueOf2);
                return;
            }
        }
        if (str.equals("loadControl")) {
            b(pb1Var5, map);
            return;
        }
        if (str.equals("muted")) {
            boolean z3 = Boolean.parseBoolean((String) map.get("muted"));
            lb1 lb1Var5 = pb1Var5.l;
            if (z3) {
                if (lb1Var5 == null) {
                    return;
                }
                wb1 wb1Var = lb1Var5.g;
                wb1Var.e = true;
                wb1Var.a();
                lb1Var5.y();
                return;
            }
            if (lb1Var5 == null) {
                return;
            }
            wb1 wb1Var2 = lb1Var5.g;
            wb1Var2.e = false;
            wb1Var2.a();
            lb1Var5.y();
            return;
        }
        if (str.equals("pause")) {
            lb1 lb1Var6 = pb1Var5.l;
            if (lb1Var6 == null) {
                return;
            }
            lb1Var6.i();
            return;
        }
        if (str.equals("play")) {
            lb1 lb1Var7 = pb1Var5.l;
            if (lb1Var7 == null) {
                return;
            }
            lb1Var7.h();
            return;
        }
        if (str.equals("show")) {
            pb1Var5.setVisibility(0);
            return;
        }
        if (str.equals("src")) {
            String str8 = (String) map.get("src");
            if (((Boolean) tu0.e.c.a(lx0.j2)).booleanValue() && TextUtils.isEmpty(str8)) {
                jn.T("Src parameter missing from src video GMSG.");
                return;
            }
            if (map.containsKey("periodicReportIntervalMs")) {
                try {
                    numValueOf = Integer.valueOf(Integer.parseInt((String) map.get("periodicReportIntervalMs")));
                } catch (NumberFormatException unused6) {
                    jn.T("Video gmsg invalid numeric parameter 'periodicReportIntervalMs': ".concat(String.valueOf((String) map.get("periodicReportIntervalMs"))));
                }
            }
            String[] strArr = {str8};
            String str9 = (String) map.get("demuxed");
            if (str9 != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str9);
                    ArrayList arrayList = new ArrayList();
                    for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                        String string2 = jSONArray.getString(i4);
                        if (!((Boolean) tu0.e.c.a(lx0.j2)).booleanValue() || !TextUtils.isEmpty(string2)) {
                            arrayList.add(string2);
                        }
                    }
                    if (((Boolean) tu0.e.c.a(lx0.j2)).booleanValue() && arrayList.isEmpty()) {
                        StringBuilder sb4 = new StringBuilder(str9.length() + 41);
                        sb4.append("All demuxed URLs are empty for playback: ");
                        sb4.append(str9);
                        jn.T(sb4.toString());
                        return;
                    }
                    strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
                } catch (JSONException unused7) {
                    jn.T("Malformed demuxed URL list for playback: ".concat(str9));
                    strArr = new String[]{str8};
                }
            }
            if (numValueOf != null) {
                md1Var.a1(numValueOf.intValue());
            }
            pb1Var5.s = str8;
            pb1Var5.t = strArr;
            return;
        }
        if (str.equals("touchMove")) {
            Context context3 = md1Var.getContext();
            int iA6 = a(context3, map, "dx", 0);
            int iA7 = a(context3, map, "dy", 0);
            float f2 = iA6;
            float f3 = iA7;
            lb1 lb1Var8 = pb1Var5.l;
            if (lb1Var8 != null) {
                lb1Var8.m(f2, f3);
            }
            if (this.f) {
                return;
            }
            md1Var.i();
            this.f = true;
            return;
        }
        if (!str.equals("volume")) {
            if (str.equals("watermark")) {
                pb1Var5.a();
                return;
            } else {
                jn.T("Unknown video action: ".concat(str));
                return;
            }
        }
        String str10 = (String) map.get("volume");
        if (str10 == null) {
            jn.T("Level parameter missing from volume video GMSG.");
            return;
        }
        try {
            float f4 = Float.parseFloat(str10);
            lb1 lb1Var9 = pb1Var5.l;
            if (lb1Var9 == null) {
                return;
            }
            wb1 wb1Var3 = lb1Var9.g;
            wb1Var3.f = f4;
            wb1Var3.a();
            lb1Var9.y();
        } catch (NumberFormatException unused8) {
            jn.T("Could not parse volume parameter from volume video GMSG: ".concat(str10));
        }
    }
}
