package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.DeadObjectException;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import androidx.profileinstaller.ProfileInstallReceiver;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public final class zx implements z7, c2, aw, a80, y7, bd0, ul0, hn2, x7, eb1, dr, gm1, fv1, li1, yd2, uz1 {
    public static zx h;
    public static final ay i = new ay(0, 0, 0, false, false);
    public static final Object j = new Object();
    public static volatile zx k;
    public final /* synthetic */ int f;
    public Object g;

    public zx() {
        this.f = 1;
        this.g = new ConcurrentHashMap();
    }

    public static synchronized zx o() {
        try {
            if (h == null) {
                h = new zx(0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return h;
    }

    public static zx q() {
        if (k == null) {
            synchronized (j) {
                try {
                    if (k == null) {
                        k = new zx();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        zx zxVar = k;
        dq.f(zxVar);
        return zxVar;
    }

    @Override // defpackage.dr
    public void A(g2 g2Var) {
        try {
            ((g51) this.g).a(g2Var.d());
        } catch (RemoteException e) {
            jn.P("", e);
        }
    }

    @Override // defpackage.x7
    public void T(int i2) {
        es0 es0Var = (es0) this.g;
        synchronized (es0Var.h) {
            es0Var.k = null;
            es0Var.h.notifyAll();
        }
    }

    @Override // defpackage.y7
    public void U(db dbVar) {
        ((cm) this.g).U(dbVar);
    }

    @Override // defpackage.x7
    public void Y() {
        es0 es0Var = (es0) this.g;
        synchronized (es0Var.h) {
            try {
                vu0 vu0Var = (vu0) es0Var.i;
                if (vu0Var != null) {
                    es0Var.k = (xu0) vu0Var.t();
                }
            } catch (DeadObjectException e) {
                jn.P("Unable to obtain a cache service instance.", e);
                ((es0) this.g).w();
            }
            ((es0) this.g).h.notifyAll();
        }
    }

    @Override // defpackage.ul0
    public long a() {
        return ((ByteBuffer) this.g).capacity();
    }

    @Override // defpackage.eb1
    /* JADX INFO: renamed from: b */
    public void mo11b(Object obj) {
        switch (this.f) {
            case 15:
                uj1 uj1Var = (uj1) this.g;
                uj1Var.getClass();
                if (((k31) obj).f.l0()) {
                    uj1Var.g = 1;
                }
                break;
            case 20:
                ((fk1) obj).P((on1) this.g);
                break;
            case zw0.zzm /* 21 */:
                ((jl1) obj).h((qc3) this.g);
                break;
            default:
                ((dm1) obj).y0((gw0) this.g);
                break;
        }
    }

    @Override // defpackage.yd2
    public synchronized void c() {
        yd2 yd2Var = (yd2) this.g;
        if (yd2Var != null) {
            yd2Var.c();
        }
    }

    @Override // defpackage.a80
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) i8.f(WebViewProviderBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.g).createWebView(webView));
    }

    @Override // defpackage.fv1
    public hp d(r71 r71Var) {
        zu1 zu1Var = (zu1) this.g;
        synchronized (zu1Var.g) {
            try {
                int i2 = zu1Var.m;
                int i3 = 1;
                if (i2 != 1 && i2 != 2) {
                    return na1.C(new dv1(2));
                }
                if (zu1Var.h) {
                    return zu1Var.f;
                }
                zu1Var.m = 2;
                zu1Var.h = true;
                zu1Var.j = r71Var;
                zu1Var.k.m();
                cb1 cb1Var = zu1Var.f;
                cb1Var.f.a(new xu1(zu1Var, i3), za1.g);
                return cb1Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.hn2
    /* JADX INFO: renamed from: e */
    public void mo5e(Object obj) {
        switch (this.f) {
            case 13:
                fn1 fn1Var = (fn1) this.g;
                j01 j01Var = (j01) obj;
                synchronized (fn1Var) {
                    fn1Var.L1(new s70(26, j01Var));
                }
                return;
            case 17:
                d91.l.remove((hp) this.g);
                return;
            case 19:
                ((vi1) this.g).f.o0(true);
                return;
            case 23:
                ((md1) obj).a("sendMessageToNativeJs", (Map) this.g);
                return;
            case 24:
                ((it1) obj).r = true;
                ((xt1) this.g).i.b();
                return;
            default:
                try {
                    ((n62) this.g).b((SQLiteDatabase) obj);
                    return;
                } catch (Exception e) {
                    jn.M("Error executing function on offline signal database: ".concat(String.valueOf(e.getMessage())));
                    return;
                }
        }
    }

    @Override // defpackage.bd0
    public long f(long j2) {
        td0 td0Var = (td0) this.g;
        td0Var.getClass();
        String str = qz1.a;
        return Math.max(0L, Math.min((j2 * ((long) td0Var.e)) / 1000000, td0Var.j - 1));
    }

    @Override // defpackage.a80
    public String[] g() {
        return ((WebViewProviderFactoryBoundaryInterface) this.g).getSupportedFeatures();
    }

    @Override // defpackage.a80
    public ProfileStoreBoundaryInterface getProfileStore() {
        return (ProfileStoreBoundaryInterface) i8.f(ProfileStoreBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.g).getProfileStore());
    }

    @Override // defpackage.a80
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) i8.f(StaticsBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.g).getStatics());
    }

    @Override // defpackage.yd2
    public synchronized void h() {
        yd2 yd2Var = (yd2) this.g;
        if (yd2Var != null) {
            yd2Var.h();
        }
    }

    @Override // defpackage.ul0
    public void i(MessageDigest[] messageDigestArr, long j2, int i2) {
        ByteBuffer byteBufferSlice;
        ByteBuffer byteBuffer = (ByteBuffer) this.g;
        synchronized (byteBuffer) {
            int i3 = (int) j2;
            byteBuffer.position(i3);
            byteBuffer.limit(i3 + i2);
            byteBufferSlice = byteBuffer.slice();
        }
        for (MessageDigest messageDigest : messageDigestArr) {
            byteBufferSlice.position(0);
            messageDigest.update(byteBufferSlice);
        }
    }

    @Override // defpackage.z7
    public void j(db dbVar) {
        boolean z = dbVar.g == 0;
        a8 a8Var = (a8) this.g;
        if (z) {
            a8Var.l(null, a8Var.s());
            return;
        }
        y7 y7Var = a8Var.p;
        if (y7Var != null) {
            y7Var.U(dbVar);
        }
    }

    @Override // defpackage.yd2
    public synchronized void k(View view) {
        yd2 yd2Var = (yd2) this.g;
        if (yd2Var != null) {
            yd2Var.k(view);
        }
    }

    @Override // defpackage.aw
    public void l() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // defpackage.uz1
    public void m(mi1 mi1Var) {
        p83 p83Var = (p83) this.g;
        synchronized (p83Var) {
            p83Var.i = mi1Var.f;
            mi1Var.a();
        }
    }

    @Override // defpackage.aw
    public void n(int i2, Object obj) {
        String str;
        switch (i2) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i2 == 6 || i2 == 7 || i2 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.g).setResultCode(i2);
    }

    @Override // defpackage.c2
    public void p(Object obj) {
        Map map = (Map) obj;
        xj xjVar = (xj) this.g;
        ArrayList arrayList = new ArrayList(map.values());
        int[] iArr = new int[arrayList.size()];
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            iArr[i2] = ((Boolean) arrayList.get(i2)).booleanValue() ? 0 : -1;
        }
        uj ujVar = (uj) xjVar.C.pollFirst();
        if (ujVar == null) {
            Log.w("FragmentManager", "No permissions were requested for " + this);
        } else {
            String str = ujVar.f;
            if (xjVar.c.g(str) == null) {
                Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
            }
        }
    }

    public void r(Context context, ServiceConnection serviceConnection) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.g;
        if ((serviceConnection instanceof ha3) || !concurrentHashMap.containsKey(serviceConnection)) {
            try {
                context.unbindService(serviceConnection);
            } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
            }
        } else {
            try {
                try {
                    context.unbindService((ServiceConnection) concurrentHashMap.get(serviceConnection));
                } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused2) {
                }
            } finally {
                concurrentHashMap.remove(serviceConnection);
            }
        }
    }

    public boolean u(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i2, Executor executor) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.g;
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((q90.a(context).c(packageName, 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (serviceConnection instanceof ha3) {
            if (executor == null) {
                executor = null;
            }
            return (Build.VERSION.SDK_INT < 29 || executor == null) ? context.bindService(intent, serviceConnection, i2) : context.bindService(intent, i2, executor, serviceConnection);
        }
        ServiceConnection serviceConnection2 = (ServiceConnection) concurrentHashMap.putIfAbsent(serviceConnection, serviceConnection);
        if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
            Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
        }
        if (executor == null) {
            executor = null;
        }
        try {
            boolean zBindService = (Build.VERSION.SDK_INT < 29 || executor == null) ? context.bindService(intent, serviceConnection, i2) : context.bindService(intent, i2, executor, serviceConnection);
            if (zBindService) {
                return zBindService;
            }
            concurrentHashMap.remove(serviceConnection, serviceConnection);
            return false;
        } catch (Throwable th) {
            concurrentHashMap.remove(serviceConnection, serviceConnection);
            throw th;
        }
    }

    @Override // defpackage.hn2
    public void w(Throwable th) {
        switch (this.f) {
            case 13:
                fn1 fn1Var = (fn1) this.g;
                String message = th.getMessage();
                synchronized (fn1Var) {
                    fn1Var.L1(new xo2(message, 4));
                }
                return;
            case 17:
                d91.l.remove((hp) this.g);
                return;
            case 19:
                ((vi1) this.g).f.o0(false);
                return;
            case 23:
            case 24:
                return;
            default:
                jn.M("Failed to get offline signal database: ".concat(String.valueOf(th.getMessage())));
                return;
        }
    }

    @Override // defpackage.li1
    /* JADX INFO: renamed from: a */
    public /* synthetic */ hv1 mo1a() {
        return ((md1) this.g).f();
    }

    @Override // defpackage.uz1
    /* JADX INFO: renamed from: a */
    public void mo10a() {
        synchronized (((p83) this.g)) {
        }
    }

    public /* synthetic */ zx(int i2, Object obj) {
        this.f = i2;
        this.g = obj;
    }

    public /* synthetic */ zx(Object obj, int i2, Object obj2) {
        this.f = i2;
        this.g = obj2;
    }

    public /* synthetic */ zx(int i2) {
        this.f = i2;
    }

    public zx(ByteBuffer byteBuffer) {
        this.f = 12;
        this.g = byteBuffer.slice();
    }

    public zx(d91 d91Var, hp hpVar) {
        this.f = 17;
        this.g = hpVar;
        Objects.requireNonNull(d91Var);
    }

    public zx(uq1 uq1Var, Map map) {
        this.f = 23;
        this.g = map;
        Objects.requireNonNull(uq1Var);
    }

    public zx(p83 p83Var) {
        this.f = 29;
        Objects.requireNonNull(p83Var);
        this.g = p83Var;
    }

    private final void s(Throwable th) {
    }

    private final void t(Throwable th) {
    }
}
