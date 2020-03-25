package com.FileHandling;

import java.io.*;

public class Read3Files {

public static void main(String[] args) throws IOException {
File file=new File("F:\\IBM\\FileList\\A.txt");
File file1= new File("F:\\IBM\\FileList\\B.txt");
File file2= new File("F:\\IBM\\FileList\\c.txt");

FileInputStream fin1=new FileInputStream(file);
FileInputStream fin2=new FileInputStream(file1);
FileInputStream fin3=new FileInputStream(file2);

SequenceInputStream sis=new SequenceInputStream(fin1,fin2);
SequenceInputStream sis1=new SequenceInputStream(sis,fin3);

int i;
while((i=sis1.read())!=-1)
{
System.out.print((char)i);
}
sis1.close();
fin1.close();
fin2.close();
fin3.close();

}

}
