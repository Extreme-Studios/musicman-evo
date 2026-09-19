package defpackage;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class nh2 extends jt0 {
    public final s62 f;
    public final /* synthetic */ oh2 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nh2(oh2 oh2Var, s62 s62Var) {
        super("com.google.android.play.core.lmd.protocol.ILmdOverlayServiceListener");
        this.g = oh2Var;
        this.f = s62Var;
    }

    @Override // defpackage.jt0
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        qx1 qx1Var;
        if (i != 1) {
            return false;
        }
        Bundle bundle = (Bundle) kt0.b(parcel, Bundle.CREATOR);
        kt0.f(parcel);
        int i2 = bundle.getInt("statusCode", 8150);
        String string = bundle.getString("sessionToken");
        int i3 = bundle.getInt("uiMode", 0);
        byte b = (byte) (((byte) (0 | 1)) | 1);
        if (string == null) {
            string = null;
        }
        byte b2 = (byte) (b | 2);
        if (b2 == 3) {
            this.f.c(new lh2(string, i2, i3));
            if (i2 == 8157 && (qx1Var = this.g.a) != null) {
                oh2.c.d("unbind LMD display overlay service", new Object[0]);
                qx1Var.d(new ly1(24, qx1Var));
            }
            return true;
        }
        StringBuilder sb = new StringBuilder();
        if ((b2 & 1) == 0) {
            sb.append(" statusCode");
        }
        if ((b2 & 2) == 0) {
            sb.append(" uiMode");
        }
        j7.e("Missing required properties:".concat(sb.toString()));
        return false;
    }
}
