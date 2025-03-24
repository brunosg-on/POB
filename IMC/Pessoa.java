public class Pessoa
{
    private String nome;
    private int idade;
    private double altura;
    private double peso;
    private char sexo;

    public Pessoa(String nome,int idade, double altura, double peso, char sexo)
    {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.sexo = sexo;
    }
    public String getNome()
    {
        return nome;
    }
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    public int getIdade()
    {
        return idade;
    }
    public void setIdade(int idade)
    {
        this.idade = idade;
    }
    public double getAltura()
    {
        return altura;
    }
    public void setAltura(double altura)
    {
        this.altura = altura;
    }
    public double getPeso()
    {
        return peso;
    }
    public void setPeso(double peso)
    {
        this.peso = peso;
    }
    public char getSexo()
    {
        return sexo;
    }
    public void setSexo(char sexo)
    {
        this.sexo = sexo;
    }
    public void listarpessoa()
    {
        System.out.print("Nome: "+nome);
        System.out.print("Idade: "+idade);
        System.out.print("Altura: "+altura);
        System.out.print("Peso: "+peso);
        System.out.print("Sexo "+sexo);
    }
    public double calcularIMC()
    {
        return (peso/(altura*altura));
    }
    public String classificarIMC()
    {
        double imc = calcularIMC();

        if(imc < 18.5)
        {
            return "Magreza";
        }
        if(imc <= 24.9)
        {
            return "Normal";
        }
        if(imc<=29.9)
        {
            return "Sobrepeso";
        }
        if(imc<34.9)
        {
            return "Obsidade grau I";
        }
        if(imc<39.9)
        {
            return "Obsidade grau II";
        }
        return "Obsidade III";

    
    }
}
