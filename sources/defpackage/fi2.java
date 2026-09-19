package defpackage;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fi2 implements hi2, do2, ps2, qr2, ks2 {
    public final /* synthetic */ int f;
    public static final /* synthetic */ fi2 g = new fi2(1);
    public static final /* synthetic */ fi2 h = new fi2(2);
    public static final /* synthetic */ fi2 i = new fi2(3);
    public static final /* synthetic */ fi2 j = new fi2(4);
    public static final /* synthetic */ fi2 k = new fi2(5);
    public static final /* synthetic */ fi2 l = new fi2(6);
    public static final /* synthetic */ fi2 m = new fi2(7);
    public static final /* synthetic */ fi2 n = new fi2(8);
    public static final /* synthetic */ fi2 o = new fi2(9);
    public static final /* synthetic */ fi2 p = new fi2(10);
    public static final /* synthetic */ fi2 q = new fi2(11);
    public static final /* synthetic */ fi2 r = new fi2(12);
    public static final /* synthetic */ fi2 s = new fi2(13);
    public static final /* synthetic */ fi2 t = new fi2(14);
    public static final /* synthetic */ fi2 u = new fi2(15);
    public static final /* synthetic */ fi2 v = new fi2(16);
    public static final /* synthetic */ fi2 w = new fi2(17);
    public static final /* synthetic */ fi2 x = new fi2(18);
    public static final /* synthetic */ fi2 y = new fi2(19);
    public static final /* synthetic */ fi2 z = new fi2(20);
    public static final /* synthetic */ fi2 A = new fi2(21);
    public static final /* synthetic */ fi2 B = new fi2(22);
    public static final /* synthetic */ fi2 C = new fi2(23);
    public static final /* synthetic */ fi2 D = new fi2(24);
    public static final /* synthetic */ fi2 E = new fi2(25);
    public static final /* synthetic */ fi2 F = new fi2(26);
    public static final /* synthetic */ fi2 G = new fi2(27);
    public static final /* synthetic */ fi2 H = new fi2(28);
    public static final /* synthetic */ fi2 I = new fi2(29);

    public /* synthetic */ fi2(int i2) {
        this.f = i2;
    }

    @Override // defpackage.ps2
    public ts2 b(a23 a23Var) throws GeneralSecurityException {
        int i2 = this.f;
        yw2 yw2Var = yw2.TINK;
        yw2 yw2Var2 = yw2.RAW;
        switch (i2) {
            case 10:
                sp2 sp2Var = (sp2) a23Var;
                js2 js2Var = up2.a;
                qw2 qw2VarC = rw2.C();
                sw2 sw2VarB = tw2.B();
                String str = sp2Var.J.a;
                sw2VarB.b();
                ((tw2) sw2VarB.g).D(str);
                tw2 tw2Var = (tw2) sw2VarB.c();
                qw2VarC.b();
                ((rw2) qw2VarC.g).E(tw2Var);
                l13 l13VarA = ((rw2) qw2VarC.c()).a();
                wo2 wo2Var = sp2Var.J.b;
                if (wo2.m != wo2Var) {
                    if (wo2.n != wo2Var) {
                        throw new GeneralSecurityException("Unable to serialize variant: ".concat(wo2Var.g));
                    }
                    yw2Var = yw2Var2;
                }
                return ts2.j("type.googleapis.com/google.crypto.tink.KmsAeadKey", l13VarA, 5, yw2Var, sp2Var.L);
            case 12:
                vp2 vp2Var = (vp2) a23Var;
                js2 js2Var2 = xp2.a;
                uw2 uw2VarC = vw2.C();
                xw2 xw2VarA = xp2.a(vp2Var.J);
                uw2VarC.b();
                ((vw2) uw2VarC.g).E(xw2VarA);
                l13 l13VarA2 = ((vw2) uw2VarC.c()).a();
                bp2 bp2Var = vp2Var.J.a;
                if (bp2.k != bp2Var) {
                    if (bp2.l != bp2Var) {
                        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(bp2Var)));
                    }
                    yw2Var = yw2Var2;
                }
                return ts2.j("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", l13VarA2, 5, yw2Var, vp2Var.L);
            case 15:
                so2 so2Var = (so2) a23Var;
                js2 js2Var3 = kq2.a;
                iu2 iu2VarD = ju2.D();
                mu2 mu2VarC = nu2.C();
                qu2 qu2VarA = ru2.A();
                int i3 = so2Var.J.c;
                qu2VarA.b();
                ((ru2) qu2VarA.g).C(i3);
                ru2 ru2Var = (ru2) qu2VarA.c();
                mu2VarC.b();
                ((nu2) mu2VarC.g).E(ru2Var);
                byte[] bArrB = ((j03) so2Var.K.g).b();
                l13 l13VarN = n13.n(bArrB, 0, bArrB.length);
                mu2VarC.b();
                ((nu2) mu2VarC.g).F(l13VarN);
                nu2 nu2Var = (nu2) mu2VarC.c();
                iu2VarD.b();
                ((ju2) iu2VarD.g).F(nu2Var);
                xv2 xv2VarD = yv2.D();
                yo2 yo2Var = so2Var.J;
                cw2 cw2VarD = kq2.d(yo2Var);
                xv2VarD.b();
                ((yv2) xv2VarD.g).G(cw2VarD);
                byte[] bArrB2 = ((j03) so2Var.L.g).b();
                l13 l13VarN2 = n13.n(bArrB2, 0, bArrB2.length);
                xv2VarD.b();
                ((yv2) xv2VarD.g).H(l13VarN2);
                yv2 yv2Var = (yv2) xv2VarD.c();
                iu2VarD.b();
                ((ju2) iu2VarD.g).G(yv2Var);
                return ts2.j("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", ((ju2) iu2VarD.c()).a(), 2, kq2.a(yo2Var.e), so2Var.N);
            case 17:
                zo2 zo2Var = (zo2) a23Var;
                js2 js2Var4 = mq2.a;
                su2 su2VarD = tu2.D();
                cp2 cp2Var = zo2Var.J;
                wu2 wu2VarA = xu2.A();
                int i4 = cp2Var.b;
                wu2VarA.b();
                ((xu2) wu2VarA.g).C(i4);
                xu2 xu2Var = (xu2) wu2VarA.c();
                su2VarD.b();
                ((tu2) su2VarD.g).F(xu2Var);
                byte[] bArrB3 = ((j03) zo2Var.K.g).b();
                l13 l13VarN3 = n13.n(bArrB3, 0, bArrB3.length);
                su2VarD.b();
                ((tu2) su2VarD.g).G(l13VarN3);
                return ts2.j("type.googleapis.com/google.crypto.tink.AesEaxKey", ((tu2) su2VarD.c()).a(), 2, mq2.a(zo2Var.J.c), zo2Var.M);
            case 19:
                dp2 dp2Var = (dp2) a23Var;
                js2 js2Var5 = oq2.a;
                yu2 yu2VarC = zu2.C();
                byte[] bArrB4 = ((j03) dp2Var.K.g).b();
                l13 l13VarN4 = n13.n(bArrB4, 0, bArrB4.length);
                yu2VarC.b();
                ((zu2) yu2VarC.g).E(l13VarN4);
                return ts2.j("type.googleapis.com/google.crypto.tink.AesGcmKey", ((zu2) yu2VarC.c()).a(), 2, oq2.a(dp2Var.J.b), dp2Var.M);
            case zw0.zzm /* 21 */:
                ip2 ip2Var = (ip2) a23Var;
                js2 js2Var6 = qq2.a;
                cv2 cv2VarC = dv2.C();
                byte[] bArrB5 = ((j03) ip2Var.K.g).b();
                l13 l13VarN5 = n13.n(bArrB5, 0, bArrB5.length);
                cv2VarC.b();
                ((dv2) cv2VarC.g).E(l13VarN5);
                return ts2.j("type.googleapis.com/google.crypto.tink.AesGcmSivKey", ((dv2) cv2VarC.c()).a(), 2, qq2.a(ip2Var.J.b), ip2Var.M);
            case 23:
                mp2 mp2Var = (mp2) a23Var;
                js2 js2Var7 = sq2.a;
                gv2 gv2VarC = hv2.C();
                byte[] bArrB6 = ((j03) mp2Var.K.g).b();
                l13 l13VarN6 = n13.n(bArrB6, 0, bArrB6.length);
                gv2VarC.b();
                ((hv2) gv2VarC.g).E(l13VarN6);
                return ts2.j("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", ((hv2) gv2VarC.c()).a(), 2, sq2.a(mp2Var.J.a), mp2Var.M);
            case 25:
                eq2 eq2Var = (eq2) a23Var;
                js2 js2Var8 = yq2.a;
                qx2 qx2VarD = rx2.D();
                byte[] bArrB7 = ((j03) eq2Var.K.g).b();
                l13 l13VarN7 = n13.n(bArrB7, 0, bArrB7.length);
                qx2VarD.b();
                ((rx2) qx2VarD.g).F(l13VarN7);
                ux2 ux2VarA = vx2.A();
                gq2 gq2Var = eq2Var.J;
                int i5 = gq2Var.b;
                ux2VarA.b();
                ((vx2) ux2VarA.g).C(i5);
                vx2 vx2Var = (vx2) ux2VarA.c();
                qx2VarD.b();
                ((rx2) qx2VarD.g).E(vx2Var);
                return ts2.j("type.googleapis.com/google.crypto.tink.XAesGcmKey", ((rx2) qx2VarD.c()).a(), 2, yq2.a(gq2Var.a), eq2Var.M);
            case 27:
                hq2 hq2Var = (hq2) a23Var;
                js2 js2Var9 = zq2.a;
                wx2 wx2VarC = xx2.C();
                byte[] bArrB8 = ((j03) hq2Var.K.g).b();
                l13 l13VarN8 = n13.n(bArrB8, 0, bArrB8.length);
                wx2VarC.b();
                ((xx2) wx2VarC.g).E(l13VarN8);
                return ts2.j("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", ((xx2) wx2VarC.c()).a(), 2, zq2.a(hq2Var.J.a), hq2Var.M);
            default:
                ts2 ts2Var = ((vr2) a23Var).J;
                int i6 = tr2.b[ec.z(ts2Var.f)];
                return ts2Var;
        }
    }

    @Override // defpackage.ks2
    public us2 d(ho2 ho2Var) throws GeneralSecurityException {
        int i2 = this.f;
        yw2 yw2Var = yw2.TINK;
        yw2 yw2Var2 = yw2.RAW;
        switch (i2) {
            case 11:
                tp2 tp2Var = (tp2) ho2Var;
                js2 js2Var = up2.a;
                fw2 fw2VarD = gw2.D();
                fw2VarD.f("type.googleapis.com/google.crypto.tink.KmsAeadKey");
                sw2 sw2VarB = tw2.B();
                String str = tp2Var.a;
                sw2VarB.b();
                ((tw2) sw2VarB.g).D(str);
                fw2VarD.g(((tw2) sw2VarB.c()).a());
                wo2 wo2Var = tp2Var.b;
                if (wo2.m != wo2Var) {
                    if (wo2.n != wo2Var) {
                        throw new GeneralSecurityException("Unable to serialize variant: ".concat(wo2Var.g));
                    }
                    yw2Var = yw2Var2;
                }
                fw2VarD.h(yw2Var);
                return us2.o((gw2) fw2VarD.c());
            case 13:
                wp2 wp2Var = (wp2) ho2Var;
                js2 js2Var2 = xp2.a;
                fw2 fw2VarD2 = gw2.D();
                fw2VarD2.f("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
                fw2VarD2.g(xp2.a(wp2Var).a());
                bp2 bp2Var = wp2Var.a;
                if (bp2.k != bp2Var) {
                    if (bp2.l != bp2Var) {
                        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(bp2Var)));
                    }
                    yw2Var = yw2Var2;
                }
                fw2VarD2.h(yw2Var);
                return us2.o((gw2) fw2VarD2.c());
            case 16:
                yo2 yo2Var = (yo2) ho2Var;
                js2 js2Var3 = kq2.a;
                fw2 fw2VarD3 = gw2.D();
                fw2VarD3.f("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
                ku2 ku2VarC = lu2.C();
                ou2 ou2VarB = pu2.B();
                qu2 qu2VarA = ru2.A();
                int i3 = yo2Var.c;
                qu2VarA.b();
                ((ru2) qu2VarA.g).C(i3);
                ru2 ru2Var = (ru2) qu2VarA.c();
                ou2VarB.b();
                ((pu2) ou2VarB.g).D(ru2Var);
                int i4 = yo2Var.a;
                ou2VarB.b();
                ((pu2) ou2VarB.g).E(i4);
                pu2 pu2Var = (pu2) ou2VarB.c();
                ku2VarC.b();
                ((lu2) ku2VarC.g).D(pu2Var);
                zv2 zv2VarD = aw2.D();
                cw2 cw2VarD = kq2.d(yo2Var);
                zv2VarD.b();
                ((aw2) zv2VarD.g).F(cw2VarD);
                int i5 = yo2Var.b;
                zv2VarD.b();
                ((aw2) zv2VarD.g).G(i5);
                aw2 aw2Var = (aw2) zv2VarD.c();
                ku2VarC.b();
                ((lu2) ku2VarC.g).E(aw2Var);
                fw2VarD3.g(((lu2) ku2VarC.c()).a());
                fw2VarD3.h(kq2.a(yo2Var.e));
                return us2.o((gw2) fw2VarD3.c());
            case 18:
                cp2 cp2Var = (cp2) ho2Var;
                js2 js2Var4 = mq2.a;
                fw2 fw2VarD4 = gw2.D();
                fw2VarD4.f("type.googleapis.com/google.crypto.tink.AesEaxKey");
                uu2 uu2VarC = vu2.C();
                wu2 wu2VarA = xu2.A();
                int i6 = cp2Var.b;
                wu2VarA.b();
                ((xu2) wu2VarA.g).C(i6);
                xu2 xu2Var = (xu2) wu2VarA.c();
                uu2VarC.b();
                ((vu2) uu2VarC.g).D(xu2Var);
                int i7 = cp2Var.a;
                uu2VarC.b();
                ((vu2) uu2VarC.g).E(i7);
                fw2VarD4.g(((vu2) uu2VarC.c()).a());
                fw2VarD4.h(mq2.a(cp2Var.c));
                return us2.o((gw2) fw2VarD4.c());
            case 20:
                hp2 hp2Var = (hp2) ho2Var;
                js2 js2Var5 = oq2.a;
                fw2 fw2VarD5 = gw2.D();
                fw2VarD5.f("type.googleapis.com/google.crypto.tink.AesGcmKey");
                av2 av2VarC = bv2.C();
                int i8 = hp2Var.a;
                av2VarC.b();
                ((bv2) av2VarC.g).D(i8);
                fw2VarD5.g(((bv2) av2VarC.c()).a());
                fw2VarD5.h(oq2.a(hp2Var.b));
                return us2.o((gw2) fw2VarD5.c());
            case 22:
                lp2 lp2Var = (lp2) ho2Var;
                js2 js2Var6 = qq2.a;
                fw2 fw2VarD6 = gw2.D();
                fw2VarD6.f("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
                ev2 ev2VarC = fv2.C();
                int i9 = lp2Var.a;
                ev2VarC.b();
                ((fv2) ev2VarC.g).D(i9);
                fw2VarD6.g(((fv2) ev2VarC.c()).a());
                fw2VarD6.h(qq2.a(lp2Var.b));
                return us2.o((gw2) fw2VarD6.c());
            case 24:
                js2 js2Var7 = sq2.a;
                fw2 fw2VarD7 = gw2.D();
                fw2VarD7.f("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
                fw2VarD7.g(iv2.A().a());
                fw2VarD7.h(sq2.a(((op2) ho2Var).a));
                return us2.o((gw2) fw2VarD7.c());
            case 26:
                gq2 gq2Var = (gq2) ho2Var;
                js2 js2Var8 = yq2.a;
                fw2 fw2VarD8 = gw2.D();
                fw2VarD8.f("type.googleapis.com/google.crypto.tink.XAesGcmKey");
                sx2 sx2VarC = tx2.C();
                ux2 ux2VarA = vx2.A();
                int i10 = gq2Var.b;
                ux2VarA.b();
                ((vx2) ux2VarA.g).C(i10);
                vx2 vx2Var = (vx2) ux2VarA.c();
                sx2VarC.b();
                ((tx2) sx2VarC.g).D(vx2Var);
                fw2VarD8.g(((tx2) sx2VarC.c()).a());
                fw2VarD8.h(yq2.a(gq2Var.a));
                return us2.o((gw2) fw2VarD8.c());
            default:
                js2 js2Var9 = zq2.a;
                fw2 fw2VarD9 = gw2.D();
                fw2VarD9.f("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
                fw2VarD9.g(yx2.B().a());
                fw2VarD9.h(zq2.a(((jq2) ho2Var).a));
                return us2.o((gw2) fw2VarD9.c());
        }
    }

    @Override // defpackage.hi2
    public Iterator f(bz1 bz1Var, CharSequence charSequence) {
        return new ei2(charSequence);
    }

    @Override // defpackage.do2
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void mo7a() {
    }

    @Override // defpackage.ps2
    public Object b(a23 a23Var) throws GeneralSecurityException {
        switch (this.f) {
            case 2:
                hq2 hq2Var = (hq2) a23Var;
                ir2 ir2Var = mo2.a;
                if (((Cipher) rq2.f.get()) != null) {
                    return new wq2(1, ((j03) hq2Var.K.g).b(), hq2Var.L.b());
                }
                return new wq2(4, ((j03) hq2Var.K.g).b(), hq2Var.L.b());
            case 3:
                return uz2.b((zo2) a23Var);
            case 4:
                return ar2.b((ip2) a23Var);
            case 5:
                eq2 eq2Var = (eq2) a23Var;
                eq2Var.getClass();
                return new xq2(((j03) eq2Var.K.g).b(), eq2Var.L, eq2Var.J.b);
            case 6:
                return yz2.b((so2) a23Var);
            case 7:
                dp2 dp2Var = (dp2) a23Var;
                dp2Var.getClass();
                return new wq2(((j03) dp2Var.K.g).b(), dp2Var.L);
            case 8:
                mp2 mp2Var = (mp2) a23Var;
                os2 os2Var = np2.a;
                if (rq2.f.get() != null) {
                    return new rq2(((j03) mp2Var.K.g).b(), mp2Var.L.b());
                }
                return new wq2(3, ((j03) mp2Var.K.g).b(), mp2Var.L.b());
            case 9:
                sr2 sr2Var = rp2.a;
                fo2.a(((vp2) a23Var).J.b);
                throw null;
            default:
                hq2 hq2Var2 = (hq2) a23Var;
                os2 os2Var2 = iq2.a;
                if (((Cipher) rq2.f.get()) != null) {
                    return new wq2(1, ((j03) hq2Var2.K.g).b(), hq2Var2.L.b());
                }
                return new wq2(4, ((j03) hq2Var2.K.g).b(), hq2Var2.L.b());
        }
    }
}
