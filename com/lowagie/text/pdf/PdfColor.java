/*
 * Decompiled with CFR 0_115.
 */
package com.lowagie.text.pdf;

import com.lowagie.text.pdf.PdfArray;
import com.lowagie.text.pdf.PdfNumber;
import com.lowagie.text.pdf.PdfObject;
import java.awt.Color;

class PdfColor
extends PdfArray {
    PdfColor(int n, int n2, int n3) {
        super(new PdfNumber((double)(n & 255) / 255.0));
        this.add(new PdfNumber((double)(n2 & 255) / 255.0));
        this.add(new PdfNumber((double)(n3 & 255) / 255.0));
    }

    PdfColor(Color color) {
        this(color.getRed(), color.getGreen(), color.getBlue());
    }
}

