package Java.lesson6.cashMachine;

public class CashMachine {

    public int banknote20;
    public int banknote50;
    public int banknote100;
    public int allMoney;

    public CashMachine(int banknote20, int banknote50, int banknote100) {
        this.banknote20 = banknote20;
        this.banknote50 = banknote50;
        this.banknote100 = banknote100;
    }

    public void addMoney(int add20, int add50, int add100) {
        banknote20 += add20;
        banknote50 += add50;
        banknote100 += add100;
        allMoney = banknote20 * 20 + banknote50 * 50 + banknote100 * 100;
    }

    @Override
    public String toString() {
        return "CashMachine{" +
                "banknote20=" + banknote20 +
                ", banknote50=" + banknote50 +
                ", banknote100=" + banknote100 +
                ", allMoney=" + allMoney +
                '}';
    }

    public boolean takeAwayMoney(int sum) {
        if ((sum <= 0) || (sum > allMoney) || (sum % 10 != 0)) {
            System.out.println("Недостаточно средств в банкомате или некорректная сумма");
            return false;
        } else {
            int countBanknote100 = 0;
            while (sum >= 100) {
                if (banknote100 == 0) {
                    break;
                }
                countBanknote100++;
                banknote100--;
                sum -= 100;
            }

            int countBanknote50 = 0;
            while (sum >= 50) {
                if (banknote50 == 0) {
                    break;
                }
                countBanknote50++;
                banknote50--;
                sum -= 50;
            }

            int countBanknote20 = 0;
            while (sum >= 20) {
                if (banknote20 == 0) {
                    break;
                }
                countBanknote20++;
                banknote20--;
                sum -= 20;
            }

            if (sum != 0) {
                return false;
            }
            System.out.println(countBanknote100 + " банконот по 100, " + countBanknote50 + " - по 50, " +
                    countBanknote20 + " - по 20 ");
            return true;
        }
    }
}