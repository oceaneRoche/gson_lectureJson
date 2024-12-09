import client.utils.Decodage_TTN_Laird;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Decodage_TTN_LairdTest {
    Decodage_TTN_Laird decodage;
    @BeforeEach
    void init() {
        String json = "{\n" +
                "  \"name\": \"as.up.data.forward\",\n" +
                "  \"time\": \"2024-12-08T13:56:18.091049621Z\",\n" +
                "  \"identifiers\": [\n" +
                "    {\n" +
                "      \"device_ids\": {\n" +
                "        \"device_id\": \"eui-0025ca0a0000853e\",\n" +
                "        \"application_ids\": {\n" +
                "          \"application_id\": \"laird-capteurs\"\n" +
                "        },\n" +
                "        \"dev_eui\": \"0025CA0A0000853E\",\n" +
                "        \"join_eui\": \"70B3D57ED002389C\",\n" +
                "        \"dev_addr\": \"260BE501\"\n" +
                "      }\n" +
                "    }\n" +
                "  ],\n" +
                "  \"data\": {\n" +
                "    \"@type\": \"type.googleapis.com/ttn.lorawan.v3.ApplicationUp\",\n" +
                "    \"end_device_ids\": {\n" +
                "      \"device_id\": \"eui-0025ca0a0000853e\",\n" +
                "      \"application_ids\": {\n" +
                "        \"application_id\": \"laird-capteurs\"\n" +
                "      },\n" +
                "      \"dev_eui\": \"0025CA0A0000853E\",\n" +
                "      \"join_eui\": \"70B3D57ED002389C\",\n" +
                "      \"dev_addr\": \"260BE501\"\n" +
                "    },\n" +
                "    \"correlation_ids\": [\n" +
                "      \"gs:uplink:01JEK8X0TSRX75KJBYMQXE2W2N\"\n" +
                "    ],\n" +
                "    \"received_at\": \"2024-12-08T13:56:18.087112838Z\",\n" +
                "    \"uplink_message\": {\n" +
                "      \"session_key_id\": \"AZNjO+Ms2+uXYYoceArfLA==\",\n" +
                "      \"f_port\": 1,\n" +
                "      \"f_cnt\": 10022,\n" +
                "      \"frm_payload\": \"AgEAAAAFAwAAAAAAAFcPAABXDwAAVw8=\",\n" +
                "      \"rx_metadata\": [\n" +
                "        {\n" +
                "          \"gateway_ids\": {\n" +
                "            \"gateway_id\": \"lorix4u\",\n" +
                "            \"eui\": \"FCC23DFFFE0B619A\"\n" +
                "          },\n" +
                "          \"time\": \"2024-12-08T13:56:17.853429Z\",\n" +
                "          \"timestamp\": 108921907,\n" +
                "          \"rssi\": -69,\n" +
                "          \"channel_rssi\": -69,\n" +
                "          \"snr\": 9.5,\n" +
                "          \"location\": {\n" +
                "            \"latitude\": 44.62648038031261,\n" +
                "            \"longitude\": 4.3852364246098805,\n" +
                "            \"altitude\": 200,\n" +
                "            \"source\": \"SOURCE_REGISTRY\"\n" +
                "          },\n" +
                "          \"uplink_token\": \"ChUKEwoHbG9yaXg0dRII/MI9//4LYZoQs4j4MxoMCIHL1roGEM/hvqMDILjOgeKV0jk=\",\n" +
                "          \"received_at\": \"2024-12-08T13:56:17.879734991Z\"\n" +
                "        }\n" +
                "      ],\n" +
                "      \"settings\": {\n" +
                "        \"data_rate\": {\n" +
                "          \"lora\": {\n" +
                "            \"bandwidth\": 125000,\n" +
                "            \"spreading_factor\": 7,\n" +
                "            \"coding_rate\": \"4/5\"\n" +
                "          }\n" +
                "        },\n" +
                "        \"frequency\": \"868100000\",\n" +
                "        \"timestamp\": 108921907,\n" +
                "        \"time\": \"2024-12-08T13:56:17.853429Z\"\n" +
                "      },\n" +
                "      \"received_at\": \"2024-12-08T13:56:17.882108785Z\",\n" +
                "      \"confirmed\": true,\n" +
                "      \"consumed_airtime\": \"0.077056s\",\n" +
                "      \"version_ids\": {\n" +
                "        \"brand_id\": \"laird\",\n" +
                "        \"model_id\": \"rs1xx-ext-multi-sensor\",\n" +
                "        \"hardware_version\": \"rev 4\",\n" +
                "        \"firmware_version\": \"6.1_20_6_16\",\n" +
                "        \"band_id\": \"EU_863_870\"\n" +
                "      },\n" +
                "      \"network_ids\": {\n" +
                "        \"net_id\": \"000013\",\n" +
                "        \"ns_id\": \"EC656E0000000181\",\n" +
                "        \"tenant_id\": \"ttn\",\n" +
                "        \"cluster_id\": \"eu1\",\n" +
                "        \"cluster_address\": \"eu1.cloud.thethings.network\"\n" +
                "      }\n" +
                "    }\n" +
                "  },\n" +
                "  \"correlation_ids\": [\n" +
                "    \"gs:uplink:01JEK8X0TSRX75KJBYMQXE2W2N\"\n" +
                "  ],\n" +
                "  \"origin\": \"ip-10-100-7-178.eu-west-1.compute.internal\",\n" +
                "  \"context\": {\n" +
                "    \"tenant-id\": \"CgN0dG4=\"\n" +
                "  },\n" +
                "  \"visibility\": {\n" +
                "    \"rights\": [\n" +
                "      \"RIGHT_APPLICATION_TRAFFIC_READ\"\n" +
                "    ]\n" +
                "  },\n" +
                "  \"unique_id\": \"01JEK8X11BANYWMXDYA6GZA3GD\"\n" +
                "}";
        decodage = new Decodage_TTN_Laird(json);
    }


    @Test
    void getUplinkMessage() {
        assertEquals("15.87",decodage.getUplinkMessage(),"erreur methode getUplinkMessage()");
        assertNotEquals(15.87,decodage.getUplinkMessage(),"erreur methode getUplinkMessage()");

    }

    @Test
    void getApplicationId() {
        assertEquals("laird-capteurs",decodage.getApplicationId(),"erreur methode getApplicationId()");
        assertNotEquals("laird-capteur",decodage.getApplicationId(),"erreur methode getApplicationId()");

    }

    @Test
    void getGatewayId() {
        assertEquals("lorix4u",decodage.getGatewayId(),"erreur methode getGatewayId()");
        assertNotEquals("lorix4U",decodage.getGatewayId(),"erreur methode getGatewayId()");

    }

    @Test
    void getSpreading_factor() {
        assertEquals(7,decodage.getSpreading_factor(),"erreur methode getSpreading_factor()");
        assertNotEquals("7",decodage.getSpreading_factor(),"erreur methode getSpreading_factor()");

    }


}