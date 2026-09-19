package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class n20 extends MenuInflater {
    public static final Class[] e;
    public static final Class[] f;
    public final Object[] a;
    public final Object[] b;
    public final Context c;
    public Object d;

    static {
        Class[] clsArr = {Context.class};
        e = clsArr;
        f = clsArr;
    }

    public n20(Context context) {
        super(context);
        this.c = context;
        Object[] objArr = {context};
        this.a = objArr;
        this.b = objArr;
    }

    public static Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    public final void b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        int i;
        ColorStateList colorStateList;
        int resourceId;
        m20 m20Var = new m20(this, menu);
        int eventType = xmlPullParser.getEventType();
        do {
            i = 2;
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlPullParser.next();
                break;
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        boolean z = false;
        boolean z2 = false;
        String str = null;
        while (!z) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            Menu menu2 = m20Var.a;
            if (eventType == i) {
                if (!z2) {
                    String name2 = xmlPullParser.getName();
                    boolean zEquals = name2.equals("group");
                    Context context = this.c;
                    if (zEquals) {
                        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, lw.p);
                        m20Var.b = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                        m20Var.c = typedArrayObtainStyledAttributes.getInt(3, 0);
                        m20Var.d = typedArrayObtainStyledAttributes.getInt(4, 0);
                        m20Var.e = typedArrayObtainStyledAttributes.getInt(5, 0);
                        m20Var.f = typedArrayObtainStyledAttributes.getBoolean(2, true);
                        m20Var.g = typedArrayObtainStyledAttributes.getBoolean(0, true);
                        typedArrayObtainStyledAttributes.recycle();
                    } else if (name2.equals("item")) {
                        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, lw.q);
                        m20Var.i = typedArrayObtainStyledAttributes2.getResourceId(2, 0);
                        m20Var.j = (typedArrayObtainStyledAttributes2.getInt(5, m20Var.c) & (-65536)) | (typedArrayObtainStyledAttributes2.getInt(6, m20Var.d) & 65535);
                        m20Var.k = typedArrayObtainStyledAttributes2.getText(7);
                        m20Var.l = typedArrayObtainStyledAttributes2.getText(8);
                        m20Var.m = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
                        String string = typedArrayObtainStyledAttributes2.getString(9);
                        m20Var.n = string == null ? (char) 0 : string.charAt(0);
                        m20Var.o = typedArrayObtainStyledAttributes2.getInt(16, 4096);
                        String string2 = typedArrayObtainStyledAttributes2.getString(10);
                        m20Var.p = string2 == null ? (char) 0 : string2.charAt(0);
                        m20Var.q = typedArrayObtainStyledAttributes2.getInt(20, 4096);
                        if (typedArrayObtainStyledAttributes2.hasValue(11)) {
                            m20Var.r = typedArrayObtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                        } else {
                            m20Var.r = m20Var.e;
                        }
                        m20Var.s = typedArrayObtainStyledAttributes2.getBoolean(3, false);
                        m20Var.t = typedArrayObtainStyledAttributes2.getBoolean(4, m20Var.f);
                        m20Var.u = typedArrayObtainStyledAttributes2.getBoolean(1, m20Var.g);
                        m20Var.v = typedArrayObtainStyledAttributes2.getInt(21, -1);
                        m20Var.y = typedArrayObtainStyledAttributes2.getString(12);
                        m20Var.w = typedArrayObtainStyledAttributes2.getResourceId(13, 0);
                        m20Var.x = typedArrayObtainStyledAttributes2.getString(15);
                        String string3 = typedArrayObtainStyledAttributes2.getString(14);
                        boolean z3 = string3 != null;
                        if (z3 && m20Var.w == 0 && m20Var.x == null) {
                            m20Var.z = (vr) m20Var.a(string3, f, this.b);
                        } else {
                            if (z3) {
                                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                            }
                            m20Var.z = null;
                        }
                        m20Var.A = typedArrayObtainStyledAttributes2.getText(17);
                        m20Var.B = typedArrayObtainStyledAttributes2.getText(22);
                        if (typedArrayObtainStyledAttributes2.hasValue(19)) {
                            m20Var.D = sf.c(typedArrayObtainStyledAttributes2.getInt(19, -1), m20Var.D);
                        } else {
                            m20Var.D = null;
                        }
                        if (typedArrayObtainStyledAttributes2.hasValue(18)) {
                            if (!typedArrayObtainStyledAttributes2.hasValue(18) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = jn.e(context, resourceId)) == null) {
                                colorStateList = typedArrayObtainStyledAttributes2.getColorStateList(18);
                            }
                            m20Var.C = colorStateList;
                        } else {
                            m20Var.C = null;
                        }
                        typedArrayObtainStyledAttributes2.recycle();
                        m20Var.h = false;
                        xmlPullParser = xmlPullParser;
                    } else if (name2.equals("menu")) {
                        m20Var.h = true;
                        SubMenu subMenuAddSubMenu = menu2.addSubMenu(m20Var.b, m20Var.i, m20Var.j, m20Var.k);
                        m20Var.b(subMenuAddSubMenu.getItem());
                        xmlPullParser = xmlPullParser;
                        b(xmlPullParser, attributeSet, subMenuAddSubMenu);
                    } else {
                        xmlPullParser = xmlPullParser;
                        str = name2;
                        z2 = true;
                    }
                }
                z = z;
            } else if (eventType != 3) {
                z = z;
            } else {
                String name3 = xmlPullParser.getName();
                if (z2 && name3.equals(str)) {
                    xmlPullParser = xmlPullParser;
                    z2 = false;
                    str = null;
                } else {
                    if (name3.equals("group")) {
                        m20Var.b = 0;
                        m20Var.c = 0;
                        m20Var.d = 0;
                        m20Var.e = 0;
                        m20Var.f = true;
                        m20Var.g = true;
                    } else if (name3.equals("item")) {
                        if (!m20Var.h) {
                            vr vrVar = m20Var.z;
                            if (vrVar == null || !vrVar.b.hasSubMenu()) {
                                m20Var.h = true;
                                m20Var.b(menu2.add(m20Var.b, m20Var.i, m20Var.j, m20Var.k));
                            } else {
                                m20Var.h = true;
                                m20Var.b(menu2.addSubMenu(m20Var.b, m20Var.i, m20Var.j, m20Var.k).getItem());
                            }
                        }
                    } else if (name3.equals("menu")) {
                        z = true;
                    }
                    z = z;
                }
            }
            eventType = xmlPullParser.next();
            i = 2;
            z = z;
            z2 = z2;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof rr)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z = false;
        try {
            try {
                layout = this.c.getResources().getLayout(i);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof rr) {
                    rr rrVar = (rr) menu;
                    if (!rrVar.p) {
                        rrVar.w();
                        z = true;
                    }
                }
                b(layout, attributeSetAsAttributeSet, menu);
                if (z) {
                    ((rr) menu).v();
                }
                layout.close();
            } catch (IOException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            } catch (XmlPullParserException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } catch (Throwable th) {
            if (z) {
                ((rr) menu).v();
            }
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
