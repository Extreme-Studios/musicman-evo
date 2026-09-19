package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class gy0 {
    public static final um0 a = um0.l("gads:afs:csa_send_tcf_data", true);
    public static final um0 b;
    public static final um0 c;
    public static final um0 d;

    static {
        int i = 4;
        b = new um0("gads:afs:csa_tcf_data_to_collect", i, "[{\"bk\":\"tcString\",\"sk\":\"IABTCF_TCString\",\"type\":0},{\"bk\":\"gdprApplies\",\"sk\":\"IABTCF_gdprApplies\",\"type\":1},{\"bk\":\"usPrivacy\",\"sk\":\"IABUSPrivacy_String\",\"type\":0}]");
        c = new um0("gads:afs:csa_webview_custom_domain_param_key", i, "csa_customDomain");
        d = new um0("gads:afs:csa_webview_static_file_path", i, "/afs/ads/i/webview.html");
    }
}
