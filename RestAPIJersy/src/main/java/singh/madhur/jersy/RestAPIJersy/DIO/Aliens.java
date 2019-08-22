package singh.madhur.jersy.RestAPIJersy.DIO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Aliens 
{
	@Id
	@Column(name = "ALIEN_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "ALIEN_ID")
	private String name;
	
	@Column(name = "ALIEN_POINT")
	private int points;
	
	
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	
  public String getName() {
	return name;
}
  public int getPoints() {
	return points;
}
  public void setName(String name) {
	this.name = name;
}
  public void setPoints(int points) {
	this.points = points;
}

}
