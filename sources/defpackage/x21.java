package defpackage;

import android.os.Parcel;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class x21 extends v90 implements y21 {
    @Override // defpackage.y21
    public final void R1(List list) {
        Parcel parcelU = U();
        parcelU.writeTypedList(list);
        K0(parcelU, 1);
    }
}
