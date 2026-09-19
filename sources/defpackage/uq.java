package defpackage;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;

/* JADX INFO: loaded from: classes.dex */
public final class uq {
    public final MeasurementManager a;

    public uq(Context context) {
        Object systemService = context.getSystemService((Class<Object>) tq.n());
        systemService.getClass();
        this.a = tq.e(systemService);
    }

    public Object a(ve veVar, yb ybVar) {
        new z8(1, s90.h(ybVar)).t();
        tq.p();
        throw null;
    }

    public Object b(yb ybVar) {
        z8 z8Var = new z8(1, s90.h(ybVar));
        z8Var.t();
        this.a.getMeasurementApiStatus(new c7(1), new bc(z8Var));
        return z8Var.s();
    }

    public Object c(Uri uri, InputEvent inputEvent, yb ybVar) throws Throwable {
        z8 z8Var = new z8(1, s90.h(ybVar));
        z8Var.t();
        this.a.registerSource(uri, inputEvent, new c7(1), new bc(z8Var));
        Object objS = z8Var.s();
        return objS == rc.f ? objS : k50.a;
    }

    public Object d(Uri uri, yb ybVar) throws Throwable {
        z8 z8Var = new z8(1, s90.h(ybVar));
        z8Var.t();
        this.a.registerTrigger(uri, new c7(1), new bc(z8Var));
        Object objS = z8Var.s();
        return objS == rc.f ? objS : k50.a;
    }

    public Object e(t70 t70Var, yb ybVar) {
        new z8(1, s90.h(ybVar)).t();
        tq.x();
        throw null;
    }

    public Object f(u70 u70Var, yb ybVar) {
        new z8(1, s90.h(ybVar)).t();
        tq.y();
        throw null;
    }
}
