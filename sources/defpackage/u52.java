package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.BitmapDrawable;
import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.security.NetworkSecurityPolicy;
import android.util.Log;
import android.webkit.WebView;
import java.io.IOException;
import java.io.InputStream;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u52 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public u52(gm gmVar, WebView webView, String str) {
        this.f = 5;
        this.g = webView;
        this.h = str;
    }

    private final void a() {
        Object fh2Var;
        IBinder iBinder = (IBinder) this.h;
        int i = gh2.f;
        if (iBinder == null) {
            fh2Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.lmd.protocol.ILmdOverlayService");
            fh2Var = iInterfaceQueryLocalInterface instanceof hh2 ? (hh2) iInterfaceQueryLocalInterface : new fh2(iBinder, "com.google.android.play.core.lmd.protocol.ILmdOverlayService", 2);
        }
        ph2 ph2Var = (ph2) this.g;
        qx1 qx1Var = ph2Var.a;
        qx1Var.o = fh2Var;
        int i2 = 0;
        ((wo2) qx1Var.i).d("linkToDeath", new Object[0]);
        try {
            IInterface iInterface = (hh2) qx1Var.o;
            if (iInterface == null) {
                throw null;
            }
            ((v90) iInterface).g.linkToDeath((qh2) qx1Var.m, 0);
            qx1 qx1Var2 = ph2Var.a;
            qx1Var2.f = false;
            synchronized (((ArrayList) qx1Var2.k)) {
                try {
                    ArrayList arrayList = (ArrayList) qx1Var2.k;
                    int size = arrayList.size();
                    while (i2 < size) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        ((Runnable) obj).run();
                    }
                    ((ArrayList) qx1Var2.k).clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (RemoteException e) {
            ((wo2) ph2Var.a.i).g(e, "linkToDeath failed", new Object[0]);
        }
    }

    private final void b() {
        h73 h73Var = (h73) this.g;
        SharedPreferences sharedPreferences = ((Context) this.h).getSharedPreferences("admob", 0);
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        try {
            synchronized (h73Var.a) {
                try {
                    h73Var.f = sharedPreferences;
                    h73Var.g = editorEdit;
                    NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
                    h73Var.h = h73Var.f.getBoolean("use_https", h73Var.h);
                    h73Var.u = h73Var.f.getBoolean("content_url_opted_out", h73Var.u);
                    h73Var.i = h73Var.f.getString("content_url_hashes", h73Var.i);
                    h73Var.k = h73Var.f.getBoolean("gad_idless", h73Var.k);
                    h73Var.v = h73Var.f.getBoolean("content_vertical_opted_out", h73Var.v);
                    h73Var.j = h73Var.f.getString("content_vertical_hashes", h73Var.j);
                    h73Var.r = h73Var.f.getInt("version_code", h73Var.r);
                    if (((Boolean) ly0.g.u()).booleanValue() && tu0.e.c.j) {
                        h73Var.n = new qa1("", 0L);
                    } else {
                        h73Var.n = new qa1(h73Var.f.getString("app_settings_json", h73Var.n.e), h73Var.f.getLong("app_settings_last_update_ms", h73Var.n.f));
                    }
                    h73Var.o = h73Var.f.getLong("app_last_background_time_ms", h73Var.o);
                    h73Var.q = h73Var.f.getInt("request_in_session_count", h73Var.q);
                    h73Var.p = h73Var.f.getLong("first_ad_req_time_ms", h73Var.p);
                    h73Var.s = h73Var.f.getStringSet("never_pool_slots", h73Var.s);
                    h73Var.w = h73Var.f.getString("display_cutout", h73Var.w);
                    h73Var.B = h73Var.f.getInt("app_measurement_npa", h73Var.B);
                    h73Var.C = h73Var.f.getInt("sd_app_measure_npa", h73Var.C);
                    h73Var.D = h73Var.f.getLong("sd_app_measure_npa_ts", h73Var.D);
                    h73Var.x = h73Var.f.getString("inspector_info", h73Var.x);
                    h73Var.y = h73Var.f.getBoolean("linked_device", h73Var.y);
                    h73Var.z = h73Var.f.getString("linked_ad_unit", h73Var.z);
                    h73Var.A = h73Var.f.getString("inspector_ui_storage", h73Var.A);
                    h73Var.l = h73Var.f.getString("IABTCF_TCString", h73Var.l);
                    h73Var.m = h73Var.f.getInt("gad_has_consent_for_cookies", h73Var.m);
                    try {
                        h73Var.t = new JSONObject(h73Var.f.getString("native_advanced_settings", "{}"));
                    } catch (JSONException e) {
                        jn.V("Could not convert native advanced settings to json object", e);
                    }
                    h73Var.i();
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            vc3.C.h.d("AdSharedPreferenceManagerImpl.initializeOnBackgroundThread", th2);
            jn.w("AdSharedPreferenceManagerImpl.initializeOnBackgroundThread, errorMessage = ", th2);
        }
    }

    private final void c() {
        synchronized (((tk1) this.h).i) {
            ((vu) ((tk1) this.h).h).g((ve3) this.g);
        }
    }

    private final void d() {
        synchronized (((tk1) this.h).i) {
            xu xuVar = (xu) ((tk1) this.h).h;
            Exception excA = ((ve3) this.g).a();
            dq.f(excA);
            xuVar.c(excA);
        }
    }

    private final void e() {
        synchronized (((bq2) this.h).h) {
            tk1 tk1Var = ((bq2) this.h).i;
            ((ve3) tk1Var.h).e(((ve3) this.g).b());
        }
    }

    private final void f() {
        un1 un1Var = (un1) this.g;
        synchronized (((b03) this.h)) {
        }
        String str = qz1.a;
        z93 z93Var = ((d73) un1Var.h).f.x;
        z93Var.s(z93Var.x((yd3) z93Var.i.j), 1013, new r53(6, (byte) 0));
    }

    /* JADX WARN: Code duplicated, block: B:274:0x0352 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        x51 x51Var;
        kc1 kc1Var;
        long j;
        boolean z;
        long j2 = -9223372036854775807L;
        boolean z2 = false;
        int i = 1;
        switch (this.f) {
            case 0:
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) this.h;
                InputStream inputStream = (InputStream) this.g;
                try {
                    try {
                        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptor);
                        try {
                            ar.c(inputStream, autoCloseOutputStream, false);
                            autoCloseOutputStream.close();
                            inputStream.close();
                            return;
                        } catch (Throwable th) {
                            try {
                                autoCloseOutputStream.close();
                                throw th;
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        if (inputStream == null) {
                            throw th3;
                        }
                        try {
                            inputStream.close();
                            throw th3;
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                            throw th3;
                        }
                    }
                } catch (IOException unused) {
                    return;
                }
            case 1:
                ((u62) ((es0) this.g).k).c.L1(new s62((p62) this.h));
                return;
            case 2:
                e72 e72Var = (e72) this.g;
                c72 c72Var = (c72) this.h;
                synchronized (e72.q) {
                    try {
                        if (!e72Var.n) {
                            e72Var.n = true;
                            if (e72.a()) {
                                try {
                                    zb3 zb3Var = vc3.C.c;
                                    e72Var.i = zb3.N(e72Var.f);
                                } catch (RemoteException | RuntimeException e) {
                                    vc3.C.h.d("CuiMonitor.gettingAppIdFromManifest", e);
                                }
                                am amVar = am.b;
                                Context context = e72Var.f;
                                amVar.getClass();
                                e72Var.j = am.a(context);
                                ix0 ix0Var = lx0.t9;
                                tu0 tu0Var = tu0.e;
                                int iIntValue = ((Integer) tu0Var.c.a(ix0Var)).intValue();
                                if (((Boolean) tu0Var.c.a(lx0.Gc)).booleanValue()) {
                                    long j3 = iIntValue;
                                    za1.d.scheduleWithFixedDelay(e72Var, j3, j3, TimeUnit.MILLISECONDS);
                                } else {
                                    long j4 = iIntValue;
                                    za1.d.scheduleAtFixedRate(e72Var, j4, j4, TimeUnit.MILLISECONDS);
                                }
                                ix0 ix0Var2 = lx0.z9;
                                if (((Boolean) tu0Var.c.a(ix0Var2)).booleanValue()) {
                                    se1 se1Var = e72Var.m;
                                    se1Var.getClass();
                                    if (((Boolean) tu0Var.c.a(ix0Var2)).booleanValue() && !se1Var.e.getAndSet(true)) {
                                        se1Var.a();
                                    }
                                }
                                break;
                            }
                        }
                    } catch (Throwable th5) {
                        throw th5;
                    }
                }
                if (e72.a() && c72Var != null) {
                    synchronized (e72.p) {
                        try {
                            i72 i72Var = e72Var.h;
                            int iZ = ((l72) i72Var.g).z();
                            ix0 ix0Var3 = lx0.u9;
                            tu0 tu0Var2 = tu0.e;
                            if (iZ >= ((Integer) tu0Var2.c.a(ix0Var3)).intValue()) {
                                return;
                            }
                            f72 f72VarB = h72.B();
                            int i2 = c72Var.m;
                            f72VarB.b();
                            ((h72) f72VarB.g).X(i2);
                            boolean z3 = c72Var.b;
                            f72VarB.b();
                            ((h72) f72VarB.g).C(z3);
                            long j5 = c72Var.a;
                            f72VarB.b();
                            ((h72) f72VarB.g).D(j5);
                            f72VarB.b();
                            ((h72) f72VarB.g).Y();
                            String str = e72Var.g.f;
                            f72VarB.b();
                            ((h72) f72VarB.g).F(str);
                            String str2 = e72Var.i;
                            f72VarB.b();
                            ((h72) f72VarB.g).G(str2);
                            String str3 = Build.VERSION.RELEASE;
                            f72VarB.b();
                            ((h72) f72VarB.g).H(str3);
                            int i3 = Build.VERSION.SDK_INT;
                            f72VarB.b();
                            ((h72) f72VarB.g).I(i3);
                            int i4 = c72Var.o;
                            f72VarB.b();
                            ((h72) f72VarB.g).z(i4);
                            int i5 = c72Var.c;
                            f72VarB.b();
                            ((h72) f72VarB.g).K(i5);
                            long j6 = e72Var.j;
                            f72VarB.b();
                            ((h72) f72VarB.g).L(j6);
                            int i6 = c72Var.n;
                            f72VarB.b();
                            ((h72) f72VarB.g).A(i6);
                            String str4 = c72Var.d;
                            f72VarB.b();
                            ((h72) f72VarB.g).M(str4);
                            String str5 = c72Var.e;
                            f72VarB.b();
                            ((h72) f72VarB.g).N(str5);
                            String str6 = c72Var.f;
                            f72VarB.b();
                            ((h72) f72VarB.g).O(str6);
                            pr1 pr1VarB = e72Var.k.b(c72Var.f);
                            String string = (pr1VarB == null || (x51Var = pr1VarB.b) == null) ? "" : x51Var.toString();
                            f72VarB.b();
                            ((h72) f72VarB.g).P(string);
                            String str7 = c72Var.g;
                            f72VarB.b();
                            ((h72) f72VarB.g).Q(str7);
                            int i7 = c72Var.h;
                            f72VarB.b();
                            ((h72) f72VarB.g).U(i7);
                            String str8 = c72Var.k;
                            f72VarB.b();
                            ((h72) f72VarB.g).T(str8);
                            String str9 = c72Var.i;
                            f72VarB.b();
                            ((h72) f72VarB.g).R(str9);
                            String str10 = c72Var.j;
                            f72VarB.b();
                            ((h72) f72VarB.g).S(str10);
                            long j7 = c72Var.l;
                            f72VarB.b();
                            ((h72) f72VarB.g).E(j7);
                            if (((Boolean) tu0Var2.c.a(lx0.y9)).booleanValue()) {
                                Collection collection = e72Var.l;
                                f72VarB.b();
                                ((h72) f72VarB.g).J((AbstractCollection) collection);
                            }
                            if (((Boolean) tu0Var2.c.a(lx0.z9)).booleanValue()) {
                                se1 se1Var2 = e72Var.m;
                                f43 f43Var = se1Var2.b;
                                String str11 = se1Var2.a;
                                if (f43Var != null) {
                                    f72VarB.b();
                                    ((h72) f72VarB.g).V(f43Var);
                                }
                                if (str11 != null) {
                                    f72VarB.b();
                                    ((h72) f72VarB.g).W(str11);
                                }
                            }
                            j72 j72VarZ = k72.z();
                            j72VarZ.b();
                            ((k72) j72VarZ.g).A((h72) f72VarB.c());
                            i72Var.b();
                            ((l72) i72Var.g).B((k72) j72VarZ.c());
                            return;
                        } catch (Throwable th6) {
                            throw th6;
                        }
                    }
                }
                return;
            case 3:
                k82 k82Var = (k82) this.h;
                lu1 lu1Var = (lu1) this.g;
                synchronized (k82Var) {
                    bb1 bb1Var = k82Var.g;
                    if (bb1Var != null) {
                        try {
                            ab2 ab2Var = k82Var.e;
                            Parcel parcelU = bb1Var.U();
                            kt0.c(parcelU, ab2Var);
                            bb1Var.K0(parcelU, 1);
                        } catch (RemoteException unused2) {
                            jn.T("Failed to call onAdsAvailable");
                        }
                        kc1Var = k82Var.h;
                        if (kc1Var != null) {
                            try {
                                String str12 = k82Var.k;
                                Parcel parcelU2 = kc1Var.U();
                                parcelU2.writeString(str12);
                                kt0.e(parcelU2, lu1Var);
                                kc1Var.K0(parcelU2, 1);
                            } catch (RemoteException unused3) {
                                jn.T("Failed to call onAdPreloaded");
                                return;
                            }
                        }
                        break;
                    } else {
                        kc1Var = k82Var.h;
                        if (kc1Var != null) {
                            String str13 = k82Var.k;
                            Parcel parcelU3 = kc1Var.U();
                            parcelU3.writeString(str13);
                            kt0.e(parcelU3, lu1Var);
                            kc1Var.K0(parcelU3, 1);
                        }
                        break;
                    }
                    throw th;
                }
                return;
            case 4:
                k82 k82Var2 = (k82) this.h;
                fu1 fu1Var = (fu1) this.g;
                synchronized (k82Var2) {
                    kc1 kc1Var2 = k82Var2.h;
                    if (kc1Var2 != null) {
                        try {
                            String str14 = k82Var2.k;
                            Parcel parcelU4 = kc1Var2.U();
                            parcelU4.writeString(str14);
                            kt0.c(parcelU4, fu1Var);
                            kc1Var2.K0(parcelU4, 3);
                        } catch (RemoteException unused4) {
                            jn.T("Failed to call onAdFailedToPreload");
                            return;
                        }
                    }
                    break;
                }
                return;
            case 5:
                gm.q((WebView) this.g, (String) this.h);
                return;
            case 6:
                ((k30) this.h).a.e(hb2.a((Context) this.g, "GLAS"));
                return;
            case 7:
                a();
                return;
            case 8:
                ((sm2) this.g).u((rj2) this.h);
                return;
            case 9:
                p83 p83Var = (p83) this.g;
                ve3 ve3Var = ((k30) this.h).a;
                Context context2 = (Context) p83Var.g;
                String string2 = p83.D(context2).getString("app_set_id", null);
                long j8 = p83.D(context2).getLong("app_set_id_last_used_time", -1L);
                long j9 = j8 != -1 ? 33696000000L + j8 : -1L;
                if (string2 != null && System.currentTimeMillis() <= j9) {
                    try {
                        p83.E(context2);
                    } catch (x73 e2) {
                        ve3Var.d(e2);
                        return;
                    }
                    break;
                } else {
                    string2 = UUID.randomUUID().toString();
                    try {
                        if (!context2.getSharedPreferences("app_set_id_storage", 0).edit().putString("app_set_id", string2).commit()) {
                            String strValueOf = String.valueOf(context2.getPackageName());
                            Log.e("AppSet", strValueOf.length() != 0 ? "Failed to store app set ID generated for App ".concat(strValueOf) : new String("Failed to store app set ID generated for App "));
                            throw new x73("Failed to store the app set ID.");
                        }
                        p83.E(context2);
                        if (!context2.getSharedPreferences("app_set_id_storage", 0).edit().putLong("app_set_id_creation_time", System.currentTimeMillis()).commit()) {
                            String strValueOf2 = String.valueOf(context2.getPackageName());
                            Log.e("AppSet", strValueOf2.length() != 0 ? "Failed to store app set ID creation time for App ".concat(strValueOf2) : new String("Failed to store app set ID creation time for App "));
                            throw new x73("Failed to store the app set ID creation time.");
                        }
                    } catch (x73 e3) {
                        ve3Var.d(e3);
                        return;
                    }
                }
                ve3Var.e(new b7(string2, 1));
                return;
            case 10:
                b();
                return;
            case 11:
                c();
                return;
            case 12:
                p73 p73Var = (p73) this.g;
                zk0 zk0Var = (zk0) this.h;
                int i8 = p73Var.I - zk0Var.b;
                p73Var.I = i8;
                if (zk0Var.c) {
                    p73Var.J = zk0Var.d;
                    p73Var.K = true;
                }
                if (i8 == 0) {
                    ox0 ox0Var = ((u83) zk0Var.e).a;
                    if (!p73Var.b0.a.g() && ox0Var.g()) {
                        p73Var.c0 = -1;
                        p73Var.d0 = 0L;
                    }
                    if (!ox0Var.g()) {
                        List listAsList = Arrays.asList(((y83) ox0Var).h);
                        int size = listAsList.size();
                        ArrayList arrayList = p73Var.v;
                        hn.M(size == arrayList.size());
                        for (int i9 = 0; i9 < listAsList.size(); i9++) {
                            ((o73) arrayList.get(i9)).b = (ox0) listAsList.get(i9);
                        }
                    }
                    if (p73Var.K) {
                        if (((u83) zk0Var.e).b.equals(p73Var.b0.b) && ((u83) zk0Var.e).d == p73Var.b0.r) {
                            i = 0;
                        }
                        if (i != 0) {
                            if (ox0Var.g() || ((u83) zk0Var.e).b.b()) {
                                j2 = ((u83) zk0Var.e).d;
                            } else {
                                u83 u83Var = (u83) zk0Var.e;
                                yd3 yd3Var = u83Var.b;
                                j2 = u83Var.d;
                                ox0Var.o(yd3Var.a, p73Var.u);
                            }
                        }
                        j = j2;
                        z = i;
                    } else {
                        j = -9223372036854775807L;
                        z = 0;
                    }
                    p73Var.K = false;
                    p73Var.Z1((u83) zk0Var.e, 1, z, p73Var.J, j, -1);
                    return;
                }
                return;
            case 13:
                ((nf0) ((s91) this.g).i).g.getWindow().setBackgroundDrawable((BitmapDrawable) this.h);
                return;
            case 14:
                d();
                return;
            case 15:
                e();
                return;
            case 16:
                ((ea3) this.g).i.reportNetworkEvent((NetworkEvent) this.h);
                return;
            case 17:
                ((ea3) this.g).i.reportPlaybackStateEvent((PlaybackStateEvent) this.h);
                return;
            case 18:
                ((ea3) this.g).i.reportTrackChangeEvent((TrackChangeEvent) this.h);
                return;
            case 19:
                ((ea3) this.g).i.reportPlaybackMetrics((PlaybackMetrics) this.h);
                return;
            case 20:
                ((ea3) this.g).i.reportPlaybackErrorEvent((PlaybackErrorEvent) this.h);
                return;
            case zw0.zzm /* 21 */:
                f();
                return;
            case 22:
                u40 u40Var = (u40) this.g;
                AudioDeviceInfo routedDevice = ((AudioRouting) this.h).getRoutedDevice();
                if (routedDevice != null) {
                    ((Handler) u40Var.i).post(new u52(u40Var, 23, routedDevice));
                    return;
                }
                return;
            case 23:
                u40 u40Var2 = (u40) this.g;
                AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) this.h;
                if (((ob3) u40Var2.j) == null) {
                    return;
                }
                ((qx1) u40Var2.h).a(audioDeviceInfo);
                return;
            case 24:
                ((pm1) this.g).mo0b((ge3) this.h);
                return;
            case 25:
                qe3 qe3Var = (qe3) this.g;
                ee0 ee0Var = (ee0) this.h;
                qe3Var.D = qe3Var.v == null ? ee0Var : new sd0(-9223372036854775807L, 0L);
                qe3Var.E = ee0Var.a();
                if (!qe3Var.L && ee0Var.a() == -9223372036854775807L) {
                    z2 = true;
                }
                qe3Var.F = z2;
                qe3Var.G = true == z2 ? 7 : 1;
                if (qe3Var.z) {
                    qe3Var.k.s(qe3Var.E, ee0Var, z2);
                    return;
                } else {
                    qe3Var.u();
                    return;
                }
            default:
                ve3 ve3Var2 = (ve3) this.g;
                try {
                    ve3Var2.e(((s22) this.h).call());
                    return;
                } catch (Exception e4) {
                    ve3Var2.d(e4);
                    return;
                } catch (Throwable th7) {
                    ve3Var2.d(new RuntimeException(th7));
                    return;
                }
        }
    }

    public /* synthetic */ u52(Object obj, Object obj2, int i, boolean z) {
        this.f = i;
        this.g = obj2;
        this.h = obj;
    }

    public /* synthetic */ u52(Object obj, int i, Object obj2) {
        this.f = i;
        this.g = obj;
        this.h = obj2;
    }
}
