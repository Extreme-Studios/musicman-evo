package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public abstract class o5 {
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        pb zy1Var;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                zy1Var = new zy1(clipData, 3);
            } else {
                qb qbVar = new qb();
                qbVar.g = clipData;
                qbVar.h = 3;
                zy1Var = qbVar;
            }
            w60.g(textView, zy1Var.build());
            return true;
        } finally {
            textView.endBatchEdit();
        }
    }

    public static boolean b(DragEvent dragEvent, View view, Activity activity) {
        pb zy1Var;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            zy1Var = new zy1(clipData, 3);
        } else {
            qb qbVar = new qb();
            qbVar.g = clipData;
            qbVar.h = 3;
            zy1Var = qbVar;
        }
        w60.g(view, zy1Var.build());
        return true;
    }
}
