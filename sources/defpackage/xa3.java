package defpackage;

import android.net.Uri;
import android.os.AsyncTask;
import android.webkit.WebView;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class xa3 extends AsyncTask {
    public final /* synthetic */ dc3 a;

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        dc3 dc3Var = this.a;
        dc3Var.getClass();
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https://").appendEncodedPath((String) gy0.d.u());
        es0 es0Var = dc3Var.i;
        builder.appendQueryParameter("query", (String) es0Var.i);
        builder.appendQueryParameter("pubId", (String) es0Var.g);
        builder.appendQueryParameter("mappver", (String) es0Var.k);
        TreeMap treeMap = (TreeMap) es0Var.h;
        for (String str : treeMap.keySet()) {
            builder.appendQueryParameter(str, (String) treeMap.get(str));
        }
        Uri uriBuild = builder.build();
        String strC3 = dc3Var.C3();
        String encodedQuery = uriBuild.getEncodedQuery();
        return ec.n(new StringBuilder(strC3.length() + 1 + String.valueOf(encodedQuery).length()), strC3, "#", encodedQuery);
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(Object obj) {
        WebView webView = this.a.j;
        String str = (String) obj;
        if (webView == null || str == null) {
            return;
        }
        webView.loadUrl(str);
    }
}
