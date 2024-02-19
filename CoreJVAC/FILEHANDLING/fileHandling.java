import java.io.*;
class fileHandling
{
               public static void main(String[] args) throws IOException {

                              /* File creation */
                              File f1=new File("Priyanshu.txt");
                              System.out.println("Check :"+f1.exists());
                              f1.createNewFile();
                              System.out.println(f1.exists());


                              /* Directory cretion */
                              File dir=new File("Priyanshu");
                              System.out.println(dir.exists());
                              dir.mkdirs();
                              System.out.println(dir.equals(dir));

                              /* Reading in file */
                         
                              FileWriter fw=new FileWriter(f1,true); /* its means just append data not any cchangr existing data */
                              fw.write("Priyanshu Singh");
                              fw.write("\n");

                              fw.write(89);
                              fw.write("\n");

                               char ch[]={'a','b'};
                               fw.write(ch);
                              fw.write("\n");

                              
       fw.write("java");
       fw.write("\n");
       fw.write(65);
       fw.write("\n");
       fw.write(97);
       fw.write("\n");
       char ch1[]={'j', 'a', 'v', 'a'};
       fw.write(ch1);
       fw.write("\n");

       //fw.close();
       fw.flush();

       System.out.println("open pw.txt to see result");

                              fw.close();
               }
}