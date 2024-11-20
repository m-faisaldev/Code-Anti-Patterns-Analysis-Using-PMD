package a1;

import D0.C1036c;
import D0.F;
import D0.InterfaceC1038e;
import D0.r;
import a1.InterfaceC1659j;
import android.content.Context;
import android.util.Base64OutputStream;
import androidx.core.os.UserManagerCompat;
import c1.InterfaceC2009b;
import com.google.android.gms.tasks.Task;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;
import q0.AbstractC3624n;

/* renamed from: a1.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1655f implements InterfaceC1658i, InterfaceC1659j {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2009b f13985a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f13986b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC2009b f13987c;

    /* renamed from: d, reason: collision with root package name */
    private final Set f13988d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f13989e;

    private C1655f(final Context context, final String str, Set set, InterfaceC2009b interfaceC2009b, Executor executor) {
        this(new InterfaceC2009b() { // from class: a1.c
            @Override // c1.InterfaceC2009b
            public final Object get() {
                C1660k j8;
                j8 = C1655f.j(context, str);
                return j8;
            }
        }, set, executor, interfaceC2009b, context);
    }

    public static C1036c g() {
        final F a8 = F.a(C0.a.class, Executor.class);
        return C1036c.f(C1655f.class, InterfaceC1658i.class, InterfaceC1659j.class).b(r.l(Context.class)).b(r.l(A0.f.class)).b(r.o(InterfaceC1656g.class)).b(r.n(k1.i.class)).b(r.k(a8)).f(new D0.h() { // from class: a1.b
            @Override // D0.h
            public final Object a(InterfaceC1038e interfaceC1038e) {
                C1655f h8;
                h8 = C1655f.h(F.this, interfaceC1038e);
                return h8;
            }
        }).d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C1655f h(F f8, InterfaceC1038e interfaceC1038e) {
        return new C1655f((Context) interfaceC1038e.a(Context.class), ((A0.f) interfaceC1038e.a(A0.f.class)).o(), interfaceC1038e.e(InterfaceC1656g.class), interfaceC1038e.c(k1.i.class), (Executor) interfaceC1038e.b(f8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String i() {
        String byteArrayOutputStream;
        synchronized (this) {
            try {
                C1660k c1660k = (C1660k) this.f13985a.get();
                List c8 = c1660k.c();
                c1660k.b();
                JSONArray jSONArray = new JSONArray();
                for (int i8 = 0; i8 < c8.size(); i8++) {
                    AbstractC1661l abstractC1661l = (AbstractC1661l) c8.get(i8);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("agent", abstractC1661l.c());
                    jSONObject.put("dates", new JSONArray((Collection) abstractC1661l.b()));
                    jSONArray.put(jSONObject);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("heartbeats", jSONArray);
                jSONObject2.put("version", "2");
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                    try {
                        gZIPOutputStream.write(jSONObject2.toString().getBytes(C.UTF8_NAME));
                        gZIPOutputStream.close();
                        base64OutputStream.close();
                        byteArrayOutputStream = byteArrayOutputStream2.toString(C.UTF8_NAME);
                    } finally {
                    }
                } finally {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return byteArrayOutputStream;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C1660k j(Context context, String str) {
        return new C1660k(context, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void k() {
        synchronized (this) {
            ((C1660k) this.f13985a.get()).k(System.currentTimeMillis(), ((k1.i) this.f13987c.get()).a());
        }
        return null;
    }

    @Override // a1.InterfaceC1658i
    public Task a() {
        return UserManagerCompat.isUserUnlocked(this.f13986b) ^ true ? AbstractC3624n.e("") : AbstractC3624n.c(this.f13989e, new Callable() { // from class: a1.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String i8;
                i8 = C1655f.this.i();
                return i8;
            }
        });
    }

    @Override // a1.InterfaceC1659j
    public synchronized InterfaceC1659j.a b(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        C1660k c1660k = (C1660k) this.f13985a.get();
        if (!c1660k.i(currentTimeMillis)) {
            return InterfaceC1659j.a.NONE;
        }
        c1660k.g();
        return InterfaceC1659j.a.GLOBAL;
    }

    public Task l() {
        return this.f13988d.size() <= 0 ? AbstractC3624n.e(null) : UserManagerCompat.isUserUnlocked(this.f13986b) ^ true ? AbstractC3624n.e(null) : AbstractC3624n.c(this.f13989e, new Callable() { // from class: a1.e
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void k8;
                k8 = C1655f.this.k();
                return k8;
            }
        });
    }

    C1655f(InterfaceC2009b interfaceC2009b, Set set, Executor executor, InterfaceC2009b interfaceC2009b2, Context context) {
        this.f13985a = interfaceC2009b;
        this.f13988d = set;
        this.f13989e = executor;
        this.f13987c = interfaceC2009b2;
        this.f13986b = context;
    }
}