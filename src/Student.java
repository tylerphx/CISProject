public class Student {
  private int ID;
  private double GPA;
    public Student(int ID, double GPA)
    {
       this.ID = ID;
       this.GPA = GPA;
    }
    public int GetID()
    {
        return ID;
    }
    public double GetGPA()
    {
        return GPA;
    }
}
