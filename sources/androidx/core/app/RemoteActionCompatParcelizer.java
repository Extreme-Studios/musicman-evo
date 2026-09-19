package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import defpackage.e60;
import defpackage.f60;
import defpackage.g60;

/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(e60 e60Var) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        g60 g60VarH = remoteActionCompat.a;
        boolean z = true;
        if (e60Var.e(1)) {
            g60VarH = e60Var.h();
        }
        remoteActionCompat.a = (IconCompat) g60VarH;
        CharSequence charSequence = remoteActionCompat.b;
        if (e60Var.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((f60) e60Var).e);
        }
        remoteActionCompat.b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.c;
        if (e60Var.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((f60) e60Var).e);
        }
        remoteActionCompat.c = charSequence2;
        remoteActionCompat.d = (PendingIntent) e60Var.g(remoteActionCompat.d, 4);
        boolean z2 = remoteActionCompat.e;
        if (e60Var.e(5)) {
            z2 = ((f60) e60Var).e.readInt() != 0;
        }
        remoteActionCompat.e = z2;
        boolean z3 = remoteActionCompat.f;
        if (!e60Var.e(6)) {
            z = z3;
        } else if (((f60) e60Var).e.readInt() == 0) {
            z = false;
        }
        remoteActionCompat.f = z;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, e60 e60Var) {
        e60Var.getClass();
        IconCompat iconCompat = remoteActionCompat.a;
        e60Var.i(1);
        e60Var.l(iconCompat);
        CharSequence charSequence = remoteActionCompat.b;
        e60Var.i(2);
        Parcel parcel = ((f60) e60Var).e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.c;
        e60Var.i(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        e60Var.k(remoteActionCompat.d, 4);
        boolean z = remoteActionCompat.e;
        e60Var.i(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.f;
        e60Var.i(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
