package be.ibizz.hackathon.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.ektorp.support.CouchDbDocument;
import org.ektorp.support.TypeDiscriminator;

import java.util.Objects;

@TypeDiscriminator("doc.type == 'broodautomaat'")
public class BreadMachine extends CouchDbDocument {
  private String type;
  private String postcode;
  @JsonProperty("address")
  private String straat_en_nr;
  @JsonProperty("isBreadAvailable")
  private boolean brood_beschikbaar;

  public BreadMachine() {
  }

  public String getPostcode() {
    return postcode;
  }

  public void setPostcode(String postcode) {
    this.postcode = postcode;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public boolean isBrood_beschikbaar() {
    return brood_beschikbaar;
  }

  public void setBrood_beschikbaar(boolean brood_beschikbaar) {
    this.brood_beschikbaar = brood_beschikbaar;
  }

  public String getStraat_en_nr() {
    return straat_en_nr;
  }

  public void setStraat_en_nr(String straat_en_nr) {
    this.straat_en_nr = straat_en_nr;
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, postcode, straat_en_nr);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    final BreadMachine other = (BreadMachine) obj;
    return Objects.equals(this.type, other.type) && Objects.equals(this.postcode, other.postcode) && Objects.equals(this.straat_en_nr, other.straat_en_nr);
  }

  @Override
  public String toString() {
    return "BreadMachine{" +
      "brood_beschikbaar=" + brood_beschikbaar +
      ", type='" + type + '\'' +
      ", postcode='" + postcode + '\'' +
      ", straat_en_nr='" + straat_en_nr + '\'' +
      "} " + super.toString();
  }
}