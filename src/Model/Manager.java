
package Model;


public class Manager{
    private String cpf;
    private String name;
    private String password;

    public Manager(String cpf, String name, String password) {
        this.cpf = cpf;
        this.name = name;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
    
    
}
