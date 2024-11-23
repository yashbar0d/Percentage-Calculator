import java.io.*;
class calculator
{
public static void main(String gg[])
{
try
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
try
{
System.out.print("Enter a number of Physics : ");
int physics=Integer.parseInt(br.readLine());
if(physics<0 || physics>100)
{
System.out.println("Invalid number.");
return;
}
System.out.print("Enter a number of Chemistry : ");
int chemistry=Integer.parseInt(br.readLine());
if(chemistry<0 || chemistry>100)
{
System.out.println("Invalid number.");
return;
}
System.out.print("Enter a number of maths : ");
int maths=Integer.parseInt(br.readLine());
if(maths<0 || maths>100)
{
System.out.println("Invalid number.");
return;
}
System.out.print("Enter a number of Hindi : ");
int hindi=Integer.parseInt(br.readLine());
if(hindi<0 || hindi>100)
{
System.out.println("Invalid number.");
return;
}
System.out.print("Enter a number of English : ");
int english=Integer.parseInt(br.readLine());
if(english<0 || english>100)
{
System.out.println("Invalid number.");
return;
}
int total=0;
int percentage=0;
System.out.print("   -------------------\n");
while(true)
{
if(physics>=33 && chemistry>=33 && maths>=33 && hindi>=33 && english>=33)
{
total=physics+chemistry+maths+hindi+english;
percentage=(total*100/500);
System.out.println("  | Total marks: "+total+"  "+"|");
System.out.println("  | Precentage: "+percentage+"%"+"   "+"|");
if(percentage<60 && percentage>=50)
{
System.out.println("  | Second Division   |");
System.out.println("   -------------------");
break;
}
if(percentage>=60)
{
System.out.println("  | First Division    |");
System.out.println("   -------------------");
break;
}
else
{
System.out.println("  | Third Division    |");
System.out.println("   -------------------");
break;
}
}
if(physics<33 && chemistry>=33 && maths>=33 && hindi>=33 && english>=33)
{
System.out.println("Supplementry in physics.");
break;
}else 
if(physics>=33 && chemistry<33 && maths>=33 && hindi>=33 && english>=33)
{
System.out.println("Supplementry in Chemistry.");
break;
}else
if(physics>=33 && chemistry>=33 && maths<33 && hindi>=33 && english>=33)
{
System.out.println("Supplementry in Maths\n.");
break;
}else
if(physics>=33 && chemistry>=33 && maths>=33 && hindi<33 && english>=33)
{
System.out.println("Supplementry in Hindi.");
break;
}
else if(physics>=33 && chemistry>=33 && maths>=33 && hindi>=33 && english<33)
{
System.out.println("Supplementry in English.");
break;
}
//2
else if(physics<33 && chemistry<33 && maths>=33 && hindi>=33 && english>=33)
{
System.out.println("Supplementry in physics and chemistry.");
break;
}else
if(physics<33 && chemistry>=33 && maths<33 && hindi>=33 && english>=33)
{
System.out.println("Supplementry in physics and maths.");
break;
}else
if(physics<33 && chemistry>=33 && maths>=33 && hindi<33 && english>=33)
{
System.out.println("Supplementry in physics and hindi.");
break;
}else
if(physics<33 && chemistry>=33 && maths>=33 && hindi>=33 && english<33)
{
System.out.println("Supplementry in physics and english.");
break;
}else
if(physics>=33 && chemistry<33 && maths<33 && hindi>=33 && english>=33)
{
System.out.println("Supplementry in chemistry and maths.");
break;
}else
if(physics>=33 && chemistry<33 && maths>=33 && hindi<33 && english>=33)
{
System.out.println("Supplementry in chemistry and hindi.");
break;
}else
if(physics>=33 && chemistry<33 && maths>=33 && hindi>=33 && english<33)
{
System.out.println("Supplementry in chemistry and english.");
break;
}else
if(physics>=33 && chemistry>=33 && maths<33 && hindi<33 && english>=33)
{
System.out.println("Supplementry in maths and hindi.");
break;
}else
if(physics>=33 && chemistry>=33 && maths<33 && hindi>=33 && english<33)
{
System.out.println("Supplementry in maths and english.");
break;
}else
if(physics>=33 && chemistry>=33 && maths>=33 && hindi<33 && english<33)
{
System.out.println("Supplementry in hindi and english.");
break;
}
else if(physics<33 && chemistry<33 && maths<33 && hindi>=33 && english>=33)
{
System.out.println("Supplementry in Physics.");
System.out.println("Supplementry in Chemistry.");
System.out.println("Supplementry in Maths.");
break;
}else 
if(physics<33 && chemistry<33 && maths>=33 && hindi<33 && english>=33)
{
System.out.println("Supplementry in Physics.");
System.out.println("Supplementry in Chemistry.");
System.out.println("Supplementry in Hindi.");
break;
}else
if(physics<33 && chemistry<33 && maths>=33 && hindi>=33 && english<33)
{
System.out.println("Supplementry in Physics.");
System.out.println("Supplementry in Chemistry.");
System.out.println("Supplementry in English.");
break;
}else
if(physics<33 && chemistry>=33 && maths<33 && hindi<33 && english>=33)
{
System.out.println("Supplementry in Physics.");
System.out.println("Supplementry in Maths.");
System.out.println("Supplementry in Hindi.");
break;
}else
if(physics<33 && chemistry>=33 && maths<33 && hindi>=33 && english<33)
{
System.out.println("Supplementry in Physics.");
System.out.println("Supplementry in Maths.");
System.out.println("Supplementry in English.");
break;
}else
if(physics<33 && chemistry>=33 && maths>=33 && hindi<33 && english<33)
{
System.out.println("Supplementry in Physics.");
System.out.println("Supplementry in Hindi.");
System.out.println("Supplementry in English.");
break;
}else 
if(physics>=33 && chemistry<33 && maths<33 && hindi<33 && english>=33)
{
System.out.println("Supplementry in Chemistry.");
System.out.println("Supplementry in Maths.");
System.out.println("Supplementry in Hindi.");
break;
}else 
if(physics>=33 && chemistry<33 && maths<33 && hindi>=33 && english<33)
{
System.out.println("Supplementry in Chemistry.");
System.out.println("Supplementry in Maths.");
System.out.println("Supplementry in English.");
break;
}else
if(physics>=33 && chemistry<33 && maths>=33 && hindi<33 && english<33)
{
System.out.println("Supplementry in Chemistry.");
System.out.println("Supplementry in Hindi.");
System.out.println("Supplementry in English.");
break;
}else
if(physics>=33 && chemistry>=33 && maths<33 && hindi<33 && english<33)
{
System.out.println("Supplementry in Maths.");
System.out.println("Supplementry in Hindi.");
System.out.println("Supplementry in English.");
break;
}
else
{
System.out.println("FAIL\n");
break;
}
}
}catch(NumberFormatException nfe)
{
System.out.println("Invalid input");
}
}catch(IOException ioe)
{
System.out.println(ioe.getMessage());
}
}
}