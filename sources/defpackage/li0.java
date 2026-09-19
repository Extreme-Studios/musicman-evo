package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class li0 {
    public final String a;
    public final of0 b;
    public final te0 c;
    public final uk0 d;
    public final vc0 e;

    static {
        tj2 tj2Var = vj2.g;
        qk2 qk2Var = qk2.j;
        List list = Collections.EMPTY_LIST;
        dh0 dh0Var = dh0.a;
        new vc0();
        uk0 uk0Var = uk0.B;
        String str = qz1.a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
    }

    public /* synthetic */ li0(String str, vc0 vc0Var, of0 of0Var, te0 te0Var, uk0 uk0Var) {
        dh0 dh0Var = dh0.a;
        this.a = str;
        this.b = of0Var;
        this.c = te0Var;
        this.d = uk0Var;
        this.e = vc0Var;
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
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof li0)) {
            return false;
        }
        li0 li0Var = (li0) obj;
        if (!this.a.equals(li0Var.a) || !this.e.equals(li0Var.e) || !Objects.equals(this.b, li0Var.b) || !this.c.equals(li0Var.c) || !Objects.equals(this.d, li0Var.d)) {
            return false;
        }
        dh0 dh0Var = dh0.a;
        return dh0Var.equals(dh0Var);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        of0 of0Var = this.b;
        return (this.d.hashCode() + ((((this.c.hashCode() + ((iHashCode + (of0Var != null ? of0Var.hashCode() : 0)) * 31)) * 31) - Integer.MIN_VALUE) * 31)) * 31;
    }
}
