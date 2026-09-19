package defpackage;

import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.TopicsManager;

/* JADX INFO: loaded from: classes.dex */
public final class o40 extends r40 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o40(TopicsManager topicsManager, int i) {
        super(topicsManager);
        this.b = i;
    }

    @Override // defpackage.r40
    public GetTopicsRequest a(tl tlVar) {
        switch (this.b) {
            case 1:
                tlVar.getClass();
                GetTopicsRequest getTopicsRequestBuild = tq.f().setAdsSdkName("com.google.android.gms.ads").setShouldRecordObservation(tlVar.a).build();
                getTopicsRequestBuild.getClass();
                return getTopicsRequestBuild;
            default:
                return super.a(tlVar);
        }
    }
}
