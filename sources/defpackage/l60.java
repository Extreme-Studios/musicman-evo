package defpackage;

import android.text.TextUtils;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class l60 extends b30 {
    public final /* synthetic */ int e;

    public l60(int i, Class cls, int i2, int i3, int i4) {
        this.e = i4;
        this.a = i;
        this.d = cls;
        this.c = i2;
        this.b = i3;
    }

    @Override // defpackage.b30
    public final Object b(View view) {
        switch (this.e) {
            case 0:
                return Boolean.valueOf(r60.c(view));
            case 1:
                return r60.a(view);
            case 2:
                return t60.b(view);
            default:
                return Boolean.valueOf(r60.b(view));
        }
    }

    @Override // defpackage.b30
    public final void c(View view, Object obj) {
        switch (this.e) {
            case 0:
                r60.f(view, ((Boolean) obj).booleanValue());
                break;
            case 1:
                r60.e(view, (CharSequence) obj);
                break;
            case 2:
                t60.c(view, (CharSequence) obj);
                break;
            default:
                r60.d(view, ((Boolean) obj).booleanValue());
                break;
        }
    }

    @Override // defpackage.b30
    public final boolean e(Object obj, Object obj2) {
        boolean zEquals;
        switch (this.e) {
            case 0:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                return !((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue()));
            case 1:
                zEquals = TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
                break;
            case 2:
                zEquals = TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
                break;
            default:
                Boolean bool3 = (Boolean) obj;
                Boolean bool4 = (Boolean) obj2;
                return !((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue()));
        }
        return !zEquals;
    }
}
