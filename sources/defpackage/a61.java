package defpackage;

import android.content.DialogInterface;
import android.content.Intent;
import android.provider.CalendarContract;

/* JADX INFO: loaded from: classes.dex */
public final class a61 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int f;
    public final /* synthetic */ b61 g;

    public /* synthetic */ a61(b61 b61Var, int i) {
        this.f = i;
        this.g = b61Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.f;
        b61 b61Var = this.g;
        switch (i2) {
            case 0:
                b61Var.getClass();
                Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
                data.putExtra("title", b61Var.k);
                data.putExtra("eventLocation", b61Var.o);
                data.putExtra("description", b61Var.n);
                long j = b61Var.l;
                if (j > -1) {
                    data.putExtra("beginTime", j);
                }
                long j2 = b61Var.m;
                if (j2 > -1) {
                    data.putExtra("endTime", j2);
                }
                data.setFlags(268435456);
                zb3 zb3Var = vc3.C.c;
                zb3.s(b61Var.j, data);
                break;
            default:
                b61Var.z("Operation denied by user.");
                break;
        }
    }
}
