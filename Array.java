 


 
 public class Array{

    

    
    public static void main(String[] args) {

      //jagged Array A jagged array in Java is an array of arrays where the sub-arrays can have different lengths. 
      //This is different from a multidimensional array (like a 2D array), where each sub-array has the same length.

      int Array[][] = new int[3][];

      Array[0] = new int[3];
      Array[1] = new int[4];
      Array[2] = new int[2];

      for(int i = 0; i < Array.length; i++){
         for(int j = 0; j < Array[i].length; j++){
            Array[i][j] = (int)(Math.random() * 10);
         }
         
      } //end of jagged Array


     
        
      //int nums[] = {3, 7, 3, 4};
      int nums[] = new int[4];  //this array can only take 4 values/elements
      //nums[0] = 6; //replace the value at index 1 with value of 6, 7 to 6.
      nums[0] =18;
      nums[1] =19;
      nums[2] =20;
      nums[3] =21;


      for(int i = 0; i < 4 ;i ++){
        System.out.println(nums[i]);
      }

      System.out.println("HERE");

    //2-D array

    int numbers[][] = {{1, 2, 3, 4},{5, 6, 7, 8},{9, 10, 11, 12},{}};
    
    int numbers2[] = {13, 14, 15, 16};

    
    numbers[3]=numbers2; //assign the {11, 12, 13} to index 3 in numbers array
    

    for(int a = 0; a < numbers.length; a++){
        for(int b = 0; b < numbers[a].length; b++){
            System.out.println(numbers[a][b]);
    }
    
    //OR THIS WAY WHICH IS EASIER

    /* 
     for(int a = 0; a < 3; a++){
        for(int b = 0; b < 4; b++){
        System.out.println(numbers[a][b]);
        }
     } */
}


      //2-D with fixed size

      System.out.println("2-D ARRAY");

 int MyArraySize [][] = new int[3][4];
 //int MyArraySize [][] = new int[3][]; this is called jagged Array because we dont know the size of the internal array 


 //this is type casting, as we konw Math.random will generate a double number since we cannot asign it to a int variable we do this,
//which will convert the double value into  a integer value.
 /*int random = (int) Math.random() *100; 
 System.out.println("random" + " " + random);*/


 /*MyArraySize[0][0] = 1;
 MyArraySize[0][1] = 2;
 MyArraySize[0][2] = 3;
 MyArraySize[0][3] = 4;
 MyArraySize[1][0] = 5;*/


 

 for(int i = 0; i < 3; i++){
   for(int j = 0; j < 4; j++){
      MyArraySize[i][j] = (int)(Math.random() * 10);  //type casting
      System.out.println(MyArraySize[i][j]);
   }
 }


     for(int i = 0; i < 3; i++){
        for(int j = 0; j < 4; j++){
        System.out.print(MyArraySize[i][j]);
        }
        System.out.println("");
     }
      

     for(int n[] : MyArraySize){
      for(int m : n){
         System.out.println(m + " ");
     }

     System.out.println();
       
    
}}}



