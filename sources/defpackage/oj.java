package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class oj implements LayoutInflater.Factory2 {
    public final xj f;

    public oj(xj xjVar) {
        this.f = xjVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v12, types: [kj] */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object, kj] */
    /* JADX WARN: Type inference failed for: r12v4, types: [kj] */
    /* JADX WARN: Type inference failed for: r12v6, types: [kj] */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r4v1, types: [xj] */
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
    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean zIsAssignableFrom;
        ?? Z;
        View view2;
        ek ekVarF;
        ?? r12;
        kj kjVarZ;
        boolean zEquals = nj.class.getName().equals(str);
        ?? r4 = this.f;
        if (zEquals) {
            return new nj(context, attributeSet, r4);
        }
        View view3 = null;
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hw.a);
            if (attributeValue == null) {
                attributeValue = typedArrayObtainStyledAttributes.getString(0);
            }
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
            String string = typedArrayObtainStyledAttributes.getString(2);
            typedArrayObtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    zIsAssignableFrom = kj.class.isAssignableFrom(sj.b(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    zIsAssignableFrom = false;
                }
                if (zIsAssignableFrom) {
                    int id = view != null ? view.getId() : 0;
                    if (id == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    if (resourceId != -1) {
                        kjVarZ = r4.z(resourceId);
                    } else {
                        Z = 0;
                    }
                    if (Z == 0 && string != null) {
                        y91 y91Var = r4.c;
                        ArrayList arrayList = (ArrayList) y91Var.g;
                        int size = arrayList.size() - 1;
                        while (true) {
                            if (size < 0) {
                                view2 = view3;
                                Iterator it = ((HashMap) y91Var.h).values().iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        Z = view2;
                                        break;
                                    }
                                    ek ekVar = (ek) it.next();
                                    if (ekVar != null) {
                                        Z = ekVar.c;
                                        if (string.equals(Z.C)) {
                                            break;
                                        }
                                    }
                                }
                            } else {
                                kj kjVar = (kj) arrayList.get(size);
                                view2 = view3;
                                if (kjVar != null && string.equals(kjVar.C)) {
                                    Z = kjVar;
                                    break;
                                }
                                size--;
                                view3 = view2;
                            }
                        }
                    } else {
                        Z = kjVarZ;
                        view2 = null;
                    }
                    if (Z == 0 && id != -1) {
                        Z = r4.z(id);
                    }
                    if (Z == 0) {
                        sj sjVarB = r4.B();
                        context.getClassLoader();
                        kj kjVarA = sjVarB.a(attributeValue);
                        kjVarA.r = true;
                        kjVarA.A = resourceId != 0 ? resourceId : id;
                        kjVarA.B = id;
                        kjVarA.C = string;
                        kjVarA.s = true;
                        kjVarA.w = r4;
                        mj mjVar = r4.t;
                        kjVarA.x = mjVar;
                        c4 c4Var = mjVar.D;
                        kjVarA.H = true;
                        if ((mjVar == null ? view2 : mjVar.C) != null) {
                            kjVarA.H = true;
                        }
                        ekVarF = r4.a(kjVarA);
                        r12 = kjVarA;
                        if (xj.E(2)) {
                            Log.v("FragmentManager", "Fragment " + kjVarA + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                            r12 = kjVarA;
                        }
                    } else {
                        if (Z.s) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                        }
                        Z.s = true;
                        Z.w = r4;
                        mj mjVar2 = r4.t;
                        Z.x = mjVar2;
                        c4 c4Var2 = mjVar2.D;
                        Z.H = true;
                        if ((mjVar2 == null ? view2 : mjVar2.C) != null) {
                            Z.H = true;
                        }
                        ekVarF = r4.f(Z);
                        r12 = Z;
                        if (xj.E(2)) {
                            Log.v("FragmentManager", "Retained Fragment " + Z + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                            r12 = Z;
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    fk fkVar = gk.a;
                    gk.b(new hk(r12, viewGroup, 0));
                    gk.a(r12).getClass();
                    r12.I = viewGroup;
                    ekVarF.j();
                    ekVarF.i();
                    j7.e(ec.i("Fragment ", attributeValue, " did not create a view."));
                    return view2;
                }
            }
        }
        return null;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
