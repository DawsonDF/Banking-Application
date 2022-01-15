
public class DAO {

  private String username;
  private String firstName;
  private String lastName;
  private String id;

  public String getUsername () {
    return this.username;
  }
  public void setUsername(String username){
    this.username = username;
  }
  public String getFirstName () {
    return this.firstName;
  }
  public void setFirstName(String firstName){
    this.firstName = firstName;
  }
  public String getLastName () {
    return this.lastName;
  }
  public void setLastName(String lastName){
    this.lastName = lastName;
  }
  public String getId () {
    return this.id;
  }
  public void setId(String id){
    this.id = id;
  }

  public DAO(String username, String firstName, String lastName, String password){

    this.username = username;
    this.firstName = firstName;
    this.lastName = lastName;
    this.password = password;

  }
}
