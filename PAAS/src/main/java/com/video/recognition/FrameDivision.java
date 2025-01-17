package com.video.recognition;

import org.opencv.core.Core;

public class FrameDivision {

    static{
        String osName = System.getProperty("os.name");
        String opencvpath = System.getProperty("user.dir");
        if(osName.startsWith("Windows")) {
            int bitness = Integer.parseInt(System.getProperty("sun.arch.data.model"));
            if(bitness == 32) {
                opencvpath=opencvpath+"\\opencv\\x86\\";
            }
            else if (bitness == 64) {
                opencvpath=opencvpath+"\\opencv\\x64\\";
            } else {
                opencvpath=opencvpath+"\\opencv\\x86\\";
            }
        }
        else if(osName.equals("Mac OS X")){
            opencvpath = opencvpath+"Your path to .dylib";
        }
        System.out.println(opencvpath);
        System.load(opencvpath + Core.NATIVE_LIBRARY_NAME + ".dll");
        System.load(opencvpath + "opencv_ffmpeg300_64" + ".dll");
        //nu.pattern.OpenCV.loadShared();
        //System.loadLibrary(org.opencv.core.Core.NATIVE_LIBRARY_NAME);
    }

    public static void main(String[] args) throws Exception {
        VideoStream vs = new VideoStream();
    }
}
