package gerenTarefas;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.Date;



public class FuncoesUteis {
   
     public static Date strToDate( String strDt) throws ParseException {
        DateFormat dtForm = new SimpleDateFormat("dd/MM/yyyy");
        dtForm.setLenient(false);
        return dtForm.parse(strDt);
    }
    
    public static String dateToStr( Date dt) throws ParseException {
        DateFormat dtForm = new SimpleDateFormat("dd/MM/yyyy");
        dtForm.setLenient(false);
        return dtForm.format(dt);
    }
    public static boolean isDateValid(String strDate) {
        String dateFormat = "dd/MM/uuuu";

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter
        .ofPattern(dateFormat)
        .withResolverStyle(ResolverStyle.STRICT);
        try {
            LocalDate date = LocalDate.parse(strDate, dateTimeFormatter);
            return true;
        } catch (DateTimeParseException e) {
           return false;
        } 
    }
    
    public static boolean isTelefone(String telefone) {
       
       telefone = telefone.replaceAll("\\D","");

       //verifica se tem a qtde de numeros correta
       if (!(telefone.length() >= 10 && telefone.length() <= 11)) return false;

       //Se tiver 11 caracteres, verificar se começa com 9 o celular
       if (telefone.length() == 11 && Integer.parseInt(telefone.substring(2, 3)) != 9) return false;

       //verifica se o numero foi digitado com todos os dígitos iguais
       java.util.regex.Pattern p = java.util.regex.Pattern.compile(telefone.charAt(0)+"{"+telefone.length()+"}");
       java.util.regex.Matcher m = p.matcher(telefone);
       if(m.find()) return false;

       //DDDs validos
       Integer[] codigosDDD = {
           11, 12, 13, 14, 15, 16, 17, 18, 19,
           21, 22, 24, 27, 28, 31, 32, 33, 34,
           35, 37, 38, 41, 42, 43, 44, 45, 46,
           47, 48, 49, 51, 53, 54, 55, 61, 62,
           64, 63, 65, 66, 67, 68, 69, 71, 73,
           74, 75, 77, 79, 81, 82, 83, 84, 85,
           86, 87, 88, 89, 91, 92, 93, 94, 95,
           96, 97, 98, 99};
       //verifica se o DDD é valido (sim, da pra verificar rsrsrs)
       if ( java.util.Arrays.asList(codigosDDD).indexOf(Integer.parseInt(telefone.substring(0, 2))) == -1) return false;

       //Se o número só tiver dez digitos não é um celular e por isso o número logo após o DDD deve ser 2, 3, 4, 5 ou 7 
       Integer[] prefixos = {2, 3, 4, 5, 7};

       if (telefone.length() == 10 && java.util.Arrays.asList(prefixos).indexOf(Integer.parseInt(telefone.substring(2, 3))) == -1) return false;

       //se passar por todas as validações acima, então está tudo certo
       return true;
    }
    public static boolean isCPF(String parCpf) {
        
        String cpf;
        
        cpf = parCpf.replace(".", "");
        cpf = cpf.replace(".", "");
        cpf = cpf.replace("-", "");
        
        if (cpf.equals("00000000000") ||
            cpf.equals("11111111111") ||
            cpf.equals("22222222222") || cpf.equals("33333333333") ||
            cpf.equals("44444444444") || cpf.equals("55555555555") ||
            cpf.equals("66666666666") || cpf.equals("77777777777") ||
            cpf.equals("88888888888") || cpf.equals("99999999999") ||
            (cpf.length() != 11))
            return(false);

        char dig10, dig11;
        int sm, i, r, num, peso;

    
        sm = 0;
        peso = 10;
        for (i=0; i<9; i++) {
            num = (int)(cpf.charAt(i) - 48);
            sm = sm + (num * peso);
            peso = peso - 1;
        }

        r = 11 - (sm % 11);
        if ((r == 10) || (r == 11))
            dig10 = '0';
        else dig10 = (char)(r + 48); 
        
        sm = 0;
        peso = 11;
        for(i=0; i<10; i++) {
            num = (int)(cpf.charAt(i) - 48);
            sm = sm + (num * peso);
            peso = peso - 1;
        }

        r = 11 - (sm % 11);
        if ((r == 10) || (r == 11))
            dig11 = '0';
        else dig11 = (char)(r + 48);

    
        if ((dig10 == cpf.charAt(9)) && (dig11 == cpf.charAt(10)))
            return(true);
        else return(false);      
    }
    
    
    /*public static boolean isData(String data){
     
        String novaData;
        
        novaData = data.replace("/", "");
        novaData = data.replace("/", "");
        
       if((novaData.length() != 8 || )){
           return (false);
       }
    }*/
}
