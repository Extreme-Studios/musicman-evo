package defpackage;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class ca2 extends aa2 {
    public final HashSet c;
    public final JSONObject d;
    public final long e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ca2(us2 us2Var, HashSet hashSet, JSONObject jSONObject, long j, int i) {
        super(us2Var);
        this.f = i;
        this.c = new HashSet(hashSet);
        this.d = jSONObject;
        this.e = j;
    }

    @Override // defpackage.aa2
    /* JADX INFO: renamed from: a */
    public final void onPostExecute(String str) {
        i92 i92Var;
        switch (this.f) {
            case 0:
                b(str);
                super.onPostExecute(str);
                break;
            default:
                if (!TextUtils.isEmpty(str) && (i92Var = i92.c) != null) {
                    for (x82 x82Var : Collections.unmodifiableCollection(i92Var.a)) {
                        if (this.c.contains(x82Var.g)) {
                            r92 r92Var = x82Var.d;
                            if (this.e >= r92Var.c) {
                                r92Var.d = 2;
                                gm.m.p(r92Var.c(), "setNativeViewHierarchy", str, r92Var.a);
                            }
                        }
                    }
                }
                super.onPostExecute(str);
                break;
        }
    }

    public void b(String str) {
        i92 i92Var = i92.c;
        if (i92Var != null) {
            for (x82 x82Var : Collections.unmodifiableCollection(i92Var.a)) {
                if (this.c.contains(x82Var.g)) {
                    r92 r92Var = x82Var.d;
                    if (this.e >= r92Var.c && r92Var.d != 3) {
                        r92Var.d = 3;
                        gm.m.p(r92Var.c(), "setNativeViewHierarchy", str, r92Var.a);
                    }
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        int i = this.f;
        JSONObject jSONObject = this.d;
        switch (i) {
            case 0:
                return jSONObject.toString();
            default:
                us2 us2Var = this.b;
                if (v92.e(jSONObject, (JSONObject) us2Var.g)) {
                    return null;
                }
                us2Var.g = jSONObject;
                return jSONObject.toString();
        }
    }

    @Override // defpackage.aa2, android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(Object obj) {
        switch (this.f) {
            case 0:
                String str = (String) obj;
                b(str);
                super.onPostExecute(str);
                break;
            default:
                onPostExecute((String) obj);
                break;
        }
    }
}
