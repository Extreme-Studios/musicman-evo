package defpackage;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class d33 {
    public static final d33 c = new d33();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final dr0 a = new dr0();

    public final j33 a(Class cls) {
        j33 z23Var;
        Charset charset = m23.a;
        if (cls == null) {
            j7.l("messageType");
            return null;
        }
        ConcurrentHashMap concurrentHashMap = this.b;
        j33 j33Var = (j33) concurrentHashMap.get(cls);
        if (j33Var != null) {
            return j33Var;
        }
        dr0 dr0Var = this.a;
        dr0Var.getClass();
        ig igVar = k33.a;
        if (!d23.class.isAssignableFrom(cls)) {
            int i = h13.a;
        }
        f33 f33VarH = ((bz1) dr0Var.g).h(cls);
        if ((f33VarH.d & 2) == 2) {
            int i2 = h13.a;
            ig igVar2 = k33.a;
            kt2 kt2Var = x13.a;
            z23Var = new z23(igVar2, f33VarH.a);
        } else {
            int i3 = h13.a;
            int i4 = a33.a;
            int i5 = r23.a;
            ig igVar3 = k33.a;
            kt2 kt2Var2 = f33VarH.a() + (-1) != 1 ? x13.a : null;
            int i6 = v23.a;
            z23Var = y23.z(f33VarH, igVar3, kt2Var2);
        }
        j33 j33Var2 = (j33) concurrentHashMap.putIfAbsent(cls, z23Var);
        return j33Var2 != null ? j33Var2 : z23Var;
    }
}
