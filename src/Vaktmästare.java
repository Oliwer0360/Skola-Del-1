public class Vaktmästare {

    String namn;
    int ålder;
    String avdelning;
    int lön;

    //Vilken vaktmästare v1-3
    int talId;

    //Presentera sig själv
    void presentera(){
        System.out.println(talId+". Hej jag heter "+namn+", jag är "+ålder+" år gammal och jobbar som vaktmästare på "+avdelning+". Min lön är "+lön+".");
    }

    //Byt namn
    void bytaNamn(String nyttNamn){
        namn=nyttNamn;
    }
}
