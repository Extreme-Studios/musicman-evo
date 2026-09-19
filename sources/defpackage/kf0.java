package defpackage;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.io.StringReader;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes.dex */
public final class kf0 implements nd0 {
    public pd0 b;
    public int c;
    public int d;
    public int e;
    public mf0 g;
    public od0 h;
    public je0 i;
    public sh0 j;
    public final cw1 a = new cw1(2);
    public long f = -1;

    public final void a() {
        pd0 pd0Var = this.b;
        pd0Var.getClass();
        pd0Var.s();
        this.b.v(new sd0(-9223372036854775807L, 0L));
        this.c = 6;
    }

    @Override // defpackage.nd0
    public final boolean d(od0 od0Var) throws EOFException, InterruptedIOException {
        String strM;
        fd0 fd0Var = (fd0) od0Var;
        cw1 cw1Var = this.a;
        cw1Var.y(2);
        fd0Var.B(cw1Var.a, 0, 2, false);
        if (cw1Var.L() == 65496) {
            while (true) {
                cw1Var.y(2);
                fd0Var.B(cw1Var.a, 0, 2, false);
                int iL = cw1Var.L();
                this.d = iL;
                if (iL == 65498) {
                    break;
                }
                cw1Var.y(2);
                fd0Var.u(cw1Var.a, 0, 2);
                int iL2 = cw1Var.L() - 2;
                if (iL2 < 0) {
                    break;
                }
                if (this.d != 65505) {
                    fd0Var.e(iL2, false);
                } else {
                    cw1Var.y(iL2);
                    fd0Var.B(cw1Var.a, 0, iL2, false);
                    if (Objects.equals(cw1Var.m(), "http://ns.adobe.com/xap/1.0/") && (strM = cw1Var.m()) != null) {
                        String[] strArr = rs0.n;
                        for (int i = 0; i < 4; i++) {
                            if (strM.contains(String.valueOf(strArr[i]).concat("=\"1\""))) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x020a  */
    /* JADX WARN: Code duplicated, block: B:112:0x0222  */
    /* JADX WARN: Code duplicated, block: B:115:0x0227  */
    /* JADX WARN: Code duplicated, block: B:117:0x0232  */
    /* JADX WARN: Code duplicated, block: B:123:0x0243  */
    /* JADX WARN: Code duplicated, block: B:125:0x0247  */
    /* JADX WARN: Code duplicated, block: B:170:0x0249 A[SYNTHETIC] */
    @Override // defpackage.nd0
    public final int e(od0 od0Var, rd0 rd0Var) throws no0 {
        String strM;
        long j;
        je0 je0Var;
        qk2 qk2Var;
        int i;
        int i2;
        long j2;
        long j3;
        long j4;
        long j5;
        lf0 lf0Var;
        String str;
        boolean z;
        long j6;
        long j7;
        int i3 = this.c;
        cw1 cw1Var = this.a;
        long j8 = -1;
        if (i3 == 0) {
            cw1Var.y(2);
            od0Var.x(cw1Var.a, 0, 2);
            int iL = cw1Var.L();
            this.d = iL;
            if (iL == 65498) {
                if (this.f != -1) {
                    this.c = 4;
                    return 0;
                }
                a();
                return 0;
            }
            if ((iL < 65488 || iL > 65497) && iL != 65281) {
                this.c = 1;
            }
            return 0;
        }
        if (i3 == 1) {
            cw1Var.y(2);
            od0Var.u(cw1Var.a, 0, 2);
            this.e = cw1Var.L() - 2;
            od0Var.t(2);
            this.c = 2;
            return 0;
        }
        if (i3 != 2) {
            if (i3 != 4) {
                if (i3 != 5) {
                    if (i3 == 6) {
                        return -1;
                    }
                    j7.a();
                    return 0;
                }
                if (this.i == null || od0Var != this.h) {
                    this.h = od0Var;
                    this.i = new je0(od0Var, this.f);
                }
                sh0 sh0Var = this.j;
                sh0Var.getClass();
                int iE = sh0Var.e(this.i, rd0Var);
                if (iE == 1) {
                    rd0Var.a += this.f;
                }
                return iE;
            }
            long jO = od0Var.o();
            long j9 = this.f;
            if (jO != j9) {
                rd0Var.a = j9;
                return 1;
            }
            if (!od0Var.B(cw1Var.a, 0, 1, true)) {
                a();
                return 0;
            }
            od0Var.i();
            if (this.j == null) {
                this.j = new sh0(pi0.e, 8);
            }
            je0 je0Var2 = new je0(od0Var, this.f);
            this.i = je0Var2;
            if (!this.j.d(je0Var2)) {
                a();
                return 0;
            }
            sh0 sh0Var2 = this.j;
            long j10 = this.f;
            pd0 pd0Var = this.b;
            pd0Var.getClass();
            sh0Var2.g(new je0(j10, pd0Var));
            mf0 mf0Var = this.g;
            mf0Var.getClass();
            pd0 pd0Var2 = this.b;
            pd0Var2.getClass();
            me0 me0VarZ = pd0Var2.z(1024, 4);
            uc3 uc3Var = new uc3();
            uc3Var.d("image/jpeg");
            uc3Var.j = new am0(mf0Var);
            me0VarZ.d(new de3(uc3Var));
            this.c = 5;
            return 0;
        }
        if (this.d == 65505) {
            cw1 cw1Var2 = new cw1(this.e);
            od0Var.x(cw1Var2.a, 0, this.e);
            if (this.g == null && "http://ns.adobe.com/xap/1.0/".equals(cw1Var2.m()) && (strM = cw1Var2.m()) != null) {
                long jP = od0Var.p();
                mf0 mf0Var2 = null;
                if (jP != -1) {
                    try {
                        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
                        xmlPullParserNewPullParser.setInput(new StringReader(strM));
                        xmlPullParserNewPullParser.next();
                        try {
                            if (!ss0.N(xmlPullParserNewPullParser, "x:xmpmeta")) {
                                throw no0.a(null, "Couldn't find xmp metadata");
                            }
                            tj2 tj2Var = vj2.g;
                            qk2 qk2VarJ = qk2.j;
                            long j11 = -9223372036854775807L;
                            loop0: while (true) {
                                xmlPullParserNewPullParser.next();
                                j = j8;
                                if (ss0.N(xmlPullParserNewPullParser, "rdf:Description")) {
                                    String[] strArr = rs0.n;
                                    int i4 = 0;
                                    while (true) {
                                        if (i4 < 4) {
                                            String strQ = ss0.Q(xmlPullParserNewPullParser, strArr[i4]);
                                            if (strQ == null) {
                                                i4++;
                                            } else if (Integer.parseInt(strQ) == 1) {
                                                String[] strArr2 = rs0.o;
                                                int i5 = 0;
                                                while (true) {
                                                    if (i5 < 4) {
                                                        String strQ2 = ss0.Q(xmlPullParserNewPullParser, strArr2[i5]);
                                                        if (strQ2 != null) {
                                                            long j12 = Long.parseLong(strQ2);
                                                            if (j12 != j) {
                                                                j11 = j12;
                                                                break;
                                                            }
                                                            break;
                                                        }
                                                        i5++;
                                                    }
                                                    j11 = -9223372036854775807L;
                                                    break;
                                                }
                                                String[] strArr3 = rs0.p;
                                                int i6 = 0;
                                                while (true) {
                                                    if (i6 >= 2) {
                                                        qk2VarJ = qk2.j;
                                                        break;
                                                    }
                                                    String strQ3 = ss0.Q(xmlPullParserNewPullParser, strArr3[i6]);
                                                    if (strQ3 != null) {
                                                        qk2VarJ = vj2.j(new lf0(0L, 0L, "image/jpeg"), new lf0(Long.parseLong(strQ3), 0L, "video/mp4"));
                                                        break;
                                                    }
                                                    i6++;
                                                }
                                            }
                                        }
                                        je0Var = null;
                                        break loop0;
                                    }
                                }
                                if (ss0.N(xmlPullParserNewPullParser, "Container:Directory")) {
                                    qk2VarJ = rs0.y(xmlPullParserNewPullParser, "Container", "Item");
                                } else if (ss0.N(xmlPullParserNewPullParser, "GContainer:Directory")) {
                                    qk2VarJ = rs0.y(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
                                }
                                long j13 = j11;
                                if (ss0.E(xmlPullParserNewPullParser, "x:xmpmeta")) {
                                    if (!qk2VarJ.isEmpty()) {
                                        je0Var = new je0(j13, qk2VarJ);
                                        break;
                                    }
                                    je0Var = null;
                                    break loop0;
                                }
                                j11 = j13;
                                j8 = j;
                            }
                            if (je0Var != null && (i = (qk2Var = (qk2) je0Var.g).i) >= 2) {
                                j2 = j;
                                j3 = j2;
                                j4 = j3;
                                j5 = j4;
                                for (i2 = i - 1; i2 >= 0; i2--) {
                                    lf0Var = (lf0) qk2Var.get(i2);
                                    str = lf0Var.a;
                                    if (!str.equals("video/mp4") || str.equals("video/quicktime")) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (i2 == 0) {
                                        jP -= lf0Var.c;
                                        j6 = 0;
                                    } else {
                                        j6 = jP - lf0Var.b;
                                    }
                                    long j14 = j6;
                                    j7 = jP;
                                    jP = j14;
                                    if (z && jP != j7) {
                                        j5 = j7 - jP;
                                        j4 = jP;
                                    }
                                    if (i2 == 0) {
                                        j3 = j7;
                                    }
                                    if (i2 == 0) {
                                        j2 = jP;
                                    }
                                }
                                if (j4 != j && j5 != j && j2 != j && j3 != j) {
                                    mf0Var2 = new mf0(j2, j3, je0Var.f, j4, j5);
                                }
                            }
                        } catch (NumberFormatException | no0 | XmlPullParserException unused) {
                            s90.Q("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
                        }
                    } catch (NumberFormatException | no0 | XmlPullParserException unused2) {
                        j = j8;
                    }
                    s90.Q("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
                    je0Var = null;
                    if (je0Var != null) {
                        j2 = j;
                        j3 = j2;
                        j4 = j3;
                        j5 = j4;
                        while (i2 >= 0) {
                            lf0Var = (lf0) qk2Var.get(i2);
                            str = lf0Var.a;
                            if (str.equals("video/mp4")) {
                                z = true;
                            } else {
                                z = true;
                            }
                            if (i2 == 0) {
                                jP -= lf0Var.c;
                                j6 = 0;
                            } else {
                                j6 = jP - lf0Var.b;
                            }
                            long j15 = j6;
                            j7 = jP;
                            jP = j15;
                            if (z) {
                                j5 = j7 - jP;
                                j4 = jP;
                            }
                            if (i2 == 0) {
                                j3 = j7;
                            }
                            if (i2 == 0) {
                                j2 = jP;
                            }
                        }
                        if (j4 != j) {
                            mf0Var2 = new mf0(j2, j3, je0Var.f, j4, j5);
                        }
                    }
                }
                this.g = mf0Var2;
                if (mf0Var2 != null) {
                    this.f = mf0Var2.d;
                }
            }
        } else {
            od0Var.t(this.e);
        }
        this.c = 0;
        return 0;
    }

    @Override // defpackage.nd0
    public final void f(long j, long j2) {
        if (j == 0) {
            this.c = 0;
            this.j = null;
        } else if (this.c == 5) {
            sh0 sh0Var = this.j;
            sh0Var.getClass();
            sh0Var.f(j, j2);
        }
    }

    @Override // defpackage.nd0
    public final void g(pd0 pd0Var) {
        this.b = pd0Var;
    }
}
