package defpackage;

import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ch0 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ch0(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.d = obj2;
        this.c = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.concurrent.Callable
    public final Object call() throws Exception {
        k52 k52Var;
        Bundle bundle;
        int i = this.a;
        int i2 = 0;
        Object obj = this.c;
        Object obj2 = this.d;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ep0 ep0Var = (ep0) obj3;
                List<Uri> list = (List) obj2;
                rm rmVar = (rm) obj;
                vq0 vq0Var = ep0Var.i.b;
                String strI = vq0Var != null ? vq0Var.i(ep0Var.h, (View) ju.Z0(rmVar), null) : "";
                if (TextUtils.isEmpty(strI)) {
                    throw new Exception("Failed to get view signals.");
                }
                ArrayList arrayList = new ArrayList();
                for (Uri uri : list) {
                    if (ep0.F3(uri, ep0Var.E, ep0Var.F)) {
                        arrayList.add(ep0.I3(uri, "ms", strI));
                    } else {
                        jn.T("Not a Google URL: ".concat(String.valueOf(uri)));
                        arrayList.add(uri);
                    }
                }
                if (arrayList.isEmpty()) {
                    throw new Exception("Empty impression URLs result.");
                }
                return arrayList;
            case 1:
                ep0 ep0Var2 = (ep0) obj3;
                Uri uriB = (Uri) obj2;
                rm rmVar2 = (rm) obj;
                try {
                    uriB = (!((Boolean) tu0.e.c.a(lx0.Mc)).booleanValue() || (k52Var = ep0Var2.j) == null) ? ep0Var2.i.b(uriB, ep0Var2.h, (View) ju.Z0(rmVar2), null) : k52Var.a(uriB, ep0Var2.h, (View) ju.Z0(rmVar2), null);
                    break;
                } catch (ar0 e) {
                    jn.V("", e);
                }
                if (uriB.getQueryParameter("ms") != null) {
                    return uriB;
                }
                throw new Exception("Failed to append spam signals to click url.");
            case 2:
                sj1 sj1Var = (sj1) obj3;
                Bundle bundle2 = (Bundle) obj;
                rj1 rj1Var = (rj1) ((p62) obj2).h.get();
                Bundle bundle3 = rj1Var.a;
                String str = (String) ((hp) sj1Var.g.c()).get();
                if (((Boolean) tu0.e.c.a(lx0.r7)).booleanValue() && sj1Var.j.s()) {
                    i2 = 1;
                }
                String str2 = sj1Var.h;
                PackageInfo packageInfo = sj1Var.f;
                return new r71(bundle3, sj1Var.b, sj1Var.c, sj1Var.d, sj1Var.e, packageInfo, str, str2, null, null, i2, sj1Var.k.a(), bundle2, rj1Var.b, sj1Var.l);
            case 3:
                s71 s71Var = (s71) ((p62) obj3).h.get();
                if (((Boolean) tu0.e.c.a(lx0.m2)).booleanValue() && (bundle = ((r71) obj2).r) != null) {
                    bundle.putLong("get-ad-dictionary-sdkcore-start", s71Var.j);
                    bundle.putLong("get-ad-dictionary-sdkcore-end", s71Var.k);
                }
                return new sv1((JSONObject) ((p62) obj).h.get(), s71Var);
            case 4:
                j12 j12Var = e22.k;
                JSONArray jSONArray = new JSONArray();
                ArrayList arrayList2 = (ArrayList) obj3;
                int size = arrayList2.size();
                while (i2 < size) {
                    Object obj4 = arrayList2.get(i2);
                    i2++;
                    hp hpVar = (hp) obj4;
                    if (((JSONObject) hpVar.get()) != null) {
                        jSONArray.put(hpVar.get());
                    }
                }
                String str3 = (String) obj;
                Bundle bundle4 = (Bundle) obj2;
                if (jSONArray.length() != 0) {
                    return new j12(jSONArray.toString(), bundle4, str3);
                }
                if (((Boolean) tu0.e.c.a(lx0.C4)).booleanValue()) {
                    return new j12(new JSONArray().toString(), bundle4, str3);
                }
                return null;
            default:
                s70.h(((x93) obj3).c, (q2) obj2, (ga3) obj);
                return Boolean.TRUE;
        }
    }
}
