class StrBuffToStrAndViceversa {
    public static void main(String args[]){
        //conversion of string to stringbuffer
        String str1="Sanya";
        StringBuffer sb1=new StringBuffer(str1);
        System.out.println(sb1);
        //conversion of StringBuffer to String
        StringBuffer sb2 = new StringBuffer("Prapti");
        String str2 = sb2.toString();
        System.out.println(str2);
    }
}
