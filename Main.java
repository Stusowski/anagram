import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Podaj pierwsze słowo:");
    String first = in.nextLine();
    char[] a = first.toCharArray();
    System.out.println("Podaj drugie słowo:");
    String second = in.nextLine();
    char[] b = second.toCharArray();
    int spr = 0;
    for(int i=0;i<a.length;i++){
      for(int j=0;j<b.length;j++){
        if(a[i]==b[j]){
        spr=spr+1;
        }
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