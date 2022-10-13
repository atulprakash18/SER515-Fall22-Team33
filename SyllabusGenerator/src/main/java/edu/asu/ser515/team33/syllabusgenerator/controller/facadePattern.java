public class Facade
{
    public static void main (String[] args)
    {
        Controller obj  = new Controller();
          
        Importer imp = obj.importFile();
        Generator gen = obj.generateSyllabus();
        Exporter exp = obj.exportFile();
    }
}       