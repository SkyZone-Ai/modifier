
package modifier_constructor_SetGet;


public class User1 {
    public String username;
    public String password;
    
    public User1(String username,String password){
        this.username = username;
        this.password = password;
    }

    User1() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
