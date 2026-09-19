package defpackage;

import android.os.ParcelFileDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final class vu1 extends o71 {
    public final cb1 f;
    public final r71 g;

    public vu1(cb1 cb1Var, r71 r71Var) {
        this.f = cb1Var;
        this.g = r71Var;
    }

    @Override // defpackage.p71
    public final void P2(zs0 zs0Var) {
        zs0Var.getClass();
        this.f.c(new bs0(zs0Var.f, zs0Var.g));
    }

    @Override // defpackage.p71
    public final void q1(ParcelFileDescriptor parcelFileDescriptor, r71 r71Var) {
        this.f.b(new ev1(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), r71Var));
    }

    @Override // defpackage.p71
    public final void w1(ParcelFileDescriptor parcelFileDescriptor) {
        this.f.b(new ev1(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), this.g));
    }
}
