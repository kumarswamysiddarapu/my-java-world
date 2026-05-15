package Serialization;

import java.io.Serializable;

public class Student implements Serializable {
      int id;
      String name;
      double score;
      public Student(int id,String name,double score)
        {
            this.id=id;
            this.name=name;
            this.score=score;
        }
}
