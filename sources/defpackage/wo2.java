package defpackage;

import android.net.Uri;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class wo2 implements r20 {
    public static final wo2 h;
    public static final wo2 i;
    public static final wo2 j;
    public static final wo2 k;
    public static final wo2 l;
    public static final wo2 m;
    public static final wo2 n;
    public static final wo2 o;
    public static final wo2 p;
    public static final wo2 q;
    public final /* synthetic */ int f;
    public final String g;

    static {
        int i2 = 0;
        h = new wo2("SHA1", i2);
        i = new wo2("SHA224", i2);
        j = new wo2("SHA256", i2);
        k = new wo2("SHA384", i2);
        l = new wo2("SHA512", i2);
        int i3 = 1;
        m = new wo2("TINK", i3);
        n = new wo2("NO_PREFIX", i3);
        int i4 = 2;
        o = new wo2("SHA256", i4);
        p = new wo2("SHA384", i4);
        q = new wo2("SHA512", i4);
    }

    public wo2(String str) {
        this.f = 6;
        int iMyUid = Process.myUid();
        int iMyPid = Process.myPid();
        StringBuilder sb = new StringBuilder(String.valueOf(iMyUid).length() + 15 + String.valueOf(iMyPid).length() + 2);
        ec.v(sb, "UID: [", iMyUid, "]  PID: [", iMyPid);
        sb.append("] ");
        this.g = sb.toString().concat(str);
    }

    public static String h(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e) {
                Log.e("PlayCore", "Unable to format ".concat(str2), e);
                String strJoin = TextUtils.join(", ", objArr);
                int length = str2.length();
                str2 = ec.o(new StringBuilder(String.valueOf(strJoin).length() + length + 2 + 1), str2, " [", strJoin, "]");
            }
        }
        return ec.n(new StringBuilder(str.length() + 3 + str2.length()), str, " : ", str2);
    }

    @Override // defpackage.r20
    public String a() {
        return this.g;
    }

    public String c(Map map) {
        Uri.Builder builderBuildUpon = Uri.parse(this.g).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        return builderBuildUpon.build().toString();
    }

    public void d(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            Log.i("PlayCore", h(this.g, str, objArr));
        }
    }

    public void e(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            Log.w("PlayCore", h(this.g, str, objArr));
        }
    }

    public void f(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", h(this.g, str, objArr));
        }
    }

    public void g(RemoteException remoteException, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", h(this.g, str, objArr), remoteException);
        }
    }

    public String toString() {
        int i2 = this.f;
        String str = this.g;
        switch (i2) {
            case 0:
            case 1:
            case 2:
                return str;
            default:
                return super.toString();
        }
    }

    @Override // defpackage.r20
    public void b(lk lkVar) {
    }

    public wo2() {
        this.f = 3;
        this.g = (String) dq.q.u();
    }

    public /* synthetic */ wo2(String str, int i2) {
        this.f = i2;
        this.g = str;
    }
}
