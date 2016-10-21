package com.ideamart.sample.common;

/**
 * Created by Ehelepola on 20/01/2016.
 */
public final class Constants {

    public static final class ApplicationConstants {
        public static final String USSD_OP_MO_INIT = "mo-init";
        public static final String USSD_OP_MT_CONT = "mt-cont";
        public static final String USSD_OP_MT_FIN = "mt-fin";
        public static final String USSD_URL = "http://127.0.0.1:7000/ussd/send";
        public static final String PASSWORD = "password";
        public static final String APP_ID = "APP_00001";
        public static final String SMS_URL = "http://127.0.0.1:7000/sms/send";
        public static final String JDBC_URL = "jdbc:mysql://localhost:3306/Pradeep";
        public static final String DATABASE_USERNAME = "root";
        public static final String DATABASE_PASSWORD = "";

        // Subscription Message Url (OPT_IN/OPT_OUT)
        public static final String SUBSCRIPTION_MESSAGE_URL = "http://127.0.0.1:7000/subscription/send";

        // Subscription BaseSize Url for get the Base Size.
        public static final String SUBSCRIPTION_BASESIZE_URL = "http://127.0.0.1:7000/subscription/query-base";

        // Subscription Status Url
        public static final String SUBSCRIPTION_STATUS_URL = "http://127.0.0.1:7000/subscription/getStatus";
        // For registration action should be 1 (0 - Opt Out | 1 - Opt In)
        public static final String REG_ACTION = "1";

        //Specific Version
        public static final String VERSION = "1.0";


    }

    public static final class MessageConstants {
        public static final String WELCOME_MESSAGE = "1. Liyapadinchi Wenna\n2. Udaw\n3.Apa Gana Thathu\n99.Exit";
        public static final String REGISTER_MENU = "apa samaga liyapadinchi wuwata isthuthui.\n" +
                "    obata keti paniwidayak magin awashya Thorathuru labenu atha.\n0. Back\n99. Exit";
        public static final String WELCOME_SMS = "welcome to echat ussd application.\n" +
                "            obata awashya thorathuru pahatha dakwei.\n" +
                " \n" +
                "            1.Usename ekak thoraganimata:-\n" +
                "            echat <Space> UN <Space> Your name \n" +
                "            Sent To (application number).\n" +
                "\n" +
                "            2.Chat Kirimata:-echat <Space> chat <Space> Friends Username <Space> Your message \n" +
                "            sent to (application number)\n" +
                "              Ex:- \"echat chat saman hello mchn sent to (application number)\n";
        public static final String HELP_MENU = "obata keti paniwidayak magin awashya Thorathuru labenu atha.\n" +
                "0. Back\n" +
                "99. Exit";
        public static final String HELP_SMS = "welcome to echat ussd application.\n" +
                "   obata awashya thorathuru pahatha dakwei.\n" +
                "\n" +
                "    1.Usename ekak thoraganimata:-echat <Space> UN <Space> Your name \n" +
                "    Sent To (application number).\n" +
                "\n" +
                "    2.Chat Kirimata:-echat <Space> chat <Space> Friends Username <Space> Your message \n" +
                "    sent to (application number)\n" +
                "\n" +
                "    3.Chat Kirimata Kenek Soyaganimata:- echat <Space> Find sent to (application number)";
        public static final String DETAILS_MENU = "Sp Name:-S.M.P.K Senevirathna\nDeveloper: tharinda221@gmail.com\n" +
                "0. Back\n99. Exit";
        public static final String EXIT_MESSAGE = "Thank you for used echat. Come again";

    }
}
