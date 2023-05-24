import java.util.Scanner;
import java.util.Arrays;
class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Sprawdźmy, czy podane przez Ciebie wyrazy będą anagramami!");
    System.out.println("Podaj pierwsze słowo:");
    String first = in.nextLine();
    char[] a = first.toCharArray();
    System.out.println("Podaj drugie słowo:");
    String second = in.nextLine();
    char[] b = second.toCharArray();
    if(a.length!=b.length){
      System.out.println("Wyrazy nie są anagramami.");
    }
    else{
      Arrays.sort(a);
      Arrays.sort(b);
      int spr = 0;
      for(int i=0;i<a.length;i++){
        if(a[i]==b[i]){
          spr=spr+1;
        }
      }
      if(spr==a.length){
        System.out.println("Wyrazy są anagramami.");
      }
      else{
        System.out.println("Wyrazy nie są anagramami.");
      }
    }
  }
}