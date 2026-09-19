package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class k02 implements m22 {
    public final /* synthetic */ int a;
    public final ya1 b;
    public final Context c;

    public /* synthetic */ k02(Context context, ya1 ya1Var, int i) {
        this.a = i;
        this.c = context;
        this.b = ya1Var;
    }

    @Override // defpackage.m22
    public final hp a() {
        int i = this.a;
        int i2 = 0;
        ya1 ya1Var = this.b;
        switch (i) {
            case 0:
                if (!((Boolean) tu0.e.c.a(lx0.Id)).booleanValue()) {
                    return na1.t(new l02(null, false, 0));
                }
                ContentResolver contentResolver = this.c.getContentResolver();
                return contentResolver == null ? na1.t(new l02(null, false, 0)) : ya1Var.b(new br0(11, contentResolver));
            case 1:
                return ya1Var.b(new br0(14, this));
            case 2:
                return ya1Var.b(new br0(15, this));
            case 3:
                return ya1Var.b(new br0(17, this));
            case 4:
                return ya1Var.b(new br0(18, this));
            case 5:
                return ya1Var.b(new br0(27, this));
            case 6:
                return ((Boolean) ly0.b.u()).booleanValue() ? ya1Var.b(new br0(28, this)) : na1.t(new p22(-1, -1));
            default:
                return ya1Var.b(new s22(i2, this));
        }
    }

    public Intent b() {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        boolean zBooleanValue = ((Boolean) tu0.e.c.a(lx0.Nb)).booleanValue();
        Context context = this.c;
        return (!zBooleanValue || Build.VERSION.SDK_INT < 33) ? context.registerReceiver(null, intentFilter) : context.registerReceiver(null, intentFilter, 4);
    }

    @Override // defpackage.m22
    public final int c() {
        switch (this.a) {
            case 0:
                return 61;
            case 1:
                return 13;
            case 2:
                return 14;
            case 3:
                return 18;
            case 4:
                return 57;
            case 5:
                return 37;
            case 6:
                return 59;
            default:
                return 39;
        }
    }

    public /* synthetic */ k02(ya1 ya1Var, Context context, int i) {
        this.a = i;
        this.b = ya1Var;
        this.c = context;
    }
}
