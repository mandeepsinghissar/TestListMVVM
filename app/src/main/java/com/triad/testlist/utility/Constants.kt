package com.triad.testlist.utility

interface Constants {
    interface Url {
        companion object {

            const val TESTlIST =
                baseUrl + "users"

        }
    }

    interface FragmentTags {
        companion object {
        }
    }

    interface PreferenceConstants {
        companion object {
            const val DEVICE = "DEVICE"

            // Login related

            const val USER_NAME = "username"
            const val USER_ID = "id"
            const val TOKEN = "token"
            const val USER_PASSWORD = "password"
            const val REG_ID = "Device_id"
            const val STATUS = "status"
            const val FIRST_NAME = "fname"
            const val POINTS = "points"
            const val LAST_NAME = "lname"
            const val TIER = "tier"
            const val UNIQUE_CODE = "uniquecode"
            const val ADDRESS_ONE = "add1"
            const val ADDRESS_TWO = "add2"
            const val CITY = "city"
            const val PINCODE = "pincode"
            const val LANDMARK = "landmark"
            const val STATE = "state"
            const val MOBILE = "mobile"
            const val NAME = "NAME"
            const val first_time_login = "first_time_login"
            const val ZONE = "zone"
            const val EMAIL = "email"
            const val ARE_LIST = "are_list"
            const val PROMOTER_ID = "promoter_id"
            const val PROMOTER_NAME = "promoter_name"
            const val PROMOTER_MOBILE = "promoter_mobile"
            const val NOTI_COUNT = "NotiCount"
            const val THEME = "THEME"
            const val Time = "Time"
            const val Role = "Role" //String USER_Type="USER_Type";
        }
    }


    companion object {
        const val EncryKey = "000"
        const val tokenKey = "000"
        const val EQUAL = "="
        const val AMPERSAND = "&"
        val limitedDeviceInfo = StringBuffer()
        const val KeyToken = "000" //"000";

        const val usertypeARS = "ars"
        const val ERRORCODE = "0"
        const val SUCCESS = 200
        const val SUCCESSCODE = "1"
        const val SUCCESSMSGCODE = "2"
        const val AUTHFAILURECODE = "-1"
        const val baseUrl = "https://gorest.co.in/public-api/"
        const val APP_TERMS_AND_CONDITION_LOGIN = "000"




        const val sod = "{\n" +
                "  \"message\":\"msg\",\n" +
                "  \"status\":\"1\",\n" +
                "  \"data\":[\n" +
                " \n" +
                "\n" +
                "  { \n" +
                "     \"isRequired\":\"1\",\n" +
                "     \"dependent\":\"2\",\n" +
                "    \"no\":\"1\",\"ques\":\"ques1\",\n" +
                "    \"type\":\"radiobtn\",\n" +
                "    \"options\":[\"jio\",\"airtel\",\"voda\"],\n" +
                "    \"option_type\":\"single\",\n" +
                "    \"other\":\"\"\n" +
                "\n" +
                "  },\n" +
                "  {\n" +
                "     \"dependent\":\"2\",\n" +
                " \"isRequired\":\"1\",\n" +
                "     \"no\":\"2\", \"ques\":\"ques2\",\n" +
                "    \"type\":\"checkbox\",\n" +
                "    \"options\":[\"jio\",\"airtel\",\"voda\"],\n" +
                "    \"option_type\":\"number\",\n" +
                "    \"other\":\"\"\n" +
                "\n" +
                "   },\n" +
                "  {\n" +
                "     \"dependent\":\"2\",\n" +
                " \"isRequired\":\"1\",\n" +
                "     \"no\":\"3\", \"ques\":\"ques2\",\n" +
                "    \"type\":\"edittext\",\n" +
                "    \"options\":[],\n" +
                "    \"option_type\":\"number\",\n" +
                "    \"other\":\"\"\n" +
                "\n" +
                "   },\n" +
                "  {\n" +
                "     \"dependent\":\"2\",\n" +
                " \"isRequired\":\"1\",\n" +
                "    \"no\":\"4\",  \"ques\":\"ques3\",\n" +
                "    \"type\":\"pic\",\n" +
                "    \"options\":[],\n" +
                "    \"option_type\":\"\",\n" +
                "    \"other\":\"\"\n" +
                "\n" +
                "   },\n" +
                "  {\n" +
                "     \"dependent\":\"2\",\n" +
                " \"isRequired\":\"1\",\n" +
                "     \"no\":\"5\", \"ques\":\"ques4\",\n" +
                "    \"type\":\"model\",\n" +
                "    \"options\":[],\n" +
                "    \"option_type\":\"\",\n" +
                "    \"other\":\"\"\n" +
                "\n" +
                "   }\n" +
                ",\n" +
                "  {\n" +
                "     \"dependent\":\"2\",\n" +
                " \"isRequired\":\"1\",\n" +
                "     \"no\":\"6\", \"ques\":\"ques4\",\n" +
                "    \"type\":\"modelWithQty\",\n" +
                "    \"options\":[],\n" +
                "    \"option_type\":\"\",\n" +
                "    \"other\":\"\"\n" +
                "\n" +
                "   },\n" +
                "\n" +
                " { \n" +
                " \"isRequired\":\"1\",\n" +
                "     \"dependent\":\"2\",\n" +
                "    \"no\":\"7\",\"ques\":\"ques1\",\n" +
                "    \"type\":\"radiobtn\",\n" +
                "    \"options\":[\"jio\",\"airtel\",\"voda\"],\n" +
                "    \"option_type\":\"single\",\n" +
                "    \"other\":\"\"\n" +
                "\n" +
                "  },\n" +
                "  {\n" +
                "     \"dependent\":\"2\",\n" +
                " \"isRequired\":\"1\",\n" +
                "     \"no\":\"8\", \"ques\":\"ques2\",\n" +
                "    \"type\":\"checkbox\",\n" +
                "    \"options\":[\"jio\",\"airtel\",\"voda\"],\n" +
                "    \"option_type\":\"number\",\n" +
                "    \"other\":\"\"\n" +
                "\n" +
                "   },\n" +
                "  {\n" +
                "     \"dependent\":\"2\",\n" +
                " \"isRequired\":\"1\",\n" +
                "     \"no\":\"9\", \"ques\":\"ques2\",\n" +
                "    \"type\":\"edittext\",\n" +
                "    \"options\":[],\n" +
                "    \"option_type\":\"number\",\n" +
                "    \"other\":\"\"\n" +
                "\n" +
                "   },\n" +
                "  {\n" +
                "     \"dependent\":\"2\",\n" +
                " \"isRequired\":\"1\",\n" +
                "    \"no\":\"10\",  \"ques\":\"ques3\",\n" +
                "    \"type\":\"pic\",\n" +
                "    \"options\":[],\n" +
                "    \"option_type\":\"\",\n" +
                "    \"other\":\"\"\n" +
                "\n" +
                "   },\n" +
                "  {\n" +
                "     \"dependent\":\"2\",\n" +
                " \"isRequired\":\"1\",\n" +
                "     \"no\":\"11\", \"ques\":\"ques4\",\n" +
                "    \"type\":\"model\",\n" +
                "    \"options\":[],\n" +
                "    \"option_type\":\"\",\n" +
                "    \"other\":\"\"\n" +
                "\n" +
                "   }\n" +
                ",\n" +
                "  {\n" +
                "     \"dependent\":\"2\",\n" +
                "    \"isRequired\":\"2\",\n" +
                "     \"no\":\"12\", \"ques\":\"ques4\",\n" +
                "    \"type\":\"modelWithQty\",\n" +
                "    \"options\":[],\n" +
                "    \"option_type\":\"\",\n" +
                "    \"other\":\"\"\n" +
                "\n" +
                "   }\n" +
                "\n" +
                "\n" +
                " ]\n" +
                "}"
        const val questionJSON = "[" +
                "{\"q\":\"Is GSB available?\",\"phase\":\"Attract\",\"label\":\"yes\",\"pic\":\"true\",\"points\":\"2.5\",\"end\":\"false\"}," +
                "{\"q\":\"Is Flange available?\",\"phase\":\"Attract\",\"label\":\"yes\",\"pic\":\"true\",\"points\":\"2.5\",\"end\":\"false\"}," +
                "{\"q\":\"Is Standee available?\",\"phase\":\"Attract\",\"label\":\"yes\",\"pic\":\"true\",\"points\":\"2.5\",\"end\":\"false\"}," +
                "{\"q\":\"Glass branding available?\",\"phase\":\"Attract\",\"label\":\"yes\",\"pic\":\"true\",\"points\":\"2.5\",\"end\":\"false\"}," +
                "{\"q\":\"Any other visibility element?\",\"phase\":\"Attract\",\"label\":\"yes\",\"pic\":\"true\",\"points\":\"2.5\",\"end\":\"true\"}," +
                "{\"q\":\"Is it available in first 3 rows?\",\"phase\":\"Discoverability\",\"label\":\"yes\",\"pic\":\"true\",\"points\":\"0\",\"end\":\"false\"}," +
                "{\"q\":\"Is it available in front of the row or back of the row?\",\"phase\":\"Discoverability\",\"label\":\"front\",\"pic\":\"false\",\"points\":\"20\",\"end\":\"false\"}," +
                "{\"q\":\"Is it available in 4-6 numbered rows?\",\"phase\":\"Discoverability\",\"label\":\"yes\",\"pic\":\"true\",\"points\":\"0\",\"end\":\"false\"}," +
                "{\"q\":\"Is it available in front of the row or back of the row?\",\"phase\":\"Discoverability\",\"label\":\"front\",\"pic\":\"false\",\"points\":\"10\",\"end\":\"false\"}," +
                "{\"q\":\"Is it available in first >6 numbered row?\",\"phase\":\"Discoverability\",\"label\":\"yes\",\"pic\":\"true\",\"points\":\"0\",\"end\":\"false\"}," +
                "{\"q\":\"is it available in front of the row or back of the row?\",\"phase\":\"Discoverability\",\"label\":\"front\",\"pic\":\"false\",\"points\":\"0\",\"end\":\"true\"}," +
                "{\"q\":\"Promoter hygiene- well groomed\",\"phase\":\"Promoter\",\"label\":\"yes\",\"pic\":\"true\",\"points\":\"0\",\"end\":\"false\"}," +
                "{\"q\":\"Promoter wearing uniform?\",\"phase\":\"Promoter\",\"label\":\"yes\",\"pic\":\"true\",\"points\":\"0\",\"end\":\"true\"}," +
                "{\"q\":\"Are 2 Devices charged and working?\",\"phase\":\"Live Device\",\"label\":\"yes\",\"pic\":\"true\",\"points\":\"5\",\"end\":\"false\"}," +
                "{\"q\":\"Are 2 Devices deployed on fixture with Security System?\",\"phase\":\"Live Device\",\"label\":\"yes\",\"pic\":\"true\",\"points\":\"5\",\"end\":\"false\"}," +
                "{\"q\":\"Is security system fully working?\",\"phase\":\"Live Device\",\"label\":\"yes\",\"pic\":\"false\",\"points\":\"5\",\"end\":\"false\"}," +
                "{\"q\":\"Is look and feel of fixture OK? (no repair needed)\",\"phase\":\"Live Device\",\"label\":\"yes\",\"pic\":\"true\",\"points\":\"5\",\"end\":\"false\"}," +
                "{\"q\":\"Are all lights in fixture working?\",\"phase\":\"Live Device\",\"label\":\"yes\",\"pic\":\"true\",\"points\":\"5\",\"end\":\"false\"}," +
                "{\"q\":\"Are all accessories stock merchandised, no hook empty?\",\"phase\":\"Live Device\",\"label\":\"yes\",\"pic\":\"true\",\"points\":\"5\",\"end\":\"true\"}," +
                "{\"q\":\"Is the audit day during the TPR?\",\"phase\":\"Offer and Promotions\",\"label\":\"yes\",\"pic\":\"two\",\"points\":\"10\",\"end\":\"false\"}," +
                "{\"q\":\"Click pic of Comparison leaflets\",\"phase\":\"Offer and Promotions\",\"label\":\"yes\",\"pic\":\"true\",\"points\":\"5\",\"end\":\"false\"}," +
                "{\"q\":\"Click pic of 2 Price tags of live devices\",\"phase\":\"Offer and Promotions\",\"label\":\"yes\",\"pic\":\"two\",\"points\":\"5\",\"end\":\"true\"}," +
                "]"
    }
}