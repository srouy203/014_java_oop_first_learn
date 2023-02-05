class getBytesDemo {
    public static void main(String args[]) {
        String s = "Now is the time for all good men\n"
                + " to come to the aid of their country\n"
                + " and pay their due taxes.\n";

        byte buf[] = s.getBytes();
        for (int i = 0; i < buf.length; i++)
            System.out.print((char) buf[i]);
    }
}