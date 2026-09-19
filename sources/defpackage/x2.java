package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class x2 {
    public f8 a;
    public d32 b;
    public boolean c;
    public final Object d = new Object();
    public us0 e;
    public final Context f;
    public final long g;

    public x2(Context context, long j, boolean z) {
        Context applicationContext;
        dq.f(context);
        if (z && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f = context;
        this.c = false;
        this.g = j;
    }

    public static w2 a(Context context) {
        x2 x2Var = new x2(context, -1L, true);
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            x2Var.d(false);
            w2 w2VarF = x2Var.f();
            e(w2VarF, SystemClock.elapsedRealtime() - jElapsedRealtime, null);
            x2Var.c();
            return w2VarF;
        } catch (Throwable th) {
            try {
                e(null, -1L, th);
                throw th;
            } catch (Throwable th2) {
                x2Var.c();
                throw th2;
            }
        }
    }

    public static boolean b(Context context) {
        boolean z;
        x2 x2Var = new x2(context, -1L, false);
        try {
            x2Var.d(false);
            dq.e("Calling this from your main thread can lead to deadlock");
            synchronized (x2Var) {
                try {
                    if (!x2Var.c) {
                        synchronized (x2Var.d) {
                            us0 us0Var = x2Var.e;
                            if (us0Var == null || !us0Var.i) {
                                throw new IOException("AdvertisingIdClient is not connected.");
                            }
                        }
                        try {
                            x2Var.d(false);
                            if (!x2Var.c) {
                                throw new IOException("AdvertisingIdClient cannot reconnect.");
                            }
                        } catch (Exception e) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.", e);
                        }
                    }
                    dq.f(x2Var.a);
                    dq.f(x2Var.b);
                    try {
                        rk1 rk1Var = (rk1) x2Var.b;
                        rk1Var.getClass();
                        Parcel parcelObtain = Parcel.obtain();
                        parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                        Parcel parcelT = rk1Var.T(parcelObtain, 6);
                        int i = m91.a;
                        z = parcelT.readInt() != 0;
                        parcelT.recycle();
                    } catch (RemoteException e2) {
                        Log.i("AdvertisingIdClient", "GMS remote exception ", e2);
                        throw new IOException("Remote exception");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            x2Var.g();
            x2Var.c();
            return z;
        } catch (Throwable th2) {
            x2Var.c();
            throw th2;
        }
    }

    public static void e(w2 w2Var, long j, Throwable th) {
        if (Math.random() <= 0.0d) {
            HashMap map = new HashMap();
            map.put("app_context", "1");
            if (w2Var != null) {
                map.put("limit_ad_tracking", true != w2Var.b ? "0" : "1");
                String str = w2Var.a;
                if (str != null) {
                    map.put("ad_id_size", Integer.toString(str.length()));
                }
            }
            if (th != null) {
                map.put("error", th.getClass().getName());
            }
            map.put("tag", "AdvertisingIdClient");
            map.put("time_spent", Long.toString(j));
            new hb0(map).start();
        }
    }

    public final void c() {
        dq.e("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f == null || this.a == null) {
                    return;
                }
                try {
                    if (this.c) {
                        zx.q().r(this.f, this.a);
                    }
                } catch (Throwable th) {
                    Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
                }
                this.c = false;
                this.b = null;
                this.a = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d(boolean z) {
        dq.e("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.c) {
                    c();
                }
                Context context = this.f;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int iC = am.b.c(context, 12451000);
                    if (iC != 0 && iC != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    f8 f8Var = new f8();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!zx.q().u(context, context.getClass().getName(), intent, f8Var, 1, null)) {
                            throw new IOException("Connection failure");
                        }
                        this.a = f8Var;
                        try {
                            IBinder iBinderA = f8Var.a();
                            int i = du1.f;
                            IInterface iInterfaceQueryLocalInterface = iBinderA.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                            this.b = iInterfaceQueryLocalInterface instanceof d32 ? (d32) iInterfaceQueryLocalInterface : new rk1(iBinderA);
                            this.c = true;
                            if (z) {
                                g();
                            }
                        } catch (InterruptedException unused) {
                            throw new IOException("Interrupted exception");
                        } catch (Throwable th) {
                            throw new IOException(th);
                        }
                    } catch (Throwable th2) {
                        throw new IOException(th2);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new em();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final w2 f() {
        w2 w2Var;
        dq.e("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.c) {
                    synchronized (this.d) {
                        us0 us0Var = this.e;
                        if (us0Var == null || !us0Var.i) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        d(false);
                        if (!this.c) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e);
                    }
                }
                dq.f(this.a);
                dq.f(this.b);
                try {
                    rk1 rk1Var = (rk1) this.b;
                    rk1Var.getClass();
                    Parcel parcelObtain = Parcel.obtain();
                    parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    Parcel parcelT = rk1Var.T(parcelObtain, 1);
                    String string = parcelT.readString();
                    parcelT.recycle();
                    rk1 rk1Var2 = (rk1) this.b;
                    rk1Var2.getClass();
                    Parcel parcelObtain2 = Parcel.obtain();
                    parcelObtain2.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    int i = m91.a;
                    parcelObtain2.writeInt(1);
                    Parcel parcelT2 = rk1Var2.T(parcelObtain2, 2);
                    boolean z = parcelT2.readInt() != 0;
                    parcelT2.recycle();
                    w2Var = new w2(string, z);
                } catch (RemoteException e2) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e2);
                    throw new IOException("Remote exception");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        g();
        return w2Var;
    }

    public final void finalize() throws Throwable {
        c();
        super.finalize();
    }

    public final void g() {
        synchronized (this.d) {
            us0 us0Var = this.e;
            if (us0Var != null) {
                us0Var.h.countDown();
                try {
                    this.e.join();
                } catch (InterruptedException unused) {
                }
            }
            long j = this.g;
            if (j > 0) {
                this.e = new us0(this, j);
            }
        }
    }
}
