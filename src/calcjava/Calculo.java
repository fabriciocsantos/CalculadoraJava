/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calcjava;


public final class Calculo {
    
    public static int Adicao(int v1, int v2){
       return v1 + v2;
    }
    
    public static int Subtracao(int v1, int v2){
        return v1 - v2;
    }
    
    public static int Multiplicacao(int v1, int v2){
        return v1 * v2;
    }
    
    public static float Divisao(float v1, float v2) throws Exception{
      if (v2 == 0){
          throw new Exception("Impossivel Dividir por Zero");
       
      }else {
          return v1 / v2;
      }
    }
}
