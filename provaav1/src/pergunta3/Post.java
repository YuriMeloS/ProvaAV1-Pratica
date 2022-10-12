package pergunta3;

public class Post {
    private String msg;
    private byte relevancia;

    public Post(String msg, byte relevancia) {
        this.msg = msg;
        this.relevancia = relevancia;
    }
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public byte getRelevancia() {
        return relevancia;
    }

    public void setRelevancia(byte relevancia) {
        this.relevancia = relevancia;
    }
}
