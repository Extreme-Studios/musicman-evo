package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class qy0 {
    public static final um0 a;
    public static final um0 b;
    public static final um0 c = um0.p("gads:gma_attestation:click:timeout", 2000);
    public static final um0 d = um0.l("gads:gma_attestation:click:enable", false);
    public static final um0 e = um0.p("gads:gma_attestation:click:enable_dynamite_version", 213806100);
    public static final um0 f = um0.l("gads:gma_attestation:click:qualification:enable", true);
    public static final um0 g = um0.l("gads:gma_attestation:image_hash", false);
    public static final um0 h = um0.l("gads:gma_attestation:impression:enable", false);
    public static final um0 i = um0.l("gads:gma_attestation:click:report_error", true);

    static {
        int i2 = 4;
        a = new um0("gads:gma_attestation:click:macro_string", i2, "@click_attok@");
        b = new um0("gads:gma_attestation:click:query_param", i2, "attok");
    }
}
