package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.media.MediaFormat;
import android.media.MediaPlayer;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Timer;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class hb1 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ hb1(Object obj, int i, Object obj2) {
        this.f = i;
        this.g = obj2;
        this.h = obj;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x01a7 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:55:0x01a9 A[Catch: all -> 0x01e0, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:51:0x0195, B:55:0x01a9), top: B:63:0x0195 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0195 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private final void a() {
        js1 js1Var;
        final dt1 dt1Var = (dt1) ((oc2) this.g).g;
        String str = (String) this.h;
        Context context = dt1Var.f;
        int i = 5;
        a72 a72VarJ = a72.j(context, 5);
        a72VarJ.a();
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(str).getJSONObject("initializer_settings").getJSONObject("config");
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                final String next = itKeys.next();
                final a72 a72VarJ2 = a72.j(context, i);
                a72VarJ2.a();
                a72VarJ2.r0(next);
                final Object obj = new Object();
                final cb1 cb1Var = new cb1();
                hp hpVarK = na1.K(cb1Var, ((Long) tu0.e.c.a(lx0.W1)).longValue(), TimeUnit.SECONDS, dt1Var.k);
                dt1Var.l.a(next);
                dt1Var.o.l(next);
                vc3.C.k.getClass();
                final long jElapsedRealtime = SystemClock.elapsedRealtime();
                hpVarK.a(new Runnable() { // from class: ct1
                    @Override // java.lang.Runnable
                    public final void run() {
                        dt1 dt1Var2 = dt1Var;
                        Object obj2 = obj;
                        cb1 cb1Var2 = cb1Var;
                        String str2 = next;
                        long j = jElapsedRealtime;
                        a72 a72Var = a72VarJ2;
                        dt1Var2.getClass();
                        synchronized (obj2) {
                            try {
                                if (!cb1Var2.f.isDone()) {
                                    vc3.C.k.getClass();
                                    dt1Var2.d(str2, (int) (SystemClock.elapsedRealtime() - j), "Timeout.", false);
                                    dt1Var2.l.c(str2, "timeout");
                                    dt1Var2.o.s(str2, "timeout");
                                    e72 e72Var = dt1Var2.p;
                                    a72Var.k("Timeout");
                                    a72Var.b(false);
                                    e72Var.b(a72Var.m());
                                    cb1Var2.b(Boolean.FALSE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                }, dt1Var.i);
                arrayList.add(hpVarK);
                at1 at1Var = new at1(jElapsedRealtime, obj, next, cb1Var, dt1Var, a72VarJ2);
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
                ArrayList arrayList2 = new ArrayList();
                if (jSONObjectOptJSONObject != null) {
                    try {
                        JSONArray jSONArray = jSONObjectOptJSONObject.getJSONArray("data");
                        int i2 = 0;
                        while (i2 < jSONArray.length()) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                            String strOptString = jSONObject2.optString("format", "");
                            JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("data");
                            Bundle bundle = new Bundle();
                            if (jSONObjectOptJSONObject2 != null) {
                                Iterator<String> itKeys2 = jSONObjectOptJSONObject2.keys();
                                while (itKeys2.hasNext()) {
                                    String next2 = itKeys2.next();
                                    bundle.putString(next2, jSONObjectOptJSONObject2.optString(next2, ""));
                                    jSONArray = jSONArray;
                                }
                            }
                            JSONArray jSONArray2 = jSONArray;
                            arrayList2.add(new z21(strOptString, bundle));
                            i2++;
                            jSONArray = jSONArray2;
                        }
                    } catch (JSONException unused) {
                    }
                }
                dt1Var.d(next, 0, "", false);
                try {
                    s52 s52VarA = dt1Var.h.a(next, new JSONObject());
                    Executor executor = dt1Var.j;
                    try {
                        dt1 dt1Var2 = dt1Var;
                        try {
                            oc1 oc1Var = new oc1(dt1Var2, next, at1Var, s52VarA, arrayList2);
                            dt1Var = dt1Var2;
                            at1Var = at1Var;
                            executor.execute(oc1Var);
                        } catch (l52 e) {
                            e = e;
                            dt1Var = dt1Var2;
                            at1Var = at1Var;
                            try {
                                String string = "Failed to create Adapter.";
                                if (((Boolean) tu0.e.c.a(lx0.Od)).booleanValue()) {
                                    String message = e.getMessage();
                                    StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 26);
                                    sb.append("Failed to create Adapter.");
                                    sb.append(" ");
                                    sb.append(message);
                                    string = sb.toString();
                                }
                                at1Var.B3(string);
                            } catch (RemoteException e2) {
                                jn.P("", e2);
                            }
                        } catch (JSONException e3) {
                            e = e3;
                            dt1Var = dt1Var2;
                            jn.w("Malformed CLD response", e);
                            dt1Var.o.I("MalformedJson");
                            js1Var = dt1Var.l;
                            synchronized (js1Var) {
                                if (!((Boolean) tu0.e.c.a(lx0.h2)).booleanValue()) {
                                    HashMap mapE = js1Var.e();
                                    mapE.put("action", "aaia");
                                    mapE.put("aair", "MalformedJson");
                                    js1Var.b.add(mapE);
                                }
                                dt1Var.e.c(e);
                                vc3.C.h.d("AdapterInitializer.updateAdapterStatus", e);
                                e72 e72Var = dt1Var.p;
                                a72VarJ.f(e);
                                a72VarJ.b(false);
                                e72Var.b(a72VarJ.m());
                            }
                        }
                    } catch (l52 e4) {
                        e = e4;
                    }
                } catch (l52 e5) {
                    e = e5;
                }
                i = 5;
            }
            vj2 vj2VarM = vj2.m(arrayList);
            hq0 hq0Var = new hq0(dt1Var, 6, a72VarJ);
            Executor executor2 = dt1Var.i;
            bn2 bn2Var = new bn2(vj2VarM, false, false);
            bn2Var.u = new an2(bn2Var, hq0Var, executor2);
            bn2Var.v();
        } catch (JSONException e6) {
            e = e6;
            jn.w("Malformed CLD response", e);
            dt1Var.o.I("MalformedJson");
            js1Var = dt1Var.l;
            synchronized (js1Var) {
                if (!((Boolean) tu0.e.c.a(lx0.h2)).booleanValue()) {
                    HashMap mapE2 = js1Var.e();
                    mapE2.put("action", "aaia");
                    mapE2.put("aair", "MalformedJson");
                    js1Var.b.add(mapE2);
                }
            }
            dt1Var.e.c(e);
            vc3.C.h.d("AdapterInitializer.updateAdapterStatus", e);
            e72 e72Var2 = dt1Var.p;
            a72VarJ.f(e);
            a72VarJ.b(false);
            e72Var2.b(a72VarJ.m());
        }
    }

    /* JADX WARN: Code duplicated, block: B:227:0x0523  */
    /* JADX WARN: Code duplicated, block: B:41:0x0125  */
    /* JADX WARN: Code duplicated, block: B:56:0x014a  */
    /* JADX WARN: Code duplicated, block: B:57:0x014c  */
    /* JADX WARN: Code duplicated, block: B:58:0x014e  */
    /* JADX WARN: Code duplicated, block: B:60:0x0155  */
    /* JADX WARN: Code duplicated, block: B:61:0x0157  */
    /* JADX WARN: Code duplicated, block: B:63:0x015d  */
    /* JADX WARN: Code duplicated, block: B:64:0x015f  */
    /* JADX WARN: Code duplicated, block: B:65:0x0161  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v1, types: [int] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object, np1] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() {
        MediaFormat format;
        md1 md1Var;
        View view;
        ViewGroup viewGroup;
        View view2;
        ViewGroup viewGroup2;
        int i;
        View view3;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        yz0 yz0Var;
        Drawable drawable;
        View view4;
        String strA;
        int i2 = 8;
        int i3 = 5;
        int i4 = 2;
        ?? r11 = 0;
        switch (this.f) {
            case 0:
                kb1 kb1Var = (kb1) this.h;
                MediaPlayer mediaPlayer = (MediaPlayer) this.g;
                md1 md1Var2 = kb1Var.h;
                if (((Boolean) tu0.e.c.a(lx0.Y1)).booleanValue() && md1Var2 != null && mediaPlayer != null) {
                    try {
                        MediaPlayer.TrackInfo[] trackInfo = mediaPlayer.getTrackInfo();
                        if (trackInfo != null) {
                            HashMap map = new HashMap();
                            while (r11 < trackInfo.length) {
                                MediaPlayer.TrackInfo trackInfo2 = trackInfo[r11];
                                if (trackInfo2 != null) {
                                    int trackType = trackInfo2.getTrackType();
                                    if (trackType == 1) {
                                        MediaFormat format2 = trackInfo2.getFormat();
                                        if (format2 != null) {
                                            if (format2.containsKey("frame-rate")) {
                                                try {
                                                    map.put("frameRate", String.valueOf(format2.getFloat("frame-rate")));
                                                } catch (ClassCastException unused) {
                                                    map.put("frameRate", String.valueOf(format2.getInteger("frame-rate")));
                                                }
                                            }
                                            if (format2.containsKey("bitrate")) {
                                                Integer numValueOf = Integer.valueOf(format2.getInteger("bitrate"));
                                                kb1Var.x = numValueOf;
                                                map.put("bitRate", String.valueOf(numValueOf));
                                            }
                                            if (format2.containsKey("width") && format2.containsKey("height")) {
                                                int integer = format2.getInteger("width");
                                                int integer2 = format2.getInteger("height");
                                                StringBuilder sb = new StringBuilder(g72.a(integer, 1) + String.valueOf(integer2).length());
                                                sb.append(integer);
                                                sb.append("x");
                                                sb.append(integer2);
                                                map.put("resolution", sb.toString());
                                            }
                                            if (format2.containsKey("mime")) {
                                                map.put("videoMime", format2.getString("mime"));
                                            }
                                            if (Build.VERSION.SDK_INT >= 30 && format2.containsKey("codecs-string")) {
                                                map.put("videoCodec", format2.getString("codecs-string"));
                                            }
                                        }
                                    } else if (trackType == i4 && (format = trackInfo2.getFormat()) != null) {
                                        if (format.containsKey("mime")) {
                                            map.put("audioMime", format.getString("mime"));
                                        }
                                        if (Build.VERSION.SDK_INT >= 30 && format.containsKey("codecs-string")) {
                                            map.put("audioCodec", format.getString("codecs-string"));
                                        }
                                    }
                                    trackInfo = trackInfo;
                                } else {
                                    trackInfo = trackInfo;
                                }
                                trackInfo = trackInfo;
                                i4 = 2;
                                r11++;
                                break;
                            }
                            if (!map.isEmpty()) {
                                md1Var2.a("onMetadataEvent", map);
                            }
                        }
                    } catch (RuntimeException e) {
                        vc3.C.h.d("AdMediaPlayerView.reportMetadata", e);
                    }
                }
                pb1 pb1Var = kb1Var.v;
                if (pb1Var != null) {
                    pb1Var.e();
                    return;
                }
                return;
            case 1:
                AtomicInteger atomicInteger = ed1.z;
                ((md1) this.g).a("onGcacheInfoEvent", (HashMap) this.h);
                return;
            case 2:
                oc2 oc2Var = new oc2(18, (yd1) this.g);
                pw1 pw1Var = (pw1) this.h;
                synchronized (pw1Var) {
                    c92 c92Var = pw1Var.f;
                    if (c92Var != null && (md1Var = pw1Var.d) != null) {
                        vc3.C.x.getClass();
                        el1.n(new hb1(c92Var, oc2Var, 22, r11));
                        pw1Var.f = null;
                        md1Var.D(null);
                    }
                    break;
                }
                return;
            case 3:
                ((de1) this.g).R((String) this.h);
                return;
            case 4:
                ((fe1) this.g).f.a("pubVideoCmd", (HashMap) this.h);
                return;
            case 5:
                ge1 ge1Var = (ge1) this.g;
                String str = (String) this.h;
                zx zxVar = ge1Var.a;
                Uri uri = Uri.parse(str);
                he1 he1Var = ((de1) zxVar.g).s;
                if (he1Var == null) {
                    jn.M("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
                    return;
                } else {
                    he1Var.l(uri);
                    return;
                }
            case 6:
                kh1 kh1Var = (kh1) this.g;
                JSONObject jSONObject = (JSONObject) this.h;
                String string = jSONObject.toString();
                StringBuilder sb2 = new StringBuilder(string.length() + 31);
                sb2.append("Calling AFMA_updateActiveView(");
                sb2.append(string);
                sb2.append(")");
                jn.F(sb2.toString());
                kh1Var.f.e("AFMA_updateActiveView", jSONObject);
                return;
            case 7:
                ts2 ts2Var = (ts2) this.g;
                Integer num = (Integer) this.h;
                if (ts2Var.f == 0) {
                    ts2Var.n(num);
                    return;
                }
                return;
            case 8:
                ts2 ts2Var2 = (ts2) this.g;
                Object obj = this.h;
                int i5 = ts2Var2.f - 1;
                ts2Var2.f = i5;
                if (i5 == 0) {
                    ts2Var2.n(obj);
                    return;
                }
                return;
            case 9:
                ts2 ts2Var3 = (ts2) this.g;
                Object objApply = ((c73) this.h).apply(ts2Var3.k);
                ts2Var3.k = objApply;
                hb1 hb1Var = new hb1(ts2Var3, objApply, i2, r11);
                wx1 wx1Var = (wx1) ts2Var3.h;
                if (wx1Var.a.getLooper().getThread().isAlive()) {
                    wx1Var.d(hb1Var);
                    return;
                }
                return;
            case 10:
                q2 q2Var = (q2) this.h;
                w7 w7Var = (w7) this.g;
                try {
                    w7Var.f.b(q2Var.a);
                    return;
                } catch (IllegalStateException e2) {
                    e71.a(w7Var.getContext()).c("BaseAdView.loadAd", e2);
                    return;
                }
            case 11:
                try {
                    ((gm1) this.g).mo4b(this.h);
                    return;
                } catch (Throwable th) {
                    vc3.C.h.e("EventEmitter.notify", th);
                    jn.w("Event emitter exception.", th);
                    return;
                }
            case 12:
                ap1 ap1Var = (ap1) this.g;
                ViewGroup viewGroup5 = (ViewGroup) this.h;
                i52 i52Var = ap1Var.b;
                h73 h73Var = ap1Var.a;
                ro1 ro1Var = ap1Var.d;
                synchronized (ro1Var) {
                    view = ro1Var.o;
                }
                if (view != null) {
                    boolean z = viewGroup5 != null;
                    if (ro1Var.q() == 2 || ro1Var.q() == 1) {
                        h73Var.o(i52Var.g, String.valueOf(ro1Var.q()), z);
                        return;
                    } else {
                        if (ro1Var.q() == 6) {
                            String str2 = i52Var.g;
                            h73Var.o(str2, "2", z);
                            h73Var.o(str2, "1", z);
                            return;
                        }
                        return;
                    }
                }
                return;
            case 13:
                ap1 ap1Var2 = (ap1) this.g;
                ?? r3 = (np1) this.h;
                to1 to1Var = ap1Var2.c;
                if (to1Var.d() || to1Var.b()) {
                    String[] strArr = {"1098", "3011"};
                    int i6 = 0;
                    while (true) {
                        if (i6 < 2) {
                            View viewY3 = r3.y3(strArr[i6]);
                            if (viewY3 instanceof ViewGroup) {
                                viewGroup = (ViewGroup) viewY3;
                            } else {
                                i6++;
                            }
                        } else {
                            viewGroup = null;
                        }
                    }
                } else {
                    viewGroup = null;
                }
                Context context = r3.Z0().getContext();
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                ro1 ro1Var2 = ap1Var2.d;
                synchronized (ro1Var2) {
                    view2 = ro1Var2.d;
                }
                if (view2 == null) {
                    if (ro1Var2.s() instanceof mz0) {
                        mz0 mz0Var = (mz0) ro1Var2.s();
                        if (viewGroup == null) {
                            viewGroup2 = viewGroup;
                            ap1.b(layoutParams, mz0Var.m);
                            viewGroup2 = null;
                        }
                        viewGroup2 = viewGroup;
                        nz0 nz0Var = new nz0(context);
                        dq.f(mz0Var);
                        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(nz0.g, null, null));
                        shapeDrawable.getPaint().setColor(mz0Var.i);
                        nz0Var.setLayoutParams(layoutParams);
                        nz0Var.setBackground(shapeDrawable);
                        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
                        String str3 = mz0Var.f;
                        if (TextUtils.isEmpty(str3)) {
                            i = 1;
                        } else {
                            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
                            TextView textView = new TextView(context);
                            textView.setLayoutParams(layoutParams3);
                            textView.setId(1195835393);
                            textView.setTypeface(Typeface.DEFAULT);
                            textView.setText(str3);
                            textView.setTextColor(mz0Var.j);
                            textView.setTextSize(mz0Var.k);
                            f32 f32Var = ut0.f.a;
                            textView.setPadding(f32.b(context, 4), 0, f32.n(context.getResources().getDisplayMetrics(), 4), 0);
                            nz0Var.addView(textView);
                            i = 1;
                            layoutParams2.addRule(1, textView.getId());
                        }
                        ImageView imageView = new ImageView(context);
                        imageView.setLayoutParams(layoutParams2);
                        imageView.setId(1195835394);
                        ArrayList arrayList = mz0Var.g;
                        if (arrayList != null && arrayList.size() > i) {
                            nz0Var.f = new AnimationDrawable();
                            int size = arrayList.size();
                            int i7 = 0;
                            while (i7 < size) {
                                int i8 = i7 + 1;
                                try {
                                    nz0Var.f.addFrame((Drawable) ju.Z0(((oz0) arrayList.get(i7)).c()), mz0Var.l);
                                } catch (Exception e3) {
                                    jn.P("Error while getting drawable.", e3);
                                }
                                i7 = i8;
                            }
                            imageView.setBackground(nz0Var.f);
                        } else if (arrayList.size() == 1) {
                            try {
                                imageView.setImageDrawable((Drawable) ju.Z0(((oz0) arrayList.get(0)).c()));
                            } catch (Exception e4) {
                                jn.P("Error while getting drawable.", e4);
                            }
                        }
                        nz0Var.addView(imageView);
                        nz0Var.setContentDescription((CharSequence) tu0.e.c.a(lx0.h4));
                        view3 = nz0Var;
                        viewGroup3 = viewGroup2;
                    } else {
                        view3 = null;
                    }
                    break;
                } else {
                    synchronized (ro1Var2) {
                        view4 = ro1Var2.d;
                    }
                    qz0 qz0Var = ap1Var2.i;
                    view3 = view4;
                    view3 = view4;
                    viewGroup3 = viewGroup;
                    viewGroup3 = viewGroup;
                    if (qz0Var != null && viewGroup == null) {
                        ap1.b(layoutParams, qz0Var.j);
                        view4.setLayoutParams(layoutParams);
                        viewGroup3 = null;
                    }
                }
                if (view3 != null) {
                    viewGroup3 = viewGroup;
                    if (view3.getParent() instanceof ViewGroup) {
                        view3 = view4;
                        ((ViewGroup) view3.getParent()).removeView(view3);
                    }
                    if (viewGroup3 != null) {
                        viewGroup3.removeAllViews();
                        viewGroup3.addView(view3);
                    } else {
                        gb0 gb0Var = new gb0(r3.Z0().getContext());
                        gb0Var.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                        gb0Var.addView(view3);
                        FrameLayout frameLayoutO0 = r3.O0();
                        if (frameLayoutO0 != null) {
                            frameLayoutO0.addView(gb0Var);
                        }
                    }
                    r3.Y1(view3, r3.o());
                }
                viewGroup3 = viewGroup;
                view3 = view4;
                qk2 qk2Var = zo1.u;
                int i9 = qk2Var.i;
                int i10 = 0;
                while (true) {
                    if (i10 < i9) {
                        View viewY4 = r3.y3((String) qk2Var.get(i10));
                        i10++;
                        if (viewY4 instanceof ViewGroup) {
                            viewGroup4 = (ViewGroup) viewY4;
                        }
                    } else {
                        viewGroup4 = null;
                    }
                }
                ap1Var2.h.execute(new hb1(ap1Var2, viewGroup4, 12, r11));
                if (viewGroup4 == null) {
                    return;
                }
                int i11 = 14;
                if (ap1Var2.c(viewGroup4, true)) {
                    if (ro1Var2.h() != null) {
                        ro1Var2.h().L(new un1((Object) r3, i11, viewGroup4));
                        return;
                    }
                    return;
                }
                ix0 ix0Var = lx0.Oa;
                tu0 tu0Var = tu0.e;
                if (((Boolean) tu0Var.c.a(ix0Var)).booleanValue() && ap1Var2.c(viewGroup4, false)) {
                    if (ro1Var2.i() != null) {
                        ro1Var2.i().L(new un1((Object) r3, i11, viewGroup4));
                        return;
                    }
                    return;
                }
                viewGroup4.removeAllViews();
                View viewZ0 = r3.Z0();
                Context context2 = viewZ0 != null ? viewZ0.getContext() : null;
                if (context2 != null) {
                    po1 po1Var = ap1Var2.j;
                    synchronized (po1Var) {
                        yz0Var = po1Var.a;
                    }
                    if (yz0Var != null) {
                        try {
                            rm rmVarE = yz0Var.e();
                            if (rmVarE == null || (drawable = (Drawable) ju.Z0(rmVarE)) == null) {
                                return;
                            }
                            ImageView imageView2 = new ImageView(context2);
                            imageView2.setImageDrawable(drawable);
                            rm rmVarP = r3.p();
                            if (rmVarP == null) {
                                imageView2.setScaleType(ap1.k);
                            } else if (((Boolean) tu0Var.c.a(lx0.B6)).booleanValue()) {
                                imageView2.setScaleType((ImageView.ScaleType) ju.Z0(rmVarP));
                            } else {
                                imageView2.setScaleType(ap1.k);
                            }
                            imageView2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                            viewGroup4.addView(imageView2);
                            return;
                        } catch (RemoteException unused2) {
                            jn.T("Could not get main image drawable");
                            return;
                        }
                    }
                    return;
                }
                return;
            case 14:
                a();
                return;
            case 15:
                ((dt1) this.g).i.execute(new va1(21, (cb1) this.h));
                return;
            case 16:
                try {
                    ((y21) this.h).R1(((dt1) this.g).b());
                    return;
                } catch (RemoteException e5) {
                    jn.P("", e5);
                    return;
                }
            case 17:
                bu1 bu1Var = (bu1) this.g;
                Context context3 = (Context) this.h;
                es1 es1Var = bu1Var.g;
                wx0 wx0Var = vc3.C.n;
                if (wx0Var.b.getAndSet(true)) {
                    return;
                }
                wx0Var.c = context3;
                wx0Var.d = es1Var;
                if (wx0Var.f != null || (strA = nd.a(context3)) == null || strA.equals(context3.getPackageName())) {
                    return;
                }
                wx0Var.a = context3.getApplicationContext();
                Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
                if (!TextUtils.isEmpty(strA)) {
                    intent.setPackage(strA);
                }
                context3.bindService(intent, wx0Var, 33);
                return;
            case 18:
                tk1 tk1Var = (tk1) this.h;
                ve3 ve3Var = (ve3) tk1Var.h;
                try {
                    ve3 ve3Var2 = (ve3) ((w32) tk1Var.i).c((ve3) this.g);
                    if (ve3Var2 == null) {
                        tk1Var.c(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    qk qkVar = ve3Var2.b;
                    o4 o4Var = m30.b;
                    qkVar.b(new bq2(o4Var, tk1Var, 1));
                    ve3Var2.h();
                    qkVar.b(new tk1(o4Var, tk1Var));
                    ve3Var2.h();
                    qkVar.b(new bq2(o4Var, tk1Var, 0));
                    ve3Var2.h();
                    return;
                } catch (fy e6) {
                    if (e6.getCause() instanceof Exception) {
                        ve3Var.d((Exception) e6.getCause());
                        return;
                    } else {
                        ve3Var.d(e6);
                        return;
                    }
                } catch (Exception e7) {
                    ve3Var.d(e7);
                    return;
                }
            case 19:
                es1 es1Var2 = (es1) this.g;
                Long l = (Long) this.h;
                vc3.C.k.getClass();
                je0.f(es1Var2, "cld_r", SystemClock.elapsedRealtime() - l.longValue());
                return;
            case 20:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                ((Context) this.h).registerReceiver(new y4(i3, (nv1) this.g), intentFilter);
                return;
            case zw0.zzm /* 21 */:
                nv1 nv1Var = (nv1) ((y4) this.g).b;
                Context context4 = (Context) this.h;
                nv1Var.getClass();
                ConnectivityManager connectivityManager = (ConnectivityManager) context4.getSystemService("connectivity");
                if (connectivityManager == null) {
                    i2 = 0;
                } else {
                    try {
                        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                            i2 = 1;
                        } else {
                            int type = activeNetworkInfo.getType();
                            if (type == 0) {
                                switch (activeNetworkInfo.getSubtype()) {
                                    case 1:
                                    case 2:
                                        i2 = 3;
                                        break;
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                    case 14:
                                    case 15:
                                    case 17:
                                        i2 = 4;
                                        break;
                                    case 13:
                                        i2 = 5;
                                        break;
                                    case 16:
                                    case 19:
                                    default:
                                        i2 = 6;
                                        break;
                                    case 18:
                                        i2 = 2;
                                        break;
                                    case 20:
                                        if (Build.VERSION.SDK_INT >= 29) {
                                            i2 = 9;
                                        } else {
                                            i2 = 0;
                                        }
                                        break;
                                }
                            } else if (type == 1) {
                                i2 = 2;
                            } else if (type == 4 || type == 5) {
                                switch (activeNetworkInfo.getSubtype()) {
                                    case 1:
                                    case 2:
                                        i2 = 3;
                                        break;
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                    case 14:
                                    case 15:
                                    case 17:
                                        i2 = 4;
                                        break;
                                    case 13:
                                        i2 = 5;
                                        break;
                                    case 16:
                                    case 19:
                                    default:
                                        i2 = 6;
                                        break;
                                    case 18:
                                        i2 = 2;
                                        break;
                                    case 20:
                                        if (Build.VERSION.SDK_INT >= 29) {
                                            i2 = 9;
                                        } else {
                                            i2 = 0;
                                        }
                                        break;
                                }
                            } else if (type == 6) {
                                i2 = 5;
                            } else if (type == 9) {
                                i2 = 7;
                            }
                        }
                    } catch (SecurityException unused3) {
                    }
                }
                if (Build.VERSION.SDK_INT < 31 || i2 != 5) {
                    nv1Var.c(i2);
                    return;
                }
                try {
                    TelephonyManager telephonyManager = (TelephonyManager) context4.getSystemService("phone");
                    if (telephonyManager == null) {
                        throw null;
                    }
                    ts1 ts1Var = new ts1(nv1Var);
                    telephonyManager.registerTelephonyCallback(nv1Var.a, ts1Var);
                    telephonyManager.unregisterTelephonyCallback(ts1Var);
                    return;
                } catch (RuntimeException unused4) {
                    nv1Var.c(5);
                    return;
                }
            case 22:
                c92 c92Var2 = (c92) this.g;
                oc2 oc2Var2 = (oc2) this.h;
                Iterator it = c92Var2.d.values().iterator();
                while (it.hasNext()) {
                    ((x82) it.next()).c();
                }
                Timer timer = new Timer();
                timer.schedule(new dw1(c92Var2, oc2Var2, timer), 1000L);
                return;
            case 23:
                c92 c92Var3 = (c92) this.g;
                View view5 = (View) this.h;
                a92 a92Var = a92.f;
                for (x82 x82Var : c92Var3.d.values()) {
                    if (!x82Var.f) {
                        x82Var.b.a(view5, a92Var);
                    }
                }
                c92Var3.e.a(view5, a92Var);
                return;
            case 24:
                hx1 hx1Var = (hx1) this.g;
                md1 md1Var3 = (md1) this.h;
                md1Var3.J0();
                i52 i52Var2 = hx1Var.d;
                fe1 fe1VarF = md1Var3.f();
                ee2 ee2Var = i52Var2.a;
                if (ee2Var != null && fe1VarF != null) {
                    fe1VarF.C3(ee2Var);
                }
                if (!((Boolean) tu0.e.c.a(lx0.r1)).booleanValue() || md1Var3.isAttachedToWindow()) {
                    return;
                }
                md1Var3.onPause();
                md1Var3.I0();
                return;
            case 25:
                ((yy1) this.g).l.addView((View) ju.Z0((rm) this.h));
                return;
            case 26:
                ((tz1) ((r52) ((es0) ((kd0) this.g).k).i).i).Z((fu1) this.h);
                return;
            case 27:
                ((p32) ((kd0) this.g).k).d.Z((fu1) this.h);
                return;
            case 28:
                ((v32) this.g).d.Z((fu1) this.h);
                return;
            default:
                ((s42) ((kd0) this.g).k).d.Z((fu1) this.h);
                return;
        }
    }

    public /* synthetic */ hb1(Object obj, Object obj2, int i, boolean z) {
        this.f = i;
        this.g = obj;
        this.h = obj2;
    }
}
