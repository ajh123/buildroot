package me.ajh123.sedna_improved.buildroot;

import java.io.InputStream;

public final class Buildroot {
    public static InputStream getFirmware() {
        return Buildroot.class.getClassLoader().getResourceAsStream("generated/sedna_improved/fw_jump.bin");
    }

    public static InputStream getLinuxImage() {
        return Buildroot.class.getClassLoader().getResourceAsStream("generated/sedna_improved/Image");
    }

    public static InputStream getRootFilesystem() {
        return Buildroot.class.getClassLoader().getResourceAsStream("generated/sedna_improved/rootfs.ext2");
    }
}
