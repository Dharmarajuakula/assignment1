public class largestnumber {
   public static void main(String args[]){
      int Temp, Size;
      int array[] = {10, 17, 25, 74, 96, 57};
      Size = array.length;

      for(int i = 0; i<Size; i++ ){
         for(int j = i+1; j<Size; j++){

            if(array[i]>array[j]){
               Temp = array[i];
               array[i] = array[j];
               array[j] = Temp;
            }
         }
      }
      System.out.println("second largest number is: "+array[Size-2]);
   }
}
