package client;

import client.utils.Decodage_TTN_Laird;
import client.utils.LectureFichierTexte;


public class Main {
    static LectureFichierTexte lectureFichierTexte = new LectureFichierTexte();
    static Decodage_TTN_Laird decodageTtnLaird;

    public static void main(String[] args) {
        decodageTtnLaird = new Decodage_TTN_Laird(lectureFichierTexte.lire("json_ttn_v3.json"));
        System.out.println("UplinkMessage : " + decodageTtnLaird.getUplinkMessage().concat("°C"));
        System.out.println("ApplicationId : " + decodageTtnLaird.getApplicationId());
        System.out.println("GatewayId : " + decodageTtnLaird.getGatewayId());
        System.out.println("Spreading_factor : " + decodageTtnLaird.getSpreading_factor());
        System.out.println("BatteryLevel : " + decodageTtnLaird.getBatteryLevel());
    }
}