package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class ez0 {
    public static final um0 a;
    public static final um0 b;
    public static final um0 c = um0.l("gads:mediation_serving_domain:enabled", false);
    public static final um0 d;
    public static final um0 e;
    public static final um0 f;

    static {
        int i = 4;
        a = new um0("gads:mediation_client_sdkcore_url", i, "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/sdk-core-v40-impl.html");
        String str = "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/sdk-core-v40-loader.html";
        b = new um0("gads:mediation_service_sdkcore_url", i, str);
        d = new um0("gads:mediation_serving_domain:locale_list", i, "");
        e = new um0("gads:mediation_templated_client_sdkcore_url", i, "https://googleads.g.doubleclick.net/mads/static/sdk/native/sdk-core-v40.html");
        f = new um0("gads:sdk_core_location", i, str);
    }
}
