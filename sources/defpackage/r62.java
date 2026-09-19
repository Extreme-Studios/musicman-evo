package defpackage;

/* JADX INFO: loaded from: classes.dex */
public enum r62 {
    g("signals"),
    h("request-parcel"),
    i("server-transaction"),
    j("renderer"),
    k("gms-signals"),
    /* JADX INFO: Fake field, exist only in values array */
    EF6("ad_request"),
    l("build-url"),
    /* JADX INFO: Fake field, exist only in values array */
    EF8("prepare-http-request"),
    m("http"),
    /* JADX INFO: Fake field, exist only in values array */
    EF10("proxy"),
    n("preprocess"),
    o("get-signals"),
    p("js-signals"),
    q("render-config-init"),
    r("render-config-waterfall"),
    /* JADX INFO: Fake field, exist only in values array */
    EF0("render-config-parallel"),
    s("adapter-load-ad-syn"),
    t("adapter-load-ad-ack"),
    u("wrap-adapter"),
    v("custom-render-syn"),
    w("custom-render-ack"),
    x("webview-cookie"),
    y("generate-signals"),
    z("get-cache-key"),
    A("notify-cache-hit"),
    B("get-url-and-cache-key"),
    C("preloaded-loader");

    public final String f;

    r62(String str) {
        this.f = str;
    }
}
