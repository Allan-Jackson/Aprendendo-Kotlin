public enum Mes {
    JANEIRO(1,true){ //sobrescrevendo apenas para esta constante específica
        @Override
        public String toString() {
            return "Estou em Janeiro";
        }
    },
    FEVEREIRO(2,false),
    MARCO(3,true),
    ABRIL(4,true),
    MAIO(5,false),
    JUNHO(6,false),
    JULHO(7,true),
    AGOSTO(8,false),
    SETEMBRO(9,true),
    OUTUBRO(10,false),
    NOVEMBRO(11,false),
    DEZEMBRO(12,true);

    public boolean feriado;
    public int numeral;
    Mes(int numeral,boolean feriado){
        this.feriado = feriado;
        this.numeral = numeral;
    }
    @Override
    public String toString() {
        return super.toString();
    }


}
