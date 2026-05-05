class UserSession {
    private static UserSession instance;
    public String username, role, token;

    private UserSession(String username, String role, String token) {
        this.username = username;
        this.role = role;
        this.token = token;
    }

    public static UserSession getInstance(String username, String role, String token) {
        if(instance == null) {
            instance = new UserSession(username, role, token);
        }

        return instance;
    }
}