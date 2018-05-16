package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela TESTE
 * @generated
 */
@Entity
@Table(name = "\"TESTE\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.teste")
public class teste implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "id", nullable = false, insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

  /**
  * @generated
  */
  @Column(name = "news", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String news;

  /**
  * @generated
  */
  @Column(name = "emb", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String emb;

  /**
  * @generated
  */
  @Column(name = "xd", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String xd;

  /**
   * Construtor
   * @generated
   */
  public teste(){
  }


  /**
   * Obtém id
   * return id
   * @generated
   */
  
  public java.lang.String getId(){
    return this.id;
  }

  /**
   * Define id
   * @param id id
   * @generated
   */
  public teste setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém news
   * return news
   * @generated
   */
  
  public java.lang.String getNews(){
    return this.news;
  }

  /**
   * Define news
   * @param news news
   * @generated
   */
  public teste setNews(java.lang.String news){
    this.news = news;
    return this;
  }

  /**
   * Obtém emb
   * return emb
   * @generated
   */
  
  public java.lang.String getEmb(){
    return this.emb;
  }

  /**
   * Define emb
   * @param emb emb
   * @generated
   */
  public teste setEmb(java.lang.String emb){
    this.emb = emb;
    return this;
  }

  /**
   * Obtém xd
   * return xd
   * @generated
   */
  
  public java.lang.String getXd(){
    return this.xd;
  }

  /**
   * Define xd
   * @param xd xd
   * @generated
   */
  public teste setXd(java.lang.String xd){
    this.xd = xd;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    teste object = (teste)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

}
