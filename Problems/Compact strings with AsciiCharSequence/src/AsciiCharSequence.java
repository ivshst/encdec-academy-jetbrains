public class AsciiCharSequence implements java.lang.CharSequence {

    byte[] bytes;
    public AsciiCharSequence(byte... bytes) {
        this.bytes = bytes.clone();
    }
    @Override
    public int length() {
        return this.bytes.length;
    }

    @Override
    public char charAt(int index) {
        return (char) bytes[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return new AsciiCharSequence(java.util.Arrays.copyOfRange(bytes, start, end));
    }

    @Override
    public String toString() {
        return new String(bytes);
    }
}