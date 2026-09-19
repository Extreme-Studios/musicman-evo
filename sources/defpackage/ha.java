package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class ha implements ic, Serializable {
    public final ic f;
    public final gc g;

    public ha(gc gcVar, ic icVar) {
        icVar.getClass();
        gcVar.getClass();
        this.f = icVar;
        this.g = gcVar;
    }

    @Override // defpackage.ic
    public final Object b(Object obj, gl glVar) {
        return glVar.f(this.f.b(obj, glVar), this.g);
    }

    @Override // defpackage.ic
    public final ic e(ic icVar) {
        return ar.j(this, icVar);
    }

    public final boolean equals(Object obj) {
        boolean zB;
        if (this == obj) {
            return true;
        }
        if (obj instanceof ha) {
            ha haVar = (ha) obj;
            int i = 2;
            ha haVar2 = haVar;
            int i2 = 2;
            while (true) {
                ic icVar = haVar2.f;
                haVar2 = icVar instanceof ha ? (ha) icVar : null;
                if (haVar2 == null) {
                    break;
                }
                i2++;
            }
            ha haVar3 = this;
            while (true) {
                ic icVar2 = haVar3.f;
                haVar3 = icVar2 instanceof ha ? (ha) icVar2 : null;
                if (haVar3 == null) {
                    break;
                }
                i++;
            }
            if (i2 == i) {
                while (true) {
                    gc gcVar = this.g;
                    if (!jn.b(haVar.f(gcVar.getKey()), gcVar)) {
                        zB = false;
                        break;
                    }
                    ic icVar3 = this.f;
                    if (!(icVar3 instanceof ha)) {
                        icVar3.getClass();
                        gc gcVar2 = (gc) icVar3;
                        zB = jn.b(haVar.f(gcVar2.getKey()), gcVar2);
                        break;
                    }
                    this = (ha) icVar3;
                }
                if (zB) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.ic
    public final gc f(hc hcVar) {
        hcVar.getClass();
        while (true) {
            gc gcVarF = this.g.f(hcVar);
            if (gcVarF != null) {
                return gcVarF;
            }
            ic icVar = this.f;
            if (!(icVar instanceof ha)) {
                return icVar.f(hcVar);
            }
            this = (ha) icVar;
        }
    }

    @Override // defpackage.ic
    public final ic h(hc hcVar) {
        hcVar.getClass();
        gc gcVar = this.g;
        gc gcVarF = gcVar.f(hcVar);
        ic icVar = this.f;
        if (gcVarF != null) {
            return icVar;
        }
        ic icVarH = icVar.h(hcVar);
        if (icVarH == icVar) {
            return this;
        }
        return icVarH == jh.f ? gcVar : new ha(gcVar, icVarH);
    }

    public final int hashCode() {
        return this.g.hashCode() + this.f.hashCode();
    }

    public final String toString() {
        return "[" + ((String) b("", new ga(0))) + ']';
    }
}
