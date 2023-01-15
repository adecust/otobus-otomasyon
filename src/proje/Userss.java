
package proje;

 abstract class Userss {
    private String username;
    private String pass;
    private String Type;

    public Userss(String username, String pass, String Type) {
        this.username = username;
        this.pass = pass;
        this.Type = Type;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }
    

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
    
}
