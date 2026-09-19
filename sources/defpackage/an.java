package defpackage;

import android.content.ClipData;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class an {
    public final /* synthetic */ TextView a;

    public /* synthetic */ an(TextView textView) {
        this.a = textView;
    }

    public boolean a(zy1 zy1Var, int i, Bundle bundle) {
        pb zy1Var2;
        g5 g5Var = (g5) this.a;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 25 && (i & 1) != 0) {
            try {
                ((en) zy1Var.g).k();
                Parcelable parcelable = (Parcelable) ((en) zy1Var.g).i();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
                return false;
            }
        }
        en enVar = (en) zy1Var.g;
        ClipData clipData = new ClipData(enVar.getDescription(), new ClipData.Item(enVar.j()));
        if (i2 >= 31) {
            zy1Var2 = new zy1(clipData, 2);
        } else {
            qb qbVar = new qb();
            qbVar.g = clipData;
            qbVar.h = 2;
            zy1Var2 = qbVar;
        }
        zy1Var2.g(enVar.n());
        zy1Var2.setExtras(bundle);
        return w60.g(g5Var, zy1Var2.build()) == null;
    }
}
