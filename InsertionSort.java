/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertionsort;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Random;
/**
 *
 * @author Yamin
 */
public class InsertionSort
{
    public static void main(String[] args) throws IOException
    {
        
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
         
        
        System.out.print("Silahkan input jumlah data : ");    int jlh_data = Integer.parseInt(dataIn.readLine());
         
        
        int[] data = new int[jlh_data];
         
       
        System.out.println("\nMetode Pegisian Data");
        System.out.println("1. Input Manual");
        System.out.println("2. Input Otomatis");
        System.out.print("Pilih : ");     int isi_data = Integer.parseInt(dataIn.readLine());
         
        switch(isi_data)
        {
            case 1  :   
                        System.out.println();
                        for(int a = 0; a < jlh_data; a++)
                        {
                            System.out.print("Data ke-"+(a+1)+" : ");   data[a] = Integer.parseInt(dataIn.readLine());
                        }
                         
                            break;
             
            case 2  :   
                        System.out.println();
                        for(int a = 0; a < jlh_data; a++)
                            data[a] = new Random().nextInt(201);
                         
                        
                        System.out.print("Data : ");
                        for(int a = 0; a < jlh_data; a++)
                            System.out.print(data[a]+" ");
                         
                            break;
                             
            default :   System.out.println("\nPilihan tidak ada");
        }
         
       
        System.out.println("\nProses Insertion Sort");
        for(int a = 0; a < jlh_data-1; a++)
        {
            System.out.println("Melakukan penukaran data "+(a+1));
            for(int b = 0; b < jlh_data; b++)
                System.out.print(data[b]+"\t");
             
            System.out.print("   --> Pertukaran "+data[a+1]+" dengan "+data[a]);
             
            for(int b = a+1; b > 0; b--)
            {
                String pesan = "   --> Tidak Ada Pertukaran";
                if(data[b] < data[b-1])
                {
                    pesan = "   --> "+data[b]+" Melakukan penukaran dengan"+data[b-1];
                     
                   
                    int temp = data[b];
                    data[b] = data[b-1];
                    data[b-1] = temp;
                     
                    System.out.println();
                    for(int c = 0; c < jlh_data; c++)
                        System.out.print(data[c]+"\t");
                     
                    System.out.print(pesan);
                }
                 
                else
                {
                    System.out.println();
                    for(int c = 0; c < jlh_data; c++)
                        System.out.print(data[c]+"\t");
                     
                    System.out.print(pesan);
                        break;
                }
            }
            System.out.println("\n");
        }
      
        System.out.print("\nOutput Data Hasil Sort : ");
        for(int a = 0; a < jlh_data; a++)
            System.out.print(data[a]+" ");
         
    }
}