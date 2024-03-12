/*Nama file : BankApp.java
 *Nama/NIM  : Yesi Dwi Ningtias/24060122120027
 Praktikum PBO D1 - Pertemuan 3
 */

public class BankApp {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(500.0);

        try {
            // Skenario saldo mencukupi
            account.withdraw(200.0);
            System.out.println("Saldo saat ini: $" + account.getBalance());

            // Skenario saldo tidak mencukupi
            account.withdraw(400.0);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
