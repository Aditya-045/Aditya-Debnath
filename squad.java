import java.util.*;

class squad
{
    public static void main (String[]args)
    {
       Random generate = new Random();
       System.out.println("\t"+"West Bengal u23 Football Team"+"\n\n");
       String[] f_name = {"Rahul","Gourav","Goutam","Arpan","Sougata","Tirthankar","Deep","Sujoy","Sourav","Manojt","Sandeep","Ankit","Dip","Rohit","Ronit","Mohan","Dilip","Pritam","Shubham","Sumit","Tapas","Shubho","Subhojit","Soumyajit","Aniket","Pintu","Akash","Sohom","Koushik"};
       String[] l_name = {"Das","Das","Dey","Mondal","Mandal","Samanta","Halder","Tudu","Naskar","Oraon","Hansda","Dasgupta","Ghosh","Dutta","Biswas","Kundu","Kumar","Bhowmick","Chakraborty","Banerjee","Chatterjee","Paul","Pal","Kumar","Sarkar","Debnath","Chowdhury","Mukherjee","Roy","Majumder"};
       double max=23;
       double min=17;
       
       final int n=11;
       final int m=6;
       String[] pos=new String [n];
       String[] p=new String [m];
       int i=0;
       int j=0;
       pos[0]="GK";
       pos[1]="DF";
       pos[2]="DF";
       pos[3]="DF";
       pos[4]="DF";
       pos[5]="MF";
       pos[6]="MF";
       pos[7]="MF";
       pos[8]="FW";
       pos[9]="FW";
       pos[10]="FW";
       p[0]="Head Coach";
       p[1]="Assistant Coach";
       p[2]="Manager";
       p[3]="Physio";
       p[4]="Technical Director";
       p[5]="Goalkeeping Coach";
       int l1=f_name.length;
       int l2=l_name.length;
       for ( i=0;i<n;i++)
       {
           double age = (short)(Math.random()*((max-min)+1))+min;
           int y= (int) age;
       System.out.println("\t"+pos[i]+" "+ f_name[generate.nextInt(l1)]+ " "+ l_name[generate.nextInt(l2)]+ " (Age "+y+")");
    }
    System.out.println("\n Technical Staff \n");
    for ( j=0;j<m;j++)
    {
        System.out.println("\t"+p[j]+"- "+f_name[generate.nextInt(l1)]+ " "+ l_name[generate.nextInt(l2)]);
    }
}
}
