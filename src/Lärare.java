public class Lärare {

    String namn;
    int ålder;
    String ämne;
    int lön;

    //Vilken lärare l1-3
    int talId;

    //Presentera sig själv
    void presentera(){
        System.out.println(talId+". Hej jag heter "+namn+" och jag är "+ålder+" år gammal. Jag undervisar i "+ämne+" och min lön är: "+lön+".");
    }

    //Byt namn
    void bytaNamn(String nyttNamn){
        namn=nyttNamn;
    }
}
