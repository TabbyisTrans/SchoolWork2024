/**
 * Login
 */
public class Login {

    private String siteName;
    private String username;
    private String password;

    public Login(String siteName, String username, String password) {
        this.siteName = siteName;
        this.username = username;
        this.password = password;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static String generatePassword() {
        String password = "";
        for(int i = 1; i <= 20; i++) {
            if(i % 2 == 0) {
                password += "-";
            }
            password += (int)(Math.random() * 10);
        }
        return password;
    }
}