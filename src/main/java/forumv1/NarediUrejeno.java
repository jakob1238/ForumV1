/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package forumv1;
import java.io.*;

/**
 *
 * @author student
 */
public class NarediUrejeno {
    public static void Uredi(){
        try {
            String vsiUp[]=new String [500];
            BufferedReader br=new BufferedReader(new FileReader("C:\\Forumv1\\Up.txt"));
            String up=br.readLine();
            int k=0;
            while(up!=null){
                String em=br.readLine();
                String geslo=br.readLine();
                vsiUp[k]=up+";"+em+";"+geslo;
                k++;
                up=br.readLine();
                
            }
            br.close();
            String prava[]=new String[k];
            for(int i=0;i<k;i++){
                prava[i]=vsiUp[i];
            }
            for (int i = 0; i < prava.length - 1; i++) {
                for (int j = 0; j < prava.length - 1 - i; j++) {

                    if (prava[j].compareTo(prava[j + 1]) > 0) {
                        String temp = prava[j];
                        prava[j] = prava[j + 1];
                        prava[j + 1] = temp;
                    }
                }
            }
            PrintWriter pw=new PrintWriter(new FileWriter("C:\\Forumv1\\Up1.txt",true));
            for(int i=0;i<k;i++){
                String [] s=vsiUp[i].split(";");
                pw.println(s[0]);
                pw.println(s[1]);
                pw.println(s[2]);
            }
        } catch (IOException ex) {
            System.getLogger(NarediUrejeno.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        
    }
    public static void main(String [] args){
        Uredi();
    }
}
