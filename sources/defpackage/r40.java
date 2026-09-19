package defpackage;

import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.Topic;
import android.adservices.topics.TopicsManager;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class r40 {
    public final TopicsManager a;

    public r40(TopicsManager topicsManager) {
        topicsManager.getClass();
        this.a = topicsManager;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object c(r40 r40Var, tl tlVar, yb ybVar) throws Throwable {
        q40 q40Var;
        if (ybVar instanceof q40) {
            q40Var = (q40) ybVar;
            int i = q40Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                q40Var.l = i - Integer.MIN_VALUE;
            } else {
                q40Var = new q40(r40Var, ybVar);
            }
        } else {
            q40Var = new q40(r40Var, ybVar);
        }
        Object objS = q40Var.j;
        int i2 = q40Var.l;
        if (i2 == 0) {
            ar.n(objS);
            GetTopicsRequest getTopicsRequestA = r40Var.a(tlVar);
            q40Var.i = r40Var;
            q40Var.l = 1;
            z8 z8Var = new z8(1, s90.h(q40Var));
            z8Var.t();
            r40Var.a.getTopics(getTopicsRequestA, new c7(1), new bc(z8Var));
            objS = z8Var.s();
            rc rcVar = rc.f;
            if (objS == rcVar) {
                return rcVar;
            }
        } else {
            if (i2 != 1) {
                j7.e("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r40Var = q40Var.i;
            ar.n(objS);
        }
        GetTopicsResponse getTopicsResponseJ = tq.j(objS);
        r40Var.getClass();
        getTopicsResponseJ.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = getTopicsResponseJ.getTopics().iterator();
        while (it.hasNext()) {
            Topic topicK = tq.k(it.next());
            arrayList.add(new n40(topicK.getTopicId(), topicK.getTaxonomyVersion(), topicK.getModelVersion()));
        }
        return new ul(arrayList);
    }

    public GetTopicsRequest a(tl tlVar) {
        tlVar.getClass();
        GetTopicsRequest getTopicsRequestBuild = tq.f().setAdsSdkName("com.google.android.gms.ads").build();
        getTopicsRequestBuild.getClass();
        return getTopicsRequestBuild;
    }

    public Object b(tl tlVar, yb ybVar) {
        return c(this, tlVar, ybVar);
    }
}
