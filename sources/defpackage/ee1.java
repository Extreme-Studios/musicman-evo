package defpackage;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ee1 implements Runnable {
    public final /* synthetic */ fe1 f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ boolean j;

    public /* synthetic */ ee1(fe1 fe1Var, int i, int i2, boolean z, boolean z2) {
        this.f = fe1Var;
        this.g = i;
        this.h = i2;
        this.i = z;
        this.j = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
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
    @Override // java.lang.Runnable
    public final void run() {
        int i;
        ?? r9;
        ?? r2;
        ov1 ov1Var;
        ov1 ov1Var2;
        ov1 ov1Var3;
        fe1 fe1Var = this.f;
        int i2 = this.g;
        int i3 = this.h;
        boolean z = this.i;
        boolean z2 = this.j;
        synchronized (fe1Var.g) {
            try {
                boolean z3 = fe1Var.l;
                if (z3 || i3 != 1) {
                    i = i3;
                    r9 = false;
                } else {
                    i3 = 1;
                    i = 1;
                    r9 = true;
                }
                ?? r1 = i2 != i3;
                if (r1 == true && i == 1) {
                    r2 = true;
                    i = 1;
                } else {
                    r2 = false;
                }
                ?? r11 = r1 == true && i == 2;
                ?? r3 = r1 == true && i == 3;
                fe1Var.l = z3 || r9 == true;
                if (r9 != false) {
                    try {
                        ov1 ov1Var4 = fe1Var.k;
                        if (ov1Var4 != null) {
                            ov1Var4.b();
                        }
                    } catch (RemoteException e) {
                        jn.Z("#007 Could not call remote method.", e);
                    }
                }
                if (r2 != false && (ov1Var3 = fe1Var.k) != null) {
                    ov1Var3.K0(ov1Var3.U(), 2);
                }
                if (r11 != false && (ov1Var2 = fe1Var.k) != null) {
                    ov1Var2.e();
                }
                if (r3 != false) {
                    ov1 ov1Var5 = fe1Var.k;
                    if (ov1Var5 != null) {
                        ov1Var5.f();
                    }
                    fe1Var.f.b0();
                }
                if (z != z2 && (ov1Var = fe1Var.k) != null) {
                    Parcel parcelU = ov1Var.U();
                    ClassLoader classLoader = kt0.a;
                    parcelU.writeInt(z2 ? 1 : 0);
                    ov1Var.K0(parcelU, 5);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
