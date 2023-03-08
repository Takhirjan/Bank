public class Database {
    public static BankAccount allAccounts[] = new BankAccount[10];

    static {
        allAccounts[0] = new CityBankAccount("Ilyas", "Zhuanyshev", "KZ010322312", "0102", 20000);
        allAccounts[1] = new CityBankAccount("Mike", "Hellen", "KZ010322313", "0101", 10000);
        allAccounts[2] = new NationalBankAccount("Ilyas Zhuanyshev", "KZ0101112", "0152", 2000);
        allAccounts[3] = new CityBankAccount("Nursultan", "Nazarbayev", "KZ010322315", "0152", 90000);
        allAccounts[4] = new CityBankAccount("Kuanysh", "Asanova", "KZ010322413", "0151", 14000);
        allAccounts[5] = new CityBankAccount("Ilyas", "Ilyasov", "KZ01034422312", "0702", 258000);
        allAccounts[6] = new CityBankAccount("Erbol", "Nurtas", "KZ014522313", "0141", 8000);
        allAccounts[7] = new CityBankAccount("Takhirzhan", "Abdykarimov", "KZ010347212", "0242", 400000);
        allAccounts[8] = new CityBankAccount("Nurzhugit", "Turman", "KZ88322313", "2589", 60000);
        allAccounts[9] = new CityBankAccount("Ereker", "Ereke", "KZ010347312", "0152", 25000);


        };
    }

