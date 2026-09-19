package defpackage;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class fj1 extends v90 implements vj1 {
    @Override // defpackage.vj1
    public final l41 getAdapterCreator() {
        Parcel parcelY = Y(U(), 2);
        l41 l41VarB3 = j41.B3(parcelY.readStrongBinder());
        parcelY.recycle();
        return l41VarB3;
    }

    @Override // defpackage.vj1
    public final s32 getLiteSdkVersion() {
        Parcel parcelY = Y(U(), 1);
        s32 s32Var = (s32) kt0.b(parcelY, s32.CREATOR);
        parcelY.recycle();
        return s32Var;
    }
}
