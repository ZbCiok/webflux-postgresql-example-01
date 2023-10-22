package zjc.examples.webflux.postgresql.model;

import org.springframework.data.annotation.Id;

public class Organization {
  
  @Id
  private int id;

  private String name;

  private String description;

  private boolean published;

  public Organization() {

  }

  public Organization(String name, String description, boolean published) {
    this.name = name;
    this.description = description;
    this.published = published;
  }

  public void setId(int id) {
    this.id = id;
  }
  
  public long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public boolean getPublished() {
    return published;
  }

  public void setPublished(boolean isPublished) {
    this.published = isPublished;
  }

  @Override
  public String toString() {
    return "Organization [id=" + id + ", name=" + name + ", desc=" + description + ", published=" + published + "]";
  }

}
