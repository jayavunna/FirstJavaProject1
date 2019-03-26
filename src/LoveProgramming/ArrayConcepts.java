package LoveProgramming;
//array: to store similar data type values in a array variable
//1. int array:
//Lowest bound index=0
//upper bound/index = n-1 ( n is size of array)

//dis advantages of array:
//1.size is fixed --static array-- to over come this prblm is we use collections--arraylist,hashtable--dynamic array
//2. stores only similar data types -- to overcome of this problem we use object array

//object array : object is a class -- is used to store different data types value
public class ArrayConcepts {
    public static void main(String[] args) {
        int i[] = new int[5];
        i[0] = 10;
        i[1] = 20;
        i[2] = 30;
        i[3] = 40;
        i[4] = 50;
        System.out.println(i[4]+i[3]);
        System.out.println(i.length);
      //  System.out.println(i[6]);

        int j = 0;
      for (j=0; j<i.length; j++) {
          System.out.println(i[j]);
      }


          double db[] = new double[3];
          db[0] = 12.33;
          db[1] = 45.33;
          db[2] = 58.56;
          System.out.println(db[2]);

          char c[] = new char[3];
          c[0]='a';
          c[1]='0';
          c[2]= '$';
          System.out.println(c[2]);

          boolean b[]= new boolean[2];
          b[0]= true;
          b[1]= false;
          System.out.println(b[0]);

          String s[]= new String [3];
          s[0]= "text";
          s[1]= "Hello";
          s[2]= "Kishore";
          System.out.println(s[1]+s[2]);

          for (int k =0;k<s.length;k++){
              System.out.println(s[k]);
          }
          //Object is a class of super class
          Object ob[]= new Object[5];
          ob[0]= 10;
          ob[1]= 'a';
          ob[2]= "Name";
          ob[3]= 89.99;
          ob[4]= "1/1/1993";
          System.out.println(ob[4]);

          for (int l=0;l<ob.length;l++) {
              System.out.println(ob[l]);
          }





    }
}
