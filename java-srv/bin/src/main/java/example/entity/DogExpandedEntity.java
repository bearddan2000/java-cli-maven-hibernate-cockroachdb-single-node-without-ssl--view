package example.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import org.hibernate.annotations.OptimisticLockType;

@Entity
@org.hibernate.annotations.Entity(dynamicUpdate = true, optimisticLock = OptimisticLockType.ALL)
@Table(name = "dogexpanded")
public class DogExpandedEntity {

  @Id
  @Column(unique = true, nullable = false)
  private Integer id;

  @Column(nullable = false, length = 10)
  private String color;

  @Column(nullable = false, length = 100)
  private String breed;

  public DogExpandedEntity(){}

  public DogExpandedEntity(int a, String b, String c)
  {
    id = a;
    color = b;
    breed = c;
  }

  public Integer getId(){ return id;}
  public void setId(Integer value){id = value;}

  public String getColor(){ return color;}
  public void setColor(String value){color = value;}

  public String getBreed(){ return breed;}
  public void setBreed(String value){breed = value;}

  @Override
  public String toString(){return String.format("[OUTPUT] %d, breed=%s, color=%s", id, breed, color);}
}
