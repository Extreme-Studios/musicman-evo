package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class t7 implements Parcelable {
    public static final Parcelable.Creator<t7> CREATOR = new a2(2);
    public final int[] f;
    public final ArrayList g;
    public final int[] h;
    public final int[] i;
    public final int j;
    public final String k;
    public final int l;
    public final int m;
    public final CharSequence n;
    public final int o;
    public final CharSequence p;
    public final ArrayList q;
    public final ArrayList r;
    public final boolean s;

    public t7(s7 s7Var) {
        int size = s7Var.a.size();
        this.f = new int[size * 6];
        if (!s7Var.g) {
            j7.e("Not on back stack");
            throw null;
        }
        this.g = new ArrayList(size);
        this.h = new int[size];
        this.i = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            ik ikVar = (ik) s7Var.a.get(i2);
            int i3 = i + 1;
            this.f[i] = ikVar.a;
            ArrayList arrayList = this.g;
            kj kjVar = ikVar.b;
            arrayList.add(kjVar != null ? kjVar.j : null);
            int[] iArr = this.f;
            iArr[i3] = ikVar.c ? 1 : 0;
            iArr[i + 2] = ikVar.d;
            iArr[i + 3] = ikVar.e;
            int i4 = i + 5;
            iArr[i + 4] = ikVar.f;
            i += 6;
            iArr[i4] = ikVar.g;
            this.h[i2] = ikVar.h.ordinal();
            this.i[i2] = ikVar.i.ordinal();
        }
        this.j = s7Var.f;
        this.k = s7Var.h;
        this.l = s7Var.r;
        this.m = s7Var.i;
        this.n = s7Var.j;
        this.o = s7Var.k;
        this.p = s7Var.l;
        this.q = s7Var.m;
        this.r = s7Var.n;
        this.s = s7Var.o;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f);
        parcel.writeStringList(this.g);
        parcel.writeIntArray(this.h);
        parcel.writeIntArray(this.i);
        parcel.writeInt(this.j);
        parcel.writeString(this.k);
        parcel.writeInt(this.l);
        parcel.writeInt(this.m);
        TextUtils.writeToParcel(this.n, parcel, 0);
        parcel.writeInt(this.o);
        TextUtils.writeToParcel(this.p, parcel, 0);
        parcel.writeStringList(this.q);
        parcel.writeStringList(this.r);
        parcel.writeInt(this.s ? 1 : 0);
    }

    public t7(Parcel parcel) {
        this.f = parcel.createIntArray();
        this.g = parcel.createStringArrayList();
        this.h = parcel.createIntArray();
        this.i = parcel.createIntArray();
        this.j = parcel.readInt();
        this.k = parcel.readString();
        this.l = parcel.readInt();
        this.m = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.n = (CharSequence) creator.createFromParcel(parcel);
        this.o = parcel.readInt();
        this.p = (CharSequence) creator.createFromParcel(parcel);
        this.q = parcel.createStringArrayList();
        this.r = parcel.createStringArrayList();
        this.s = parcel.readInt() != 0;
    }
}
