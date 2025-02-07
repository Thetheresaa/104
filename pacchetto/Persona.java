package pacchetto;

public class Persona
{

        private String nome; no usages
        private String cognome; no usages
        private int eta;no usages
        private String codicefiscale; no usages
        private String citta: no usages
        private String giorno
        private String mese
        public_Persona(String nome, String cognome, String codicefiscale)
        {
            this.nome = nome;
            this cognome = cognome;
            this codicefiscale = codicefiscale;
            this giorno = calcolaNascita();
        }
        public String_getNome()
        {
            return this.nome;
        }
        public void setNome(String nome)
        {
            this.nome = nome;
        }
        public String_getCognome()
        {
        return this.cognome;
        }
        public void setCognome(String nome)
        {
        this.cognome = cognome;
        }
        public int_getEta()
        {
            return this.eta;
        }
        public void setEta(String nome)
        {
            this.eta = eta;
        }
        public String_getCodicefiscale()
        {
            return this.codicefiscale;
        }
        public void setCodicefiscale(String nome)
        {
        this.codicefiscale = codicefiscale;
        }
        public String_getCitta()
        {
            return this.citta;
        }
        public void setCitta(String nome)
        {
            this.citta = citta;
        }
        public void calcolanascita()
        {
                booblen check
                String giorno = codicefiscale.substring (9, 11);

                int giornoNum = Integer.parseInt(giorno);
                if(giornoNum > 40)
                        giornonum -= 40;
                if(giornoNum > 31 || giornoNum < 0)
                        return "Data errata"

                giorno = giornoNum + "";
                if(giornoNum < 10)
                    giorno = "0" + giornoNum;

                int mese  = codicefiscale.substring (8, 9);
                int anno = codicefiscale.substring (6, 8);
                switch (mese)
                {
                        Case 'A'
                                mese = "01";
                                break;
                        Case 'B'
                                mese = "02";
                                break;
                        Case 'C'
                                mese = "03";
                                break;
                        Case 'D'
                                mese = "04";
                                break;
                        Case 'E'
                                mese = "05";
                                break;
                        Case 'H'
                                mese = "06";
                                break;
                        Case 'L'
                                mese = "07";
                                break;
                        Case 'M'
                                mese = "08";
                                break;
                        Case 'P'
                                mese = "09";
                                break;
                        Case 'R'
                                mese = "10";
                                break;
                        Case 'S'
                                mese = "11";
                                break;
                        Case 'T'
                                mese = "12";
                                break;

                        default;
                                check = false;
                                break;
                }
                if(check)
                        return giorno + "/" + mese + "/" anno;7
                else
                        returno "Data errata"

        }
}

