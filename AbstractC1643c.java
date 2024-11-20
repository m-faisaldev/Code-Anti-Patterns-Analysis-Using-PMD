package a0;

import android.os.Parcel;

/* renamed from: a0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1643c {

    /* renamed from: a, reason: collision with root package name */
    private static final ClassLoader f13976a = AbstractC1643c.class.getClassLoader();

    public static void a(Parcel parcel, boolean z8) {
        parcel.writeInt(1);
    }

    public static boolean b(Parcel parcel) {
        return parcel.readInt() != 0;
    }
}