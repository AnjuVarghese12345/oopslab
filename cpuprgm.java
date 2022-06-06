class cpu
{
double price;
  class processor
    {
     double no_core=5;
     String manufacturer="intel";
     void display()
      {
      System.out.println("Core:i"+no_core);
      System.out.println("Manufacturer:"+manufacturer);
      }
    }
   static class ram
     {
      double memory=456.77;
      String manufacturer="Corsair";
      void displaytwo()
      {
      System.out.println("Memory:"+memory+"GB");
      System.out.println("Manufacturer:"+manufacturer);
      }
    }
}
class cpuprgm   
{
public static void main(String[] args)
{
cpu cpuobj = new cpu();
cpu.processor processorobj = cpuobj.new processor();
cpu.ram ramobj =  new cpu.ram();
processorobj.display();
ramobj.displaytwo();
}
}


