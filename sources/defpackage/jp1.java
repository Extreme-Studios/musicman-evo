package defpackage;

import android.text.TextUtils;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class jp1 {
    public final jr1 a;
    public final uq1 b;
    public final kh1 c;
    public final bo1 d;

    public jp1(jr1 jr1Var, uq1 uq1Var, kh1 kh1Var, bo1 bo1Var) {
        this.a = jr1Var;
        this.b = uq1Var;
        this.c = kh1Var;
        this.d = bo1Var;
    }

    public final View a() {
        md1 md1VarA = this.a.a(kb3.a(), null, null);
        md1VarA.p0().setVisibility(8);
        final int i = 4;
        md1VarA.t0("/sendMessageToSdk", new v11(this) { // from class: gp1
            public final /* synthetic */ jp1 g;

            {
                this.g = this;
            }

            @Override // defpackage.v11
            public final void f(Object obj, Map map) {
                int i2 = i;
                jp1 jp1Var = this.g;
                switch (i2) {
                    case 0:
                        jp1Var.d.C();
                        break;
                    case 1:
                        md1 md1Var = (md1) obj;
                        md1Var.e0().l = new vg2(jp1Var, 14, map);
                        String str = (String) map.get("overlayHtml");
                        String str2 = (String) map.get("baseUrl");
                        if (!TextUtils.isEmpty(str2)) {
                            md1Var.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                        } else {
                            md1Var.loadData(str, "text/html", "UTF-8");
                        }
                        break;
                    case 2:
                        jn.R("Showing native ads overlay.");
                        ((md1) obj).p0().setVisibility(0);
                        jp1Var.c.k = true;
                        break;
                    case 3:
                        jn.R("Hiding native ads overlay.");
                        ((md1) obj).p0().setVisibility(8);
                        jp1Var.c.k = false;
                        break;
                    default:
                        jp1Var.b.d(map);
                        break;
                }
            }
        });
        final int i2 = 0;
        md1VarA.t0("/adMuted", new v11(this) { // from class: gp1
            public final /* synthetic */ jp1 g;

            {
                this.g = this;
            }

            @Override // defpackage.v11
            public final void f(Object obj, Map map) {
                int i3 = i2;
                jp1 jp1Var = this.g;
                switch (i3) {
                    case 0:
                        jp1Var.d.C();
                        break;
                    case 1:
                        md1 md1Var = (md1) obj;
                        md1Var.e0().l = new vg2(jp1Var, 14, map);
                        String str = (String) map.get("overlayHtml");
                        String str2 = (String) map.get("baseUrl");
                        if (!TextUtils.isEmpty(str2)) {
                            md1Var.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                        } else {
                            md1Var.loadData(str, "text/html", "UTF-8");
                        }
                        break;
                    case 2:
                        jn.R("Showing native ads overlay.");
                        ((md1) obj).p0().setVisibility(0);
                        jp1Var.c.k = true;
                        break;
                    case 3:
                        jn.R("Hiding native ads overlay.");
                        ((md1) obj).p0().setVisibility(8);
                        jp1Var.c.k = false;
                        break;
                    default:
                        jp1Var.b.d(map);
                        break;
                }
            }
        });
        WeakReference weakReference = new WeakReference(md1VarA);
        final int i3 = 1;
        v11 v11Var = new v11(this) { // from class: gp1
            public final /* synthetic */ jp1 g;

            {
                this.g = this;
            }

            @Override // defpackage.v11
            public final void f(Object obj, Map map) {
                int i4 = i3;
                jp1 jp1Var = this.g;
                switch (i4) {
                    case 0:
                        jp1Var.d.C();
                        break;
                    case 1:
                        md1 md1Var = (md1) obj;
                        md1Var.e0().l = new vg2(jp1Var, 14, map);
                        String str = (String) map.get("overlayHtml");
                        String str2 = (String) map.get("baseUrl");
                        if (!TextUtils.isEmpty(str2)) {
                            md1Var.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                        } else {
                            md1Var.loadData(str, "text/html", "UTF-8");
                        }
                        break;
                    case 2:
                        jn.R("Showing native ads overlay.");
                        ((md1) obj).p0().setVisibility(0);
                        jp1Var.c.k = true;
                        break;
                    case 3:
                        jn.R("Hiding native ads overlay.");
                        ((md1) obj).p0().setVisibility(8);
                        jp1Var.c.k = false;
                        break;
                    default:
                        jp1Var.b.d(map);
                        break;
                }
            }
        };
        uq1 uq1Var = this.b;
        uq1Var.b("/loadHtml", new ao1(uq1Var, weakReference, "/loadHtml", v11Var));
        final int i4 = 2;
        uq1Var.b("/showOverlay", new ao1(uq1Var, new WeakReference(md1VarA), "/showOverlay", new v11(this) { // from class: gp1
            public final /* synthetic */ jp1 g;

            {
                this.g = this;
            }

            @Override // defpackage.v11
            public final void f(Object obj, Map map) {
                int i5 = i4;
                jp1 jp1Var = this.g;
                switch (i5) {
                    case 0:
                        jp1Var.d.C();
                        break;
                    case 1:
                        md1 md1Var = (md1) obj;
                        md1Var.e0().l = new vg2(jp1Var, 14, map);
                        String str = (String) map.get("overlayHtml");
                        String str2 = (String) map.get("baseUrl");
                        if (!TextUtils.isEmpty(str2)) {
                            md1Var.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                        } else {
                            md1Var.loadData(str, "text/html", "UTF-8");
                        }
                        break;
                    case 2:
                        jn.R("Showing native ads overlay.");
                        ((md1) obj).p0().setVisibility(0);
                        jp1Var.c.k = true;
                        break;
                    case 3:
                        jn.R("Hiding native ads overlay.");
                        ((md1) obj).p0().setVisibility(8);
                        jp1Var.c.k = false;
                        break;
                    default:
                        jp1Var.b.d(map);
                        break;
                }
            }
        }));
        final int i5 = 3;
        uq1Var.b("/hideOverlay", new ao1(uq1Var, new WeakReference(md1VarA), "/hideOverlay", new v11(this) { // from class: gp1
            public final /* synthetic */ jp1 g;

            {
                this.g = this;
            }

            @Override // defpackage.v11
            public final void f(Object obj, Map map) {
                int i6 = i5;
                jp1 jp1Var = this.g;
                switch (i6) {
                    case 0:
                        jp1Var.d.C();
                        break;
                    case 1:
                        md1 md1Var = (md1) obj;
                        md1Var.e0().l = new vg2(jp1Var, 14, map);
                        String str = (String) map.get("overlayHtml");
                        String str2 = (String) map.get("baseUrl");
                        if (!TextUtils.isEmpty(str2)) {
                            md1Var.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                        } else {
                            md1Var.loadData(str, "text/html", "UTF-8");
                        }
                        break;
                    case 2:
                        jn.R("Showing native ads overlay.");
                        ((md1) obj).p0().setVisibility(0);
                        jp1Var.c.k = true;
                        break;
                    case 3:
                        jn.R("Hiding native ads overlay.");
                        ((md1) obj).p0().setVisibility(8);
                        jp1Var.c.k = false;
                        break;
                    default:
                        jp1Var.b.d(map);
                        break;
                }
            }
        }));
        return md1VarA.p0();
    }
}
