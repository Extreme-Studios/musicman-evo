package defpackage;

import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class gg0 extends bg0 {
    public final String b;
    public final vj2 c;

    public gg0(String str, String str2, qk2 qk2Var) {
        super(str);
        hn.v(!qk2Var.isEmpty());
        this.b = str2;
        vj2 vj2VarM = vj2.m(qk2Var);
        this.c = vj2VarM;
    }

    public static ArrayList b(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
                return arrayList;
            }
            if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                return arrayList;
            }
            if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    /* JADX WARN: Code duplicated, block: B:84:0x0168 A[Catch: NumberFormatException | StringIndexOutOfBoundsException -> 0x01fd, TryCatch #0 {NumberFormatException | StringIndexOutOfBoundsException -> 0x01fd, blocks: (B:69:0x0115, B:82:0x015f, B:84:0x0168, B:86:0x0174, B:102:0x01b8), top: B:113:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:85:0x0173  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.il0
    public final void a(ak0 ak0Var) {
        String[] strArrSplit;
        Integer numValueOf;
        String str = this.a;
        int iHashCode = str.hashCode();
        vj2 vj2Var = this.c;
        try {
            switch (iHashCode) {
                case 82815:
                    if (!str.equals("TAL")) {
                    }
                    ak0Var.c = (CharSequence) vj2Var.get(0);
                    break;
                case 82878:
                    if (!str.equals("TCM")) {
                    }
                    ak0Var.s = (CharSequence) vj2Var.get(0);
                    break;
                case 82897:
                    if (!str.equals("TDA")) {
                    }
                    String str2 = (String) vj2Var.get(0);
                    int i = Integer.parseInt(str2.substring(2, 4));
                    int i2 = Integer.parseInt(str2.substring(0, 2));
                    ak0Var.m = Integer.valueOf(i);
                    ak0Var.n = Integer.valueOf(i2);
                    break;
                case 83253:
                    if (!str.equals("TP1")) {
                    }
                    ak0Var.b = (CharSequence) vj2Var.get(0);
                    break;
                case 83254:
                    if (!str.equals("TP2")) {
                    }
                    ak0Var.d = (CharSequence) vj2Var.get(0);
                    break;
                case 83255:
                    if (!str.equals("TP3")) {
                    }
                    ak0Var.t = (CharSequence) vj2Var.get(0);
                    break;
                case 83341:
                    if (!str.equals("TRK")) {
                    }
                    String str3 = (String) vj2Var.get(0);
                    String str4 = qz1.a;
                    strArrSplit = str3.split("/", -1);
                    int i3 = Integer.parseInt(strArrSplit[0]);
                    if (strArrSplit.length > 1) {
                        numValueOf = Integer.valueOf(Integer.parseInt(strArrSplit[1]));
                    } else {
                        numValueOf = null;
                    }
                    ak0Var.h = Integer.valueOf(i3);
                    ak0Var.i = numValueOf;
                    break;
                case 83378:
                    if (!str.equals("TT2")) {
                    }
                    ak0Var.a = (CharSequence) vj2Var.get(0);
                    break;
                case 83536:
                    if (!str.equals("TXT")) {
                    }
                    ak0Var.r = (CharSequence) vj2Var.get(0);
                    break;
                case 83552:
                    if (!str.equals("TYE")) {
                    }
                    ak0Var.l = Integer.valueOf(Integer.parseInt((String) vj2Var.get(0)));
                    break;
                case 2567331:
                    if (!str.equals("TALB")) {
                    }
                    ak0Var.c = (CharSequence) vj2Var.get(0);
                    break;
                case 2569357:
                    if (!str.equals("TCOM")) {
                    }
                    ak0Var.s = (CharSequence) vj2Var.get(0);
                    break;
                case 2569358:
                    if (str.equals("TCON")) {
                        Integer numF0 = w40.F0((String) vj2Var.get(0));
                        if (numF0 != null) {
                            String strA = cg0.a(numF0.intValue());
                            if (strA != null) {
                                ak0Var.w = strA;
                            }
                        } else {
                            ak0Var.w = (CharSequence) vj2Var.get(0);
                        }
                    }
                    break;
                case 2569891:
                    if (!str.equals("TDAT")) {
                    }
                    String str5 = (String) vj2Var.get(0);
                    int i4 = Integer.parseInt(str5.substring(2, 4));
                    int i5 = Integer.parseInt(str5.substring(0, 2));
                    ak0Var.m = Integer.valueOf(i4);
                    ak0Var.n = Integer.valueOf(i5);
                    break;
                case 2570401:
                    if (str.equals("TDRC")) {
                        ArrayList arrayListB = b((String) vj2Var.get(0));
                        int size = arrayListB.size();
                        if (size != 1) {
                            if (size != 2) {
                                if (size == 3) {
                                    ak0Var.n = (Integer) arrayListB.get(2);
                                }
                            }
                            ak0Var.m = (Integer) arrayListB.get(1);
                        }
                        ak0Var.l = (Integer) arrayListB.get(0);
                    }
                    break;
                case 2570410:
                    if (str.equals("TDRL")) {
                        ArrayList arrayListB2 = b((String) vj2Var.get(0));
                        int size2 = arrayListB2.size();
                        if (size2 != 1) {
                            if (size2 != 2) {
                                if (size2 == 3) {
                                    ak0Var.q = (Integer) arrayListB2.get(2);
                                }
                            }
                            ak0Var.p = (Integer) arrayListB2.get(1);
                        }
                        ak0Var.o = (Integer) arrayListB2.get(0);
                    }
                    break;
                case 2571565:
                    if (!str.equals("TEXT")) {
                    }
                    ak0Var.r = (CharSequence) vj2Var.get(0);
                    break;
                case 2575251:
                    if (!str.equals("TIT2")) {
                    }
                    ak0Var.a = (CharSequence) vj2Var.get(0);
                    break;
                case 2581512:
                    if (!str.equals("TPE1")) {
                    }
                    ak0Var.b = (CharSequence) vj2Var.get(0);
                    break;
                case 2581513:
                    if (!str.equals("TPE2")) {
                    }
                    ak0Var.d = (CharSequence) vj2Var.get(0);
                    break;
                case 2581514:
                    if (!str.equals("TPE3")) {
                    }
                    ak0Var.t = (CharSequence) vj2Var.get(0);
                    break;
                case 2583398:
                    if (!str.equals("TRCK")) {
                    }
                    String str6 = (String) vj2Var.get(0);
                    String str7 = qz1.a;
                    strArrSplit = str6.split("/", -1);
                    int i6 = Integer.parseInt(strArrSplit[0]);
                    if (strArrSplit.length > 1) {
                        numValueOf = Integer.valueOf(Integer.parseInt(strArrSplit[1]));
                    } else {
                        numValueOf = null;
                    }
                    ak0Var.h = Integer.valueOf(i6);
                    ak0Var.i = numValueOf;
                    break;
                case 2590194:
                    if (!str.equals("TYER")) {
                    }
                    ak0Var.l = Integer.valueOf(Integer.parseInt((String) vj2Var.get(0)));
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gg0.class != obj.getClass()) {
            return false;
        }
        gg0 gg0Var = (gg0) obj;
        return this.a.equals(gg0Var.a) && Objects.equals(this.b, gg0Var.b) && this.c.equals(gg0Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() + 527;
        String str = this.b;
        return this.c.hashCode() + (((iHashCode * 31) + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // defpackage.bg0
    public final String toString() {
        String strValueOf = String.valueOf(this.c);
        String str = this.a;
        int length = str.length();
        String str2 = this.b;
        StringBuilder sb = new StringBuilder(length + 14 + String.valueOf(str2).length() + 9 + strValueOf.length());
        ec.x(sb, str, ": description=", str2, ": values=");
        sb.append(strValueOf);
        return sb.toString();
    }
}
