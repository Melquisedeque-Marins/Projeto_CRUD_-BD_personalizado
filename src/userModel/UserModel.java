package userModel;

public class UserModel {

    private String name;
    private String user; 
    private String password; 

public UserModel(){
    
}  

    public UserModel(String name, String user, String password) {
        this.name = name;
        this.user = user; 
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
    
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserModel{" + "name=" + name + ", user=" + user + ", password=" + password + '}';
    }


    
    
    
}
