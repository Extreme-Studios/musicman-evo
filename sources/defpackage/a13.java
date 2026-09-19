package defpackage;

import java.io.IOException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class a13 extends hn {
    public static final a13 u = new a13();

    public static void T(d13 d13Var, o03 o03Var) throws IOException {
        xp xpVar = d13Var.f;
        if (o03Var == null || (o03Var instanceof p03)) {
            if (d13Var.n != null) {
                d13Var.c();
            }
            d13Var.f();
            xpVar.write("null");
            return;
        }
        if (o03Var instanceof s03) {
            s03 s03VarC = o03Var.c();
            Serializable serializable = s03VarC.f;
            if (!(serializable instanceof Number)) {
                if (serializable instanceof Boolean) {
                    boolean zBooleanValue = ((Boolean) serializable).booleanValue();
                    d13Var.c();
                    d13Var.f();
                    xpVar.write(true != zBooleanValue ? "false" : "true");
                    return;
                }
                String strA = s03VarC.a();
                if (strA != null) {
                    d13Var.c();
                    d13Var.f();
                    d13Var.d(strA);
                    return;
                } else {
                    if (d13Var.n != null) {
                        d13Var.c();
                    }
                    d13Var.f();
                    xpVar.write("null");
                    return;
                }
            }
            Number numberD = s03VarC.d();
            d13Var.c();
            String string = numberD.toString();
            Class<?> cls = numberD.getClass();
            if (cls != Integer.class && cls != Long.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class) {
                if (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN")) {
                    if (d13Var.m != 1) {
                        j7.p("Numeric values must be finite, but was ".concat(string));
                        return;
                    }
                } else if (cls != Float.class && cls != Double.class && !d13.o.matcher(string).matches()) {
                    String strValueOf = String.valueOf(cls);
                    j7.p(ec.o(new StringBuilder(strValueOf.length() + 47 + string.length()), "String created by ", strValueOf, " is not a valid JSON number: ", string));
                    return;
                }
            }
            d13Var.f();
            xpVar.append((CharSequence) string);
            return;
        }
        if (o03Var instanceof n03) {
            d13Var.c();
            d13Var.f();
            int i = d13Var.h;
            int[] iArr = d13Var.g;
            if (i == iArr.length) {
                d13Var.g = Arrays.copyOf(iArr, i + i);
            }
            int[] iArr2 = d13Var.g;
            int i2 = d13Var.h;
            d13Var.h = i2 + 1;
            iArr2[i2] = 1;
            xpVar.write(91);
            ArrayList arrayList = ((n03) o03Var).f;
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                T(d13Var, (o03) obj);
            }
            d13Var.a(1, 2, ']');
            return;
        }
        if (!(o03Var instanceof q03)) {
            j7.p("Couldn't write ".concat(String.valueOf(o03Var.getClass())));
            return;
        }
        d13Var.c();
        d13Var.f();
        int i4 = d13Var.h;
        int[] iArr3 = d13Var.g;
        if (i4 == iArr3.length) {
            d13Var.g = Arrays.copyOf(iArr3, i4 + i4);
        }
        int[] iArr4 = d13Var.g;
        int i5 = d13Var.h;
        d13Var.h = i5 + 1;
        iArr4[i5] = 3;
        xpVar.write(123);
        Iterator it = ((v03) o03Var.b().f.entrySet()).iterator();
        while (((u03) it).hasNext()) {
            w03 w03VarB = ((u03) it).a();
            String str = (String) w03VarB.getKey();
            Objects.requireNonNull(str, "name == null");
            if (d13Var.n != null) {
                j7.e("Already wrote a name, expecting a value.");
                return;
            }
            int iB = d13Var.b();
            if (iB != 3 && iB != 5) {
                j7.e("Please begin an object before writing a name.");
                return;
            } else {
                d13Var.n = str;
                T(d13Var, (o03) w03VarB.getValue());
            }
        }
        d13Var.a(3, 5, '}');
    }
}
