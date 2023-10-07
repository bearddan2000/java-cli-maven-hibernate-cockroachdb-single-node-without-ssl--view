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
@Table(name = "dog")
public class DogEntity {

  @Id
  @Column(unique = true, nullable = false)
  private Integer id;

  @Column(nullable = false)
  private Integer colorId;

  @Column(nullable = false)
  private Integer breedId;

  public DogEntity(int a, int b, int c){ id=a; breedId=b; colorId=c;}

  public Integer getId(){ return id;}
  public void setId(Integer value){id = value;}

  public Integer getColor(){ return colorId;}
  public void setColor(Integer value){colorId = value;}

  public Integer getBreed(){ return breedId;}
  public void setBreed(Integer value){breedId = value;}

  @Override
  public String toString(){return String.format("[OUTPUT] %d, breed=%d, color=%d", id, breedId, colorId);}
}
