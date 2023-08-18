    public abstract class moeda {
        protected double valor;
        protected String pais;
    
        public moeda(double valor, String pais) {
            this.valor = valor;
            this.pais = pais;
        }
    
        public abstract double converterParaReal();
    }
    

