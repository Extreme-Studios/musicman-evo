package defpackage;

import android.content.Intent;
import android.net.Uri;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class tt0 implements r63 {
    public final /* synthetic */ int a;

    public tt0(im1 im1Var) {
        this.a = 20;
    }

    @Override // defpackage.v63
    public final Object c() {
        switch (this.a) {
            case 0:
                return new st0();
            case 1:
                me1 me1Var = new me1();
                me1Var.a = null;
                return me1Var;
            case 2:
                return vc3.C.h;
            case 3:
                ya1 ya1Var = za1.a;
                dq.D(ya1Var);
                return new s62(ya1Var);
            case 4:
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setPackage("com.android.vending");
                intent.setData(Uri.parse("https://play.google.com/d"));
                return intent;
            case 5:
                String str = ut0.f.c;
                dq.D(str);
                return str;
            case 6:
                return new ArrayDeque();
            case 7:
                return new zf0(7);
            case 8:
                return new zf0(14);
            case 9:
                return new ue0(16);
            case 10:
                return vc3.C.y;
            case 11:
                return new mg1();
            case 12:
                return dv0.APP_OPEN;
            case 13:
                return "app_open_ad";
            case 14:
                return dv0.BANNER;
            case 15:
                return "banner";
            case 16:
                return new cj1();
            case 17:
                return new tl1();
            case 18:
                am1 am1Var = new am1();
                ix0 ix0Var = lx0.p1;
                tu0 tu0Var = tu0.e;
                am1Var.f = ((Integer) tu0Var.c.a(ix0Var)).intValue();
                am1Var.g = ((Integer) tu0Var.c.a(lx0.Hd)).intValue();
                return am1Var;
            case 19:
                Set set = Collections.EMPTY_SET;
                dq.D(set);
                return set;
            case 20:
                Set set2 = Collections.EMPTY_SET;
                dq.D(set2);
                return set2;
            case zw0.zzm /* 21 */:
                Set set3 = Collections.EMPTY_SET;
                dq.D(set3);
                return set3;
            case 22:
                Set set4 = Collections.EMPTY_SET;
                dq.D(set4);
                return set4;
            case 23:
                Set set5 = Collections.EMPTY_SET;
                dq.D(set5);
                return set5;
            case 24:
                Set set6 = Collections.EMPTY_SET;
                dq.D(set6);
                return set6;
            case 25:
                Set set7 = Collections.EMPTY_SET;
                dq.D(set7);
                return set7;
            case 26:
                Set set8 = Collections.EMPTY_SET;
                dq.D(set8);
                return set8;
            case 27:
                return new rm1();
            case 28:
                return dv0.INTERSTITIAL;
            default:
                return "interstitial";
        }
    }

    public /* synthetic */ tt0(int i) {
        this.a = i;
    }
}
