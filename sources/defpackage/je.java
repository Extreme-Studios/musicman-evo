package defpackage;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class je implements jo {
    public final /* synthetic */ int f;
    public final Object g;
    public final Object h;

    public je(lo loVar) {
        this.f = 2;
        this.g = loVar;
        t9 t9Var = t9.c;
        Class<?> cls = loVar.getClass();
        r9 r9Var = (r9) t9Var.a.get(cls);
        this.h = r9Var == null ? t9Var.a(cls, null) : r9Var;
    }

    @Override // defpackage.jo
    public final void g(mo moVar, eo eoVar) {
        int i = this.f;
        Object obj = this.g;
        Object obj2 = this.h;
        switch (i) {
            case 0:
                he heVar = (he) obj;
                switch (ie.a[eoVar.ordinal()]) {
                    case 1:
                        heVar.f(moVar);
                        break;
                    case 2:
                        heVar.c(moVar);
                        break;
                    case 3:
                        heVar.e(moVar);
                        break;
                    case 4:
                        heVar.a(moVar);
                        break;
                    case 5:
                        heVar.b(moVar);
                        break;
                    case 6:
                        heVar.d(moVar);
                        break;
                    case 7:
                        j7.p("ON_ANY must not been send by anybody");
                        return;
                    default:
                        throw new na();
                }
                jo joVar = (jo) obj2;
                if (joVar != null) {
                    joVar.g(moVar, eoVar);
                    return;
                }
                return;
            case 1:
                if (eoVar == eo.ON_START) {
                    ((oo) obj).f(this);
                    ((z61) obj2).z();
                    return;
                }
                return;
            default:
                lo loVar = (lo) obj;
                HashMap map = ((r9) obj2).a;
                r9.a((List) map.get(eoVar), moVar, eoVar, loVar);
                r9.a((List) map.get(eo.ON_ANY), moVar, eoVar, loVar);
                return;
        }
    }

    public /* synthetic */ je(Object obj, int i, Object obj2) {
        this.f = i;
        this.g = obj;
        this.h = obj2;
    }
}
