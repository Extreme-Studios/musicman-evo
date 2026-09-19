package defpackage;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class yq0 {
    public final Object a = new Object();
    public String b = "";
    public String c = "";
    public boolean d = false;
    public boolean e = false;
    public String f = "";
    public qt1 g;

    public static final String j(Context context, String str, String str2) {
        HashMap map = new HashMap();
        map.put("User-Agent", vc3.C.c.E(context, str2));
        sz0 sz0VarA = new n11(context).a(0, str, map, null);
        try {
            return (String) sz0VarA.f.get(((Integer) tu0.e.c.a(lx0.s5)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            jn.P("Interrupted while retrieving a response from: ".concat(String.valueOf(str)), e);
            sz0VarA.cancel(true);
            return null;
        } catch (TimeoutException e2) {
            jn.P("Timeout while retrieving a response from: ".concat(String.valueOf(str)), e2);
            sz0VarA.cancel(true);
            return null;
        } catch (Exception e3) {
            jn.P("Error retrieving a response from: ".concat(String.valueOf(str)), e3);
            return null;
        }
    }

    public final void a(Context context) {
        qt1 qt1Var;
        if (!((Boolean) tu0.e.c.a(lx0.X9)).booleanValue() || (qt1Var = this.g) == null) {
            return;
        }
        qt1Var.e(new dp0(this, context), pt1.i);
    }

    public final boolean b(Context context, String str, String str2) {
        ix0 ix0Var = lx0.q5;
        tu0 tu0Var = tu0.e;
        String strJ = j(context, k(context, (String) tu0Var.c.a(ix0Var), str, str2).toString(), str2);
        if (TextUtils.isEmpty(strJ)) {
            jn.F("Not linked for debug signals.");
            return false;
        }
        try {
            boolean zEquals = "1".equals(new JSONObject(strJ.trim()).optString("debug_mode"));
            f(zEquals);
            if (((Boolean) tu0Var.c.a(lx0.X9)).booleanValue()) {
                h73 h73VarG = vc3.C.h.g();
                if (true != zEquals) {
                    str = "";
                }
                h73VarG.f(str);
            }
            return zEquals;
        } catch (JSONException e) {
            jn.V("Fail to get debug mode response json.", e);
            return false;
        }
    }

    public final void c(Context context, String str, String str2) {
        zb3 zb3Var = vc3.C.c;
        zb3.u(context, k(context, (String) tu0.e.c.a(lx0.o5), str, str2));
    }

    public final boolean d(Context context, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || !h()) {
            return false;
        }
        jn.F("Sending troubleshooting signals to the server.");
        e(context, str, str2, str3);
        return true;
    }

    public final void e(Context context, String str, String str2, String str3) {
        Uri.Builder builderBuildUpon = k(context, (String) tu0.e.c.a(lx0.r5), str3, str).buildUpon();
        builderBuildUpon.appendQueryParameter("debugData", str2);
        zb3 zb3Var = vc3.C.c;
        new l51(context, str, builderBuildUpon.build().toString(), null).o1();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0036  */
    /* JADX WARN: Code duplicated, block: B:16:0x0037 A[Catch: all -> 0x0045, TryCatch #0 {all -> 0x0045, blocks: (B:4:0x0003, B:6:0x0017, B:8:0x0026, B:11:0x002c, B:13:0x0032, B:16:0x0037, B:17:0x003b, B:19:0x0041, B:22:0x0047), top: B:26:0x0003 }] */
    public final void f(boolean z) {
        synchronized (this.a) {
            try {
                this.e = z;
                if (((Boolean) tu0.e.c.a(lx0.X9)).booleanValue()) {
                    vc3.C.h.g().e(z);
                    qt1 qt1Var = this.g;
                    if (qt1Var != null) {
                        if (qt1Var.u) {
                            if (z) {
                                if (qt1Var.s) {
                                    qt1Var.k();
                                }
                            }
                        } else if (z) {
                            qt1Var.j();
                            if (qt1Var.s) {
                                qt1Var.k();
                            }
                        }
                        if (!qt1Var.f()) {
                            qt1Var.l();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean g() {
        boolean z;
        synchronized (this.a) {
            z = this.e;
        }
        return z;
    }

    public final boolean h() {
        boolean z;
        synchronized (this.a) {
            z = this.d;
        }
        return z;
    }

    public final void i(Context context, String str, boolean z, boolean z2) {
        if (context instanceof Activity) {
            zb3.l.post(new jq0(this, context, str, z, z2));
        } else {
            jn.R("Can not create dialog without Activity Context");
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x006b A[Catch: all -> 0x0032, TryCatch #0 {, blocks: (B:4:0x000b, B:6:0x0013, B:7:0x0019, B:12:0x003b, B:14:0x0043, B:16:0x0054, B:19:0x0066, B:11:0x0034, B:20:0x006b, B:21:0x006d), top: B:26:0x000b, inners: #1, #2 }] */
    public final Uri k(Context context, String str, String str2, String str3) {
        String str4;
        String str5;
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        synchronized (this.a) {
            if (TextUtils.isEmpty(this.b)) {
                zb3 zb3Var = vc3.C.c;
                try {
                    FileInputStream fileInputStreamOpenFileInput = context.openFileInput("debug_signals_id.txt");
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ar.c(fileInputStreamOpenFileInput, byteArrayOutputStream, true);
                    str5 = new String(byteArrayOutputStream.toByteArray(), "UTF-8");
                } catch (IOException unused) {
                    jn.F("Error reading from internal storage.");
                    str5 = "";
                }
                this.b = str5;
                if (TextUtils.isEmpty(str5)) {
                    zb3 zb3Var2 = vc3.C.c;
                    String string = UUID.randomUUID().toString();
                    this.b = string;
                    try {
                        FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput("debug_signals_id.txt", 0);
                        fileOutputStreamOpenFileOutput.write(string.getBytes("UTF-8"));
                        fileOutputStreamOpenFileOutput.close();
                    } catch (Exception e) {
                        jn.P("Error writing to file in internal storage.", e);
                    }
                    str4 = this.b;
                } else {
                    str4 = this.b;
                }
            } else {
                str4 = this.b;
            }
            throw th;
        }
        builderBuildUpon.appendQueryParameter("linkedDeviceId", str4);
        builderBuildUpon.appendQueryParameter("adSlotPath", str2);
        builderBuildUpon.appendQueryParameter("afmaVersion", str3);
        return builderBuildUpon.build();
    }
}
