package defpackage;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Spanned;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ri0 implements pm1, hp1 {
    public final /* synthetic */ int f = 2;
    public int g;
    public long h;
    public Object i;

    public /* synthetic */ ri0(si0 si0Var, long j, int i) {
        this.i = si0Var;
        this.h = j;
        this.g = i;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x013b  */
    @Override // defpackage.pm1
    /* JADX INFO: renamed from: b */
    public void mo0b(Object obj) {
        long j;
        int i;
        long j2;
        tj2 tj2Var;
        switch (this.f) {
            case 0:
                si0 si0Var = (si0) this.i;
                long j3 = this.h;
                int i2 = this.g;
                mi0 mi0Var = (mi0) obj;
                si0Var.h.getClass();
                vj2 vj2Var = mi0Var.a;
                long j4 = mi0Var.c;
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>(vj2Var.size());
                int i3 = 0;
                tj2 tj2VarListIterator = vj2Var.listIterator(0);
                while (tj2VarListIterator.hasNext()) {
                    tf1 tf1Var = (tf1) tj2VarListIterator.next();
                    tf1Var.getClass();
                    Bundle bundle = new Bundle();
                    CharSequence charSequence = tf1Var.a;
                    if (charSequence != null) {
                        bundle.putCharSequence(tf1.q, charSequence);
                        if (charSequence instanceof Spanned) {
                            Spanned spanned = (Spanned) charSequence;
                            String str = pg1.a;
                            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
                            nh1[] nh1VarArr = (nh1[]) spanned.getSpans(i3, spanned.length(), nh1.class);
                            int length = nh1VarArr.length;
                            while (i3 < length) {
                                int i4 = i2;
                                nh1 nh1Var = nh1VarArr[i3];
                                nh1Var.getClass();
                                long j5 = j3;
                                Bundle bundle2 = new Bundle();
                                bundle2.putString(nh1.c, nh1Var.a);
                                bundle2.putInt(nh1.d, nh1Var.b);
                                arrayList2.add(pg1.a(spanned, nh1Var, 1, bundle2));
                                i3++;
                                i2 = i4;
                                j3 = j5;
                                tj2VarListIterator = tj2VarListIterator;
                            }
                            i = i2;
                            j2 = j3;
                            tj2Var = tj2VarListIterator;
                            for (ci1 ci1Var : (ci1[]) spanned.getSpans(0, spanned.length(), ci1.class)) {
                                ci1Var.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putInt(ci1.d, ci1Var.a);
                                bundle3.putInt(ci1.e, ci1Var.b);
                                bundle3.putInt(ci1.f, ci1Var.c);
                                arrayList2.add(pg1.a(spanned, ci1Var, 2, bundle3));
                            }
                            for (gh1 gh1Var : (gh1[]) spanned.getSpans(0, spanned.length(), gh1.class)) {
                                arrayList2.add(pg1.a(spanned, gh1Var, 3, null));
                            }
                            for (qi1 qi1Var : (qi1[]) spanned.getSpans(0, spanned.length(), qi1.class)) {
                                qi1Var.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putString(qi1.b, qi1Var.a);
                                arrayList2.add(pg1.a(spanned, qi1Var, 4, bundle4));
                            }
                            if (!arrayList2.isEmpty()) {
                                bundle.putParcelableArrayList(tf1.r, arrayList2);
                            }
                        } else {
                            i = i2;
                            j2 = j3;
                            tj2Var = tj2VarListIterator;
                        }
                    } else {
                        i = i2;
                        j2 = j3;
                        tj2Var = tj2VarListIterator;
                    }
                    bundle.putSerializable(tf1.s, tf1Var.b);
                    bundle.putSerializable(tf1.t, tf1Var.c);
                    bundle.putFloat(tf1.v, tf1Var.e);
                    bundle.putInt(tf1.w, tf1Var.f);
                    bundle.putInt(tf1.x, tf1Var.g);
                    bundle.putFloat(tf1.y, tf1Var.h);
                    bundle.putInt(tf1.z, tf1Var.i);
                    bundle.putInt(tf1.A, tf1Var.l);
                    bundle.putFloat(tf1.B, tf1Var.m);
                    bundle.putFloat(tf1.C, tf1Var.j);
                    bundle.putFloat(tf1.D, tf1Var.k);
                    bundle.putBoolean(tf1.F, false);
                    bundle.putInt(tf1.E, -16777216);
                    bundle.putInt(tf1.G, tf1Var.n);
                    bundle.putFloat(tf1.H, tf1Var.o);
                    bundle.putInt(tf1.I, tf1Var.p);
                    Bitmap bitmap = tf1Var.d;
                    if (bitmap != null) {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        hn.M(bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
                        bundle.putByteArray(tf1.u, byteArrayOutputStream.toByteArray());
                    }
                    arrayList.add(bundle);
                    i2 = i;
                    j3 = j2;
                    tj2VarListIterator = tj2Var;
                    i3 = 0;
                }
                int i5 = i2;
                long j6 = j3;
                Bundle bundle5 = new Bundle();
                bundle5.putParcelableArrayList("c", arrayList);
                bundle5.putLong("d", j4);
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeBundle(bundle5);
                byte[] bArrMarshall = parcelObtain.marshall();
                parcelObtain.recycle();
                cw1 cw1Var = si0Var.c;
                int length2 = bArrMarshall.length;
                cw1Var.z(length2, bArrMarshall);
                me0 me0Var = si0Var.a;
                me0Var.a(cw1Var, length2, 0);
                long j7 = mi0Var.b;
                de3 de3Var = si0Var.h;
                if (j7 == -9223372036854775807L) {
                    hn.M(de3Var.r == Long.MAX_VALUE);
                    j = j6;
                } else {
                    long j8 = de3Var.r;
                    j = j8 == Long.MAX_VALUE ? j6 + j7 : j7 + j8;
                }
                me0Var.c(j, i5 | 1, length2, 0, null);
                break;
            default:
                ((r93) obj).i((q93) this.i, this.g, this.h);
                break;
        }
    }

    public /* synthetic */ ri0() {
    }

    public /* synthetic */ ri0(q93 q93Var, int i, long j, long j2) {
        this.i = q93Var;
        this.g = i;
        this.h = j;
    }
}
