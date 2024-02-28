import java.util.Scanner;

class LibrarySystem {
    Scanner scanner = new Scanner(System.in);

    void start() {
        int choice;
        String nim, username, password;
        boolean isLoggedIn = false;

        while (!isLoggedIn) {
            System.out.println("===== MENU =====");
            System.out.println("1. Login untuk mahasiswa");
            System.out.println("2. Login untuk Admin");
            System.out.println("3. Kembali");
            System.out.print("Pilih Opsi (1-3): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("masukkan 3 digit NIM terakhir: ");
                    nim = scanner.next();
                    isLoggedIn = loginStudent(nim);
                    break;
                case 2:
                    System.out.print("Masukkan Username : ");
                    username = scanner.next();
                    System.out.print("Masukkan Password : ");
                    password = scanner.next();
                    isLoggedIn = loginAdmin(username, password);
                    break;
                case 3:
                    System.out.println("Terimakasih");
                    System.exit(0);
                default:
                    System.out.println("Opsi tidak valid, harap pilih angka antara 1 dan 3.");
            }
        }
    }

    boolean loginStudent(String nim) {
        if (nim.length() == 3) {
            if ("374".equals(nim)) {
                System.out.println("Login Sukses");
                return true;
            } else {
                System.out.println("NIM Tidak di temukan");
            }
        } else {
            System.out.println("Format NIM tidak valid, harap gunakan angka 3 digit.");
        }
        return false;
    }

    boolean loginAdmin(String username, String password) {
        if ("Bobyyohansyah".equals(username) && "374".equals(password)) {
            System.out.println("Login admin sukses");
            return true;
        } else {
            System.out.println("Admin tidak di temukan");
        }
        return false;
    }
}

public class bobyy{
    public static void main(String[] args) {
        LibrarySystem librarySystem = new LibrarySystem();
        librarySystem.start();
    }
}

