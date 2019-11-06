package sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Logic {
    private String esimeneMuster = "4,5;2,7;9,2;4,6;7,1;6,4;8,8;3,6;1,10;9,2";
    private String teineMuster = "1,10;6,6;3,9;2,4;1,6;5,2;1,4;5,2;2,1;2,7";
    private String kolmasMuster = "1,10;6,6;3,9;2,4;1,6;5,2;1,4;5,2;2,1;2,7";
    private String endaMuster;
    private String[][] tabel = new String[50][10];
    public static String[][] tabeliLoomine(){
        String[][] tabel = new String[10][50];
        for(int i = 0;i<tabel.length;i++){
            for(int j = 0;j<tabel[0].length;j++){
                tabel[i][j] = "-";
            }
        }
        return tabel;
    }

    public static int[] leiaAuk(String[][] tabel,int etapp, int mituveergu,int miturida){
        int veerg = 0;
        boolean veergleitud = false;
        boolean ridaleitud = false;
        int rida = 0;
        int[] loplikridajaveerg = new int[2];
        boolean leitud = false;
        boolean markonsidekriips = false;
        if(etapp+miturida<=10) {
            search:
            {
                for (int i = etapp; i <= tabel.length - miturida; i++) {
                    for (int j = 0; j < tabel[i].length; j++) {
                        if (tabel[i][j].equals("-")) {
                            rida = i;
                            veerg = j;
                            if (i + miturida <= tabel.length && j + mituveergu <= tabel[i].length) {
                                markonsidekriips = true;
                                for (int g = i; g < i + miturida; g++) {
                                    for (int t = j; t < j + mituveergu; t++) {
                                        if (!tabel[g][t].equals("-")) {
                                            markonsidekriips = false;
                                        }
                                    }
                                }
                                if (markonsidekriips) {
                                    loplikridajaveerg[0] = rida;
                                    loplikridajaveerg[1] = veerg;
                                    break search;
                                }
                            } else {
                                loplikridajaveerg[0] = -1;
                                loplikridajaveerg[1] = -1;
                            }
                        }

                    }
                }
            }
        }
        else {loplikridajaveerg[0] = -1;
        loplikridajaveerg[1] = -1;}
        return loplikridajaveerg;
    }
    public static String[][] firstFit(String muster){
        String[][] tabel = tabeliLoomine();
        int etapp = 0;
        List<Protsess> protsessid = new ArrayList<>();
        String[] protsessiTähised = {"A","B","C","D","E","F","G","H","I","J"};
        String[] protsessidStringina = muster.split(";");
        int abi = 0;
        for(String prots:protsessidStringina){
            String[] split = prots.split(",");
            protsessid.add(new Protsess(protsessiTähised[abi],Integer.parseInt(split[0]),Integer.parseInt(split[1])));
            abi++;
        }
        for(Protsess prots:protsessid){
            int malumaht = prots.getMalumaht();
            int kestus = prots.getKestus();
            //System.out.println("Malumaht on"+Integer.toString(malumaht) + " ja Kestus on :"+ Integer.toString(kestus));
            String nimi = prots.getNimi();
            if(kestus<11){
                int[] augukoordinaadid = leiaAuk(tabel,etapp,malumaht,kestus);
                //System.out.println(augukoordinaadid[0]);
                //System.out.println(augukoordinaadid[1]);
                if(augukoordinaadid[0]==-1){
                    System.out.println("Valed koordinaadid vms");
                }
                else {
                    for(int i = augukoordinaadid[0];i<augukoordinaadid[0]+kestus;i++){
                        for(int j = augukoordinaadid[1];j<augukoordinaadid[1]+malumaht;j++){
                            //System.out.println("i on :" + i + " ja j on "+j);
                            //System.out.println(augukoordinaadid[0] + "   " +augukoordinaadid[1]);
                            tabel[i][j] = nimi;
                        }
                    }
                }
            }
            else {
                System.out.println("Protsessi mälumaht on liiga suur, ei ole võimalik algoritmi rakendada.");
            }
            etapp++;
        }
    return tabel;
    }
}
