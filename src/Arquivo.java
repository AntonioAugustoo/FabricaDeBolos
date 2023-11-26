import java.io.*;
import java.util.ArrayList;

public class Arquivo {
    private OutputStream os = null;
    private OutputStreamWriter osw = null;
    private BufferedWriter bw = null;

    private InputStream is =  null;
    private InputStreamReader isr = null;
    private BufferedReader br = null;

    private String nome;

    public Arquivo(String nome) {
        this.nome = nome;
    }

    public void escrever(String mensagem){
        try {
            os = new FileOutputStream(this.nome,true);
            osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw);

        }catch (FileNotFoundException e){
            System.out.println("Erro ao achar arquivo"+ e.getMessage());
        }
        try {
            bw.write(mensagem);
            bw.newLine();
        }catch (IOException e){
            System.out.println("Erro ao escrever "+e.getMessage());
        }
        try {
            bw.close();
        }catch (IOException e){
            System.out.println("Erro ao fechar "+e.getMessage());
        }





    }

    public ArrayList<Comprador> ler(){
        try{
            is = new FileInputStream(this.nome);
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

        }catch(FileNotFoundException e){
            System.out.println("Erro ao Identificar "+ e.getMessage());
        }
        String linha;
        ArrayList<Comprador> compradores = new ArrayList<>();
        try {
           linha =  br.readLine();
           while (linha != null){
               if(linha.contains("-----------Comprador----------")){

                   String nomeAtual = br.readLine().split(": ")[1];
                   int saldoatual = Integer.parseInt(br.readLine().split(": ")[1]);
                   Comprador comprador = new Comprador(nomeAtual,saldoatual);
                   compradores.add(comprador);
               }
              linha = br.readLine();
           }

        }catch (IOException e){
            System.out.println("Erro ao ler!"+ e.getMessage());
        }
        return compradores;
    }


}
