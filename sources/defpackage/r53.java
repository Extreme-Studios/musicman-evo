package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Process;
import android.telephony.TelephonyManager;
import android.webkit.CookieManager;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class r53 implements ii2, hp1, rp1 {
    public static final /* synthetic */ r53 g;
    public static final /* synthetic */ r53 h;
    public static final /* synthetic */ r53 i;
    public final /* synthetic */ int f;

    static {
        byte b = 0;
        g = new r53(0, b);
        h = new r53(1, b);
        i = new r53(26, b);
    }

    public r53(Context context) {
        this.f = 28;
        new un1(context, 21);
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        map.clear();
        map2.clear();
    }

    @Override // defpackage.ii2
    public /* synthetic */ Object a() {
        return new k23();
    }

    @Override // defpackage.hp1
    /* JADX INFO: renamed from: b */
    public /* synthetic */ void mo6b(Object obj) {
        switch (this.f) {
            case 1:
                break;
            case 2:
                ((ds0) obj).e();
                break;
            case 3:
                int i2 = p73.f0;
                ((ds0) obj).n();
                break;
            case 4:
                int i3 = p73.f0;
                ((ds0) obj).D();
                break;
            case 5:
            default:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            case 20:
                break;
            case zw0.zzm /* 21 */:
                break;
            case 22:
                break;
            case 23:
                break;
            case 24:
                break;
        }
    }

    public CookieManager c() {
        vc3 vc3Var = vc3.C;
        zb3 zb3Var = vc3Var.c;
        int iMyUid = Process.myUid();
        if (iMyUid != 0 && iMyUid != 1000) {
            try {
                return CookieManager.getInstance();
            } catch (Throwable th) {
                jn.P("Failed to obtain CookieManager.", th);
                vc3Var.h.e("ApiLevelUtil.getCookieManager", th);
            }
        }
        return null;
    }

    @Override // defpackage.rp1
    public /* synthetic */ void d(Object obj, cc3 cc3Var) {
        ((ds0) obj).a();
    }

    public he1 e(yd1 yd1Var, cv0 cv0Var, boolean z, hw1 hw1Var) {
        return new he1(yd1Var, cv0Var, z, hw1Var);
    }

    public int f(Context context, TelephonyManager telephonyManager) {
        return 3;
    }

    public boolean h(Context context) {
        return false;
    }

    public Intent i(Activity activity) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("app_package", activity.getPackageName());
        intent.putExtra("app_uid", activity.getApplicationInfo().uid);
        return intent;
    }

    public int k(AudioManager audioManager) {
        return 0;
    }

    public int l(Context context) {
        return ((TelephonyManager) context.getSystemService("phone")).getNetworkType();
    }

    public /* synthetic */ r53(int i2) {
        this.f = 3;
    }

    public /* synthetic */ r53(int i2, byte b) {
        this.f = i2;
    }

    public /* synthetic */ r53(p73 p73Var, int i2) {
        this.f = i2;
    }

    public /* synthetic */ r53(float f) {
        this.f = 4;
    }

    public void g(Context context) {
    }

    public void j(Activity activity) {
    }
}
