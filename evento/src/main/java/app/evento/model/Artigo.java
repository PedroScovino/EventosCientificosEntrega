package app.evento.model;

import javax.persistence.*;
import java.util.List;

@Entity(name = "artigo")
public class Artigo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idArtigo;
    @Column(nullable = false)
    private Integer ordem;
    @Column(nullable = false , length = 2)
    private String idioma;
    @Column(nullable = false , length = 256)
    private String titulo;
    @Column(nullable = false , length = 256)
    private String tituloEn;
    @Column(nullable = false , length = 2048)
    private String resumo;
    @Column(nullable = false , length = 2048)
    private String resumoEn;
    @Column(nullable = false , length = 256)
    private String palavraChave;
    @Column(nullable = false , length = 256)
    private String palavraChaveEn;
    @Column(nullable = false)
    private Integer numPaginas;
    @ManyToOne
    private Volume volume;
    @OneToMany()
    private List<Autor> autores;

    public long getIdArtigo() {
        return idArtigo;
    }

    public void setIdArtigo(long idArtigo) {
        this.idArtigo = idArtigo;
    }

    public Integer getOrdem() {
        return ordem;
    }

    public void setOrdem(Integer ordem) {
        this.ordem = ordem;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTituloEn() {
        return tituloEn;
    }

    public void setTituloEn(String tituloEn) {
        this.tituloEn = tituloEn;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public String getResumoEn() {
        return resumoEn;
    }

    public void setResumoEn(String resumoEn) {
        this.resumoEn = resumoEn;
    }

    public String getPalavraChave() {
        return palavraChave;
    }

    public void setPalavraChave(String palavraChave) {
        this.palavraChave = palavraChave;
    }

    public String getPalavraChaveEn() {
        return palavraChaveEn;
    }

    public void setPalavraChaveEn(String palavraChaveEn) {
        this.palavraChaveEn = palavraChaveEn;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    public Volume getVolume() {
        return volume;
    }

    public void setVolume(Volume volume) {
        this.volume = volume;
    }
}
