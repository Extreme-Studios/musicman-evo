package defpackage;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public final class s03 extends o03 {
    public final Serializable f;

    public s03(Boolean bool) {
        this.f = bool;
    }

    public static boolean f(s03 s03Var) {
        Serializable serializable = s03Var.f;
        if (!(serializable instanceof Number)) {
            return false;
        }
        Number number = (Number) serializable;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    @Override // defpackage.o03
    public final String a() {
        Serializable serializable = this.f;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        if (serializable instanceof Number) {
            return d().toString();
        }
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).toString();
        }
        throw new AssertionError("Unexpected value type: ".concat(String.valueOf(serializable.getClass())));
    }

    public final Number d() {
        Serializable serializable = this.f;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new t03((String) serializable);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    public final BigInteger e() {
        Serializable serializable = this.f;
        if (serializable instanceof BigInteger) {
            return (BigInteger) serializable;
        }
        if (f(this)) {
            return BigInteger.valueOf(d().longValue());
        }
        String strA = a();
        jn.A(strA);
        return new BigInteger(strA);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s03.class != obj.getClass()) {
            return false;
        }
        s03 s03Var = (s03) obj;
        Serializable serializable = s03Var.f;
        Serializable serializable2 = this.f;
        if (serializable2 == null) {
            return serializable == null;
        }
        if (f(this) && f(s03Var)) {
            if ((serializable2 instanceof BigInteger) || (serializable instanceof BigInteger)) {
                return e().equals(s03Var.e());
            }
            return d().longValue() == s03Var.d().longValue();
        }
        if (!(serializable2 instanceof Number) || !(serializable instanceof Number)) {
            return serializable2.equals(serializable);
        }
        if ((serializable2 instanceof BigDecimal) && (serializable instanceof BigDecimal)) {
            return (serializable2 instanceof BigDecimal ? (BigDecimal) serializable2 : jn.o(a())).compareTo(serializable instanceof BigDecimal ? (BigDecimal) serializable : jn.o(s03Var.a())) == 0;
        }
        double dDoubleValue = serializable2 instanceof Number ? d().doubleValue() : Double.parseDouble(a());
        double dDoubleValue2 = serializable instanceof Number ? s03Var.d().doubleValue() : Double.parseDouble(s03Var.a());
        if (dDoubleValue != dDoubleValue2) {
            return Double.isNaN(dDoubleValue) && Double.isNaN(dDoubleValue2);
        }
        return true;
    }

    public final int hashCode() {
        long jDoubleToLongBits;
        Serializable serializable = this.f;
        if (serializable == null) {
            return 31;
        }
        if (f(this)) {
            jDoubleToLongBits = d().longValue();
        } else {
            if (!(serializable instanceof Number)) {
                return serializable.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(d().doubleValue());
        }
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public s03(String str) {
        this.f = str;
    }

    public s03(kr2 kr2Var) {
        this.f = kr2Var;
    }
}
