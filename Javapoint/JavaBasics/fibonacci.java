class fibonacci{
    public static void main(String[] args) {
      int m=0,n=1,o,i,count=10;
      System.out.print(m+" "+n);
      for(i=2;i<count;i++){
          o=m+n;
          System.out.print(" "+o);
          m=n;
          n=o;
      }
    }
}