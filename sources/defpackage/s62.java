package defpackage;

import android.text.TextUtils;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s62 implements gm1, hn2, jd2, zz2, ii2 {
    public Object f;

    public /* synthetic */ s62(Object obj) {
        this.f = obj;
    }

    @Override // defpackage.ii2
    public /* synthetic */ Object a() {
        return (wc1) this.f;
    }

    @Override // defpackage.gm1
    /* JADX INFO: renamed from: b */
    public void mo4b(Object obj) {
        p62 p62Var = (p62) this.f;
        ((v62) obj).w(p62Var.g, (r62) p62Var.f);
    }

    public void c(lh2 lh2Var) {
        ba0 ba0Var = (ba0) this.f;
        ba0Var.getClass();
        String str = lh2Var.b;
        int i = lh2Var.a;
        if (!TextUtils.isEmpty(str)) {
            if (!((Boolean) tu0.e.c.a(lx0.mc)).booleanValue()) {
                ba0Var.g = str;
            }
        }
        switch (i) {
            case 8152:
                ba0Var.e("onLMDOverlayOpened", new HashMap());
                break;
            case 8153:
                ba0Var.e("onLMDOverlayClicked", new HashMap());
                break;
            case 8155:
                ba0Var.e("onLMDOverlayClose", new HashMap());
                break;
            case 8157:
                ba0Var.g = null;
                ba0Var.h = null;
                ba0Var.f = false;
                break;
            case 8160:
            case 8161:
            case 8162:
                HashMap map = new HashMap();
                map.put("error", String.valueOf(i));
                ba0Var.e("onLMDOverlayFailedToOpen", map);
                break;
        }
    }

    @Override // defpackage.jd2
    public Object d(FileInputStream fileInputStream) {
        try {
            return ll2.a(fileInputStream);
        } catch (IOException e) {
            throw new id2("Cannot read bytes.", e);
        }
    }

    @Override // defpackage.hn2
    /* JADX INFO: renamed from: e */
    public void mo5e(Object obj) {
        k82 k82Var = (k82) this.f;
        synchronized (k82Var) {
            try {
                k82Var.l.set(false);
                if (obj != null) {
                    l82 l82Var = k82Var.j;
                    l82Var.e = l82Var.a;
                    l82Var.c = 0L;
                    k82Var.o.set(true);
                    k82Var.a(obj);
                }
                k82Var.b(obj == null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.jd2
    public /* synthetic */ void f(Object obj, FileOutputStream fileOutputStream) throws IOException {
        fileOutputStream.write((byte[]) obj);
    }

    public void g(Object obj, Object... objArr) {
        List listAsList = Arrays.asList(objArr);
        if (obj == null) {
            Iterator it = listAsList.iterator();
            StringBuilder sb = new StringBuilder("[");
            boolean z = true;
            while (it.hasNext()) {
                if (!z) {
                    sb.append(", ");
                }
                sb.append(it.next());
                z = false;
            }
            sb.append(']');
            throw new NullPointerException("null key in entry: null=".concat(sb.toString()));
        }
        Iterator it2 = listAsList.iterator();
        if (it2.hasNext()) {
            jj2 jj2Var = (jj2) this.f;
            if (jj2Var == null) {
                jj2Var = new jj2();
                this.f = jj2Var;
            }
            pj2 pj2VarL = (pj2) jj2Var.get(obj);
            if (pj2VarL == null) {
                pj2VarL = bk2.l(listAsList instanceof Set ? Math.max(4, ((Set) listAsList).size()) : 4);
                jj2 jj2Var2 = (jj2) this.f;
                if (jj2Var2 == null) {
                    jj2Var2 = new jj2();
                    this.f = jj2Var2;
                }
                jj2Var2.put(obj, pj2VarL);
            }
            while (it2.hasNext()) {
                Object next = it2.next();
                w40.b0(obj, next);
                pj2VarL.c(next);
            }
        }
    }

    @Override // defpackage.jd2
    public /* synthetic */ Object h() {
        return (byte[]) this.f;
    }

    @Override // defpackage.zz2
    public Object l(String str) {
        return ((c03) this.f).a(str, null);
    }

    @Override // defpackage.hn2
    public void w(Throwable th) {
        k82 k82Var = (k82) this.f;
        synchronized (k82Var) {
            try {
                k82Var.l.set(false);
                if ((th instanceof g82) && ((g82) th).f == 0) {
                    throw null;
                }
                k82Var.b(true);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
