package heranca;

public class Pokemon {

    private String nome;
    private String hp;
    private String atk;
    private String def;

    public Pokemon(String nome, String hp, String atk, String def) {
        this.nome = nome;
        this.hp = hp;
        this.atk = atk;
        this.def = def;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHp() {
        return hp;
    }

    public void setHp(String hp) {
        this.hp = hp;
    }

    public String getAtk() {
        return atk;
    }

    public void setAtk(String atk) {
        this.atk = atk;
    }

    public String getDef() {
        return def;
    }

    public void setDef(String def) {
        this.def = def;
    }
}
