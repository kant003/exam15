class Espada {
   enum TipoEspada {NORMAL, MALDECIDA, EPICA, LEGENDARIA};
   TipoEspada tipoEspada;
   float d = 40; // daño base que produce la espada
   float desgaste = 0.5f;
 
  
   float calculadaño() {
       float cantidadDesgaste = 1/desgaste;
       switch(tipoEspada) {
           case NORMAL: return d * cantidadDesgaste;
           case MALDECIDA: return d * cantidadDesgaste / 2;
           case EPICA: return d * cantidadDesgaste * 2;
           case LEGENDARIA: return d * cantidadDesgaste * 4;
           default: return 0;
       }
 
   }
  
   boolean estaRota(){
       boolean rota = false;
       if(desgaste >= 1) {
           rota = true;
       }else{
           rota = false;
       }
       return rota;
   }
  
}
