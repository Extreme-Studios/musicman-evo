package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class xk2 extends pk2 implements Serializable {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return zf3.k.compare(obj2, obj);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof xk2)) {
            return false;
        }
        kj2 kj2Var = zf3.k;
        return kj2Var.equals(kj2Var);
    }

    public final int hashCode() {
        return -zf3.k.hashCode();
    }

    public final String toString() {
        return zf3.k.toString().concat(".reverse()");
    }
}
