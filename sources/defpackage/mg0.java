package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mg0 implements il0 {
    public final String a;
    public final String b;

    public mg0(String str, String str2) {
        this.a = dq.A(str);
        this.b = str2;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.il0
    public final void a(ak0 ak0Var) {
        Integer numF0;
        Integer numF1;
        Integer numF2;
        Integer numF3;
        String str = this.a;
        int iHashCode = str.hashCode();
        String str2 = this.b;
        switch (iHashCode) {
            case -1935137620:
                if (str.equals("TOTALTRACKS") && (numF0 = w40.F0(str2)) != null) {
                    ak0Var.i = numF0;
                    break;
                }
                break;
            case -215998278:
                if (str.equals("TOTALDISCS") && (numF1 = w40.F0(str2)) != null) {
                    ak0Var.v = numF1;
                    break;
                }
                break;
            case -113312716:
                if (str.equals("TRACKNUMBER") && (numF2 = w40.F0(str2)) != null) {
                    ak0Var.h = numF2;
                    break;
                }
                break;
            case 62359119:
                if (str.equals("ALBUM")) {
                    ak0Var.c = str2;
                }
                break;
            case 67703139:
                if (str.equals("GENRE")) {
                    ak0Var.w = str2;
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    ak0Var.a = str2;
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    ak0Var.e = str2;
                }
                break;
            case 993300766:
                if (str.equals("DISCNUMBER") && (numF3 = w40.F0(str2)) != null) {
                    ak0Var.u = numF3;
                    break;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    ak0Var.d = str2;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    ak0Var.b = str2;
                }
                break;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && mg0.class == obj.getClass()) {
            mg0 mg0Var = (mg0) obj;
            if (this.a.equals(mg0Var.a) && this.b.equals(mg0Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.a.hashCode() + 527) * 31);
    }

    public final String toString() {
        String str = this.a;
        int length = String.valueOf(str).length();
        String str2 = this.b;
        return ec.o(new StringBuilder(length + 5 + String.valueOf(str2).length()), "VC: ", str, "=", str2);
    }
}
