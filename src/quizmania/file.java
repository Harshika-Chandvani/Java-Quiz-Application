/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quizmania;
import java.io.*;
import java.io.FileNotFoundException;
import java.io.IOException;

class file 
{ 
 public static void main(String args[]) 
 { 
 String f_name1 = args[0]; 
 String f_name2 = args[1]; 
 FileReader Infile = null; 
 FileWriter Outfile = null; 
 int ReadC; 
 try 
 { 
 Infile = new FileReader(f_name1); 
 Outfile = new FileWriter(f_name2); 
 while((ReadC = Infile.read()) != -1) 
 { 
 System.out.print((char)ReadC); 
 Outfile.write(ReadC); 
 } 
 } 
 catch(FileNotFoundException e) 
 { 
 System.out.println("File Not Found!"); 
 } 
 catch(IOException e) 
 { 
 System.out.println(e.getMessage()); 
 } 
 finally 
 { 
 try 
 { 
 Infile.close(); 
 Outfile.close(); 
 } 
 catch(IOException e) 
 { 
 System.out.println(e.getMessage()); 
 } 
 } 
 } 
}

