package com.ocr;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import java.io.File;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        System.out.println(crackImage("E:\\indirilenler\\PDF\\01.png"));

    }
    public static String crackImage(String filePath) {
        File imageFile = new File(filePath);
        Tesseract instance = new Tesseract();
        instance.setDatapath("C:\\ocr\\tessdata");
        instance.setLanguage("eng");
        try {
            String result = instance.doOCR(imageFile);
            return result;
        } catch (TesseractException e) {
            System.err.println(e.getMessage());
            return "Error while reading image";
        }
    }
}
