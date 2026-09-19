package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ga implements gl {
    public final /* synthetic */ int f;

    public /* synthetic */ ga(int i) {
        this.f = i;
    }

    @Override // defpackage.gl
    public final Object f(Object obj, Object obj2) {
        ha haVar;
        Object obj3;
        switch (this.f) {
            case 0:
                String str = (String) obj;
                gc gcVar = (gc) obj2;
                str.getClass();
                gcVar.getClass();
                if (str.length() == 0) {
                    return gcVar.toString();
                }
                return str + ", " + gcVar;
            case 1:
                ic icVar = (ic) obj;
                gc gcVar2 = (gc) obj2;
                icVar.getClass();
                gcVar2.getClass();
                ic icVarH = icVar.h(gcVar2.getKey());
                jh jhVar = jh.f;
                if (icVarH == jhVar) {
                    return gcVar2;
                }
                ig igVar = ig.g;
                lc lcVar = (lc) icVarH.f(igVar);
                if (lcVar == null) {
                    haVar = new ha(gcVar2, icVarH);
                } else {
                    ic icVarH2 = icVarH.h(igVar);
                    if (icVarH2 == jhVar) {
                        return new ha(lcVar, gcVar2);
                    }
                    haVar = new ha(lcVar, new ha(gcVar2, icVarH2));
                }
                return haVar;
            case 2:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                obj3 = bool;
                break;
            case 3:
                return ((ic) obj).e((gc) obj2);
            case 4:
                return ((ic) obj).e((gc) obj2);
            case 5:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case 6:
                return obj;
            case 7:
                if (obj == null) {
                    return null;
                }
                j7.j();
                return null;
            default:
                obj3 = (w30) obj;
                break;
        }
        return obj3;
    }
}
