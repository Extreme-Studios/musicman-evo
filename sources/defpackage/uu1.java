package defpackage;

import android.os.ParcelFileDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final class uu1 extends o71 {
    public final /* synthetic */ wu1 f;

    public uu1(wu1 wu1Var) {
        this.f = wu1Var;
    }

    @Override // defpackage.p71
    public final void P2(zs0 zs0Var) {
        cb1 cb1Var = this.f.f;
        zs0Var.getClass();
        cb1Var.c(new bs0(zs0Var.f, zs0Var.g));
    }

    @Override // defpackage.p71
    public final void q1(ParcelFileDescriptor parcelFileDescriptor, r71 r71Var) {
        this.f.f.b(new ev1(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), r71Var));
    }

    @Override // defpackage.p71
    public final void w1(ParcelFileDescriptor parcelFileDescriptor) {
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
        wu1 wu1Var = this.f;
        wu1Var.f.b(new ev1(autoCloseInputStream, wu1Var.j));
    }
}
