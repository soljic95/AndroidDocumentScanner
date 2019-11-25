/*
 * *
 *  * Created by Muhammet Ali YÜCE on 3/5/19 4:26 PM
 *  * on Github: /mayuce
 *  * Copyright (c) 2019 . All rights reserved.
 *  * Last modified 3/5/19 3:57 PM
 *
 */

package team.clevel.documentscanner.helpers;

import android.graphics.Bitmap;

public class ScannerConstants {
    public static Bitmap selectedImageBitmap;
    public static String cropText = "Izreži fotografiju", backText = "Odustani",
            imageError = "Nešto je pošlo po zlu, pokušajte ponovno",
            cropError = "Niste odabrali dobro polje za izrezati, molimo uredite dok sve točke ne postanu plave";
    public static String cropColor = "#6666ff", backColor = "#ff0000", progressColor = "#331199";
    public static boolean saveStorage = false;
}
