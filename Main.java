import java.util.Random;

class Main {
  public static void main(String[] args) {
    int max = 0, li = 0;
    int [][] mas = new int [10][10];
    Random ran = new Random();
    
    for(int i = 0; i < 10; i++){
      for (int l = 0; l < 10; l++ ){
        mas[i][l] = ran.nextInt(55);
        System.out.print(mas[i][l]+ "\t");
      }
      System.out.println("\n");
    }

    for(int i = 0; i < 10; i++){
      if(max < mas[i][li]){ max = mas[i][li]; }
      li++;
    }
    System.out.println("\nМаксимальное число в диагонали - " + max);
    max = 0;
    li = 9;
    for(int i = 0; i < 10; i++){
      if(max < mas[i][li]){ max = mas[i][li]; }
      li--;
    }
    System.out.println("\nМаксимальное число в побочной диагонали - " + max);
    int t = 1;
    for (int l = 0; l < 10; l++){
      int z = 0;
      for(int i = 0; i < 10; i++){ z += mas[i][l]; }
      System.out.println("\n Сумма элементов " + t + " столбца равна " + z);
      t++;
    }
  }
}