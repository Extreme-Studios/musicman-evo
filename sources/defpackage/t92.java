package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* JADX INFO: loaded from: classes.dex */
public final class t92 extends WebViewClient {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t92(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        switch (this.a) {
            case 1:
                dc3 dc3Var = (dc3) this.b;
                b11 b11Var = dc3Var.k;
                if (b11Var != null) {
                    try {
                        b11Var.W(a23.E(1, null, null));
                    } catch (RemoteException e) {
                        jn.Z("#007 Could not call remote method.", e);
                    }
                }
                b11 b11Var2 = dc3Var.k;
                if (b11Var2 != null) {
                    try {
                        b11Var2.H(0);
                    } catch (RemoteException e2) {
                        jn.Z("#007 Could not call remote method.", e2);
                        return;
                    }
                }
                break;
            default:
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        switch (this.a) {
            case 0:
                String string = renderProcessGoneDetail.toString();
                String strValueOf = String.valueOf(webView);
                Log.w("NativeBridge", ec.o(new StringBuilder(String.valueOf(string).length() + 36 + strValueOf.length()), "WebView renderer gone: ", string, "for WebView: ", strValueOf));
                u92 u92Var = (u92) this.b;
                if (u92Var.c() == webView) {
                    Log.w("NativeBridge", "Deallocating the Native bridge as it is unusable. No further events will be generated for this session.");
                    u92Var.b = new da2(null);
                }
                webView.destroy();
                return true;
            default:
                return super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        switch (this.a) {
            case 1:
                dc3 dc3Var = (dc3) this.b;
                String strC3 = dc3Var.C3();
                Context context = dc3Var.h;
                int iB = 0;
                if (str.startsWith(strC3)) {
                    return false;
                }
                if (!str.startsWith("gmsg://noAdLoaded")) {
                    if (str.startsWith("gmsg://scriptLoadFailed")) {
                        b11 b11Var = dc3Var.k;
                        if (b11Var != null) {
                            try {
                                b11Var.W(a23.E(1, null, null));
                            } catch (RemoteException e) {
                                jn.Z("#007 Could not call remote method.", e);
                            }
                        }
                        b11 b11Var2 = dc3Var.k;
                        if (b11Var2 != null) {
                            try {
                                b11Var2.H(0);
                            } catch (RemoteException e2) {
                                jn.Z("#007 Could not call remote method.", e2);
                            }
                        }
                        dc3Var.B3(0);
                    } else if (str.startsWith("gmsg://adResized")) {
                        b11 b11Var3 = dc3Var.k;
                        if (b11Var3 != null) {
                            try {
                                b11Var3.d();
                            } catch (RemoteException e3) {
                                jn.Z("#007 Could not call remote method.", e3);
                            }
                        }
                        String queryParameter = Uri.parse(str).getQueryParameter("height");
                        if (!TextUtils.isEmpty(queryParameter)) {
                            try {
                                f32 f32Var = ut0.f.a;
                                iB = f32.b(context, Integer.parseInt(queryParameter));
                                break;
                            } catch (NumberFormatException unused) {
                            }
                        }
                        dc3Var.B3(iB);
                    } else if (!str.startsWith("gmsg://")) {
                        b11 b11Var4 = dc3Var.k;
                        if (b11Var4 != null) {
                            try {
                                b11Var4.f();
                                dc3Var.k.b();
                            } catch (RemoteException e4) {
                                jn.Z("#007 Could not call remote method.", e4);
                            }
                        }
                        Intent intent = new Intent("android.intent.action.VIEW");
                        intent.setData(Uri.parse(str));
                        context.startActivity(intent);
                    }
                    break;
                } else {
                    b11 b11Var5 = dc3Var.k;
                    if (b11Var5 != null) {
                        try {
                            b11Var5.W(a23.E(3, null, null));
                        } catch (RemoteException e5) {
                            jn.Z("#007 Could not call remote method.", e5);
                        }
                    }
                    b11 b11Var6 = dc3Var.k;
                    if (b11Var6 != null) {
                        try {
                            b11Var6.H(3);
                        } catch (RemoteException e6) {
                            jn.Z("#007 Could not call remote method.", e6);
                        }
                    }
                    dc3Var.B3(0);
                    break;
                }
                return true;
            default:
                return super.shouldOverrideUrlLoading(webView, str);
        }
    }
}
