package defpackage;

import android.net.Uri;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r11 implements wh2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ r11(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // defpackage.wh2
    public final Object apply(Object obj) {
        int i = this.a;
        String strReplace = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                m11 m11Var = u11.a;
                if (str == null) {
                    return strReplace;
                }
                if (((Boolean) qy0.f.u()).booleanValue()) {
                    String[] strArr = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
                    String host = Uri.parse(strReplace).getHost();
                    for (int i2 = 0; i2 < 3; i2++) {
                        if (!host.endsWith(strArr[i2])) {
                        }
                    }
                    return strReplace;
                }
                String str2 = (String) qy0.a.u();
                String str3 = (String) qy0.b.u();
                if (!TextUtils.isEmpty(str2)) {
                    strReplace = strReplace.replace(str2, str);
                }
                if (TextUtils.isEmpty(str3)) {
                    return strReplace;
                }
                Uri uri = Uri.parse(strReplace);
                return TextUtils.isEmpty(uri.getQueryParameter(str3)) ? uri.buildUpon().appendQueryParameter(str3, str).toString() : strReplace;
            case 1:
                Throwable th = (Throwable) obj;
                m11 m11Var2 = u11.a;
                if (((Boolean) qy0.i.u()).booleanValue()) {
                    vc3.C.h.d("prepareClickUrl.attestation2", th);
                }
                return strReplace;
            case 2:
                return new dq1(strReplace, (oz0) obj);
            default:
                Throwable th2 = (Throwable) obj;
                j12 j12Var = e22.k;
                jn.M("Error calling adapter: ".concat(String.valueOf(strReplace)));
                if (((Boolean) tu0.e.c.a(lx0.Qd)).booleanValue()) {
                    vc3.C.h.e("rtbSignal.fetchRtbJsonInfo-".concat(String.valueOf(strReplace)), th2);
                    return null;
                }
                vc3.C.h.d("rtbSignal.fetchRtbJsonInfo-".concat(String.valueOf(strReplace)), th2);
                return null;
        }
    }
}
