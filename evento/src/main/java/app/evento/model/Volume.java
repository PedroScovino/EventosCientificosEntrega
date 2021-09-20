package app.evento.model;

import javax.persistence.*;
import java.util.List;

@Entity(name = "volume")
public class Volume {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long idVolume;
        @Column(nullable = false , length = 32)
        private String sigla;
        @Column(nullable = false)
        private Integer numEdicao;
        @Column(nullable = false , length = 64)
        private String cidade;
        @Column(nullable = false)
        private String dataInicio;
        @Column(nullable = false , length = 2048)
        private String descricaoPt;
        @Column(nullable = false , length = 2048)
        private String descricaoEn;
        @OneToMany()
        private List<Artigo> artigos;

        public Long getIdVolume() {
            return idVolume;
        }

        public void setIdVolume(Long idVolume) {
            this.idVolume = idVolume;
        }

        public String getSigla() {
            return sigla;
        }

        public void setSigla(String sigla) {
            this.sigla = sigla;
        }

        public Integer getNumEdicao() {
            return numEdicao;
        }

        public void setNumEdicao(Integer numEdicao) {
            this.numEdicao = numEdicao;
        }

        public String getCidade() {
            return cidade;
        }

        public void setCidade(String cidade) {
            this.cidade = cidade;
        }

        public String getDataInicio() {
            return dataInicio;
        }

        public void setDataInicio(String dataInicio) {
            this.dataInicio = dataInicio;
        }

        public String getDescricaoPt() {
            return descricaoPt;
        }

        public void setDescricaoPt(String descricaoPt) {
            this.descricaoPt = descricaoPt;
        }

        public String getDescricaoEn() {
            return descricaoEn;
        }

        public void setDescricaoEn(String descricaoEn) {
            this.descricaoEn = descricaoEn;
        }
}
