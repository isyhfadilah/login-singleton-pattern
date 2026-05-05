public class App {
    public static void main(String[] args) throws Exception {
        UserSession session1 = UserSession.getInstance("Aisyah", "Mahasiswa", "123");
        System.out.println("Session 1: " + session1.username);

        UserSession session2 = UserSession.getInstance("Frisco", "Mahasiswa", "123");
        System.out.println("Session 2: " + session2.username);
    }
}
