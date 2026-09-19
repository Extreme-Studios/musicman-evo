package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class gz1 extends jt0 implements u51 {
    public static final /* synthetic */ int j = 0;
    public final cb1 f;
    public final JSONObject g;
    public final long h;
    public boolean i;

    public gz1(String str, s51 s51Var, cb1 cb1Var, long j2) {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
        JSONObject jSONObject = new JSONObject();
        this.g = jSONObject;
        this.i = false;
        this.f = cb1Var;
        this.h = j2;
        try {
            jSONObject.put("adapter_version", s51Var.d().toString());
            jSONObject.put("sdk_version", s51Var.e().toString());
            jSONObject.put("name", str);
        } catch (RemoteException | NullPointerException | JSONException unused) {
        }
    }

    @Override // defpackage.jt0
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            String string = parcel.readString();
            kt0.f(parcel);
            synchronized (this) {
                if (!this.i) {
                    if (string == null) {
                        synchronized (this) {
                            B3("Adapter returned null signals", 2);
                        }
                    } else {
                        try {
                            JSONObject jSONObject = this.g;
                            jSONObject.put("signals", string);
                            ix0 ix0Var = lx0.J1;
                            tu0 tu0Var = tu0.e;
                            if (((Boolean) tu0Var.c.a(ix0Var)).booleanValue()) {
                                vc3.C.k.getClass();
                                jSONObject.put("latency", SystemClock.elapsedRealtime() - this.h);
                            }
                            if (((Boolean) tu0Var.c.a(lx0.I1)).booleanValue()) {
                                jSONObject.put("signal_error_code", 0);
                            }
                        } catch (JSONException unused) {
                        }
                        this.f.b(this.g);
                        this.i = true;
                    }
                }
            }
        } else if (i == 2) {
            String string2 = parcel.readString();
            kt0.f(parcel);
            synchronized (this) {
                B3(string2, 2);
            }
        } else {
            if (i != 3) {
                return false;
            }
            fu1 fu1Var = (fu1) kt0.b(parcel, fu1.CREATOR);
            kt0.f(parcel);
            synchronized (this) {
                B3(fu1Var.g, 2);
            }
        }
        parcel2.writeNoException();
        return true;
    }

    public final synchronized void B3(String str, int i) {
        try {
            if (this.i) {
                return;
            }
            try {
                JSONObject jSONObject = this.g;
                jSONObject.put("signal_error", str);
                ix0 ix0Var = lx0.J1;
                tu0 tu0Var = tu0.e;
                if (((Boolean) tu0Var.c.a(ix0Var)).booleanValue()) {
                    vc3.C.k.getClass();
                    jSONObject.put("latency", SystemClock.elapsedRealtime() - this.h);
                }
                if (((Boolean) tu0Var.c.a(lx0.I1)).booleanValue()) {
                    jSONObject.put("signal_error_code", i);
                }
            } catch (JSONException unused) {
            }
            this.f.b(this.g);
            this.i = true;
        } catch (Throwable th) {
            throw th;
        }
    }
}
