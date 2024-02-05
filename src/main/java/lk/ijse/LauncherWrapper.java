package lk.ijse;


public class LauncherWrapper {
    public static void main(String[] args) {
        Launcher.main(args);

//        Thread serverThread = new Thread(() -> {
//            try {
//                Server.main(new String[]{});
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        });
//        serverThread.start();
//        Launcher.main(args);
    }
}
