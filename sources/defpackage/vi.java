package defpackage;

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class vi implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ vi(ep0 ep0Var, ma1 ma1Var, int i, Bundle bundle) {
        this.a = 2;
        this.b = ep0Var;
        this.c = ma1Var;
        this.d = i;
        this.e = bundle;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.a;
        int i2 = this.d;
        Object obj = this.e;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ArrayList arrayList = new ArrayList(1);
                Object obj4 = new Object[]{(si) obj}[0];
                Objects.requireNonNull(obj4);
                arrayList.add(obj4);
                return yi.b((String) obj3, (Context) obj2, Collections.unmodifiableList(arrayList), i2);
            case 1:
                try {
                    return yi.b((String) obj3, (Context) obj2, (ArrayList) obj, i2);
                } catch (Throwable unused) {
                    return new xi(-3);
                }
            default:
                ep0 ep0Var = (ep0) obj3;
                ma1 ma1Var = (ma1) obj2;
                Context context = ep0Var.h;
                String str = ma1Var.f;
                String str2 = ma1Var.g;
                kb3 kb3Var = ma1Var.h;
                f93 f93Var = ma1Var.i;
                String str3 = ma1Var.k;
                return ep0Var.G3(context, str, str2, kb3Var, f93Var, this.d, str3, (Bundle) obj, ma1Var);
        }
    }

    public /* synthetic */ vi(String str, Context context, Object obj, int i, int i2) {
        this.a = i2;
        this.b = str;
        this.c = context;
        this.e = obj;
        this.d = i;
    }
}
