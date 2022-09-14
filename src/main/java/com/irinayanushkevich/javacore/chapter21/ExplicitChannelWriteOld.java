package main.java.com.irinayanushkevich.javacore.chapter21;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

class ExplicitChannelWriteOld {

    public static void main(String[] args) {

        FileInputStream fOut = null;
        FileChannel fChan = null;
        ByteBuffer mBuf;

        try {

            fOut = new FileInputStream("test.txt");
            fChan = fOut.getChannel();
            mBuf = ByteBuffer.allocate(26);

            for (int i = 0; i < 26; i++) {
                mBuf.put((byte) ('A' + i));
            }

            mBuf.rewind();
            fChan.write(mBuf);

        } catch (IOException e) {
            System.out.println("Input/Output error: " + e);

        } finally {

            try {

                if (fChan != null) {
                    fChan.close();
                }
            } catch (IOException e) {
                System.out.println("Closing channel error");
            }
            try {

                if (fOut != null) {
                    fOut.close();
                }
            } catch (IOException e) {
                System.out.println("Closing file error");
            }
        }
    }
}

